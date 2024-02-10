package com.jeffmaury.aiven.intellij.api.organization.item.usergroups;

import com.jeffmaury.aiven.intellij.api.models.UserGroupCreateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.UserGroupCreateResponse;
import com.jeffmaury.aiven.intellij.api.models.UserGroupsListResponse;
import com.jeffmaury.aiven.intellij.api.organization.item.usergroups.item.WithUserGroupItemRequestBuilder;
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
 * Builds and executes requests for operations under /organization/{organization_id}/user-groups
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserGroupsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.jeffmaury.aiven.intellij.api.organization.item.userGroups.item collection
     * @param user_group_id ID of the user group
     * @return a WithUserGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserGroupItemRequestBuilder byUser_group_id(@jakarta.annotation.Nonnull final String user_group_id) {
        Objects.requireNonNull(user_group_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_group_id", user_group_id);
        return new WithUserGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserGroupsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserGroupsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user-groups", pathParameters);
    }
    /**
     * Instantiates a new UserGroupsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserGroupsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization_id}/user-groups", rawUrl);
    }
    /**
     * <p>List all user groups within an organization</p>
     * @return a UserGroupsListResponse
     */
    @jakarta.annotation.Nullable
    public UserGroupsListResponse get() {
        return get(null);
    }
    /**
     * <p>List all user groups within an organization</p>
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserGroupsListResponse
     */
    @jakarta.annotation.Nullable
    public UserGroupsListResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserGroupsListResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>Create a new user group in an organization</p>
     * @param body UserGroupCreateRequestBody
     * @return a UserGroupCreateResponse
     */
    @jakarta.annotation.Nullable
    public UserGroupCreateResponse post(@jakarta.annotation.Nonnull final UserGroupCreateRequestBody body) {
        return post(body, null);
    }
    /**
     * <p>Create a new user group in an organization</p>
     * @param body UserGroupCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserGroupCreateResponse
     */
    @jakarta.annotation.Nullable
    public UserGroupCreateResponse post(@jakarta.annotation.Nonnull final UserGroupCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UserGroupCreateResponse::createFromDiscriminatorValue);
    }
    /**
     * <p>List all user groups within an organization</p>
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * <p>List all user groups within an organization</p>
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
     * <p>Create a new user group in an organization</p>
     * @param body UserGroupCreateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserGroupCreateRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * <p>Create a new user group in an organization</p>
     * @param body UserGroupCreateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserGroupCreateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UserGroupsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserGroupsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserGroupsRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
