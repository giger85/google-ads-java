// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/enums/keyword_plan_concept_group_type.proto

package com.google.ads.googleads.v9.enums;

/**
 * <pre>
 * Container for enumeration of keyword plan concept group types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum}
 */
public final class KeywordPlanConceptGroupTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)
    KeywordPlanConceptGroupTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanConceptGroupTypeEnum.newBuilder() to construct.
  private KeywordPlanConceptGroupTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanConceptGroupTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanConceptGroupTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanConceptGroupTypeEnum(
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
    return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeProto.internal_static_google_ads_googleads_v9_enums_KeywordPlanConceptGroupTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeProto.internal_static_google_ads_googleads_v9_enums_KeywordPlanConceptGroupTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.class, com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates keyword plan concept group types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.KeywordPlanConceptGroupType}
   */
  public enum KeywordPlanConceptGroupType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The concept group classification different from brand/non-brand.
     * This is a catch all bucket for all classifications that are none of the
     * below.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The concept group classification is based on BRAND.
     * </pre>
     *
     * <code>BRAND = 2;</code>
     */
    BRAND(2),
    /**
     * <pre>
     * The concept group classification based on BRAND, that didn't fit well
     * with the BRAND classifications. These are generally outliers and can have
     * very few keywords in this type of classification.
     * </pre>
     *
     * <code>OTHER_BRANDS = 3;</code>
     */
    OTHER_BRANDS(3),
    /**
     * <pre>
     * These concept group classification is not based on BRAND. This is
     * returned for generic keywords that don't have a brand association.
     * </pre>
     *
     * <code>NON_BRAND = 4;</code>
     */
    NON_BRAND(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The concept group classification different from brand/non-brand.
     * This is a catch all bucket for all classifications that are none of the
     * below.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The concept group classification is based on BRAND.
     * </pre>
     *
     * <code>BRAND = 2;</code>
     */
    public static final int BRAND_VALUE = 2;
    /**
     * <pre>
     * The concept group classification based on BRAND, that didn't fit well
     * with the BRAND classifications. These are generally outliers and can have
     * very few keywords in this type of classification.
     * </pre>
     *
     * <code>OTHER_BRANDS = 3;</code>
     */
    public static final int OTHER_BRANDS_VALUE = 3;
    /**
     * <pre>
     * These concept group classification is not based on BRAND. This is
     * returned for generic keywords that don't have a brand association.
     * </pre>
     *
     * <code>NON_BRAND = 4;</code>
     */
    public static final int NON_BRAND_VALUE = 4;


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
    public static KeywordPlanConceptGroupType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KeywordPlanConceptGroupType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BRAND;
        case 3: return OTHER_BRANDS;
        case 4: return NON_BRAND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KeywordPlanConceptGroupType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KeywordPlanConceptGroupType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KeywordPlanConceptGroupType>() {
            public KeywordPlanConceptGroupType findValueByNumber(int number) {
              return KeywordPlanConceptGroupType.forNumber(number);
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
      return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final KeywordPlanConceptGroupType[] VALUES = values();

    public static KeywordPlanConceptGroupType valueOf(
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

    private KeywordPlanConceptGroupType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.KeywordPlanConceptGroupType)
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
    if (!(obj instanceof com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum other = (com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum) obj;

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

  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum prototype) {
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
   * Container for enumeration of keyword plan concept group types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)
      com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeProto.internal_static_google_ads_googleads_v9_enums_KeywordPlanConceptGroupTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeProto.internal_static_google_ads_googleads_v9_enums_KeywordPlanConceptGroupTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.class, com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeProto.internal_static_google_ads_googleads_v9_enums_KeywordPlanConceptGroupTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum build() {
      com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum buildPartial() {
      com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum result = new com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum other) {
      if (other == com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum)
  private static final com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum();
  }

  public static com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanConceptGroupTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanConceptGroupTypeEnum>() {
    @java.lang.Override
    public KeywordPlanConceptGroupTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanConceptGroupTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanConceptGroupTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanConceptGroupTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.enums.KeywordPlanConceptGroupTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

