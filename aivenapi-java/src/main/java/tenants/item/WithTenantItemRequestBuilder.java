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
public class WithTenantItemRequestBuilder extends BaseRequestBuilder {
    /** The pgAvailableExtensions property */
    @javax.annotation.Nonnull
    public PgAvailableExtensionsRequestBuilder pgAvailableExtensions() {
        return new PgAvailableExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The privatelinkAvailability property */
    @javax.annotation.Nonnull
    public PrivatelinkAvailabilityRequestBuilder privatelinkAvailability() {
        return new PrivatelinkAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The staticIpAvailability property */
    @javax.annotation.Nonnull
    public StaticIpAvailabilityRequestBuilder staticIpAvailability() {
        return new StaticIpAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTenantItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithTenantItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}", pathParameters);
    }
    /**
     * Instantiates a new WithTenantItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithTenantItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}", rawUrl);
    }
}
