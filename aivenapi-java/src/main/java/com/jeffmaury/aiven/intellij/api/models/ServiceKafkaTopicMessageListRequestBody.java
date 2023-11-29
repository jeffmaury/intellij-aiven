package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaTopicMessageListRequestBody
 */
public class ServiceKafkaTopicMessageListRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The format of consumed messages, which is used to convert messages into a JSON-compatible form. If unspecified, defaults to binary */
    private ServiceKafkaTopicMessageListRequestBodyFormat format;
    /** The maximum number of bytes of unencoded keys and values that should be included in the response. This provides approximate control over the size of responses and the amount of memory required to store the decoded response. The actual limit will be the minimum of this setting and the server-side configuration consumer.request.max.bytes. Default is unlimited */
    private Integer maxBytes;
    /** Object of desired partition / offset mappings */
    private ServiceKafkaTopicMessageListRequestBodyPartitions partitions;
    /** The maximum total time to wait for messages for a request if the maximum request size has not yet been reached */
    private Integer timeout;
    /**
     * Instantiates a new ServiceKafkaTopicMessageListRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageListRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicMessageListRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageListRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(ServiceKafkaTopicMessageListRequestBodyFormat.class)); });
        deserializerMap.put("max_bytes", (n) -> { this.setMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getObjectValue(ServiceKafkaTopicMessageListRequestBodyPartitions::createFromDiscriminatorValue)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format of consumed messages, which is used to convert messages into a JSON-compatible form. If unspecified, defaults to binary
     * @return a ServiceKafkaTopicMessageListRequestBodyFormat
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListRequestBodyFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the max_bytes property value. The maximum number of bytes of unencoded keys and values that should be included in the response. This provides approximate control over the size of responses and the amount of memory required to store the decoded response. The actual limit will be the minimum of this setting and the server-side configuration consumer.request.max.bytes. Default is unlimited
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxBytes() {
        return this.maxBytes;
    }
    /**
     * Gets the partitions property value. Object of desired partition / offset mappings
     * @return a ServiceKafkaTopicMessageListRequestBodyPartitions
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageListRequestBodyPartitions getPartitions() {
        return this.partitions;
    }
    /**
     * Gets the timeout property value. The maximum total time to wait for messages for a request if the maximum request size has not yet been reached
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("format", this.getFormat());
        writer.writeIntegerValue("max_bytes", this.getMaxBytes());
        writer.writeObjectValue("partitions", this.getPartitions());
        writer.writeIntegerValue("timeout", this.getTimeout());
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
     * Sets the format property value. The format of consumed messages, which is used to convert messages into a JSON-compatible form. If unspecified, defaults to binary
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final ServiceKafkaTopicMessageListRequestBodyFormat value) {
        this.format = value;
    }
    /**
     * Sets the max_bytes property value. The maximum number of bytes of unencoded keys and values that should be included in the response. This provides approximate control over the size of responses and the amount of memory required to store the decoded response. The actual limit will be the minimum of this setting and the server-side configuration consumer.request.max.bytes. Default is unlimited
     * @param value Value to set for the maxBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxBytes(@javax.annotation.Nullable final Integer value) {
        this.maxBytes = value;
    }
    /**
     * Sets the partitions property value. Object of desired partition / offset mappings
     * @param value Value to set for the partitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartitions(@javax.annotation.Nullable final ServiceKafkaTopicMessageListRequestBodyPartitions value) {
        this.partitions = value;
    }
    /**
     * Sets the timeout property value. The maximum total time to wait for messages for a request if the maximum request size has not yet been reached
     * @param value Value to set for the timeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeout(@javax.annotation.Nullable final Integer value) {
        this.timeout = value;
    }
}
