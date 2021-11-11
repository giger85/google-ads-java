// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/asset_types.proto

package com.google.ads.googleads.v9.common;

public interface YoutubeVideoAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.YoutubeVideoAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return Whether the youtubeVideoId field is set.
   */
  boolean hasYoutubeVideoId();
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return The youtubeVideoId.
   */
  java.lang.String getYoutubeVideoId();
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return The bytes for youtubeVideoId.
   */
  com.google.protobuf.ByteString
      getYoutubeVideoIdBytes();

  /**
   * <pre>
   * YouTube video title.
   * </pre>
   *
   * <code>string youtube_video_title = 3;</code>
   * @return The youtubeVideoTitle.
   */
  java.lang.String getYoutubeVideoTitle();
  /**
   * <pre>
   * YouTube video title.
   * </pre>
   *
   * <code>string youtube_video_title = 3;</code>
   * @return The bytes for youtubeVideoTitle.
   */
  com.google.protobuf.ByteString
      getYoutubeVideoTitleBytes();
}
