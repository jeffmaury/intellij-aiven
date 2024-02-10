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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /tenants/{tenant}/static-ip-availability
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StaticIpAvailabilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new StaticIpAvailabilityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StaticIpAvailabilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}/static-ip-availability", pathParameters);
    }
    /**
     * Instantiates a new StaticIpAvailabilityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StaticIpAvailabilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenants/{tenant}/static-ip-availability", rawUrl);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @return a PublicStaticIPAvailabilityListResponse
     */
    @jakarta.annotation.Nullable
    public PublicStaticIPAvailabilityListResponse get() {
        return get(null);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PublicStaticIPAvailabilityListResponse
     */
    @jakarta.annotation.Nullable
    public PublicStaticIPAvailabilityListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PublicStaticIPAvailabilityListResponse::createFromDiscriminatorValue);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List static IP address cloud availability and prices for a tenant
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
     * @return a StaticIpAvailabilityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public StaticIpAvailabilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StaticIpAvailabilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
