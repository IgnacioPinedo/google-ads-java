// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/billing_setup.proto

package com.google.ads.googleads.v3.resources;

public final class BillingSetupProto {
  private BillingSetupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_BillingSetup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_BillingSetup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_BillingSetup_PaymentsAccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v3/resources/bill" +
      "ing_setup.proto\022!google.ads.googleads.v3" +
      ".resources\0328google/ads/googleads/v3/enum" +
      "s/billing_setup_status.proto\032-google/ads" +
      "/googleads/v3/enums/time_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\270\t" +
      "\n\014BillingSetup\022D\n\rresource_name\030\001 \001(\tB-\340" +
      "A\005\372A\'\n%googleads.googleapis.com/BillingS" +
      "etup\022,\n\002id\030\002 \001(\0132\033.google.protobuf.Int64" +
      "ValueB\003\340A\003\022]\n\006status\030\003 \001(\0162H.google.ads." +
      "googleads.v3.enums.BillingSetupStatusEnu" +
      "m.BillingSetupStatusB\003\340A\003\022h\n\020payments_ac" +
      "count\030\013 \001(\0132\034.google.protobuf.StringValu" +
      "eB0\340A\005\372A*\n(googleads.googleapis.com/Paym" +
      "entsAccount\022g\n\025payments_account_info\030\014 \001" +
      "(\0132C.google.ads.googleads.v3.resources.B" +
      "illingSetup.PaymentsAccountInfoB\003\340A\005\022<\n\017" +
      "start_date_time\030\t \001(\0132\034.google.protobuf." +
      "StringValueB\003\340A\005H\000\022T\n\017start_time_type\030\n " +
      "\001(\01624.google.ads.googleads.v3.enums.Time" +
      "TypeEnum.TimeTypeB\003\340A\005H\000\022:\n\rend_date_tim" +
      "e\030\r \001(\0132\034.google.protobuf.StringValueB\003\340" +
      "A\003H\001\022R\n\rend_time_type\030\016 \001(\01624.google.ads" +
      ".googleads.v3.enums.TimeTypeEnum.TimeTyp" +
      "eB\003\340A\003H\001\032\343\002\n\023PaymentsAccountInfo\022>\n\023paym" +
      "ents_account_id\030\001 \001(\0132\034.google.protobuf." +
      "StringValueB\003\340A\003\022@\n\025payments_account_nam" +
      "e\030\002 \001(\0132\034.google.protobuf.StringValueB\003\340" +
      "A\005\022>\n\023payments_profile_id\030\003 \001(\0132\034.google" +
      ".protobuf.StringValueB\003\340A\005\022@\n\025payments_p" +
      "rofile_name\030\004 \001(\0132\034.google.protobuf.Stri" +
      "ngValueB\003\340A\003\022H\n\035secondary_payments_profi" +
      "le_id\030\005 \001(\0132\034.google.protobuf.StringValu" +
      "eB\003\340A\003:^\352A[\n%googleads.googleapis.com/Bi" +
      "llingSetup\0222customers/{customer}/billing" +
      "Setups/{billing_setup}B\014\n\nstart_timeB\n\n\010" +
      "end_timeB\376\001\n%com.google.ads.googleads.v3" +
      ".resourcesB\021BillingSetupProtoP\001ZJgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v3/resources;resources\242\002\003GAA\252\002!Goog" +
      "le.Ads.GoogleAds.V3.Resources\312\002!Google\\A" +
      "ds\\GoogleAds\\V3\\Resources\352\002%Google::Ads:" +
      ":GoogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.BillingSetupStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_BillingSetup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_BillingSetup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_BillingSetup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "PaymentsAccount", "PaymentsAccountInfo", "StartDateTime", "StartTimeType", "EndDateTime", "EndTimeType", "StartTime", "EndTime", });
    internal_static_google_ads_googleads_v3_resources_BillingSetup_PaymentsAccountInfo_descriptor =
      internal_static_google_ads_googleads_v3_resources_BillingSetup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_BillingSetup_PaymentsAccountInfo_descriptor,
        new java.lang.String[] { "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.BillingSetupStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
