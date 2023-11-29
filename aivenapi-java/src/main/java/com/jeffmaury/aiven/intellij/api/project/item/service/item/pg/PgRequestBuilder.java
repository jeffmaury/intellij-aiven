package com.jeffmaury.aiven.intellij.api.project.item.service.item.pg;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.availableextensions.AvailableExtensionsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.query.QueryRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/pg
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PgRequestBuilder extends BaseRequestBuilder {
    /**
     * The availableExtensions property
     */
    @jakarta.annotation.Nonnull
    public AvailableExtensionsRequestBuilder availableExtensions() {
        return new AvailableExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The query property
     */
    @jakarta.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PgRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PgRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg", pathParameters);
    }
    /**
     * Instantiates a new PgRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PgRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg", rawUrl);
    }
}
