// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/criteria.proto

package com.google.ads.googleads.v9.common;

public interface GeoPointInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.GeoPointInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>optional int32 longitude_in_micro_degrees = 3;</code>
   * @return Whether the longitudeInMicroDegrees field is set.
   */
  boolean hasLongitudeInMicroDegrees();
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>optional int32 longitude_in_micro_degrees = 3;</code>
   * @return The longitudeInMicroDegrees.
   */
  int getLongitudeInMicroDegrees();

  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>optional int32 latitude_in_micro_degrees = 4;</code>
   * @return Whether the latitudeInMicroDegrees field is set.
   */
  boolean hasLatitudeInMicroDegrees();
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>optional int32 latitude_in_micro_degrees = 4;</code>
   * @return The latitudeInMicroDegrees.
   */
  int getLatitudeInMicroDegrees();
}
