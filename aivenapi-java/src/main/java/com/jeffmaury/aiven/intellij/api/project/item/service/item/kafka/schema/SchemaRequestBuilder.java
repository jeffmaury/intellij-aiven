package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.compatibility.CompatibilityRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.config.ConfigRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.SchemasRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.subjects.SubjectsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchemaRequestBuilder extends BaseRequestBuilder {
    /**
     * The compatibility property
     */
    @jakarta.annotation.Nonnull
    public CompatibilityRequestBuilder compatibility() {
        return new CompatibilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The config property
     */
    @jakarta.annotation.Nonnull
    public ConfigRequestBuilder config() {
        return new ConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The schemas property
     */
    @jakarta.annotation.Nonnull
    public SchemasRequestBuilder schemas() {
        return new SchemasRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subjects property
     */
    @jakarta.annotation.Nonnull
    public SubjectsRequestBuilder subjects() {
        return new SubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SchemaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema", pathParameters);
    }
    /**
     * Instantiates a new SchemaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema", rawUrl);
    }
}
