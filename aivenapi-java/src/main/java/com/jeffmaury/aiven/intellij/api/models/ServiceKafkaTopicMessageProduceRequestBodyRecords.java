package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaTopicMessageProduceRequestBodyRecords implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Key for the produced record */
    private ServiceKafkaTopicMessageProduceRequestBodyRecordsKey key;
    /** Optionally specify the partition where to produce the record */
    private Integer partition;
    /** Value for the produced record */
    private ServiceKafkaTopicMessageProduceRequestBodyRecordsValue value;
    /**
     * Instantiates a new ServiceKafkaTopicMessageProduceRequestBodyRecords and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBodyRecords() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageProduceRequestBodyRecords
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicMessageProduceRequestBodyRecords createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageProduceRequestBodyRecords();
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
        deserializerMap.put("key", (n) -> { this.setKey(n.getObjectValue(ServiceKafkaTopicMessageProduceRequestBodyRecordsKey::createFromDiscriminatorValue)); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(ServiceKafkaTopicMessageProduceRequestBodyRecordsValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. Key for the produced record
     * @return a ServiceKafkaTopicMessageProduceRequestBodyRecordsKey
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBodyRecordsKey getKey() {
        return this.key;
    }
    /**
     * Gets the partition property value. Optionally specify the partition where to produce the record
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the value property value. Value for the produced record
     * @return a ServiceKafkaTopicMessageProduceRequestBodyRecordsValue
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBodyRecordsValue getValue() {
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
        writer.writeObjectValue("key", this.getKey());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeObjectValue("value", this.getValue());
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
     * Sets the key property value. Key for the produced record
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final ServiceKafkaTopicMessageProduceRequestBodyRecordsKey value) {
        this.key = value;
    }
    /**
     * Sets the partition property value. Optionally specify the partition where to produce the record
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the value property value. Value for the produced record
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final ServiceKafkaTopicMessageProduceRequestBodyRecordsValue value) {
        this.value = value;
    }
}
