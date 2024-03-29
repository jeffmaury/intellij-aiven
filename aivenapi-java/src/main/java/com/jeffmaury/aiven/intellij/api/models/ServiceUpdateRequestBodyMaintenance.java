package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Automatic maintenance settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUpdateRequestBodyMaintenance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Day of week for installing updates
     */
    private ServiceUpdateRequestBodyMaintenanceDow dow;
    /**
     * Time for installing updates, UTC
     */
    private String time;
    /**
     * Instantiates a new ServiceUpdateRequestBodyMaintenance and sets the default values.
     */
    public ServiceUpdateRequestBodyMaintenance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateRequestBodyMaintenance
     */
    @jakarta.annotation.Nonnull
    public static ServiceUpdateRequestBodyMaintenance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateRequestBodyMaintenance();
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
     * Gets the dow property value. Day of week for installing updates
     * @return a ServiceUpdateRequestBodyMaintenanceDow
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateRequestBodyMaintenanceDow getDow() {
        return this.dow;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dow", (n) -> { this.setDow(n.getEnumValue(ServiceUpdateRequestBodyMaintenanceDow::forValue)); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the time property value. Time for installing updates, UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dow", this.getDow());
        writer.writeStringValue("time", this.getTime());
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
     * Sets the dow property value. Day of week for installing updates
     * @param value Value to set for the dow property.
     */
    public void setDow(@jakarta.annotation.Nullable final ServiceUpdateRequestBodyMaintenanceDow value) {
        this.dow = value;
    }
    /**
     * Sets the time property value. Time for installing updates, UTC
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final String value) {
        this.time = value;
    }
}
