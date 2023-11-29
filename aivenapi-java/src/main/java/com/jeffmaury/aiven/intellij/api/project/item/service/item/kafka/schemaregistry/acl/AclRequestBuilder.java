package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry.acl;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryAclAddRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryAclAddResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryAclListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry.acl.item.WithSchemaRegistryAclItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema-registry/acl
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AclRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaRegistry.acl.item collection
     * @param schema_registry_acl_id Kafka Schema Registry ACL ID
     * @return a WithSchemaRegistryAclItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSchemaRegistryAclItemRequestBuilder bySchema_registry_acl_id(@jakarta.annotation.Nonnull final String schema_registry_acl_id) {
        Objects.requireNonNull(schema_registry_acl_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schema_registry_acl_id", schema_registry_acl_id);
        return new WithSchemaRegistryAclItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AclRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AclRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry/acl", pathParameters);
    }
    /**
     * Instantiates a new AclRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AclRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry/acl", rawUrl);
    }
    /**
     * List Schema Registry ACL entries
     * @return a CompletableFuture of ServiceSchemaRegistryAclListResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryAclListResponse> get() {
        return get(null);
    }
    /**
     * List Schema Registry ACL entries
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryAclListResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryAclListResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryAclListResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Add a Schema Registry ACL entry
     * @param body ServiceSchemaRegistryAclAddRequestBody
     * @return a CompletableFuture of ServiceSchemaRegistryAclAddResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryAclAddResponse> post(@jakarta.annotation.Nonnull final ServiceSchemaRegistryAclAddRequestBody body) {
        return post(body, null);
    }
    /**
     * Add a Schema Registry ACL entry
     * @param body ServiceSchemaRegistryAclAddRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceSchemaRegistryAclAddResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceSchemaRegistryAclAddResponse> post(@jakarta.annotation.Nonnull final ServiceSchemaRegistryAclAddRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceSchemaRegistryAclAddResponse::createFromDiscriminatorValue, null);
    }
    /**
     * List Schema Registry ACL entries
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List Schema Registry ACL entries
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
     * Add a Schema Registry ACL entry
     * @param body ServiceSchemaRegistryAclAddRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryAclAddRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a Schema Registry ACL entry
     * @param body ServiceSchemaRegistryAclAddRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceSchemaRegistryAclAddRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AclRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AclRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AclRequestBuilder(rawUrl, requestAdapter);
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
