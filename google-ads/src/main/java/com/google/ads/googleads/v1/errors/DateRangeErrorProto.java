// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/date_range_error.proto

package com.google.ads.googleads.v1.errors;

public final class DateRangeErrorProto {
  private DateRangeErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_DateRangeErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_DateRangeErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v1/errors/date_ra" +
      "nge_error.proto\022\036google.ads.googleads.v1" +
      ".errors\032\034google/api/annotations.proto\"\346\001" +
      "\n\022DateRangeErrorEnum\"\317\001\n\016DateRangeError\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\020\n\014INVALID" +
      "_DATE\020\002\022\035\n\031START_DATE_AFTER_END_DATE\020\003\022\033" +
      "\n\027CANNOT_SET_DATE_TO_PAST\020\004\022 \n\034AFTER_MAX" +
      "IMUM_ALLOWABLE_DATE\020\005\022/\n+CANNOT_MODIFY_S" +
      "TART_DATE_IF_ALREADY_STARTED\020\006B\356\001\n\"com.g" +
      "oogle.ads.googleads.v1.errorsB\023DateRange" +
      "ErrorProtoP\001ZDgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v1/errors;erro" +
      "rs\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V1.Error" +
      "s\312\002\036Google\\Ads\\GoogleAds\\V1\\Errors\352\002\"Goo" +
      "gle::Ads::GoogleAds::V1::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_errors_DateRangeErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_DateRangeErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_DateRangeErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
