package com.jeffmaury.aiven.intellij.api.me.password_strength;

import com.jeffmaury.aiven.intellij.api.models.CheckPasswordStrengthExistingUserRequestBody;
import com.jeffmaury.aiven.intellij.api.models.CheckPasswordStrengthExistingUserResponse;
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
 * Builds and executes requests for operations under /me/password_strength
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordStrengthRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Password_strengthRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordStrengthRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/password_strength", pathParameters);
    }
    /**
     * Instantiates a new Password_strengthRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordStrengthRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/password_strength", rawUrl);
    }
    /**
     * Check password strength for an existing user
     * @param body CheckPasswordStrengthExistingUserRequestBody
     * @return a CheckPasswordStrengthExistingUserResponse
     */
    @jakarta.annotation.Nullable
    public CheckPasswordStrengthExistingUserResponse post(@jakarta.annotation.Nonnull final CheckPasswordStrengthExistingUserRequestBody body) {
        return post(body, null);
    }
    /**
     * Check password strength for an existing user
     * @param body CheckPasswordStrengthExistingUserRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CheckPasswordStrengthExistingUserResponse
     */
    @jakarta.annotation.Nullable
    public CheckPasswordStrengthExistingUserResponse post(@jakarta.annotation.Nonnull final CheckPasswordStrengthExistingUserRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CheckPasswordStrengthExistingUserResponse::createFromDiscriminatorValue);
    }
    /**
     * Check password strength for an existing user
     * @param body CheckPasswordStrengthExistingUserRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CheckPasswordStrengthExistingUserRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Check password strength for an existing user
     * @param body CheckPasswordStrengthExistingUserRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CheckPasswordStrengthExistingUserRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a PasswordStrengthRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PasswordStrengthRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PasswordStrengthRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
