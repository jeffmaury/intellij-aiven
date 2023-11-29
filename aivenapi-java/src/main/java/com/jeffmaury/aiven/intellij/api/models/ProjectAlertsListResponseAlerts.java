package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProjectAlertsListResponseAlerts implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Event creation timestamp (ISO 8601) */
    private String createTime;
    /** Name of the alerting event */
    private String event;
    /** Project name */
    private String projectName;
    /** Service name */
    private String serviceName;
    /** Service type code */
    private String serviceType;
    /** Severity of the event */
    private String severity;
    /**
     * Instantiates a new ProjectAlertsListResponseAlerts and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectAlertsListResponseAlerts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectAlertsListResponseAlerts
     */
    @javax.annotation.Nonnull
    public static ProjectAlertsListResponseAlerts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectAlertsListResponseAlerts();
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
     * Gets the create_time property value. Event creation timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the event property value. Name of the alerting event
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEvent() {
        return this.event;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the service_name property value. Service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the service_type property value. Service type code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the severity property value. Severity of the event
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("event", this.getEvent());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeStringValue("service_type", this.getServiceType());
        writer.writeStringValue("severity", this.getSeverity());
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
     * Sets the create_time property value. Event creation timestamp (ISO 8601)
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the event property value. Name of the alerting event
     * @param value Value to set for the event property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvent(@javax.annotation.Nullable final String value) {
        this.event = value;
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
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the serviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceType(@javax.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the severity property value. Severity of the event
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final String value) {
        this.severity = value;
    }
}
