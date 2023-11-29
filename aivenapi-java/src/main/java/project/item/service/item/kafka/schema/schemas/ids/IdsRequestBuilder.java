package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids.item.WithSchemaItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/schemas/ids
 */
public class IdsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids.item collection
     * @param schema_id Unique identifier of the item
     * @return a WithSchemaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WithSchemaItemRequestBuilder bySchema_id(@javax.annotation.Nonnull final String schema_id) {
        Objects.requireNonNull(schema_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schema_id", schema_id);
        return new WithSchemaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas/ids", pathParameters);
    }
    /**
     * Instantiates a new IdsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas/ids", rawUrl);
    }
}
