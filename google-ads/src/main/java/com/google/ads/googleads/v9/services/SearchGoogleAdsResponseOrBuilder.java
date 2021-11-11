// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/google_ads_service.proto

package com.google.ads.googleads.v9.services;

public interface SearchGoogleAdsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.SearchGoogleAdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.GoogleAdsRow results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v9.services.GoogleAdsRow> 
      getResultsList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.GoogleAdsRow results = 1;</code>
   */
  com.google.ads.googleads.v9.services.GoogleAdsRow getResults(int index);
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.GoogleAdsRow results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.GoogleAdsRow results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.services.GoogleAdsRowOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.GoogleAdsRow results = 1;</code>
   */
  com.google.ads.googleads.v9.services.GoogleAdsRowOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Total number of results that match the query ignoring the LIMIT
   * clause.
   * </pre>
   *
   * <code>int64 total_results_count = 3;</code>
   * @return The totalResultsCount.
   */
  long getTotalResultsCount();

  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5;</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5;</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.GoogleAdsRow summary_row = 6;</code>
   * @return Whether the summaryRow field is set.
   */
  boolean hasSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.GoogleAdsRow summary_row = 6;</code>
   * @return The summaryRow.
   */
  com.google.ads.googleads.v9.services.GoogleAdsRow getSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.GoogleAdsRow summary_row = 6;</code>
   */
  com.google.ads.googleads.v9.services.GoogleAdsRowOrBuilder getSummaryRowOrBuilder();
}
