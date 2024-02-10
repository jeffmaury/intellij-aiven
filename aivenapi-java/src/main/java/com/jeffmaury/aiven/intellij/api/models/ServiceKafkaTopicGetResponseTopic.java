package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka topic information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicGetResponseTopic implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DEPRECATED: use config.cleanup_policy
     */
    private String cleanupPolicy;
    /**
     * Kafka topic configuration
     */
    private ServiceKafkaTopicGetResponseTopicConfig config;
    /**
     * DEPRECATED: use config.min_insync_replicas
     */
    private Integer minInsyncReplicas;
    /**
     * Topic partitions
     */
    private java.util.List<ServiceKafkaTopicGetResponseTopicPartitions> partitions;
    /**
     * Number of replicas
     */
    private Integer replication;
    /**
     * DEPRECATED: use config.retention_bytes
     */
    private Integer retentionBytes;
    /**
     * DEPRECATED: use config.retention_ms
     */
    private Integer retentionHours;
    /**
     * Topic state
     */
    private ServiceKafkaTopicGetResponseTopicState state;
    /**
     * Topic tags
     */
    private java.util.List<ServiceKafkaTopicGetResponseTopicTags> tags;
    /**
     * Topic name
     */
    private String topicName;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopic and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopic() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopic
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopic createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopic();
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
     * Gets the cleanup_policy property value. DEPRECATED: use config.cleanup_policy
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCleanupPolicy() {
        return this.cleanupPolicy;
    }
    /**
     * Gets the config property value. Kafka topic configuration
     * @return a ServiceKafkaTopicGetResponseTopicConfig
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("cleanup_policy", (n) -> { this.setCleanupPolicy(n.getStringValue()); });
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicPartitions::createFromDiscriminatorValue)); });
        deserializerMap.put("replication", (n) -> { this.setReplication(n.getIntegerValue()); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("retention_hours", (n) -> { this.setRetentionHours(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceKafkaTopicGetResponseTopicState::forValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(ServiceKafkaTopicGetResponseTopicTags::createFromDiscriminatorValue)); });
        deserializerMap.put("topic_name", (n) -> { this.setTopicName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the min_insync_replicas property value. DEPRECATED: use config.min_insync_replicas
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }
    /**
     * Gets the partitions property value. Topic partitions
     * @return a java.util.List<ServiceKafkaTopicGetResponseTopicPartitions>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicPartitions> getPartitions() {
        return this.partitions;
    }
    /**
     * Gets the replication property value. Number of replicas
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReplication() {
        return this.replication;
    }
    /**
     * Gets the retention_bytes property value. DEPRECATED: use config.retention_bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRetentionBytes() {
        return this.retentionBytes;
    }
    /**
     * Gets the retention_hours property value. DEPRECATED: use config.retention_ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRetentionHours() {
        return this.retentionHours;
    }
    /**
     * Gets the state property value. Topic state
     * @return a ServiceKafkaTopicGetResponseTopicState
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicState getState() {
        return this.state;
    }
    /**
     * Gets the tags property value. Topic tags
     * @return a java.util.List<ServiceKafkaTopicGetResponseTopicTags>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicGetResponseTopicTags> getTags() {
        return this.tags;
    }
    /**
     * Gets the topic_name property value. Topic name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopicName() {
        return this.topicName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cleanup_policy", this.getCleanupPolicy());
        writer.writeObjectValue("config", this.getConfig());
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeCollectionOfObjectValues("partitions", this.getPartitions());
        writer.writeIntegerValue("replication", this.getReplication());
        writer.writeIntegerValue("retention_bytes", this.getRetentionBytes());
        writer.writeIntegerValue("retention_hours", this.getRetentionHours());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
        writer.writeStringValue("topic_name", this.getTopicName());
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
     * Sets the cleanup_policy property value. DEPRECATED: use config.cleanup_policy
     * @param value Value to set for the cleanup_policy property.
     */
    public void setCleanupPolicy(@jakarta.annotation.Nullable final String value) {
        this.cleanupPolicy = value;
    }
    /**
     * Sets the config property value. Kafka topic configuration
     * @param value Value to set for the config property.
     */
    public void setConfig(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfig value) {
        this.config = value;
    }
    /**
     * Sets the min_insync_replicas property value. DEPRECATED: use config.min_insync_replicas
     * @param value Value to set for the min_insync_replicas property.
     */
    public void setMinInsyncReplicas(@jakarta.annotation.Nullable final Integer value) {
        this.minInsyncReplicas = value;
    }
    /**
     * Sets the partitions property value. Topic partitions
     * @param value Value to set for the partitions property.
     */
    public void setPartitions(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicPartitions> value) {
        this.partitions = value;
    }
    /**
     * Sets the replication property value. Number of replicas
     * @param value Value to set for the replication property.
     */
    public void setReplication(@jakarta.annotation.Nullable final Integer value) {
        this.replication = value;
    }
    /**
     * Sets the retention_bytes property value. DEPRECATED: use config.retention_bytes
     * @param value Value to set for the retention_bytes property.
     */
    public void setRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.retentionBytes = value;
    }
    /**
     * Sets the retention_hours property value. DEPRECATED: use config.retention_ms
     * @param value Value to set for the retention_hours property.
     */
    public void setRetentionHours(@jakarta.annotation.Nullable final Integer value) {
        this.retentionHours = value;
    }
    /**
     * Sets the state property value. Topic state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicState value) {
        this.state = value;
    }
    /**
     * Sets the tags property value. Topic tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicGetResponseTopicTags> value) {
        this.tags = value;
    }
    /**
     * Sets the topic_name property value. Topic name
     * @param value Value to set for the topic_name property.
     */
    public void setTopicName(@jakarta.annotation.Nullable final String value) {
        this.topicName = value;
    }
}
