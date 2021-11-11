// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/keyword_plan_common.proto

package com.google.ads.googleads.v9.common;

public interface KeywordPlanAggregateMetricResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.KeywordPlanAggregateMetricResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The aggregate searches for all the keywords segmented by device
   * for the specified time.
   * Supports the following device types: MOBILE, TABLET, DESKTOP.
   * This is only set when KeywordPlanAggregateMetricTypeEnum.DEVICE is set
   * in the KeywordPlanAggregateMetrics field in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.KeywordPlanDeviceSearches device_searches = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v9.common.KeywordPlanDeviceSearches> 
      getDeviceSearchesList();
  /**
   * <pre>
   * The aggregate searches for all the keywords segmented by device
   * for the specified time.
   * Supports the following device types: MOBILE, TABLET, DESKTOP.
   * This is only set when KeywordPlanAggregateMetricTypeEnum.DEVICE is set
   * in the KeywordPlanAggregateMetrics field in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.KeywordPlanDeviceSearches device_searches = 1;</code>
   */
  com.google.ads.googleads.v9.common.KeywordPlanDeviceSearches getDeviceSearches(int index);
  /**
   * <pre>
   * The aggregate searches for all the keywords segmented by device
   * for the specified time.
   * Supports the following device types: MOBILE, TABLET, DESKTOP.
   * This is only set when KeywordPlanAggregateMetricTypeEnum.DEVICE is set
   * in the KeywordPlanAggregateMetrics field in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.KeywordPlanDeviceSearches device_searches = 1;</code>
   */
  int getDeviceSearchesCount();
  /**
   * <pre>
   * The aggregate searches for all the keywords segmented by device
   * for the specified time.
   * Supports the following device types: MOBILE, TABLET, DESKTOP.
   * This is only set when KeywordPlanAggregateMetricTypeEnum.DEVICE is set
   * in the KeywordPlanAggregateMetrics field in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.KeywordPlanDeviceSearches device_searches = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.common.KeywordPlanDeviceSearchesOrBuilder> 
      getDeviceSearchesOrBuilderList();
  /**
   * <pre>
   * The aggregate searches for all the keywords segmented by device
   * for the specified time.
   * Supports the following device types: MOBILE, TABLET, DESKTOP.
   * This is only set when KeywordPlanAggregateMetricTypeEnum.DEVICE is set
   * in the KeywordPlanAggregateMetrics field in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.common.KeywordPlanDeviceSearches device_searches = 1;</code>
   */
  com.google.ads.googleads.v9.common.KeywordPlanDeviceSearchesOrBuilder getDeviceSearchesOrBuilder(
      int index);
}
