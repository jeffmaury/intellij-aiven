package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectDeleteConnectorResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectEditConnectorRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectEditConnectorResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.pause.PauseRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.restart.RestartRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.resume.ResumeRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.status.StatusRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.tasks.TasksRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connectors/{connector_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithConnectorNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The pause property
     */
    @jakarta.annotation.Nonnull
    public PauseRequestBuilder pause() {
        return new PauseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The restart property
     */
    @jakarta.annotation.Nonnull
    public RestartRequestBuilder restart() {
        return new RestartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resume property
     */
    @jakarta.annotation.Nonnull
    public ResumeRequestBuilder resume() {
        return new ResumeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The status property
     */
    @jakarta.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tasks property
     */
    @jakarta.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithConnector_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConnectorNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}", pathParameters);
    }
    /**
     * Instantiates a new WithConnector_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConnectorNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors/{connector_name}", rawUrl);
    }
    /**
     * Delete Kafka Connect connector
     * @return a ServiceKafkaConnectDeleteConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectDeleteConnectorResponse delete() {
        return delete(null);
    }
    /**
     * Delete Kafka Connect connector
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaConnectDeleteConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectDeleteConnectorResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaConnectDeleteConnectorResponse::createFromDiscriminatorValue);
    }
    /**
     * Edit Kafka Connect connector
     * @param body ServiceKafkaConnectEditConnectorRequestBody
     * @return a ServiceKafkaConnectEditConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectEditConnectorResponse put(@jakarta.annotation.Nonnull final ServiceKafkaConnectEditConnectorRequestBody body) {
        return put(body, null);
    }
    /**
     * Edit Kafka Connect connector
     * @param body ServiceKafkaConnectEditConnectorRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaConnectEditConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectEditConnectorResponse put(@jakarta.annotation.Nonnull final ServiceKafkaConnectEditConnectorRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaConnectEditConnectorResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete Kafka Connect connector
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete Kafka Connect connector
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
     * Edit Kafka Connect connector
     * @param body ServiceKafkaConnectEditConnectorRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaConnectEditConnectorRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Edit Kafka Connect connector
     * @param body ServiceKafkaConnectEditConnectorRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaConnectEditConnectorRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithConnectorNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithConnectorNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithConnectorNameItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
