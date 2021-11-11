// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/bidding_data_exclusion_service.proto

package com.google.ads.googleads.v9.services;

public interface MutateBiddingDataExclusionsResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.MutateBiddingDataExclusionsResult)
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
   * The mutated bidding data exclusion with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.BiddingDataExclusion bidding_data_exclusion = 2;</code>
   * @return Whether the biddingDataExclusion field is set.
   */
  boolean hasBiddingDataExclusion();
  /**
   * <pre>
   * The mutated bidding data exclusion with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.BiddingDataExclusion bidding_data_exclusion = 2;</code>
   * @return The biddingDataExclusion.
   */
  com.google.ads.googleads.v9.resources.BiddingDataExclusion getBiddingDataExclusion();
  /**
   * <pre>
   * The mutated bidding data exclusion with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.BiddingDataExclusion bidding_data_exclusion = 2;</code>
   */
  com.google.ads.googleads.v9.resources.BiddingDataExclusionOrBuilder getBiddingDataExclusionOrBuilder();
}
