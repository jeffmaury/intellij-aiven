package com.jeffmaury.aiven.intellij.api.project.item.vpcs;

import com.jeffmaury.aiven.intellij.api.models.VpcCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.VpcCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.VpcListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.vpcs.item.WithProjectVpcItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/vpcs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.vpcs.item collection
     * @param project_vpc_id Project VPC ID
     * @return a WithProjectVpcItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProjectVpcItemRequestBuilder byProject_vpc_id(@jakarta.annotation.Nonnull final String project_vpc_id) {
        Objects.requireNonNull(project_vpc_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("project_vpc_id", project_vpc_id);
        return new WithProjectVpcItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VpcsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VpcsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs", pathParameters);
    }
    /**
     * Instantiates a new VpcsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VpcsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/vpcs", rawUrl);
    }
    /**
     * List VPCs for a project
     * @return a VpcListResponse
     */
    @jakarta.annotation.Nullable
    public VpcListResponse get() {
        return get(null);
    }
    /**
     * List VPCs for a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcListResponse
     */
    @jakarta.annotation.Nullable
    public VpcListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a VPC in a cloud for the project
     * @param body VpcCreateRequestBody
     * @return a VpcCreateResponse
     */
    @jakarta.annotation.Nullable
    public VpcCreateResponse post(@jakarta.annotation.Nonnull final VpcCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a VPC in a cloud for the project
     * @param body VpcCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VpcCreateResponse
     */
    @jakarta.annotation.Nullable
    public VpcCreateResponse post(@jakarta.annotation.Nonnull final VpcCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VpcCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List VPCs for a project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List VPCs for a project
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
     * Create a VPC in a cloud for the project
     * @param body VpcCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VpcCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a VPC in a cloud for the project
     * @param body VpcCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VpcCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a VpcsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VpcsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VpcsRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
