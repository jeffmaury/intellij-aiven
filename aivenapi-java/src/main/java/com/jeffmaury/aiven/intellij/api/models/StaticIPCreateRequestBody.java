package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * StaticIPCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StaticIPCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloudName;
    /**
     * Static IP address is protected against deletion
     */
    private Boolean terminationProtection;
    /**
     * Instantiates a new StaticIPCreateRequestBody and sets the default values.
     */
    public StaticIPCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StaticIPCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static StaticIPCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaticIPCreateRequestBody();
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
     * Gets the cloud_name property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the termination_protection property value. Static IP address is protected against deletion
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
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
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloud_name property.
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the termination_protection property value. Static IP address is protected against deletion
     * @param value Value to set for the termination_protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
}
