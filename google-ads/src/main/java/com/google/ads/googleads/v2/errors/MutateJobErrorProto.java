// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/mutate_job_error.proto

package com.google.ads.googleads.v2.errors;

public final class MutateJobErrorProto {
  private MutateJobErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_errors_MutateJobErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_errors_MutateJobErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v2/errors/mutate_" +
      "job_error.proto\022\036google.ads.googleads.v2" +
      ".errors\032\034google/api/annotations.proto\"\325\001" +
      "\n\022MutateJobErrorEnum\"\276\001\n\016MutateJobError\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022.\n*CANNOT_" +
      "MODIFY_JOB_AFTER_JOB_STARTS_RUNNING\020\002\022\024\n" +
      "\020EMPTY_OPERATIONS\020\003\022\032\n\026INVALID_SEQUENCE_" +
      "TOKEN\020\004\022\025\n\021RESULTS_NOT_READY\020\005\022\025\n\021INVALI" +
      "D_PAGE_SIZE\020\006B\356\001\n\"com.google.ads.googlea" +
      "ds.v2.errorsB\023MutateJobErrorProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v2/errors;errors\242\002\003GAA\252\002\036Google" +
      ".Ads.GoogleAds.V2.Errors\312\002\036Google\\Ads\\Go" +
      "ogleAds\\V2\\Errors\352\002\"Google::Ads::GoogleA" +
      "ds::V2::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_errors_MutateJobErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_errors_MutateJobErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_errors_MutateJobErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
