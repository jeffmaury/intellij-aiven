package com.jeffmaury.aiven.intellij.api.project.item;

import com.jeffmaury.aiven.intellij.api.models.ProjectDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ProjectUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectUpdateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.alerts.AlertsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.clouds.CloudsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.credits.CreditsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.downloadsbom.DownloadSbomRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.events.EventsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.generatesbomdownloadurl.GenerateSbomDownloadUrlRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint_types.IntegrationEndpointTypesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.integration_endpoint.IntegrationEndpointRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.integration_types.IntegrationTypesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.integration.IntegrationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.invite.InviteRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.invoice.InvoiceRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.kms.KmsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.privatelinkavailability.PrivatelinkAvailabilityRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service_types.ServiceTypesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.ServiceRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.staticipavailability.StaticIpAvailabilityRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.staticips.StaticIpsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.tags.TagsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.tickets.TicketsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.user.UserRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.users.UsersRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.vpcpeeringconnectiontypes.VpcPeeringConnectionTypesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.VpcsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}
 */
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /** The alerts property */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The clouds property */
    @javax.annotation.Nonnull
    public CloudsRequestBuilder clouds() {
        return new CloudsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The credits property */
    @javax.annotation.Nonnull
    public CreditsRequestBuilder credits() {
        return new CreditsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The downloadSbom property */
    @javax.annotation.Nonnull
    public DownloadSbomRequestBuilder downloadSbom() {
        return new DownloadSbomRequestBuilder(pathParameters, requestAdapter);
    }
    /** The events property */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The generateSbomDownloadUrl property */
    @javax.annotation.Nonnull
    public GenerateSbomDownloadUrlRequestBuilder generateSbomDownloadUrl() {
        return new GenerateSbomDownloadUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /** The integration property */
    @javax.annotation.Nonnull
    public IntegrationRequestBuilder integration() {
        return new IntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The integration_endpoint property */
    @javax.annotation.Nonnull
    public IntegrationEndpointRequestBuilder integration_endpoint() {
        return new IntegrationEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /** The integration_endpoint_types property */
    @javax.annotation.Nonnull
    public IntegrationEndpointTypesRequestBuilder integration_endpoint_types() {
        return new IntegrationEndpointTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The integration_types property */
    @javax.annotation.Nonnull
    public IntegrationTypesRequestBuilder integration_types() {
        return new IntegrationTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invite property */
    @javax.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invoice property */
    @javax.annotation.Nonnull
    public InvoiceRequestBuilder invoice() {
        return new InvoiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kms property */
    @javax.annotation.Nonnull
    public KmsRequestBuilder kms() {
        return new KmsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The privatelinkAvailability property */
    @javax.annotation.Nonnull
    public PrivatelinkAvailabilityRequestBuilder privatelinkAvailability() {
        return new PrivatelinkAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The service property */
    @javax.annotation.Nonnull
    public ServiceRequestBuilder service() {
        return new ServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The service_types property */
    @javax.annotation.Nonnull
    public ServiceTypesRequestBuilder service_types() {
        return new ServiceTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The staticIpAvailability property */
    @javax.annotation.Nonnull
    public StaticIpAvailabilityRequestBuilder staticIpAvailability() {
        return new StaticIpAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The staticIps property */
    @javax.annotation.Nonnull
    public StaticIpsRequestBuilder staticIps() {
        return new StaticIpsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tags property */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
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
    /** The users property */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The vpcPeeringConnectionTypes property */
    @javax.annotation.Nonnull
    public VpcPeeringConnectionTypesRequestBuilder vpcPeeringConnectionTypes() {
        return new VpcPeeringConnectionTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The vpcs property */
    @javax.annotation.Nonnull
    public VpcsRequestBuilder vpcs() {
        return new VpcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithProjectItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}", pathParameters);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithProjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}", rawUrl);
    }
    /**
     * Delete project
     * @return a CompletableFuture of ProjectDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get project details
     * @return a CompletableFuture of ProjectGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectGetResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get project details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectGetResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @return a CompletableFuture of ProjectUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUpdateResponse> put(@javax.annotation.Nonnull final ProjectUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUpdateResponse> put(@javax.annotation.Nonnull final ProjectUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete project
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get project details
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get project details
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
     * Update project
     * @param body ProjectUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ProjectUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
