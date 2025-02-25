// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/asset_types.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * One input field instance within a form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.LeadFormField}
 */
public final class LeadFormField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.LeadFormField)
    LeadFormFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormField.newBuilder() to construct.
  private LeadFormField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormField() {
    inputType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormField();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LeadFormField(
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

            inputType_ = rawValue;
            break;
          }
          case 18: {
            com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder subBuilder = null;
            if (answersCase_ == 2) {
              subBuilder = ((com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_).toBuilder();
            }
            answers_ =
                input.readMessage(com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_);
              answers_ = subBuilder.buildPartial();
            }
            answersCase_ = 2;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_LeadFormField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_LeadFormField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.LeadFormField.class, com.google.ads.googleads.v11.common.LeadFormField.Builder.class);
  }

  private int answersCase_ = 0;
  private java.lang.Object answers_;
  public enum AnswersCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SINGLE_CHOICE_ANSWERS(2),
    ANSWERS_NOT_SET(0);
    private final int value;
    private AnswersCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnswersCase valueOf(int value) {
      return forNumber(value);
    }

    public static AnswersCase forNumber(int value) {
      switch (value) {
        case 2: return SINGLE_CHOICE_ANSWERS;
        case 0: return ANSWERS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AnswersCase
  getAnswersCase() {
    return AnswersCase.forNumber(
        answersCase_);
  }

  public static final int INPUT_TYPE_FIELD_NUMBER = 1;
  private int inputType_;
  /**
   * <pre>
   * Describes the input type, which may be a predefined type such as
   * "full name" or a pre-vetted question like "Do you own a car?".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
   * @return The enum numeric value on the wire for inputType.
   */
  @java.lang.Override public int getInputTypeValue() {
    return inputType_;
  }
  /**
   * <pre>
   * Describes the input type, which may be a predefined type such as
   * "full name" or a pre-vetted question like "Do you own a car?".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
   * @return The inputType.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getInputType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType result = com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.valueOf(inputType_);
    return result == null ? com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNRECOGNIZED : result;
  }

  public static final int SINGLE_CHOICE_ANSWERS_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return Whether the singleChoiceAnswers field is set.
   */
  @java.lang.Override
  public boolean hasSingleChoiceAnswers() {
    return answersCase_ == 2;
  }
  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return The singleChoiceAnswers.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers getSingleChoiceAnswers() {
    if (answersCase_ == 2) {
       return (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_;
    }
    return com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
  }
  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswersOrBuilder getSingleChoiceAnswersOrBuilder() {
    if (answersCase_ == 2) {
       return (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_;
    }
    return com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
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
    if (inputType_ != com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, inputType_);
    }
    if (answersCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputType_ != com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, inputType_);
    }
    if (answersCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.LeadFormField)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.LeadFormField other = (com.google.ads.googleads.v11.common.LeadFormField) obj;

    if (inputType_ != other.inputType_) return false;
    if (!getAnswersCase().equals(other.getAnswersCase())) return false;
    switch (answersCase_) {
      case 2:
        if (!getSingleChoiceAnswers()
            .equals(other.getSingleChoiceAnswers())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + INPUT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + inputType_;
    switch (answersCase_) {
      case 2:
        hash = (37 * hash) + SINGLE_CHOICE_ANSWERS_FIELD_NUMBER;
        hash = (53 * hash) + getSingleChoiceAnswers().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.LeadFormField parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.LeadFormField prototype) {
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
   * One input field instance within a form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.LeadFormField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.LeadFormField)
      com.google.ads.googleads.v11.common.LeadFormFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_LeadFormField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_LeadFormField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.LeadFormField.class, com.google.ads.googleads.v11.common.LeadFormField.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.LeadFormField.newBuilder()
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
      inputType_ = 0;

      answersCase_ = 0;
      answers_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_LeadFormField_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.LeadFormField getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.LeadFormField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.LeadFormField build() {
      com.google.ads.googleads.v11.common.LeadFormField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.LeadFormField buildPartial() {
      com.google.ads.googleads.v11.common.LeadFormField result = new com.google.ads.googleads.v11.common.LeadFormField(this);
      result.inputType_ = inputType_;
      if (answersCase_ == 2) {
        if (singleChoiceAnswersBuilder_ == null) {
          result.answers_ = answers_;
        } else {
          result.answers_ = singleChoiceAnswersBuilder_.build();
        }
      }
      result.answersCase_ = answersCase_;
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
      if (other instanceof com.google.ads.googleads.v11.common.LeadFormField) {
        return mergeFrom((com.google.ads.googleads.v11.common.LeadFormField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.LeadFormField other) {
      if (other == com.google.ads.googleads.v11.common.LeadFormField.getDefaultInstance()) return this;
      if (other.inputType_ != 0) {
        setInputTypeValue(other.getInputTypeValue());
      }
      switch (other.getAnswersCase()) {
        case SINGLE_CHOICE_ANSWERS: {
          mergeSingleChoiceAnswers(other.getSingleChoiceAnswers());
          break;
        }
        case ANSWERS_NOT_SET: {
          break;
        }
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
      com.google.ads.googleads.v11.common.LeadFormField parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.LeadFormField) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int answersCase_ = 0;
    private java.lang.Object answers_;
    public AnswersCase
        getAnswersCase() {
      return AnswersCase.forNumber(
          answersCase_);
    }

    public Builder clearAnswers() {
      answersCase_ = 0;
      answers_ = null;
      onChanged();
      return this;
    }


    private int inputType_ = 0;
    /**
     * <pre>
     * Describes the input type, which may be a predefined type such as
     * "full name" or a pre-vetted question like "Do you own a car?".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
     * @return The enum numeric value on the wire for inputType.
     */
    @java.lang.Override public int getInputTypeValue() {
      return inputType_;
    }
    /**
     * <pre>
     * Describes the input type, which may be a predefined type such as
     * "full name" or a pre-vetted question like "Do you own a car?".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
     * @param value The enum numeric value on the wire for inputType to set.
     * @return This builder for chaining.
     */
    public Builder setInputTypeValue(int value) {
      
      inputType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the input type, which may be a predefined type such as
     * "full name" or a pre-vetted question like "Do you own a car?".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
     * @return The inputType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getInputType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType result = com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.valueOf(inputType_);
      return result == null ? com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Describes the input type, which may be a predefined type such as
     * "full name" or a pre-vetted question like "Do you own a car?".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
     * @param value The inputType to set.
     * @return This builder for chaining.
     */
    public Builder setInputType(com.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      inputType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the input type, which may be a predefined type such as
     * "full name" or a pre-vetted question like "Do you own a car?".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputType() {
      
      inputType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswersOrBuilder> singleChoiceAnswersBuilder_;
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     * @return Whether the singleChoiceAnswers field is set.
     */
    @java.lang.Override
    public boolean hasSingleChoiceAnswers() {
      return answersCase_ == 2;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     * @return The singleChoiceAnswers.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers getSingleChoiceAnswers() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2) {
          return (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_;
        }
        return com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      } else {
        if (answersCase_ == 2) {
          return singleChoiceAnswersBuilder_.getMessage();
        }
        return com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder setSingleChoiceAnswers(com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers value) {
      if (singleChoiceAnswersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        answers_ = value;
        onChanged();
      } else {
        singleChoiceAnswersBuilder_.setMessage(value);
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder setSingleChoiceAnswers(
        com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder builderForValue) {
      if (singleChoiceAnswersBuilder_ == null) {
        answers_ = builderForValue.build();
        onChanged();
      } else {
        singleChoiceAnswersBuilder_.setMessage(builderForValue.build());
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder mergeSingleChoiceAnswers(com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers value) {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2 &&
            answers_ != com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance()) {
          answers_ = com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.newBuilder((com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_)
              .mergeFrom(value).buildPartial();
        } else {
          answers_ = value;
        }
        onChanged();
      } else {
        if (answersCase_ == 2) {
          singleChoiceAnswersBuilder_.mergeFrom(value);
        } else {
          singleChoiceAnswersBuilder_.setMessage(value);
        }
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder clearSingleChoiceAnswers() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2) {
          answersCase_ = 0;
          answers_ = null;
          onChanged();
        }
      } else {
        if (answersCase_ == 2) {
          answersCase_ = 0;
          answers_ = null;
        }
        singleChoiceAnswersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder getSingleChoiceAnswersBuilder() {
      return getSingleChoiceAnswersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswersOrBuilder getSingleChoiceAnswersOrBuilder() {
      if ((answersCase_ == 2) && (singleChoiceAnswersBuilder_ != null)) {
        return singleChoiceAnswersBuilder_.getMessageOrBuilder();
      } else {
        if (answersCase_ == 2) {
          return (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_;
        }
        return com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Answer configuration for a single choice question. Can be set only for
     * pre-vetted question fields. Minimum of 2 answers required and maximum of
     * 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswersOrBuilder> 
        getSingleChoiceAnswersFieldBuilder() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (!(answersCase_ == 2)) {
          answers_ = com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
        }
        singleChoiceAnswersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswersOrBuilder>(
                (com.google.ads.googleads.v11.common.LeadFormSingleChoiceAnswers) answers_,
                getParentForChildren(),
                isClean());
        answers_ = null;
      }
      answersCase_ = 2;
      onChanged();;
      return singleChoiceAnswersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.LeadFormField)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.LeadFormField)
  private static final com.google.ads.googleads.v11.common.LeadFormField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.LeadFormField();
  }

  public static com.google.ads.googleads.v11.common.LeadFormField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormField>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormField>() {
    @java.lang.Override
    public LeadFormField parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LeadFormField(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeadFormField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.LeadFormField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

