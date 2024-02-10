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
public class ServiceUserCredentialsModifyResponseServiceMaintenance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Day of week for installing updates
     */
    private ServiceUserCredentialsModifyResponseServiceMaintenanceDow dow;
    /**
     * Time for installing updates, UTC
     */
    private String time;
    /**
     * List of updates waiting to be installed
     */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates> updates;
    /**
     * Instantiates a new ServiceUserCredentialsModifyResponseServiceMaintenance and sets the default values.
     */
    public ServiceUserCredentialsModifyResponseServiceMaintenance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyResponseServiceMaintenance
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCredentialsModifyResponseServiceMaintenance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyResponseServiceMaintenance();
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
     * @return a ServiceUserCredentialsModifyResponseServiceMaintenanceDow
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceMaintenanceDow getDow() {
        return this.dow;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dow", (n) -> { this.setDow(n.getEnumValue(ServiceUserCredentialsModifyResponseServiceMaintenanceDow::forValue)); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        deserializerMap.put("updates", (n) -> { this.setUpdates(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates::createFromDiscriminatorValue)); });
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
     * Gets the updates property value. List of updates waiting to be installed
     * @return a java.util.List<ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates> getUpdates() {
        return this.updates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dow", this.getDow());
        writer.writeStringValue("time", this.getTime());
        writer.writeCollectionOfObjectValues("updates", this.getUpdates());
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
    public void setDow(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceMaintenanceDow value) {
        this.dow = value;
    }
    /**
     * Sets the time property value. Time for installing updates, UTC
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final String value) {
        this.time = value;
    }
    /**
     * Sets the updates property value. List of updates waiting to be installed
     * @param value Value to set for the updates property.
     */
    public void setUpdates(@jakarta.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates> value) {
        this.updates = value;
    }
}
