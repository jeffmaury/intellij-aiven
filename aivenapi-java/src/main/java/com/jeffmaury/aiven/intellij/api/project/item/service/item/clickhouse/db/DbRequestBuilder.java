package com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.db;

import com.jeffmaury.aiven.intellij.api.models.ServiceClickHouseDatabaseCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceClickHouseDatabaseCreateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.db.item.WithDatabaseItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/clickhouse/db
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.db.item collection
     * @param database Database name
     * @return a WithDatabaseItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDatabaseItemRequestBuilder byDatabase(@jakarta.annotation.Nonnull final String database) {
        Objects.requireNonNull(database);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("database", database);
        return new WithDatabaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse/db", pathParameters);
    }
    /**
     * Instantiates a new DbRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/clickhouse/db", rawUrl);
    }
    /**
     * Create a database
     * @param body ServiceClickHouseDatabaseCreateRequestBody
     * @return a CompletableFuture of ServiceClickHouseDatabaseCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceClickHouseDatabaseCreateResponse> post(@jakarta.annotation.Nonnull final ServiceClickHouseDatabaseCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a database
     * @param body ServiceClickHouseDatabaseCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceClickHouseDatabaseCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceClickHouseDatabaseCreateResponse> post(@jakarta.annotation.Nonnull final ServiceClickHouseDatabaseCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceClickHouseDatabaseCreateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Create a database
     * @param body ServiceClickHouseDatabaseCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceClickHouseDatabaseCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a database
     * @param body ServiceClickHouseDatabaseCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceClickHouseDatabaseCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DbRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DbRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
