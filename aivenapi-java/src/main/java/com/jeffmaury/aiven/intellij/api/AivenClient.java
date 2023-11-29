package com.jeffmaury.aiven.intellij.api;

import com.jeffmaury.aiven.intellij.api.access_token.AccessTokenRequestBuilder;
import com.jeffmaury.aiven.intellij.api.account.AccountRequestBuilder;
import com.jeffmaury.aiven.intellij.api.billinggroup.BillingGroupRequestBuilder;
import com.jeffmaury.aiven.intellij.api.card.CardRequestBuilder;
import com.jeffmaury.aiven.intellij.api.clouds.CloudsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.me.MeRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organization.OrganizationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.organizations.OrganizationsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.ProjectRequestBuilder;
import com.jeffmaury.aiven.intellij.api.service_types.ServiceTypesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.service_versions.ServiceVersionsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.tenants.TenantsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.user.UserRequestBuilder;
import com.jeffmaury.aiven.intellij.api.userauth.UserauthRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
public class AivenClient extends BaseRequestBuilder {
    /** The access_token property */
    @javax.annotation.Nonnull
    public AccessTokenRequestBuilder access_token() {
        return new AccessTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /** The account property */
    @javax.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The billingGroup property */
    @javax.annotation.Nonnull
    public BillingGroupRequestBuilder billingGroup() {
        return new BillingGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** The card property */
    @javax.annotation.Nonnull
    public CardRequestBuilder card() {
        return new CardRequestBuilder(pathParameters, requestAdapter);
    }
    /** The clouds property */
    @javax.annotation.Nonnull
    public CloudsRequestBuilder clouds() {
        return new CloudsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The me property */
    @javax.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organization property */
    @javax.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organizations property */
    @javax.annotation.Nonnull
    public OrganizationsRequestBuilder organizations() {
        return new OrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The project property */
    @javax.annotation.Nonnull
    public ProjectRequestBuilder project() {
        return new ProjectRequestBuilder(pathParameters, requestAdapter);
    }
    /** The service_types property */
    @javax.annotation.Nonnull
    public ServiceTypesRequestBuilder service_types() {
        return new ServiceTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The service_versions property */
    @javax.annotation.Nonnull
    public ServiceVersionsRequestBuilder service_versions() {
        return new ServiceVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tenants property */
    @javax.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The user property */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /** The userauth property */
    @javax.annotation.Nonnull
    public UserauthRequestBuilder userauth() {
        return new UserauthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AivenClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AivenClient(@javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(JsonSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(TextSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(FormSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(JsonParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(FormParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(TextParseNodeFactory.class);
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.aiven.io/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
