// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/feed_item_set_error.proto

package com.google.ads.googleads.v9.errors;

/**
 * <pre>
 * Container for enum describing possible feed item set errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.errors.FeedItemSetErrorEnum}
 */
public final class FeedItemSetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.errors.FeedItemSetErrorEnum)
    FeedItemSetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedItemSetErrorEnum.newBuilder() to construct.
  private FeedItemSetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedItemSetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedItemSetErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedItemSetErrorEnum(
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
    return com.google.ads.googleads.v9.errors.FeedItemSetErrorProto.internal_static_google_ads_googleads_v9_errors_FeedItemSetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.errors.FeedItemSetErrorProto.internal_static_google_ads_googleads_v9_errors_FeedItemSetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.class, com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible feed item set errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.errors.FeedItemSetErrorEnum.FeedItemSetError}
   */
  public enum FeedItemSetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The given ID refers to a removed FeedItemSet.
     * </pre>
     *
     * <code>FEED_ITEM_SET_REMOVED = 2;</code>
     */
    FEED_ITEM_SET_REMOVED(2),
    /**
     * <pre>
     * The dynamic filter of a feed item set cannot be cleared on UPDATE if it
     * exists. A set is either static or dynamic once added, and that cannot
     * change.
     * </pre>
     *
     * <code>CANNOT_CLEAR_DYNAMIC_FILTER = 3;</code>
     */
    CANNOT_CLEAR_DYNAMIC_FILTER(3),
    /**
     * <pre>
     * The dynamic filter of a feed item set cannot be created on UPDATE if it
     * does not exist. A set is either static or dynamic once added, and that
     * cannot change.
     * </pre>
     *
     * <code>CANNOT_CREATE_DYNAMIC_FILTER = 4;</code>
     */
    CANNOT_CREATE_DYNAMIC_FILTER(4),
    /**
     * <pre>
     * FeedItemSets can only be made for location or affiliate location feeds.
     * </pre>
     *
     * <code>INVALID_FEED_TYPE = 5;</code>
     */
    INVALID_FEED_TYPE(5),
    /**
     * <pre>
     * FeedItemSets duplicate name. Name should be unique within an account.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 6;</code>
     */
    DUPLICATE_NAME(6),
    /**
     * <pre>
     * The feed type of the parent Feed is not compatible with the type of
     * dynamic filter being set. For example, you can only set
     * dynamic_location_set_filter for LOCATION feed item sets.
     * </pre>
     *
     * <code>WRONG_DYNAMIC_FILTER_FOR_FEED_TYPE = 7;</code>
     */
    WRONG_DYNAMIC_FILTER_FOR_FEED_TYPE(7),
    /**
     * <pre>
     * Chain ID specified for AffiliateLocationFeedData is invalid.
     * </pre>
     *
     * <code>DYNAMIC_FILTER_INVALID_CHAIN_IDS = 8;</code>
     */
    DYNAMIC_FILTER_INVALID_CHAIN_IDS(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The given ID refers to a removed FeedItemSet.
     * </pre>
     *
     * <code>FEED_ITEM_SET_REMOVED = 2;</code>
     */
    public static final int FEED_ITEM_SET_REMOVED_VALUE = 2;
    /**
     * <pre>
     * The dynamic filter of a feed item set cannot be cleared on UPDATE if it
     * exists. A set is either static or dynamic once added, and that cannot
     * change.
     * </pre>
     *
     * <code>CANNOT_CLEAR_DYNAMIC_FILTER = 3;</code>
     */
    public static final int CANNOT_CLEAR_DYNAMIC_FILTER_VALUE = 3;
    /**
     * <pre>
     * The dynamic filter of a feed item set cannot be created on UPDATE if it
     * does not exist. A set is either static or dynamic once added, and that
     * cannot change.
     * </pre>
     *
     * <code>CANNOT_CREATE_DYNAMIC_FILTER = 4;</code>
     */
    public static final int CANNOT_CREATE_DYNAMIC_FILTER_VALUE = 4;
    /**
     * <pre>
     * FeedItemSets can only be made for location or affiliate location feeds.
     * </pre>
     *
     * <code>INVALID_FEED_TYPE = 5;</code>
     */
    public static final int INVALID_FEED_TYPE_VALUE = 5;
    /**
     * <pre>
     * FeedItemSets duplicate name. Name should be unique within an account.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 6;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 6;
    /**
     * <pre>
     * The feed type of the parent Feed is not compatible with the type of
     * dynamic filter being set. For example, you can only set
     * dynamic_location_set_filter for LOCATION feed item sets.
     * </pre>
     *
     * <code>WRONG_DYNAMIC_FILTER_FOR_FEED_TYPE = 7;</code>
     */
    public static final int WRONG_DYNAMIC_FILTER_FOR_FEED_TYPE_VALUE = 7;
    /**
     * <pre>
     * Chain ID specified for AffiliateLocationFeedData is invalid.
     * </pre>
     *
     * <code>DYNAMIC_FILTER_INVALID_CHAIN_IDS = 8;</code>
     */
    public static final int DYNAMIC_FILTER_INVALID_CHAIN_IDS_VALUE = 8;


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
    public static FeedItemSetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FeedItemSetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return FEED_ITEM_SET_REMOVED;
        case 3: return CANNOT_CLEAR_DYNAMIC_FILTER;
        case 4: return CANNOT_CREATE_DYNAMIC_FILTER;
        case 5: return INVALID_FEED_TYPE;
        case 6: return DUPLICATE_NAME;
        case 7: return WRONG_DYNAMIC_FILTER_FOR_FEED_TYPE;
        case 8: return DYNAMIC_FILTER_INVALID_CHAIN_IDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedItemSetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedItemSetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedItemSetError>() {
            public FeedItemSetError findValueByNumber(int number) {
              return FeedItemSetError.forNumber(number);
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
      return com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedItemSetError[] VALUES = values();

    public static FeedItemSetError valueOf(
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

    private FeedItemSetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.errors.FeedItemSetErrorEnum.FeedItemSetError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum other = (com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum prototype) {
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
   * Container for enum describing possible feed item set errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.errors.FeedItemSetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.errors.FeedItemSetErrorEnum)
      com.google.ads.googleads.v9.errors.FeedItemSetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.FeedItemSetErrorProto.internal_static_google_ads_googleads_v9_errors_FeedItemSetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.errors.FeedItemSetErrorProto.internal_static_google_ads_googleads_v9_errors_FeedItemSetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.class, com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.errors.FeedItemSetErrorProto.internal_static_google_ads_googleads_v9_errors_FeedItemSetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum build() {
      com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum buildPartial() {
      com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum result = new com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum other) {
      if (other == com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.errors.FeedItemSetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.errors.FeedItemSetErrorEnum)
  private static final com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum();
  }

  public static com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedItemSetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedItemSetErrorEnum>() {
    @java.lang.Override
    public FeedItemSetErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedItemSetErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedItemSetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedItemSetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.errors.FeedItemSetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

