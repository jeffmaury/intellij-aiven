package com.jeffmaury.aiven.intellij.api.project.item.staticips.item;

import com.jeffmaury.aiven.intellij.api.models.ProjectStaticIPPatchRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ProjectStaticIPPatchResponse;
import com.jeffmaury.aiven.intellij.api.project.item.staticips.item.association.AssociationRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/static-ips/{static_ip_address_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithStaticIpAddressItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The association property
     */
    @jakarta.annotation.Nonnull
    public AssociationRequestBuilder association() {
        return new AssociationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithStatic_ip_address_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStaticIpAddressItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips/{static_ip_address_id}", pathParameters);
    }
    /**
     * Instantiates a new WithStatic_ip_address_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStaticIpAddressItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips/{static_ip_address_id}", rawUrl);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @return a CompletableFuture of ProjectStaticIPPatchResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> patch(@jakarta.annotation.Nonnull final ProjectStaticIPPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectStaticIPPatchResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> patch(@jakarta.annotation.Nonnull final ProjectStaticIPPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ProjectStaticIPPatchResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ProjectStaticIPPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ProjectStaticIPPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithStaticIpAddressItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithStaticIpAddressItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithStaticIpAddressItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
