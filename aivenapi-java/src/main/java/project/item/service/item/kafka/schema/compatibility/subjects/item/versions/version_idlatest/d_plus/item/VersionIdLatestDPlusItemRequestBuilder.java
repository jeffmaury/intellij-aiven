package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.subjects.item.versions.version_idlatest.d_plus.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryCompatibilityRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryCompatibilityResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id:latest|/d+}
 */
public class VersionIdLatestDPlusItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionIdLatestDPlusItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", pathParameters);
    }
    /**
     * Instantiates a new Version_idLatestD_plus_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VersionIdLatestDPlusItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/compatibility/subjects/{subject_name}/versions/{version_id%3Alatest%7C%2Fd%2B}", rawUrl);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistryCompatibilityResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse> post(@javax.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryCompatibilityResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryCompatibilityResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse> post(@javax.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryCompatibilityResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryCompatibilityResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Check compatibility of schema in Schema Registry
     * @param body ServiceSchemaRegistryCompatibilityRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ServiceSchemaRegistryCompatibilityRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
