// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/errors.proto

package com.google.ads.googleads.v9.errors;

/**
 * <pre>
 * Additional quota error details when there is QuotaError.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.errors.QuotaErrorDetails}
 */
public final class QuotaErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.errors.QuotaErrorDetails)
    QuotaErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuotaErrorDetails.newBuilder() to construct.
  private QuotaErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuotaErrorDetails() {
    rateScope_ = 0;
    rateName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuotaErrorDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuotaErrorDetails(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            rateScope_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            rateName_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (retryDelay_ != null) {
              subBuilder = retryDelay_.toBuilder();
            }
            retryDelay_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(retryDelay_);
              retryDelay_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v9.errors.ErrorsProto.internal_static_google_ads_googleads_v9_errors_QuotaErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.errors.ErrorsProto.internal_static_google_ads_googleads_v9_errors_QuotaErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.errors.QuotaErrorDetails.class, com.google.ads.googleads.v9.errors.QuotaErrorDetails.Builder.class);
  }

  /**
   * <pre>
   * Enum of possible scopes that quota buckets belong to.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope}
   */
  public enum QuotaRateScope
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified enum
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Per customer account quota
     * </pre>
     *
     * <code>ACCOUNT = 2;</code>
     */
    ACCOUNT(2),
    /**
     * <pre>
     * Per project or DevToken quota
     * </pre>
     *
     * <code>DEVELOPER = 3;</code>
     */
    DEVELOPER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified enum
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Per customer account quota
     * </pre>
     *
     * <code>ACCOUNT = 2;</code>
     */
    public static final int ACCOUNT_VALUE = 2;
    /**
     * <pre>
     * Per project or DevToken quota
     * </pre>
     *
     * <code>DEVELOPER = 3;</code>
     */
    public static final int DEVELOPER_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static QuotaRateScope valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static QuotaRateScope forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ACCOUNT;
        case 3: return DEVELOPER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<QuotaRateScope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        QuotaRateScope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<QuotaRateScope>() {
            public QuotaRateScope findValueByNumber(int number) {
              return QuotaRateScope.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.QuotaErrorDetails.getDescriptor().getEnumTypes().get(0);
    }

    private static final QuotaRateScope[] VALUES = values();

    public static QuotaRateScope valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private QuotaRateScope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope)
  }

  public static final int RATE_SCOPE_FIELD_NUMBER = 1;
  private int rateScope_;
  /**
   * <pre>
   * The rate scope of the quota limit.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
   * @return The enum numeric value on the wire for rateScope.
   */
  @java.lang.Override public int getRateScopeValue() {
    return rateScope_;
  }
  /**
   * <pre>
   * The rate scope of the quota limit.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
   * @return The rateScope.
   */
  @java.lang.Override public com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope getRateScope() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope result = com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.valueOf(rateScope_);
    return result == null ? com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.UNRECOGNIZED : result;
  }

  public static final int RATE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object rateName_;
  /**
   * <pre>
   * The high level description of the quota bucket.
   * Examples are "Get requests for standard access" or "Requests per account".
   * </pre>
   *
   * <code>string rate_name = 2;</code>
   * @return The rateName.
   */
  @java.lang.Override
  public java.lang.String getRateName() {
    java.lang.Object ref = rateName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rateName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The high level description of the quota bucket.
   * Examples are "Get requests for standard access" or "Requests per account".
   * </pre>
   *
   * <code>string rate_name = 2;</code>
   * @return The bytes for rateName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRateNameBytes() {
    java.lang.Object ref = rateName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rateName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETRY_DELAY_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration retryDelay_;
  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   * @return Whether the retryDelay field is set.
   */
  @java.lang.Override
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   * @return The retryDelay.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
    return getRetryDelay();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (rateScope_ != com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, rateScope_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rateName_);
    }
    if (retryDelay_ != null) {
      output.writeMessage(3, getRetryDelay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rateScope_ != com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, rateScope_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rateName_);
    }
    if (retryDelay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRetryDelay());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v9.errors.QuotaErrorDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.errors.QuotaErrorDetails other = (com.google.ads.googleads.v9.errors.QuotaErrorDetails) obj;

    if (rateScope_ != other.rateScope_) return false;
    if (!getRateName()
        .equals(other.getRateName())) return false;
    if (hasRetryDelay() != other.hasRetryDelay()) return false;
    if (hasRetryDelay()) {
      if (!getRetryDelay()
          .equals(other.getRetryDelay())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RATE_SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + rateScope_;
    hash = (37 * hash) + RATE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRateName().hashCode();
    if (hasRetryDelay()) {
      hash = (37 * hash) + RETRY_DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getRetryDelay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v9.errors.QuotaErrorDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Additional quota error details when there is QuotaError.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.errors.QuotaErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.errors.QuotaErrorDetails)
      com.google.ads.googleads.v9.errors.QuotaErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.ErrorsProto.internal_static_google_ads_googleads_v9_errors_QuotaErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.errors.ErrorsProto.internal_static_google_ads_googleads_v9_errors_QuotaErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.errors.QuotaErrorDetails.class, com.google.ads.googleads.v9.errors.QuotaErrorDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.errors.QuotaErrorDetails.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      rateScope_ = 0;

      rateName_ = "";

      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.errors.ErrorsProto.internal_static_google_ads_googleads_v9_errors_QuotaErrorDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.QuotaErrorDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.errors.QuotaErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.QuotaErrorDetails build() {
      com.google.ads.googleads.v9.errors.QuotaErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.QuotaErrorDetails buildPartial() {
      com.google.ads.googleads.v9.errors.QuotaErrorDetails result = new com.google.ads.googleads.v9.errors.QuotaErrorDetails(this);
      result.rateScope_ = rateScope_;
      result.rateName_ = rateName_;
      if (retryDelayBuilder_ == null) {
        result.retryDelay_ = retryDelay_;
      } else {
        result.retryDelay_ = retryDelayBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v9.errors.QuotaErrorDetails) {
        return mergeFrom((com.google.ads.googleads.v9.errors.QuotaErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.errors.QuotaErrorDetails other) {
      if (other == com.google.ads.googleads.v9.errors.QuotaErrorDetails.getDefaultInstance()) return this;
      if (other.rateScope_ != 0) {
        setRateScopeValue(other.getRateScopeValue());
      }
      if (!other.getRateName().isEmpty()) {
        rateName_ = other.rateName_;
        onChanged();
      }
      if (other.hasRetryDelay()) {
        mergeRetryDelay(other.getRetryDelay());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v9.errors.QuotaErrorDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.errors.QuotaErrorDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rateScope_ = 0;
    /**
     * <pre>
     * The rate scope of the quota limit.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
     * @return The enum numeric value on the wire for rateScope.
     */
    @java.lang.Override public int getRateScopeValue() {
      return rateScope_;
    }
    /**
     * <pre>
     * The rate scope of the quota limit.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
     * @param value The enum numeric value on the wire for rateScope to set.
     * @return This builder for chaining.
     */
    public Builder setRateScopeValue(int value) {
      
      rateScope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The rate scope of the quota limit.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
     * @return The rateScope.
     */
    @java.lang.Override
    public com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope getRateScope() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope result = com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.valueOf(rateScope_);
      return result == null ? com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The rate scope of the quota limit.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
     * @param value The rateScope to set.
     * @return This builder for chaining.
     */
    public Builder setRateScope(com.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      rateScope_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The rate scope of the quota limit.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRateScope() {
      
      rateScope_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object rateName_ = "";
    /**
     * <pre>
     * The high level description of the quota bucket.
     * Examples are "Get requests for standard access" or "Requests per account".
     * </pre>
     *
     * <code>string rate_name = 2;</code>
     * @return The rateName.
     */
    public java.lang.String getRateName() {
      java.lang.Object ref = rateName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rateName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The high level description of the quota bucket.
     * Examples are "Get requests for standard access" or "Requests per account".
     * </pre>
     *
     * <code>string rate_name = 2;</code>
     * @return The bytes for rateName.
     */
    public com.google.protobuf.ByteString
        getRateNameBytes() {
      java.lang.Object ref = rateName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rateName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The high level description of the quota bucket.
     * Examples are "Get requests for standard access" or "Requests per account".
     * </pre>
     *
     * <code>string rate_name = 2;</code>
     * @param value The rateName to set.
     * @return This builder for chaining.
     */
    public Builder setRateName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rateName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The high level description of the quota bucket.
     * Examples are "Get requests for standard access" or "Requests per account".
     * </pre>
     *
     * <code>string rate_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRateName() {
      
      rateName_ = getDefaultInstance().getRateName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The high level description of the quota bucket.
     * Examples are "Get requests for standard access" or "Requests per account".
     * </pre>
     *
     * <code>string rate_name = 2;</code>
     * @param value The bytes for rateName to set.
     * @return This builder for chaining.
     */
    public Builder setRateNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rateName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration retryDelay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> retryDelayBuilder_;
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     * @return Whether the retryDelay field is set.
     */
    public boolean hasRetryDelay() {
      return retryDelayBuilder_ != null || retryDelay_ != null;
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     * @return The retryDelay.
     */
    public com.google.protobuf.Duration getRetryDelay() {
      if (retryDelayBuilder_ == null) {
        return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      } else {
        return retryDelayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryDelay_ = value;
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public Builder setRetryDelay(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = builderForValue.build();
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (retryDelay_ != null) {
          retryDelay_ =
            com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
        } else {
          retryDelay_ = value;
        }
        onChanged();
      } else {
        retryDelayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public Builder clearRetryDelay() {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
        onChanged();
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public com.google.protobuf.Duration.Builder getRetryDelayBuilder() {
      
      onChanged();
      return getRetryDelayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
      if (retryDelayBuilder_ != null) {
        return retryDelayBuilder_.getMessageOrBuilder();
      } else {
        return retryDelay_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      }
    }
    /**
     * <pre>
     * Backoff period that customers should wait before sending next request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getRetryDelayFieldBuilder() {
      if (retryDelayBuilder_ == null) {
        retryDelayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getRetryDelay(),
                getParentForChildren(),
                isClean());
        retryDelay_ = null;
      }
      return retryDelayBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.errors.QuotaErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.errors.QuotaErrorDetails)
  private static final com.google.ads.googleads.v9.errors.QuotaErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.errors.QuotaErrorDetails();
  }

  public static com.google.ads.googleads.v9.errors.QuotaErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuotaErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<QuotaErrorDetails>() {
    @java.lang.Override
    public QuotaErrorDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuotaErrorDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuotaErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuotaErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.errors.QuotaErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

