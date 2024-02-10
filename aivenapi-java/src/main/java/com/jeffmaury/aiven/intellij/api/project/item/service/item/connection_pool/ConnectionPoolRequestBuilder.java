package com.jeffmaury.aiven.intellij.api.project.item.service.item.connection_pool;

import com.jeffmaury.aiven.intellij.api.models.ServicePGBouncerCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePGBouncerCreateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connection_pool.item.WithPoolNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connection_pool
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectionPoolRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.connection_pool.item collection
     * @param pool_name PgBouncer connection pool name
     * @return a WithPoolNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPoolNameItemRequestBuilder byPool_name(@jakarta.annotation.Nonnull final String pool_name) {
        Objects.requireNonNull(pool_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("pool_name", pool_name);
        return new WithPoolNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Connection_poolRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectionPoolRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connection_pool", pathParameters);
    }
    /**
     * Instantiates a new Connection_poolRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectionPoolRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connection_pool", rawUrl);
    }
    /**
     * Create a new connection pool for service
     * @param body ServicePGBouncerCreateRequestBody
     * @return a ServicePGBouncerCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerCreateResponse post(@jakarta.annotation.Nonnull final ServicePGBouncerCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new connection pool for service
     * @param body ServicePGBouncerCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePGBouncerCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerCreateResponse post(@jakarta.annotation.Nonnull final ServicePGBouncerCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePGBouncerCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new connection pool for service
     * @param body ServicePGBouncerCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePGBouncerCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new connection pool for service
     * @param body ServicePGBouncerCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePGBouncerCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ConnectionPoolRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConnectionPoolRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConnectionPoolRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
