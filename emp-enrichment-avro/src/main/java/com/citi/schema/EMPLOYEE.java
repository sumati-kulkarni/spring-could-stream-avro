/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.citi.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EMPLOYEE extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5083024965525792456L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EMPLOYEE\",\"namespace\":\"com.citi.schema\",\"fields\":[{\"name\":\"ID\",\"type\":\"string\"},{\"name\":\"KID\",\"type\":\"long\"},{\"name\":\"DEPTID\",\"type\":\"string\"},{\"name\":\"ENAME\",\"type\":\"string\"},{\"name\":\"CREATED_DATE\",\"type\":{\"type\":\"long\",\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"connect.version\":1,\"logicalType\":\"timestamp-millis\"}},{\"name\":\"MODIFIED_DATE\",\"type\":{\"type\":\"long\",\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"connect.version\":1,\"logicalType\":\"timestamp-millis\"}}],\"connect.name\":\"EMPLOYEE\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<EMPLOYEE> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EMPLOYEE> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EMPLOYEE> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EMPLOYEE> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EMPLOYEE> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EMPLOYEE to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EMPLOYEE from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EMPLOYEE instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EMPLOYEE fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ID;
  private long KID;
  private java.lang.CharSequence DEPTID;
  private java.lang.CharSequence ENAME;
  private java.time.Instant CREATED_DATE;
  private java.time.Instant MODIFIED_DATE;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EMPLOYEE() {}

  /**
   * All-args constructor.
   * @param ID The new value for ID
   * @param KID The new value for KID
   * @param DEPTID The new value for DEPTID
   * @param ENAME The new value for ENAME
   * @param CREATED_DATE The new value for CREATED_DATE
   * @param MODIFIED_DATE The new value for MODIFIED_DATE
   */
  public EMPLOYEE(java.lang.CharSequence ID, java.lang.Long KID, java.lang.CharSequence DEPTID, java.lang.CharSequence ENAME, java.time.Instant CREATED_DATE, java.time.Instant MODIFIED_DATE) {
    this.ID = ID;
    this.KID = KID;
    this.DEPTID = DEPTID;
    this.ENAME = ENAME;
    this.CREATED_DATE = CREATED_DATE.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.MODIFIED_DATE = MODIFIED_DATE.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ID;
    case 1: return KID;
    case 2: return DEPTID;
    case 3: return ENAME;
    case 4: return CREATED_DATE;
    case 5: return MODIFIED_DATE;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ID = (java.lang.CharSequence)value$; break;
    case 1: KID = (java.lang.Long)value$; break;
    case 2: DEPTID = (java.lang.CharSequence)value$; break;
    case 3: ENAME = (java.lang.CharSequence)value$; break;
    case 4: CREATED_DATE = (java.time.Instant)value$; break;
    case 5: MODIFIED_DATE = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ID' field.
   * @return The value of the 'ID' field.
   */
  public java.lang.CharSequence getID() {
    return ID;
  }


  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.CharSequence value) {
    this.ID = value;
  }

  /**
   * Gets the value of the 'KID' field.
   * @return The value of the 'KID' field.
   */
  public long getKID() {
    return KID;
  }


  /**
   * Sets the value of the 'KID' field.
   * @param value the value to set.
   */
  public void setKID(long value) {
    this.KID = value;
  }

  /**
   * Gets the value of the 'DEPTID' field.
   * @return The value of the 'DEPTID' field.
   */
  public java.lang.CharSequence getDEPTID() {
    return DEPTID;
  }


  /**
   * Sets the value of the 'DEPTID' field.
   * @param value the value to set.
   */
  public void setDEPTID(java.lang.CharSequence value) {
    this.DEPTID = value;
  }

  /**
   * Gets the value of the 'ENAME' field.
   * @return The value of the 'ENAME' field.
   */
  public java.lang.CharSequence getENAME() {
    return ENAME;
  }


  /**
   * Sets the value of the 'ENAME' field.
   * @param value the value to set.
   */
  public void setENAME(java.lang.CharSequence value) {
    this.ENAME = value;
  }

  /**
   * Gets the value of the 'CREATED_DATE' field.
   * @return The value of the 'CREATED_DATE' field.
   */
  public java.time.Instant getCREATEDDATE() {
    return CREATED_DATE;
  }


  /**
   * Sets the value of the 'CREATED_DATE' field.
   * @param value the value to set.
   */
  public void setCREATEDDATE(java.time.Instant value) {
    this.CREATED_DATE = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'MODIFIED_DATE' field.
   * @return The value of the 'MODIFIED_DATE' field.
   */
  public java.time.Instant getMODIFIEDDATE() {
    return MODIFIED_DATE;
  }


  /**
   * Sets the value of the 'MODIFIED_DATE' field.
   * @param value the value to set.
   */
  public void setMODIFIEDDATE(java.time.Instant value) {
    this.MODIFIED_DATE = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new EMPLOYEE RecordBuilder.
   * @return A new EMPLOYEE RecordBuilder
   */
  public static com.citi.schema.EMPLOYEE.Builder newBuilder() {
    return new com.citi.schema.EMPLOYEE.Builder();
  }

  /**
   * Creates a new EMPLOYEE RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EMPLOYEE RecordBuilder
   */
  public static com.citi.schema.EMPLOYEE.Builder newBuilder(com.citi.schema.EMPLOYEE.Builder other) {
    if (other == null) {
      return new com.citi.schema.EMPLOYEE.Builder();
    } else {
      return new com.citi.schema.EMPLOYEE.Builder(other);
    }
  }

  /**
   * Creates a new EMPLOYEE RecordBuilder by copying an existing EMPLOYEE instance.
   * @param other The existing instance to copy.
   * @return A new EMPLOYEE RecordBuilder
   */
  public static com.citi.schema.EMPLOYEE.Builder newBuilder(com.citi.schema.EMPLOYEE other) {
    if (other == null) {
      return new com.citi.schema.EMPLOYEE.Builder();
    } else {
      return new com.citi.schema.EMPLOYEE.Builder(other);
    }
  }

  /**
   * RecordBuilder for EMPLOYEE instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EMPLOYEE>
    implements org.apache.avro.data.RecordBuilder<EMPLOYEE> {

    private java.lang.CharSequence ID;
    private long KID;
    private java.lang.CharSequence DEPTID;
    private java.lang.CharSequence ENAME;
    private java.time.Instant CREATED_DATE;
    private java.time.Instant MODIFIED_DATE;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.citi.schema.EMPLOYEE.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.KID)) {
        this.KID = data().deepCopy(fields()[1].schema(), other.KID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.DEPTID)) {
        this.DEPTID = data().deepCopy(fields()[2].schema(), other.DEPTID);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.ENAME)) {
        this.ENAME = data().deepCopy(fields()[3].schema(), other.ENAME);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.CREATED_DATE)) {
        this.CREATED_DATE = data().deepCopy(fields()[4].schema(), other.CREATED_DATE);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.MODIFIED_DATE)) {
        this.MODIFIED_DATE = data().deepCopy(fields()[5].schema(), other.MODIFIED_DATE);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing EMPLOYEE instance
     * @param other The existing instance to copy.
     */
    private Builder(com.citi.schema.EMPLOYEE other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.KID)) {
        this.KID = data().deepCopy(fields()[1].schema(), other.KID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.DEPTID)) {
        this.DEPTID = data().deepCopy(fields()[2].schema(), other.DEPTID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ENAME)) {
        this.ENAME = data().deepCopy(fields()[3].schema(), other.ENAME);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.CREATED_DATE)) {
        this.CREATED_DATE = data().deepCopy(fields()[4].schema(), other.CREATED_DATE);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.MODIFIED_DATE)) {
        this.MODIFIED_DATE = data().deepCopy(fields()[5].schema(), other.MODIFIED_DATE);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getID() {
      return ID;
    }


    /**
      * Sets the value of the 'ID' field.
      * @param value The value of 'ID'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ID' field has been set.
      * @return True if the 'ID' field has been set, false otherwise.
      */
    public boolean hasID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ID' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearID() {
      ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'KID' field.
      * @return The value.
      */
    public long getKID() {
      return KID;
    }


    /**
      * Sets the value of the 'KID' field.
      * @param value The value of 'KID'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setKID(long value) {
      validate(fields()[1], value);
      this.KID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'KID' field has been set.
      * @return True if the 'KID' field has been set, false otherwise.
      */
    public boolean hasKID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'KID' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearKID() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'DEPTID' field.
      * @return The value.
      */
    public java.lang.CharSequence getDEPTID() {
      return DEPTID;
    }


    /**
      * Sets the value of the 'DEPTID' field.
      * @param value The value of 'DEPTID'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setDEPTID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.DEPTID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'DEPTID' field has been set.
      * @return True if the 'DEPTID' field has been set, false otherwise.
      */
    public boolean hasDEPTID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'DEPTID' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearDEPTID() {
      DEPTID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ENAME' field.
      * @return The value.
      */
    public java.lang.CharSequence getENAME() {
      return ENAME;
    }


    /**
      * Sets the value of the 'ENAME' field.
      * @param value The value of 'ENAME'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setENAME(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ENAME = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ENAME' field has been set.
      * @return True if the 'ENAME' field has been set, false otherwise.
      */
    public boolean hasENAME() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ENAME' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearENAME() {
      ENAME = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'CREATED_DATE' field.
      * @return The value.
      */
    public java.time.Instant getCREATEDDATE() {
      return CREATED_DATE;
    }


    /**
      * Sets the value of the 'CREATED_DATE' field.
      * @param value The value of 'CREATED_DATE'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setCREATEDDATE(java.time.Instant value) {
      validate(fields()[4], value);
      this.CREATED_DATE = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'CREATED_DATE' field has been set.
      * @return True if the 'CREATED_DATE' field has been set, false otherwise.
      */
    public boolean hasCREATEDDATE() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'CREATED_DATE' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearCREATEDDATE() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'MODIFIED_DATE' field.
      * @return The value.
      */
    public java.time.Instant getMODIFIEDDATE() {
      return MODIFIED_DATE;
    }


    /**
      * Sets the value of the 'MODIFIED_DATE' field.
      * @param value The value of 'MODIFIED_DATE'.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder setMODIFIEDDATE(java.time.Instant value) {
      validate(fields()[5], value);
      this.MODIFIED_DATE = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'MODIFIED_DATE' field has been set.
      * @return True if the 'MODIFIED_DATE' field has been set, false otherwise.
      */
    public boolean hasMODIFIEDDATE() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'MODIFIED_DATE' field.
      * @return This builder.
      */
    public com.citi.schema.EMPLOYEE.Builder clearMODIFIEDDATE() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EMPLOYEE build() {
      try {
        EMPLOYEE record = new EMPLOYEE();
        record.ID = fieldSetFlags()[0] ? this.ID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.KID = fieldSetFlags()[1] ? this.KID : (java.lang.Long) defaultValue(fields()[1]);
        record.DEPTID = fieldSetFlags()[2] ? this.DEPTID : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ENAME = fieldSetFlags()[3] ? this.ENAME : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.CREATED_DATE = fieldSetFlags()[4] ? this.CREATED_DATE : (java.time.Instant) defaultValue(fields()[4]);
        record.MODIFIED_DATE = fieldSetFlags()[5] ? this.MODIFIED_DATE : (java.time.Instant) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EMPLOYEE>
    WRITER$ = (org.apache.avro.io.DatumWriter<EMPLOYEE>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EMPLOYEE>
    READER$ = (org.apache.avro.io.DatumReader<EMPLOYEE>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









