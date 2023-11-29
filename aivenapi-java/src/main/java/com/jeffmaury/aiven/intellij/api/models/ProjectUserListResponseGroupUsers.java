package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectUserListResponseGroupUsers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Project member type
     */
    private ProjectUserListResponseGroupUsersMemberType memberType;
    /**
     * User real name
     */
    private String realName;
    /**
     * User email address
     */
    private String userEmail;
    /**
     * User group ID
     */
    private String userGroupId;
    /**
     * Instantiates a new ProjectUserListResponseGroupUsers and sets the default values.
     */
    public ProjectUserListResponseGroupUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUserListResponseGroupUsers
     */
    @jakarta.annotation.Nonnull
    public static ProjectUserListResponseGroupUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUserListResponseGroupUsers();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("member_type", (n) -> { this.setMemberType(n.getEnumValue(ProjectUserListResponseGroupUsersMemberType.class)); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("user_group_id", (n) -> { this.setUserGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the member_type property value. Project member type
     * @return a ProjectUserListResponseGroupUsersMemberType
     */
    @jakarta.annotation.Nullable
    public ProjectUserListResponseGroupUsersMemberType getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the real_name property value. User real name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealName() {
        return this.realName;
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
     * Gets the user_group_id property value. User group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserGroupId() {
        return this.userGroupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("member_type", this.getMemberType());
        writer.writeStringValue("real_name", this.getRealName());
        writer.writeStringValue("user_email", this.getUserEmail());
        writer.writeStringValue("user_group_id", this.getUserGroupId());
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
     * Sets the member_type property value. Project member type
     * @param value Value to set for the member_type property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final ProjectUserListResponseGroupUsersMemberType value) {
        this.memberType = value;
    }
    /**
     * Sets the real_name property value. User real name
     * @param value Value to set for the real_name property.
     */
    public void setRealName(@jakarta.annotation.Nullable final String value) {
        this.realName = value;
    }
    /**
     * Sets the user_email property value. User email address
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the user_group_id property value. User group ID
     * @param value Value to set for the user_group_id property.
     */
    public void setUserGroupId(@jakarta.annotation.Nullable final String value) {
        this.userGroupId = value;
    }
}
