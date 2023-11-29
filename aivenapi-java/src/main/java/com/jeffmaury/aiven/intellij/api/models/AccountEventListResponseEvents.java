package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccountEventListResponseEvents implements AdditionalDataHolder, Parsable {
    /** Account ID */
    private String accountId;
    /** Event description */
    private String actionDescription;
    /** Event type */
    private String actionType;
    /** Actor details */
    private String actor;
    /** User ID */
    private String actorUserId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String createTime;
    /** Entry ID */
    private Integer logEntryId;
    /** Team ID */
    private String teamId;
    /**
     * Instantiates a new AccountEventListResponseEvents and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountEventListResponseEvents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountEventListResponseEvents
     */
    @javax.annotation.Nonnull
    public static AccountEventListResponseEvents createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountEventListResponseEvents();
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the action_description property value. Event description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionDescription() {
        return this.actionDescription;
    }
    /**
     * Gets the action_type property value. Event type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionType() {
        return this.actionType;
    }
    /**
     * Gets the actor property value. Actor details
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActor() {
        return this.actor;
    }
    /**
     * Gets the actor_user_id property value. User ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActorUserId() {
        return this.actorUserId;
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
     * Gets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("action_description", (n) -> { this.setActionDescription(n.getStringValue()); });
        deserializerMap.put("action_type", (n) -> { this.setActionType(n.getStringValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getStringValue()); });
        deserializerMap.put("actor_user_id", (n) -> { this.setActorUserId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("log_entry_id", (n) -> { this.setLogEntryId(n.getIntegerValue()); });
        deserializerMap.put("team_id", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the log_entry_id property value. Entry ID
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLogEntryId() {
        return this.logEntryId;
    }
    /**
     * Gets the team_id property value. Team ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("action_description", this.getActionDescription());
        writer.writeStringValue("action_type", this.getActionType());
        writer.writeStringValue("actor", this.getActor());
        writer.writeStringValue("actor_user_id", this.getActorUserId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeIntegerValue("log_entry_id", this.getLogEntryId());
        writer.writeStringValue("team_id", this.getTeamId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the action_description property value. Event description
     * @param value Value to set for the actionDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionDescription(@javax.annotation.Nullable final String value) {
        this.actionDescription = value;
    }
    /**
     * Sets the action_type property value. Event type
     * @param value Value to set for the actionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionType(@javax.annotation.Nullable final String value) {
        this.actionType = value;
    }
    /**
     * Sets the actor property value. Actor details
     * @param value Value to set for the actor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActor(@javax.annotation.Nullable final String value) {
        this.actor = value;
    }
    /**
     * Sets the actor_user_id property value. User ID
     * @param value Value to set for the actorUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActorUserId(@javax.annotation.Nullable final String value) {
        this.actorUserId = value;
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
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the log_entry_id property value. Entry ID
     * @param value Value to set for the logEntryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogEntryId(@javax.annotation.Nullable final Integer value) {
        this.logEntryId = value;
    }
    /**
     * Sets the team_id property value. Team ID
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
