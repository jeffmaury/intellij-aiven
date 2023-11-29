package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.item.WithPeerVpcItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeerVpcsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringConnections.peerAccounts.item.peerVpcs.item collection
     * @param peer_vpc AWS VPC-ID, Google network name, Azure VNet name, or UpCloud VPC ID
     * @return a WithPeerVpcItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPeerVpcItemRequestBuilder byPeer_vpc(@jakarta.annotation.Nonnull final String peer_vpc) {
        Objects.requireNonNull(peer_vpc);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("peer_vpc", peer_vpc);
        return new WithPeerVpcItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PeerVpcsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerVpcsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs", pathParameters);
    }
    /**
     * Instantiates a new PeerVpcsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerVpcsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs", rawUrl);
    }
}
