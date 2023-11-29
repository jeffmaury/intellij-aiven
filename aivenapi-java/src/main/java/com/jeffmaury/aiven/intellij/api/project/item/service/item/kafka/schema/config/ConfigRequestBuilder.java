package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigPutRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryGlobalConfigPutResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.item.WithSubjectNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/config
 */
public class ConfigRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.item collection
     * @param subject_name Unique identifier of the item
     * @return a WithSubjectNameItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSubjectNameItemRequestBuilder bySubject_name(@javax.annotation.Nonnull final String subject_name) {
        Objects.requireNonNull(subject_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subject_name", subject_name);
        return new WithSubjectNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config", pathParameters);
    }
    /**
     * Instantiates a new ConfigRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/config", rawUrl);
    }
    /**
     * Get global configuration for Schema Registry
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get global configuration for Schema Registry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigPutResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> put(@javax.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigPutResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryGlobalConfigPutResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> put(@javax.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryGlobalConfigPutResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceSchemaRegistryGlobalConfigPutResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get global configuration for Schema Registry
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get global configuration for Schema Registry
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
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Edit global configuration for Schema Registry
     * @param body ServiceSchemaRegistryGlobalConfigPutRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceSchemaRegistryGlobalConfigPutRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
