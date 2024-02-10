package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUpdateResponseServiceTopics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * cleanup.policy
     */
    private String cleanupPolicy;
    /**
     * min.insync.replicas
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
     * retention.bytes
     */
    private Integer retentionBytes;
    /**
     * Retention period (hours)
     */
    private Integer retentionHours;
    /**
     * Topic state
     */
    private ServiceUpdateResponseServiceTopicsState state;
    /**
     * Topic name
     */
    private String topicName;
    /**
     * Instantiates a new ServiceUpdateResponseServiceTopics and sets the default values.
     */
    public ServiceUpdateResponseServiceTopics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateResponseServiceTopics
     */
    @jakarta.annotation.Nonnull
    public static ServiceUpdateResponseServiceTopics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateResponseServiceTopics();
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
     * Gets the cleanup_policy property value. cleanup.policy
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCleanupPolicy() {
        return this.cleanupPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cleanup_policy", (n) -> { this.setCleanupPolicy(n.getStringValue()); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("partitions", (n) -> { this.setPartitions(n.getIntegerValue()); });
        deserializerMap.put("replication", (n) -> { this.setReplication(n.getIntegerValue()); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("retention_hours", (n) -> { this.setRetentionHours(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceUpdateResponseServiceTopicsState::forValue)); });
        deserializerMap.put("topic_name", (n) -> { this.setTopicName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the min_insync_replicas property value. min.insync.replicas
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
     * Gets the retention_bytes property value. retention.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRetentionBytes() {
        return this.retentionBytes;
    }
    /**
     * Gets the retention_hours property value. Retention period (hours)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRetentionHours() {
        return this.retentionHours;
    }
    /**
     * Gets the state property value. Topic state
     * @return a ServiceUpdateResponseServiceTopicsState
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceTopicsState getState() {
        return this.state;
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
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeIntegerValue("partitions", this.getPartitions());
        writer.writeIntegerValue("replication", this.getReplication());
        writer.writeIntegerValue("retention_bytes", this.getRetentionBytes());
        writer.writeIntegerValue("retention_hours", this.getRetentionHours());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the cleanup_policy property value. cleanup.policy
     * @param value Value to set for the cleanup_policy property.
     */
    public void setCleanupPolicy(@jakarta.annotation.Nullable final String value) {
        this.cleanupPolicy = value;
    }
    /**
     * Sets the min_insync_replicas property value. min.insync.replicas
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
     * Sets the retention_bytes property value. retention.bytes
     * @param value Value to set for the retention_bytes property.
     */
    public void setRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.retentionBytes = value;
    }
    /**
     * Sets the retention_hours property value. Retention period (hours)
     * @param value Value to set for the retention_hours property.
     */
    public void setRetentionHours(@jakarta.annotation.Nullable final Integer value) {
        this.retentionHours = value;
    }
    /**
     * Sets the state property value. Topic state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceTopicsState value) {
        this.state = value;
    }
    /**
     * Sets the topic_name property value. Topic name
     * @param value Value to set for the topic_name property.
     */
    public void setTopicName(@jakarta.annotation.Nullable final String value) {
        this.topicName = value;
    }
}
