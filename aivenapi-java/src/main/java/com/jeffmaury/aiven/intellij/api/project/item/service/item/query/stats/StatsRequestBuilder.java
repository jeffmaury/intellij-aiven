package com.jeffmaury.aiven.intellij.api.project.item.service.item.query.stats;

import com.jeffmaury.aiven.intellij.api.models.PGServiceQueryStatisticsDeprecatedRequestBody;
import com.jeffmaury.aiven.intellij.api.models.PGServiceQueryStatisticsDeprecatedResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.query.stats.reset.ResetRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/query/stats
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatsRequestBuilder extends BaseRequestBuilder {
    /**
     * The reset property
     * @deprecated
     * 
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ResetRequestBuilder reset() {
        return new ResetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new StatsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StatsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query/stats", pathParameters);
    }
    /**
     * Instantiates a new StatsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StatsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/query/stats", rawUrl);
    }
    /**
     * <p>DEPRECATED: Use /project/$project/service/$service/pg/query/stats instead</p>
     * @param body PGServiceQueryStatisticsDeprecatedRequestBody
     * @return a CompletableFuture of PGServiceQueryStatisticsDeprecatedResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<PGServiceQueryStatisticsDeprecatedResponse> post(@jakarta.annotation.Nonnull final PGServiceQueryStatisticsDeprecatedRequestBody body) {
        return post(body, null);
    }
    /**
     * <p>DEPRECATED: Use /project/$project/service/$service/pg/query/stats instead</p>
     * @param body PGServiceQueryStatisticsDeprecatedRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PGServiceQueryStatisticsDeprecatedResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<PGServiceQueryStatisticsDeprecatedResponse> post(@jakarta.annotation.Nonnull final PGServiceQueryStatisticsDeprecatedRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, PGServiceQueryStatisticsDeprecatedResponse::createFromDiscriminatorValue, null);
    }
    /**
     * <p>DEPRECATED: Use /project/$project/service/$service/pg/query/stats instead</p>
     * @param body PGServiceQueryStatisticsDeprecatedRequestBody
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PGServiceQueryStatisticsDeprecatedRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>DEPRECATED: Use /project/$project/service/$service/pg/query/stats instead</p>
     * @param body PGServiceQueryStatisticsDeprecatedRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PGServiceQueryStatisticsDeprecatedRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a StatsRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public StatsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StatsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
