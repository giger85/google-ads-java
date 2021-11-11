// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/ad_type_infos.proto

package com.google.ads.googleads.v9.common;

public interface GmailTeaserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.GmailTeaser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>optional string headline = 5;</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>optional string headline = 5;</code>
   * @return The headline.
   */
  java.lang.String getHeadline();
  /**
   * <pre>
   * Headline of the teaser.
   * </pre>
   *
   * <code>optional string headline = 5;</code>
   * @return The bytes for headline.
   */
  com.google.protobuf.ByteString
      getHeadlineBytes();

  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>optional string description = 6;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>optional string description = 6;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the teaser.
   * </pre>
   *
   * <code>optional string description = 6;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * Business name of the advertiser.
   * </pre>
   *
   * <code>optional string business_name = 7;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string logo_image = 8;</code>
   * @return Whether the logoImage field is set.
   */
  boolean hasLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string logo_image = 8;</code>
   * @return The logoImage.
   */
  java.lang.String getLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 144x144 pixels and the aspect ratio must
   * be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string logo_image = 8;</code>
   * @return The bytes for logoImage.
   */
  com.google.protobuf.ByteString
      getLogoImageBytes();
}
