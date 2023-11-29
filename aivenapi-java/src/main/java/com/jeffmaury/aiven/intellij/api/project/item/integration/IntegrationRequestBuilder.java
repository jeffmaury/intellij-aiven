package com.jeffmaury.aiven.intellij.api.project.item.integration;

import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceIntegrationCreateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.integration.item.WithIntegrationItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/integration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.integration.item collection
     * @param integration_id Integration ID
     * @return a WithIntegrationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIntegrationItemRequestBuilder byIntegration_id(@jakarta.annotation.Nonnull final String integration_id) {
        Objects.requireNonNull(integration_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("integration_id", integration_id);
        return new WithIntegrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IntegrationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration", pathParameters);
    }
    /**
     * Instantiates a new IntegrationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/integration", rawUrl);
    }
    /**
     * Create a new service integration
     * @param body ServiceIntegrationCreateRequestBody
     * @return a CompletableFuture of ServiceIntegrationCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationCreateResponse> post(@jakarta.annotation.Nonnull final ServiceIntegrationCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new service integration
     * @param body ServiceIntegrationCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceIntegrationCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceIntegrationCreateResponse> post(@jakarta.annotation.Nonnull final ServiceIntegrationCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceIntegrationCreateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Create a new service integration
     * @param body ServiceIntegrationCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new service integration
     * @param body ServiceIntegrationCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceIntegrationCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a IntegrationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IntegrationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IntegrationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
