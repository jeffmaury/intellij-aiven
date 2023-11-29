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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/static-ips/{static_ip_address_id}
 */
public class WithStaticIpAddressItemRequestBuilder extends BaseRequestBuilder {
    /** The association property */
    @javax.annotation.Nonnull
    public AssociationRequestBuilder association() {
        return new AssociationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithStatic_ip_address_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithStaticIpAddressItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips/{static_ip_address_id}", pathParameters);
    }
    /**
     * Instantiates a new WithStatic_ip_address_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithStaticIpAddressItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/static-ips/{static_ip_address_id}", rawUrl);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @return a CompletableFuture of ProjectStaticIPPatchResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> patch(@javax.annotation.Nonnull final ProjectStaticIPPatchRequestBody body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ProjectStaticIPPatchResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ProjectStaticIPPatchResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> patch(@javax.annotation.Nonnull final ProjectStaticIPPatchRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ProjectStaticIPPatchResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse> executionException = new java.util.concurrent.CompletableFuture<ProjectStaticIPPatchResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ProjectStaticIPPatchRequestBody body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a static IP address configuration
     * @param body ProjectStaticIPPatchRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ProjectStaticIPPatchRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
