package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry.acl.AclRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema-registry
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchemaRegistryRequestBuilder extends BaseRequestBuilder {
    /**
     * The acl property
     */
    @jakarta.annotation.Nonnull
    public AclRequestBuilder acl() {
        return new AclRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SchemaRegistryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRegistryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry", pathParameters);
    }
    /**
     * Instantiates a new SchemaRegistryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRegistryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema-registry", rawUrl);
    }
}
