package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupEventListResponseEvents implements AdditionalDataHolder, Parsable {
    /**
     * Initiator of the event
     */
    private String actor;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Billing group ID
     */
    private String billingGroupId;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String createTime;
    /**
     * Event description
     */
    private String eventDesc;
    /**
     * Event type identifier
     */
    private String eventType;
    /**
     * Entry ID
     */
    private Integer logEntryId;
    /**
     * Identifier of a project
     */
    private String projectId;
    /**
     * Project name
     */
    private String projectName;
    /**
     * Instantiates a new BillingGroupEventListResponseEvents and sets the default values.
     */
    public BillingGroupEventListResponseEvents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupEventListResponseEvents
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupEventListResponseEvents createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupEventListResponseEvents();
    }
    /**
     * Gets the actor property value. Initiator of the event
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActor() {
        return this.actor;
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
     * Gets the billing_group_id property value. Billing group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBillingGroupId() {
        return this.billingGroupId;
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
     * Gets the event_desc property value. Event description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEventDesc() {
        return this.eventDesc;
    }
    /**
     * Gets the event_type property value. Event type identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actor", (n) -> { this.setActor(n.getStringValue()); });
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("event_desc", (n) -> { this.setEventDesc(n.getStringValue()); });
        deserializerMap.put("event_type", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("log_entry_id", (n) -> { this.setLogEntryId(n.getIntegerValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the log_entry_id property value. Entry ID
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogEntryId() {
        return this.logEntryId;
    }
    /**
     * Gets the project_id property value. Identifier of a project
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
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
        writer.writeStringValue("actor", this.getActor());
        writer.writeStringValue("billing_group_id", this.getBillingGroupId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("event_desc", this.getEventDesc());
        writer.writeStringValue("event_type", this.getEventType());
        writer.writeIntegerValue("log_entry_id", this.getLogEntryId());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actor property value. Initiator of the event
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final String value) {
        this.actor = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the billing_group_id property value. Billing group ID
     * @param value Value to set for the billing_group_id property.
     */
    public void setBillingGroupId(@jakarta.annotation.Nullable final String value) {
        this.billingGroupId = value;
    }
    /**
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the event_desc property value. Event description
     * @param value Value to set for the event_desc property.
     */
    public void setEventDesc(@jakarta.annotation.Nullable final String value) {
        this.eventDesc = value;
    }
    /**
     * Sets the event_type property value. Event type identifier
     * @param value Value to set for the event_type property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the log_entry_id property value. Entry ID
     * @param value Value to set for the log_entry_id property.
     */
    public void setLogEntryId(@jakarta.annotation.Nullable final Integer value) {
        this.logEntryId = value;
    }
    /**
     * Sets the project_id property value. Identifier of a project
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the project_name property value. Project name
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
}
