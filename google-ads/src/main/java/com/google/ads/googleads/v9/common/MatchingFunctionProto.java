// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/matching_function.proto

package com.google.ads.googleads.v9.common;

public final class MatchingFunctionProto {
  private MatchingFunctionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_MatchingFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_MatchingFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Operand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Operand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Operand_ConstantOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Operand_ConstantOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Operand_FeedAttributeOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Operand_FeedAttributeOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Operand_FunctionOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Operand_FunctionOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_Operand_RequestContextOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_Operand_RequestContextOperand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v9/common/matchin" +
      "g_function.proto\022\036google.ads.googleads.v" +
      "9.common\032Bgoogle/ads/googleads/v9/enums/" +
      "matching_function_context_type.proto\032>go" +
      "ogle/ads/googleads/v9/enums/matching_fun" +
      "ction_operator.proto\032\034google/api/annotat" +
      "ions.proto\"\255\002\n\020MatchingFunction\022\034\n\017funct" +
      "ion_string\030\005 \001(\tH\000\210\001\001\022f\n\010operator\030\004 \001(\0162" +
      "T.google.ads.googleads.v9.enums.Matching" +
      "FunctionOperatorEnum.MatchingFunctionOpe" +
      "rator\022>\n\rleft_operands\030\002 \003(\0132\'.google.ad" +
      "s.googleads.v9.common.Operand\022?\n\016right_o" +
      "perands\030\003 \003(\0132\'.google.ads.googleads.v9." +
      "common.OperandB\022\n\020_function_string\"\373\006\n\007O" +
      "perand\022S\n\020constant_operand\030\001 \001(\01327.googl" +
      "e.ads.googleads.v9.common.Operand.Consta" +
      "ntOperandH\000\022^\n\026feed_attribute_operand\030\002 " +
      "\001(\0132<.google.ads.googleads.v9.common.Ope" +
      "rand.FeedAttributeOperandH\000\022S\n\020function_" +
      "operand\030\003 \001(\01327.google.ads.googleads.v9." +
      "common.Operand.FunctionOperandH\000\022`\n\027requ" +
      "est_context_operand\030\004 \001(\0132=.google.ads.g" +
      "oogleads.v9.common.Operand.RequestContex" +
      "tOperandH\000\032\212\001\n\017ConstantOperand\022\026\n\014string" +
      "_value\030\005 \001(\tH\000\022\024\n\nlong_value\030\006 \001(\003H\000\022\027\n\r" +
      "boolean_value\030\007 \001(\010H\000\022\026\n\014double_value\030\010 " +
      "\001(\001H\000B\030\n\026constant_operand_value\032n\n\024FeedA" +
      "ttributeOperand\022\024\n\007feed_id\030\003 \001(\003H\000\210\001\001\022\036\n" +
      "\021feed_attribute_id\030\004 \001(\003H\001\210\001\001B\n\n\010_feed_i" +
      "dB\024\n\022_feed_attribute_id\032^\n\017FunctionOpera" +
      "nd\022K\n\021matching_function\030\001 \001(\01320.google.a" +
      "ds.googleads.v9.common.MatchingFunction\032" +
      "\211\001\n\025RequestContextOperand\022p\n\014context_typ" +
      "e\030\001 \001(\0162Z.google.ads.googleads.v9.enums." +
      "MatchingFunctionContextTypeEnum.Matching" +
      "FunctionContextTypeB\033\n\031function_argument" +
      "_operandB\360\001\n\"com.google.ads.googleads.v9" +
      ".commonB\025MatchingFunctionProtoP\001ZDgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v9/common;common\242\002\003GAA\252\002\036Google.Ad" +
      "s.GoogleAds.V9.Common\312\002\036Google\\Ads\\Googl" +
      "eAds\\V9\\Common\352\002\"Google::Ads::GoogleAds:" +
      ":V9::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.MatchingFunctionContextTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.MatchingFunctionOperatorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_common_MatchingFunction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_common_MatchingFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_MatchingFunction_descriptor,
        new java.lang.String[] { "FunctionString", "Operator", "LeftOperands", "RightOperands", "FunctionString", });
    internal_static_google_ads_googleads_v9_common_Operand_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_common_Operand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Operand_descriptor,
        new java.lang.String[] { "ConstantOperand", "FeedAttributeOperand", "FunctionOperand", "RequestContextOperand", "FunctionArgumentOperand", });
    internal_static_google_ads_googleads_v9_common_Operand_ConstantOperand_descriptor =
      internal_static_google_ads_googleads_v9_common_Operand_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v9_common_Operand_ConstantOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Operand_ConstantOperand_descriptor,
        new java.lang.String[] { "StringValue", "LongValue", "BooleanValue", "DoubleValue", "ConstantOperandValue", });
    internal_static_google_ads_googleads_v9_common_Operand_FeedAttributeOperand_descriptor =
      internal_static_google_ads_googleads_v9_common_Operand_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v9_common_Operand_FeedAttributeOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Operand_FeedAttributeOperand_descriptor,
        new java.lang.String[] { "FeedId", "FeedAttributeId", "FeedId", "FeedAttributeId", });
    internal_static_google_ads_googleads_v9_common_Operand_FunctionOperand_descriptor =
      internal_static_google_ads_googleads_v9_common_Operand_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v9_common_Operand_FunctionOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Operand_FunctionOperand_descriptor,
        new java.lang.String[] { "MatchingFunction", });
    internal_static_google_ads_googleads_v9_common_Operand_RequestContextOperand_descriptor =
      internal_static_google_ads_googleads_v9_common_Operand_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v9_common_Operand_RequestContextOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_Operand_RequestContextOperand_descriptor,
        new java.lang.String[] { "ContextType", });
    com.google.ads.googleads.v9.enums.MatchingFunctionContextTypeProto.getDescriptor();
    com.google.ads.googleads.v9.enums.MatchingFunctionOperatorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
