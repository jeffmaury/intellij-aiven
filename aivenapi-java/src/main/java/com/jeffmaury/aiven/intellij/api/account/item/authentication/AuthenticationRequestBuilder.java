package com.jeffmaury.aiven.intellij.api.account.item.authentication;

import com.jeffmaury.aiven.intellij.api.account.item.authentication.item.WithAccountAuthenticationMethodItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodsListResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/authentication
 */
public class AuthenticationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.authentication.item collection
     * @param account_authentication_method_id Unique identifier of the item
     * @return a WithAccountAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithAccountAuthenticationMethodItemRequestBuilder byAccount_authentication_method_id(@javax.annotation.Nonnull final String account_authentication_method_id) {
        Objects.requireNonNull(account_authentication_method_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("account_authentication_method_id", account_authentication_method_id);
        return new WithAccountAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication", pathParameters);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication", rawUrl);
    }
    /**
     * List authentication methods
     * @return a CompletableFuture of AccountAuthenticationMethodsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List authentication methods
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAuthenticationMethodsListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodsListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodsListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @return a CompletableFuture of AccountAuthenticationMethodCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse> post(@javax.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAuthenticationMethodCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse> post(@javax.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List authentication methods
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List authentication methods
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
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
