package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationAuthenticationConfigUpdateRequestBody
 */
public class OrganizationAuthenticationConfigUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Organization users are able to use OAuth authentication. */
    private Boolean oauthEnabled;
    /** Organization users are able to use password authentication. */
    private Boolean passwordAuthEnabled;
    /** Organization users are able to use SAML authentication. */
    private Boolean samlEnabled;
    /** 2FA is required to access resources in this organization. */
    private Boolean twoFactorRequired;
    /**
     * Instantiates a new OrganizationAuthenticationConfigUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationAuthenticationConfigUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationAuthenticationConfigUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static OrganizationAuthenticationConfigUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationAuthenticationConfigUpdateRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("oauth_enabled", (n) -> { this.setOauthEnabled(n.getBooleanValue()); });
        deserializerMap.put("password_auth_enabled", (n) -> { this.setPasswordAuthEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_enabled", (n) -> { this.setSamlEnabled(n.getBooleanValue()); });
        deserializerMap.put("two_factor_required", (n) -> { this.setTwoFactorRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the oauth_enabled property value. Organization users are able to use OAuth authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOauthEnabled() {
        return this.oauthEnabled;
    }
    /**
     * Gets the password_auth_enabled property value. Organization users are able to use password authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordAuthEnabled() {
        return this.passwordAuthEnabled;
    }
    /**
     * Gets the saml_enabled property value. Organization users are able to use SAML authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSamlEnabled() {
        return this.samlEnabled;
    }
    /**
     * Gets the two_factor_required property value. 2FA is required to access resources in this organization.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTwoFactorRequired() {
        return this.twoFactorRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("oauth_enabled", this.getOauthEnabled());
        writer.writeBooleanValue("password_auth_enabled", this.getPasswordAuthEnabled());
        writer.writeBooleanValue("saml_enabled", this.getSamlEnabled());
        writer.writeBooleanValue("two_factor_required", this.getTwoFactorRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the oauth_enabled property value. Organization users are able to use OAuth authentication.
     * @param value Value to set for the oauthEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOauthEnabled(@javax.annotation.Nullable final Boolean value) {
        this.oauthEnabled = value;
    }
    /**
     * Sets the password_auth_enabled property value. Organization users are able to use password authentication.
     * @param value Value to set for the passwordAuthEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordAuthEnabled(@javax.annotation.Nullable final Boolean value) {
        this.passwordAuthEnabled = value;
    }
    /**
     * Sets the saml_enabled property value. Organization users are able to use SAML authentication.
     * @param value Value to set for the samlEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlEnabled(@javax.annotation.Nullable final Boolean value) {
        this.samlEnabled = value;
    }
    /**
     * Sets the two_factor_required property value. 2FA is required to access resources in this organization.
     * @param value Value to set for the twoFactorRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTwoFactorRequired(@javax.annotation.Nullable final Boolean value) {
        this.twoFactorRequired = value;
    }
}
