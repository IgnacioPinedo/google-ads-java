// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/label_service.proto

package com.google.ads.googleads.v3.services;

public final class LabelServiceProto {
  private LabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_LabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_LabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v3/services/label" +
      "_service.proto\022 google.ads.googleads.v3." +
      "services\032-google/ads/googleads/v3/resour" +
      "ces/label.proto\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\032 google/protobuf/field_mask.p" +
      "roto\032\027google/rpc/status.proto\"P\n\017GetLabe" +
      "lRequest\022=\n\rresource_name\030\001 \001(\tB&\340A\002\372A \n" +
      "\036googleads.googleapis.com/Label\"\252\001\n\023Muta" +
      "teLabelsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A" +
      "\002\022I\n\noperations\030\002 \003(\01320.google.ads.googl" +
      "eads.v3.services.LabelOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\"\330\001\n\016LabelOperation\022/\n\013update_mask\030\004" +
      " \001(\0132\032.google.protobuf.FieldMask\022:\n\006crea" +
      "te\030\001 \001(\0132(.google.ads.googleads.v3.resou" +
      "rces.LabelH\000\022:\n\006update\030\002 \001(\0132(.google.ad" +
      "s.googleads.v3.resources.LabelH\000\022\020\n\006remo" +
      "ve\030\003 \001(\tH\000B\013\n\toperation\"\217\001\n\024MutateLabels" +
      "Response\0221\n\025partial_failure_error\030\003 \001(\0132" +
      "\022.google.rpc.Status\022D\n\007results\030\002 \003(\01323.g" +
      "oogle.ads.googleads.v3.services.MutateLa" +
      "belResult\"*\n\021MutateLabelResult\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\250\003\n\014LabelService\022\251\001\n\010GetLa" +
      "bel\0221.google.ads.googleads.v3.services.G" +
      "etLabelRequest\032(.google.ads.googleads.v3" +
      ".resources.Label\"@\202\323\344\223\002*\022(/v3/{resource_" +
      "name=customers/*/labels/*}\332A\rresource_na" +
      "me\022\316\001\n\014MutateLabels\0225.google.ads.googlea" +
      "ds.v3.services.MutateLabelsRequest\0326.goo" +
      "gle.ads.googleads.v3.services.MutateLabe" +
      "lsResponse\"O\202\323\344\223\0020\"+/v3/customers/{custo" +
      "mer_id=*}/labels:mutate:\001*\332A\026customer_id" +
      ",operations\032\033\312A\030googleads.googleapis.com" +
      "B\370\001\n$com.google.ads.googleads.v3.service" +
      "sB\021LabelServiceProtoP\001ZHgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v3/s" +
      "ervices;services\242\002\003GAA\252\002 Google.Ads.Goog" +
      "leAds.V3.Services\312\002 Google\\Ads\\GoogleAds" +
      "\\V3\\Services\352\002$Google::Ads::GoogleAds::V" +
      "3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.LabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_LabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_LabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_LabelOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateLabelResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.LabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
