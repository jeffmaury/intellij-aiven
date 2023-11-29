package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicMessageListResponseMessages implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The message key, formatted according to the embedded format
     */
    private ServiceKafkaTopicMessageListResponseMessagesKey key;
    /**
     * Offset of the message
     */
    private Integer offset;
    /**
     * Partition of the message
     */
    private Integer partition;
    /**
     * The name of the topic
     */
    private String topic;
    /**
     * The message value, formatted according to the embedded format
     */
    private ServiceKafkaTopicMessageListResponseMessagesValue value;
    /**
     * Instantiates a new ServiceKafkaTopicMessageListResponseMessages and sets the default values.
     */
    public ServiceKafkaTopicMessageListResponseMessages() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageListResponseMessages
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicMessageListResponseMessages createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageListResponseMessages();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("key", (n) -> { this.setKey(n.getObjectValue(ServiceKafkaTopicMessageListResponseMessagesKey::createFromDiscriminatorValue)); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(ServiceKafkaTopicMessageListResponseMessagesValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The message key, formatted according to the embedded format
     * @return a ServiceKafkaTopicMessageListResponseMessagesKey
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicMessageListResponseMessagesKey getKey() {
        return this.key;
    }
    /**
     * Gets the offset property value. Offset of the message
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. Partition of the message
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the topic property value. The name of the topic
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopic() {
        return this.topic;
    }
    /**
     * Gets the value property value. The message value, formatted according to the embedded format
     * @return a ServiceKafkaTopicMessageListResponseMessagesValue
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicMessageListResponseMessagesValue getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("key", this.getKey());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeStringValue("topic", this.getTopic());
        writer.writeObjectValue("value", this.getValue());
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
     * Sets the key property value. The message key, formatted according to the embedded format
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final ServiceKafkaTopicMessageListResponseMessagesKey value) {
        this.key = value;
    }
    /**
     * Sets the offset property value. Offset of the message
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. Partition of the message
     * @param value Value to set for the partition property.
     */
    public void setPartition(@jakarta.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the topic property value. The name of the topic
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final String value) {
        this.topic = value;
    }
    /**
     * Sets the value property value. The message value, formatted according to the embedded format
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final ServiceKafkaTopicMessageListResponseMessagesValue value) {
        this.value = value;
    }
}
