package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Synonym name
     */
    private String name;
    /**
     * Source of the Kafka topic configuration entry
     */
    private ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonymsSource source;
    /**
     * Synonym value
     */
    private Boolean value;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonyms();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonymsSource.class)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Synonym name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the source property value. Source of the Kafka topic configuration entry
     * @return a ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonymsSource
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonymsSource getSource() {
        return this.source;
    }
    /**
     * Gets the value property value. Synonym value
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("source", this.getSource());
        writer.writeBooleanValue("value", this.getValue());
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
     * Sets the name property value. Synonym name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the source property value. Source of the Kafka topic configuration entry
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytesSynonymsSource value) {
        this.source = value;
    }
    /**
     * Sets the value property value. Synonym value
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Boolean value) {
        this.value = value;
    }
}
