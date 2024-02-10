package com.jeffmaury.aiven.intellij.api.access_token.item;

import com.jeffmaury.aiven.intellij.api.models.AccessTokenRevokeResponse;
import com.jeffmaury.aiven.intellij.api.models.AccessTokenUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccessTokenUpdateResponse;
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
 * Builds and executes requests for operations under /access_token/{token_prefix}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTokenPrefixItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithToken_prefixItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTokenPrefixItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token/{token_prefix}", pathParameters);
    }
    /**
     * Instantiates a new WithToken_prefixItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTokenPrefixItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access_token/{token_prefix}", rawUrl);
    }
    /**
     * Revoke an access token
     * @return a AccessTokenRevokeResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenRevokeResponse delete() {
        return delete(null);
    }
    /**
     * Revoke an access token
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessTokenRevokeResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenRevokeResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessTokenRevokeResponse::createFromDiscriminatorValue);
    }
    /**
     * Update an existing access token
     * @param body AccessTokenUpdateRequestBody
     * @return a AccessTokenUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenUpdateResponse put(@jakarta.annotation.Nonnull final AccessTokenUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update an existing access token
     * @param body AccessTokenUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessTokenUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccessTokenUpdateResponse put(@jakarta.annotation.Nonnull final AccessTokenUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessTokenUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Revoke an access token
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Revoke an access token
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update an existing access token
     * @param body AccessTokenUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccessTokenUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update an existing access token
     * @param body AccessTokenUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccessTokenUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithTokenPrefixItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTokenPrefixItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTokenPrefixItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
