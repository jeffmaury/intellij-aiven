package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry.acl.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceSchemaRegistryAclDeleteResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema-registry/acl/{schema_registry_acl_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSchemaRegistryAclItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithSchema_registry_acl_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSchemaRegistryAclItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry/acl/{schema_registry_acl_id}", pathParameters);
    }
    /**
     * Instantiates a new WithSchema_registry_acl_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSchemaRegistryAclItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry/acl/{schema_registry_acl_id}", rawUrl);
    }
    /**
     * Delete a Schema Registry ACL entry
     * @return a ServiceSchemaRegistryAclDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryAclDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a Schema Registry ACL entry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceSchemaRegistryAclDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryAclDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceSchemaRegistryAclDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a Schema Registry ACL entry
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a Schema Registry ACL entry
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithSchemaRegistryAclItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSchemaRegistryAclItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSchemaRegistryAclItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
