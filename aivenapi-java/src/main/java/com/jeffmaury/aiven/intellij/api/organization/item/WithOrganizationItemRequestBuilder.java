package com.jeffmaury.aiven.intellij.api.organization.item;

import com.jeffmaury.aiven.intellij.api.models.OrganizationGetResponse;
import com.jeffmaury.aiven.intellij.api.models.OrganizationUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.OrganizationUpdateResponse;
import com.jeffmaury.aiven.intellij.api.organization.item.config.ConfigRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.domains.DomainsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.invitation.InvitationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.projects.ProjectsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.tickets.TicketsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.user.UserRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.usergroups.UserGroupsRequestBuilder;
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
 * Builds and executes requests for operations under /organization/{organization_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrganizationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The config property
     */
    @jakarta.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The domains property
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invitation property
     */
    @jakarta.annotation.Nonnull
    public InvitationRequestBuilder invitation() {
        return new InvitationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projects property
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tickets property
     */
    @jakarta.annotation.Nonnull
    public TicketsRequestBuilder tickets() {
        return new TicketsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The userGroups property
     */
    @jakarta.annotation.Nonnull
    public UserGroupsRequestBuilder userGroups() {
        return new UserGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}", pathParameters);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}", rawUrl);
    }
    /**
     * Get information about an organization
     * @return a OrganizationGetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationGetResponse get() {
        return get(null);
    }
    /**
     * Get information about an organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationGetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @return a OrganizationUpdateResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUpdateResponse patch(@jakarta.annotation.Nonnull final OrganizationUpdateRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationUpdateResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUpdateResponse patch(@jakarta.annotation.Nonnull final OrganizationUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Get information about an organization
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get information about an organization
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
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationUpdateRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithOrganizationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOrganizationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithOrganizationItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
