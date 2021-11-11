// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/simulation.proto

package com.google.ads.googleads.v9.common;

public interface CpvBidSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.CpvBidSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated CPV bid upon which projected metrics are based.
   * </pre>
   *
   * <code>optional int64 cpv_bid_micros = 5;</code>
   * @return Whether the cpvBidMicros field is set.
   */
  boolean hasCpvBidMicros();
  /**
   * <pre>
   * The simulated CPV bid upon which projected metrics are based.
   * </pre>
   *
   * <code>optional int64 cpv_bid_micros = 5;</code>
   * @return The cpvBidMicros.
   */
  long getCpvBidMicros();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 6;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 6;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 7;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 7;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of views.
   * </pre>
   *
   * <code>optional int64 views = 8;</code>
   * @return Whether the views field is set.
   */
  boolean hasViews();
  /**
   * <pre>
   * Projected number of views.
   * </pre>
   *
   * <code>optional int64 views = 8;</code>
   * @return The views.
   */
  long getViews();
}
