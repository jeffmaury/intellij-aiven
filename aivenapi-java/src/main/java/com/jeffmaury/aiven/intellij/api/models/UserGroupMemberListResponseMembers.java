package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserGroupMemberListResponseMembers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Last Activity Time
     */
    private String lastActivityTime;
    /**
     * User ID
     */
    private String userId;
    /**
     * OrganizationUserInfo
     */
    private UserGroupMemberListResponseMembersUserInfo userInfo;
    /**
     * Instantiates a new UserGroupMemberListResponseMembers and sets the default values.
     */
    public UserGroupMemberListResponseMembers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserGroupMemberListResponseMembers
     */
    @jakarta.annotation.Nonnull
    public static UserGroupMemberListResponseMembers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserGroupMemberListResponseMembers();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("last_activity_time", (n) -> { this.setLastActivityTime(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("user_info", (n) -> { this.setUserInfo(n.getObjectValue(UserGroupMemberListResponseMembersUserInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the last_activity_time property value. Last Activity Time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActivityTime() {
        return this.lastActivityTime;
    }
    /**
     * Gets the user_id property value. User ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the user_info property value. OrganizationUserInfo
     * @return a UserGroupMemberListResponseMembersUserInfo
     */
    @jakarta.annotation.Nullable
    public UserGroupMemberListResponseMembersUserInfo getUserInfo() {
        return this.userInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("last_activity_time", this.getLastActivityTime());
        writer.writeStringValue("user_id", this.getUserId());
        writer.writeObjectValue("user_info", this.getUserInfo());
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
     * Sets the last_activity_time property value. Last Activity Time
     * @param value Value to set for the last_activity_time property.
     */
    public void setLastActivityTime(@jakarta.annotation.Nullable final String value) {
        this.lastActivityTime = value;
    }
    /**
     * Sets the user_id property value. User ID
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the user_info property value. OrganizationUserInfo
     * @param value Value to set for the user_info property.
     */
    public void setUserInfo(@jakarta.annotation.Nullable final UserGroupMemberListResponseMembersUserInfo value) {
        this.userInfo = value;
    }
}
