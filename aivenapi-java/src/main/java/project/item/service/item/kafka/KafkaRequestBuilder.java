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
public class KafkaRequestBuilder extends BaseRequestBuilder {
    /** The rest property */
    @javax.annotation.Nonnull
    public RestRequestBuilder rest() {
        return new RestRequestBuilder(pathParameters, requestAdapter);
    }
    /** The schema property */
    @javax.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /** The schemaRegistry property */
    @javax.annotation.Nonnull
    public SchemaRegistryRequestBuilder schemaRegistry() {
        return new SchemaRegistryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tieredStorage property */
    @javax.annotation.Nonnull
    public TieredStorageRequestBuilder tieredStorage() {
        return new TieredStorageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new KafkaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkaRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka", pathParameters);
    }
    /**
     * Instantiates a new KafkaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public KafkaRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka", rawUrl);
    }
}
