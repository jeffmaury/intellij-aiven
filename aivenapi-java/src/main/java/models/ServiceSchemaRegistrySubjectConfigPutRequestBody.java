package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceSchemaRegistrySubjectConfigPutRequestBody
 */
public class ServiceSchemaRegistrySubjectConfigPutRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Configuration */
    private ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility compatibility;
    /**
     * Instantiates a new ServiceSchemaRegistrySubjectConfigPutRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceSchemaRegistrySubjectConfigPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceSchemaRegistrySubjectConfigPutRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceSchemaRegistrySubjectConfigPutRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceSchemaRegistrySubjectConfigPutRequestBody();
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
     * Gets the compatibility property value. Configuration
     * @return a ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility
     */
    @javax.annotation.Nullable
    public ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility getCompatibility() {
        return this.compatibility;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("compatibility", (n) -> { this.setCompatibility(n.getEnumValue(ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("compatibility", this.getCompatibility());
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
     * Sets the compatibility property value. Configuration
     * @param value Value to set for the compatibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompatibility(@javax.annotation.Nullable final ServiceSchemaRegistrySubjectConfigPutRequestBodyCompatibility value) {
        this.compatibility = value;
    }
}
