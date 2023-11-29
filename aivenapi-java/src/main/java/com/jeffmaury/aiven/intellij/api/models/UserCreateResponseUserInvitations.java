package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCreateResponseUserInvitations implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Code for accepting the invitation
     */
    private String inviteCode;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String inviteTime;
    /**
     * User email address
     */
    private String invitingUserEmail;
    /**
     * Project name
     */
    private String projectName;
    /**
     * Instantiates a new UserCreateResponseUserInvitations and sets the default values.
     */
    public UserCreateResponseUserInvitations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCreateResponseUserInvitations
     */
    @jakarta.annotation.Nonnull
    public static UserCreateResponseUserInvitations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCreateResponseUserInvitations();
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
        deserializerMap.put("invite_code", (n) -> { this.setInviteCode(n.getStringValue()); });
        deserializerMap.put("invite_time", (n) -> { this.setInviteTime(n.getStringValue()); });
        deserializerMap.put("inviting_user_email", (n) -> { this.setInvitingUserEmail(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invite_code property value. Code for accepting the invitation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInviteCode() {
        return this.inviteCode;
    }
    /**
     * Gets the invite_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInviteTime() {
        return this.inviteTime;
    }
    /**
     * Gets the inviting_user_email property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInvitingUserEmail() {
        return this.invitingUserEmail;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("invite_code", this.getInviteCode());
        writer.writeStringValue("invite_time", this.getInviteTime());
        writer.writeStringValue("inviting_user_email", this.getInvitingUserEmail());
        writer.writeStringValue("project_name", this.getProjectName());
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
     * Sets the invite_code property value. Code for accepting the invitation
     * @param value Value to set for the invite_code property.
     */
    public void setInviteCode(@jakarta.annotation.Nullable final String value) {
        this.inviteCode = value;
    }
    /**
     * Sets the invite_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the invite_time property.
     */
    public void setInviteTime(@jakarta.annotation.Nullable final String value) {
        this.inviteTime = value;
    }
    /**
     * Sets the inviting_user_email property value. User email address
     * @param value Value to set for the inviting_user_email property.
     */
    public void setInvitingUserEmail(@jakarta.annotation.Nullable final String value) {
        this.invitingUserEmail = value;
    }
    /**
     * Sets the project_name property value. Project name
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
}
