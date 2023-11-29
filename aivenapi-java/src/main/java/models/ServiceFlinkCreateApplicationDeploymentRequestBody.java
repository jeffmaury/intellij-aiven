package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkCreateApplicationDeploymentRequestBody
 */
public class ServiceFlinkCreateApplicationDeploymentRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Flink Job parallelism */
    private Integer parallelism;
    /** Specifies whether a Flink Job is restarted in case it fails */
    private Boolean restartEnabled;
    /** Job savepoint */
    private String startingSavepoint;
    /** ApplicationVersion ID */
    private String versionId;
    /**
     * Instantiates a new ServiceFlinkCreateApplicationDeploymentRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkCreateApplicationDeploymentRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkCreateApplicationDeploymentRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkCreateApplicationDeploymentRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkCreateApplicationDeploymentRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("parallelism", (n) -> { this.setParallelism(n.getIntegerValue()); });
        deserializerMap.put("restart_enabled", (n) -> { this.setRestartEnabled(n.getBooleanValue()); });
        deserializerMap.put("starting_savepoint", (n) -> { this.setStartingSavepoint(n.getStringValue()); });
        deserializerMap.put("version_id", (n) -> { this.setVersionId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeIntegerValue("parallelism", this.getParallelism());
        writer.writeBooleanValue("restart_enabled", this.getRestartEnabled());
        writer.writeStringValue("starting_savepoint", this.getStartingSavepoint());
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
     * Sets the version_id property value. ApplicationVersion ID
     * @param value Value to set for the versionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionId(@javax.annotation.Nullable final String value) {
        this.versionId = value;
    }
}
