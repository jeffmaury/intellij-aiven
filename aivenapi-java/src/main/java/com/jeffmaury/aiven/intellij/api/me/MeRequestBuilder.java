package com.jeffmaury.aiven.intellij.api.me;

import com.jeffmaury.aiven.intellij.api.me.account.AccountRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.authentication_methods.AuthenticationMethodsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.expire_tokens.ExpireTokensRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.logout.LogoutRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.password_strength.PasswordStrengthRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.password.PasswordRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.referral.ReferralRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.twofa.TwofaRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.UserInfoResponse;
import com.jeffmaury.aiven.intellij.api.models.UserUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserUpdateResponse;
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
 * Builds and executes requests for operations under /me
 */
public class MeRequestBuilder extends BaseRequestBuilder {
    /** The account property */
    @javax.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authentication_methods property */
    @javax.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authentication_methods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The expire_tokens property */
    @javax.annotation.Nonnull
    public ExpireTokensRequestBuilder expire_tokens() {
        return new ExpireTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logout property */
    @javax.annotation.Nonnull
    public LogoutRequestBuilder logout() {
        return new LogoutRequestBuilder(pathParameters, requestAdapter);
    }
    /** The password property */
    @javax.annotation.Nonnull
    public PasswordRequestBuilder password() {
        return new PasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The password_strength property */
    @javax.annotation.Nonnull
    public PasswordStrengthRequestBuilder password_strength() {
        return new PasswordStrengthRequestBuilder(pathParameters, requestAdapter);
    }
    /** The referral property */
    @javax.annotation.Nonnull
    public ReferralRequestBuilder referral() {
        return new ReferralRequestBuilder(pathParameters, requestAdapter);
    }
    /** The Twofa property */
    @javax.annotation.Nonnull
    public TwofaRequestBuilder twofa() {
        return new TwofaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me", pathParameters);
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me", rawUrl);
    }
    /**
     * Get information for the current session's user
     * @return a CompletableFuture of UserInfoResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserInfoResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, UserInfoResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserInfoResponse> executionException = new java.util.concurrent.CompletableFuture<UserInfoResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get information for the current session's user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserInfoResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserInfoResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, UserInfoResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserInfoResponse> executionException = new java.util.concurrent.CompletableFuture<UserInfoResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @return a CompletableFuture of UserUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserUpdateResponse> patch(@javax.annotation.Nonnull final UserUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, UserUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<UserUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UserUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserUpdateResponse> patch(@javax.annotation.Nonnull final UserUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, UserUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<UserUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get information for the current session's user
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get information for the current session's user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UserUpdateRequestBody body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UserUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
