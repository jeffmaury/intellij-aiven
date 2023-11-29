package com.jeffmaury.aiven.intellij.api.organization.item.config;

import com.jeffmaury.aiven.intellij.api.organization.item.config.authentication.AuthenticationRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{organization_id}/config
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigRequestBuilder extends BaseRequestBuilder {
    /**
     * The authentication property
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/config", pathParameters);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/config", rawUrl);
    }
}
