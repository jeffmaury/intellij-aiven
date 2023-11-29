package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids.item.WithSchemaItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/schemas/ids
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids.item collection
     * @param schema_id Schema Id
     * @return a WithSchemaItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSchemaItemRequestBuilder bySchema_id(@jakarta.annotation.Nonnull final String schema_id) {
        Objects.requireNonNull(schema_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schema_id", schema_id);
        return new WithSchemaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas/ids", pathParameters);
    }
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas/ids", rawUrl);
    }
}
