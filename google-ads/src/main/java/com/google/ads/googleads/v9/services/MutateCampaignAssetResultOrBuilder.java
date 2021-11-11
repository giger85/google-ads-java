// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/campaign_asset_service.proto

package com.google.ads.googleads.v9.services;

public interface MutateCampaignAssetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.MutateCampaignAssetResult)
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
   * The mutated campaign asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CampaignAsset campaign_asset = 2;</code>
   * @return Whether the campaignAsset field is set.
   */
  boolean hasCampaignAsset();
  /**
   * <pre>
   * The mutated campaign asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CampaignAsset campaign_asset = 2;</code>
   * @return The campaignAsset.
   */
  com.google.ads.googleads.v9.resources.CampaignAsset getCampaignAsset();
  /**
   * <pre>
   * The mutated campaign asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.CampaignAsset campaign_asset = 2;</code>
   */
  com.google.ads.googleads.v9.resources.CampaignAssetOrBuilder getCampaignAssetOrBuilder();
}
