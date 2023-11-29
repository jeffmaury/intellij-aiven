package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceListResponseServicesNodeStatesProgressUpdates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates whether this phase has been completed or not */
    private Boolean completed;
    /** Current progress for this phase. May be missing or null. */
    private Integer current;
    /** Maximum progress value for this phase. May be missing or null. May change. */
    private Integer max;
    /** Minimum progress value for this phase. May be missing or null. */
    private Integer min;
    /** Key identifying this phase */
    private ServiceListResponseServicesNodeStatesProgressUpdatesPhase phase;
    /** Unit for current/min/max values. New units may be added. If null should be treated as generic unit */
    private ServiceListResponseServicesNodeStatesProgressUpdatesUnit unit;
    /**
     * Instantiates a new ServiceListResponseServicesNodeStatesProgressUpdates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesProgressUpdates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceListResponseServicesNodeStatesProgressUpdates
     */
    @javax.annotation.Nonnull
    public static ServiceListResponseServicesNodeStatesProgressUpdates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceListResponseServicesNodeStatesProgressUpdates();
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
     * Gets the completed property value. Indicates whether this phase has been completed or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCompleted() {
        return this.completed;
    }
    /**
     * Gets the current property value. Current progress for this phase. May be missing or null.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCurrent() {
        return this.current;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("completed", (n) -> { this.setCompleted(n.getBooleanValue()); });
        deserializerMap.put("current", (n) -> { this.setCurrent(n.getIntegerValue()); });
        deserializerMap.put("max", (n) -> { this.setMax(n.getIntegerValue()); });
        deserializerMap.put("min", (n) -> { this.setMin(n.getIntegerValue()); });
        deserializerMap.put("phase", (n) -> { this.setPhase(n.getEnumValue(ServiceListResponseServicesNodeStatesProgressUpdatesPhase.class)); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(ServiceListResponseServicesNodeStatesProgressUpdatesUnit.class)); });
        return deserializerMap;
    }
    /**
     * Gets the max property value. Maximum progress value for this phase. May be missing or null. May change.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMax() {
        return this.max;
    }
    /**
     * Gets the min property value. Minimum progress value for this phase. May be missing or null.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMin() {
        return this.min;
    }
    /**
     * Gets the phase property value. Key identifying this phase
     * @return a ServiceListResponseServicesNodeStatesProgressUpdatesPhase
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesProgressUpdatesPhase getPhase() {
        return this.phase;
    }
    /**
     * Gets the unit property value. Unit for current/min/max values. New units may be added. If null should be treated as generic unit
     * @return a ServiceListResponseServicesNodeStatesProgressUpdatesUnit
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesProgressUpdatesUnit getUnit() {
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
        writer.writeBooleanValue("completed", this.getCompleted());
        writer.writeIntegerValue("current", this.getCurrent());
        writer.writeIntegerValue("max", this.getMax());
        writer.writeIntegerValue("min", this.getMin());
        writer.writeEnumValue("phase", this.getPhase());
        writer.writeEnumValue("unit", this.getUnit());
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
     * Sets the completed property value. Indicates whether this phase has been completed or not
     * @param value Value to set for the completed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompleted(@javax.annotation.Nullable final Boolean value) {
        this.completed = value;
    }
    /**
     * Sets the current property value. Current progress for this phase. May be missing or null.
     * @param value Value to set for the current property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrent(@javax.annotation.Nullable final Integer value) {
        this.current = value;
    }
    /**
     * Sets the max property value. Maximum progress value for this phase. May be missing or null. May change.
     * @param value Value to set for the max property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMax(@javax.annotation.Nullable final Integer value) {
        this.max = value;
    }
    /**
     * Sets the min property value. Minimum progress value for this phase. May be missing or null.
     * @param value Value to set for the min property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMin(@javax.annotation.Nullable final Integer value) {
        this.min = value;
    }
    /**
     * Sets the phase property value. Key identifying this phase
     * @param value Value to set for the phase property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhase(@javax.annotation.Nullable final ServiceListResponseServicesNodeStatesProgressUpdatesPhase value) {
        this.phase = value;
    }
    /**
     * Sets the unit property value. Unit for current/min/max values. New units may be added. If null should be treated as generic unit
     * @param value Value to set for the unit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnit(@javax.annotation.Nullable final ServiceListResponseServicesNodeStatesProgressUpdatesUnit value) {
        this.unit = value;
    }
}
