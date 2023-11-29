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
public class ServiceGetResponseServiceMaintenance implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Day of week for installing updates */
    private ServiceGetResponseServiceMaintenanceDow dow;
    /** Time for installing updates, UTC */
    private String time;
    /** List of updates waiting to be installed */
    private java.util.List<ServiceGetResponseServiceMaintenanceUpdates> updates;
    /**
     * Instantiates a new ServiceGetResponseServiceMaintenance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceGetResponseServiceMaintenance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceMaintenance
     */
    @javax.annotation.Nonnull
    public static ServiceGetResponseServiceMaintenance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceMaintenance();
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
     * @return a ServiceGetResponseServiceMaintenanceDow
     */
    @javax.annotation.Nullable
    public ServiceGetResponseServiceMaintenanceDow getDow() {
        return this.dow;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dow", (n) -> { this.setDow(n.getEnumValue(ServiceGetResponseServiceMaintenanceDow.class)); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        deserializerMap.put("updates", (n) -> { this.setUpdates(n.getCollectionOfObjectValues(ServiceGetResponseServiceMaintenanceUpdates::createFromDiscriminatorValue)); });
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
     * Gets the updates property value. List of updates waiting to be installed
     * @return a ServiceGetResponseServiceMaintenanceUpdates
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceGetResponseServiceMaintenanceUpdates> getUpdates() {
        return this.updates;
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
        writer.writeCollectionOfObjectValues("updates", this.getUpdates());
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
    public void setDow(@javax.annotation.Nullable final ServiceGetResponseServiceMaintenanceDow value) {
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
    /**
     * Sets the updates property value. List of updates waiting to be installed
     * @param value Value to set for the updates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdates(@javax.annotation.Nullable final java.util.List<ServiceGetResponseServiceMaintenanceUpdates> value) {
        this.updates = value;
    }
}
