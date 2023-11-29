package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Task info
 */
public class ServiceTaskCreateResponseTask implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String createTime;
    /** Task result */
    private String result;
    /** List of result codes */
    private java.util.List<ServiceTaskCreateResponseTaskResultCodes> resultCodes;
    /** Task success */
    private Boolean success;
    /** Unique identifier for the task */
    private String taskId;
    /** Task type */
    private String taskType;
    /**
     * Instantiates a new ServiceTaskCreateResponseTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceTaskCreateResponseTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceTaskCreateResponseTask
     */
    @javax.annotation.Nonnull
    public static ServiceTaskCreateResponseTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceTaskCreateResponseTask();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getStringValue()); });
        deserializerMap.put("result_codes", (n) -> { this.setResultCodes(n.getCollectionOfObjectValues(ServiceTaskCreateResponseTaskResultCodes::createFromDiscriminatorValue)); });
        deserializerMap.put("success", (n) -> { this.setSuccess(n.getBooleanValue()); });
        deserializerMap.put("task_id", (n) -> { this.setTaskId(n.getStringValue()); });
        deserializerMap.put("task_type", (n) -> { this.setTaskType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the result property value. Task result
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResult() {
        return this.result;
    }
    /**
     * Gets the result_codes property value. List of result codes
     * @return a ServiceTaskCreateResponseTaskResultCodes
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceTaskCreateResponseTaskResultCodes> getResultCodes() {
        return this.resultCodes;
    }
    /**
     * Gets the success property value. Task success
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSuccess() {
        return this.success;
    }
    /**
     * Gets the task_id property value. Unique identifier for the task
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaskId() {
        return this.taskId;
    }
    /**
     * Gets the task_type property value. Task type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaskType() {
        return this.taskType;
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
        writer.writeStringValue("result", this.getResult());
        writer.writeCollectionOfObjectValues("result_codes", this.getResultCodes());
        writer.writeBooleanValue("success", this.getSuccess());
        writer.writeStringValue("task_id", this.getTaskId());
        writer.writeStringValue("task_type", this.getTaskType());
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
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the result property value. Task result
     * @param value Value to set for the result property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResult(@javax.annotation.Nullable final String value) {
        this.result = value;
    }
    /**
     * Sets the result_codes property value. List of result codes
     * @param value Value to set for the resultCodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultCodes(@javax.annotation.Nullable final java.util.List<ServiceTaskCreateResponseTaskResultCodes> value) {
        this.resultCodes = value;
    }
    /**
     * Sets the success property value. Task success
     * @param value Value to set for the success property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccess(@javax.annotation.Nullable final Boolean value) {
        this.success = value;
    }
    /**
     * Sets the task_id property value. Unique identifier for the task
     * @param value Value to set for the taskId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskId(@javax.annotation.Nullable final String value) {
        this.taskId = value;
    }
    /**
     * Sets the task_type property value. Task type
     * @param value Value to set for the taskType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskType(@javax.annotation.Nullable final String value) {
        this.taskType = value;
    }
}
