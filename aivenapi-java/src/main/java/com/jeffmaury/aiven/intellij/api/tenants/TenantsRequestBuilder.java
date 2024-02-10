package com.jeffmaury.aiven.intellij.api.tenants;

import com.jeffmaury.aiven.intellij.api.tenants.item.WithTenantItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /tenants
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.tenants.item collection
     * @param tenant Aiven tenant ID
     * @return a WithTenantItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTenantItemRequestBuilder byTenant(@jakarta.annotation.Nonnull final String tenant) {
        Objects.requireNonNull(tenant);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tenant", tenant);
        return new WithTenantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TenantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants", pathParameters);
    }
    /**
     * Instantiates a new TenantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants", rawUrl);
    }
}
