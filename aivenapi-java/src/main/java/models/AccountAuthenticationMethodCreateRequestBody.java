package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountAuthenticationMethodCreateRequestBody
 */
public class AccountAuthenticationMethodCreateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Authentication Method Name */
    private String authenticationMethodName;
    /** Authentication method type */
    private AccountAuthenticationMethodCreateRequestBodyAuthenticationMethodType authenticationMethodType;
    /** Automatically add users to a team, when user signs up using this authentication method */
    private String autoJoinTeamId;
    /** Automatically add users to a group, when user signs up using this authentication method */
    private String autoJoinUserGroupId;
    /** Set to 'true' to enable WantAssertionsSigned */
    private Boolean samlAssertionSignedEnabled;
    /** Set to 'true' to enable AuthnRequestsSigned */
    private Boolean samlAuthnRequestsSignedEnabled;
    /** Identity provider's certificate */
    private String samlCertificate;
    /** Digest algorithm. This is an advanced option that typically does not need to be set. */
    private AccountAuthenticationMethodCreateRequestBodySamlDigestAlgorithm samlDigestAlgorithm;
    /** Saml Entity ID */
    private String samlEntityId;
    /** SAMLFieldMapping */
    private AccountAuthenticationMethodCreateRequestBodySamlFieldMapping samlFieldMapping;
    /** Set to 'true' to enable IdP initiated login */
    private Boolean samlIdpLoginAllowed;
    /** Saml Idp Url */
    private String samlIdpUrl;
    /** Set to 'false' to disable RequestedAuthnContext */
    private Boolean samlRequestedAuthnContextEnabled;
    /** SAMLSignatureAlgorithm */
    private AccountAuthenticationMethodCreateRequestBodySamlSignatureAlgorithm samlSignatureAlgorithm;
    /** SAMLVariant */
    private AccountAuthenticationMethodCreateRequestBodySamlVariant samlVariant;
    /**
     * Instantiates a new AccountAuthenticationMethodCreateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodCreateRequestBody
     */
    @javax.annotation.Nonnull
    public static AccountAuthenticationMethodCreateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodCreateRequestBody();
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
     * Gets the authentication_method_name property value. Authentication Method Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationMethodName() {
        return this.authenticationMethodName;
    }
    /**
     * Gets the authentication_method_type property value. Authentication method type
     * @return a AccountAuthenticationMethodCreateRequestBodyAuthenticationMethodType
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBodyAuthenticationMethodType getAuthenticationMethodType() {
        return this.authenticationMethodType;
    }
    /**
     * Gets the auto_join_team_id property value. Automatically add users to a team, when user signs up using this authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutoJoinTeamId() {
        return this.autoJoinTeamId;
    }
    /**
     * Gets the auto_join_user_group_id property value. Automatically add users to a group, when user signs up using this authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutoJoinUserGroupId() {
        return this.autoJoinUserGroupId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("authentication_method_name", (n) -> { this.setAuthenticationMethodName(n.getStringValue()); });
        deserializerMap.put("authentication_method_type", (n) -> { this.setAuthenticationMethodType(n.getEnumValue(AccountAuthenticationMethodCreateRequestBodyAuthenticationMethodType.class)); });
        deserializerMap.put("auto_join_team_id", (n) -> { this.setAutoJoinTeamId(n.getStringValue()); });
        deserializerMap.put("auto_join_user_group_id", (n) -> { this.setAutoJoinUserGroupId(n.getStringValue()); });
        deserializerMap.put("saml_assertion_signed_enabled", (n) -> { this.setSamlAssertionSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_authn_requests_signed_enabled", (n) -> { this.setSamlAuthnRequestsSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_certificate", (n) -> { this.setSamlCertificate(n.getStringValue()); });
        deserializerMap.put("saml_digest_algorithm", (n) -> { this.setSamlDigestAlgorithm(n.getEnumValue(AccountAuthenticationMethodCreateRequestBodySamlDigestAlgorithm.class)); });
        deserializerMap.put("saml_entity_id", (n) -> { this.setSamlEntityId(n.getStringValue()); });
        deserializerMap.put("saml_field_mapping", (n) -> { this.setSamlFieldMapping(n.getObjectValue(AccountAuthenticationMethodCreateRequestBodySamlFieldMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("saml_idp_login_allowed", (n) -> { this.setSamlIdpLoginAllowed(n.getBooleanValue()); });
        deserializerMap.put("saml_idp_url", (n) -> { this.setSamlIdpUrl(n.getStringValue()); });
        deserializerMap.put("saml_requested_authn_context_enabled", (n) -> { this.setSamlRequestedAuthnContextEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_signature_algorithm", (n) -> { this.setSamlSignatureAlgorithm(n.getEnumValue(AccountAuthenticationMethodCreateRequestBodySamlSignatureAlgorithm.class)); });
        deserializerMap.put("saml_variant", (n) -> { this.setSamlVariant(n.getEnumValue(AccountAuthenticationMethodCreateRequestBodySamlVariant.class)); });
        return deserializerMap;
    }
    /**
     * Gets the saml_assertion_signed_enabled property value. Set to 'true' to enable WantAssertionsSigned
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSamlAssertionSignedEnabled() {
        return this.samlAssertionSignedEnabled;
    }
    /**
     * Gets the saml_authn_requests_signed_enabled property value. Set to 'true' to enable AuthnRequestsSigned
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSamlAuthnRequestsSignedEnabled() {
        return this.samlAuthnRequestsSignedEnabled;
    }
    /**
     * Gets the saml_certificate property value. Identity provider's certificate
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlCertificate() {
        return this.samlCertificate;
    }
    /**
     * Gets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @return a AccountAuthenticationMethodCreateRequestBodySamlDigestAlgorithm
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBodySamlDigestAlgorithm getSamlDigestAlgorithm() {
        return this.samlDigestAlgorithm;
    }
    /**
     * Gets the saml_entity_id property value. Saml Entity ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlEntityId() {
        return this.samlEntityId;
    }
    /**
     * Gets the saml_field_mapping property value. SAMLFieldMapping
     * @return a AccountAuthenticationMethodCreateRequestBodySamlFieldMapping
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBodySamlFieldMapping getSamlFieldMapping() {
        return this.samlFieldMapping;
    }
    /**
     * Gets the saml_idp_login_allowed property value. Set to 'true' to enable IdP initiated login
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSamlIdpLoginAllowed() {
        return this.samlIdpLoginAllowed;
    }
    /**
     * Gets the saml_idp_url property value. Saml Idp Url
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlIdpUrl() {
        return this.samlIdpUrl;
    }
    /**
     * Gets the saml_requested_authn_context_enabled property value. Set to 'false' to disable RequestedAuthnContext
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSamlRequestedAuthnContextEnabled() {
        return this.samlRequestedAuthnContextEnabled;
    }
    /**
     * Gets the saml_signature_algorithm property value. SAMLSignatureAlgorithm
     * @return a AccountAuthenticationMethodCreateRequestBodySamlSignatureAlgorithm
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBodySamlSignatureAlgorithm getSamlSignatureAlgorithm() {
        return this.samlSignatureAlgorithm;
    }
    /**
     * Gets the saml_variant property value. SAMLVariant
     * @return a AccountAuthenticationMethodCreateRequestBodySamlVariant
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodCreateRequestBodySamlVariant getSamlVariant() {
        return this.samlVariant;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authentication_method_name", this.getAuthenticationMethodName());
        writer.writeEnumValue("authentication_method_type", this.getAuthenticationMethodType());
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authentication_method_name property value. Authentication Method Name
     * @param value Value to set for the authenticationMethodName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodName(@javax.annotation.Nullable final String value) {
        this.authenticationMethodName = value;
    }
    /**
     * Sets the authentication_method_type property value. Authentication method type
     * @param value Value to set for the authenticationMethodType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodType(@javax.annotation.Nullable final AccountAuthenticationMethodCreateRequestBodyAuthenticationMethodType value) {
        this.authenticationMethodType = value;
    }
    /**
     * Sets the auto_join_team_id property value. Automatically add users to a team, when user signs up using this authentication method
     * @param value Value to set for the autoJoinTeamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoJoinTeamId(@javax.annotation.Nullable final String value) {
        this.autoJoinTeamId = value;
    }
    /**
     * Sets the auto_join_user_group_id property value. Automatically add users to a group, when user signs up using this authentication method
     * @param value Value to set for the autoJoinUserGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoJoinUserGroupId(@javax.annotation.Nullable final String value) {
        this.autoJoinUserGroupId = value;
    }
    /**
     * Sets the saml_assertion_signed_enabled property value. Set to 'true' to enable WantAssertionsSigned
     * @param value Value to set for the samlAssertionSignedEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlAssertionSignedEnabled(@javax.annotation.Nullable final Boolean value) {
        this.samlAssertionSignedEnabled = value;
    }
    /**
     * Sets the saml_authn_requests_signed_enabled property value. Set to 'true' to enable AuthnRequestsSigned
     * @param value Value to set for the samlAuthnRequestsSignedEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlAuthnRequestsSignedEnabled(@javax.annotation.Nullable final Boolean value) {
        this.samlAuthnRequestsSignedEnabled = value;
    }
    /**
     * Sets the saml_certificate property value. Identity provider's certificate
     * @param value Value to set for the samlCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCertificate(@javax.annotation.Nullable final String value) {
        this.samlCertificate = value;
    }
    /**
     * Sets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @param value Value to set for the samlDigestAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlDigestAlgorithm(@javax.annotation.Nullable final AccountAuthenticationMethodCreateRequestBodySamlDigestAlgorithm value) {
        this.samlDigestAlgorithm = value;
    }
    /**
     * Sets the saml_entity_id property value. Saml Entity ID
     * @param value Value to set for the samlEntityId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlEntityId(@javax.annotation.Nullable final String value) {
        this.samlEntityId = value;
    }
    /**
     * Sets the saml_field_mapping property value. SAMLFieldMapping
     * @param value Value to set for the samlFieldMapping property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlFieldMapping(@javax.annotation.Nullable final AccountAuthenticationMethodCreateRequestBodySamlFieldMapping value) {
        this.samlFieldMapping = value;
    }
    /**
     * Sets the saml_idp_login_allowed property value. Set to 'true' to enable IdP initiated login
     * @param value Value to set for the samlIdpLoginAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlIdpLoginAllowed(@javax.annotation.Nullable final Boolean value) {
        this.samlIdpLoginAllowed = value;
    }
    /**
     * Sets the saml_idp_url property value. Saml Idp Url
     * @param value Value to set for the samlIdpUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlIdpUrl(@javax.annotation.Nullable final String value) {
        this.samlIdpUrl = value;
    }
    /**
     * Sets the saml_requested_authn_context_enabled property value. Set to 'false' to disable RequestedAuthnContext
     * @param value Value to set for the samlRequestedAuthnContextEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlRequestedAuthnContextEnabled(@javax.annotation.Nullable final Boolean value) {
        this.samlRequestedAuthnContextEnabled = value;
    }
    /**
     * Sets the saml_signature_algorithm property value. SAMLSignatureAlgorithm
     * @param value Value to set for the samlSignatureAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlSignatureAlgorithm(@javax.annotation.Nullable final AccountAuthenticationMethodCreateRequestBodySamlSignatureAlgorithm value) {
        this.samlSignatureAlgorithm = value;
    }
    /**
     * Sets the saml_variant property value. SAMLVariant
     * @param value Value to set for the samlVariant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlVariant(@javax.annotation.Nullable final AccountAuthenticationMethodCreateRequestBodySamlVariant value) {
        this.samlVariant = value;
    }
}
