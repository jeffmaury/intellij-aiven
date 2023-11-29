package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkCreateApplicationRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkCreateApplicationRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Flink ApplicationVersion
     */
    private ServiceFlinkCreateApplicationRequestBodyApplicationVersion applicationVersion;
    /**
     * Application name
     */
    private String name;
    /**
     * Instantiates a new ServiceFlinkCreateApplicationRequestBody and sets the default values.
     */
    public ServiceFlinkCreateApplicationRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkCreateApplicationRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkCreateApplicationRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkCreateApplicationRequestBody();
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
     * Gets the application_version property value. Flink ApplicationVersion
     * @return a ServiceFlinkCreateApplicationRequestBodyApplicationVersion
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkCreateApplicationRequestBodyApplicationVersion getApplicationVersion() {
        return this.applicationVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("application_version", (n) -> { this.setApplicationVersion(n.getObjectValue(ServiceFlinkCreateApplicationRequestBodyApplicationVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Application name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application_version", this.getApplicationVersion());
        writer.writeStringValue("name", this.getName());
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
     * Sets the application_version property value. Flink ApplicationVersion
     * @param value Value to set for the application_version property.
     */
    public void setApplicationVersion(@jakarta.annotation.Nullable final ServiceFlinkCreateApplicationRequestBodyApplicationVersion value) {
        this.applicationVersion = value;
    }
    /**
     * Sets the name property value. Application name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
