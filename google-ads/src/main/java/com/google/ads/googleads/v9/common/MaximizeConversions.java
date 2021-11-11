// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/bidding.proto

package com.google.ads.googleads.v9.common;

/**
 * <pre>
 * An automated bidding strategy to help get the most conversions for your
 * campaigns while spending your budget.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.common.MaximizeConversions}
 */
public final class MaximizeConversions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.common.MaximizeConversions)
    MaximizeConversionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaximizeConversions.newBuilder() to construct.
  private MaximizeConversions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaximizeConversions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaximizeConversions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MaximizeConversions(
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

            targetCpa_ = input.readInt64();
            break;
          }
          case 16: {

            cpcBidCeilingMicros_ = input.readInt64();
            break;
          }
          case 24: {

            cpcBidFloorMicros_ = input.readInt64();
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
    return com.google.ads.googleads.v9.common.BiddingProto.internal_static_google_ads_googleads_v9_common_MaximizeConversions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.common.BiddingProto.internal_static_google_ads_googleads_v9_common_MaximizeConversions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.common.MaximizeConversions.class, com.google.ads.googleads.v9.common.MaximizeConversions.Builder.class);
  }

  public static final int TARGET_CPA_FIELD_NUMBER = 1;
  private long targetCpa_;
  /**
   * <pre>
   * The target cost-per-action (CPA) option. This is the average amount that
   * you would like to spend per conversion action. If set, the bid strategy
   * will get as many conversions as possible at or below the target
   * cost-per-action. If the target CPA is not set, the bid strategy will
   * aim to achieve the lowest possible CPA given the budget.
   * </pre>
   *
   * <code>int64 target_cpa = 1;</code>
   * @return The targetCpa.
   */
  @java.lang.Override
  public long getTargetCpa() {
    return targetCpa_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 2;
  private long cpcBidCeilingMicros_;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 2;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
  }

  public static final int CPC_BID_FLOOR_MICROS_FIELD_NUMBER = 3;
  private long cpcBidFloorMicros_;
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 3;</code>
   * @return The cpcBidFloorMicros.
   */
  @java.lang.Override
  public long getCpcBidFloorMicros() {
    return cpcBidFloorMicros_;
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
    if (targetCpa_ != 0L) {
      output.writeInt64(1, targetCpa_);
    }
    if (cpcBidCeilingMicros_ != 0L) {
      output.writeInt64(2, cpcBidCeilingMicros_);
    }
    if (cpcBidFloorMicros_ != 0L) {
      output.writeInt64(3, cpcBidFloorMicros_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetCpa_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, targetCpa_);
    }
    if (cpcBidCeilingMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, cpcBidCeilingMicros_);
    }
    if (cpcBidFloorMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, cpcBidFloorMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v9.common.MaximizeConversions)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.common.MaximizeConversions other = (com.google.ads.googleads.v9.common.MaximizeConversions) obj;

    if (getTargetCpa()
        != other.getTargetCpa()) return false;
    if (getCpcBidCeilingMicros()
        != other.getCpcBidCeilingMicros()) return false;
    if (getCpcBidFloorMicros()
        != other.getCpcBidFloorMicros()) return false;
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
    hash = (37 * hash) + TARGET_CPA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTargetCpa());
    hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCpcBidCeilingMicros());
    hash = (37 * hash) + CPC_BID_FLOOR_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCpcBidFloorMicros());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.MaximizeConversions parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.common.MaximizeConversions prototype) {
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
   * An automated bidding strategy to help get the most conversions for your
   * campaigns while spending your budget.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.common.MaximizeConversions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.common.MaximizeConversions)
      com.google.ads.googleads.v9.common.MaximizeConversionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.common.BiddingProto.internal_static_google_ads_googleads_v9_common_MaximizeConversions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.common.BiddingProto.internal_static_google_ads_googleads_v9_common_MaximizeConversions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.common.MaximizeConversions.class, com.google.ads.googleads.v9.common.MaximizeConversions.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.common.MaximizeConversions.newBuilder()
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
      targetCpa_ = 0L;

      cpcBidCeilingMicros_ = 0L;

      cpcBidFloorMicros_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.common.BiddingProto.internal_static_google_ads_googleads_v9_common_MaximizeConversions_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.MaximizeConversions getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.common.MaximizeConversions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.MaximizeConversions build() {
      com.google.ads.googleads.v9.common.MaximizeConversions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.MaximizeConversions buildPartial() {
      com.google.ads.googleads.v9.common.MaximizeConversions result = new com.google.ads.googleads.v9.common.MaximizeConversions(this);
      result.targetCpa_ = targetCpa_;
      result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
      result.cpcBidFloorMicros_ = cpcBidFloorMicros_;
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
      if (other instanceof com.google.ads.googleads.v9.common.MaximizeConversions) {
        return mergeFrom((com.google.ads.googleads.v9.common.MaximizeConversions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.common.MaximizeConversions other) {
      if (other == com.google.ads.googleads.v9.common.MaximizeConversions.getDefaultInstance()) return this;
      if (other.getTargetCpa() != 0L) {
        setTargetCpa(other.getTargetCpa());
      }
      if (other.getCpcBidCeilingMicros() != 0L) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
      }
      if (other.getCpcBidFloorMicros() != 0L) {
        setCpcBidFloorMicros(other.getCpcBidFloorMicros());
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
      com.google.ads.googleads.v9.common.MaximizeConversions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.common.MaximizeConversions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long targetCpa_ ;
    /**
     * <pre>
     * The target cost-per-action (CPA) option. This is the average amount that
     * you would like to spend per conversion action. If set, the bid strategy
     * will get as many conversions as possible at or below the target
     * cost-per-action. If the target CPA is not set, the bid strategy will
     * aim to achieve the lowest possible CPA given the budget.
     * </pre>
     *
     * <code>int64 target_cpa = 1;</code>
     * @return The targetCpa.
     */
    @java.lang.Override
    public long getTargetCpa() {
      return targetCpa_;
    }
    /**
     * <pre>
     * The target cost-per-action (CPA) option. This is the average amount that
     * you would like to spend per conversion action. If set, the bid strategy
     * will get as many conversions as possible at or below the target
     * cost-per-action. If the target CPA is not set, the bid strategy will
     * aim to achieve the lowest possible CPA given the budget.
     * </pre>
     *
     * <code>int64 target_cpa = 1;</code>
     * @param value The targetCpa to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCpa(long value) {
      
      targetCpa_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target cost-per-action (CPA) option. This is the average amount that
     * you would like to spend per conversion action. If set, the bid strategy
     * will get as many conversions as possible at or below the target
     * cost-per-action. If the target CPA is not set, the bid strategy will
     * aim to achieve the lowest possible CPA given the budget.
     * </pre>
     *
     * <code>int64 target_cpa = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetCpa() {
      
      targetCpa_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 2;</code>
     * @return The cpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getCpcBidCeilingMicros() {
      return cpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 2;</code>
     * @param value The cpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidCeilingMicros(long value) {
      
      cpcBidCeilingMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      
      cpcBidCeilingMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidFloorMicros_ ;
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 3;</code>
     * @return The cpcBidFloorMicros.
     */
    @java.lang.Override
    public long getCpcBidFloorMicros() {
      return cpcBidFloorMicros_;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 3;</code>
     * @param value The cpcBidFloorMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidFloorMicros(long value) {
      
      cpcBidFloorMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidFloorMicros() {
      
      cpcBidFloorMicros_ = 0L;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.common.MaximizeConversions)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.common.MaximizeConversions)
  private static final com.google.ads.googleads.v9.common.MaximizeConversions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.common.MaximizeConversions();
  }

  public static com.google.ads.googleads.v9.common.MaximizeConversions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaximizeConversions>
      PARSER = new com.google.protobuf.AbstractParser<MaximizeConversions>() {
    @java.lang.Override
    public MaximizeConversions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MaximizeConversions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MaximizeConversions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaximizeConversions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.common.MaximizeConversions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

