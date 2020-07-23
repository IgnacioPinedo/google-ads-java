// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_extension_setting.proto

package com.google.ads.googleads.v1.resources;

public interface AdGroupExtensionSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.AdGroupExtensionSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group extension setting.
   * AdGroupExtensionSetting resource names have the form:
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group extension setting.
   * AdGroupExtensionSetting resource names have the form:
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The extension type of the ad group extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for extensionType.
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * Immutable. The extension type of the ad group extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The extensionType.
   */
  com.google.ads.googleads.v1.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4 [(.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getExtensionFeedItemsList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getExtensionFeedItems(int index);
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4 [(.google.api.resource_reference) = { ... }</code>
   */
  int getExtensionFeedItemsCount();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4 [(.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getExtensionFeedItemsOrBuilderList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 4 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getExtensionFeedItemsOrBuilder(
      int index);

  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   * @return The device.
   */
  com.google.ads.googleads.v1.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice getDevice();
}
