package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version;

import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationVersionRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationVersionResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.item.WithApplicationVersionItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.validate.ValidateRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}/version
 */
public class VersionRequestBuilder extends BaseRequestBuilder {
    /** The validate property */
    @javax.annotation.Nonnull
    public ValidateRequestBuilder validate() {
        return new ValidateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.version.item collection
     * @param application_version_id Unique identifier of the item
     * @return a WithApplicationVersionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithApplicationVersionItemRequestBuilder byApplication_version_id(@javax.annotation.Nonnull final String application_version_id) {
        Objects.requireNonNull(application_version_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("application_version_id", application_version_id);
        return new WithApplicationVersionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new VersionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version", pathParameters);
    }
    /**
     * Instantiates a new VersionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/version", rawUrl);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @return a CompletableFuture of ServiceFlinkCreateApplicationVersionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse> post(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkCreateApplicationVersionResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkCreateApplicationVersionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse> post(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkCreateApplicationVersionResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationVersionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a Flink ApplicationVersion
     * @param body ServiceFlinkCreateApplicationVersionRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationVersionRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
