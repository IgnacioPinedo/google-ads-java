// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/carrier_constant.proto

package com.google.ads.googleads.v3.resources;

public final class CarrierConstantProto {
  private CarrierConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CarrierConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CarrierConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v3/resources/carr" +
      "ier_constant.proto\022!google.ads.googleads" +
      ".v3.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\036googl" +
      "e/protobuf/wrappers.proto\032\034google/api/an" +
      "notations.proto\"\306\002\n\017CarrierConstant\022G\n\rr" +
      "esource_name\030\001 \001(\tB0\340A\003\372A*\n(googleads.go" +
      "ogleapis.com/CarrierConstant\022,\n\002id\030\002 \001(\013" +
      "2\033.google.protobuf.Int64ValueB\003\340A\003\022/\n\004na" +
      "me\030\003 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\003\0227\n\014country_code\030\004 \001(\0132\034.google.proto" +
      "buf.StringValueB\003\340A\003:R\352AO\n(googleads.goo" +
      "gleapis.com/CarrierConstant\022#carrierCons" +
      "tants/{carrier_constant}B\201\002\n%com.google." +
      "ads.googleads.v3.resourcesB\024CarrierConst" +
      "antProtoP\001ZJgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v3/resources;res" +
      "ources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.R" +
      "esources\312\002!Google\\Ads\\GoogleAds\\V3\\Resou" +
      "rces\352\002%Google::Ads::GoogleAds::V3::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_CarrierConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CarrierConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CarrierConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
