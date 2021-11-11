// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/combined_audience.proto

package com.google.ads.googleads.v9.resources;

public interface CombinedAudienceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.CombinedAudience)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the combined audience.
   * Combined audience names have the form:
   * `customers/{customer_id}/combinedAudience/{combined_audience_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the combined audience.
   * Combined audience names have the form:
   * `customers/{customer_id}/combinedAudience/{combined_audience_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of the combined audience.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Status of this combined audience. Indicates whether the combined audience
   * is enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CombinedAudienceStatusEnum.CombinedAudienceStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of this combined audience. Indicates whether the combined audience
   * is enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CombinedAudienceStatusEnum.CombinedAudienceStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v9.enums.CombinedAudienceStatusEnum.CombinedAudienceStatus getStatus();

  /**
   * <pre>
   * Output only. Name of the combined audience. It should be unique across all combined
   * audiences.
   * </pre>
   *
   * <code>string name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Name of the combined audience. It should be unique across all combined
   * audiences.
   * </pre>
   *
   * <code>string name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Description of this combined audience.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Output only. Description of this combined audience.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
