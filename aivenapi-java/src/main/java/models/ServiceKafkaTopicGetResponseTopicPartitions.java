package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaTopicGetResponseTopicPartitions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of Kafka consumer groups */
    private java.util.List<ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups> consumerGroups;
    /** Earliest partition message offset */
    private Integer earliestOffset;
    /** Number of In Sync Replicas (ISR) */
    private Integer isr;
    /** Latest partition message offset */
    private Integer latestOffset;
    /** Partition number */
    private Integer partition;
    /** Size of partition in bytes */
    private Integer size;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicPartitions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicPartitions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicPartitions
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicPartitions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicPartitions();
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
     * Gets the consumer_groups property value. List of Kafka consumer groups
     * @return a ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups> getConsumerGroups() {
        return this.consumerGroups;
    }
    /**
     * Gets the earliest_offset property value. Earliest partition message offset
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEarliestOffset() {
        return this.earliestOffset;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("consumer_groups", (n) -> { this.setConsumerGroups(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups::createFromDiscriminatorValue)); });
        deserializerMap.put("earliest_offset", (n) -> { this.setEarliestOffset(n.getIntegerValue()); });
        deserializerMap.put("isr", (n) -> { this.setIsr(n.getIntegerValue()); });
        deserializerMap.put("latest_offset", (n) -> { this.setLatestOffset(n.getIntegerValue()); });
        deserializerMap.put("partition", (n) -> { this.setPartition(n.getIntegerValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isr property value. Number of In Sync Replicas (ISR)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIsr() {
        return this.isr;
    }
    /**
     * Gets the latest_offset property value. Latest partition message offset
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLatestOffset() {
        return this.latestOffset;
    }
    /**
     * Gets the partition property value. Partition number
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartition() {
        return this.partition;
    }
    /**
     * Gets the size property value. Size of partition in bytes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("consumer_groups", this.getConsumerGroups());
        writer.writeIntegerValue("earliest_offset", this.getEarliestOffset());
        writer.writeIntegerValue("isr", this.getIsr());
        writer.writeIntegerValue("latest_offset", this.getLatestOffset());
        writer.writeIntegerValue("partition", this.getPartition());
        writer.writeIntegerValue("size", this.getSize());
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
     * Sets the consumer_groups property value. List of Kafka consumer groups
     * @param value Value to set for the consumerGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsumerGroups(@javax.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups> value) {
        this.consumerGroups = value;
    }
    /**
     * Sets the earliest_offset property value. Earliest partition message offset
     * @param value Value to set for the earliestOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEarliestOffset(@javax.annotation.Nullable final Integer value) {
        this.earliestOffset = value;
    }
    /**
     * Sets the isr property value. Number of In Sync Replicas (ISR)
     * @param value Value to set for the isr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsr(@javax.annotation.Nullable final Integer value) {
        this.isr = value;
    }
    /**
     * Sets the latest_offset property value. Latest partition message offset
     * @param value Value to set for the latestOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatestOffset(@javax.annotation.Nullable final Integer value) {
        this.latestOffset = value;
    }
    /**
     * Sets the partition property value. Partition number
     * @param value Value to set for the partition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartition(@javax.annotation.Nullable final Integer value) {
        this.partition = value;
    }
    /**
     * Sets the size property value. Size of partition in bytes
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this.size = value;
    }
}
