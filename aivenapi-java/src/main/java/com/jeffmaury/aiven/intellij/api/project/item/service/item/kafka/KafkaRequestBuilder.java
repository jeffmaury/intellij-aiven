package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.rest.RestRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.SchemaRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schemaregistry.SchemaRegistryRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.tieredstorage.TieredStorageRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KafkaRequestBuilder extends BaseRequestBuilder {
    /**
     * The rest property
     */
    @jakarta.annotation.Nonnull
    public RestRequestBuilder rest() {
        return new RestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The schema property
     */
    @jakarta.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The schemaRegistry property
     */
    @jakarta.annotation.Nonnull
    public SchemaRegistryRequestBuilder schemaRegistry() {
        return new SchemaRegistryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tieredStorage property
     */
    @jakarta.annotation.Nonnull
    public TieredStorageRequestBuilder tieredStorage() {
        return new TieredStorageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new KafkaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KafkaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka", pathParameters);
    }
    /**
     * Instantiates a new KafkaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KafkaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka", rawUrl);
    }
}
