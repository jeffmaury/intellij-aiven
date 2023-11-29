package com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse;

import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.db.DbRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.query.QueryRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.tieredstorage.TieredStorageRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/clickhouse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClickhouseRequestBuilder extends BaseRequestBuilder {
    /**
     * The db property
     */
    @jakarta.annotation.Nonnull
    public DbRequestBuilder db() {
        return new DbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The query property
     */
    @jakarta.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tieredStorage property
     */
    @jakarta.annotation.Nonnull
    public TieredStorageRequestBuilder tieredStorage() {
        return new TieredStorageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ClickhouseRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClickhouseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse", pathParameters);
    }
    /**
     * Instantiates a new ClickhouseRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClickhouseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse", rawUrl);
    }
}
