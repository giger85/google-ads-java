// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/change_event_error.proto

package com.google.ads.googleads.v9.errors;

public final class ChangeEventErrorProto {
  private ChangeEventErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_errors_ChangeEventErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_errors_ChangeEventErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v9/errors/change_" +
      "event_error.proto\022\036google.ads.googleads." +
      "v9.errors\032\034google/api/annotations.proto\"" +
      "\324\001\n\024ChangeEventErrorEnum\"\273\001\n\020ChangeEvent" +
      "Error\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022S" +
      "TART_DATE_TOO_OLD\020\002\022\036\n\032CHANGE_DATE_RANGE" +
      "_INFINITE\020\003\022\036\n\032CHANGE_DATE_RANGE_NEGATIV" +
      "E\020\004\022\027\n\023LIMIT_NOT_SPECIFIED\020\005\022\030\n\024INVALID_" +
      "LIMIT_CLAUSE\020\006B\360\001\n\"com.google.ads.google" +
      "ads.v9.errorsB\025ChangeEventErrorProtoP\001ZD" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v9/errors;errors\242\002\003GAA\252\002\036Goo" +
      "gle.Ads.GoogleAds.V9.Errors\312\002\036Google\\Ads" +
      "\\GoogleAds\\V9\\Errors\352\002\"Google::Ads::Goog" +
      "leAds::V9::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_errors_ChangeEventErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_errors_ChangeEventErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_errors_ChangeEventErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
