package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectUserListResponseUsers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of user's required authentication methods
     */
    private java.util.List<String> auth;
    /**
     * Set for project's billing contacts
     */
    private Boolean billingContact;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String createTime;
    /**
     * Project member type
     */
    private ProjectUserListResponseUsersMemberType memberType;
    /**
     * User real name
     */
    private String realName;
    /**
     * Team ID
     */
    private String teamId;
    /**
     * Team name
     */
    private String teamName;
    /**
     * User email address
     */
    private String userEmail;
    /**
     * Instantiates a new ProjectUserListResponseUsers and sets the default values.
     */
    public ProjectUserListResponseUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUserListResponseUsers
     */
    @jakarta.annotation.Nonnull
    public static ProjectUserListResponseUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUserListResponseUsers();
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
     * Gets the auth property value. List of user's required authentication methods
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAuth() {
        return this.auth;
    }
    /**
     * Gets the billing_contact property value. Set for project's billing contacts
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBillingContact() {
        return this.billingContact;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("auth", (n) -> { this.setAuth(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("billing_contact", (n) -> { this.setBillingContact(n.getBooleanValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("member_type", (n) -> { this.setMemberType(n.getEnumValue(ProjectUserListResponseUsersMemberType::forValue)); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("team_id", (n) -> { this.setTeamId(n.getStringValue()); });
        deserializerMap.put("team_name", (n) -> { this.setTeamName(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the member_type property value. Project member type
     * @return a ProjectUserListResponseUsersMemberType
     */
    @jakarta.annotation.Nullable
    public ProjectUserListResponseUsersMemberType getMemberType() {
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
     * Gets the team_id property value. Team ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Gets the team_name property value. Team name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamName() {
        return this.teamName;
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
        writer.writeCollectionOfPrimitiveValues("auth", this.getAuth());
        writer.writeBooleanValue("billing_contact", this.getBillingContact());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeEnumValue("member_type", this.getMemberType());
        writer.writeStringValue("real_name", this.getRealName());
        writer.writeStringValue("team_id", this.getTeamId());
        writer.writeStringValue("team_name", this.getTeamName());
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
     * Sets the auth property value. List of user's required authentication methods
     * @param value Value to set for the auth property.
     */
    public void setAuth(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.auth = value;
    }
    /**
     * Sets the billing_contact property value. Set for project's billing contacts
     * @param value Value to set for the billing_contact property.
     */
    public void setBillingContact(@jakarta.annotation.Nullable final Boolean value) {
        this.billingContact = value;
    }
    /**
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the member_type property value. Project member type
     * @param value Value to set for the member_type property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final ProjectUserListResponseUsersMemberType value) {
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
     * Sets the team_id property value. Team ID
     * @param value Value to set for the team_id property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
    /**
     * Sets the team_name property value. Team name
     * @param value Value to set for the team_name property.
     */
    public void setTeamName(@jakarta.annotation.Nullable final String value) {
        this.teamName = value;
    }
    /**
     * Sets the user_email property value. User email address
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
