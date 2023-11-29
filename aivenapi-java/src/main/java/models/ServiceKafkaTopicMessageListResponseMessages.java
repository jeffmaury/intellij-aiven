package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaTopicMessageListResponseMessages implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The message key, formatted according to the embedded format */
    private ServiceKafkaTopicMessageListResponseMessagesKey key;
    /** Offset of the message */
    private Integer offset;
    /** Partition of the message */
    private Integer partition;
    /** The name of the topic */
    private String topic;
    /** The message value, formatted according to the embedded format */
    private ServiceKafkaTopicMessageListResponseMessagesValue value;
    /**
     * Instantiates a new ServiceKafkaTopicMessageListResponseMessages and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListResponseMessages() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageListResponseMessages
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicMessageListResponseMessages createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageListResponseMessages();
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
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListResponseMessagesKey getKey() {
        return this.key;
    }
    /**
     * Gets the offset property value. Offset of the message
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. Partition of the message
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the topic property value. The name of the topic
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopic() {
        return this.topic;
    }
    /**
     * Gets the value property value. The message value, formatted according to the embedded format
     * @return a ServiceKafkaTopicMessageListResponseMessagesValue
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListResponseMessagesValue getValue() {
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
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeStringValue("topic", this.getTopic());
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
     * Sets the key property value. The message key, formatted according to the embedded format
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final ServiceKafkaTopicMessageListResponseMessagesKey value) {
        this.key = value;
    }
    /**
     * Sets the offset property value. Offset of the message
     * @param value Value to set for the offset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffset(@javax.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. Partition of the message
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the topic property value. The name of the topic
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final String value) {
        this.topic = value;
    }
    /**
     * Sets the value property value. The message value, formatted according to the embedded format
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final ServiceKafkaTopicMessageListResponseMessagesValue value) {
        this.value = value;
    }
}
