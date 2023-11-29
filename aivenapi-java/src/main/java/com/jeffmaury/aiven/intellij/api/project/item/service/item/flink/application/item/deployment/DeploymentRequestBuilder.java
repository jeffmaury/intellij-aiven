package com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.deployment;

import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationDeploymentRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkCreateApplicationDeploymentResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceFlinkListApplicationDeploymentsResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.deployment.item.WithDeploymentItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}/deployment
 */
public class DeploymentRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.deployment.item collection
     * @param deployment_id Unique identifier of the item
     * @return a WithDeploymentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithDeploymentItemRequestBuilder byDeployment_id(@javax.annotation.Nonnull final String deployment_id) {
        Objects.requireNonNull(deployment_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deployment_id", deployment_id);
        return new WithDeploymentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeploymentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeploymentRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/deployment", pathParameters);
    }
    /**
     * Instantiates a new DeploymentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeploymentRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/deployment", rawUrl);
    }
    /**
     * Get all ApplicationDeployments
     * @return a CompletableFuture of ServiceFlinkListApplicationDeploymentsResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkListApplicationDeploymentsResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get all ApplicationDeployments
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkListApplicationDeploymentsResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkListApplicationDeploymentsResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @return a CompletableFuture of ServiceFlinkCreateApplicationDeploymentResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> post(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkCreateApplicationDeploymentResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkCreateApplicationDeploymentResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> post(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkCreateApplicationDeploymentResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get all ApplicationDeployments
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get all ApplicationDeployments
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
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
