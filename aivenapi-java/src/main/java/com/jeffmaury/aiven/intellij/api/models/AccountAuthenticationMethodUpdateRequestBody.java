package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountAuthenticationMethodUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountAuthenticationMethodUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in
     */
    private Boolean authenticationMethodEnabled;
    /**
     * Authentication Method Name
     */
    private String authenticationMethodName;
    /**
     * Automatically add users to a team, when user signs up using this authentication method
     */
    private String autoJoinTeamId;
    /**
     * Automatically add users to a group, when user signs up using this authentication method
     */
    private String autoJoinUserGroupId;
    /**
     * Set to 'true' to enable WantAssertionsSigned
     */
    private Boolean samlAssertionSignedEnabled;
    /**
     * Set to 'true' to enable AuthnRequestsSigned
     */
    private Boolean samlAuthnRequestsSignedEnabled;
    /**
     * Identity provider's certificate
     */
    private String samlCertificate;
    /**
     * Digest algorithm. This is an advanced option that typically does not need to be set.
     */
    private AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm samlDigestAlgorithm;
    /**
     * Saml Entity ID
     */
    private String samlEntityId;
    /**
     * SAMLFieldMapping
     */
    private AccountAuthenticationMethodUpdateRequestBodySamlFieldMapping samlFieldMapping;
    /**
     * Set to 'true' to enable IdP initiated login
     */
    private Boolean samlIdpLoginAllowed;
    /**
     * Saml Idp Url
     */
    private String samlIdpUrl;
    /**
     * Set to 'false' to disable RequestedAuthnContext
     */
    private Boolean samlRequestedAuthnContextEnabled;
    /**
     * SAMLSignatureAlgorithm
     */
    private AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm samlSignatureAlgorithm;
    /**
     * SAMLVariant
     */
    private AccountAuthenticationMethodUpdateRequestBodySamlVariant samlVariant;
    /**
     * Instantiates a new AccountAuthenticationMethodUpdateRequestBody and sets the default values.
     */
    public AccountAuthenticationMethodUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccountAuthenticationMethodUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodUpdateRequestBody();
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
     * Gets the authentication_method_enabled property value. If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthenticationMethodEnabled() {
        return this.authenticationMethodEnabled;
    }
    /**
     * Gets the authentication_method_name property value. Authentication Method Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethodName() {
        return this.authenticationMethodName;
    }
    /**
     * Gets the auto_join_team_id property value. Automatically add users to a team, when user signs up using this authentication method
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAutoJoinTeamId() {
        return this.autoJoinTeamId;
    }
    /**
     * Gets the auto_join_user_group_id property value. Automatically add users to a group, when user signs up using this authentication method
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAutoJoinUserGroupId() {
        return this.autoJoinUserGroupId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("authentication_method_enabled", (n) -> { this.setAuthenticationMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("authentication_method_name", (n) -> { this.setAuthenticationMethodName(n.getStringValue()); });
        deserializerMap.put("auto_join_team_id", (n) -> { this.setAutoJoinTeamId(n.getStringValue()); });
        deserializerMap.put("auto_join_user_group_id", (n) -> { this.setAutoJoinUserGroupId(n.getStringValue()); });
        deserializerMap.put("saml_assertion_signed_enabled", (n) -> { this.setSamlAssertionSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_authn_requests_signed_enabled", (n) -> { this.setSamlAuthnRequestsSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_certificate", (n) -> { this.setSamlCertificate(n.getStringValue()); });
        deserializerMap.put("saml_digest_algorithm", (n) -> { this.setSamlDigestAlgorithm(n.getEnumValue(AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm::forValue)); });
        deserializerMap.put("saml_entity_id", (n) -> { this.setSamlEntityId(n.getStringValue()); });
        deserializerMap.put("saml_field_mapping", (n) -> { this.setSamlFieldMapping(n.getObjectValue(AccountAuthenticationMethodUpdateRequestBodySamlFieldMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("saml_idp_login_allowed", (n) -> { this.setSamlIdpLoginAllowed(n.getBooleanValue()); });
        deserializerMap.put("saml_idp_url", (n) -> { this.setSamlIdpUrl(n.getStringValue()); });
        deserializerMap.put("saml_requested_authn_context_enabled", (n) -> { this.setSamlRequestedAuthnContextEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_signature_algorithm", (n) -> { this.setSamlSignatureAlgorithm(n.getEnumValue(AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm::forValue)); });
        deserializerMap.put("saml_variant", (n) -> { this.setSamlVariant(n.getEnumValue(AccountAuthenticationMethodUpdateRequestBodySamlVariant::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the saml_assertion_signed_enabled property value. Set to 'true' to enable WantAssertionsSigned
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSamlAssertionSignedEnabled() {
        return this.samlAssertionSignedEnabled;
    }
    /**
     * Gets the saml_authn_requests_signed_enabled property value. Set to 'true' to enable AuthnRequestsSigned
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSamlAuthnRequestsSignedEnabled() {
        return this.samlAuthnRequestsSignedEnabled;
    }
    /**
     * Gets the saml_certificate property value. Identity provider's certificate
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSamlCertificate() {
        return this.samlCertificate;
    }
    /**
     * Gets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @return a AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm getSamlDigestAlgorithm() {
        return this.samlDigestAlgorithm;
    }
    /**
     * Gets the saml_entity_id property value. Saml Entity ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSamlEntityId() {
        return this.samlEntityId;
    }
    /**
     * Gets the saml_field_mapping property value. SAMLFieldMapping
     * @return a AccountAuthenticationMethodUpdateRequestBodySamlFieldMapping
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateRequestBodySamlFieldMapping getSamlFieldMapping() {
        return this.samlFieldMapping;
    }
    /**
     * Gets the saml_idp_login_allowed property value. Set to 'true' to enable IdP initiated login
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSamlIdpLoginAllowed() {
        return this.samlIdpLoginAllowed;
    }
    /**
     * Gets the saml_idp_url property value. Saml Idp Url
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSamlIdpUrl() {
        return this.samlIdpUrl;
    }
    /**
     * Gets the saml_requested_authn_context_enabled property value. Set to 'false' to disable RequestedAuthnContext
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSamlRequestedAuthnContextEnabled() {
        return this.samlRequestedAuthnContextEnabled;
    }
    /**
     * Gets the saml_signature_algorithm property value. SAMLSignatureAlgorithm
     * @return a AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm getSamlSignatureAlgorithm() {
        return this.samlSignatureAlgorithm;
    }
    /**
     * Gets the saml_variant property value. SAMLVariant
     * @return a AccountAuthenticationMethodUpdateRequestBodySamlVariant
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodUpdateRequestBodySamlVariant getSamlVariant() {
        return this.samlVariant;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("authentication_method_enabled", this.getAuthenticationMethodEnabled());
        writer.writeStringValue("authentication_method_name", this.getAuthenticationMethodName());
        writer.writeStringValue("auto_join_team_id", this.getAutoJoinTeamId());
        writer.writeStringValue("auto_join_user_group_id", this.getAutoJoinUserGroupId());
        writer.writeBooleanValue("saml_assertion_signed_enabled", this.getSamlAssertionSignedEnabled());
        writer.writeBooleanValue("saml_authn_requests_signed_enabled", this.getSamlAuthnRequestsSignedEnabled());
        writer.writeStringValue("saml_certificate", this.getSamlCertificate());
        writer.writeEnumValue("saml_digest_algorithm", this.getSamlDigestAlgorithm());
        writer.writeStringValue("saml_entity_id", this.getSamlEntityId());
        writer.writeObjectValue("saml_field_mapping", this.getSamlFieldMapping());
        writer.writeBooleanValue("saml_idp_login_allowed", this.getSamlIdpLoginAllowed());
        writer.writeStringValue("saml_idp_url", this.getSamlIdpUrl());
        writer.writeBooleanValue("saml_requested_authn_context_enabled", this.getSamlRequestedAuthnContextEnabled());
        writer.writeEnumValue("saml_signature_algorithm", this.getSamlSignatureAlgorithm());
        writer.writeEnumValue("saml_variant", this.getSamlVariant());
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
     * Sets the authentication_method_enabled property value. If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in
     * @param value Value to set for the authentication_method_enabled property.
     */
    public void setAuthenticationMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.authenticationMethodEnabled = value;
    }
    /**
     * Sets the authentication_method_name property value. Authentication Method Name
     * @param value Value to set for the authentication_method_name property.
     */
    public void setAuthenticationMethodName(@jakarta.annotation.Nullable final String value) {
        this.authenticationMethodName = value;
    }
    /**
     * Sets the auto_join_team_id property value. Automatically add users to a team, when user signs up using this authentication method
     * @param value Value to set for the auto_join_team_id property.
     */
    public void setAutoJoinTeamId(@jakarta.annotation.Nullable final String value) {
        this.autoJoinTeamId = value;
    }
    /**
     * Sets the auto_join_user_group_id property value. Automatically add users to a group, when user signs up using this authentication method
     * @param value Value to set for the auto_join_user_group_id property.
     */
    public void setAutoJoinUserGroupId(@jakarta.annotation.Nullable final String value) {
        this.autoJoinUserGroupId = value;
    }
    /**
     * Sets the saml_assertion_signed_enabled property value. Set to 'true' to enable WantAssertionsSigned
     * @param value Value to set for the saml_assertion_signed_enabled property.
     */
    public void setSamlAssertionSignedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.samlAssertionSignedEnabled = value;
    }
    /**
     * Sets the saml_authn_requests_signed_enabled property value. Set to 'true' to enable AuthnRequestsSigned
     * @param value Value to set for the saml_authn_requests_signed_enabled property.
     */
    public void setSamlAuthnRequestsSignedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.samlAuthnRequestsSignedEnabled = value;
    }
    /**
     * Sets the saml_certificate property value. Identity provider's certificate
     * @param value Value to set for the saml_certificate property.
     */
    public void setSamlCertificate(@jakarta.annotation.Nullable final String value) {
        this.samlCertificate = value;
    }
    /**
     * Sets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @param value Value to set for the saml_digest_algorithm property.
     */
    public void setSamlDigestAlgorithm(@jakarta.annotation.Nullable final AccountAuthenticationMethodUpdateRequestBodySamlDigestAlgorithm value) {
        this.samlDigestAlgorithm = value;
    }
    /**
     * Sets the saml_entity_id property value. Saml Entity ID
     * @param value Value to set for the saml_entity_id property.
     */
    public void setSamlEntityId(@jakarta.annotation.Nullable final String value) {
        this.samlEntityId = value;
    }
    /**
     * Sets the saml_field_mapping property value. SAMLFieldMapping
     * @param value Value to set for the saml_field_mapping property.
     */
    public void setSamlFieldMapping(@jakarta.annotation.Nullable final AccountAuthenticationMethodUpdateRequestBodySamlFieldMapping value) {
        this.samlFieldMapping = value;
    }
    /**
     * Sets the saml_idp_login_allowed property value. Set to 'true' to enable IdP initiated login
     * @param value Value to set for the saml_idp_login_allowed property.
     */
    public void setSamlIdpLoginAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.samlIdpLoginAllowed = value;
    }
    /**
     * Sets the saml_idp_url property value. Saml Idp Url
     * @param value Value to set for the saml_idp_url property.
     */
    public void setSamlIdpUrl(@jakarta.annotation.Nullable final String value) {
        this.samlIdpUrl = value;
    }
    /**
     * Sets the saml_requested_authn_context_enabled property value. Set to 'false' to disable RequestedAuthnContext
     * @param value Value to set for the saml_requested_authn_context_enabled property.
     */
    public void setSamlRequestedAuthnContextEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.samlRequestedAuthnContextEnabled = value;
    }
    /**
     * Sets the saml_signature_algorithm property value. SAMLSignatureAlgorithm
     * @param value Value to set for the saml_signature_algorithm property.
     */
    public void setSamlSignatureAlgorithm(@jakarta.annotation.Nullable final AccountAuthenticationMethodUpdateRequestBodySamlSignatureAlgorithm value) {
        this.samlSignatureAlgorithm = value;
    }
    /**
     * Sets the saml_variant property value. SAMLVariant
     * @param value Value to set for the saml_variant property.
     */
    public void setSamlVariant(@jakarta.annotation.Nullable final AccountAuthenticationMethodUpdateRequestBodySamlVariant value) {
        this.samlVariant = value;
    }
}
