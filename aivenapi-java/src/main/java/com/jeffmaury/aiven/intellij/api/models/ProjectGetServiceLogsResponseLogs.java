package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectGetServiceLogsResponseLogs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Log message
     */
    private String msg;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String time;
    /**
     * SystemD unit name
     */
    private String unit;
    /**
     * Instantiates a new ProjectGetServiceLogsResponseLogs and sets the default values.
     */
    public ProjectGetServiceLogsResponseLogs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetServiceLogsResponseLogs
     */
    @jakarta.annotation.Nonnull
    public static ProjectGetServiceLogsResponseLogs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetServiceLogsResponseLogs();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("msg", (n) -> { this.setMsg(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the msg property value. Log message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMsg() {
        return this.msg;
    }
    /**
     * Gets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Gets the unit property value. SystemD unit name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("msg", this.getMsg());
        writer.writeStringValue("time", this.getTime());
        writer.writeStringValue("unit", this.getUnit());
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
     * Sets the msg property value. Log message
     * @param value Value to set for the msg property.
     */
    public void setMsg(@jakarta.annotation.Nullable final String value) {
        this.msg = value;
    }
    /**
     * Sets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final String value) {
        this.time = value;
    }
    /**
     * Sets the unit property value. SystemD unit name
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
}
