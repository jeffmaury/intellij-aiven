package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceCreateResponseServiceBackups implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Additional backup regions, if available */
    private java.util.List<ServiceCreateResponseServiceBackupsAdditionalRegions> additionalRegions;
    /** Internal name of this backup */
    private String backupName;
    /** Backup timestamp (ISO 8601) */
    private String backupTime;
    /** Backup's original size before compression */
    private Integer dataSize;
    /** Location where this backup is stored */
    private String storageLocation;
    /**
     * Instantiates a new ServiceCreateResponseServiceBackups and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceCreateResponseServiceBackups() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceCreateResponseServiceBackups
     */
    @javax.annotation.Nonnull
    public static ServiceCreateResponseServiceBackups createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceCreateResponseServiceBackups();
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
     * Gets the additional_regions property value. Additional backup regions, if available
     * @return a ServiceCreateResponseServiceBackupsAdditionalRegions
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceCreateResponseServiceBackupsAdditionalRegions> getAdditionalRegions() {
        return this.additionalRegions;
    }
    /**
     * Gets the backup_name property value. Internal name of this backup
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackupName() {
        return this.backupName;
    }
    /**
     * Gets the backup_time property value. Backup timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackupTime() {
        return this.backupTime;
    }
    /**
     * Gets the data_size property value. Backup's original size before compression
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDataSize() {
        return this.dataSize;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additional_regions", (n) -> { this.setAdditionalRegions(n.getCollectionOfObjectValues(ServiceCreateResponseServiceBackupsAdditionalRegions::createFromDiscriminatorValue)); });
        deserializerMap.put("backup_name", (n) -> { this.setBackupName(n.getStringValue()); });
        deserializerMap.put("backup_time", (n) -> { this.setBackupTime(n.getStringValue()); });
        deserializerMap.put("data_size", (n) -> { this.setDataSize(n.getIntegerValue()); });
        deserializerMap.put("storage_location", (n) -> { this.setStorageLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the storage_location property value. Location where this backup is stored
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStorageLocation() {
        return this.storageLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additional_regions", this.getAdditionalRegions());
        writer.writeStringValue("backup_name", this.getBackupName());
        writer.writeStringValue("backup_time", this.getBackupTime());
        writer.writeIntegerValue("data_size", this.getDataSize());
        writer.writeStringValue("storage_location", this.getStorageLocation());
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
     * Sets the additional_regions property value. Additional backup regions, if available
     * @param value Value to set for the additionalRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalRegions(@javax.annotation.Nullable final java.util.List<ServiceCreateResponseServiceBackupsAdditionalRegions> value) {
        this.additionalRegions = value;
    }
    /**
     * Sets the backup_name property value. Internal name of this backup
     * @param value Value to set for the backupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackupName(@javax.annotation.Nullable final String value) {
        this.backupName = value;
    }
    /**
     * Sets the backup_time property value. Backup timestamp (ISO 8601)
     * @param value Value to set for the backupTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackupTime(@javax.annotation.Nullable final String value) {
        this.backupTime = value;
    }
    /**
     * Sets the data_size property value. Backup's original size before compression
     * @param value Value to set for the dataSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSize(@javax.annotation.Nullable final Integer value) {
        this.dataSize = value;
    }
    /**
     * Sets the storage_location property value. Location where this backup is stored
     * @param value Value to set for the storageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageLocation(@javax.annotation.Nullable final String value) {
        this.storageLocation = value;
    }
}
