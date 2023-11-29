package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Backup configuration for this service plan
 */
public class ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Interval of taking a frequent backup in service types supporting different backup schedules */
    private Integer frequentIntervalMinutes;
    /** Maximum age of the oldest frequent backup in service types supporting different backup schedules */
    private Integer frequentOldestAgeMinutes;
    /** Interval of taking an infrequent backup in service types supporting different backup schedules */
    private Integer infrequentIntervalMinutes;
    /** Maximum age of the oldest infrequent backup in service types supporting different backup schedules */
    private Integer infrequentOldestAgeMinutes;
    /** The interval, in hours, at which backups are generated. For some services, like PostgreSQL, this is the interval at which full snapshots are taken and continuous incremental backup stream is maintained in addition to that. */
    private Integer interval;
    /** Maximum number of backups to keep. Zero when no backups are created. */
    private Integer maxCount;
    /** Mechanism how backups can be restored. 'basic' means a backup is restored as is so that the system is restored to the state it was when the backup was generated. 'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot. */
    private ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode recoveryMode;
    /**
     * Instantiates a new ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig
     */
    @javax.annotation.Nonnull
    public static ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfig();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("frequent_interval_minutes", (n) -> { this.setFrequentIntervalMinutes(n.getIntegerValue()); });
        deserializerMap.put("frequent_oldest_age_minutes", (n) -> { this.setFrequentOldestAgeMinutes(n.getIntegerValue()); });
        deserializerMap.put("infrequent_interval_minutes", (n) -> { this.setInfrequentIntervalMinutes(n.getIntegerValue()); });
        deserializerMap.put("infrequent_oldest_age_minutes", (n) -> { this.setInfrequentOldestAgeMinutes(n.getIntegerValue()); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getIntegerValue()); });
        deserializerMap.put("max_count", (n) -> { this.setMaxCount(n.getIntegerValue()); });
        deserializerMap.put("recovery_mode", (n) -> { this.setRecoveryMode(n.getEnumValue(ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode.class)); });
        return deserializerMap;
    }
    /**
     * Gets the frequent_interval_minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrequentIntervalMinutes() {
        return this.frequentIntervalMinutes;
    }
    /**
     * Gets the frequent_oldest_age_minutes property value. Maximum age of the oldest frequent backup in service types supporting different backup schedules
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrequentOldestAgeMinutes() {
        return this.frequentOldestAgeMinutes;
    }
    /**
     * Gets the infrequent_interval_minutes property value. Interval of taking an infrequent backup in service types supporting different backup schedules
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInfrequentIntervalMinutes() {
        return this.infrequentIntervalMinutes;
    }
    /**
     * Gets the infrequent_oldest_age_minutes property value. Maximum age of the oldest infrequent backup in service types supporting different backup schedules
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInfrequentOldestAgeMinutes() {
        return this.infrequentOldestAgeMinutes;
    }
    /**
     * Gets the interval property value. The interval, in hours, at which backups are generated. For some services, like PostgreSQL, this is the interval at which full snapshots are taken and continuous incremental backup stream is maintained in addition to that.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * Gets the max_count property value. Maximum number of backups to keep. Zero when no backups are created.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxCount() {
        return this.maxCount;
    }
    /**
     * Gets the recovery_mode property value. Mechanism how backups can be restored. 'basic' means a backup is restored as is so that the system is restored to the state it was when the backup was generated. 'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
     * @return a ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode
     */
    @javax.annotation.Nullable
    public ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode getRecoveryMode() {
        return this.recoveryMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("frequent_interval_minutes", this.getFrequentIntervalMinutes());
        writer.writeIntegerValue("frequent_oldest_age_minutes", this.getFrequentOldestAgeMinutes());
        writer.writeIntegerValue("infrequent_interval_minutes", this.getInfrequentIntervalMinutes());
        writer.writeIntegerValue("infrequent_oldest_age_minutes", this.getInfrequentOldestAgeMinutes());
        writer.writeIntegerValue("interval", this.getInterval());
        writer.writeIntegerValue("max_count", this.getMaxCount());
        writer.writeEnumValue("recovery_mode", this.getRecoveryMode());
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
     * Sets the frequent_interval_minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @param value Value to set for the frequentIntervalMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrequentIntervalMinutes(@javax.annotation.Nullable final Integer value) {
        this.frequentIntervalMinutes = value;
    }
    /**
     * Sets the frequent_oldest_age_minutes property value. Maximum age of the oldest frequent backup in service types supporting different backup schedules
     * @param value Value to set for the frequentOldestAgeMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrequentOldestAgeMinutes(@javax.annotation.Nullable final Integer value) {
        this.frequentOldestAgeMinutes = value;
    }
    /**
     * Sets the infrequent_interval_minutes property value. Interval of taking an infrequent backup in service types supporting different backup schedules
     * @param value Value to set for the infrequentIntervalMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfrequentIntervalMinutes(@javax.annotation.Nullable final Integer value) {
        this.infrequentIntervalMinutes = value;
    }
    /**
     * Sets the infrequent_oldest_age_minutes property value. Maximum age of the oldest infrequent backup in service types supporting different backup schedules
     * @param value Value to set for the infrequentOldestAgeMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfrequentOldestAgeMinutes(@javax.annotation.Nullable final Integer value) {
        this.infrequentOldestAgeMinutes = value;
    }
    /**
     * Sets the interval property value. The interval, in hours, at which backups are generated. For some services, like PostgreSQL, this is the interval at which full snapshots are taken and continuous incremental backup stream is maintained in addition to that.
     * @param value Value to set for the interval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterval(@javax.annotation.Nullable final Integer value) {
        this.interval = value;
    }
    /**
     * Sets the max_count property value. Maximum number of backups to keep. Zero when no backups are created.
     * @param value Value to set for the maxCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxCount(@javax.annotation.Nullable final Integer value) {
        this.maxCount = value;
    }
    /**
     * Sets the recovery_mode property value. Mechanism how backups can be restored. 'basic' means a backup is restored as is so that the system is restored to the state it was when the backup was generated. 'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
     * @param value Value to set for the recoveryMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecoveryMode(@javax.annotation.Nullable final ListProjectServiceTypesResponseServiceTypesANYServicePlansBackupConfigRecoveryMode value) {
        this.recoveryMode = value;
    }
}
