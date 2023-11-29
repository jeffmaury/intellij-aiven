package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetResponseServiceBackupsAdditionalRegions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloud;
    /**
     * Indicates additional backup synchronization is paused
     */
    private Boolean paused;
    /**
     * Reason for pausing the backup synchronization
     */
    private String pauseReason;
    /**
     * Cloud storage region name
     */
    private String region;
    /**
     * Instantiates a new ServiceGetResponseServiceBackupsAdditionalRegions and sets the default values.
     */
    public ServiceGetResponseServiceBackupsAdditionalRegions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceBackupsAdditionalRegions
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetResponseServiceBackupsAdditionalRegions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceBackupsAdditionalRegions();
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
     * Gets the cloud property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloud() {
        return this.cloud;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPaused() {
        return this.paused;
    }
    /**
     * Gets the pause_reason property value. Reason for pausing the backup synchronization
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPauseReason() {
        return this.pauseReason;
    }
    /**
     * Gets the region property value. Cloud storage region name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeBooleanValue("paused", this.getPaused());
        writer.writeStringValue("pause_reason", this.getPauseReason());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     */
    public void setCloud(@jakarta.annotation.Nullable final String value) {
        this.cloud = value;
    }
    /**
     * Sets the paused property value. Indicates additional backup synchronization is paused
     * @param value Value to set for the paused property.
     */
    public void setPaused(@jakarta.annotation.Nullable final Boolean value) {
        this.paused = value;
    }
    /**
     * Sets the pause_reason property value. Reason for pausing the backup synchronization
     * @param value Value to set for the pause_reason property.
     */
    public void setPauseReason(@jakarta.annotation.Nullable final String value) {
        this.pauseReason = value;
    }
    /**
     * Sets the region property value. Cloud storage region name
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
}
