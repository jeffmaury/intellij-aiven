package com.jeffmaury.aiven.intellij.api.account.item.authentication.item;

import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodGetResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodUpdateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/authentication/{account_authentication_method_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAccountAuthenticationMethodItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithAccount_authentication_method_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAccountAuthenticationMethodItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication/{account_authentication_method_id}", pathParameters);
    }
    /**
     * Instantiates a new WithAccount_authentication_method_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAccountAuthenticationMethodItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication/{account_authentication_method_id}", rawUrl);
    }
    /**
     * Delete authentication method
     * @return a AccountAuthenticationMethodDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete authentication method
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountAuthenticationMethodDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountAuthenticationMethodDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get details of a single authentication method
     * @return a AccountAuthenticationMethodGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodGetResponse get() {
        return get(null);
    }
    /**
     * Get details of a single authentication method
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountAuthenticationMethodGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountAuthenticationMethodGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @return a AccountAuthenticationMethodUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponse put(@jakarta.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountAuthenticationMethodUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponse put(@jakarta.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountAuthenticationMethodUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete authentication method
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete authentication method
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
     * Get details of a single authentication method
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details of a single authentication method
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
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithAccountAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAccountAuthenticationMethodItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAccountAuthenticationMethodItemRequestBuilder(rawUrl, requestAdapter);
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
