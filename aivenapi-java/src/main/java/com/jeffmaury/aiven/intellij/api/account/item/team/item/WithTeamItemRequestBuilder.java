package com.jeffmaury.aiven.intellij.api.account.item.team.item;

import com.jeffmaury.aiven.intellij.api.account.item.team.item.invites.InvitesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.team.item.member.MemberRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.team.item.members.MembersRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.team.item.project.ProjectRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.team.item.projects.ProjectsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamGetResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountTeamUpdateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}/team/{team_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTeamItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The invites property
     */
    @jakarta.annotation.Nonnull
    public InvitesRequestBuilder invites() {
        return new InvitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The member property
     */
    @jakarta.annotation.Nonnull
    public MemberRequestBuilder member() {
        return new MemberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The members property
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The project property
     */
    @jakarta.annotation.Nonnull
    public ProjectRequestBuilder project() {
        return new ProjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projects property
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithTeam_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTeamItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}", pathParameters);
    }
    /**
     * Instantiates a new WithTeam_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTeamItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}/team/{team_id}", rawUrl);
    }
    /**
     * Delete a team
     * @return a AccountTeamDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a team
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get details for a single team
     * @return a AccountTeamGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamGetResponse get() {
        return get(null);
    }
    /**
     * Get details for a single team
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update team details
     * @param body AccountTeamUpdateRequestBody
     * @return a AccountTeamUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamUpdateResponse put(@jakarta.annotation.Nonnull final AccountTeamUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update team details
     * @param body AccountTeamUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountTeamUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountTeamUpdateResponse put(@jakarta.annotation.Nonnull final AccountTeamUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountTeamUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete a team
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a team
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
     * Get details for a single team
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details for a single team
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
     * Update team details
     * @param body AccountTeamUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountTeamUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update team details
     * @param body AccountTeamUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountTeamUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithTeamItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithTeamItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTeamItemRequestBuilder(rawUrl, requestAdapter);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
