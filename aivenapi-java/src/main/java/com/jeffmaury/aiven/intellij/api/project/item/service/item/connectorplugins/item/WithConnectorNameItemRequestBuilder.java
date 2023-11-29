package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorplugins.item;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorplugins.item.configuration.ConfigurationRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connector-plugins/{connector_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithConnectorNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The configuration property
     */
    @jakarta.annotation.Nonnull
    public ConfigurationRequestBuilder configuration() {
        return new ConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithConnector_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConnectorNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connector-plugins/{connector_name}", pathParameters);
    }
    /**
     * Instantiates a new WithConnector_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithConnectorNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connector-plugins/{connector_name}", rawUrl);
    }
}
