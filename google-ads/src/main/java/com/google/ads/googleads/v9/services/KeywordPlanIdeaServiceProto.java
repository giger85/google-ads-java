// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v9.services;

public final class KeywordPlanIdeaServiceProto {
  private KeywordPlanIdeaServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeasRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_KeywordAndUrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_KeywordAndUrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_KeywordSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_SiteSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_SiteSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_UrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_UrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v9/services/keywo" +
      "rd_plan_idea_service.proto\022 google.ads.g" +
      "oogleads.v9.services\0328google/ads/googlea" +
      "ds/v9/common/keyword_plan_common.proto\032C" +
      "google/ads/googleads/v9/enums/keyword_pl" +
      "an_keyword_annotation.proto\0328google/ads/" +
      "googleads/v9/enums/keyword_plan_network." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\"\367\006\n\033GenerateKeyword" +
      "IdeasRequest\022\023\n\013customer_id\030\001 \001(\t\022\025\n\010lan" +
      "guage\030\016 \001(\tH\001\210\001\001\022\034\n\024geo_target_constants" +
      "\030\017 \003(\t\022\036\n\026include_adult_keywords\030\n \001(\010\022\022" +
      "\n\npage_token\030\014 \001(\t\022\021\n\tpage_size\030\r \001(\005\022f\n" +
      "\024keyword_plan_network\030\t \001(\0162H.google.ads" +
      ".googleads.v9.enums.KeywordPlanNetworkEn" +
      "um.KeywordPlanNetwork\022x\n\022keyword_annotat" +
      "ion\030\021 \003(\0162\\.google.ads.googleads.v9.enum" +
      "s.KeywordPlanKeywordAnnotationEnum.Keywo" +
      "rdPlanKeywordAnnotation\022V\n\021aggregate_met" +
      "rics\030\020 \001(\0132;.google.ads.googleads.v9.com" +
      "mon.KeywordPlanAggregateMetrics\022\\\n\032histo" +
      "rical_metrics_options\030\022 \001(\01328.google.ads" +
      ".googleads.v9.common.HistoricalMetricsOp" +
      "tions\022S\n\024keyword_and_url_seed\030\002 \001(\01323.go" +
      "ogle.ads.googleads.v9.services.KeywordAn" +
      "dUrlSeedH\000\022E\n\014keyword_seed\030\003 \001(\0132-.googl" +
      "e.ads.googleads.v9.services.KeywordSeedH" +
      "\000\022=\n\010url_seed\030\005 \001(\0132).google.ads.googlea" +
      "ds.v9.services.UrlSeedH\000\022?\n\tsite_seed\030\013 " +
      "\001(\0132*.google.ads.googleads.v9.services.S" +
      "iteSeedH\000B\006\n\004seedB\013\n\t_language\"?\n\021Keywor" +
      "dAndUrlSeed\022\020\n\003url\030\003 \001(\tH\000\210\001\001\022\020\n\010keyword" +
      "s\030\004 \003(\tB\006\n\004_url\"\037\n\013KeywordSeed\022\020\n\010keywor" +
      "ds\030\002 \003(\t\"&\n\010SiteSeed\022\021\n\004site\030\002 \001(\tH\000\210\001\001B" +
      "\007\n\005_site\"#\n\007UrlSeed\022\020\n\003url\030\002 \001(\tH\000\210\001\001B\006\n" +
      "\004_url\"\375\001\n\033GenerateKeywordIdeaResponse\022L\n" +
      "\007results\030\001 \003(\0132;.google.ads.googleads.v9" +
      ".services.GenerateKeywordIdeaResult\022c\n\030a" +
      "ggregate_metric_results\030\004 \001(\0132A.google.a" +
      "ds.googleads.v9.common.KeywordPlanAggreg" +
      "ateMetricResults\022\027\n\017next_page_token\030\002 \001(" +
      "\t\022\022\n\ntotal_size\030\003 \001(\003\"\344\001\n\031GenerateKeywor" +
      "dIdeaResult\022\021\n\004text\030\005 \001(\tH\000\210\001\001\022Z\n\024keywor" +
      "d_idea_metrics\030\003 \001(\0132<.google.ads.google" +
      "ads.v9.common.KeywordPlanHistoricalMetri" +
      "cs\022O\n\023keyword_annotations\030\006 \001(\01322.google" +
      ".ads.googleads.v9.common.KeywordAnnotati" +
      "onsB\007\n\005_text2\265\002\n\026KeywordPlanIdeaService\022" +
      "\323\001\n\024GenerateKeywordIdeas\022=.google.ads.go" +
      "ogleads.v9.services.GenerateKeywordIdeas" +
      "Request\032=.google.ads.googleads.v9.servic" +
      "es.GenerateKeywordIdeaResponse\"=\202\323\344\223\0027\"2" +
      "/v9/customers/{customer_id=*}:generateKe" +
      "ywordIdeas:\001*\032E\312A\030googleads.googleapis.c" +
      "om\322A\'https://www.googleapis.com/auth/adw" +
      "ordsB\202\002\n$com.google.ads.googleads.v9.ser" +
      "vicesB\033KeywordPlanIdeaServiceProtoP\001ZHgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v9/services;services\242\002\003GAA\252\002 G" +
      "oogle.Ads.GoogleAds.V9.Services\312\002 Google" +
      "\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads" +
      "::GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.KeywordPlanCommonProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.KeywordPlanKeywordAnnotationProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeasRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeasRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Language", "GeoTargetConstants", "IncludeAdultKeywords", "PageToken", "PageSize", "KeywordPlanNetwork", "KeywordAnnotation", "AggregateMetrics", "HistoricalMetricsOptions", "KeywordAndUrlSeed", "KeywordSeed", "UrlSeed", "SiteSeed", "Seed", "Language", });
    internal_static_google_ads_googleads_v9_services_KeywordAndUrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_KeywordAndUrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_KeywordAndUrlSeed_descriptor,
        new java.lang.String[] { "Url", "Keywords", "Url", });
    internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_KeywordSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor,
        new java.lang.String[] { "Keywords", });
    internal_static_google_ads_googleads_v9_services_SiteSeed_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_SiteSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_SiteSeed_descriptor,
        new java.lang.String[] { "Site", "Site", });
    internal_static_google_ads_googleads_v9_services_UrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_UrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_UrlSeed_descriptor,
        new java.lang.String[] { "Url", "Url", });
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResponse_descriptor,
        new java.lang.String[] { "Results", "AggregateMetricResults", "NextPageToken", "TotalSize", });
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GenerateKeywordIdeaResult_descriptor,
        new java.lang.String[] { "Text", "KeywordIdeaMetrics", "KeywordAnnotations", "Text", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.KeywordPlanCommonProto.getDescriptor();
    com.google.ads.googleads.v9.enums.KeywordPlanKeywordAnnotationProto.getDescriptor();
    com.google.ads.googleads.v9.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
