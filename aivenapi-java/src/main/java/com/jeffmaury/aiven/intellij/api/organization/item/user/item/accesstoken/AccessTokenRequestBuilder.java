package com.jeffmaury.aiven.intellij.api.organization.item.user.item.accesstoken;

import com.jeffmaury.aiven.intellij.api.organization.item.user.item.accesstoken.item.WithTokenPrefixItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{organization_id}/user/{member_user_id}/access-token
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessTokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.organization.item.user.item.accessToken.item collection
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
     * Instantiates a new AccessTokenRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessTokenRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user/{member_user_id}/access-token", pathParameters);
    }
    /**
     * Instantiates a new AccessTokenRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessTokenRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user/{member_user_id}/access-token", rawUrl);
    }
}
