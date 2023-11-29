package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * min.cleanable.dirty.ratio value, source and synonyms
 */
public class ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Source of the Kafka topic configuration entry */
    private ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSource source;
    /** Configuration synonyms */
    private java.util.List<ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSynonyms> synonyms;
    /** min.cleanable.dirty.ratio */
    private Double value;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSource.class)); });
        deserializerMap.put("synonyms", (n) -> { this.setSynonyms(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSynonyms::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. Source of the Kafka topic configuration entry
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSource
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSource getSource() {
        return this.source;
    }
    /**
     * Gets the synonyms property value. Configuration synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSynonyms
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSynonyms> getSynonyms() {
        return this.synonyms;
    }
    /**
     * Gets the value property value. min.cleanable.dirty.ratio
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("source", this.getSource());
        writer.writeCollectionOfObjectValues("synonyms", this.getSynonyms());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the source property value. Source of the Kafka topic configuration entry
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSource value) {
        this.source = value;
    }
    /**
     * Sets the synonyms property value. Configuration synonyms
     * @param value Value to set for the synonyms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynonyms(@javax.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatioSynonyms> value) {
        this.synonyms = value;
    }
    /**
     * Sets the value property value. min.cleanable.dirty.ratio
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Double value) {
        this.value = value;
    }
}
