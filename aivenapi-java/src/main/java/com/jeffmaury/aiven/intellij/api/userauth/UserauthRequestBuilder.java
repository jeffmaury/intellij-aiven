package com.jeffmaury.aiven.intellij.api.userauth;

import com.jeffmaury.aiven.intellij.api.models.UserAuthRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserAuthResponse;
import com.jeffmaury.aiven.intellij.api.userauth.login_options.LoginOptionsRequestBuilder;
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
 * Builds and executes requests for operations under /userauth
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserauthRequestBuilder extends BaseRequestBuilder {
    /**
     * The login_options property
     */
    @jakarta.annotation.Nonnull
    public LoginOptionsRequestBuilder loginOptions() {
        return new LoginOptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserauthRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserauthRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/userauth", pathParameters);
    }
    /**
     * Instantiates a new UserauthRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserauthRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/userauth", rawUrl);
    }
    /**
     * <p>Authenticate user and return token for following authorizations</p>
     * @param body UserAuthRequestBody
     * @return a CompletableFuture of UserAuthResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserAuthResponse> post(@jakarta.annotation.Nonnull final UserAuthRequestBody body) {
        return post(body, null);
    }
    /**
     * <p>Authenticate user and return token for following authorizations</p>
     * @param body UserAuthRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserAuthResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserAuthResponse> post(@jakarta.annotation.Nonnull final UserAuthRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, UserAuthResponse::createFromDiscriminatorValue, null);
    }
    /**
     * <p>Authenticate user and return token for following authorizations</p>
     * @param body UserAuthRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserAuthRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>Authenticate user and return token for following authorizations</p>
     * @param body UserAuthRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserAuthRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UserauthRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserauthRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserauthRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
