package com.jeffmaury.aiven.intellij.api.project.item.vpcpeeringconnectiontypes;

import com.jeffmaury.aiven.intellij.api.models.ListProjectVpcPeeringConnectionTypesResponse;
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
 * Builds and executes requests for operations under /project/{project}/vpc-peering-connection-types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcPeeringConnectionTypesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new VpcPeeringConnectionTypesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VpcPeeringConnectionTypesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpc-peering-connection-types", pathParameters);
    }
    /**
     * Instantiates a new VpcPeeringConnectionTypesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VpcPeeringConnectionTypesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpc-peering-connection-types", rawUrl);
    }
    /**
     * List VPC peering connection types for a project
     * @return a CompletableFuture of ListProjectVpcPeeringConnectionTypesResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ListProjectVpcPeeringConnectionTypesResponse> get() {
        return get(null);
    }
    /**
     * List VPC peering connection types for a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ListProjectVpcPeeringConnectionTypesResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ListProjectVpcPeeringConnectionTypesResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ListProjectVpcPeeringConnectionTypesResponse::createFromDiscriminatorValue, null);
    }
    /**
     * List VPC peering connection types for a project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List VPC peering connection types for a project
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a VpcPeeringConnectionTypesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VpcPeeringConnectionTypesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VpcPeeringConnectionTypesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
