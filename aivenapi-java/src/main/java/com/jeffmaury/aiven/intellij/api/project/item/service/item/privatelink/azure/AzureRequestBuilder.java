package com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure;

import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePrivatelinkAzureUpdateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.azure.connections.ConnectionsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/privatelink/azure
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureRequestBuilder extends BaseRequestBuilder {
    /**
     * The connections property
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AzureRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AzureRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure", pathParameters);
    }
    /**
     * Instantiates a new AzureRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AzureRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/privatelink/azure", rawUrl);
    }
    /**
     * Delete an Azure Privatelink Service
     * @return a ServicePrivatelinkAzureDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete an Azure Privatelink Service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get Azure Privatelink Service information
     * @return a ServicePrivatelinkAzureGetResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureGetResponse get() {
        return get(null);
    }
    /**
     * Get Azure Privatelink Service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureGetResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureCreateRequestBody
     * @return a ServicePrivatelinkAzureCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureCreateResponse post(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureCreateResponse post(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * Update an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureUpdateRequestBody
     * @return a ServicePrivatelinkAzureUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureUpdateResponse put(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrivatelinkAzureUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAzureUpdateResponse put(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePrivatelinkAzureUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete an Azure Privatelink Service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an Azure Privatelink Service
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
     * Get Azure Privatelink Service information
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get Azure Privatelink Service information
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
     * Create an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Update an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update an Azure Privatelink Service
     * @param body ServicePrivatelinkAzureUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePrivatelinkAzureUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a AzureRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AzureRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AzureRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
