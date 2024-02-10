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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /me
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeRequestBuilder extends BaseRequestBuilder {
    /**
     * The account property
     */
    @jakarta.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The authentication_methods property
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authenticationMethods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The expire_tokens property
     */
    @jakarta.annotation.Nonnull
    public ExpireTokensRequestBuilder expireTokens() {
        return new ExpireTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The logout property
     */
    @jakarta.annotation.Nonnull
    public LogoutRequestBuilder logout() {
        return new LogoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password property
     */
    @jakarta.annotation.Nonnull
    public PasswordRequestBuilder password() {
        return new PasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password_strength property
     */
    @jakarta.annotation.Nonnull
    public PasswordStrengthRequestBuilder passwordStrength() {
        return new PasswordStrengthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The referral property
     */
    @jakarta.annotation.Nonnull
    public ReferralRequestBuilder referral() {
        return new ReferralRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The Twofa property
     */
    @jakarta.annotation.Nonnull
    public TwofaRequestBuilder twofa() {
        return new TwofaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me", pathParameters);
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me", rawUrl);
    }
    /**
     * Get information for the current session's user
     * @return a UserInfoResponse
     */
    @jakarta.annotation.Nullable
    public UserInfoResponse get() {
        return get(null);
    }
    /**
     * Get information for the current session's user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserInfoResponse
     */
    @jakarta.annotation.Nullable
    public UserInfoResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserInfoResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @return a UserUpdateResponse
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponse patch(@jakarta.annotation.Nonnull final UserUpdateRequestBody body) {
        return patch(body, null);
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserUpdateResponse
     */
    @jakarta.annotation.Nullable
    public UserUpdateResponse patch(@jakarta.annotation.Nonnull final UserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Get information for the current session's user
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get information for the current session's user
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
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UserUpdateRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * <p>Updates details for the user. Returns user's updated information upon success.</p>
     * @param body UserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MeRequestBuilder(rawUrl, requestAdapter);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
