package com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.userpeernetworkcidrs;

import com.jeffmaury.aiven.intellij.api.models.VpcPeeringConnectionUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.VpcPeeringConnectionUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/vpcs/{project_vpc_id}/user-peer-network-cidrs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserPeerNetworkCidrsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UserPeerNetworkCidrsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserPeerNetworkCidrsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/user-peer-network-cidrs", pathParameters);
    }
    /**
     * Instantiates a new UserPeerNetworkCidrsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserPeerNetworkCidrsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs/{project_vpc_id}/user-peer-network-cidrs", rawUrl);
    }
    /**
     * Update user-defined peer network CIDRs for a project VPC
     * @param body VpcPeeringConnectionUpdateRequestBody
     * @return a VpcPeeringConnectionUpdateResponse
     */
    @jakarta.annotation.Nullable
    public VpcPeeringConnectionUpdateResponse put(@jakarta.annotation.Nonnull final VpcPeeringConnectionUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update user-defined peer network CIDRs for a project VPC
     * @param body VpcPeeringConnectionUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcPeeringConnectionUpdateResponse
     */
    @jakarta.annotation.Nullable
    public VpcPeeringConnectionUpdateResponse put(@jakarta.annotation.Nonnull final VpcPeeringConnectionUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcPeeringConnectionUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Update user-defined peer network CIDRs for a project VPC
     * @param body VpcPeeringConnectionUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final VpcPeeringConnectionUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update user-defined peer network CIDRs for a project VPC
     * @param body VpcPeeringConnectionUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final VpcPeeringConnectionUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UserPeerNetworkCidrsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserPeerNetworkCidrsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserPeerNetworkCidrsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
