// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/mutate_job.proto

package com.google.ads.googleads.v1.resources;

public final class MutateJobProto {
  private MutateJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MutateJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MutateJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MutateJob_MutateJobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MutateJob_MutateJobMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v1/resources/muta" +
      "te_job.proto\022!google.ads.googleads.v1.re" +
      "sources\0325google/ads/googleads/v1/enums/m" +
      "utate_job_status.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"\346\006\n\tMutateJob\022A" +
      "\n\rresource_name\030\001 \001(\tB*\340A\005\372A$\n\"googleads" +
      ".googleapis.com/MutateJob\022,\n\002id\030\002 \001(\0132\033." +
      "google.protobuf.Int64ValueB\003\340A\003\022B\n\027next_" +
      "add_sequence_token\030\003 \001(\0132\034.google.protob" +
      "uf.StringValueB\003\340A\003\022U\n\010metadata\030\004 \001(\0132>." +
      "google.ads.googleads.v1.resources.Mutate" +
      "Job.MutateJobMetadataB\003\340A\003\022W\n\006status\030\005 \001" +
      "(\0162B.google.ads.googleads.v1.enums.Mutat" +
      "eJobStatusEnum.MutateJobStatusB\003\340A\003\022A\n\026l" +
      "ong_running_operation\030\006 \001(\0132\034.google.pro" +
      "tobuf.StringValueB\003\340A\003\032\331\002\n\021MutateJobMeta" +
      "data\022=\n\022creation_date_time\030\001 \001(\0132\034.googl" +
      "e.protobuf.StringValueB\003\340A\003\022?\n\024completio" +
      "n_date_time\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValueB\003\340A\003\022E\n\032estimated_completion_rat" +
      "io\030\003 \001(\0132\034.google.protobuf.DoubleValueB\003" +
      "\340A\003\0229\n\017operation_count\030\004 \001(\0132\033.google.pr" +
      "otobuf.Int64ValueB\003\340A\003\022B\n\030executed_opera" +
      "tion_count\030\005 \001(\0132\033.google.protobuf.Int64" +
      "ValueB\003\340A\003:U\352AR\n\"googleads.googleapis.co" +
      "m/MutateJob\022,customers/{customer}/mutate" +
      "Jobs/{mutate_job}B\373\001\n%com.google.ads.goo" +
      "gleads.v1.resourcesB\016MutateJobProtoP\001ZJg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v1/resources;resources\242\002\003GAA\252" +
      "\002!Google.Ads.GoogleAds.V1.Resources\312\002!Go" +
      "ogle\\Ads\\GoogleAds\\V1\\Resources\352\002%Google" +
      "::Ads::GoogleAds::V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.MutateJobStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_MutateJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_MutateJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MutateJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "NextAddSequenceToken", "Metadata", "Status", "LongRunningOperation", });
    internal_static_google_ads_googleads_v1_resources_MutateJob_MutateJobMetadata_descriptor =
      internal_static_google_ads_googleads_v1_resources_MutateJob_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_MutateJob_MutateJobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MutateJob_MutateJobMetadata_descriptor,
        new java.lang.String[] { "CreationDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.MutateJobStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
