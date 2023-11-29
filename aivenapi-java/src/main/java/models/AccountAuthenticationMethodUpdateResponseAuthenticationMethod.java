package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AuthenticationMethod
 */
public class AccountAuthenticationMethodUpdateResponseAuthenticationMethod implements AdditionalDataHolder, Parsable {
    /** Account ID */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in */
    private Boolean authenticationMethodEnabled;
    /** Authentication Method ID */
    private String authenticationMethodId;
    /** Authentication Method Name */
    private String authenticationMethodName;
    /** Authentication method type */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType authenticationMethodType;
    /** Automatically add users to a team, when user signs up using this authentication method */
    private String autoJoinTeamId;
    /** Automatically add users to a group, when user signs up using this authentication method */
    private String autoJoinUserGroupId;
    /** Create Time */
    private String createTime;
    /** Delete Time */
    private String deleteTime;
    /** Organization ID */
    private String organizationId;
    /** Saml Acs Url */
    private String samlAcsUrl;
    /** Set to 'true' to enable WantAssertionsSigned */
    private Boolean samlAssertionSignedEnabled;
    /** Set to 'true' to enable AuthnRequestsSigned */
    private Boolean samlAuthnRequestsSignedEnabled;
    /** SAMLVariant */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlCert samlCert;
    /** Identity provider's certificate */
    private String samlCertificate;
    /** Saml Certificate Issuer */
    private String samlCertificateIssuer;
    /** Saml Certificate Not Valid After */
    private String samlCertificateNotValidAfter;
    /** Saml Certificate Not Valid Before */
    private String samlCertificateNotValidBefore;
    /** Saml Certificate Subject */
    private String samlCertificateSubject;
    /** Digest algorithm. This is an advanced option that typically does not need to be set. */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlDigestAlgorithm samlDigestAlgorithm;
    /** Saml Entity ID */
    private String samlEntityId;
    /** SAMLFieldMapping */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping samlFieldMapping;
    /** Set to 'true' to enable IdP initiated login */
    private Boolean samlIdpLoginAllowed;
    /** Saml Idp Url */
    private String samlIdpUrl;
    /** Saml Metadata Url */
    private String samlMetadataUrl;
    /** Set to 'false' to disable RequestedAuthnContext */
    private Boolean samlRequestedAuthnContextEnabled;
    /** SAMLSignatureAlgorithm */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlSignatureAlgorithm samlSignatureAlgorithm;
    /** Saml Sp Certificate */
    private String samlSpCertificate;
    /** SAMLVariant */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlVariant samlVariant;
    /** AuthenticationMethodState */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethodState state;
    /** Update Time */
    private String updateTime;
    /**
     * Instantiates a new AccountAuthenticationMethodUpdateResponseAuthenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethod() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static AccountAuthenticationMethodUpdateResponseAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodUpdateResponseAuthenticationMethod();
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
     * Gets the authentication_method_enabled property value. If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthenticationMethodEnabled() {
        return this.authenticationMethodEnabled;
    }
    /**
     * Gets the authentication_method_id property value. Authentication Method ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationMethodId() {
        return this.authenticationMethodId;
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
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType getAuthenticationMethodType() {
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
     * Gets the create_time property value. Create Time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the delete_time property value. Delete Time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("authentication_method_enabled", (n) -> { this.setAuthenticationMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("authentication_method_id", (n) -> { this.setAuthenticationMethodId(n.getStringValue()); });
        deserializerMap.put("authentication_method_name", (n) -> { this.setAuthenticationMethodName(n.getStringValue()); });
        deserializerMap.put("authentication_method_type", (n) -> { this.setAuthenticationMethodType(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType.class)); });
        deserializerMap.put("auto_join_team_id", (n) -> { this.setAutoJoinTeamId(n.getStringValue()); });
        deserializerMap.put("auto_join_user_group_id", (n) -> { this.setAutoJoinUserGroupId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("delete_time", (n) -> { this.setDeleteTime(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("saml_acs_url", (n) -> { this.setSamlAcsUrl(n.getStringValue()); });
        deserializerMap.put("saml_assertion_signed_enabled", (n) -> { this.setSamlAssertionSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_authn_requests_signed_enabled", (n) -> { this.setSamlAuthnRequestsSignedEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_cert", (n) -> { this.setSamlCert(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlCert.class)); });
        deserializerMap.put("saml_certificate", (n) -> { this.setSamlCertificate(n.getStringValue()); });
        deserializerMap.put("saml_certificate_issuer", (n) -> { this.setSamlCertificateIssuer(n.getStringValue()); });
        deserializerMap.put("saml_certificate_not_valid_after", (n) -> { this.setSamlCertificateNotValidAfter(n.getStringValue()); });
        deserializerMap.put("saml_certificate_not_valid_before", (n) -> { this.setSamlCertificateNotValidBefore(n.getStringValue()); });
        deserializerMap.put("saml_certificate_subject", (n) -> { this.setSamlCertificateSubject(n.getStringValue()); });
        deserializerMap.put("saml_digest_algorithm", (n) -> { this.setSamlDigestAlgorithm(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlDigestAlgorithm.class)); });
        deserializerMap.put("saml_entity_id", (n) -> { this.setSamlEntityId(n.getStringValue()); });
        deserializerMap.put("saml_field_mapping", (n) -> { this.setSamlFieldMapping(n.getObjectValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("saml_idp_login_allowed", (n) -> { this.setSamlIdpLoginAllowed(n.getBooleanValue()); });
        deserializerMap.put("saml_idp_url", (n) -> { this.setSamlIdpUrl(n.getStringValue()); });
        deserializerMap.put("saml_metadata_url", (n) -> { this.setSamlMetadataUrl(n.getStringValue()); });
        deserializerMap.put("saml_requested_authn_context_enabled", (n) -> { this.setSamlRequestedAuthnContextEnabled(n.getBooleanValue()); });
        deserializerMap.put("saml_signature_algorithm", (n) -> { this.setSamlSignatureAlgorithm(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlSignatureAlgorithm.class)); });
        deserializerMap.put("saml_sp_certificate", (n) -> { this.setSamlSpCertificate(n.getStringValue()); });
        deserializerMap.put("saml_variant", (n) -> { this.setSamlVariant(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlVariant.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethodState.class)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the organization_id property value. Organization ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the saml_acs_url property value. Saml Acs Url
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlAcsUrl() {
        return this.samlAcsUrl;
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
     * Gets the saml_cert property value. SAMLVariant
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlCert
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlCert getSamlCert() {
        return this.samlCert;
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
     * Gets the saml_certificate_issuer property value. Saml Certificate Issuer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlCertificateIssuer() {
        return this.samlCertificateIssuer;
    }
    /**
     * Gets the saml_certificate_not_valid_after property value. Saml Certificate Not Valid After
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlCertificateNotValidAfter() {
        return this.samlCertificateNotValidAfter;
    }
    /**
     * Gets the saml_certificate_not_valid_before property value. Saml Certificate Not Valid Before
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlCertificateNotValidBefore() {
        return this.samlCertificateNotValidBefore;
    }
    /**
     * Gets the saml_certificate_subject property value. Saml Certificate Subject
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlCertificateSubject() {
        return this.samlCertificateSubject;
    }
    /**
     * Gets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlDigestAlgorithm
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlDigestAlgorithm getSamlDigestAlgorithm() {
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
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping getSamlFieldMapping() {
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
     * Gets the saml_metadata_url property value. Saml Metadata Url
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlMetadataUrl() {
        return this.samlMetadataUrl;
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
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlSignatureAlgorithm
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlSignatureAlgorithm getSamlSignatureAlgorithm() {
        return this.samlSignatureAlgorithm;
    }
    /**
     * Gets the saml_sp_certificate property value. Saml Sp Certificate
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSamlSpCertificate() {
        return this.samlSpCertificate;
    }
    /**
     * Gets the saml_variant property value. SAMLVariant
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlVariant
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlVariant getSamlVariant() {
        return this.samlVariant;
    }
    /**
     * Gets the state property value. AuthenticationMethodState
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodState
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodState getState() {
        return this.state;
    }
    /**
     * Gets the update_time property value. Update Time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeBooleanValue("authentication_method_enabled", this.getAuthenticationMethodEnabled());
        writer.writeStringValue("authentication_method_id", this.getAuthenticationMethodId());
        writer.writeStringValue("authentication_method_name", this.getAuthenticationMethodName());
        writer.writeEnumValue("authentication_method_type", this.getAuthenticationMethodType());
        writer.writeStringValue("auto_join_team_id", this.getAutoJoinTeamId());
        writer.writeStringValue("auto_join_user_group_id", this.getAutoJoinUserGroupId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("delete_time", this.getDeleteTime());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("saml_acs_url", this.getSamlAcsUrl());
        writer.writeBooleanValue("saml_assertion_signed_enabled", this.getSamlAssertionSignedEnabled());
        writer.writeBooleanValue("saml_authn_requests_signed_enabled", this.getSamlAuthnRequestsSignedEnabled());
        writer.writeEnumValue("saml_cert", this.getSamlCert());
        writer.writeStringValue("saml_certificate", this.getSamlCertificate());
        writer.writeStringValue("saml_certificate_issuer", this.getSamlCertificateIssuer());
        writer.writeStringValue("saml_certificate_not_valid_after", this.getSamlCertificateNotValidAfter());
        writer.writeStringValue("saml_certificate_not_valid_before", this.getSamlCertificateNotValidBefore());
        writer.writeStringValue("saml_certificate_subject", this.getSamlCertificateSubject());
        writer.writeEnumValue("saml_digest_algorithm", this.getSamlDigestAlgorithm());
        writer.writeStringValue("saml_entity_id", this.getSamlEntityId());
        writer.writeObjectValue("saml_field_mapping", this.getSamlFieldMapping());
        writer.writeBooleanValue("saml_idp_login_allowed", this.getSamlIdpLoginAllowed());
        writer.writeStringValue("saml_idp_url", this.getSamlIdpUrl());
        writer.writeStringValue("saml_metadata_url", this.getSamlMetadataUrl());
        writer.writeBooleanValue("saml_requested_authn_context_enabled", this.getSamlRequestedAuthnContextEnabled());
        writer.writeEnumValue("saml_signature_algorithm", this.getSamlSignatureAlgorithm());
        writer.writeStringValue("saml_sp_certificate", this.getSamlSpCertificate());
        writer.writeEnumValue("saml_variant", this.getSamlVariant());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
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
     * Sets the authentication_method_enabled property value. If true, authentication method can be used to access account/projects in account. If false, authentication method can still be used to sign in
     * @param value Value to set for the authenticationMethodEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodEnabled(@javax.annotation.Nullable final Boolean value) {
        this.authenticationMethodEnabled = value;
    }
    /**
     * Sets the authentication_method_id property value. Authentication Method ID
     * @param value Value to set for the authenticationMethodId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodId(@javax.annotation.Nullable final String value) {
        this.authenticationMethodId = value;
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
    public void setAuthenticationMethodType(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodAuthenticationMethodType value) {
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
     * Sets the create_time property value. Create Time
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the delete_time property value. Delete Time
     * @param value Value to set for the deleteTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeleteTime(@javax.annotation.Nullable final String value) {
        this.deleteTime = value;
    }
    /**
     * Sets the organization_id property value. Organization ID
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the saml_acs_url property value. Saml Acs Url
     * @param value Value to set for the samlAcsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlAcsUrl(@javax.annotation.Nullable final String value) {
        this.samlAcsUrl = value;
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
     * Sets the saml_cert property value. SAMLVariant
     * @param value Value to set for the samlCert property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCert(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlCert value) {
        this.samlCert = value;
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
     * Sets the saml_certificate_issuer property value. Saml Certificate Issuer
     * @param value Value to set for the samlCertificateIssuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCertificateIssuer(@javax.annotation.Nullable final String value) {
        this.samlCertificateIssuer = value;
    }
    /**
     * Sets the saml_certificate_not_valid_after property value. Saml Certificate Not Valid After
     * @param value Value to set for the samlCertificateNotValidAfter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCertificateNotValidAfter(@javax.annotation.Nullable final String value) {
        this.samlCertificateNotValidAfter = value;
    }
    /**
     * Sets the saml_certificate_not_valid_before property value. Saml Certificate Not Valid Before
     * @param value Value to set for the samlCertificateNotValidBefore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCertificateNotValidBefore(@javax.annotation.Nullable final String value) {
        this.samlCertificateNotValidBefore = value;
    }
    /**
     * Sets the saml_certificate_subject property value. Saml Certificate Subject
     * @param value Value to set for the samlCertificateSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlCertificateSubject(@javax.annotation.Nullable final String value) {
        this.samlCertificateSubject = value;
    }
    /**
     * Sets the saml_digest_algorithm property value. Digest algorithm. This is an advanced option that typically does not need to be set.
     * @param value Value to set for the samlDigestAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlDigestAlgorithm(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlDigestAlgorithm value) {
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
    public void setSamlFieldMapping(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping value) {
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
     * Sets the saml_metadata_url property value. Saml Metadata Url
     * @param value Value to set for the samlMetadataUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlMetadataUrl(@javax.annotation.Nullable final String value) {
        this.samlMetadataUrl = value;
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
    public void setSamlSignatureAlgorithm(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlSignatureAlgorithm value) {
        this.samlSignatureAlgorithm = value;
    }
    /**
     * Sets the saml_sp_certificate property value. Saml Sp Certificate
     * @param value Value to set for the samlSpCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlSpCertificate(@javax.annotation.Nullable final String value) {
        this.samlSpCertificate = value;
    }
    /**
     * Sets the saml_variant property value. SAMLVariant
     * @param value Value to set for the samlVariant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlVariant(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlVariant value) {
        this.samlVariant = value;
    }
    /**
     * Sets the state property value. AuthenticationMethodState
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethodState value) {
        this.state = value;
    }
    /**
     * Sets the update_time property value. Update Time
     * @param value Value to set for the updateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateTime(@javax.annotation.Nullable final String value) {
        this.updateTime = value;
    }
}
