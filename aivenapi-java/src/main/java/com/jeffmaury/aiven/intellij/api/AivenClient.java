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
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AivenClient extends BaseRequestBuilder {
    /**
     * The access_token property
     */
    @jakarta.annotation.Nonnull
    public AccessTokenRequestBuilder accessToken() {
        return new AccessTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The account property
     */
    @jakarta.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The billingGroup property
     */
    @jakarta.annotation.Nonnull
    public BillingGroupRequestBuilder billingGroup() {
        return new BillingGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The card property
     */
    @jakarta.annotation.Nonnull
    public CardRequestBuilder card() {
        return new CardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clouds property
     */
    @jakarta.annotation.Nonnull
    public CloudsRequestBuilder clouds() {
        return new CloudsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The me property
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organization property
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organizations property
     */
    @jakarta.annotation.Nonnull
    public OrganizationsRequestBuilder organizations() {
        return new OrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The project property
     */
    @jakarta.annotation.Nonnull
    public ProjectRequestBuilder project() {
        return new ProjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The service_types property
     */
    @jakarta.annotation.Nonnull
    public ServiceTypesRequestBuilder serviceTypes() {
        return new ServiceTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The service_versions property
     */
    @jakarta.annotation.Nonnull
    public ServiceVersionsRequestBuilder serviceVersions() {
        return new ServiceVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tenants property
     */
    @jakarta.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The userauth property
     */
    @jakarta.annotation.Nonnull
    public UserauthRequestBuilder userauth() {
        return new UserauthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AivenClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AivenClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.aiven.io/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
