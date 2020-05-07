// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/merchant_center_link_service.proto

package com.google.ads.googleads.v3.services;

public final class MerchantCenterLinkServiceProto {
  private MerchantCenterLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetMerchantCenterLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetMerchantCenterLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MerchantCenterLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MerchantCenterLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v3/services/merch" +
      "ant_center_link_service.proto\022 google.ad" +
      "s.googleads.v3.services\032<google/ads/goog" +
      "leads/v3/resources/merchant_center_link." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032 google/protobuf/field_mask.proto\":\n\036Li" +
      "stMerchantCenterLinksRequest\022\030\n\013customer" +
      "_id\030\001 \001(\tB\003\340A\002\"w\n\037ListMerchantCenterLink" +
      "sResponse\022T\n\025merchant_center_links\030\001 \003(\013" +
      "25.google.ads.googleads.v3.resources.Mer" +
      "chantCenterLink\"j\n\034GetMerchantCenterLink" +
      "Request\022J\n\rresource_name\030\001 \001(\tB3\340A\002\372A-\n+" +
      "googleads.googleapis.com/MerchantCenterL" +
      "ink\"\222\001\n\037MutateMerchantCenterLinkRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\toperation\030\002" +
      " \001(\0132=.google.ads.googleads.v3.services." +
      "MerchantCenterLinkOperationB\003\340A\002\"\266\001\n\033Mer" +
      "chantCenterLinkOperation\022/\n\013update_mask\030" +
      "\003 \001(\0132\032.google.protobuf.FieldMask\022G\n\006upd" +
      "ate\030\001 \001(\01325.google.ads.googleads.v3.reso" +
      "urces.MerchantCenterLinkH\000\022\020\n\006remove\030\002 \001" +
      "(\tH\000B\013\n\toperation\"t\n MutateMerchantCente" +
      "rLinkResponse\022P\n\006result\030\002 \001(\0132@.google.a" +
      "ds.googleads.v3.services.MutateMerchantC" +
      "enterLinkResult\"7\n\036MutateMerchantCenterL" +
      "inkResult\022\025\n\rresource_name\030\001 \001(\t2\203\006\n\031Mer" +
      "chantCenterLinkService\022\347\001\n\027ListMerchantC" +
      "enterLinks\022@.google.ads.googleads.v3.ser" +
      "vices.ListMerchantCenterLinksRequest\032A.g" +
      "oogle.ads.googleads.v3.services.ListMerc" +
      "hantCenterLinksResponse\"G\202\323\344\223\0023\0221/v3/cus" +
      "tomers/{customer_id=*}/merchantCenterLin" +
      "ks\332A\013customer_id\022\335\001\n\025GetMerchantCenterLi" +
      "nk\022>.google.ads.googleads.v3.services.Ge" +
      "tMerchantCenterLinkRequest\0325.google.ads." +
      "googleads.v3.resources.MerchantCenterLin" +
      "k\"M\202\323\344\223\0027\0225/v3/{resource_name=customers/" +
      "*/merchantCenterLinks/*}\332A\rresource_name" +
      "\022\376\001\n\030MutateMerchantCenterLink\022A.google.a" +
      "ds.googleads.v3.services.MutateMerchantC" +
      "enterLinkRequest\032B.google.ads.googleads." +
      "v3.services.MutateMerchantCenterLinkResp" +
      "onse\"[\202\323\344\223\002=\"8/v3/customers/{customer_id" +
      "=*}/merchantCenterLinks:mutate:\001*\332A\025cust" +
      "omer_id,operation\032\033\312A\030googleads.googleap" +
      "is.comB\205\002\n$com.google.ads.googleads.v3.s" +
      "ervicesB\036MerchantCenterLinkServiceProtoP" +
      "\001ZHgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v3/services;services\242\002\003GA" +
      "A\252\002 Google.Ads.GoogleAds.V3.Services\312\002 G" +
      "oogle\\Ads\\GoogleAds\\V3\\Services\352\002$Google" +
      "::Ads::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.MerchantCenterLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ListMerchantCenterLinksResponse_descriptor,
        new java.lang.String[] { "MerchantCenterLinks", });
    internal_static_google_ads_googleads_v3_services_GetMerchantCenterLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_GetMerchantCenterLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetMerchantCenterLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v3_services_MerchantCenterLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MerchantCenterLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MerchantCenterLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateMerchantCenterLinkResult_descriptor,
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
    com.google.ads.googleads.v3.resources.MerchantCenterLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
