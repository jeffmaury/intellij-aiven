package com.jeffmaury.aiven.intellij.api.account.item.payment_methods;

import com.jeffmaury.aiven.intellij.api.models.AccountAttachPaymentMethodRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountAttachPaymentMethodResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountPaymentMethodsListResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/payment_methods
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Payment_methodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/payment_methods", pathParameters);
    }
    /**
     * Instantiates a new Payment_methodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/payment_methods", rawUrl);
    }
    /**
     * List credit cards attached as a payment method to the account
     * @return a CompletableFuture of AccountPaymentMethodsListResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountPaymentMethodsListResponse> get() {
        return get(null);
    }
    /**
     * List credit cards attached as a payment method to the account
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountPaymentMethodsListResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountPaymentMethodsListResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, AccountPaymentMethodsListResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Attach payment method for account
     * @param body AccountAttachPaymentMethodRequestBody
     * @return a CompletableFuture of AccountAttachPaymentMethodResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAttachPaymentMethodResponse> post(@jakarta.annotation.Nonnull final AccountAttachPaymentMethodRequestBody body) {
        return post(body, null);
    }
    /**
     * Attach payment method for account
     * @param body AccountAttachPaymentMethodRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAttachPaymentMethodResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAttachPaymentMethodResponse> post(@jakarta.annotation.Nonnull final AccountAttachPaymentMethodRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, AccountAttachPaymentMethodResponse::createFromDiscriminatorValue, null);
    }
    /**
     * List credit cards attached as a payment method to the account
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List credit cards attached as a payment method to the account
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Attach payment method for account
     * @param body AccountAttachPaymentMethodRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountAttachPaymentMethodRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Attach payment method for account
     * @param body AccountAttachPaymentMethodRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountAttachPaymentMethodRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a PaymentMethodsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentMethodsRequestBuilder(rawUrl, requestAdapter);
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
