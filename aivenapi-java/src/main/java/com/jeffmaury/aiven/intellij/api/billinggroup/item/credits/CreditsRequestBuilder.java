package com.jeffmaury.aiven.intellij.api.billinggroup.item.credits;

import com.jeffmaury.aiven.intellij.api.models.BillingGroupCreditsClaimRequestBody;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupCreditsClaimResponse;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupCreditsListResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing-group/{billing_group_id}/credits
 */
public class CreditsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new CreditsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreditsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/credits", pathParameters);
    }
    /**
     * Instantiates a new CreditsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreditsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group/{billing_group_id}/credits", rawUrl);
    }
    /**
     * List billing group credits
     * @return a CompletableFuture of BillingGroupCreditsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupCreditsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List billing group credits
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of BillingGroupCreditsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupCreditsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupCreditsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Claim a credit code
     * @param body BillingGroupCreditsClaimRequestBody
     * @return a CompletableFuture of BillingGroupCreditsClaimResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse> post(@javax.annotation.Nonnull final BillingGroupCreditsClaimRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupCreditsClaimResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Claim a credit code
     * @param body BillingGroupCreditsClaimRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of BillingGroupCreditsClaimResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse> post(@javax.annotation.Nonnull final BillingGroupCreditsClaimRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, BillingGroupCreditsClaimResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse> executionException = new java.util.concurrent.CompletableFuture<BillingGroupCreditsClaimResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List billing group credits
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List billing group credits
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Claim a credit code
     * @param body BillingGroupCreditsClaimRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final BillingGroupCreditsClaimRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Claim a credit code
     * @param body BillingGroupCreditsClaimRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final BillingGroupCreditsClaimRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
