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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /user
 */
public class UserRequestBuilder extends BaseRequestBuilder {
    /** The credit_code property */
    @javax.annotation.Nonnull
    public CreditCodeRequestBuilder credit_code() {
        return new CreditCodeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The password_reset property */
    @javax.annotation.Nonnull
    public PasswordResetRequestBuilder password_reset() {
        return new PasswordResetRequestBuilder(pathParameters, requestAdapter);
    }
    /** The password_reset_request property */
    @javax.annotation.Nonnull
    public PasswordResetRequestRequestBuilder password_reset_request() {
        return new PasswordResetRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /** The password_strength property */
    @javax.annotation.Nonnull
    public PasswordStrengthRequestBuilder password_strength() {
        return new PasswordStrengthRequestBuilder(pathParameters, requestAdapter);
    }
    /** The verify_email property */
    @javax.annotation.Nonnull
    public VerifyEmailRequestBuilder verify_email() {
        return new VerifyEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user", pathParameters);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user", rawUrl);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @return a CompletableFuture of UserCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserCreateResponse> post(@javax.annotation.Nonnull final UserCreateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, UserCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserCreateResponse> executionException = new java.util.concurrent.CompletableFuture<UserCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserCreateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserCreateResponse> post(@javax.annotation.Nonnull final UserCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, UserCreateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserCreateResponse> executionException = new java.util.concurrent.CompletableFuture<UserCreateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UserCreateRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a user
     * @param body UserCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UserCreateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
