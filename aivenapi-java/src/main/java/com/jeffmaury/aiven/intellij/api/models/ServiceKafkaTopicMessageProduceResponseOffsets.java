package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicMessageProduceResponseOffsets implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An error message describing why the operation failed, or null if it succeeded
     */
    private String error;
    /**
     * An error code classifying the reason this operation failed, or null if it succeeded. 1 = Non-retriable Kafka exception, 2 = Retriable Kafka exception; the message might be sent successfully if retried
     */
    private Integer errorCode;
    /**
     * Offset of the message, or null if publishing the message failed
     */
    private Integer offset;
    /**
     * Partition the message was published to, or null if publishing the message failed
     */
    private Integer partition;
    /**
     * Instantiates a new ServiceKafkaTopicMessageProduceResponseOffsets and sets the default values.
     */
    public ServiceKafkaTopicMessageProduceResponseOffsets() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageProduceResponseOffsets
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicMessageProduceResponseOffsets createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageProduceResponseOffsets();
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
     * Gets the error property value. An error message describing why the operation failed, or null if it succeeded
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * Gets the error_code property value. An error code classifying the reason this operation failed, or null if it succeeded. 1 = Non-retriable Kafka exception, 2 = Retriable Kafka exception; the message might be sent successfully if retried
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("error_code", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offset property value. Offset of the message, or null if publishing the message failed
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the partition property value. Partition the message was published to, or null if publishing the message failed
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeIntegerValue("error_code", this.getErrorCode());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeIntegerValue("partition", this.getPartition());
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
     * Sets the error property value. An error message describing why the operation failed, or null if it succeeded
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the error_code property value. An error code classifying the reason this operation failed, or null if it succeeded. 1 = Non-retriable Kafka exception, 2 = Retriable Kafka exception; the message might be sent successfully if retried
     * @param value Value to set for the error_code property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the offset property value. Offset of the message, or null if publishing the message failed
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the partition property value. Partition the message was published to, or null if publishing the message failed
     * @param value Value to set for the partition property.
     */
    public void setPartition(@jakarta.annotation.Nullable final Integer value) {
        this.partition = value;
    }
}
