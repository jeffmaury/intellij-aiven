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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The alerts property
     */
    @jakarta.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clouds property
     */
    @jakarta.annotation.Nonnull
    public CloudsRequestBuilder clouds() {
        return new CloudsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The credits property
     */
    @jakarta.annotation.Nonnull
    public CreditsRequestBuilder credits() {
        return new CreditsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The downloadSbom property
     */
    @jakarta.annotation.Nonnull
    public DownloadSbomRequestBuilder downloadSbom() {
        return new DownloadSbomRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The generateSbomDownloadUrl property
     */
    @jakarta.annotation.Nonnull
    public GenerateSbomDownloadUrlRequestBuilder generateSbomDownloadUrl() {
        return new GenerateSbomDownloadUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration property
     */
    @jakarta.annotation.Nonnull
    public IntegrationRequestBuilder integration() {
        return new IntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration_endpoint property
     */
    @jakarta.annotation.Nonnull
    public IntegrationEndpointRequestBuilder integrationEndpoint() {
        return new IntegrationEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration_endpoint_types property
     */
    @jakarta.annotation.Nonnull
    public IntegrationEndpointTypesRequestBuilder integrationEndpointTypes() {
        return new IntegrationEndpointTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration_types property
     */
    @jakarta.annotation.Nonnull
    public IntegrationTypesRequestBuilder integrationTypes() {
        return new IntegrationTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invite property
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invoice property
     */
    @jakarta.annotation.Nonnull
    public InvoiceRequestBuilder invoice() {
        return new InvoiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The kms property
     */
    @jakarta.annotation.Nonnull
    public KmsRequestBuilder kms() {
        return new KmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The privatelinkAvailability property
     */
    @jakarta.annotation.Nonnull
    public PrivatelinkAvailabilityRequestBuilder privatelinkAvailability() {
        return new PrivatelinkAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The service property
     */
    @jakarta.annotation.Nonnull
    public ServiceRequestBuilder service() {
        return new ServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The service_types property
     */
    @jakarta.annotation.Nonnull
    public ServiceTypesRequestBuilder serviceTypes() {
        return new ServiceTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The staticIpAvailability property
     */
    @jakarta.annotation.Nonnull
    public StaticIpAvailabilityRequestBuilder staticIpAvailability() {
        return new StaticIpAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The staticIps property
     */
    @jakarta.annotation.Nonnull
    public StaticIpsRequestBuilder staticIps() {
        return new StaticIpsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tags property
     */
    @jakarta.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
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
     * The users property
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The vpcPeeringConnectionTypes property
     */
    @jakarta.annotation.Nonnull
    public VpcPeeringConnectionTypesRequestBuilder vpcPeeringConnectionTypes() {
        return new VpcPeeringConnectionTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The vpcs property
     */
    @jakarta.annotation.Nonnull
    public VpcsRequestBuilder vpcs() {
        return new VpcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}", pathParameters);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}", rawUrl);
    }
    /**
     * Delete project
     * @return a CompletableFuture of ProjectDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectDeleteResponse> delete() {
        return delete(null);
    }
    /**
     * Delete project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectDeleteResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectDeleteResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get project details
     * @return a CompletableFuture of ProjectGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectGetResponse> get() {
        return get(null);
    }
    /**
     * Get project details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @return a CompletableFuture of ProjectUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUpdateResponse> put(@jakarta.annotation.Nonnull final ProjectUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectUpdateResponse> put(@jakarta.annotation.Nonnull final ProjectUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectUpdateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Delete project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get project details
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get project details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update project
     * @param body ProjectUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ProjectUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithProjectItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProjectItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithProjectItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
