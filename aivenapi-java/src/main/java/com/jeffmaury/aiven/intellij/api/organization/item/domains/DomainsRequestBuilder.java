package com.jeffmaury.aiven.intellij.api.organization.item.domains;

import com.jeffmaury.aiven.intellij.api.models.OrganizationDomainAddRequestBody;
import com.jeffmaury.aiven.intellij.api.models.OrganizationDomainAddResponse;
import com.jeffmaury.aiven.intellij.api.models.OrganizationDomainsListResponse;
import com.jeffmaury.aiven.intellij.api.organization.item.domains.item.WithDomainItemRequestBuilder;
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
 * Builds and executes requests for operations under /organization/{organization_id}/domains
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.organization.item.domains.item collection
     * @param domain_id ID of a domain
     * @return a WithDomainItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDomainItemRequestBuilder byDomain_id(@jakarta.annotation.Nonnull final String domain_id) {
        Objects.requireNonNull(domain_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domain_id", domain_id);
        return new WithDomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DomainsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/domains", pathParameters);
    }
    /**
     * Instantiates a new DomainsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/domains", rawUrl);
    }
    /**
     * <p>Returns a list of all verified domains in an organization.</p>
     * @return a OrganizationDomainsListResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainsListResponse get() {
        return get(null);
    }
    /**
     * <p>Returns a list of all verified domains in an organization.</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationDomainsListResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainsListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationDomainsListResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Creates a new domain in an organization.</p>
     * @param body OrganizationDomainAddRequestBody
     * @return a OrganizationDomainAddResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainAddResponse post(@jakarta.annotation.Nonnull final OrganizationDomainAddRequestBody body) {
        return post(body, null);
    }
    /**
     * <p>Creates a new domain in an organization.</p>
     * @param body OrganizationDomainAddRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationDomainAddResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainAddResponse post(@jakarta.annotation.Nonnull final OrganizationDomainAddRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationDomainAddResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Returns a list of all verified domains in an organization.</p>
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * <p>Returns a list of all verified domains in an organization.</p>
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
     * <p>Creates a new domain in an organization.</p>
     * @param body OrganizationDomainAddRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationDomainAddRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>Creates a new domain in an organization.</p>
     * @param body OrganizationDomainAddRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationDomainAddRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a DomainsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DomainsRequestBuilder(rawUrl, requestAdapter);
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
