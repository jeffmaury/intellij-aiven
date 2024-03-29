package com.jeffmaury.aiven.intellij.api.project.item.service.item.user.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceUserCredentialsModifyRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceUserCredentialsModifyResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceUserDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceUserGetResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.user.item.credentials.CredentialsRequestBuilder;
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
 * Builds and executes requests for operations under /project/{project}/service/{service_name}/user/{service_username}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithServiceUsernameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The credentials property
     */
    @jakarta.annotation.Nonnull
    public CredentialsRequestBuilder credentials() {
        return new CredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithService_usernameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceUsernameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/user/{service_username}", pathParameters);
    }
    /**
     * Instantiates a new WithService_usernameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceUsernameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}/user/{service_username}", rawUrl);
    }
    /**
     * Delete a service user
     * @return a ServiceUserDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a service user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceUserDeleteResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceUserDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get details for a single user
     * @return a ServiceUserGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserGetResponse get() {
        return get(null);
    }
    /**
     * Get details for a single user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceUserGetResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceUserGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Modify service user credentials
     * @param body ServiceUserCredentialsModifyRequestBody
     * @return a ServiceUserCredentialsModifyResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponse put(@jakarta.annotation.Nonnull final ServiceUserCredentialsModifyRequestBody body) {
        return put(body, null);
    }
    /**
     * Modify service user credentials
     * @param body ServiceUserCredentialsModifyRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServiceUserCredentialsModifyResponse
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponse put(@jakarta.annotation.Nonnull final ServiceUserCredentialsModifyRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ServiceUserCredentialsModifyResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a service user
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a service user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get details for a single user
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details for a single user
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
     * Modify service user credentials
     * @param body ServiceUserCredentialsModifyRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceUserCredentialsModifyRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Modify service user credentials
     * @param body ServiceUserCredentialsModifyRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceUserCredentialsModifyRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithServiceUsernameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithServiceUsernameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithServiceUsernameItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
