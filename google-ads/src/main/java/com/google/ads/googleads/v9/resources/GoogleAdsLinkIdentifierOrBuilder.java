// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/account_link.proto

package com.google.ads.googleads.v9.resources;

public interface GoogleAdsLinkIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.GoogleAdsLinkIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString
      getCustomerBytes();
}
