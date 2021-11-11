// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/reach_plan_service.proto

package com.google.ads.googleads.v9.services;

public interface ListPlannableLocationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.ListPlannableLocationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries and DMAs see
   * https://developers.google.com/google-ads/api/reference/data/geotargets for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.PlannableLocation plannable_locations = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v9.services.PlannableLocation> 
      getPlannableLocationsList();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries and DMAs see
   * https://developers.google.com/google-ads/api/reference/data/geotargets for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.PlannableLocation plannable_locations = 1;</code>
   */
  com.google.ads.googleads.v9.services.PlannableLocation getPlannableLocations(int index);
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries and DMAs see
   * https://developers.google.com/google-ads/api/reference/data/geotargets for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.PlannableLocation plannable_locations = 1;</code>
   */
  int getPlannableLocationsCount();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries and DMAs see
   * https://developers.google.com/google-ads/api/reference/data/geotargets for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.PlannableLocation plannable_locations = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v9.services.PlannableLocationOrBuilder> 
      getPlannableLocationsOrBuilderList();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries and DMAs see
   * https://developers.google.com/google-ads/api/reference/data/geotargets for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.services.PlannableLocation plannable_locations = 1;</code>
   */
  com.google.ads.googleads.v9.services.PlannableLocationOrBuilder getPlannableLocationsOrBuilder(
      int index);
}
