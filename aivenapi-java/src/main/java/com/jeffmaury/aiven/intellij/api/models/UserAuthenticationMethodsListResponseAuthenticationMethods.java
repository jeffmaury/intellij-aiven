package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAuthenticationMethodsListResponseAuthenticationMethods implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Account ID
     */
    private String authenticationMethodAccountId;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String createTime;
    /**
     * true if API was accessed with this authentication method
     */
    private Boolean currentlyActive;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String deleteTime;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String lastUsedTime;
    /**
     * Unique ID for authentication method
     */
    private String methodId;
    /**
     * Authentication method name
     */
    private String name;
    /**
     * Identity on remote provider, if available. May be email address, but not necessarily.
     */
    private String publicRemoteIdentity;
    /**
     * Provider ID
     */
    private String remoteProviderId;
    /**
     * State for authentication method
     */
    private UserAuthenticationMethodsListResponseAuthenticationMethodsState state;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String updateTime;
    /**
     * User email address
     */
    private String userEmail;
    /**
     * Instantiates a new UserAuthenticationMethodsListResponseAuthenticationMethods and sets the default values.
     */
    public UserAuthenticationMethodsListResponseAuthenticationMethods() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAuthenticationMethodsListResponseAuthenticationMethods
     */
    @jakarta.annotation.Nonnull
    public static UserAuthenticationMethodsListResponseAuthenticationMethods createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAuthenticationMethodsListResponseAuthenticationMethods();
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
     * Gets the authentication_method_account_id property value. Account ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethodAccountId() {
        return this.authenticationMethodAccountId;
    }
    /**
     * Gets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the currently_active property value. true if API was accessed with this authentication method
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCurrentlyActive() {
        return this.currentlyActive;
    }
    /**
     * Gets the delete_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("authentication_method_account_id", (n) -> { this.setAuthenticationMethodAccountId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("currently_active", (n) -> { this.setCurrentlyActive(n.getBooleanValue()); });
        deserializerMap.put("delete_time", (n) -> { this.setDeleteTime(n.getStringValue()); });
        deserializerMap.put("last_used_time", (n) -> { this.setLastUsedTime(n.getStringValue()); });
        deserializerMap.put("method_id", (n) -> { this.setMethodId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("public_remote_identity", (n) -> { this.setPublicRemoteIdentity(n.getStringValue()); });
        deserializerMap.put("remote_provider_id", (n) -> { this.setRemoteProviderId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(UserAuthenticationMethodsListResponseAuthenticationMethodsState::forValue)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the last_used_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }
    /**
     * Gets the method_id property value. Unique ID for authentication method
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMethodId() {
        return this.methodId;
    }
    /**
     * Gets the name property value. Authentication method name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the public_remote_identity property value. Identity on remote provider, if available. May be email address, but not necessarily.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicRemoteIdentity() {
        return this.publicRemoteIdentity;
    }
    /**
     * Gets the remote_provider_id property value. Provider ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteProviderId() {
        return this.remoteProviderId;
    }
    /**
     * Gets the state property value. State for authentication method
     * @return a UserAuthenticationMethodsListResponseAuthenticationMethodsState
     */
    @jakarta.annotation.Nullable
    public UserAuthenticationMethodsListResponseAuthenticationMethodsState getState() {
        return this.state;
    }
    /**
     * Gets the update_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_email property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authentication_method_account_id", this.getAuthenticationMethodAccountId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeBooleanValue("currently_active", this.getCurrentlyActive());
        writer.writeStringValue("delete_time", this.getDeleteTime());
        writer.writeStringValue("last_used_time", this.getLastUsedTime());
        writer.writeStringValue("method_id", this.getMethodId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("public_remote_identity", this.getPublicRemoteIdentity());
        writer.writeStringValue("remote_provider_id", this.getRemoteProviderId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeStringValue("user_email", this.getUserEmail());
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
     * Sets the authentication_method_account_id property value. Account ID
     * @param value Value to set for the authentication_method_account_id property.
     */
    public void setAuthenticationMethodAccountId(@jakarta.annotation.Nullable final String value) {
        this.authenticationMethodAccountId = value;
    }
    /**
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the currently_active property value. true if API was accessed with this authentication method
     * @param value Value to set for the currently_active property.
     */
    public void setCurrentlyActive(@jakarta.annotation.Nullable final Boolean value) {
        this.currentlyActive = value;
    }
    /**
     * Sets the delete_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the delete_time property.
     */
    public void setDeleteTime(@jakarta.annotation.Nullable final String value) {
        this.deleteTime = value;
    }
    /**
     * Sets the last_used_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the last_used_time property.
     */
    public void setLastUsedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUsedTime = value;
    }
    /**
     * Sets the method_id property value. Unique ID for authentication method
     * @param value Value to set for the method_id property.
     */
    public void setMethodId(@jakarta.annotation.Nullable final String value) {
        this.methodId = value;
    }
    /**
     * Sets the name property value. Authentication method name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the public_remote_identity property value. Identity on remote provider, if available. May be email address, but not necessarily.
     * @param value Value to set for the public_remote_identity property.
     */
    public void setPublicRemoteIdentity(@jakarta.annotation.Nullable final String value) {
        this.publicRemoteIdentity = value;
    }
    /**
     * Sets the remote_provider_id property value. Provider ID
     * @param value Value to set for the remote_provider_id property.
     */
    public void setRemoteProviderId(@jakarta.annotation.Nullable final String value) {
        this.remoteProviderId = value;
    }
    /**
     * Sets the state property value. State for authentication method
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final UserAuthenticationMethodsListResponseAuthenticationMethodsState value) {
        this.state = value;
    }
    /**
     * Sets the update_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_email property value. User email address
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
