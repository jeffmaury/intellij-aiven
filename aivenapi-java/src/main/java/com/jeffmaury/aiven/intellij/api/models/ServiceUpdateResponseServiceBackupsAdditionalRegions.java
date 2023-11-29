package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUpdateResponseServiceBackupsAdditionalRegions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Target cloud */
    private String cloud;
    /** Indicates additional backup synchronization is paused */
    private Boolean paused;
    /** Reason for pausing the backup synchronization */
    private String pauseReason;
    /** Cloud storage region name */
    private String region;
    /**
     * Instantiates a new ServiceUpdateResponseServiceBackupsAdditionalRegions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUpdateResponseServiceBackupsAdditionalRegions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateResponseServiceBackupsAdditionalRegions
     */
    @javax.annotation.Nonnull
    public static ServiceUpdateResponseServiceBackupsAdditionalRegions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateResponseServiceBackupsAdditionalRegions();
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
     * Gets the cloud property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloud() {
        return this.cloud;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("paused", (n) -> { this.setPaused(n.getBooleanValue()); });
        deserializerMap.put("pause_reason", (n) -> { this.setPauseReason(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the paused property value. Indicates additional backup synchronization is paused
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPaused() {
        return this.paused;
    }
    /**
     * Gets the pause_reason property value. Reason for pausing the backup synchronization
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPauseReason() {
        return this.pauseReason;
    }
    /**
     * Gets the region property value. Cloud storage region name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeBooleanValue("paused", this.getPaused());
        writer.writeStringValue("pause_reason", this.getPauseReason());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloud(@javax.annotation.Nullable final String value) {
        this.cloud = value;
    }
    /**
     * Sets the paused property value. Indicates additional backup synchronization is paused
     * @param value Value to set for the paused property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaused(@javax.annotation.Nullable final Boolean value) {
        this.paused = value;
    }
    /**
     * Sets the pause_reason property value. Reason for pausing the backup synchronization
     * @param value Value to set for the pauseReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPauseReason(@javax.annotation.Nullable final String value) {
        this.pauseReason = value;
    }
    /**
     * Sets the region property value. Cloud storage region name
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
}
