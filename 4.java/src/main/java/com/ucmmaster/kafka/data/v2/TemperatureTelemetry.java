/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ucmmaster.kafka.data.v2;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** This schema describes a temperature telemetry event produced in a device */
@org.apache.avro.specific.AvroGenerated
public class TemperatureTelemetry extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3260766186764812059L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TemperatureTelemetry\",\"namespace\":\"com.ucmmaster.kafka.data.v2\",\"doc\":\"This schema describes a temperature telemetry event produced in a device\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"doc\":\"Device id\"},{\"name\":\"temperature\",\"type\":\"int\",\"doc\":\"Temperature Celsius\"},{\"name\":\"humidity\",\"type\":[\"null\",\"int\"],\"doc\":\"Humidity percentage\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TemperatureTelemetry> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TemperatureTelemetry> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TemperatureTelemetry> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TemperatureTelemetry> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TemperatureTelemetry> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TemperatureTelemetry to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TemperatureTelemetry from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TemperatureTelemetry instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TemperatureTelemetry fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Device id */
  private int id;
  /** Temperature Celsius */
  private int temperature;
  /** Humidity percentage */
  private java.lang.Integer humidity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TemperatureTelemetry() {}

  /**
   * All-args constructor.
   * @param id Device id
   * @param temperature Temperature Celsius
   * @param humidity Humidity percentage
   */
  public TemperatureTelemetry(java.lang.Integer id, java.lang.Integer temperature, java.lang.Integer humidity) {
    this.id = id;
    this.temperature = temperature;
    this.humidity = humidity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return temperature;
    case 2: return humidity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: temperature = (java.lang.Integer)value$; break;
    case 2: humidity = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return Device id
   */
  public int getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * Device id
   * @param value the value to set.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'temperature' field.
   * @return Temperature Celsius
   */
  public int getTemperature() {
    return temperature;
  }


  /**
   * Sets the value of the 'temperature' field.
   * Temperature Celsius
   * @param value the value to set.
   */
  public void setTemperature(int value) {
    this.temperature = value;
  }

  /**
   * Gets the value of the 'humidity' field.
   * @return Humidity percentage
   */
  public java.lang.Integer getHumidity() {
    return humidity;
  }


  /**
   * Sets the value of the 'humidity' field.
   * Humidity percentage
   * @param value the value to set.
   */
  public void setHumidity(java.lang.Integer value) {
    this.humidity = value;
  }

  /**
   * Creates a new TemperatureTelemetry RecordBuilder.
   * @return A new TemperatureTelemetry RecordBuilder
   */
  public static com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder newBuilder() {
    return new com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder();
  }

  /**
   * Creates a new TemperatureTelemetry RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TemperatureTelemetry RecordBuilder
   */
  public static com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder newBuilder(com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder other) {
    if (other == null) {
      return new com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder();
    } else {
      return new com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder(other);
    }
  }

  /**
   * Creates a new TemperatureTelemetry RecordBuilder by copying an existing TemperatureTelemetry instance.
   * @param other The existing instance to copy.
   * @return A new TemperatureTelemetry RecordBuilder
   */
  public static com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder newBuilder(com.ucmmaster.kafka.data.v2.TemperatureTelemetry other) {
    if (other == null) {
      return new com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder();
    } else {
      return new com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder(other);
    }
  }

  /**
   * RecordBuilder for TemperatureTelemetry instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TemperatureTelemetry>
    implements org.apache.avro.data.RecordBuilder<TemperatureTelemetry> {

    /** Device id */
    private int id;
    /** Temperature Celsius */
    private int temperature;
    /** Humidity percentage */
    private java.lang.Integer humidity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.temperature)) {
        this.temperature = data().deepCopy(fields()[1].schema(), other.temperature);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.humidity)) {
        this.humidity = data().deepCopy(fields()[2].schema(), other.humidity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing TemperatureTelemetry instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ucmmaster.kafka.data.v2.TemperatureTelemetry other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.temperature)) {
        this.temperature = data().deepCopy(fields()[1].schema(), other.temperature);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.humidity)) {
        this.humidity = data().deepCopy(fields()[2].schema(), other.humidity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * Device id
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * Device id
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * Device id
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * Device id
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'temperature' field.
      * Temperature Celsius
      * @return The value.
      */
    public int getTemperature() {
      return temperature;
    }


    /**
      * Sets the value of the 'temperature' field.
      * Temperature Celsius
      * @param value The value of 'temperature'.
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder setTemperature(int value) {
      validate(fields()[1], value);
      this.temperature = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'temperature' field has been set.
      * Temperature Celsius
      * @return True if the 'temperature' field has been set, false otherwise.
      */
    public boolean hasTemperature() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'temperature' field.
      * Temperature Celsius
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder clearTemperature() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'humidity' field.
      * Humidity percentage
      * @return The value.
      */
    public java.lang.Integer getHumidity() {
      return humidity;
    }


    /**
      * Sets the value of the 'humidity' field.
      * Humidity percentage
      * @param value The value of 'humidity'.
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder setHumidity(java.lang.Integer value) {
      validate(fields()[2], value);
      this.humidity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'humidity' field has been set.
      * Humidity percentage
      * @return True if the 'humidity' field has been set, false otherwise.
      */
    public boolean hasHumidity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'humidity' field.
      * Humidity percentage
      * @return This builder.
      */
    public com.ucmmaster.kafka.data.v2.TemperatureTelemetry.Builder clearHumidity() {
      humidity = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TemperatureTelemetry build() {
      try {
        TemperatureTelemetry record = new TemperatureTelemetry();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.temperature = fieldSetFlags()[1] ? this.temperature : (java.lang.Integer) defaultValue(fields()[1]);
        record.humidity = fieldSetFlags()[2] ? this.humidity : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TemperatureTelemetry>
    WRITER$ = (org.apache.avro.io.DatumWriter<TemperatureTelemetry>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TemperatureTelemetry>
    READER$ = (org.apache.avro.io.DatumReader<TemperatureTelemetry>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    out.writeInt(this.temperature);

    if (this.humidity == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.humidity);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      this.temperature = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.humidity = null;
      } else {
        this.humidity = in.readInt();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          this.temperature = in.readInt();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.humidity = null;
          } else {
            this.humidity = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










