package com.jeffmaury.aiven.intellij.api.project.item.service.item.quota;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaQuotaCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaQuotaCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaQuotaDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaQuotaListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.quota.describe.DescribeRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/quota
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QuotaRequestBuilder extends BaseRequestBuilder {
    /**
     * The describe property
     */
    @jakarta.annotation.Nonnull
    public DescribeRequestBuilder describe() {
        return new DescribeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new QuotaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QuotaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/quota", pathParameters);
    }
    /**
     * Instantiates a new QuotaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QuotaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/quota", rawUrl);
    }
    /**
     * Delete Kafka quota
     * @return a ServiceKafkaQuotaDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete Kafka quota
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaQuotaDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaQuotaDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * List Kafka quotas
     * @return a ServiceKafkaQuotaListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaListResponse get() {
        return get(null);
    }
    /**
     * List Kafka quotas
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaQuotaListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaQuotaListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create Kafka quota
     * @param body ServiceKafkaQuotaCreateRequestBody
     * @return a ServiceKafkaQuotaCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaCreateResponse post(@jakarta.annotation.Nonnull final ServiceKafkaQuotaCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create Kafka quota
     * @param body ServiceKafkaQuotaCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaQuotaCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaCreateResponse post(@jakarta.annotation.Nonnull final ServiceKafkaQuotaCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaQuotaCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete Kafka quota
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete Kafka quota
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
     * List Kafka quotas
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List Kafka quotas
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
     * Create Kafka quota
     * @param body ServiceKafkaQuotaCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaQuotaCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create Kafka quota
     * @param body ServiceKafkaQuotaCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaQuotaCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a QuotaRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public QuotaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new QuotaRequestBuilder(rawUrl, requestAdapter);
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
}
