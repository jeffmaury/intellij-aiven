package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item;

import com.jeffmaury.aiven.intellij.api.models.VpcDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.VpcGetResponse;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.PeeringConnectionsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.userpeernetworkcidrs.UserPeerNetworkCidrsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectVpcItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The peeringConnections property
     */
    @jakarta.annotation.Nonnull
    public PeeringConnectionsRequestBuilder peeringConnections() {
        return new PeeringConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The userPeerNetworkCidrs property
     */
    @jakarta.annotation.Nonnull
    public UserPeerNetworkCidrsRequestBuilder userPeerNetworkCidrs() {
        return new UserPeerNetworkCidrsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithProject_vpc_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectVpcItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}", pathParameters);
    }
    /**
     * Instantiates a new WithProject_vpc_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectVpcItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}", rawUrl);
    }
    /**
     * Delete a project VPC
     * @return a VpcDeleteResponse
     */
    @jakarta.annotation.Nullable
    public VpcDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a project VPC
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcDeleteResponse
     */
    @jakarta.annotation.Nullable
    public VpcDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get VPC information
     * @return a VpcGetResponse
     */
    @jakarta.annotation.Nullable
    public VpcGetResponse get() {
        return get(null);
    }
    /**
     * Get VPC information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcGetResponse
     */
    @jakarta.annotation.Nullable
    public VpcGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a project VPC
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a project VPC
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get VPC information
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get VPC information
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithProjectVpcItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProjectVpcItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithProjectVpcItemRequestBuilder(rawUrl, requestAdapter);
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
}
