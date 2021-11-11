// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/reach_plan_service.proto

package com.google.ads.googleads.v9.services;

public interface CampaignDurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.CampaignDuration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The duration value in days.
   * This field cannot be combined with the date_range field.
   * </pre>
   *
   * <code>optional int32 duration_in_days = 2;</code>
   * @return Whether the durationInDays field is set.
   */
  boolean hasDurationInDays();
  /**
   * <pre>
   * The duration value in days.
   * This field cannot be combined with the date_range field.
   * </pre>
   *
   * <code>optional int32 duration_in_days = 2;</code>
   * @return The durationInDays.
   */
  int getDurationInDays();

  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DateRange date_range = 3;</code>
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DateRange date_range = 3;</code>
   * @return The dateRange.
   */
  com.google.ads.googleads.v9.common.DateRange getDateRange();
  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.common.DateRange date_range = 3;</code>
   */
  com.google.ads.googleads.v9.common.DateRangeOrBuilder getDateRangeOrBuilder();
}
