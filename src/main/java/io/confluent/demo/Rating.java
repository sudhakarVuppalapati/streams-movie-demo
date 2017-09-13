/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.demo;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Rating extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4553930247857180038L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Rating\",\"namespace\":\"io.confluent.demo\",\"fields\":[{\"name\":\"movie_id\",\"type\":\"int\"},{\"name\":\"rating\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Rating> ENCODER =
      new BinaryMessageEncoder<Rating>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Rating> DECODER =
      new BinaryMessageDecoder<Rating>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Rating> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Rating> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Rating>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Rating to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Rating from a ByteBuffer. */
  public static Rating fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int movie_id;
  @Deprecated public float rating;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Rating() {}

  /**
   * All-args constructor.
   * @param movie_id The new value for movie_id
   * @param rating The new value for rating
   */
  public Rating(java.lang.Integer movie_id, java.lang.Float rating) {
    this.movie_id = movie_id;
    this.rating = rating;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return movie_id;
    case 1: return rating;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: movie_id = (java.lang.Integer)value$; break;
    case 1: rating = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'movie_id' field.
   * @return The value of the 'movie_id' field.
   */
  public java.lang.Integer getMovieId() {
    return movie_id;
  }

  /**
   * Sets the value of the 'movie_id' field.
   * @param value the value to set.
   */
  public void setMovieId(java.lang.Integer value) {
    this.movie_id = value;
  }

  /**
   * Gets the value of the 'rating' field.
   * @return The value of the 'rating' field.
   */
  public java.lang.Float getRating() {
    return rating;
  }

  /**
   * Sets the value of the 'rating' field.
   * @param value the value to set.
   */
  public void setRating(java.lang.Float value) {
    this.rating = value;
  }

  /**
   * Creates a new Rating RecordBuilder.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.demo.Rating.Builder newBuilder() {
    return new io.confluent.demo.Rating.Builder();
  }

  /**
   * Creates a new Rating RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.demo.Rating.Builder newBuilder(io.confluent.demo.Rating.Builder other) {
    return new io.confluent.demo.Rating.Builder(other);
  }

  /**
   * Creates a new Rating RecordBuilder by copying an existing Rating instance.
   * @param other The existing instance to copy.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.demo.Rating.Builder newBuilder(io.confluent.demo.Rating other) {
    return new io.confluent.demo.Rating.Builder(other);
  }

  /**
   * RecordBuilder for Rating instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Rating>
    implements org.apache.avro.data.RecordBuilder<Rating> {

    private int movie_id;
    private float rating;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.demo.Rating.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.movie_id)) {
        this.movie_id = data().deepCopy(fields()[0].schema(), other.movie_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rating)) {
        this.rating = data().deepCopy(fields()[1].schema(), other.rating);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Rating instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.demo.Rating other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.movie_id)) {
        this.movie_id = data().deepCopy(fields()[0].schema(), other.movie_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rating)) {
        this.rating = data().deepCopy(fields()[1].schema(), other.rating);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'movie_id' field.
      * @return The value.
      */
    public java.lang.Integer getMovieId() {
      return movie_id;
    }

    /**
      * Sets the value of the 'movie_id' field.
      * @param value The value of 'movie_id'.
      * @return This builder.
      */
    public io.confluent.demo.Rating.Builder setMovieId(int value) {
      validate(fields()[0], value);
      this.movie_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'movie_id' field has been set.
      * @return True if the 'movie_id' field has been set, false otherwise.
      */
    public boolean hasMovieId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'movie_id' field.
      * @return This builder.
      */
    public io.confluent.demo.Rating.Builder clearMovieId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'rating' field.
      * @return The value.
      */
    public java.lang.Float getRating() {
      return rating;
    }

    /**
      * Sets the value of the 'rating' field.
      * @param value The value of 'rating'.
      * @return This builder.
      */
    public io.confluent.demo.Rating.Builder setRating(float value) {
      validate(fields()[1], value);
      this.rating = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'rating' field has been set.
      * @return True if the 'rating' field has been set, false otherwise.
      */
    public boolean hasRating() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'rating' field.
      * @return This builder.
      */
    public io.confluent.demo.Rating.Builder clearRating() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Rating build() {
      try {
        Rating record = new Rating();
        record.movie_id = fieldSetFlags()[0] ? this.movie_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.rating = fieldSetFlags()[1] ? this.rating : (java.lang.Float) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Rating>
    WRITER$ = (org.apache.avro.io.DatumWriter<Rating>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Rating>
    READER$ = (org.apache.avro.io.DatumReader<Rating>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
