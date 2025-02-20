package com.ucmmaster.kafka.avro;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import com.ucmmaster.kafka.data.v2.TemperatureTelemetry;

class Producer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class.getName());

    private final KafkaProducer<String, TemperatureTelemetry> producer;

    private final Random random = new Random();

    public Producer(String config) {
        this.producer = createProducer(config);
    }

    private KafkaProducer<String, TemperatureTelemetry> createProducer(String config) {
        // Load properties from the resources folder
        Properties properties = new Properties();
        try (InputStream input = Producer.class.getClassLoader().getResourceAsStream(config)) {
            if (input == null) {
                logger.error("Sorry, unable to find " + config + " in classpath");
                return null;
            }
            properties.load(input);
            return new KafkaProducer<String, TemperatureTelemetry>(properties);
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        }
        return null;

    }

    protected TemperatureTelemetry createRandomTemperatureTelemetry() {
        int id = random.ints(1, 10).findFirst().getAsInt();
        int temperature = random.ints(15, 40).findFirst().getAsInt();
        //return new TemperatureTelemetry(id,temperature);
        int humidity = random.ints(1, 100).findFirst().getAsInt();
        return new TemperatureTelemetry(id,temperature,humidity);
    }

    protected int randomInt() {
        return random.ints(0, 5).findFirst().orElse(0);
    }

    public void produce(String topic) {
        try {

            while (true) {
                TimeUnit.SECONDS.sleep(randomInt());
                TemperatureTelemetry value = createRandomTemperatureTelemetry();
                String key = String.valueOf(value.getId());
                ProducerRecord<String,TemperatureTelemetry> record = new ProducerRecord<>(topic, key, value);
                record.headers().add("client","java".getBytes(StandardCharsets.UTF_8));
                producer.send(record, (recordMetadata, e) -> {
                    if (e == null) {
                        logger.info("record produced with key:{} value:{} partition:{} offset:{} timestamp:{}",
                                key,
                                value,
                                recordMetadata.partition(),
                                recordMetadata.offset(),
                                recordMetadata.timestamp());
                    } else {
                        logger.error("Error while producing", e);
                    }
                });
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        } finally {
            producer.flush();
            producer.close();
            logger.error("Producer closed.");
        }
    }
}