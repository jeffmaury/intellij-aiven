package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceSchemaRegistryGlobalConfigPutRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceSchemaRegistryGlobalConfigPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Configuration
     */
    private ServiceSchemaRegistryGlobalConfigPutRequestBodyCompatibility compatibility;
    /**
     * Instantiates a new ServiceSchemaRegistryGlobalConfigPutRequestBody and sets the default values.
     */
    public ServiceSchemaRegistryGlobalConfigPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceSchemaRegistryGlobalConfigPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceSchemaRegistryGlobalConfigPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceSchemaRegistryGlobalConfigPutRequestBody();
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
     * Gets the compatibility property value. Configuration
     * @return a ServiceSchemaRegistryGlobalConfigPutRequestBodyCompatibility
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryGlobalConfigPutRequestBodyCompatibility getCompatibility() {
        return this.compatibility;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("compatibility", (n) -> { this.setCompatibility(n.getEnumValue(ServiceSchemaRegistryGlobalConfigPutRequestBodyCompatibility.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("compatibility", this.getCompatibility());
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
     * Sets the compatibility property value. Configuration
     * @param value Value to set for the compatibility property.
     */
    public void setCompatibility(@jakarta.annotation.Nullable final ServiceSchemaRegistryGlobalConfigPutRequestBodyCompatibility value) {
        this.compatibility = value;
    }
}
