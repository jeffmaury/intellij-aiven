package com.jeffmaury.aiven.intellij.api.me.twofa;

import com.jeffmaury.aiven.intellij.api.me.twofa.otp.OtpRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureRequestBody;
import com.jeffmaury.aiven.intellij.api.models.TwoFactorAuthConfigureResponse;
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
 * Builds and executes requests for operations under /me/2fa
 */
public class TwofaRequestBuilder extends BaseRequestBuilder {
    /** The otp property */
    @javax.annotation.Nonnull
    public OtpRequestBuilder otp() {
        return new OtpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TwofaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TwofaRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa", pathParameters);
    }
    /**
     * Instantiates a new TwofaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TwofaRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/2fa", rawUrl);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @return a CompletableFuture of TwoFactorAuthConfigureResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse> put(@javax.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, TwoFactorAuthConfigureResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse> executionException = new java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of TwoFactorAuthConfigureResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse> put(@javax.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, TwoFactorAuthConfigureResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse> executionException = new java.util.concurrent.CompletableFuture<TwoFactorAuthConfigureResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Configure two-factor authentication
     * @param body TwoFactorAuthConfigureRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final TwoFactorAuthConfigureRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
