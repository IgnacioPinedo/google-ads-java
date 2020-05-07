// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/remarketing_action.proto

package com.google.ads.googleads.v3.resources;

public final class RemarketingActionProto {
  private RemarketingActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_RemarketingAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_RemarketingAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v3/resources/rema" +
      "rketing_action.proto\022!google.ads.googlea" +
      "ds.v3.resources\0320google/ads/googleads/v3" +
      "/common/tag_snippet.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032\036google/protobuf/wrappers.proto\032\034g" +
      "oogle/api/annotations.proto\"\356\002\n\021Remarket" +
      "ingAction\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A," +
      "\n*googleads.googleapis.com/RemarketingAc" +
      "tion\022,\n\002id\030\002 \001(\0132\033.google.protobuf.Int64" +
      "ValueB\003\340A\003\022*\n\004name\030\003 \001(\0132\034.google.protob" +
      "uf.StringValue\022E\n\014tag_snippets\030\004 \003(\0132*.g" +
      "oogle.ads.googleads.v3.common.TagSnippet" +
      "B\003\340A\003:m\352Aj\n*googleads.googleapis.com/Rem" +
      "arketingAction\022<customers/{customer}/rem" +
      "arketingActions/{remarketing_action}B\203\002\n" +
      "%com.google.ads.googleads.v3.resourcesB\026" +
      "RemarketingActionProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v3" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V3.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V3\\Resources\352\002%Google::Ads::Google" +
      "Ads::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.common.TagSnippetProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_RemarketingAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_RemarketingAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_RemarketingAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "TagSnippets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.TagSnippetProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
