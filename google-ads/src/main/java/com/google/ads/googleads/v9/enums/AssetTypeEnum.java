// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/enums/asset_type.proto

package com.google.ads.googleads.v9.enums;

/**
 * <pre>
 * Container for enum describing the types of asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.enums.AssetTypeEnum}
 */
public final class AssetTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.enums.AssetTypeEnum)
    AssetTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetTypeEnum.newBuilder() to construct.
  private AssetTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetTypeEnum(
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
    return com.google.ads.googleads.v9.enums.AssetTypeProto.internal_static_google_ads_googleads_v9_enums_AssetTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.enums.AssetTypeProto.internal_static_google_ads_googleads_v9_enums_AssetTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.enums.AssetTypeEnum.class, com.google.ads.googleads.v9.enums.AssetTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible types of asset.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.enums.AssetTypeEnum.AssetType}
   */
  public enum AssetType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
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
     * YouTube video asset.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO = 2;</code>
     */
    YOUTUBE_VIDEO(2),
    /**
     * <pre>
     * Media bundle asset.
     * </pre>
     *
     * <code>MEDIA_BUNDLE = 3;</code>
     */
    MEDIA_BUNDLE(3),
    /**
     * <pre>
     * Image asset.
     * </pre>
     *
     * <code>IMAGE = 4;</code>
     */
    IMAGE(4),
    /**
     * <pre>
     * Text asset.
     * </pre>
     *
     * <code>TEXT = 5;</code>
     */
    TEXT(5),
    /**
     * <pre>
     * Lead form asset.
     * </pre>
     *
     * <code>LEAD_FORM = 6;</code>
     */
    LEAD_FORM(6),
    /**
     * <pre>
     * Book on Google asset.
     * </pre>
     *
     * <code>BOOK_ON_GOOGLE = 7;</code>
     */
    BOOK_ON_GOOGLE(7),
    /**
     * <pre>
     * Promotion asset.
     * </pre>
     *
     * <code>PROMOTION = 8;</code>
     */
    PROMOTION(8),
    /**
     * <pre>
     * Callout asset.
     * </pre>
     *
     * <code>CALLOUT = 9;</code>
     */
    CALLOUT(9),
    /**
     * <pre>
     * Structured Snippet asset.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 10;</code>
     */
    STRUCTURED_SNIPPET(10),
    /**
     * <pre>
     * Sitelink asset.
     * </pre>
     *
     * <code>SITELINK = 11;</code>
     */
    SITELINK(11),
    /**
     * <pre>
     * Page Feed asset.
     * </pre>
     *
     * <code>PAGE_FEED = 12;</code>
     */
    PAGE_FEED(12),
    /**
     * <pre>
     * Dynamic Education asset.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 13;</code>
     */
    DYNAMIC_EDUCATION(13),
    /**
     * <pre>
     * Mobile app asset.
     * </pre>
     *
     * <code>MOBILE_APP = 14;</code>
     */
    MOBILE_APP(14),
    /**
     * <pre>
     * Hotel callout asset.
     * </pre>
     *
     * <code>HOTEL_CALLOUT = 15;</code>
     */
    HOTEL_CALLOUT(15),
    /**
     * <pre>
     * Call asset.
     * </pre>
     *
     * <code>CALL = 16;</code>
     */
    CALL(16),
    /**
     * <pre>
     * Price asset.
     * </pre>
     *
     * <code>PRICE = 17;</code>
     */
    PRICE(17),
    /**
     * <pre>
     * Call to action asset.
     * </pre>
     *
     * <code>CALL_TO_ACTION = 18;</code>
     */
    CALL_TO_ACTION(18),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
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
     * YouTube video asset.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO = 2;</code>
     */
    public static final int YOUTUBE_VIDEO_VALUE = 2;
    /**
     * <pre>
     * Media bundle asset.
     * </pre>
     *
     * <code>MEDIA_BUNDLE = 3;</code>
     */
    public static final int MEDIA_BUNDLE_VALUE = 3;
    /**
     * <pre>
     * Image asset.
     * </pre>
     *
     * <code>IMAGE = 4;</code>
     */
    public static final int IMAGE_VALUE = 4;
    /**
     * <pre>
     * Text asset.
     * </pre>
     *
     * <code>TEXT = 5;</code>
     */
    public static final int TEXT_VALUE = 5;
    /**
     * <pre>
     * Lead form asset.
     * </pre>
     *
     * <code>LEAD_FORM = 6;</code>
     */
    public static final int LEAD_FORM_VALUE = 6;
    /**
     * <pre>
     * Book on Google asset.
     * </pre>
     *
     * <code>BOOK_ON_GOOGLE = 7;</code>
     */
    public static final int BOOK_ON_GOOGLE_VALUE = 7;
    /**
     * <pre>
     * Promotion asset.
     * </pre>
     *
     * <code>PROMOTION = 8;</code>
     */
    public static final int PROMOTION_VALUE = 8;
    /**
     * <pre>
     * Callout asset.
     * </pre>
     *
     * <code>CALLOUT = 9;</code>
     */
    public static final int CALLOUT_VALUE = 9;
    /**
     * <pre>
     * Structured Snippet asset.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 10;</code>
     */
    public static final int STRUCTURED_SNIPPET_VALUE = 10;
    /**
     * <pre>
     * Sitelink asset.
     * </pre>
     *
     * <code>SITELINK = 11;</code>
     */
    public static final int SITELINK_VALUE = 11;
    /**
     * <pre>
     * Page Feed asset.
     * </pre>
     *
     * <code>PAGE_FEED = 12;</code>
     */
    public static final int PAGE_FEED_VALUE = 12;
    /**
     * <pre>
     * Dynamic Education asset.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 13;</code>
     */
    public static final int DYNAMIC_EDUCATION_VALUE = 13;
    /**
     * <pre>
     * Mobile app asset.
     * </pre>
     *
     * <code>MOBILE_APP = 14;</code>
     */
    public static final int MOBILE_APP_VALUE = 14;
    /**
     * <pre>
     * Hotel callout asset.
     * </pre>
     *
     * <code>HOTEL_CALLOUT = 15;</code>
     */
    public static final int HOTEL_CALLOUT_VALUE = 15;
    /**
     * <pre>
     * Call asset.
     * </pre>
     *
     * <code>CALL = 16;</code>
     */
    public static final int CALL_VALUE = 16;
    /**
     * <pre>
     * Price asset.
     * </pre>
     *
     * <code>PRICE = 17;</code>
     */
    public static final int PRICE_VALUE = 17;
    /**
     * <pre>
     * Call to action asset.
     * </pre>
     *
     * <code>CALL_TO_ACTION = 18;</code>
     */
    public static final int CALL_TO_ACTION_VALUE = 18;


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
    public static AssetType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return YOUTUBE_VIDEO;
        case 3: return MEDIA_BUNDLE;
        case 4: return IMAGE;
        case 5: return TEXT;
        case 6: return LEAD_FORM;
        case 7: return BOOK_ON_GOOGLE;
        case 8: return PROMOTION;
        case 9: return CALLOUT;
        case 10: return STRUCTURED_SNIPPET;
        case 11: return SITELINK;
        case 12: return PAGE_FEED;
        case 13: return DYNAMIC_EDUCATION;
        case 14: return MOBILE_APP;
        case 15: return HOTEL_CALLOUT;
        case 16: return CALL;
        case 17: return PRICE;
        case 18: return CALL_TO_ACTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetType>() {
            public AssetType findValueByNumber(int number) {
              return AssetType.forNumber(number);
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
      return com.google.ads.googleads.v9.enums.AssetTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetType[] VALUES = values();

    public static AssetType valueOf(
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

    private AssetType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.enums.AssetTypeEnum.AssetType)
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
    if (!(obj instanceof com.google.ads.googleads.v9.enums.AssetTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.enums.AssetTypeEnum other = (com.google.ads.googleads.v9.enums.AssetTypeEnum) obj;

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

  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.AssetTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.enums.AssetTypeEnum prototype) {
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
   * Container for enum describing the types of asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.enums.AssetTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.enums.AssetTypeEnum)
      com.google.ads.googleads.v9.enums.AssetTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.enums.AssetTypeProto.internal_static_google_ads_googleads_v9_enums_AssetTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.enums.AssetTypeProto.internal_static_google_ads_googleads_v9_enums_AssetTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.enums.AssetTypeEnum.class, com.google.ads.googleads.v9.enums.AssetTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.enums.AssetTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v9.enums.AssetTypeProto.internal_static_google_ads_googleads_v9_enums_AssetTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.AssetTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.enums.AssetTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.AssetTypeEnum build() {
      com.google.ads.googleads.v9.enums.AssetTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.AssetTypeEnum buildPartial() {
      com.google.ads.googleads.v9.enums.AssetTypeEnum result = new com.google.ads.googleads.v9.enums.AssetTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.enums.AssetTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v9.enums.AssetTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.enums.AssetTypeEnum other) {
      if (other == com.google.ads.googleads.v9.enums.AssetTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.enums.AssetTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.enums.AssetTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.enums.AssetTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.enums.AssetTypeEnum)
  private static final com.google.ads.googleads.v9.enums.AssetTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.enums.AssetTypeEnum();
  }

  public static com.google.ads.googleads.v9.enums.AssetTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetTypeEnum>() {
    @java.lang.Override
    public AssetTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.enums.AssetTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

