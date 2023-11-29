package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkOverviewResponse
 */
public class ServiceFlinkOverviewResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<ServiceFlinkOverviewResponseErrors> errors;
    /** Commit of Flink version */
    private String flinkCommit;
    /** Flink version */
    private String flinkVersion;
    /** Number of cancelled jobs */
    private Integer jobsCancelled;
    /** Number of failed jobs */
    private Integer jobsFailed;
    /** Number of finished jobs */
    private Integer jobsFinished;
    /** Number of running jobs */
    private Integer jobsRunning;
    /** Printable result of the request */
    private String message;
    /** Number of slots available */
    private Integer slotsAvailable;
    /** Number of slots */
    private Integer slotsTotal;
    /** Number of TaskManagers */
    private Integer taskmanagers;
    /**
     * Instantiates a new ServiceFlinkOverviewResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkOverviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkOverviewResponse
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkOverviewResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkOverviewResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServiceFlinkOverviewResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkOverviewResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceFlinkOverviewResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("flink-commit", (n) -> { this.setFlinkCommit(n.getStringValue()); });
        deserializerMap.put("flink-version", (n) -> { this.setFlinkVersion(n.getStringValue()); });
        deserializerMap.put("jobs-cancelled", (n) -> { this.setJobsCancelled(n.getIntegerValue()); });
        deserializerMap.put("jobs-failed", (n) -> { this.setJobsFailed(n.getIntegerValue()); });
        deserializerMap.put("jobs-finished", (n) -> { this.setJobsFinished(n.getIntegerValue()); });
        deserializerMap.put("jobs-running", (n) -> { this.setJobsRunning(n.getIntegerValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("slots-available", (n) -> { this.setSlotsAvailable(n.getIntegerValue()); });
        deserializerMap.put("slots-total", (n) -> { this.setSlotsTotal(n.getIntegerValue()); });
        deserializerMap.put("taskmanagers", (n) -> { this.setTaskmanagers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flink-commit property value. Commit of Flink version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFlinkCommit() {
        return this.flinkCommit;
    }
    /**
     * Gets the flink-version property value. Flink version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFlinkVersion() {
        return this.flinkVersion;
    }
    /**
     * Gets the jobs-cancelled property value. Number of cancelled jobs
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getJobsCancelled() {
        return this.jobsCancelled;
    }
    /**
     * Gets the jobs-failed property value. Number of failed jobs
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getJobsFailed() {
        return this.jobsFailed;
    }
    /**
     * Gets the jobs-finished property value. Number of finished jobs
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getJobsFinished() {
        return this.jobsFinished;
    }
    /**
     * Gets the jobs-running property value. Number of running jobs
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getJobsRunning() {
        return this.jobsRunning;
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
     * Gets the slots-available property value. Number of slots available
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSlotsAvailable() {
        return this.slotsAvailable;
    }
    /**
     * Gets the slots-total property value. Number of slots
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSlotsTotal() {
        return this.slotsTotal;
    }
    /**
     * Gets the taskmanagers property value. Number of TaskManagers
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTaskmanagers() {
        return this.taskmanagers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("flink-commit", this.getFlinkCommit());
        writer.writeStringValue("flink-version", this.getFlinkVersion());
        writer.writeIntegerValue("jobs-cancelled", this.getJobsCancelled());
        writer.writeIntegerValue("jobs-failed", this.getJobsFailed());
        writer.writeIntegerValue("jobs-finished", this.getJobsFinished());
        writer.writeIntegerValue("jobs-running", this.getJobsRunning());
        writer.writeStringValue("message", this.getMessage());
        writer.writeIntegerValue("slots-available", this.getSlotsAvailable());
        writer.writeIntegerValue("slots-total", this.getSlotsTotal());
        writer.writeIntegerValue("taskmanagers", this.getTaskmanagers());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServiceFlinkOverviewResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the flink-commit property value. Commit of Flink version
     * @param value Value to set for the flinkCommit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlinkCommit(@javax.annotation.Nullable final String value) {
        this.flinkCommit = value;
    }
    /**
     * Sets the flink-version property value. Flink version
     * @param value Value to set for the flinkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlinkVersion(@javax.annotation.Nullable final String value) {
        this.flinkVersion = value;
    }
    /**
     * Sets the jobs-cancelled property value. Number of cancelled jobs
     * @param value Value to set for the jobsCancelled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobsCancelled(@javax.annotation.Nullable final Integer value) {
        this.jobsCancelled = value;
    }
    /**
     * Sets the jobs-failed property value. Number of failed jobs
     * @param value Value to set for the jobsFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobsFailed(@javax.annotation.Nullable final Integer value) {
        this.jobsFailed = value;
    }
    /**
     * Sets the jobs-finished property value. Number of finished jobs
     * @param value Value to set for the jobsFinished property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobsFinished(@javax.annotation.Nullable final Integer value) {
        this.jobsFinished = value;
    }
    /**
     * Sets the jobs-running property value. Number of running jobs
     * @param value Value to set for the jobsRunning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobsRunning(@javax.annotation.Nullable final Integer value) {
        this.jobsRunning = value;
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
     * Sets the slots-available property value. Number of slots available
     * @param value Value to set for the slotsAvailable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSlotsAvailable(@javax.annotation.Nullable final Integer value) {
        this.slotsAvailable = value;
    }
    /**
     * Sets the slots-total property value. Number of slots
     * @param value Value to set for the slotsTotal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSlotsTotal(@javax.annotation.Nullable final Integer value) {
        this.slotsTotal = value;
    }
    /**
     * Sets the taskmanagers property value. Number of TaskManagers
     * @param value Value to set for the taskmanagers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskmanagers(@javax.annotation.Nullable final Integer value) {
        this.taskmanagers = value;
    }
}
