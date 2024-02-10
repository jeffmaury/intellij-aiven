package com.jeffmaury.aiven.intellij.api.billinggroup;

import com.jeffmaury.aiven.intellij.api.billinggroup.item.WithBillingGroupItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.BillingGroupListResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing-group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.billingGroup.item collection
     * @param billing_group_id Billing group id
     * @return a WithBillingGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithBillingGroupItemRequestBuilder byBilling_group_id(@jakarta.annotation.Nonnull final String billing_group_id) {
        Objects.requireNonNull(billing_group_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("billing_group_id", billing_group_id);
        return new WithBillingGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BillingGroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group", pathParameters);
    }
    /**
     * Instantiates a new BillingGroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing-group", rawUrl);
    }
    /**
     * List billing groups
     * @return a BillingGroupListResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupListResponse get() {
        return get(null);
    }
    /**
     * List billing groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupListResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a billing group
     * @param body BillingGroupCreateRequestBody
     * @return a BillingGroupCreateResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupCreateResponse post(@jakarta.annotation.Nonnull final BillingGroupCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a billing group
     * @param body BillingGroupCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BillingGroupCreateResponse
     */
    @jakarta.annotation.Nullable
    public BillingGroupCreateResponse post(@jakarta.annotation.Nonnull final BillingGroupCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingGroupCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List billing groups
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List billing groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a billing group
     * @param body BillingGroupCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingGroupCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a billing group
     * @param body BillingGroupCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingGroupCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a BillingGroupRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BillingGroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BillingGroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
