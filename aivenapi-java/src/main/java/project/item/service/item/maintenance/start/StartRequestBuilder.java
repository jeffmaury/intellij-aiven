package com.jeffmaury.aiven.intellij.api.project.item.service.item.maintenance.start;

import com.jeffmaury.aiven.intellij.api.models.ServiceMaintenanceStartResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/maintenance/start
 */
public class StartRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new StartRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public StartRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/maintenance/start", pathParameters);
    }
    /**
     * Instantiates a new StartRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public StartRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/maintenance/start", rawUrl);
    }
    /**
     * Start maintenance updates
     * @return a CompletableFuture of ServiceMaintenanceStartResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse> put() {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceMaintenanceStartResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Start maintenance updates
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceMaintenanceStartResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse> put(@javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceMaintenanceStartResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceMaintenanceStartResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Start maintenance updates
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation() throws URISyntaxException {
        return toPutRequestInformation(null);
    }
    /**
     * Start maintenance updates
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
