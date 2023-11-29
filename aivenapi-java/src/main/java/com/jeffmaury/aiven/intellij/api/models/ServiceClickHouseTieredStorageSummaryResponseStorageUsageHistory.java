package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * History of usage and cumulative costs in the billing period
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * History by hour
     */
    private java.util.List<ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistoryHourly> hourly;
    /**
     * Instantiates a new ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory and sets the default values.
     */
    public ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory
     */
    @jakarta.annotation.Nonnull
    public static ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("hourly", (n) -> { this.setHourly(n.getCollectionOfObjectValues(ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistoryHourly::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hourly property value. History by hour
     * @return a java.util.List<ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistoryHourly>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistoryHourly> getHourly() {
        return this.hourly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("hourly", this.getHourly());
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
     * Sets the hourly property value. History by hour
     * @param value Value to set for the hourly property.
     */
    public void setHourly(@jakarta.annotation.Nullable final java.util.List<ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistoryHourly> value) {
        this.hourly = value;
    }
}
