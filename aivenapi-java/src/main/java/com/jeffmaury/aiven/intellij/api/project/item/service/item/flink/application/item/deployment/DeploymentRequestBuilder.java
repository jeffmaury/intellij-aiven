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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/flink/application/{application_id}/deployment
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeploymentRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.application.item.deployment.item collection
     * @param deployment_id Deployment Id
     * @return a WithDeploymentItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDeploymentItemRequestBuilder byDeployment_id(@jakarta.annotation.Nonnull final String deployment_id) {
        Objects.requireNonNull(deployment_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deployment_id", deployment_id);
        return new WithDeploymentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeploymentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeploymentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/deployment", pathParameters);
    }
    /**
     * Instantiates a new DeploymentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeploymentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/flink/application/{application_id}/deployment", rawUrl);
    }
    /**
     * Get all ApplicationDeployments
     * @return a CompletableFuture of ServiceFlinkListApplicationDeploymentsResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> get() {
        return get(null);
    }
    /**
     * Get all ApplicationDeployments
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkListApplicationDeploymentsResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkListApplicationDeploymentsResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkListApplicationDeploymentsResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @return a CompletableFuture of ServiceFlinkCreateApplicationDeploymentResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> post(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceFlinkCreateApplicationDeploymentResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceFlinkCreateApplicationDeploymentResponse> post(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceFlinkCreateApplicationDeploymentResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get all ApplicationDeployments
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get all ApplicationDeployments
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an ApplicationDeployment
     * @param body ServiceFlinkCreateApplicationDeploymentRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceFlinkCreateApplicationDeploymentRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DeploymentRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeploymentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeploymentRequestBuilder(rawUrl, requestAdapter);
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
