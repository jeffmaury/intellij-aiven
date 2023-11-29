package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Deadline for installing the update */
    private String deadline;
    /** Description of the update */
    private String description;
    /** The earliest time the update will be automatically applied */
    private String startAfter;
    /** The time when the update will be automatically applied */
    private String startAt;
    /**
     * Instantiates a new ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates
     */
    @javax.annotation.Nonnull
    public static ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyResponseServiceMaintenanceUpdates();
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
     * Gets the deadline property value. Deadline for installing the update
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeadline() {
        return this.deadline;
    }
    /**
     * Gets the description property value. Description of the update
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deadline", (n) -> { this.setDeadline(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("start_after", (n) -> { this.setStartAfter(n.getStringValue()); });
        deserializerMap.put("start_at", (n) -> { this.setStartAt(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start_after property value. The earliest time the update will be automatically applied
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStartAfter() {
        return this.startAfter;
    }
    /**
     * Gets the start_at property value. The time when the update will be automatically applied
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStartAt() {
        return this.startAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deadline", this.getDeadline());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("start_after", this.getStartAfter());
        writer.writeStringValue("start_at", this.getStartAt());
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
     * Sets the deadline property value. Deadline for installing the update
     * @param value Value to set for the deadline property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeadline(@javax.annotation.Nullable final String value) {
        this.deadline = value;
    }
    /**
     * Sets the description property value. Description of the update
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the start_after property value. The earliest time the update will be automatically applied
     * @param value Value to set for the startAfter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartAfter(@javax.annotation.Nullable final String value) {
        this.startAfter = value;
    }
    /**
     * Sets the start_at property value. The time when the update will be automatically applied
     * @param value Value to set for the startAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartAt(@javax.annotation.Nullable final String value) {
        this.startAt = value;
    }
}
