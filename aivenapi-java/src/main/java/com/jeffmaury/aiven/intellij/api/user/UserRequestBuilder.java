package com.jeffmaury.aiven.intellij.api.user;

import com.jeffmaury.aiven.intellij.api.models.UserCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserCreateResponse;
import com.jeffmaury.aiven.intellij.api.user.credit_code.CreditCodeRequestBuilder;
import com.jeffmaury.aiven.intellij.api.user.password_reset_request.PasswordResetRequestRequestBuilder;
import com.jeffmaury.aiven.intellij.api.user.password_reset.PasswordResetRequestBuilder;
import com.jeffmaury.aiven.intellij.api.user.password_strength.PasswordStrengthRequestBuilder;
import com.jeffmaury.aiven.intellij.api.user.verify_email.VerifyEmailRequestBuilder;
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
 * Builds and executes requests for operations under /user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequestBuilder extends BaseRequestBuilder {
    /**
     * The credit_code property
     */
    @jakarta.annotation.Nonnull
    public CreditCodeRequestBuilder creditCode() {
        return new CreditCodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password_reset property
     */
    @jakarta.annotation.Nonnull
    public PasswordResetRequestBuilder passwordReset() {
        return new PasswordResetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password_reset_request property
     */
    @jakarta.annotation.Nonnull
    public PasswordResetRequestRequestBuilder passwordResetRequest() {
        return new PasswordResetRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password_strength property
     */
    @jakarta.annotation.Nonnull
    public PasswordStrengthRequestBuilder passwordStrength() {
        return new PasswordStrengthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify_email property
     */
    @jakarta.annotation.Nonnull
    public VerifyEmailRequestBuilder verifyEmail() {
        return new VerifyEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user", pathParameters);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user", rawUrl);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @return a CompletableFuture of UserCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserCreateResponse> post(@jakarta.annotation.Nonnull final UserCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserCreateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserCreateResponse> post(@jakarta.annotation.Nonnull final UserCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, UserCreateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UserRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
