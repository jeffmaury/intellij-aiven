package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String hourStart;
    /** Peak bytes stored on object storage at this hour */
    private Integer peakStoredBytes;
    /**
     * Instantiates a new ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTieredStorageSummaryResponseStorageUsageHistoryHourly();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("hour_start", (n) -> { this.setHourStart(n.getStringValue()); });
        deserializerMap.put("peak_stored_bytes", (n) -> { this.setPeakStoredBytes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hour_start property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHourStart() {
        return this.hourStart;
    }
    /**
     * Gets the peak_stored_bytes property value. Peak bytes stored on object storage at this hour
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPeakStoredBytes() {
        return this.peakStoredBytes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("hour_start", this.getHourStart());
        writer.writeIntegerValue("peak_stored_bytes", this.getPeakStoredBytes());
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
     * Sets the hour_start property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the hourStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHourStart(@javax.annotation.Nullable final String value) {
        this.hourStart = value;
    }
    /**
     * Sets the peak_stored_bytes property value. Peak bytes stored on object storage at this hour
     * @param value Value to set for the peakStoredBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeakStoredBytes(@javax.annotation.Nullable final Integer value) {
        this.peakStoredBytes = value;
    }
}
