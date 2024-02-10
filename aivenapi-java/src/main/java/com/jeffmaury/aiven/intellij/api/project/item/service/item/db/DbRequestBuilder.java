package com.jeffmaury.aiven.intellij.api.project.item.service.item.db;

import com.jeffmaury.aiven.intellij.api.models.ServiceDatabaseCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceDatabaseCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceDatabaseListResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.db.item.WithDbnameItemRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/db
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.project.item.service.item.db.item collection
     * @param dbname DatabaseName
     * @return a WithDbnameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDbnameItemRequestBuilder byDbname(@jakarta.annotation.Nonnull final String dbname) {
        Objects.requireNonNull(dbname);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dbname", dbname);
        return new WithDbnameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/db", pathParameters);
    }
    /**
     * Instantiates a new DbRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/db", rawUrl);
    }
    /**
     * List service databases
     * @return a ServiceDatabaseListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceDatabaseListResponse get() {
        return get(null);
    }
    /**
     * List service databases
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceDatabaseListResponse
     */
    @jakarta.annotation.Nullable
    public ServiceDatabaseListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceDatabaseListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new logical database for service
     * @param body ServiceDatabaseCreateRequestBody
     * @return a ServiceDatabaseCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceDatabaseCreateResponse post(@jakarta.annotation.Nonnull final ServiceDatabaseCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new logical database for service
     * @param body ServiceDatabaseCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceDatabaseCreateResponse
     */
    @jakarta.annotation.Nullable
    public ServiceDatabaseCreateResponse post(@jakarta.annotation.Nonnull final ServiceDatabaseCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceDatabaseCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List service databases
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List service databases
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new logical database for service
     * @param body ServiceDatabaseCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceDatabaseCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new logical database for service
     * @param body ServiceDatabaseCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceDatabaseCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
