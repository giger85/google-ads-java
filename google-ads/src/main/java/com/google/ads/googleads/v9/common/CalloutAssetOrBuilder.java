// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/asset_types.proto

package com.google.ads.googleads.v9.common;

public interface CalloutAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.CalloutAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string callout_text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The calloutText.
   */
  java.lang.String getCalloutText();
  /**
   * <pre>
   * Required. The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string callout_text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for calloutText.
   */
  com.google.protobuf.ByteString
      getCalloutTextBytes();

  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 2;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 2;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 3;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 3;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.AdScheduleInfo ad_schedule_targets = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v9.common.AdScheduleInfo> 
      getAdScheduleTargetsList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.AdScheduleInfo ad_schedule_targets = 4;</code>
   */
  com.google.ads.googleads.v9.common.AdScheduleInfo getAdScheduleTargets(int index);
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.AdScheduleInfo ad_schedule_targets = 4;</code>
   */
  int getAdScheduleTargetsCount();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.AdScheduleInfo ad_schedule_targets = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.common.AdScheduleInfoOrBuilder> 
      getAdScheduleTargetsOrBuilderList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.AdScheduleInfo ad_schedule_targets = 4;</code>
   */
  com.google.ads.googleads.v9.common.AdScheduleInfoOrBuilder getAdScheduleTargetsOrBuilder(
      int index);
}
