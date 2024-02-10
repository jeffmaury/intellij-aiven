package com.jeffmaury.aiven.intellij.api.account.item.team.item.project.item;

import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociationUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectAssociationUpdateResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamProjectDisassociateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}/project/{project}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project/{project}", pathParameters);
    }
    /**
     * Instantiates a new WithProjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}/project/{project}", rawUrl);
    }
    /**
     * Disassociate team from a project
     * @return a AccountTeamProjectDisassociateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamProjectDisassociateResponse delete() {
        return delete(null);
    }
    /**
     * Disassociate team from a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamProjectDisassociateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamProjectDisassociateResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamProjectDisassociateResponse::createFromDiscriminatorValue);
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @return a AccountTeamProjectAssociateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamProjectAssociateResponse post(@jakarta.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body) {
        return post(body, null);
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamProjectAssociateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamProjectAssociateResponse post(@jakarta.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamProjectAssociateResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @return a AccountTeamProjectAssociationUpdateResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccountTeamProjectAssociationUpdateResponse put(@jakarta.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamProjectAssociationUpdateResponse
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public AccountTeamProjectAssociationUpdateResponse put(@jakarta.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamProjectAssociationUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Disassociate team from a project
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Disassociate team from a project
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Associate team to a project
     * @param body AccountTeamProjectAssociateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccountTeamProjectAssociateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * <p>Use PATCH /organization/{organization_id}/user-groups/{user_group_id}</p>
     * @param body AccountTeamProjectAssociationUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * 
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountTeamProjectAssociationUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithProjectItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithProjectItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithProjectItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
