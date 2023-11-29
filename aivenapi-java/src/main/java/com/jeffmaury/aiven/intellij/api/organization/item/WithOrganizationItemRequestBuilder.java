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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{organization_id}
 */
public class WithOrganizationItemRequestBuilder extends BaseRequestBuilder {
    /** The config property */
    @javax.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /** The domains property */
    @javax.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invitation property */
    @javax.annotation.Nonnull
    public InvitationRequestBuilder invitation() {
        return new InvitationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The projects property */
    @javax.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tickets property */
    @javax.annotation.Nonnull
    public TicketsRequestBuilder tickets() {
        return new TicketsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The user property */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The userGroups property */
    @javax.annotation.Nonnull
    public UserGroupsRequestBuilder userGroups() {
        return new UserGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithOrganizationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}", pathParameters);
    }
    /**
     * Instantiates a new WithOrganization_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithOrganizationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}", rawUrl);
    }
    /**
     * Get information about an organization
     * @return a CompletableFuture of OrganizationGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationGetResponse> executionException = new java.util.concurrent.CompletableFuture<OrganizationGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get information about an organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of OrganizationGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationGetResponse> executionException = new java.util.concurrent.CompletableFuture<OrganizationGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @return a CompletableFuture of OrganizationUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationUpdateResponse> patch(@javax.annotation.Nonnull final OrganizationUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<OrganizationUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of OrganizationUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationUpdateResponse> patch(@javax.annotation.Nonnull final OrganizationUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<OrganizationUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get information about an organization
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get information about an organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationUpdateRequestBody body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update organization's details
     * @param body OrganizationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
