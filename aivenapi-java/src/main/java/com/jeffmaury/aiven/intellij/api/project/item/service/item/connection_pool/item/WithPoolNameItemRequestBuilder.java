package com.jeffmaury.aiven.intellij.api.project.item.service.item.connection_pool.item;

import com.jeffmaury.aiven.intellij.api.models.ServicePGBouncerDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServicePGBouncerUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServicePGBouncerUpdateResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/connection_pool/{pool_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPoolNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithPool_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPoolNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connection_pool/{pool_name}", pathParameters);
    }
    /**
     * Instantiates a new WithPool_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPoolNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/connection_pool/{pool_name}", rawUrl);
    }
    /**
     * Delete a connection pool
     * @return a ServicePGBouncerDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a connection pool
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePGBouncerDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePGBouncerDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Update a connection pool
     * @param body ServicePGBouncerUpdateRequestBody
     * @return a ServicePGBouncerUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerUpdateResponse put(@jakarta.annotation.Nonnull final ServicePGBouncerUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a connection pool
     * @param body ServicePGBouncerUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePGBouncerUpdateResponse
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerUpdateResponse put(@jakarta.annotation.Nonnull final ServicePGBouncerUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServicePGBouncerUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a connection pool
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a connection pool
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
     * Update a connection pool
     * @param body ServicePGBouncerUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePGBouncerUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a connection pool
     * @param body ServicePGBouncerUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServicePGBouncerUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithPoolNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithPoolNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPoolNameItemRequestBuilder(rawUrl, requestAdapter);
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
