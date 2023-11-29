package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkJobDetailsResponse
 */
public class ServiceFlinkJobDetailsResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Duration of the job */
    private Integer duration;
    /** End time of the job */
    private Integer endTime;
    /** List of errors occurred during request processing */
    private java.util.List<ServiceFlinkJobDetailsResponseErrors> errors;
    /** Whether the job is stoppable */
    private Boolean isStoppable;
    /** Job ID */
    private String jid;
    /** Max parallelism */
    private Integer maxParallelism;
    /** Printable result of the request */
    private String message;
    /** Job name */
    private String name;
    /** Epoch time */
    private Integer now;
    /** Plan */
    private ServiceFlinkJobDetailsResponsePlan plan;
    /** Start time epoch */
    private Integer startTime;
    /** Job state */
    private ServiceFlinkJobDetailsResponseState state;
    /** Status counts */
    private ServiceFlinkJobDetailsResponseStatusCounts statusCounts;
    /** Timestamps */
    private ServiceFlinkJobDetailsResponseTimestamps timestamps;
    /** Vertices */
    private java.util.List<ServiceFlinkJobDetailsResponseVertices> vertices;
    /**
     * Instantiates a new ServiceFlinkJobDetailsResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkJobDetailsResponse
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkJobDetailsResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkJobDetailsResponse();
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
     * Gets the duration property value. Duration of the job
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDuration() {
        return this.duration;
    }
    /**
     * Gets the end-time property value. End time of the job
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndTime() {
        return this.endTime;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServiceFlinkJobDetailsResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkJobDetailsResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("end-time", (n) -> { this.setEndTime(n.getIntegerValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceFlinkJobDetailsResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("isStoppable", (n) -> { this.setIsStoppable(n.getBooleanValue()); });
        deserializerMap.put("jid", (n) -> { this.setJid(n.getStringValue()); });
        deserializerMap.put("maxParallelism", (n) -> { this.setMaxParallelism(n.getIntegerValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("now", (n) -> { this.setNow(n.getIntegerValue()); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getObjectValue(ServiceFlinkJobDetailsResponsePlan::createFromDiscriminatorValue)); });
        deserializerMap.put("start-time", (n) -> { this.setStartTime(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceFlinkJobDetailsResponseState.class)); });
        deserializerMap.put("status-counts", (n) -> { this.setStatusCounts(n.getObjectValue(ServiceFlinkJobDetailsResponseStatusCounts::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamps", (n) -> { this.setTimestamps(n.getObjectValue(ServiceFlinkJobDetailsResponseTimestamps::createFromDiscriminatorValue)); });
        deserializerMap.put("vertices", (n) -> { this.setVertices(n.getCollectionOfObjectValues(ServiceFlinkJobDetailsResponseVertices::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isStoppable property value. Whether the job is stoppable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsStoppable() {
        return this.isStoppable;
    }
    /**
     * Gets the jid property value. Job ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJid() {
        return this.jid;
    }
    /**
     * Gets the maxParallelism property value. Max parallelism
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxParallelism() {
        return this.maxParallelism;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the name property value. Job name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the now property value. Epoch time
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNow() {
        return this.now;
    }
    /**
     * Gets the plan property value. Plan
     * @return a ServiceFlinkJobDetailsResponsePlan
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponsePlan getPlan() {
        return this.plan;
    }
    /**
     * Gets the start-time property value. Start time epoch
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStartTime() {
        return this.startTime;
    }
    /**
     * Gets the state property value. Job state
     * @return a ServiceFlinkJobDetailsResponseState
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponseState getState() {
        return this.state;
    }
    /**
     * Gets the status-counts property value. Status counts
     * @return a ServiceFlinkJobDetailsResponseStatusCounts
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponseStatusCounts getStatusCounts() {
        return this.statusCounts;
    }
    /**
     * Gets the timestamps property value. Timestamps
     * @return a ServiceFlinkJobDetailsResponseTimestamps
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponseTimestamps getTimestamps() {
        return this.timestamps;
    }
    /**
     * Gets the vertices property value. Vertices
     * @return a ServiceFlinkJobDetailsResponseVertices
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkJobDetailsResponseVertices> getVertices() {
        return this.vertices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeIntegerValue("end-time", this.getEndTime());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeBooleanValue("isStoppable", this.getIsStoppable());
        writer.writeStringValue("jid", this.getJid());
        writer.writeIntegerValue("maxParallelism", this.getMaxParallelism());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("now", this.getNow());
        writer.writeObjectValue("plan", this.getPlan());
        writer.writeIntegerValue("start-time", this.getStartTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("status-counts", this.getStatusCounts());
        writer.writeObjectValue("timestamps", this.getTimestamps());
        writer.writeCollectionOfObjectValues("vertices", this.getVertices());
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
     * Sets the duration property value. Duration of the job
     * @param value Value to set for the duration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuration(@javax.annotation.Nullable final Integer value) {
        this.duration = value;
    }
    /**
     * Sets the end-time property value. End time of the job
     * @param value Value to set for the endTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndTime(@javax.annotation.Nullable final Integer value) {
        this.endTime = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServiceFlinkJobDetailsResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the isStoppable property value. Whether the job is stoppable
     * @param value Value to set for the isStoppable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsStoppable(@javax.annotation.Nullable final Boolean value) {
        this.isStoppable = value;
    }
    /**
     * Sets the jid property value. Job ID
     * @param value Value to set for the jid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJid(@javax.annotation.Nullable final String value) {
        this.jid = value;
    }
    /**
     * Sets the maxParallelism property value. Max parallelism
     * @param value Value to set for the maxParallelism property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxParallelism(@javax.annotation.Nullable final Integer value) {
        this.maxParallelism = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the name property value. Job name
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the now property value. Epoch time
     * @param value Value to set for the now property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNow(@javax.annotation.Nullable final Integer value) {
        this.now = value;
    }
    /**
     * Sets the plan property value. Plan
     * @param value Value to set for the plan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlan(@javax.annotation.Nullable final ServiceFlinkJobDetailsResponsePlan value) {
        this.plan = value;
    }
    /**
     * Sets the start-time property value. Start time epoch
     * @param value Value to set for the startTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartTime(@javax.annotation.Nullable final Integer value) {
        this.startTime = value;
    }
    /**
     * Sets the state property value. Job state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServiceFlinkJobDetailsResponseState value) {
        this.state = value;
    }
    /**
     * Sets the status-counts property value. Status counts
     * @param value Value to set for the statusCounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusCounts(@javax.annotation.Nullable final ServiceFlinkJobDetailsResponseStatusCounts value) {
        this.statusCounts = value;
    }
    /**
     * Sets the timestamps property value. Timestamps
     * @param value Value to set for the timestamps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimestamps(@javax.annotation.Nullable final ServiceFlinkJobDetailsResponseTimestamps value) {
        this.timestamps = value;
    }
    /**
     * Sets the vertices property value. Vertices
     * @param value Value to set for the vertices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVertices(@javax.annotation.Nullable final java.util.List<ServiceFlinkJobDetailsResponseVertices> value) {
        this.vertices = value;
    }
}
