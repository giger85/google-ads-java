// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/keyword_plan_ad_group_service.proto

package com.google.ads.googleads.v9.services;

public interface KeywordPlanAdGroupOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.KeywordPlanAdGroupOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v9.resources.KeywordPlanAdGroup getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new Keyword Plan
   * ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup create = 1;</code>
   */
  com.google.ads.googleads.v9.resources.KeywordPlanAdGroupOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The Keyword Plan ad group is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan ad group is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v9.resources.KeywordPlanAdGroup getUpdate();
  /**
   * <pre>
   * Update operation: The Keyword Plan ad group is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.KeywordPlanAdGroup update = 2;</code>
   */
  com.google.ads.googleads.v9.resources.KeywordPlanAdGroupOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan ad group
   * is expected, in this format:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan ad group
   * is expected, in this format:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed Keyword Plan ad group
   * is expected, in this format:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v9.services.KeywordPlanAdGroupOperation.OperationCase getOperationCase();
}
