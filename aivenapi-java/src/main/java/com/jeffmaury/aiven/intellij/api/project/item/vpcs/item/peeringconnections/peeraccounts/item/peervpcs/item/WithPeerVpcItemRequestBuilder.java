package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.item;

import com.jeffmaury.aiven.intellij.api.models.VpcPeeringConnectionDeleteResponse;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.item.peerregions.PeerRegionsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPeerVpcItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The peerRegions property
     */
    @jakarta.annotation.Nonnull
    public PeerRegionsRequestBuilder peerRegions() {
        return new PeerRegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithPeer_vpcItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerVpcItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}", pathParameters);
    }
    /**
     * Instantiates a new WithPeer_vpcItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPeerVpcItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}", rawUrl);
    }
    /**
     * Delete a peering connection for a project VPC
     * @return a VpcPeeringConnectionDeleteResponse
     */
    @jakarta.annotation.Nullable
    public VpcPeeringConnectionDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a peering connection for a project VPC
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcPeeringConnectionDeleteResponse
     */
    @jakarta.annotation.Nullable
    public VpcPeeringConnectionDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcPeeringConnectionDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a peering connection for a project VPC
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a peering connection for a project VPC
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithPeerVpcItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPeerVpcItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPeerVpcItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
