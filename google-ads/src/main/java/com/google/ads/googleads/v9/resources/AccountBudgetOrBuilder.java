// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/account_budget.proto

package com.google.ads.googleads.v9.resources;

public interface AccountBudgetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.AccountBudget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the account-level budget.
   * AccountBudget resource names have the form:
   * `customers/{customer_id}/accountBudgets/{account_budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the account-level budget.
   * AccountBudget resource names have the form:
   * `customers/{customer_id}/accountBudgets/{account_budget_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the account-level budget.
   * </pre>
   *
   * <code>optional int64 id = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the account-level budget.
   * </pre>
   *
   * <code>optional int64 id = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 24 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the billingSetup field is set.
   */
  boolean hasBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 24 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The billingSetup.
   */
  java.lang.String getBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of the billing setup associated with this account-level
   * budget.  BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 24 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for billingSetup.
   */
  com.google.protobuf.ByteString
      getBillingSetupBytes();

  /**
   * <pre>
   * Output only. The status of this account-level budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AccountBudgetStatusEnum.AccountBudgetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this account-level budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AccountBudgetStatusEnum.AccountBudgetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v9.enums.AccountBudgetStatusEnum.AccountBudgetStatus getStatus();

  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>optional string name = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>optional string name = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the account-level budget.
   * </pre>
   *
   * <code>optional string name = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>optional string proposed_start_date_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedStartDateTime field is set.
   */
  boolean hasProposedStartDateTime();
  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>optional string proposed_start_date_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedStartDateTime.
   */
  java.lang.String getProposedStartDateTime();
  /**
   * <pre>
   * Output only. The proposed start time of the account-level budget in
   * yyyy-MM-dd HH:mm:ss format.  If a start time type of NOW was proposed,
   * this is the time of request.
   * </pre>
   *
   * <code>optional string proposed_start_date_time = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for proposedStartDateTime.
   */
  com.google.protobuf.ByteString
      getProposedStartDateTimeBytes();

  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedStartDateTime field is set.
   */
  boolean hasApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedStartDateTime.
   */
  java.lang.String getApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start time of the account-level budget in yyyy-MM-dd HH:mm:ss
   * format.
   * For example, if a new budget is approved after the proposed start time,
   * the approved start time is the time of approval.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for approvedStartDateTime.
   */
  com.google.protobuf.ByteString
      getApprovedStartDateTimeBytes();

  /**
   * <pre>
   * Output only. The total adjustments amount.
   * An example of an adjustment is courtesy credits.
   * </pre>
   *
   * <code>int64 total_adjustments_micros = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalAdjustmentsMicros.
   */
  long getTotalAdjustmentsMicros();

  /**
   * <pre>
   * Output only. The value of Ads that have been served, in micros.
   * This includes overdelivery costs, in which case a credit might be
   * automatically applied to the budget (see total_adjustments_micros).
   * </pre>
   *
   * <code>int64 amount_served_micros = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The amountServedMicros.
   */
  long getAmountServedMicros();

  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>optional string purchase_order_number = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the purchaseOrderNumber field is set.
   */
  boolean hasPurchaseOrderNumber();
  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>optional string purchase_order_number = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The purchaseOrderNumber.
   */
  java.lang.String getPurchaseOrderNumber();
  /**
   * <pre>
   * Output only. A purchase order number is a value that helps users reference this budget
   * in their monthly invoices.
   * </pre>
   *
   * <code>optional string purchase_order_number = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for purchaseOrderNumber.
   */
  com.google.protobuf.ByteString
      getPurchaseOrderNumberBytes();

  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>optional string notes = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>optional string notes = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Output only. Notes associated with the budget.
   * </pre>
   *
   * <code>optional string notes = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pendingProposal field is set.
   */
  boolean hasPendingProposal();
  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pendingProposal.
   */
  com.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposal getPendingProposal();
  /**
   * <pre>
   * Output only. The pending proposal to modify this budget, if applicable.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposal pending_proposal = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposalOrBuilder getPendingProposalOrBuilder();

  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedEndDateTime field is set.
   */
  boolean hasProposedEndDateTime();
  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedEndDateTime.
   */
  java.lang.String getProposedEndDateTime();
  /**
   * <pre>
   * Output only. The proposed end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for proposedEndDateTime.
   */
  com.google.protobuf.ByteString
      getProposedEndDateTimeBytes();

  /**
   * <pre>
   * Output only. The proposed end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedEndTimeType field is set.
   */
  boolean hasProposedEndTimeType();
  /**
   * <pre>
   * Output only. The proposed end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for proposedEndTimeType.
   */
  int getProposedEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The proposed end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedEndTimeType.
   */
  com.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType getProposedEndTimeType();

  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedEndDateTime field is set.
   */
  boolean hasApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndDateTime.
   */
  java.lang.String getApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end time in yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for approvedEndDateTime.
   */
  com.google.protobuf.ByteString
      getApprovedEndDateTimeBytes();

  /**
   * <pre>
   * Output only. The approved end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType approved_end_time_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedEndTimeType field is set.
   */
  boolean hasApprovedEndTimeType();
  /**
   * <pre>
   * Output only. The approved end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType approved_end_time_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedEndTimeType.
   */
  int getApprovedEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The approved end time as a well-defined type, e.g. FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType approved_end_time_type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndTimeType.
   */
  com.google.ads.googleads.v9.enums.TimeTypeEnum.TimeType getApprovedEndTimeType();

  /**
   * <pre>
   * Output only. The proposed spending limit in micros.  One million is equivalent to
   * one unit.
   * </pre>
   *
   * <code>int64 proposed_spending_limit_micros = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedSpendingLimitMicros field is set.
   */
  boolean hasProposedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The proposed spending limit in micros.  One million is equivalent to
   * one unit.
   * </pre>
   *
   * <code>int64 proposed_spending_limit_micros = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedSpendingLimitMicros.
   */
  long getProposedSpendingLimitMicros();

  /**
   * <pre>
   * Output only. The proposed spending limit as a well-defined type, e.g. INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the proposedSpendingLimitType field is set.
   */
  boolean hasProposedSpendingLimitType();
  /**
   * <pre>
   * Output only. The proposed spending limit as a well-defined type, e.g. INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for proposedSpendingLimitType.
   */
  int getProposedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The proposed spending limit as a well-defined type, e.g. INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The proposedSpendingLimitType.
   */
  com.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType getProposedSpendingLimitType();

  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is equivalent to
   * one unit.  This will only be populated if the proposed spending limit
   * is finite, and will always be greater than or equal to the
   * proposed spending limit.
   * </pre>
   *
   * <code>int64 approved_spending_limit_micros = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedSpendingLimitMicros field is set.
   */
  boolean hasApprovedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is equivalent to
   * one unit.  This will only be populated if the proposed spending limit
   * is finite, and will always be greater than or equal to the
   * proposed spending limit.
   * </pre>
   *
   * <code>int64 approved_spending_limit_micros = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitMicros.
   */
  long getApprovedSpendingLimitMicros();

  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, e.g. INFINITE.  This
   * will only be populated if the approved spending limit is INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedSpendingLimitType field is set.
   */
  boolean hasApprovedSpendingLimitType();
  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, e.g. INFINITE.  This
   * will only be populated if the approved spending limit is INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedSpendingLimitType.
   */
  int getApprovedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, e.g. INFINITE.  This
   * will only be populated if the approved spending limit is INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitType.
   */
  com.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType getApprovedSpendingLimitType();

  /**
   * <pre>
   * Output only. The adjusted spending limit in micros.  One million is equivalent to
   * one unit.
   * If the approved spending limit is finite, the adjusted
   * spending limit may vary depending on the types of adjustments applied
   * to this budget, if applicable.
   * The different kinds of adjustments are described here:
   * https://support.google.com/google-ads/answer/1704323
   * For example, a debit adjustment reduces how much the account is
   * allowed to spend.
   * </pre>
   *
   * <code>int64 adjusted_spending_limit_micros = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adjustedSpendingLimitMicros field is set.
   */
  boolean hasAdjustedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The adjusted spending limit in micros.  One million is equivalent to
   * one unit.
   * If the approved spending limit is finite, the adjusted
   * spending limit may vary depending on the types of adjustments applied
   * to this budget, if applicable.
   * The different kinds of adjustments are described here:
   * https://support.google.com/google-ads/answer/1704323
   * For example, a debit adjustment reduces how much the account is
   * allowed to spend.
   * </pre>
   *
   * <code>int64 adjusted_spending_limit_micros = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustedSpendingLimitMicros.
   */
  long getAdjustedSpendingLimitMicros();

  /**
   * <pre>
   * Output only. The adjusted spending limit as a well-defined type, e.g. INFINITE.
   * This will only be populated if the adjusted spending limit is INFINITE,
   * which is guaranteed to be true if the approved spending limit is
   * INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType adjusted_spending_limit_type = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adjustedSpendingLimitType field is set.
   */
  boolean hasAdjustedSpendingLimitType();
  /**
   * <pre>
   * Output only. The adjusted spending limit as a well-defined type, e.g. INFINITE.
   * This will only be populated if the adjusted spending limit is INFINITE,
   * which is guaranteed to be true if the approved spending limit is
   * INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType adjusted_spending_limit_type = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for adjustedSpendingLimitType.
   */
  int getAdjustedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The adjusted spending limit as a well-defined type, e.g. INFINITE.
   * This will only be populated if the adjusted spending limit is INFINITE,
   * which is guaranteed to be true if the approved spending limit is
   * INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType adjusted_spending_limit_type = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustedSpendingLimitType.
   */
  com.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitType getAdjustedSpendingLimitType();

  public com.google.ads.googleads.v9.resources.AccountBudget.ProposedEndTimeCase getProposedEndTimeCase();

  public com.google.ads.googleads.v9.resources.AccountBudget.ApprovedEndTimeCase getApprovedEndTimeCase();

  public com.google.ads.googleads.v9.resources.AccountBudget.ProposedSpendingLimitCase getProposedSpendingLimitCase();

  public com.google.ads.googleads.v9.resources.AccountBudget.ApprovedSpendingLimitCase getApprovedSpendingLimitCase();

  public com.google.ads.googleads.v9.resources.AccountBudget.AdjustedSpendingLimitCase getAdjustedSpendingLimitCase();
}
