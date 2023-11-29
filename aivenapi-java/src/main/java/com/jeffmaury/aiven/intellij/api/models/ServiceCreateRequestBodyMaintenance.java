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
public class ServiceCreateRequestBodyMaintenance implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Day of week for installing updates */
    private ServiceCreateRequestBodyMaintenanceDow dow;
    /** Time for installing updates, UTC */
    private String time;
    /**
     * Instantiates a new ServiceCreateRequestBodyMaintenance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceCreateRequestBodyMaintenance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceCreateRequestBodyMaintenance
     */
    @javax.annotation.Nonnull
    public static ServiceCreateRequestBodyMaintenance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceCreateRequestBodyMaintenance();
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
     * Gets the dow property value. Day of week for installing updates
     * @return a ServiceCreateRequestBodyMaintenanceDow
     */
    @javax.annotation.Nullable
    public ServiceCreateRequestBodyMaintenanceDow getDow() {
        return this.dow;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dow", (n) -> { this.setDow(n.getEnumValue(ServiceCreateRequestBodyMaintenanceDow.class)); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the time property value. Time for installing updates, UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dow", this.getDow());
        writer.writeStringValue("time", this.getTime());
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
     * Sets the dow property value. Day of week for installing updates
     * @param value Value to set for the dow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDow(@javax.annotation.Nullable final ServiceCreateRequestBodyMaintenanceDow value) {
        this.dow = value;
    }
    /**
     * Sets the time property value. Time for installing updates, UTC
     * @param value Value to set for the time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTime(@javax.annotation.Nullable final String value) {
        this.time = value;
    }
}
