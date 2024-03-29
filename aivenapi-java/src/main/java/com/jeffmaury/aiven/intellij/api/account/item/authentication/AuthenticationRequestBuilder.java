package com.jeffmaury.aiven.intellij.api.account.item.authentication;

import com.jeffmaury.aiven.intellij.api.account.item.authentication.item.WithAccountAuthenticationMethodItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodsListResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/authentication
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.account.item.authentication.item collection
     * @param account_authentication_method_id Account authentication method ID
     * @return a WithAccountAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAccountAuthenticationMethodItemRequestBuilder byAccount_authentication_method_id(@jakarta.annotation.Nonnull final String account_authentication_method_id) {
        Objects.requireNonNull(account_authentication_method_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("account_authentication_method_id", account_authentication_method_id);
        return new WithAccountAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication", pathParameters);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication", rawUrl);
    }
    /**
     * List authentication methods
     * @return a AccountAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodsListResponse get() {
        return get(null);
    }
    /**
     * List authentication methods
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodsListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountAuthenticationMethodsListResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @return a AccountAuthenticationMethodCreateResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodCreateResponse post(@jakarta.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountAuthenticationMethodCreateResponse
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodCreateResponse post(@jakarta.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountAuthenticationMethodCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * List authentication methods
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List authentication methods
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
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new authentication method
     * @param body AccountAuthenticationMethodCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountAuthenticationMethodCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AuthenticationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationRequestBuilder(rawUrl, requestAdapter);
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
