// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/asset_error.proto

package com.google.ads.googleads.v1.errors;

public final class AssetErrorProto {
  private AssetErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_AssetErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_AssetErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v1/errors/asset_e" +
      "rror.proto\022\036google.ads.googleads.v1.erro" +
      "rs\032\034google/api/annotations.proto\"\322\001\n\016Ass" +
      "etErrorEnum\"\277\001\n\nAssetError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022+\n\'CUSTOMER_NOT_WHITELI" +
      "STED_FOR_ASSET_TYPE\020\002\022\023\n\017DUPLICATE_ASSET" +
      "\020\003\022\030\n\024DUPLICATE_ASSET_NAME\020\004\022\031\n\025ASSET_DA" +
      "TA_IS_MISSING\020\005\022\034\n\030CANNOT_MODIFY_ASSET_N" +
      "AME\020\006B\352\001\n\"com.google.ads.googleads.v1.er" +
      "rorsB\017AssetErrorProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v1/" +
      "errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V1.Errors\312\002\036Google\\Ads\\GoogleAds\\V1\\E" +
      "rrors\352\002\"Google::Ads::GoogleAds::V1::Erro" +
      "rsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_errors_AssetErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_AssetErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_AssetErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
