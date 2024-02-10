package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors;

import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectCreateConnectorRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectCreateConnectorResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceKafkaConnectListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item.WithConnectorNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connectors
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.item collection
     * @param connector_name Connector name
     * @return a WithConnectorNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithConnectorNameItemRequestBuilder byConnector_name(@jakarta.annotation.Nonnull final String connector_name) {
        Objects.requireNonNull(connector_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector_name", connector_name);
        return new WithConnectorNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConnectorsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors", pathParameters);
    }
    /**
     * Instantiates a new ConnectorsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connectors", rawUrl);
    }
    /**
     * Lists Kafka connectors
     * @return a ServiceKafkaConnectListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectListResponse get() {
        return get(null);
    }
    /**
     * Lists Kafka connectors
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaConnectListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaConnectListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a Kafka Connect connector
     * @param body ServiceKafkaConnectCreateConnectorRequestBody
     * @return a ServiceKafkaConnectCreateConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectCreateConnectorResponse post(@jakarta.annotation.Nonnull final ServiceKafkaConnectCreateConnectorRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a Kafka Connect connector
     * @param body ServiceKafkaConnectCreateConnectorRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceKafkaConnectCreateConnectorResponse
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectCreateConnectorResponse post(@jakarta.annotation.Nonnull final ServiceKafkaConnectCreateConnectorRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceKafkaConnectCreateConnectorResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists Kafka connectors
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists Kafka connectors
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
     * Create a Kafka Connect connector
     * @param body ServiceKafkaConnectCreateConnectorRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaConnectCreateConnectorRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a Kafka Connect connector
     * @param body ServiceKafkaConnectCreateConnectorRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceKafkaConnectCreateConnectorRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ConnectorsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConnectorsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConnectorsRequestBuilder(rawUrl, requestAdapter);
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
