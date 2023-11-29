package com.jeffmaury.aiven.intellij.api.tenants.item;

import com.jeffmaury.aiven.intellij.api.tenants.item.pgavailableextensions.PgAvailableExtensionsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.tenants.item.privatelinkavailability.PrivatelinkAvailabilityRequestBuilder;
import com.jeffmaury.aiven.intellij.api.tenants.item.staticipavailability.StaticIpAvailabilityRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /tenants/{tenant}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTenantItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The pgAvailableExtensions property
     */
    @jakarta.annotation.Nonnull
    public PgAvailableExtensionsRequestBuilder pgAvailableExtensions() {
        return new PgAvailableExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The privatelinkAvailability property
     */
    @jakarta.annotation.Nonnull
    public PrivatelinkAvailabilityRequestBuilder privatelinkAvailability() {
        return new PrivatelinkAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The staticIpAvailability property
     */
    @jakarta.annotation.Nonnull
    public StaticIpAvailabilityRequestBuilder staticIpAvailability() {
        return new StaticIpAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTenantItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTenantItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}", pathParameters);
    }
    /**
     * Instantiates a new WithTenantItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTenantItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}", rawUrl);
    }
}
