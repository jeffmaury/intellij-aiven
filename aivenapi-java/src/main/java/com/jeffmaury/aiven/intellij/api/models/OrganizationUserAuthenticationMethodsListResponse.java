package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserAuthenticationMethodsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserAuthenticationMethodsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of authentication methods for the organization user
     */
    private java.util.List<OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods> authenticationMethods;
    /**
     * Instantiates a new OrganizationUserAuthenticationMethodsListResponse and sets the default values.
     */
    public OrganizationUserAuthenticationMethodsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserAuthenticationMethodsListResponse
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserAuthenticationMethodsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserAuthenticationMethodsListResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authentication_methods property value. List of authentication methods for the organization user
     * @return a java.util.List<OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods> getAuthenticationMethods() {
        return this.authenticationMethods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("authentication_methods", (n) -> { this.setAuthenticationMethods(n.getCollectionOfObjectValues(OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("authentication_methods", this.getAuthenticationMethods());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authentication_methods property value. List of authentication methods for the organization user
     * @param value Value to set for the authentication_methods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final java.util.List<OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods> value) {
        this.authenticationMethods = value;
    }
}
