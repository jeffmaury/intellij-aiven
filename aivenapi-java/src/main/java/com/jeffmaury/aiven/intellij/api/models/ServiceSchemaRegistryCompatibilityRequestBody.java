package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceSchemaRegistryCompatibilityRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceSchemaRegistryCompatibilityRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Schema
     */
    private String schema;
    /**
     * Schema type
     */
    private ServiceSchemaRegistryCompatibilityRequestBodySchemaType schemaType;
    /**
     * Instantiates a new ServiceSchemaRegistryCompatibilityRequestBody and sets the default values.
     */
    public ServiceSchemaRegistryCompatibilityRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceSchemaRegistryCompatibilityRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceSchemaRegistryCompatibilityRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceSchemaRegistryCompatibilityRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getStringValue()); });
        deserializerMap.put("schemaType", (n) -> { this.setSchemaType(n.getEnumValue(ServiceSchemaRegistryCompatibilityRequestBodySchemaType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the schema property value. Schema
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchema() {
        return this.schema;
    }
    /**
     * Gets the schemaType property value. Schema type
     * @return a ServiceSchemaRegistryCompatibilityRequestBodySchemaType
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryCompatibilityRequestBodySchemaType getSchemaType() {
        return this.schemaType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("schema", this.getSchema());
        writer.writeEnumValue("schemaType", this.getSchemaType());
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
     * Sets the schema property value. Schema
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final String value) {
        this.schema = value;
    }
    /**
     * Sets the schemaType property value. Schema type
     * @param value Value to set for the schemaType property.
     */
    public void setSchemaType(@jakarta.annotation.Nullable final ServiceSchemaRegistryCompatibilityRequestBodySchemaType value) {
        this.schemaType = value;
    }
}
