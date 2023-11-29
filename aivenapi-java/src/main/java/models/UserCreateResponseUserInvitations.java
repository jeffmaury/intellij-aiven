package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserCreateResponseUserInvitations implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Code for accepting the invitation */
    private String inviteCode;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String inviteTime;
    /** User email address */
    private String invitingUserEmail;
    /** Project name */
    private String projectName;
    /**
     * Instantiates a new UserCreateResponseUserInvitations and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserCreateResponseUserInvitations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCreateResponseUserInvitations
     */
    @javax.annotation.Nonnull
    public static UserCreateResponseUserInvitations createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCreateResponseUserInvitations();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("invite_code", (n) -> { this.setInviteCode(n.getStringValue()); });
        deserializerMap.put("invite_time", (n) -> { this.setInviteTime(n.getStringValue()); });
        deserializerMap.put("inviting_user_email", (n) -> { this.setInvitingUserEmail(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invite_code property value. Code for accepting the invitation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteCode() {
        return this.inviteCode;
    }
    /**
     * Gets the invite_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteTime() {
        return this.inviteTime;
    }
    /**
     * Gets the inviting_user_email property value. User email address
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitingUserEmail() {
        return this.invitingUserEmail;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("invite_code", this.getInviteCode());
        writer.writeStringValue("invite_time", this.getInviteTime());
        writer.writeStringValue("inviting_user_email", this.getInvitingUserEmail());
        writer.writeStringValue("project_name", this.getProjectName());
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
     * Sets the invite_code property value. Code for accepting the invitation
     * @param value Value to set for the inviteCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInviteCode(@javax.annotation.Nullable final String value) {
        this.inviteCode = value;
    }
    /**
     * Sets the invite_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the inviteTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInviteTime(@javax.annotation.Nullable final String value) {
        this.inviteTime = value;
    }
    /**
     * Sets the inviting_user_email property value. User email address
     * @param value Value to set for the invitingUserEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitingUserEmail(@javax.annotation.Nullable final String value) {
        this.invitingUserEmail = value;
    }
    /**
     * Sets the project_name property value. Project name
     * @param value Value to set for the projectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectName(@javax.annotation.Nullable final String value) {
        this.projectName = value;
    }
}
