package com.jeffmaury.aiven.intellij.api.project.item.service.item.topic.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaTopicDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaTopicGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaTopicUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaTopicUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/topic/{topic_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTopicNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithTopic_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/topic/{topic_name}", pathParameters);
    }
    /**
     * Instantiates a new WithTopic_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTopicNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/topic/{topic_name}", rawUrl);
    }
    /**
     * Delete a Kafka topic
     * @return a ServiceKafkaTopicDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a Kafka topic
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaTopicDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaTopicDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get Kafka topic info
     * @return a ServiceKafkaTopicGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponse get() {
        return get(null);
    }
    /**
     * Get Kafka topic info
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaTopicGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaTopicGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update a Kafka topic
     * @param body ServiceKafkaTopicUpdateRequestBody
     * @return a ServiceKafkaTopicUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateResponse put(@jakarta.annotation.Nonnull final ServiceKafkaTopicUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a Kafka topic
     * @param body ServiceKafkaTopicUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaTopicUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateResponse put(@jakarta.annotation.Nonnull final ServiceKafkaTopicUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaTopicUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a Kafka topic
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a Kafka topic
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
     * Get Kafka topic info
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get Kafka topic info
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
     * Update a Kafka topic
     * @param body ServiceKafkaTopicUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaTopicUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a Kafka topic
     * @param body ServiceKafkaTopicUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaTopicUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithTopicNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTopicNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTopicNameItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
