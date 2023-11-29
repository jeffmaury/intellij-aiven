package com.jeffmaury.aiven.intellij.api.organization;

import com.jeffmaury.aiven.intellij.api.organization.item.WithOrganizationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.organization.item collection
     * @param organization_id ID of an organization
     * @return a WithOrganizationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOrganizationItemRequestBuilder byOrganization_id(@jakarta.annotation.Nonnull final String organization_id) {
        Objects.requireNonNull(organization_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organization_id", organization_id);
        return new WithOrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new OrganizationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization", pathParameters);
    }
    /**
     * Instantiates a new OrganizationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization", rawUrl);
    }
}
