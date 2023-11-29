package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationDomainAddResponse
 */
public class OrganizationDomainAddResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Random string to be used for validation */
    private String challengeToken;
    /** Time of creating the domain */
    private String createTime;
    /** ID of the domain */
    private String domainId;
    /** Name of the domain */
    private String domainName;
    /** ID of the organization owning this domain */
    private String organizationId;
    /** State of the verification process */
    private OrganizationDomainAddResponseState state;
    /** Type of verification to be made */
    private OrganizationDomainAddResponseVerificationType verificationType;
    /**
     * Instantiates a new OrganizationDomainAddResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationDomainAddResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationDomainAddResponse
     */
    @javax.annotation.Nonnull
    public static OrganizationDomainAddResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationDomainAddResponse();
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
     * Gets the challenge_token property value. Random string to be used for validation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChallengeToken() {
        return this.challengeToken;
    }
    /**
     * Gets the create_time property value. Time of creating the domain
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the domain_id property value. ID of the domain
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainId() {
        return this.domainId;
    }
    /**
     * Gets the domain_name property value. Name of the domain
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("challenge_token", (n) -> { this.setChallengeToken(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("domain_id", (n) -> { this.setDomainId(n.getStringValue()); });
        deserializerMap.put("domain_name", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(OrganizationDomainAddResponseState.class)); });
        deserializerMap.put("verification_type", (n) -> { this.setVerificationType(n.getEnumValue(OrganizationDomainAddResponseVerificationType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the organization_id property value. ID of the organization owning this domain
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the state property value. State of the verification process
     * @return a OrganizationDomainAddResponseState
     */
    @javax.annotation.Nullable
    public OrganizationDomainAddResponseState getState() {
        return this.state;
    }
    /**
     * Gets the verification_type property value. Type of verification to be made
     * @return a OrganizationDomainAddResponseVerificationType
     */
    @javax.annotation.Nullable
    public OrganizationDomainAddResponseVerificationType getVerificationType() {
        return this.verificationType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("challenge_token", this.getChallengeToken());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("domain_id", this.getDomainId());
        writer.writeStringValue("domain_name", this.getDomainName());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeEnumValue("state", this.getState());
        writer.writeEnumValue("verification_type", this.getVerificationType());
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
     * Sets the challenge_token property value. Random string to be used for validation
     * @param value Value to set for the challengeToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChallengeToken(@javax.annotation.Nullable final String value) {
        this.challengeToken = value;
    }
    /**
     * Sets the create_time property value. Time of creating the domain
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the domain_id property value. ID of the domain
     * @param value Value to set for the domainId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainId(@javax.annotation.Nullable final String value) {
        this.domainId = value;
    }
    /**
     * Sets the domain_name property value. Name of the domain
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the organization_id property value. ID of the organization owning this domain
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the state property value. State of the verification process
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final OrganizationDomainAddResponseState value) {
        this.state = value;
    }
    /**
     * Sets the verification_type property value. Type of verification to be made
     * @param value Value to set for the verificationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerificationType(@javax.annotation.Nullable final OrganizationDomainAddResponseVerificationType value) {
        this.verificationType = value;
    }
}
