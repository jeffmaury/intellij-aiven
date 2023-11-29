package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * cleanup.policy value, source and synonyms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Source of the Kafka topic configuration entry
     */
    private ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySource source;
    /**
     * Configuration synonyms
     */
    private java.util.List<ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySynonyms> synonyms;
    /**
     * cleanup.policy
     */
    private String value;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy();
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
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySource.class)); });
        deserializerMap.put("synonyms", (n) -> { this.setSynonyms(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySynonyms::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. Source of the Kafka topic configuration entry
     * @return a ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySource
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySource getSource() {
        return this.source;
    }
    /**
     * Gets the synonyms property value. Configuration synonyms
     * @return a java.util.List<ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySynonyms>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySynonyms> getSynonyms() {
        return this.synonyms;
    }
    /**
     * Gets the value property value. cleanup.policy
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
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
        writer.writeStringValue("value", this.getValue());
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
    public void setSource(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySource value) {
        this.source = value;
    }
    /**
     * Sets the synonyms property value. Configuration synonyms
     * @param value Value to set for the synonyms property.
     */
    public void setSynonyms(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicConfigCleanupPolicySynonyms> value) {
        this.synonyms = value;
    }
    /**
     * Sets the value property value. cleanup.policy
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
