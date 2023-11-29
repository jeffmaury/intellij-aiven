package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceSchemaRegistrySubjectVersionPostRequestBody
 */
public class ServiceSchemaRegistrySubjectVersionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Schema */
    private String schema;
    /** Schema type */
    private ServiceSchemaRegistrySubjectVersionPostRequestBodySchemaType schemaType;
    /**
     * Instantiates a new ServiceSchemaRegistrySubjectVersionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceSchemaRegistrySubjectVersionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceSchemaRegistrySubjectVersionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceSchemaRegistrySubjectVersionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceSchemaRegistrySubjectVersionPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getStringValue()); });
        deserializerMap.put("schemaType", (n) -> { this.setSchemaType(n.getEnumValue(ServiceSchemaRegistrySubjectVersionPostRequestBodySchemaType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the schema property value. Schema
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchema() {
        return this.schema;
    }
    /**
     * Gets the schemaType property value. Schema type
     * @return a ServiceSchemaRegistrySubjectVersionPostRequestBodySchemaType
     */
    @javax.annotation.Nullable
    public ServiceSchemaRegistrySubjectVersionPostRequestBodySchemaType getSchemaType() {
        return this.schemaType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("schema", this.getSchema());
        writer.writeEnumValue("schemaType", this.getSchemaType());
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
     * Sets the schema property value. Schema
     * @param value Value to set for the schema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchema(@javax.annotation.Nullable final String value) {
        this.schema = value;
    }
    /**
     * Sets the schemaType property value. Schema type
     * @param value Value to set for the schemaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaType(@javax.annotation.Nullable final ServiceSchemaRegistrySubjectVersionPostRequestBodySchemaType value) {
        this.schemaType = value;
    }
}
