// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/feed_item.proto

package com.google.ads.googleads.v9.resources;

public interface FeedItemPlaceholderPolicyInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.FeedItemPlaceholderPolicyInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The placeholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type_enum = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for placeholderTypeEnum.
   */
  int getPlaceholderTypeEnumValue();
  /**
   * <pre>
   * Output only. The placeholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type_enum = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placeholderTypeEnum.
   */
  com.google.ads.googleads.v9.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderTypeEnum();

  /**
   * <pre>
   * Output only. The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>optional string feed_mapping_resource_name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the feedMappingResourceName field is set.
   */
  boolean hasFeedMappingResourceName();
  /**
   * <pre>
   * Output only. The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>optional string feed_mapping_resource_name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The feedMappingResourceName.
   */
  java.lang.String getFeedMappingResourceName();
  /**
   * <pre>
   * Output only. The FeedMapping that contains the placeholder type.
   * </pre>
   *
   * <code>optional string feed_mapping_resource_name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for feedMappingResourceName.
   */
  com.google.protobuf.ByteString
      getFeedMappingResourceNameBytes();

  /**
   * <pre>
   * Output only. Where the placeholder type is in the review process.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for reviewStatus.
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Output only. Where the placeholder type is in the review process.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reviewStatus.
   */
  com.google.ads.googleads.v9.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * Output only. The overall approval status of the placeholder type, calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvalStatus.
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * Output only. The overall approval status of the placeholder type, calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvalStatus.
   */
  com.google.ads.googleads.v9.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();

  /**
   * <pre>
   * Output only. The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.PolicyTopicEntry policy_topic_entries = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v9.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * Output only. The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.PolicyTopicEntry policy_topic_entries = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v9.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * Output only. The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.PolicyTopicEntry policy_topic_entries = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * Output only. The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.PolicyTopicEntry policy_topic_entries = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * Output only. The list of policy findings for the placeholder type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.PolicyTopicEntry policy_topic_entries = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v9.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The validation status of the palceholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus validation_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for validationStatus.
   */
  int getValidationStatusValue();
  /**
   * <pre>
   * Output only. The validation status of the palceholder type.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus validation_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The validationStatus.
   */
  com.google.ads.googleads.v9.enums.FeedItemValidationStatusEnum.FeedItemValidationStatus getValidationStatus();

  /**
   * <pre>
   * Output only. List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.resources.FeedItemValidationError validation_errors = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v9.resources.FeedItemValidationError> 
      getValidationErrorsList();
  /**
   * <pre>
   * Output only. List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.resources.FeedItemValidationError validation_errors = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v9.resources.FeedItemValidationError getValidationErrors(int index);
  /**
   * <pre>
   * Output only. List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.resources.FeedItemValidationError validation_errors = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getValidationErrorsCount();
  /**
   * <pre>
   * Output only. List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.resources.FeedItemValidationError validation_errors = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.resources.FeedItemValidationErrorOrBuilder> 
      getValidationErrorsOrBuilderList();
  /**
   * <pre>
   * Output only. List of placeholder type validation errors.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.resources.FeedItemValidationError validation_errors = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v9.resources.FeedItemValidationErrorOrBuilder getValidationErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Placeholder type quality evaluation approval status.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus quality_approval_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for qualityApprovalStatus.
   */
  int getQualityApprovalStatusValue();
  /**
   * <pre>
   * Output only. Placeholder type quality evaluation approval status.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus quality_approval_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The qualityApprovalStatus.
   */
  com.google.ads.googleads.v9.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatus getQualityApprovalStatus();

  /**
   * <pre>
   * Output only. List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the qualityDisapprovalReasons.
   */
  java.util.List<com.google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason> getQualityDisapprovalReasonsList();
  /**
   * <pre>
   * Output only. List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of qualityDisapprovalReasons.
   */
  int getQualityDisapprovalReasonsCount();
  /**
   * <pre>
   * Output only. List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The qualityDisapprovalReasons at the given index.
   */
  com.google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason getQualityDisapprovalReasons(int index);
  /**
   * <pre>
   * Output only. List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for qualityDisapprovalReasons.
   */
  java.util.List<java.lang.Integer>
  getQualityDisapprovalReasonsValueList();
  /**
   * <pre>
   * Output only. List of placeholder type quality evaluation disapproval reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason quality_disapproval_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of qualityDisapprovalReasons at the given index.
   */
  int getQualityDisapprovalReasonsValue(int index);
}
