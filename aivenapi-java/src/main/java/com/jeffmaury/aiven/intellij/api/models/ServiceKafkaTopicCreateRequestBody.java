package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaTopicCreateRequestBody
 */
public class ServiceKafkaTopicCreateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** DEPRECATED: use config.cleanup_policy */
    private ServiceKafkaTopicCreateRequestBodyCleanupPolicy cleanupPolicy;
    /** Kafka topic configuration */
    private ServiceKafkaTopicCreateRequestBodyConfig config;
    /** DEPRECATED: use config.min_insync_replicas */
    private Integer minInsyncReplicas;
    /** Number of partitions */
    private Integer partitions;
    /** Number of replicas */
    private Integer replication;
    /** DEPRECATED: use config.retention_bytes */
    private Integer retentionBytes;
    /** DEPRECATED: use config.retention_ms */
    private Integer retentionHours;
    /** Topic tags */
    private java.util.List<ServiceKafkaTopicCreateRequestBodyTags> tags;
    /** Topic name */
    private String topicName;
    /**
     * Instantiates a new ServiceKafkaTopicCreateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicCreateRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicCreateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicCreateRequestBody();
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
     * Gets the cleanup_policy property value. DEPRECATED: use config.cleanup_policy
     * @return a ServiceKafkaTopicCreateRequestBodyCleanupPolicy
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicCreateRequestBodyCleanupPolicy getCleanupPolicy() {
        return this.cleanupPolicy;
    }
    /**
     * Gets the config property value. Kafka topic configuration
     * @return a ServiceKafkaTopicCreateRequestBodyConfig
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicCreateRequestBodyConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("cleanup_policy", (n) -> { this.setCleanupPolicy(n.getEnumValue(ServiceKafkaTopicCreateRequestBodyCleanupPolicy.class)); });
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(ServiceKafkaTopicCreateRequestBodyConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getIntegerValue()); });
        deserializerMap.put("replication", (n) -> { this.setReplication(n.getIntegerValue()); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("retention_hours", (n) -> { this.setRetentionHours(n.getIntegerValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(ServiceKafkaTopicCreateRequestBodyTags::createFromDiscriminatorValue)); });
        deserializerMap.put("topic_name", (n) -> { this.setTopicName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the min_insync_replicas property value. DEPRECATED: use config.min_insync_replicas
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }
    /**
     * Gets the partitions property value. Number of partitions
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartitions() {
        return this.partitions;
    }
    /**
     * Gets the replication property value. Number of replicas
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReplication() {
        return this.replication;
    }
    /**
     * Gets the retention_bytes property value. DEPRECATED: use config.retention_bytes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRetentionBytes() {
        return this.retentionBytes;
    }
    /**
     * Gets the retention_hours property value. DEPRECATED: use config.retention_ms
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRetentionHours() {
        return this.retentionHours;
    }
    /**
     * Gets the tags property value. Topic tags
     * @return a ServiceKafkaTopicCreateRequestBodyTags
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceKafkaTopicCreateRequestBodyTags> getTags() {
        return this.tags;
    }
    /**
     * Gets the topic_name property value. Topic name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopicName() {
        return this.topicName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("cleanup_policy", this.getCleanupPolicy());
        writer.writeObjectValue("config", this.getConfig());
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeIntegerValue("partitions", this.getPartitions());
        writer.writeIntegerValue("replication", this.getReplication());
        writer.writeIntegerValue("retention_bytes", this.getRetentionBytes());
        writer.writeIntegerValue("retention_hours", this.getRetentionHours());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
        writer.writeStringValue("topic_name", this.getTopicName());
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
     * Sets the cleanup_policy property value. DEPRECATED: use config.cleanup_policy
     * @param value Value to set for the cleanupPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCleanupPolicy(@javax.annotation.Nullable final ServiceKafkaTopicCreateRequestBodyCleanupPolicy value) {
        this.cleanupPolicy = value;
    }
    /**
     * Sets the config property value. Kafka topic configuration
     * @param value Value to set for the config property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfig(@javax.annotation.Nullable final ServiceKafkaTopicCreateRequestBodyConfig value) {
        this.config = value;
    }
    /**
     * Sets the min_insync_replicas property value. DEPRECATED: use config.min_insync_replicas
     * @param value Value to set for the minInsyncReplicas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinInsyncReplicas(@javax.annotation.Nullable final Integer value) {
        this.minInsyncReplicas = value;
    }
    /**
     * Sets the partitions property value. Number of partitions
     * @param value Value to set for the partitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartitions(@javax.annotation.Nullable final Integer value) {
        this.partitions = value;
    }
    /**
     * Sets the replication property value. Number of replicas
     * @param value Value to set for the replication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplication(@javax.annotation.Nullable final Integer value) {
        this.replication = value;
    }
    /**
     * Sets the retention_bytes property value. DEPRECATED: use config.retention_bytes
     * @param value Value to set for the retentionBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetentionBytes(@javax.annotation.Nullable final Integer value) {
        this.retentionBytes = value;
    }
    /**
     * Sets the retention_hours property value. DEPRECATED: use config.retention_ms
     * @param value Value to set for the retentionHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetentionHours(@javax.annotation.Nullable final Integer value) {
        this.retentionHours = value;
    }
    /**
     * Sets the tags property value. Topic tags
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<ServiceKafkaTopicCreateRequestBodyTags> value) {
        this.tags = value;
    }
    /**
     * Sets the topic_name property value. Topic name
     * @param value Value to set for the topicName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopicName(@javax.annotation.Nullable final String value) {
        this.topicName = value;
    }
}
