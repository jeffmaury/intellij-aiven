package com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.security.admin;

import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecurityResetRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecurityResetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecuritySetRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecuritySetResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/opensearch/security/admin
 */
public class AdminRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/security/admin", pathParameters);
    }
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/security/admin", rawUrl);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @return a CompletableFuture of ServiceOpenSearchSecuritySetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse> post(@javax.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchSecuritySetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceOpenSearchSecuritySetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse> post(@javax.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchSecuritySetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceOpenSearchSecuritySetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @return a CompletableFuture of ServiceOpenSearchSecurityResetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse> put(@javax.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchSecurityResetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceOpenSearchSecurityResetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse> put(@javax.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceOpenSearchSecurityResetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceOpenSearchSecurityResetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
