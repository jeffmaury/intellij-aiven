package com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.schema.schemas.ids.IdsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/kafka/schema/schemas
 */
public class SchemasRequestBuilder extends BaseRequestBuilder {
    /** The ids property */
    @javax.annotation.Nonnull
    public IdsRequestBuilder ids() {
        return new IdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SchemasRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SchemasRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas", pathParameters);
    }
    /**
     * Instantiates a new SchemasRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SchemasRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/kafka/schema/schemas", rawUrl);
    }
}
