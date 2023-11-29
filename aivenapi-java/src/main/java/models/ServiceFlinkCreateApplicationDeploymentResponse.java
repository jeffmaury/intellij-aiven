package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkCreateApplicationDeploymentResponse
 */
public class ServiceFlinkCreateApplicationDeploymentResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Created at */
    private String createdAt;
    /** Created by */
    private String createdBy;
    /** List of errors occurred during request processing */
    private java.util.List<ServiceFlinkCreateApplicationDeploymentResponseErrors> errors;
    /** Deployment ID */
    private String id;
    /** Job ID */
    private String jobId;
    /** Job savepoint */
    private String lastSavepoint;
    /** Printable result of the request */
    private String message;
    /** Flink Job parallelism */
    private Integer parallelism;
    /** Specifies whether a Flink Job is restarted in case it fails */
    private Boolean restartEnabled;
    /** Job savepoint */
    private String startingSavepoint;
    /** Deployment status */
    private ServiceFlinkCreateApplicationDeploymentResponseStatus status;
    /** ApplicationVersion ID */
    private String versionId;
    /**
     * Instantiates a new ServiceFlinkCreateApplicationDeploymentResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkCreateApplicationDeploymentResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkCreateApplicationDeploymentResponse
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkCreateApplicationDeploymentResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkCreateApplicationDeploymentResponse();
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
     * Gets the created_at property value. Created at
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the created_by property value. Created by
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServiceFlinkCreateApplicationDeploymentResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceFlinkCreateApplicationDeploymentResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("created_by", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceFlinkCreateApplicationDeploymentResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("job_id", (n) -> { this.setJobId(n.getStringValue()); });
        deserializerMap.put("last_savepoint", (n) -> { this.setLastSavepoint(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("parallelism", (n) -> { this.setParallelism(n.getIntegerValue()); });
        deserializerMap.put("restart_enabled", (n) -> { this.setRestartEnabled(n.getBooleanValue()); });
        deserializerMap.put("starting_savepoint", (n) -> { this.setStartingSavepoint(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceFlinkCreateApplicationDeploymentResponseStatus.class)); });
        deserializerMap.put("version_id", (n) -> { this.setVersionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Deployment ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the job_id property value. Job ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobId() {
        return this.jobId;
    }
    /**
     * Gets the last_savepoint property value. Job savepoint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastSavepoint() {
        return this.lastSavepoint;
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
     * Gets the parallelism property value. Flink Job parallelism
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getParallelism() {
        return this.parallelism;
    }
    /**
     * Gets the restart_enabled property value. Specifies whether a Flink Job is restarted in case it fails
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestartEnabled() {
        return this.restartEnabled;
    }
    /**
     * Gets the starting_savepoint property value. Job savepoint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStartingSavepoint() {
        return this.startingSavepoint;
    }
    /**
     * Gets the status property value. Deployment status
     * @return a ServiceFlinkCreateApplicationDeploymentResponseStatus
     */
    @javax.annotation.Nullable
    public ServiceFlinkCreateApplicationDeploymentResponseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the version_id property value. ApplicationVersion ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionId() {
        return this.versionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("created_by", this.getCreatedBy());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("job_id", this.getJobId());
        writer.writeStringValue("last_savepoint", this.getLastSavepoint());
        writer.writeStringValue("message", this.getMessage());
        writer.writeIntegerValue("parallelism", this.getParallelism());
        writer.writeBooleanValue("restart_enabled", this.getRestartEnabled());
        writer.writeStringValue("starting_savepoint", this.getStartingSavepoint());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version_id", this.getVersionId());
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
     * Sets the created_at property value. Created at
     * @param value Value to set for the createdAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedAt(@javax.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the created_by property value. Created by
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServiceFlinkCreateApplicationDeploymentResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the id property value. Deployment ID
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the job_id property value. Job ID
     * @param value Value to set for the jobId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobId(@javax.annotation.Nullable final String value) {
        this.jobId = value;
    }
    /**
     * Sets the last_savepoint property value. Job savepoint
     * @param value Value to set for the lastSavepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSavepoint(@javax.annotation.Nullable final String value) {
        this.lastSavepoint = value;
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
     * Sets the parallelism property value. Flink Job parallelism
     * @param value Value to set for the parallelism property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParallelism(@javax.annotation.Nullable final Integer value) {
        this.parallelism = value;
    }
    /**
     * Sets the restart_enabled property value. Specifies whether a Flink Job is restarted in case it fails
     * @param value Value to set for the restartEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartEnabled(@javax.annotation.Nullable final Boolean value) {
        this.restartEnabled = value;
    }
    /**
     * Sets the starting_savepoint property value. Job savepoint
     * @param value Value to set for the startingSavepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartingSavepoint(@javax.annotation.Nullable final String value) {
        this.startingSavepoint = value;
    }
    /**
     * Sets the status property value. Deployment status
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ServiceFlinkCreateApplicationDeploymentResponseStatus value) {
        this.status = value;
    }
    /**
     * Sets the version_id property value. ApplicationVersion ID
     * @param value Value to set for the versionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionId(@javax.annotation.Nullable final String value) {
        this.versionId = value;
    }
}
