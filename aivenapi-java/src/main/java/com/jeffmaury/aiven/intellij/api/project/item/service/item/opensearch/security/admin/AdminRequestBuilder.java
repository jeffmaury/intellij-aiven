package com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.security.admin;

import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecurityResetRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecurityResetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecuritySetRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceOpenSearchSecuritySetResponse;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/opensearch/security/admin
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/security/admin", pathParameters);
    }
    /**
     * Instantiates a new AdminRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/opensearch/security/admin", rawUrl);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @return a ServiceOpenSearchSecuritySetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchSecuritySetResponse post(@jakarta.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body) {
        return post(body, null);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceOpenSearchSecuritySetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchSecuritySetResponse post(@jakarta.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceOpenSearchSecuritySetResponse::createFromDiscriminatorValue);
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @return a ServiceOpenSearchSecurityResetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchSecurityResetResponse put(@jakarta.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body) {
        return put(body, null);
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceOpenSearchSecurityResetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchSecurityResetResponse put(@jakarta.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceOpenSearchSecurityResetResponse::createFromDiscriminatorValue);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Enable Opensearch Security Admin by setting the password
     * @param body ServiceOpenSearchSecuritySetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchSecuritySetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Change Opensearch Security Admin password
     * @param body ServiceOpenSearchSecurityResetRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceOpenSearchSecurityResetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AdminRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdminRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
