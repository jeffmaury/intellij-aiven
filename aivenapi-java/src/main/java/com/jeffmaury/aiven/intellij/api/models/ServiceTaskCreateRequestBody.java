package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceTaskCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceTaskCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Payload to be used with dataset_import
     */
    private ServiceTaskCreateRequestBodyDatasetImport datasetImport;
    /**
     * Payload to be used with migration_check
     */
    private ServiceTaskCreateRequestBodyMigrationCheck migrationCheck;
    /**
     * Target version used with upgrade_check
     */
    private ServiceTaskCreateRequestBodyTargetVersion targetVersion;
    /**
     * Service task type
     */
    private ServiceTaskCreateRequestBodyTaskType taskType;
    /**
     * Instantiates a new ServiceTaskCreateRequestBody and sets the default values.
     */
    public ServiceTaskCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceTaskCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceTaskCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceTaskCreateRequestBody();
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
     * Gets the dataset_import property value. Payload to be used with dataset_import
     * @return a ServiceTaskCreateRequestBodyDatasetImport
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateRequestBodyDatasetImport getDatasetImport() {
        return this.datasetImport;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dataset_import", (n) -> { this.setDatasetImport(n.getObjectValue(ServiceTaskCreateRequestBodyDatasetImport::createFromDiscriminatorValue)); });
        deserializerMap.put("migration_check", (n) -> { this.setMigrationCheck(n.getObjectValue(ServiceTaskCreateRequestBodyMigrationCheck::createFromDiscriminatorValue)); });
        deserializerMap.put("target_version", (n) -> { this.setTargetVersion(n.getEnumValue(ServiceTaskCreateRequestBodyTargetVersion::forValue)); });
        deserializerMap.put("task_type", (n) -> { this.setTaskType(n.getEnumValue(ServiceTaskCreateRequestBodyTaskType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the migration_check property value. Payload to be used with migration_check
     * @return a ServiceTaskCreateRequestBodyMigrationCheck
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateRequestBodyMigrationCheck getMigrationCheck() {
        return this.migrationCheck;
    }
    /**
     * Gets the target_version property value. Target version used with upgrade_check
     * @return a ServiceTaskCreateRequestBodyTargetVersion
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateRequestBodyTargetVersion getTargetVersion() {
        return this.targetVersion;
    }
    /**
     * Gets the task_type property value. Service task type
     * @return a ServiceTaskCreateRequestBodyTaskType
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateRequestBodyTaskType getTaskType() {
        return this.taskType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dataset_import", this.getDatasetImport());
        writer.writeObjectValue("migration_check", this.getMigrationCheck());
        writer.writeEnumValue("target_version", this.getTargetVersion());
        writer.writeEnumValue("task_type", this.getTaskType());
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
     * Sets the dataset_import property value. Payload to be used with dataset_import
     * @param value Value to set for the dataset_import property.
     */
    public void setDatasetImport(@jakarta.annotation.Nullable final ServiceTaskCreateRequestBodyDatasetImport value) {
        this.datasetImport = value;
    }
    /**
     * Sets the migration_check property value. Payload to be used with migration_check
     * @param value Value to set for the migration_check property.
     */
    public void setMigrationCheck(@jakarta.annotation.Nullable final ServiceTaskCreateRequestBodyMigrationCheck value) {
        this.migrationCheck = value;
    }
    /**
     * Sets the target_version property value. Target version used with upgrade_check
     * @param value Value to set for the target_version property.
     */
    public void setTargetVersion(@jakarta.annotation.Nullable final ServiceTaskCreateRequestBodyTargetVersion value) {
        this.targetVersion = value;
    }
    /**
     * Sets the task_type property value. Service task type
     * @param value Value to set for the task_type property.
     */
    public void setTaskType(@jakarta.annotation.Nullable final ServiceTaskCreateRequestBodyTaskType value) {
        this.taskType = value;
    }
}
