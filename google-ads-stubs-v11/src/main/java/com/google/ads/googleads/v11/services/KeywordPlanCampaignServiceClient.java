/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v11.services;

import com.google.ads.googleads.v11.services.stub.KeywordPlanCampaignServiceStub;
import com.google.ads.googleads.v11.services.stub.KeywordPlanCampaignServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Keyword Plan campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanCampaignOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanCampaignsResponse response =
 *       keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordPlanCampaignServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * KeywordPlanCampaignServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * KeywordPlanCampaignServiceSettings keywordPlanCampaignServiceSettings =
 *     KeywordPlanCampaignServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create(keywordPlanCampaignServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * KeywordPlanCampaignServiceSettings keywordPlanCampaignServiceSettings =
 *     KeywordPlanCampaignServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create(keywordPlanCampaignServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordPlanCampaignServiceClient implements BackgroundResource {
  private final KeywordPlanCampaignServiceSettings settings;
  private final KeywordPlanCampaignServiceStub stub;

  /** Constructs an instance of KeywordPlanCampaignServiceClient with default settings. */
  public static final KeywordPlanCampaignServiceClient create() throws IOException {
    return create(KeywordPlanCampaignServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordPlanCampaignServiceClient create(
      KeywordPlanCampaignServiceSettings settings) throws IOException {
    return new KeywordPlanCampaignServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(KeywordPlanCampaignServiceSettings).
   */
  public static final KeywordPlanCampaignServiceClient create(KeywordPlanCampaignServiceStub stub) {
    return new KeywordPlanCampaignServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanCampaignServiceClient(KeywordPlanCampaignServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanCampaignServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected KeywordPlanCampaignServiceClient(KeywordPlanCampaignServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanCampaignServiceSettings getSettings() {
    return settings;
  }

  public KeywordPlanCampaignServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [KeywordPlanCampaignError]() [KeywordPlanError]() [ListOperationError]() [MutateError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
   *     KeywordPlanCampaignServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<KeywordPlanCampaignOperation> operations = new ArrayList<>();
   *   MutateKeywordPlanCampaignsResponse response =
   *       keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose Keyword Plan campaigns are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan
   *     campaigns.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(
      String customerId, List<KeywordPlanCampaignOperation> operations) {
    MutateKeywordPlanCampaignsRequest request =
        MutateKeywordPlanCampaignsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [KeywordPlanCampaignError]() [KeywordPlanError]() [ListOperationError]() [MutateError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
   *     KeywordPlanCampaignServiceClient.create()) {
   *   MutateKeywordPlanCampaignsRequest request =
   *       MutateKeywordPlanCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanCampaignOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateKeywordPlanCampaignsResponse response =
   *       keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(
      MutateKeywordPlanCampaignsRequest request) {
    return mutateKeywordPlanCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [KeywordPlanCampaignError]() [KeywordPlanError]() [ListOperationError]() [MutateError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
   *     KeywordPlanCampaignServiceClient.create()) {
   *   MutateKeywordPlanCampaignsRequest request =
   *       MutateKeywordPlanCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanCampaignOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateKeywordPlanCampaignsResponse> future =
   *       keywordPlanCampaignServiceClient.mutateKeywordPlanCampaignsCallable().futureCall(request);
   *   // Do something.
   *   MutateKeywordPlanCampaignsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
      mutateKeywordPlanCampaignsCallable() {
    return stub.mutateKeywordPlanCampaignsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
