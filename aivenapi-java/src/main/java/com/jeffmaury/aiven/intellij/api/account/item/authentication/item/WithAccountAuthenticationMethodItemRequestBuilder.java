package com.jeffmaury.aiven.intellij.api.account.item.authentication.item;

import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodGetResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountAuthenticationMethodUpdateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/authentication/{account_authentication_method_id}
 */
public class WithAccountAuthenticationMethodItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithAccount_authentication_method_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithAccountAuthenticationMethodItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication/{account_authentication_method_id}", pathParameters);
    }
    /**
     * Instantiates a new WithAccount_authentication_method_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithAccountAuthenticationMethodItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/authentication/{account_authentication_method_id}", rawUrl);
    }
    /**
     * Delete authentication method
     * @return a CompletableFuture of AccountAuthenticationMethodDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete authentication method
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAuthenticationMethodDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get details of a single authentication method
     * @return a CompletableFuture of AccountAuthenticationMethodGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get details of a single authentication method
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAuthenticationMethodGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @return a CompletableFuture of AccountAuthenticationMethodUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse> put(@javax.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountAuthenticationMethodUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse> put(@javax.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, AccountAuthenticationMethodUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<AccountAuthenticationMethodUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete authentication method
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete authentication method
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get details of a single authentication method
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get details of a single authentication method
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
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update authentication method
     * @param body AccountAuthenticationMethodUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final AccountAuthenticationMethodUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
