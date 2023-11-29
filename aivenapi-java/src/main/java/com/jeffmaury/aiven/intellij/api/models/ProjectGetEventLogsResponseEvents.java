package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectGetEventLogsResponseEvents implements AdditionalDataHolder, Parsable {
    /**
     * Initiator of the event
     */
    private String actor;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Event description
     */
    private String eventDesc;
    /**
     * Event type identifier
     */
    private String eventType;
    /**
     * Event identifier (unique across all projects)
     */
    private String id;
    /**
     * Service name
     */
    private String serviceName;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String time;
    /**
     * Instantiates a new ProjectGetEventLogsResponseEvents and sets the default values.
     */
    public ProjectGetEventLogsResponseEvents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetEventLogsResponseEvents
     */
    @jakarta.annotation.Nonnull
    public static ProjectGetEventLogsResponseEvents createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetEventLogsResponseEvents();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("actor", (n) -> { this.setActor(n.getStringValue()); });
        deserializerMap.put("event_desc", (n) -> { this.setEventDesc(n.getStringValue()); });
        deserializerMap.put("event_type", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Event identifier (unique across all projects)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actor", this.getActor());
        writer.writeStringValue("event_desc", this.getEventDesc());
        writer.writeStringValue("event_type", this.getEventType());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeStringValue("time", this.getTime());
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
     * Sets the id property value. Event identifier (unique across all projects)
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the service_name property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final String value) {
        this.time = value;
    }
}
