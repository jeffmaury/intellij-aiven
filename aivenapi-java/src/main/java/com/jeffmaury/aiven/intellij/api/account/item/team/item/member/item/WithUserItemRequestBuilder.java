package com.jeffmaury.aiven.intellij.api.account.item.team.item.member.item;

import com.jeffmaury.aiven.intellij.api.models.AccountTeamMembersDeleteResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}/member/{user_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/member/{user_id}", pathParameters);
    }
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/member/{user_id}", rawUrl);
    }
    /**
     * <p>Use DELETE /organization/{organization_id}/user/{member_user_id}</p>
     * @return a CompletableFuture of AccountTeamMembersDeleteResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AccountTeamMembersDeleteResponse> delete() {
        return delete(null);
    }
    /**
     * <p>Use DELETE /organization/{organization_id}/user/{member_user_id}</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AccountTeamMembersDeleteResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AccountTeamMembersDeleteResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, AccountTeamMembersDeleteResponse::createFromDiscriminatorValue, null);
    }
    /**
     * <p>Use DELETE /organization/{organization_id}/user/{member_user_id}</p>
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * <p>Use DELETE /organization/{organization_id}/user/{member_user_id}</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithUserItemRequestBuilder
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public WithUserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithUserItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
