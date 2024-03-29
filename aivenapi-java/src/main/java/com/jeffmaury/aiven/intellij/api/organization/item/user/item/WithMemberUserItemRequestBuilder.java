package com.jeffmaury.aiven.intellij.api.organization.item.user.item;

import com.jeffmaury.aiven.intellij.api.models.OrganizationUserGetResponse;
import com.jeffmaury.aiven.intellij.api.models.OrganizationUserSetResponse;
import com.jeffmaury.aiven.intellij.api.models.OrganizationUserUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.OrganizationUserUpdateResponse;
import com.jeffmaury.aiven.intellij.api.organization.item.user.item.accesstoken.AccessTokenRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.user.item.accesstokens.AccessTokensRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.user.item.authentication_methods.AuthenticationMethodsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.user.item.reset_password.ResetPasswordRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.item.user.item.usergroups.UserGroupsRequestBuilder;
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
 * Builds and executes requests for operations under /organization/{organization_id}/user/{member_user_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMemberUserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The accessToken property
     */
    @jakarta.annotation.Nonnull
    public AccessTokenRequestBuilder accessToken() {
        return new AccessTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The accessTokens property
     */
    @jakarta.annotation.Nonnull
    public AccessTokensRequestBuilder accessTokens() {
        return new AccessTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The authentication_methods property
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authenticationMethods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reset_password property
     */
    @jakarta.annotation.Nonnull
    public ResetPasswordRequestBuilder resetPassword() {
        return new ResetPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The userGroups property
     */
    @jakarta.annotation.Nonnull
    public UserGroupsRequestBuilder userGroups() {
        return new UserGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithMember_user_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMemberUserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user/{member_user_id}", pathParameters);
    }
    /**
     * Instantiates a new WithMember_user_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMemberUserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user/{member_user_id}", rawUrl);
    }
    /**
     * Remove a user from the organization
     */
    public void delete() {
        delete(null);
    }
    /**
     * Remove a user from the organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * Get details on a user of the organization
     * @return a OrganizationUserGetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserGetResponse get() {
        return get(null);
    }
    /**
     * Get details on a user of the organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationUserGetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationUserGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update details on a user of the organization
     * @param body OrganizationUserUpdateRequestBody
     * @return a OrganizationUserUpdateResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserUpdateResponse patch(@jakarta.annotation.Nonnull final OrganizationUserUpdateRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update details on a user of the organization
     * @param body OrganizationUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationUserUpdateResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserUpdateResponse patch(@jakarta.annotation.Nonnull final OrganizationUserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationUserUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Add or modify a user of the organization
     * @return a OrganizationUserSetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserSetResponse put() {
        return put(null);
    }
    /**
     * Add or modify a user of the organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationUserSetResponse
     */
    @jakarta.annotation.Nullable
    public OrganizationUserSetResponse put(@jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPutRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OrganizationUserSetResponse::createFromDiscriminatorValue);
    }
    /**
     * Remove a user from the organization
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Remove a user from the organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Get details on a user of the organization
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details on a user of the organization
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
     * Update details on a user of the organization
     * @param body OrganizationUserUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationUserUpdateRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update details on a user of the organization
     * @param body OrganizationUserUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationUserUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Add or modify a user of the organization
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation() {
        return toPutRequestInformation(null);
    }
    /**
     * Add or modify a user of the organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithMemberUserItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithMemberUserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithMemberUserItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
