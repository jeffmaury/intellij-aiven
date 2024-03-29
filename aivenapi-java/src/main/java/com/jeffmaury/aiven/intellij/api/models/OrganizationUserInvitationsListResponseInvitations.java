package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserInvitationsListResponseInvitations implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Time of creating the invitation
     */
    private String createTime;
    /**
     * By when the invitation is valid
     */
    private String expiryTime;
    /**
     * Name of the invitation creator
     */
    private String invitedBy;
    /**
     * User Email
     */
    private String userEmail;
    /**
     * Instantiates a new OrganizationUserInvitationsListResponseInvitations and sets the default values.
     */
    public OrganizationUserInvitationsListResponseInvitations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserInvitationsListResponseInvitations
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserInvitationsListResponseInvitations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserInvitationsListResponseInvitations();
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
     * Gets the create_time property value. Time of creating the invitation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the expiry_time property value. By when the invitation is valid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("expiry_time", (n) -> { this.setExpiryTime(n.getStringValue()); });
        deserializerMap.put("invited_by", (n) -> { this.setInvitedBy(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invited_by property value. Name of the invitation creator
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInvitedBy() {
        return this.invitedBy;
    }
    /**
     * Gets the user_email property value. User Email
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
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("expiry_time", this.getExpiryTime());
        writer.writeStringValue("invited_by", this.getInvitedBy());
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
     * Sets the create_time property value. Time of creating the invitation
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the expiry_time property value. By when the invitation is valid
     * @param value Value to set for the expiry_time property.
     */
    public void setExpiryTime(@jakarta.annotation.Nullable final String value) {
        this.expiryTime = value;
    }
    /**
     * Sets the invited_by property value. Name of the invitation creator
     * @param value Value to set for the invited_by property.
     */
    public void setInvitedBy(@jakarta.annotation.Nullable final String value) {
        this.invitedBy = value;
    }
    /**
     * Sets the user_email property value. User Email
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
