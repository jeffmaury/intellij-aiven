package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProjectUserListResponseInvitations implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** User email address */
    private String invitedUserEmail;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String inviteTime;
    /** User email address */
    private String invitingUserEmail;
    /** Project member type */
    private ProjectUserListResponseInvitationsMemberType memberType;
    /**
     * Instantiates a new ProjectUserListResponseInvitations and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectUserListResponseInvitations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUserListResponseInvitations
     */
    @javax.annotation.Nonnull
    public static ProjectUserListResponseInvitations createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUserListResponseInvitations();
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
        deserializerMap.put("invited_user_email", (n) -> { this.setInvitedUserEmail(n.getStringValue()); });
        deserializerMap.put("invite_time", (n) -> { this.setInviteTime(n.getStringValue()); });
        deserializerMap.put("inviting_user_email", (n) -> { this.setInvitingUserEmail(n.getStringValue()); });
        deserializerMap.put("member_type", (n) -> { this.setMemberType(n.getEnumValue(ProjectUserListResponseInvitationsMemberType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the invited_user_email property value. User email address
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserEmail() {
        return this.invitedUserEmail;
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
     * Gets the member_type property value. Project member type
     * @return a ProjectUserListResponseInvitationsMemberType
     */
    @javax.annotation.Nullable
    public ProjectUserListResponseInvitationsMemberType getMemberType() {
        return this.memberType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("invited_user_email", this.getInvitedUserEmail());
        writer.writeStringValue("invite_time", this.getInviteTime());
        writer.writeStringValue("inviting_user_email", this.getInvitingUserEmail());
        writer.writeEnumValue("member_type", this.getMemberType());
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
     * Sets the invited_user_email property value. User email address
     * @param value Value to set for the invitedUserEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUserEmail(@javax.annotation.Nullable final String value) {
        this.invitedUserEmail = value;
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
     * Sets the member_type property value. Project member type
     * @param value Value to set for the memberType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberType(@javax.annotation.Nullable final ProjectUserListResponseInvitationsMemberType value) {
        this.memberType = value;
    }
}
