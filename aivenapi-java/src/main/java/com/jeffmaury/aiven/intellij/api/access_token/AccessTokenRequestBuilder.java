package com.jeffmaury.aiven.intellij.api.access_token;

import com.jeffmaury.aiven.intellij.api.access_token.item.WithTokenPrefixItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.AccessTokenCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccessTokenCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccessTokenListResponse;
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
 * Builds and executes requests for operations under /access_token
 */
public class AccessTokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.access_token.item collection
     * @param token_prefix Unique identifier of the item
     * @return a WithTokenPrefixItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithTokenPrefixItemRequestBuilder byToken_prefix(@javax.annotation.Nonnull final String token_prefix) {
        Objects.requireNonNull(token_prefix);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("token_prefix", token_prefix);
        return new WithTokenPrefixItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Access_tokenRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessTokenRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token", pathParameters);
    }
    /**
     * Instantiates a new Access_tokenRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessTokenRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token", rawUrl);
    }
    /**
     * List all valid access tokens
     * @return a CompletableFuture of AccessTokenListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessTokenListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccessTokenListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessTokenListResponse> executionException = new java.util.concurrent.CompletableFuture<AccessTokenListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all valid access tokens
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccessTokenListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessTokenListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccessTokenListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessTokenListResponse> executionException = new java.util.concurrent.CompletableFuture<AccessTokenListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @return a CompletableFuture of AccessTokenCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessTokenCreateResponse> post(@javax.annotation.Nonnull final AccessTokenCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, AccessTokenCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessTokenCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccessTokenCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccessTokenCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessTokenCreateResponse> post(@javax.annotation.Nonnull final AccessTokenCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccessTokenCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessTokenCreateResponse> executionException = new java.util.concurrent.CompletableFuture<AccessTokenCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all valid access tokens
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List all valid access tokens
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
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccessTokenCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AccessTokenCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
