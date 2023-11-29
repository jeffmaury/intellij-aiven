package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationUserListResponseUsers implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Super admin state of the organization user */
    private Boolean isSuperAdmin;
    /** Join time */
    private String joinTime;
    /** Last activity time */
    private String lastActivityTime;
    /** User ID */
    private String userId;
    /** OrganizationUserInfo */
    private OrganizationUserListResponseUsersUserInfo userInfo;
    /**
     * Instantiates a new OrganizationUserListResponseUsers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationUserListResponseUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserListResponseUsers
     */
    @javax.annotation.Nonnull
    public static OrganizationUserListResponseUsers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserListResponseUsers();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("is_super_admin", (n) -> { this.setIsSuperAdmin(n.getBooleanValue()); });
        deserializerMap.put("join_time", (n) -> { this.setJoinTime(n.getStringValue()); });
        deserializerMap.put("last_activity_time", (n) -> { this.setLastActivityTime(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("user_info", (n) -> { this.setUserInfo(n.getObjectValue(OrganizationUserListResponseUsersUserInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the is_super_admin property value. Super admin state of the organization user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSuperAdmin() {
        return this.isSuperAdmin;
    }
    /**
     * Gets the join_time property value. Join time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinTime() {
        return this.joinTime;
    }
    /**
     * Gets the last_activity_time property value. Last activity time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActivityTime() {
        return this.lastActivityTime;
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
     * Gets the user_info property value. OrganizationUserInfo
     * @return a OrganizationUserListResponseUsersUserInfo
     */
    @javax.annotation.Nullable
    public OrganizationUserListResponseUsersUserInfo getUserInfo() {
        return this.userInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("is_super_admin", this.getIsSuperAdmin());
        writer.writeStringValue("join_time", this.getJoinTime());
        writer.writeStringValue("last_activity_time", this.getLastActivityTime());
        writer.writeStringValue("user_id", this.getUserId());
        writer.writeObjectValue("user_info", this.getUserInfo());
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
     * Sets the is_super_admin property value. Super admin state of the organization user
     * @param value Value to set for the isSuperAdmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSuperAdmin(@javax.annotation.Nullable final Boolean value) {
        this.isSuperAdmin = value;
    }
    /**
     * Sets the join_time property value. Join time
     * @param value Value to set for the joinTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinTime(@javax.annotation.Nullable final String value) {
        this.joinTime = value;
    }
    /**
     * Sets the last_activity_time property value. Last activity time
     * @param value Value to set for the lastActivityTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActivityTime(@javax.annotation.Nullable final String value) {
        this.lastActivityTime = value;
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
    /**
     * Sets the user_info property value. OrganizationUserInfo
     * @param value Value to set for the userInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserInfo(@javax.annotation.Nullable final OrganizationUserListResponseUsersUserInfo value) {
        this.userInfo = value;
    }
}
