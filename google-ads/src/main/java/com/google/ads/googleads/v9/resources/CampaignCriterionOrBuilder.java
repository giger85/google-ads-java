// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/campaign_criterion.proto

package com.google.ads.googleads.v9.resources;

public interface CampaignCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.CampaignCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign criterion.
   * Campaign criterion resource names have the form:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign criterion.
   * Campaign criterion resource names have the form:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>optional string campaign = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>optional string campaign = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>optional string campaign = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. The ID of the criterion.
   * This field is ignored during mutate.
   * </pre>
   *
   * <code>optional int64 criterion_id = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the criterionId field is set.
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   * This field is ignored during mutate.
   * </pre>
   *
   * <code>optional int64 criterion_id = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The criterionId.
   */
  long getCriterionId();

  /**
   * <pre>
   * Output only. The display name of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>string display_name = 43 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. The display name of the criterion.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>string display_name = 43 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The modifier for the bids when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>optional float bid_modifier = 39;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bids when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>optional float bid_modifier = 39;</code>
   * @return The bidModifier.
   */
  float getBidModifier();

  /**
   * <pre>
   * Immutable. Whether to target (`false`) or exclude (`true`) the criterion.
   * </pre>
   *
   * <code>optional bool negative = 40 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the negative field is set.
   */
  boolean hasNegative();
  /**
   * <pre>
   * Immutable. Whether to target (`false`) or exclude (`true`) the criterion.
   * </pre>
   *
   * <code>optional bool negative = 40 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The negative.
   */
  boolean getNegative();

  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CriterionTypeEnum.CriterionType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CriterionTypeEnum.CriterionType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v9.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * The status of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus status = 35;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus status = 35;</code>
   * @return The status.
   */
  com.google.ads.googleads.v9.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus getStatus();

  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordInfo keyword = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordInfo keyword = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v9.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordInfo keyword = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.PlacementInfo placement = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.PlacementInfo placement = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The placement.
   */
  com.google.ads.googleads.v9.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.PlacementInfo placement = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileAppCategoryInfo mobile_app_category = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileAppCategory field is set.
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileAppCategoryInfo mobile_app_category = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileAppCategory.
   */
  com.google.ads.googleads.v9.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileAppCategoryInfo mobile_app_category = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileApplicationInfo mobile_application = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileApplication field is set.
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileApplicationInfo mobile_application = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileApplication.
   */
  com.google.ads.googleads.v9.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileApplicationInfo mobile_application = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  /**
   * <pre>
   * Immutable. Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationInfo location = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * Immutable. Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationInfo location = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The location.
   */
  com.google.ads.googleads.v9.common.LocationInfo getLocation();
  /**
   * <pre>
   * Immutable. Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationInfo location = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.LocationInfoOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Immutable. Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DeviceInfo device = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <pre>
   * Immutable. Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DeviceInfo device = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The device.
   */
  com.google.ads.googleads.v9.common.DeviceInfo getDevice();
  /**
   * <pre>
   * Immutable. Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DeviceInfo device = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.DeviceInfoOrBuilder getDeviceOrBuilder();

  /**
   * <pre>
   * Immutable. Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AdScheduleInfo ad_schedule = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the adSchedule field is set.
   */
  boolean hasAdSchedule();
  /**
   * <pre>
   * Immutable. Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AdScheduleInfo ad_schedule = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The adSchedule.
   */
  com.google.ads.googleads.v9.common.AdScheduleInfo getAdSchedule();
  /**
   * <pre>
   * Immutable. Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AdScheduleInfo ad_schedule = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.AdScheduleInfoOrBuilder getAdScheduleOrBuilder();

  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AgeRangeInfo age_range = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the ageRange field is set.
   */
  boolean hasAgeRange();
  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AgeRangeInfo age_range = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The ageRange.
   */
  com.google.ads.googleads.v9.common.AgeRangeInfo getAgeRange();
  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.AgeRangeInfo age_range = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.AgeRangeInfoOrBuilder getAgeRangeOrBuilder();

  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.GenderInfo gender = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.GenderInfo gender = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The gender.
   */
  com.google.ads.googleads.v9.common.GenderInfo getGender();
  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.GenderInfo gender = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Immutable. Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IncomeRangeInfo income_range = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the incomeRange field is set.
   */
  boolean hasIncomeRange();
  /**
   * <pre>
   * Immutable. Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IncomeRangeInfo income_range = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The incomeRange.
   */
  com.google.ads.googleads.v9.common.IncomeRangeInfo getIncomeRange();
  /**
   * <pre>
   * Immutable. Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IncomeRangeInfo income_range = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.IncomeRangeInfoOrBuilder getIncomeRangeOrBuilder();

  /**
   * <pre>
   * Immutable. Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ParentalStatusInfo parental_status = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the parentalStatus field is set.
   */
  boolean hasParentalStatus();
  /**
   * <pre>
   * Immutable. Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ParentalStatusInfo parental_status = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The parentalStatus.
   */
  com.google.ads.googleads.v9.common.ParentalStatusInfo getParentalStatus();
  /**
   * <pre>
   * Immutable. Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ParentalStatusInfo parental_status = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.ParentalStatusInfoOrBuilder getParentalStatusOrBuilder();

  /**
   * <pre>
   * Immutable. User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserListInfo user_list = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the userList field is set.
   */
  boolean hasUserList();
  /**
   * <pre>
   * Immutable. User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserListInfo user_list = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The userList.
   */
  com.google.ads.googleads.v9.common.UserListInfo getUserList();
  /**
   * <pre>
   * Immutable. User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserListInfo user_list = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.UserListInfoOrBuilder getUserListOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeVideoInfo youtube_video = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideo field is set.
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeVideoInfo youtube_video = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideo.
   */
  com.google.ads.googleads.v9.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeVideoInfo youtube_video = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeChannelInfo youtube_channel = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeChannel field is set.
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeChannelInfo youtube_channel = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeChannel.
   */
  com.google.ads.googleads.v9.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.YouTubeChannelInfo youtube_channel = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Immutable. Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ProximityInfo proximity = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proximity field is set.
   */
  boolean hasProximity();
  /**
   * <pre>
   * Immutable. Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ProximityInfo proximity = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proximity.
   */
  com.google.ads.googleads.v9.common.ProximityInfo getProximity();
  /**
   * <pre>
   * Immutable. Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ProximityInfo proximity = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.ProximityInfoOrBuilder getProximityOrBuilder();

  /**
   * <pre>
   * Immutable. Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.TopicInfo topic = 24 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <pre>
   * Immutable. Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.TopicInfo topic = 24 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The topic.
   */
  com.google.ads.googleads.v9.common.TopicInfo getTopic();
  /**
   * <pre>
   * Immutable. Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.TopicInfo topic = 24 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.TopicInfoOrBuilder getTopicOrBuilder();

  /**
   * <pre>
   * Immutable. Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ListingScopeInfo listing_scope = 25 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the listingScope field is set.
   */
  boolean hasListingScope();
  /**
   * <pre>
   * Immutable. Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ListingScopeInfo listing_scope = 25 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The listingScope.
   */
  com.google.ads.googleads.v9.common.ListingScopeInfo getListingScope();
  /**
   * <pre>
   * Immutable. Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ListingScopeInfo listing_scope = 25 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.ListingScopeInfoOrBuilder getListingScopeOrBuilder();

  /**
   * <pre>
   * Immutable. Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LanguageInfo language = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Immutable. Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LanguageInfo language = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The language.
   */
  com.google.ads.googleads.v9.common.LanguageInfo getLanguage();
  /**
   * <pre>
   * Immutable. Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LanguageInfo language = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.LanguageInfoOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Immutable. IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IpBlockInfo ip_block = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the ipBlock field is set.
   */
  boolean hasIpBlock();
  /**
   * <pre>
   * Immutable. IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IpBlockInfo ip_block = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The ipBlock.
   */
  com.google.ads.googleads.v9.common.IpBlockInfo getIpBlock();
  /**
   * <pre>
   * Immutable. IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.IpBlockInfo ip_block = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.IpBlockInfoOrBuilder getIpBlockOrBuilder();

  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ContentLabelInfo content_label = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the contentLabel field is set.
   */
  boolean hasContentLabel();
  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ContentLabelInfo content_label = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The contentLabel.
   */
  com.google.ads.googleads.v9.common.ContentLabelInfo getContentLabel();
  /**
   * <pre>
   * Immutable. ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.ContentLabelInfo content_label = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.ContentLabelInfoOrBuilder getContentLabelOrBuilder();

  /**
   * <pre>
   * Immutable. Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CarrierInfo carrier = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the carrier field is set.
   */
  boolean hasCarrier();
  /**
   * <pre>
   * Immutable. Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CarrierInfo carrier = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The carrier.
   */
  com.google.ads.googleads.v9.common.CarrierInfo getCarrier();
  /**
   * <pre>
   * Immutable. Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CarrierInfo carrier = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.CarrierInfoOrBuilder getCarrierOrBuilder();

  /**
   * <pre>
   * Immutable. User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserInterestInfo user_interest = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the userInterest field is set.
   */
  boolean hasUserInterest();
  /**
   * <pre>
   * Immutable. User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserInterestInfo user_interest = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The userInterest.
   */
  com.google.ads.googleads.v9.common.UserInterestInfo getUserInterest();
  /**
   * <pre>
   * Immutable. User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.UserInterestInfo user_interest = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.UserInterestInfoOrBuilder getUserInterestOrBuilder();

  /**
   * <pre>
   * Immutable. Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.WebpageInfo webpage = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the webpage field is set.
   */
  boolean hasWebpage();
  /**
   * <pre>
   * Immutable. Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.WebpageInfo webpage = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The webpage.
   */
  com.google.ads.googleads.v9.common.WebpageInfo getWebpage();
  /**
   * <pre>
   * Immutable. Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.WebpageInfo webpage = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.WebpageInfoOrBuilder getWebpageOrBuilder();

  /**
   * <pre>
   * Immutable. Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.OperatingSystemVersionInfo operating_system_version = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the operatingSystemVersion field is set.
   */
  boolean hasOperatingSystemVersion();
  /**
   * <pre>
   * Immutable. Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.OperatingSystemVersionInfo operating_system_version = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The operatingSystemVersion.
   */
  com.google.ads.googleads.v9.common.OperatingSystemVersionInfo getOperatingSystemVersion();
  /**
   * <pre>
   * Immutable. Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.OperatingSystemVersionInfo operating_system_version = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.OperatingSystemVersionInfoOrBuilder getOperatingSystemVersionOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileDeviceInfo mobile_device = 33 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileDevice field is set.
   */
  boolean hasMobileDevice();
  /**
   * <pre>
   * Immutable. Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileDeviceInfo mobile_device = 33 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileDevice.
   */
  com.google.ads.googleads.v9.common.MobileDeviceInfo getMobileDevice();
  /**
   * <pre>
   * Immutable. Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.MobileDeviceInfo mobile_device = 33 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.MobileDeviceInfoOrBuilder getMobileDeviceOrBuilder();

  /**
   * <pre>
   * Immutable. Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationGroupInfo location_group = 34 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the locationGroup field is set.
   */
  boolean hasLocationGroup();
  /**
   * <pre>
   * Immutable. Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationGroupInfo location_group = 34 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The locationGroup.
   */
  com.google.ads.googleads.v9.common.LocationGroupInfo getLocationGroup();
  /**
   * <pre>
   * Immutable. Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.LocationGroupInfo location_group = 34 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.LocationGroupInfoOrBuilder getLocationGroupOrBuilder();

  /**
   * <pre>
   * Immutable. Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAffinityInfo custom_affinity = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the customAffinity field is set.
   */
  boolean hasCustomAffinity();
  /**
   * <pre>
   * Immutable. Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAffinityInfo custom_affinity = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The customAffinity.
   */
  com.google.ads.googleads.v9.common.CustomAffinityInfo getCustomAffinity();
  /**
   * <pre>
   * Immutable. Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAffinityInfo custom_affinity = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.CustomAffinityInfoOrBuilder getCustomAffinityOrBuilder();

  /**
   * <pre>
   * Immutable. Custom Audience
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAudienceInfo custom_audience = 41 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the customAudience field is set.
   */
  boolean hasCustomAudience();
  /**
   * <pre>
   * Immutable. Custom Audience
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAudienceInfo custom_audience = 41 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The customAudience.
   */
  com.google.ads.googleads.v9.common.CustomAudienceInfo getCustomAudience();
  /**
   * <pre>
   * Immutable. Custom Audience
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CustomAudienceInfo custom_audience = 41 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.CustomAudienceInfoOrBuilder getCustomAudienceOrBuilder();

  /**
   * <pre>
   * Immutable. Combined Audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CombinedAudienceInfo combined_audience = 42 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the combinedAudience field is set.
   */
  boolean hasCombinedAudience();
  /**
   * <pre>
   * Immutable. Combined Audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CombinedAudienceInfo combined_audience = 42 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The combinedAudience.
   */
  com.google.ads.googleads.v9.common.CombinedAudienceInfo getCombinedAudience();
  /**
   * <pre>
   * Immutable. Combined Audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.CombinedAudienceInfo combined_audience = 42 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.CombinedAudienceInfoOrBuilder getCombinedAudienceOrBuilder();

  /**
   * <pre>
   * Immutable. Smart Campaign Keyword Theme.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordThemeInfo keyword_theme = 45 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the keywordTheme field is set.
   */
  boolean hasKeywordTheme();
  /**
   * <pre>
   * Immutable. Smart Campaign Keyword Theme.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordThemeInfo keyword_theme = 45 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The keywordTheme.
   */
  com.google.ads.googleads.v9.common.KeywordThemeInfo getKeywordTheme();
  /**
   * <pre>
   * Immutable. Smart Campaign Keyword Theme.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.KeywordThemeInfo keyword_theme = 45 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v9.common.KeywordThemeInfoOrBuilder getKeywordThemeOrBuilder();

  public com.google.ads.googleads.v9.resources.CampaignCriterion.CriterionCase getCriterionCase();
}
