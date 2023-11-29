package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * segment.bytes value, source and synonyms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicGetResponseTopicConfigSegmentBytes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Source of the Kafka topic configuration entry
     */
    private ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSource source;
    /**
     * Configuration synonyms
     */
    private java.util.List<ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSynonyms> synonyms;
    /**
     * segment.bytes
     */
    private Integer value;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicConfigSegmentBytes and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopicConfigSegmentBytes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentBytes
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicConfigSegmentBytes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicConfigSegmentBytes();
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
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSource.class)); });
        deserializerMap.put("synonyms", (n) -> { this.setSynonyms(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSynonyms::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. Source of the Kafka topic configuration entry
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSource
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSource getSource() {
        return this.source;
    }
    /**
     * Gets the synonyms property value. Configuration synonyms
     * @return a java.util.List<ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSynonyms>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSynonyms> getSynonyms() {
        return this.synonyms;
    }
    /**
     * Gets the value property value. segment.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("source", this.getSource());
        writer.writeCollectionOfObjectValues("synonyms", this.getSynonyms());
        writer.writeIntegerValue("value", this.getValue());
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
     * Sets the source property value. Source of the Kafka topic configuration entry
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSource value) {
        this.source = value;
    }
    /**
     * Sets the synonyms property value. Configuration synonyms
     * @param value Value to set for the synonyms property.
     */
    public void setSynonyms(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicConfigSegmentBytesSynonyms> value) {
        this.synonyms = value;
    }
    /**
     * Sets the value property value. segment.bytes
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
