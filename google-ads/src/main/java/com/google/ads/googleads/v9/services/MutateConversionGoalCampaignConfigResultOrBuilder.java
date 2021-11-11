// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/conversion_goal_campaign_config_service.proto

package com.google.ads.googleads.v9.services;

public interface MutateConversionGoalCampaignConfigResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.MutateConversionGoalCampaignConfigResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   * @return Whether the conversionGoalCampaignConfig field is set.
   */
  boolean hasConversionGoalCampaignConfig();
  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   * @return The conversionGoalCampaignConfig.
   */
  com.google.ads.googleads.v9.resources.ConversionGoalCampaignConfig getConversionGoalCampaignConfig();
  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   */
  com.google.ads.googleads.v9.resources.ConversionGoalCampaignConfigOrBuilder getConversionGoalCampaignConfigOrBuilder();
}
