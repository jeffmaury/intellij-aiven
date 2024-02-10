package com.jeffmaury.aiven.intellij.api.project.item.staticips;

import com.jeffmaury.aiven.intellij.api.models.StaticIPCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.StaticIPCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.StaticIPListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.staticips.item.WithStaticIpAddressItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/static-ips
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StaticIpsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.staticIps.item collection
     * @param static_ip_address_id Static IP address identifier
     * @return a WithStaticIpAddressItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithStaticIpAddressItemRequestBuilder byStatic_ip_address_id(@jakarta.annotation.Nonnull final String static_ip_address_id) {
        Objects.requireNonNull(static_ip_address_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("static_ip_address_id", static_ip_address_id);
        return new WithStaticIpAddressItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new StaticIpsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StaticIpsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips", pathParameters);
    }
    /**
     * Instantiates a new StaticIpsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StaticIpsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips", rawUrl);
    }
    /**
     * List static IP addresses
     * @return a StaticIPListResponse
     */
    @jakarta.annotation.Nullable
    public StaticIPListResponse get() {
        return get(null);
    }
    /**
     * List static IP addresses
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a StaticIPListResponse
     */
    @jakarta.annotation.Nullable
    public StaticIPListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StaticIPListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create static IP address
     * @param body StaticIPCreateRequestBody
     * @return a StaticIPCreateResponse
     */
    @jakarta.annotation.Nullable
    public StaticIPCreateResponse post(@jakarta.annotation.Nonnull final StaticIPCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create static IP address
     * @param body StaticIPCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a StaticIPCreateResponse
     */
    @jakarta.annotation.Nullable
    public StaticIPCreateResponse post(@jakarta.annotation.Nonnull final StaticIPCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StaticIPCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List static IP addresses
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List static IP addresses
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
     * Create static IP address
     * @param body StaticIPCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StaticIPCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create static IP address
     * @param body StaticIPCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StaticIPCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a StaticIpsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public StaticIpsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StaticIpsRequestBuilder(rawUrl, requestAdapter);
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
