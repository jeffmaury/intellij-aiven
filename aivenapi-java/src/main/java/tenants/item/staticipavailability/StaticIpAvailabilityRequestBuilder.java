package com.jeffmaury.aiven.intellij.api.tenants.item.staticipavailability;

import com.jeffmaury.aiven.intellij.api.models.PublicStaticIPAvailabilityListResponse;
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
 * Builds and executes requests for operations under /tenants/{tenant}/static-ip-availability
 */
public class StaticIpAvailabilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new StaticIpAvailabilityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public StaticIpAvailabilityRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}/static-ip-availability", pathParameters);
    }
    /**
     * Instantiates a new StaticIpAvailabilityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public StaticIpAvailabilityRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}/static-ip-availability", rawUrl);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @return a CompletableFuture of PublicStaticIPAvailabilityListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, PublicStaticIPAvailabilityListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse> executionException = new java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PublicStaticIPAvailabilityListResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, PublicStaticIPAvailabilityListResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse> executionException = new java.util.concurrent.CompletableFuture<PublicStaticIPAvailabilityListResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
