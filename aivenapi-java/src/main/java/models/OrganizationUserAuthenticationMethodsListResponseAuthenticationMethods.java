package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Verifies if 2FA is enabled for the user */
    private Boolean isEnabled2fa;
    /** Last activity time with the authentication method */
    private String lastUsedTime;
    /** Local authentication method provider resource ID */
    private String localProviderId;
    /** User authentication method ID */
    private String methodId;
    /** Name of the organization authentication method */
    private String name;
    /** Organization ID */
    private String organizationId;
    /** Remote authentication method provider ID */
    private String remoteProviderId;
    /** Type of the organization authentication method */
    private String type;
    /** User's email address for the authentication method */
    private String userEmail;
    /** User ID */
    private String userId;
    /**
     * Instantiates a new OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods
     */
    @javax.annotation.Nonnull
    public static OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserAuthenticationMethodsListResponseAuthenticationMethods();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("is_enabled_2fa", (n) -> { this.setIsEnabled2fa(n.getBooleanValue()); });
        deserializerMap.put("last_used_time", (n) -> { this.setLastUsedTime(n.getStringValue()); });
        deserializerMap.put("local_provider_id", (n) -> { this.setLocalProviderId(n.getStringValue()); });
        deserializerMap.put("method_id", (n) -> { this.setMethodId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("remote_provider_id", (n) -> { this.setRemoteProviderId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_enabled_2fa property value. Verifies if 2FA is enabled for the user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled2fa() {
        return this.isEnabled2fa;
    }
    /**
     * Gets the last_used_time property value. Last activity time with the authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }
    /**
     * Gets the local_provider_id property value. Local authentication method provider resource ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalProviderId() {
        return this.localProviderId;
    }
    /**
     * Gets the method_id property value. User authentication method ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethodId() {
        return this.methodId;
    }
    /**
     * Gets the name property value. Name of the organization authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the remote_provider_id property value. Remote authentication method provider ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteProviderId() {
        return this.remoteProviderId;
    }
    /**
     * Gets the type property value. Type of the organization authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the user_email property value. User's email address for the authentication method
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Gets the user_id property value. User ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("is_enabled_2fa", this.getIsEnabled2fa());
        writer.writeStringValue("last_used_time", this.getLastUsedTime());
        writer.writeStringValue("local_provider_id", this.getLocalProviderId());
        writer.writeStringValue("method_id", this.getMethodId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("remote_provider_id", this.getRemoteProviderId());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("user_email", this.getUserEmail());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the is_enabled_2fa property value. Verifies if 2FA is enabled for the user
     * @param value Value to set for the isEnabled2fa property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled2fa(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled2fa = value;
    }
    /**
     * Sets the last_used_time property value. Last activity time with the authentication method
     * @param value Value to set for the lastUsedTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUsedTime(@javax.annotation.Nullable final String value) {
        this.lastUsedTime = value;
    }
    /**
     * Sets the local_provider_id property value. Local authentication method provider resource ID
     * @param value Value to set for the localProviderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalProviderId(@javax.annotation.Nullable final String value) {
        this.localProviderId = value;
    }
    /**
     * Sets the method_id property value. User authentication method ID
     * @param value Value to set for the methodId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethodId(@javax.annotation.Nullable final String value) {
        this.methodId = value;
    }
    /**
     * Sets the name property value. Name of the organization authentication method
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the remote_provider_id property value. Remote authentication method provider ID
     * @param value Value to set for the remoteProviderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteProviderId(@javax.annotation.Nullable final String value) {
        this.remoteProviderId = value;
    }
    /**
     * Sets the type property value. Type of the organization authentication method
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the user_email property value. User's email address for the authentication method
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the user_id property value. User ID
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
