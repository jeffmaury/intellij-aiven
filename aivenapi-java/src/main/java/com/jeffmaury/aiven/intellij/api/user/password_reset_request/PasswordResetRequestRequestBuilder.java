package com.jeffmaury.aiven.intellij.api.user.password_reset_request;

import com.jeffmaury.aiven.intellij.api.models.UserPasswordResetRequestRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserPasswordResetRequestResponse;
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
 * Builds and executes requests for operations under /user/password_reset_request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordResetRequestRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Password_reset_requestRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordResetRequestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/password_reset_request", pathParameters);
    }
    /**
     * Instantiates a new Password_reset_requestRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordResetRequestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/user/password_reset_request", rawUrl);
    }
    /**
     * <p>Request a password reset code to be sent to the user's email address.</p>
     * @param body UserPasswordResetRequestRequestBody
     * @return a UserPasswordResetRequestResponse
     */
    @jakarta.annotation.Nullable
    public UserPasswordResetRequestResponse post(@jakarta.annotation.Nonnull final UserPasswordResetRequestRequestBody body) {
        return post(body, null);
    }
    /**
     * <p>Request a password reset code to be sent to the user's email address.</p>
     * @param body UserPasswordResetRequestRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserPasswordResetRequestResponse
     */
    @jakarta.annotation.Nullable
    public UserPasswordResetRequestResponse post(@jakarta.annotation.Nonnull final UserPasswordResetRequestRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserPasswordResetRequestResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Request a password reset code to be sent to the user's email address.</p>
     * @param body UserPasswordResetRequestRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserPasswordResetRequestRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>Request a password reset code to be sent to the user's email address.</p>
     * @param body UserPasswordResetRequestRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserPasswordResetRequestRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a PasswordResetRequestRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PasswordResetRequestRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PasswordResetRequestRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
