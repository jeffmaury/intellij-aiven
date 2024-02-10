package com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.availableextensions;

import com.jeffmaury.aiven.intellij.api.models.PGServiceAvailableExtensionsResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/pg/available-extensions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AvailableExtensionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AvailableExtensionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AvailableExtensionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg/available-extensions", pathParameters);
    }
    /**
     * Instantiates a new AvailableExtensionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AvailableExtensionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg/available-extensions", rawUrl);
    }
    /**
     * List PostgreSQL extensions that can be loaded with CREATE EXTENSION in this service
     * @return a PGServiceAvailableExtensionsResponse
     */
    @jakarta.annotation.Nullable
    public PGServiceAvailableExtensionsResponse get() {
        return get(null);
    }
    /**
     * List PostgreSQL extensions that can be loaded with CREATE EXTENSION in this service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PGServiceAvailableExtensionsResponse
     */
    @jakarta.annotation.Nullable
    public PGServiceAvailableExtensionsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PGServiceAvailableExtensionsResponse::createFromDiscriminatorValue);
    }
    /**
     * List PostgreSQL extensions that can be loaded with CREATE EXTENSION in this service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List PostgreSQL extensions that can be loaded with CREATE EXTENSION in this service
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AvailableExtensionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AvailableExtensionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AvailableExtensionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
