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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /access_token
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessTokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.access_token.item collection
     * @param token_prefix Access token prefix
     * @return a WithTokenPrefixItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTokenPrefixItemRequestBuilder byToken_prefix(@jakarta.annotation.Nonnull final String token_prefix) {
        Objects.requireNonNull(token_prefix);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("token_prefix", token_prefix);
        return new WithTokenPrefixItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Access_tokenRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessTokenRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token", pathParameters);
    }
    /**
     * Instantiates a new Access_tokenRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessTokenRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token", rawUrl);
    }
    /**
     * List all valid access tokens
     * @return a AccessTokenListResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenListResponse get() {
        return get(null);
    }
    /**
     * List all valid access tokens
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessTokenListResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessTokenListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @return a AccessTokenCreateResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenCreateResponse post(@jakarta.annotation.Nonnull final AccessTokenCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessTokenCreateResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenCreateResponse post(@jakarta.annotation.Nonnull final AccessTokenCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessTokenCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List all valid access tokens
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List all valid access tokens
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
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessTokenCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new access token
     * @param body AccessTokenCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessTokenCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AccessTokenRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessTokenRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessTokenRequestBuilder(rawUrl, requestAdapter);
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
