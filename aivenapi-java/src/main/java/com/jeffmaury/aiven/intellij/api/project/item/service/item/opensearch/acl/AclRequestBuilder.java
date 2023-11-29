package com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.acl;

import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchAclGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchAclSetRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchAclSetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchAclUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchAclUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/opensearch/acl
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AclRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AclRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AclRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/acl", pathParameters);
    }
    /**
     * Instantiates a new AclRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AclRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/acl", rawUrl);
    }
    /**
     * Show OpenSearch ACL configuration
     * @return a CompletableFuture of ServiceOpenSearchAclGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclGetResponse> get() {
        return get(null);
    }
    /**
     * Show OpenSearch ACL configuration
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceOpenSearchAclGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchAclGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Set OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclSetRequestBody
     * @return a CompletableFuture of ServiceOpenSearchAclSetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclSetResponse> post(@jakarta.annotation.Nonnull final ServiceOpenSearchAclSetRequestBody body) {
        return post(body, null);
    }
    /**
     * Set OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclSetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceOpenSearchAclSetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclSetResponse> post(@jakarta.annotation.Nonnull final ServiceOpenSearchAclSetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchAclSetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclUpdateRequestBody
     * @return a CompletableFuture of ServiceOpenSearchAclUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclUpdateResponse> put(@jakarta.annotation.Nonnull final ServiceOpenSearchAclUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceOpenSearchAclUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchAclUpdateResponse> put(@jakarta.annotation.Nonnull final ServiceOpenSearchAclUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchAclUpdateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Show OpenSearch ACL configuration
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Show OpenSearch ACL configuration
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
     * Set OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclSetRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchAclSetRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Set OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclSetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchAclSetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Update OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchAclUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update OpenSearch ACL configuration
     * @param body ServiceOpenSearchAclUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchAclUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a AclRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AclRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AclRequestBuilder(rawUrl, requestAdapter);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
