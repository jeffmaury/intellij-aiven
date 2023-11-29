package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloudName;
    /**
     * Hourly privatelink price in this cloud region
     */
    private String priceUsd;
    /**
     * Instantiates a new ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability and sets the default values.
     */
    public ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability
     */
    @jakarta.annotation.Nonnull
    public static ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectPrivatelinkAvailabilityListResponsePrivatelinkAvailability();
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
     * Gets the cloud_name property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("price_usd", (n) -> { this.setPriceUsd(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the price_usd property value. Hourly privatelink price in this cloud region
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPriceUsd() {
        return this.priceUsd;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeStringValue("price_usd", this.getPriceUsd());
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
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloud_name property.
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the price_usd property value. Hourly privatelink price in this cloud region
     * @param value Value to set for the price_usd property.
     */
    public void setPriceUsd(@jakarta.annotation.Nullable final String value) {
        this.priceUsd = value;
    }
}
