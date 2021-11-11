// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/asset_group_error.proto

package com.google.ads.googleads.v9.errors;

/**
 * <pre>
 * Container for enum describing possible asset group errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.errors.AssetGroupErrorEnum}
 */
public final class AssetGroupErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.errors.AssetGroupErrorEnum)
    AssetGroupErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetGroupErrorEnum.newBuilder() to construct.
  private AssetGroupErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetGroupErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetGroupErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetGroupErrorEnum(
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
    return com.google.ads.googleads.v9.errors.AssetGroupErrorProto.internal_static_google_ads_googleads_v9_errors_AssetGroupErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.errors.AssetGroupErrorProto.internal_static_google_ads_googleads_v9_errors_AssetGroupErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.class, com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset group errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.errors.AssetGroupErrorEnum.AssetGroupError}
   */
  public enum AssetGroupError
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
     * Each asset group in a single campaign must have a unique name.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    DUPLICATE_NAME(2),
    /**
     * <pre>
     * Cannot add asset group for the campaign type.
     * </pre>
     *
     * <code>CANNOT_ADD_ASSET_GROUP_FOR_CAMPAIGN_TYPE = 3;</code>
     */
    CANNOT_ADD_ASSET_GROUP_FOR_CAMPAIGN_TYPE(3),
    /**
     * <pre>
     * Not enough headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_HEADLINE_ASSET = 4;</code>
     */
    NOT_ENOUGH_HEADLINE_ASSET(4),
    /**
     * <pre>
     * Not enough long headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_LONG_HEADLINE_ASSET = 5;</code>
     */
    NOT_ENOUGH_LONG_HEADLINE_ASSET(5),
    /**
     * <pre>
     * Not enough description headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_DESCRIPTION_ASSET = 6;</code>
     */
    NOT_ENOUGH_DESCRIPTION_ASSET(6),
    /**
     * <pre>
     * Not enough business name asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_BUSINESS_NAME_ASSET = 7;</code>
     */
    NOT_ENOUGH_BUSINESS_NAME_ASSET(7),
    /**
     * <pre>
     * Not enough marketing image asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_MARKETING_IMAGE_ASSET = 8;</code>
     */
    NOT_ENOUGH_MARKETING_IMAGE_ASSET(8),
    /**
     * <pre>
     * Not enough square marketing image asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_SQUARE_MARKETING_IMAGE_ASSET = 9;</code>
     */
    NOT_ENOUGH_SQUARE_MARKETING_IMAGE_ASSET(9),
    /**
     * <pre>
     * Not enough logo asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_LOGO_ASSET = 10;</code>
     */
    NOT_ENOUGH_LOGO_ASSET(10),
    /**
     * <pre>
     * Final url and shopping merchant url does not have the same domain.
     * </pre>
     *
     * <code>FINAL_URL_SHOPPING_MERCHANT_HOME_PAGE_URL_DOMAINS_DIFFER = 11;</code>
     */
    FINAL_URL_SHOPPING_MERCHANT_HOME_PAGE_URL_DOMAINS_DIFFER(11),
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
     * Each asset group in a single campaign must have a unique name.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 2;
    /**
     * <pre>
     * Cannot add asset group for the campaign type.
     * </pre>
     *
     * <code>CANNOT_ADD_ASSET_GROUP_FOR_CAMPAIGN_TYPE = 3;</code>
     */
    public static final int CANNOT_ADD_ASSET_GROUP_FOR_CAMPAIGN_TYPE_VALUE = 3;
    /**
     * <pre>
     * Not enough headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_HEADLINE_ASSET = 4;</code>
     */
    public static final int NOT_ENOUGH_HEADLINE_ASSET_VALUE = 4;
    /**
     * <pre>
     * Not enough long headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_LONG_HEADLINE_ASSET = 5;</code>
     */
    public static final int NOT_ENOUGH_LONG_HEADLINE_ASSET_VALUE = 5;
    /**
     * <pre>
     * Not enough description headline asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_DESCRIPTION_ASSET = 6;</code>
     */
    public static final int NOT_ENOUGH_DESCRIPTION_ASSET_VALUE = 6;
    /**
     * <pre>
     * Not enough business name asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_BUSINESS_NAME_ASSET = 7;</code>
     */
    public static final int NOT_ENOUGH_BUSINESS_NAME_ASSET_VALUE = 7;
    /**
     * <pre>
     * Not enough marketing image asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_MARKETING_IMAGE_ASSET = 8;</code>
     */
    public static final int NOT_ENOUGH_MARKETING_IMAGE_ASSET_VALUE = 8;
    /**
     * <pre>
     * Not enough square marketing image asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_SQUARE_MARKETING_IMAGE_ASSET = 9;</code>
     */
    public static final int NOT_ENOUGH_SQUARE_MARKETING_IMAGE_ASSET_VALUE = 9;
    /**
     * <pre>
     * Not enough logo asset for a valid asset group.
     * </pre>
     *
     * <code>NOT_ENOUGH_LOGO_ASSET = 10;</code>
     */
    public static final int NOT_ENOUGH_LOGO_ASSET_VALUE = 10;
    /**
     * <pre>
     * Final url and shopping merchant url does not have the same domain.
     * </pre>
     *
     * <code>FINAL_URL_SHOPPING_MERCHANT_HOME_PAGE_URL_DOMAINS_DIFFER = 11;</code>
     */
    public static final int FINAL_URL_SHOPPING_MERCHANT_HOME_PAGE_URL_DOMAINS_DIFFER_VALUE = 11;


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
    public static AssetGroupError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetGroupError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_NAME;
        case 3: return CANNOT_ADD_ASSET_GROUP_FOR_CAMPAIGN_TYPE;
        case 4: return NOT_ENOUGH_HEADLINE_ASSET;
        case 5: return NOT_ENOUGH_LONG_HEADLINE_ASSET;
        case 6: return NOT_ENOUGH_DESCRIPTION_ASSET;
        case 7: return NOT_ENOUGH_BUSINESS_NAME_ASSET;
        case 8: return NOT_ENOUGH_MARKETING_IMAGE_ASSET;
        case 9: return NOT_ENOUGH_SQUARE_MARKETING_IMAGE_ASSET;
        case 10: return NOT_ENOUGH_LOGO_ASSET;
        case 11: return FINAL_URL_SHOPPING_MERCHANT_HOME_PAGE_URL_DOMAINS_DIFFER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetGroupError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetGroupError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetGroupError>() {
            public AssetGroupError findValueByNumber(int number) {
              return AssetGroupError.forNumber(number);
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
      return com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetGroupError[] VALUES = values();

    public static AssetGroupError valueOf(
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

    private AssetGroupError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.errors.AssetGroupErrorEnum.AssetGroupError)
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
    if (!(obj instanceof com.google.ads.googleads.v9.errors.AssetGroupErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.errors.AssetGroupErrorEnum other = (com.google.ads.googleads.v9.errors.AssetGroupErrorEnum) obj;

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

  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.errors.AssetGroupErrorEnum prototype) {
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
   * Container for enum describing possible asset group errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.errors.AssetGroupErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.errors.AssetGroupErrorEnum)
      com.google.ads.googleads.v9.errors.AssetGroupErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.AssetGroupErrorProto.internal_static_google_ads_googleads_v9_errors_AssetGroupErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.errors.AssetGroupErrorProto.internal_static_google_ads_googleads_v9_errors_AssetGroupErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.class, com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v9.errors.AssetGroupErrorProto.internal_static_google_ads_googleads_v9_errors_AssetGroupErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetGroupErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetGroupErrorEnum build() {
      com.google.ads.googleads.v9.errors.AssetGroupErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.AssetGroupErrorEnum buildPartial() {
      com.google.ads.googleads.v9.errors.AssetGroupErrorEnum result = new com.google.ads.googleads.v9.errors.AssetGroupErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.errors.AssetGroupErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v9.errors.AssetGroupErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.errors.AssetGroupErrorEnum other) {
      if (other == com.google.ads.googleads.v9.errors.AssetGroupErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.errors.AssetGroupErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.errors.AssetGroupErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.errors.AssetGroupErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.errors.AssetGroupErrorEnum)
  private static final com.google.ads.googleads.v9.errors.AssetGroupErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.errors.AssetGroupErrorEnum();
  }

  public static com.google.ads.googleads.v9.errors.AssetGroupErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetGroupErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetGroupErrorEnum>() {
    @java.lang.Override
    public AssetGroupErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetGroupErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetGroupErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetGroupErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.errors.AssetGroupErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

