// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/merchant_center_link.proto

package com.google.ads.googleads.v3.resources;

public final class MerchantCenterLinkProto {
  private MerchantCenterLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_MerchantCenterLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_MerchantCenterLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v3/resources/merc" +
      "hant_center_link.proto\022!google.ads.googl" +
      "eads.v3.resources\032?google/ads/googleads/" +
      "v3/enums/merchant_center_link_status.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\260\003\n\022MerchantCenterLink\022J\n\rresource_" +
      "name\030\001 \001(\tB3\340A\005\372A-\n+googleads.googleapis" +
      ".com/MerchantCenterLink\022,\n\002id\030\003 \001(\0132\033.go" +
      "ogle.protobuf.Int64ValueB\003\340A\003\022G\n\034merchan" +
      "t_center_account_name\030\004 \001(\0132\034.google.pro" +
      "tobuf.StringValueB\003\340A\003\022d\n\006status\030\005 \001(\0162T" +
      ".google.ads.googleads.v3.enums.MerchantC" +
      "enterLinkStatusEnum.MerchantCenterLinkSt" +
      "atus:q\352An\n+googleads.googleapis.com/Merc" +
      "hantCenterLink\022?customers/{customer}/mer" +
      "chantCenterLinks/{merchant_center_link}B" +
      "\204\002\n%com.google.ads.googleads.v3.resource" +
      "sB\027MerchantCenterLinkProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v3/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V3.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V3\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.MerchantCenterLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_MerchantCenterLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_MerchantCenterLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_MerchantCenterLink_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "MerchantCenterAccountName", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.MerchantCenterLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
