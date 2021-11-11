// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/asset_set_link_error.proto

package com.google.ads.googleads.v9.errors;

/**
 * <pre>
 * Container for enum describing possible asset set link errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.errors.AssetSetLinkErrorEnum}
 */
public final class AssetSetLinkErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)
    AssetSetLinkErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSetLinkErrorEnum.newBuilder() to construct.
  private AssetSetLinkErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSetLinkErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSetLinkErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetSetLinkErrorEnum(
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
    return com.google.ads.googleads.v9.errors.AssetSetLinkErrorProto.internal_static_google_ads_googleads_v9_errors_AssetSetLinkErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.errors.AssetSetLinkErrorProto.internal_static_google_ads_googleads_v9_errors_AssetSetLinkErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.class, com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset set link errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.AssetSetLinkError}
   */
  public enum AssetSetLinkError
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
     * Advertising channel type cannot be attached to the asset set due to
     * channel-based restrictions.
     * </pre>
     *
     * <code>INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE = 2;</code>
     */
    INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE(2),
    /**
     * <pre>
     * For this asset set type, only one campaign to feed linkage is allowed.
     * </pre>
     *
     * <code>DUPLICATE_FEED_LINK = 3;</code>
     */
    DUPLICATE_FEED_LINK(3),
    /**
     * <pre>
     * The asset set type and campaign type are incompatible.
     * </pre>
     *
     * <code>INCOMPATIBLE_ASSET_SET_TYPE_WITH_CAMPAIGN_TYPE = 4;</code>
     */
    INCOMPATIBLE_ASSET_SET_TYPE_WITH_CAMPAIGN_TYPE(4),
    /**
     * <pre>
     * Cannot link duplicate asset sets to the same campaign.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_SET_LINK = 5;</code>
     */
    DUPLICATE_ASSET_SET_LINK(5),
    /**
     * <pre>
     * Cannot remove the asset set link. If a campaign is linked with only one
     * asset set and you attempt to unlink them, this error will be triggered.
     * </pre>
     *
     * <code>ASSET_SET_LINK_CANNOT_BE_REMOVED = 6;</code>
     */
    ASSET_SET_LINK_CANNOT_BE_REMOVED(6),
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
     * Advertising channel type cannot be attached to the asset set due to
     * channel-based restrictions.
     * </pre>
     *
     * <code>INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE = 2;</code>
     */
    public static final int INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE_VALUE = 2;
    /**
     * <pre>
     * For this asset set type, only one campaign to feed linkage is allowed.
     * </pre>
     *
     * <code>DUPLICATE_FEED_LINK = 3;</code>
     */
    public static final int DUPLICATE_FEED_LINK_VALUE = 3;
    /**
     * <pre>
     * The asset set type and campaign type are incompatible.
     * </pre>
     *
     * <code>INCOMPATIBLE_ASSET_SET_TYPE_WITH_CAMPAIGN_TYPE = 4;</code>
     */
    public static final int INCOMPATIBLE_ASSET_SET_TYPE_WITH_CAMPAIGN_TYPE_VALUE = 4;
    /**
     * <pre>
     * Cannot link duplicate asset sets to the same campaign.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_SET_LINK = 5;</code>
     */
    public static final int DUPLICATE_ASSET_SET_LINK_VALUE = 5;
    /**
     * <pre>
     * Cannot remove the asset set link. If a campaign is linked with only one
     * asset set and you attempt to unlink them, this error will be triggered.
     * </pre>
     *
     * <code>ASSET_SET_LINK_CANNOT_BE_REMOVED = 6;</code>
     */
    public static final int ASSET_SET_LINK_CANNOT_BE_REMOVED_VALUE = 6;


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
    public static AssetSetLinkError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetSetLinkError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE;
        case 3: return DUPLICATE_FEED_LINK;
        case 4: return INCOMPATIBLE_ASSET_SET_TYPE_WITH_CAMPAIGN_TYPE;
        case 5: return DUPLICATE_ASSET_SET_LINK;
        case 6: return ASSET_SET_LINK_CANNOT_BE_REMOVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetSetLinkError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetSetLinkError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetSetLinkError>() {
            public AssetSetLinkError findValueByNumber(int number) {
              return AssetSetLinkError.forNumber(number);
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
      return com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetSetLinkError[] VALUES = values();

    public static AssetSetLinkError valueOf(
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

    private AssetSetLinkError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.AssetSetLinkError)
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
    if (!(obj instanceof com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum other = (com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum) obj;

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

  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum prototype) {
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
   * Container for enum describing possible asset set link errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.errors.AssetSetLinkErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)
      com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.AssetSetLinkErrorProto.internal_static_google_ads_googleads_v9_errors_AssetSetLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.errors.AssetSetLinkErrorProto.internal_static_google_ads_googleads_v9_errors_AssetSetLinkErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.class, com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v9.errors.AssetSetLinkErrorProto.internal_static_google_ads_googleads_v9_errors_AssetSetLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum build() {
      com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum buildPartial() {
      com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum result = new com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum other) {
      if (other == com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.errors.AssetSetLinkErrorEnum)
  private static final com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum();
  }

  public static com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSetLinkErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetSetLinkErrorEnum>() {
    @java.lang.Override
    public AssetSetLinkErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetSetLinkErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetSetLinkErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSetLinkErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.errors.AssetSetLinkErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

