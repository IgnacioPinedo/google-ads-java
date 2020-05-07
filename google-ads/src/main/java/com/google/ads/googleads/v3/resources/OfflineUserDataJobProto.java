// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/offline_user_data_job.proto

package com.google.ads.googleads.v3.resources;

public final class OfflineUserDataJobProto {
  private OfflineUserDataJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_OfflineUserDataJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_OfflineUserDataJob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/resources/offl" +
      "ine_user_data_job.proto\022!google.ads.goog" +
      "leads.v3.resources\0326google/ads/googleads" +
      "/v3/common/offline_user_data.proto\032Hgoog" +
      "le/ads/googleads/v3/enums/offline_user_d" +
      "ata_job_failure_reason.proto\032@google/ads" +
      "/googleads/v3/enums/offline_user_data_jo" +
      "b_status.proto\032>google/ads/googleads/v3/" +
      "enums/offline_user_data_job_type.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032\036google/protobuf/wrap" +
      "pers.proto\032\034google/api/annotations.proto" +
      "\"\340\006\n\022OfflineUserDataJob\022J\n\rresource_name" +
      "\030\001 \001(\tB3\340A\005\372A-\n+googleads.googleapis.com" +
      "/OfflineUserDataJob\022,\n\002id\030\002 \001(\0132\033.google" +
      ".protobuf.Int64ValueB\003\340A\003\0225\n\013external_id" +
      "\030\003 \001(\0132\033.google.protobuf.Int64ValueB\003\340A\003" +
      "\022c\n\004type\030\004 \001(\0162P.google.ads.googleads.v3" +
      ".enums.OfflineUserDataJobTypeEnum.Offlin" +
      "eUserDataJobTypeB\003\340A\003\022i\n\006status\030\005 \001(\0162T." +
      "google.ads.googleads.v3.enums.OfflineUse" +
      "rDataJobStatusEnum.OfflineUserDataJobSta" +
      "tusB\003\340A\003\022\177\n\016failure_reason\030\006 \001(\0162b.googl" +
      "e.ads.googleads.v3.enums.OfflineUserData" +
      "JobFailureReasonEnum.OfflineUserDataJobF" +
      "ailureReasonB\003\340A\003\022o\n!customer_match_user" +
      "_list_metadata\030\007 \001(\0132=.google.ads.google" +
      "ads.v3.common.CustomerMatchUserListMetad" +
      "ataB\003\340A\003H\000\022W\n\024store_sales_metadata\030\010 \001(\013" +
      "22.google.ads.googleads.v3.common.StoreS" +
      "alesMetadataB\003\340A\003H\000:r\352Ao\n+googleads.goog" +
      "leapis.com/OfflineUserDataJob\022@customers" +
      "/{customer}/offlineUserDataJobs/{offline" +
      "_user_data_job}B\n\n\010metadataB\204\002\n%com.goog" +
      "le.ads.googleads.v3.resourcesB\027OfflineUs" +
      "erDataJobProtoP\001ZJgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v3/resourc" +
      "es;resources\242\002\003GAA\252\002!Google.Ads.GoogleAd" +
      "s.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3" +
      "\\Resources\352\002%Google::Ads::GoogleAds::V3:" +
      ":Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.OfflineUserDataJobFailureReasonProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.OfflineUserDataJobStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.OfflineUserDataJobTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_OfflineUserDataJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_OfflineUserDataJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_OfflineUserDataJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExternalId", "Type", "Status", "FailureReason", "CustomerMatchUserListMetadata", "StoreSalesMetadata", "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v3.enums.OfflineUserDataJobFailureReasonProto.getDescriptor();
    com.google.ads.googleads.v3.enums.OfflineUserDataJobStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.OfflineUserDataJobTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
