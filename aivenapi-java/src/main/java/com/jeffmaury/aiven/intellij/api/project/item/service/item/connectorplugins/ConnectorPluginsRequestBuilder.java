package com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorplugins;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorplugins.item.WithConnectorNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connector-plugins
 */
public class ConnectorPluginsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorPlugins.item collection
     * @param connector_name Unique identifier of the item
     * @return a WithConnectorNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithConnectorNameItemRequestBuilder byConnector_name(@javax.annotation.Nonnull final String connector_name) {
        Objects.requireNonNull(connector_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector_name", connector_name);
        return new WithConnectorNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConnectorPluginsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorPluginsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connector-plugins", pathParameters);
    }
    /**
     * Instantiates a new ConnectorPluginsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorPluginsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connector-plugins", rawUrl);
    }
}
