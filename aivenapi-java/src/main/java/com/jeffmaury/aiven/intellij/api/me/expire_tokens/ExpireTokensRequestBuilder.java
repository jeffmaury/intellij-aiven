package com.jeffmaury.aiven.intellij.api.me.expire_tokens;

import com.jeffmaury.aiven.intellij.api.models.UserExpireTokensResponse;
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
 * Builds and executes requests for operations under /me/expire_tokens
 */
public class ExpireTokensRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Expire_tokensRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExpireTokensRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/expire_tokens", pathParameters);
    }
    /**
     * Instantiates a new Expire_tokensRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExpireTokensRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/expire_tokens", rawUrl);
    }
    /**
     * Expire all authorization tokens
     * @return a CompletableFuture of UserExpireTokensResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExpireTokensResponse> post() {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, UserExpireTokensResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExpireTokensResponse> executionException = new java.util.concurrent.CompletableFuture<UserExpireTokensResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Expire all authorization tokens
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserExpireTokensResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExpireTokensResponse> post(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, UserExpireTokensResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExpireTokensResponse> executionException = new java.util.concurrent.CompletableFuture<UserExpireTokensResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Expire all authorization tokens
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation() throws URISyntaxException {
        return toPostRequestInformation(null);
    }
    /**
     * Expire all authorization tokens
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
