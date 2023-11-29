package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaTopicUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Kafka topic configuration
     */
    private ServiceKafkaTopicUpdateRequestBodyConfig config;
    /**
     * DEPRECATED: use config.min_insync_replicas
     */
    private Integer minInsyncReplicas;
    /**
     * Number of partitions
     */
    private Integer partitions;
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
     * Topic tags
     */
    private java.util.List<ServiceKafkaTopicUpdateRequestBodyTags> tags;
    /**
     * Instantiates a new ServiceKafkaTopicUpdateRequestBody and sets the default values.
     */
    public ServiceKafkaTopicUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicUpdateRequestBody();
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
     * Gets the config property value. Kafka topic configuration
     * @return a ServiceKafkaTopicUpdateRequestBodyConfig
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateRequestBodyConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(ServiceKafkaTopicUpdateRequestBodyConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getIntegerValue()); });
        deserializerMap.put("replication", (n) -> { this.setReplication(n.getIntegerValue()); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("retention_hours", (n) -> { this.setRetentionHours(n.getIntegerValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(ServiceKafkaTopicUpdateRequestBodyTags::createFromDiscriminatorValue)); });
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
     * Gets the partitions property value. Number of partitions
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPartitions() {
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
     * Gets the tags property value. Topic tags
     * @return a java.util.List<ServiceKafkaTopicUpdateRequestBodyTags>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicUpdateRequestBodyTags> getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("config", this.getConfig());
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeIntegerValue("partitions", this.getPartitions());
        writer.writeIntegerValue("replication", this.getReplication());
        writer.writeIntegerValue("retention_bytes", this.getRetentionBytes());
        writer.writeIntegerValue("retention_hours", this.getRetentionHours());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
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
     * Sets the config property value. Kafka topic configuration
     * @param value Value to set for the config property.
     */
    public void setConfig(@jakarta.annotation.Nullable final ServiceKafkaTopicUpdateRequestBodyConfig value) {
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
     * Sets the partitions property value. Number of partitions
     * @param value Value to set for the partitions property.
     */
    public void setPartitions(@jakarta.annotation.Nullable final Integer value) {
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
     * Sets the tags property value. Topic tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicUpdateRequestBodyTags> value) {
        this.tags = value;
    }
}
