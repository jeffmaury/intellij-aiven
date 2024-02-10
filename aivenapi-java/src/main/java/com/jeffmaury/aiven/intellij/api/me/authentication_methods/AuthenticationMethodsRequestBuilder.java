package com.jeffmaury.aiven.intellij.api.me.authentication_methods;

import com.jeffmaury.aiven.intellij.api.me.authentication_methods.item.WithUserAuthenticationMethodItemRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.UserAuthenticationMethodsListResponse;
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
 * Builds and executes requests for operations under /me/authentication_methods
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.me.authentication_methods.item collection
     * @param user_authentication_method_id User authentication method ID
     * @return a WithUserAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserAuthenticationMethodItemRequestBuilder byUser_authentication_method_id(@jakarta.annotation.Nonnull final String user_authentication_method_id) {
        Objects.requireNonNull(user_authentication_method_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_authentication_method_id", user_authentication_method_id);
        return new WithUserAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Authentication_methodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/authentication_methods", pathParameters);
    }
    /**
     * Instantiates a new Authentication_methodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/authentication_methods", rawUrl);
    }
    /**
     * List linked authentication methods
     * @return a UserAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nullable
    public UserAuthenticationMethodsListResponse get() {
        return get(null);
    }
    /**
     * List linked authentication methods
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nullable
    public UserAuthenticationMethodsListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserAuthenticationMethodsListResponse::createFromDiscriminatorValue);
    }
    /**
     * List linked authentication methods
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List linked authentication methods
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AuthenticationMethodsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
