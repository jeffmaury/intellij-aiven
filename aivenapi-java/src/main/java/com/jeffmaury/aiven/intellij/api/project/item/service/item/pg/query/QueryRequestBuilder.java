package com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.query;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.query.stats.StatsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/pg/query
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequestBuilder extends BaseRequestBuilder {
    /**
     * The stats property
     */
    @jakarta.annotation.Nonnull
    public StatsRequestBuilder stats() {
        return new StatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new QueryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg/query", pathParameters);
    }
    /**
     * Instantiates a new QueryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/pg/query", rawUrl);
    }
}
