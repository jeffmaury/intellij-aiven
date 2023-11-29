package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.item.peerregions;

import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringconnections.peeraccounts.item.peervpcs.item.peerregions.item.WithPeerRegionItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}/peer-regions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeerRegionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.peeringConnections.peerAccounts.item.peerVpcs.item.peerRegions.item collection
     * @param peer_region AWS region
     * @return a WithPeerRegionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPeerRegionItemRequestBuilder byPeer_region(@jakarta.annotation.Nonnull final String peer_region) {
        Objects.requireNonNull(peer_region);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("peer_region", peer_region);
        return new WithPeerRegionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PeerRegionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerRegionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}/peer-regions", pathParameters);
    }
    /**
     * Instantiates a new PeerRegionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeerRegionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/peering-connections/peer-accounts/{peer_cloud_account}/peer-vpcs/{peer_vpc}/peer-regions", rawUrl);
    }
}
