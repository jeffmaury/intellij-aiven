package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProjectGetServiceLogsResponseLogs implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Log message */
    private String msg;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String time;
    /** SystemD unit name */
    private String unit;
    /**
     * Instantiates a new ProjectGetServiceLogsResponseLogs and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectGetServiceLogsResponseLogs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetServiceLogsResponseLogs
     */
    @javax.annotation.Nonnull
    public static ProjectGetServiceLogsResponseLogs createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetServiceLogsResponseLogs();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("msg", (n) -> { this.setMsg(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the msg property value. Log message
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMsg() {
        return this.msg;
    }
    /**
     * Gets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Gets the unit property value. SystemD unit name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("msg", this.getMsg());
        writer.writeStringValue("time", this.getTime());
        writer.writeStringValue("unit", this.getUnit());
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
     * Sets the msg property value. Log message
     * @param value Value to set for the msg property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMsg(@javax.annotation.Nullable final String value) {
        this.msg = value;
    }
    /**
     * Sets the time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTime(@javax.annotation.Nullable final String value) {
        this.time = value;
    }
    /**
     * Sets the unit property value. SystemD unit name
     * @param value Value to set for the unit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnit(@javax.annotation.Nullable final String value) {
        this.unit = value;
    }
}
