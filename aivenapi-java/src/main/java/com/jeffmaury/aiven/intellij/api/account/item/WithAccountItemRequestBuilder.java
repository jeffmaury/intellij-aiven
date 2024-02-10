package com.jeffmaury.aiven.intellij.api.account.item;

import com.jeffmaury.aiven.intellij.api.account.item.authentication.AuthenticationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.billinggroup.BillingGroupRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.events.EventsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.invite.InviteRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.parent_account.ParentAccountRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.payment_method.PaymentMethodRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.payment_methods.PaymentMethodsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.project.ProjectRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.projects.ProjectsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.team.TeamRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.teams.TeamsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.user.UserRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.item.users.UsersRequestBuilder;
import com.jeffmaury.aiven.intellij.api.models.AccountDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountGetResponse;
import com.jeffmaury.aiven.intellij.api.models.AccountUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.AccountUpdateResponse;
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
 * Builds and executes requests for operations under /account/{account_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAccountItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The authentication property
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The billingGroup property
     */
    @jakarta.annotation.Nonnull
    public BillingGroupRequestBuilder billingGroup() {
        return new BillingGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invite property
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The parent_account property
     */
    @jakarta.annotation.Nonnull
    public ParentAccountRequestBuilder parentAccount() {
        return new ParentAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payment_method property
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodRequestBuilder paymentMethod() {
        return new PaymentMethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payment_methods property
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder paymentMethods() {
        return new PaymentMethodsRequestBuilder(pathParameters, requestAdapter);
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
     * The team property
     */
    @jakarta.annotation.Nonnull
    public TeamRequestBuilder team() {
        return new TeamRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The teams property
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The users property
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithAccount_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAccountItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}", pathParameters);
    }
    /**
     * Instantiates a new WithAccount_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAccountItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/account/{account_id}", rawUrl);
    }
    /**
     * Delete empty account
     * @return a AccountDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete empty account
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountDeleteResponse
     */
    @jakarta.annotation.Nullable
    public AccountDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get account details
     * @return a AccountGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountGetResponse get() {
        return get(null);
    }
    /**
     * Get account details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountGetResponse
     */
    @jakarta.annotation.Nullable
    public AccountGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Update existing account
     * @param body AccountUpdateRequestBody
     * @return a AccountUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountUpdateResponse put(@jakarta.annotation.Nonnull final AccountUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update existing account
     * @param body AccountUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccountUpdateResponse
     */
    @jakarta.annotation.Nullable
    public AccountUpdateResponse put(@jakarta.annotation.Nonnull final AccountUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccountUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete empty account
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete empty account
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
     * Get account details
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get account details
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
     * Update existing account
     * @param body AccountUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update existing account
     * @param body AccountUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AccountUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithAccountItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAccountItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAccountItemRequestBuilder(rawUrl, requestAdapter);
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
