package com.jeffmaury.aiven.intellij.api.project.item.service.item.query;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.query.activity.ActivityRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.query.cancel.CancelRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.query.stats.StatsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/query
 */
public class QueryRequestBuilder extends BaseRequestBuilder {
    /** The activity property */
    @javax.annotation.Nonnull
    public ActivityRequestBuilder activity() {
        return new ActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cancel property */
    @javax.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /** The stats property */
    @javax.annotation.Nonnull
    public StatsRequestBuilder stats() {
        return new StatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new QueryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public QueryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query", pathParameters);
    }
    /**
     * Instantiates a new QueryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public QueryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query", rawUrl);
    }
}
