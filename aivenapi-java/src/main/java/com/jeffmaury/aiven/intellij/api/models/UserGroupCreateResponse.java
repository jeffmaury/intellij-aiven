package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserGroupCreateResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserGroupCreateResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * User group creation time
     */
    private String createTime;
    /**
     * Description
     */
    private String description;
    /**
     * User group last update time
     */
    private String updateTime;
    /**
     * User Group ID
     */
    private String userGroupId;
    /**
     * User Group Name
     */
    private String userGroupName;
    /**
     * Instantiates a new UserGroupCreateResponse and sets the default values.
     */
    public UserGroupCreateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserGroupCreateResponse
     */
    @jakarta.annotation.Nonnull
    public static UserGroupCreateResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserGroupCreateResponse();
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
     * Gets the create_time property value. User group creation time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the description property value. Description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_group_id", (n) -> { this.setUserGroupId(n.getStringValue()); });
        deserializerMap.put("user_group_name", (n) -> { this.setUserGroupName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the update_time property value. User group last update time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_group_id property value. User Group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserGroupId() {
        return this.userGroupId;
    }
    /**
     * Gets the user_group_name property value. User Group Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserGroupName() {
        return this.userGroupName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeStringValue("user_group_id", this.getUserGroupId());
        writer.writeStringValue("user_group_name", this.getUserGroupName());
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
     * Sets the create_time property value. User group creation time
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the description property value. Description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the update_time property value. User group last update time
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_group_id property value. User Group ID
     * @param value Value to set for the user_group_id property.
     */
    public void setUserGroupId(@jakarta.annotation.Nullable final String value) {
        this.userGroupId = value;
    }
    /**
     * Sets the user_group_name property value. User Group Name
     * @param value Value to set for the user_group_name property.
     */
    public void setUserGroupName(@jakarta.annotation.Nullable final String value) {
        this.userGroupName = value;
    }
}
