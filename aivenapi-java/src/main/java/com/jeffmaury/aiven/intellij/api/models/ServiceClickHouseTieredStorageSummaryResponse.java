package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceClickHouseTieredStorageSummaryResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceClickHouseTieredStorageSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The current cost in USD of tiered storage since the beginning of the billing period
     */
    private String currentCost;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceClickHouseTieredStorageSummaryResponseErrors> errors;
    /**
     * The forecasted cost in USD of tiered storage in the billing period
     */
    private String forecastedCost;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * History of usage and cumulative costs in the billing period
     */
    private ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory storageUsageHistory;
    /**
     * Total storage usage by tiered storage, in bytes
     */
    private Integer totalStorageUsage;
    /**
     * Instantiates a new ServiceClickHouseTieredStorageSummaryResponse and sets the default values.
     */
    public ServiceClickHouseTieredStorageSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceClickHouseTieredStorageSummaryResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceClickHouseTieredStorageSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceClickHouseTieredStorageSummaryResponse();
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
     * Gets the current_cost property value. The current cost in USD of tiered storage since the beginning of the billing period
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentCost() {
        return this.currentCost;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceClickHouseTieredStorageSummaryResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceClickHouseTieredStorageSummaryResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("current_cost", (n) -> { this.setCurrentCost(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceClickHouseTieredStorageSummaryResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("forecasted_cost", (n) -> { this.setForecastedCost(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("storage_usage_history", (n) -> { this.setStorageUsageHistory(n.getObjectValue(ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("total_storage_usage", (n) -> { this.setTotalStorageUsage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forecasted_cost property value. The forecasted cost in USD of tiered storage in the billing period
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getForecastedCost() {
        return this.forecastedCost;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the storage_usage_history property value. History of usage and cumulative costs in the billing period
     * @return a ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory
     */
    @jakarta.annotation.Nullable
    public ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory getStorageUsageHistory() {
        return this.storageUsageHistory;
    }
    /**
     * Gets the total_storage_usage property value. Total storage usage by tiered storage, in bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalStorageUsage() {
        return this.totalStorageUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("current_cost", this.getCurrentCost());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("forecasted_cost", this.getForecastedCost());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("storage_usage_history", this.getStorageUsageHistory());
        writer.writeIntegerValue("total_storage_usage", this.getTotalStorageUsage());
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
     * Sets the current_cost property value. The current cost in USD of tiered storage since the beginning of the billing period
     * @param value Value to set for the current_cost property.
     */
    public void setCurrentCost(@jakarta.annotation.Nullable final String value) {
        this.currentCost = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceClickHouseTieredStorageSummaryResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the forecasted_cost property value. The forecasted cost in USD of tiered storage in the billing period
     * @param value Value to set for the forecasted_cost property.
     */
    public void setForecastedCost(@jakarta.annotation.Nullable final String value) {
        this.forecastedCost = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the storage_usage_history property value. History of usage and cumulative costs in the billing period
     * @param value Value to set for the storage_usage_history property.
     */
    public void setStorageUsageHistory(@jakarta.annotation.Nullable final ServiceClickHouseTieredStorageSummaryResponseStorageUsageHistory value) {
        this.storageUsageHistory = value;
    }
    /**
     * Sets the total_storage_usage property value. Total storage usage by tiered storage, in bytes
     * @param value Value to set for the total_storage_usage property.
     */
    public void setTotalStorageUsage(@jakarta.annotation.Nullable final Integer value) {
        this.totalStorageUsage = value;
    }
}
