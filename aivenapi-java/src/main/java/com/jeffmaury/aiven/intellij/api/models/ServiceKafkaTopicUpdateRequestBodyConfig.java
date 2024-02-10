package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka topic configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicUpdateRequestBodyConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * cleanup.policy
     */
    private ServiceKafkaTopicUpdateRequestBodyConfigCleanupPolicy cleanupPolicy;
    /**
     * compression.type
     */
    private ServiceKafkaTopicUpdateRequestBodyConfigCompressionType compressionType;
    /**
     * delete.retention.ms
     */
    private Integer deleteRetentionMs;
    /**
     * file.delete.delay.ms
     */
    private Integer fileDeleteDelayMs;
    /**
     * flush.messages
     */
    private Integer flushMessages;
    /**
     * flush.ms
     */
    private Integer flushMs;
    /**
     * index.interval.bytes
     */
    private Integer indexIntervalBytes;
    /**
     * local.retention.bytes
     */
    private Integer localRetentionBytes;
    /**
     * local.retention.ms
     */
    private Integer localRetentionMs;
    /**
     * max.compaction.lag.ms
     */
    private Integer maxCompactionLagMs;
    /**
     * max.message.bytes
     */
    private Integer maxMessageBytes;
    /**
     * message.downconversion.enable
     */
    private Boolean messageDownconversionEnable;
    /**
     * message.format.version
     */
    private ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion messageFormatVersion;
    /**
     * message.timestamp.difference.max.ms
     */
    private Integer messageTimestampDifferenceMaxMs;
    /**
     * message.timestamp.type
     */
    private ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType messageTimestampType;
    /**
     * min.cleanable.dirty.ratio
     */
    private Double minCleanableDirtyRatio;
    /**
     * min.compaction.lag.ms
     */
    private Integer minCompactionLagMs;
    /**
     * min.insync.replicas
     */
    private Integer minInsyncReplicas;
    /**
     * preallocate
     */
    private Boolean preallocate;
    /**
     * remote.storage.enable
     */
    private Boolean remoteStorageEnable;
    /**
     * retention.bytes
     */
    private Integer retentionBytes;
    /**
     * retention.ms
     */
    private Integer retentionMs;
    /**
     * segment.bytes
     */
    private Integer segmentBytes;
    /**
     * segment.index.bytes
     */
    private Integer segmentIndexBytes;
    /**
     * segment.jitter.ms
     */
    private Integer segmentJitterMs;
    /**
     * segment.ms
     */
    private Integer segmentMs;
    /**
     * unclean.leader.election.enable
     */
    private Boolean uncleanLeaderElectionEnable;
    /**
     * Instantiates a new ServiceKafkaTopicUpdateRequestBodyConfig and sets the default values.
     */
    public ServiceKafkaTopicUpdateRequestBodyConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicUpdateRequestBodyConfig
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicUpdateRequestBodyConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicUpdateRequestBodyConfig();
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
     * @return a ServiceKafkaTopicUpdateRequestBodyConfigCleanupPolicy
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateRequestBodyConfigCleanupPolicy getCleanupPolicy() {
        return this.cleanupPolicy;
    }
    /**
     * Gets the compression_type property value. compression.type
     * @return a ServiceKafkaTopicUpdateRequestBodyConfigCompressionType
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateRequestBodyConfigCompressionType getCompressionType() {
        return this.compressionType;
    }
    /**
     * Gets the delete_retention_ms property value. delete.retention.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeleteRetentionMs() {
        return this.deleteRetentionMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("cleanup_policy", (n) -> { this.setCleanupPolicy(n.getEnumValue(ServiceKafkaTopicUpdateRequestBodyConfigCleanupPolicy::forValue)); });
        deserializerMap.put("compression_type", (n) -> { this.setCompressionType(n.getEnumValue(ServiceKafkaTopicUpdateRequestBodyConfigCompressionType::forValue)); });
        deserializerMap.put("delete_retention_ms", (n) -> { this.setDeleteRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("file_delete_delay_ms", (n) -> { this.setFileDeleteDelayMs(n.getIntegerValue()); });
        deserializerMap.put("flush_messages", (n) -> { this.setFlushMessages(n.getIntegerValue()); });
        deserializerMap.put("flush_ms", (n) -> { this.setFlushMs(n.getIntegerValue()); });
        deserializerMap.put("index_interval_bytes", (n) -> { this.setIndexIntervalBytes(n.getIntegerValue()); });
        deserializerMap.put("local_retention_bytes", (n) -> { this.setLocalRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("local_retention_ms", (n) -> { this.setLocalRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("max_compaction_lag_ms", (n) -> { this.setMaxCompactionLagMs(n.getIntegerValue()); });
        deserializerMap.put("max_message_bytes", (n) -> { this.setMaxMessageBytes(n.getIntegerValue()); });
        deserializerMap.put("message_downconversion_enable", (n) -> { this.setMessageDownconversionEnable(n.getBooleanValue()); });
        deserializerMap.put("message_format_version", (n) -> { this.setMessageFormatVersion(n.getEnumValue(ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion::forValue)); });
        deserializerMap.put("message_timestamp_difference_max_ms", (n) -> { this.setMessageTimestampDifferenceMaxMs(n.getIntegerValue()); });
        deserializerMap.put("message_timestamp_type", (n) -> { this.setMessageTimestampType(n.getEnumValue(ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType::forValue)); });
        deserializerMap.put("min_cleanable_dirty_ratio", (n) -> { this.setMinCleanableDirtyRatio(n.getDoubleValue()); });
        deserializerMap.put("min_compaction_lag_ms", (n) -> { this.setMinCompactionLagMs(n.getIntegerValue()); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("preallocate", (n) -> { this.setPreallocate(n.getBooleanValue()); });
        deserializerMap.put("remote_storage_enable", (n) -> { this.setRemoteStorageEnable(n.getBooleanValue()); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("retention_ms", (n) -> { this.setRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("segment_bytes", (n) -> { this.setSegmentBytes(n.getIntegerValue()); });
        deserializerMap.put("segment_index_bytes", (n) -> { this.setSegmentIndexBytes(n.getIntegerValue()); });
        deserializerMap.put("segment_jitter_ms", (n) -> { this.setSegmentJitterMs(n.getIntegerValue()); });
        deserializerMap.put("segment_ms", (n) -> { this.setSegmentMs(n.getIntegerValue()); });
        deserializerMap.put("unclean_leader_election_enable", (n) -> { this.setUncleanLeaderElectionEnable(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file_delete_delay_ms property value. file.delete.delay.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFileDeleteDelayMs() {
        return this.fileDeleteDelayMs;
    }
    /**
     * Gets the flush_messages property value. flush.messages
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFlushMessages() {
        return this.flushMessages;
    }
    /**
     * Gets the flush_ms property value. flush.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFlushMs() {
        return this.flushMs;
    }
    /**
     * Gets the index_interval_bytes property value. index.interval.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndexIntervalBytes() {
        return this.indexIntervalBytes;
    }
    /**
     * Gets the local_retention_bytes property value. local.retention.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLocalRetentionBytes() {
        return this.localRetentionBytes;
    }
    /**
     * Gets the local_retention_ms property value. local.retention.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLocalRetentionMs() {
        return this.localRetentionMs;
    }
    /**
     * Gets the max_compaction_lag_ms property value. max.compaction.lag.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCompactionLagMs() {
        return this.maxCompactionLagMs;
    }
    /**
     * Gets the max_message_bytes property value. max.message.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxMessageBytes() {
        return this.maxMessageBytes;
    }
    /**
     * Gets the message_downconversion_enable property value. message.downconversion.enable
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessageDownconversionEnable() {
        return this.messageDownconversionEnable;
    }
    /**
     * Gets the message_format_version property value. message.format.version
     * @return a ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion getMessageFormatVersion() {
        return this.messageFormatVersion;
    }
    /**
     * Gets the message_timestamp_difference_max_ms property value. message.timestamp.difference.max.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMessageTimestampDifferenceMaxMs() {
        return this.messageTimestampDifferenceMaxMs;
    }
    /**
     * Gets the message_timestamp_type property value. message.timestamp.type
     * @return a ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType getMessageTimestampType() {
        return this.messageTimestampType;
    }
    /**
     * Gets the min_cleanable_dirty_ratio property value. min.cleanable.dirty.ratio
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMinCleanableDirtyRatio() {
        return this.minCleanableDirtyRatio;
    }
    /**
     * Gets the min_compaction_lag_ms property value. min.compaction.lag.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinCompactionLagMs() {
        return this.minCompactionLagMs;
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
     * Gets the preallocate property value. preallocate
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreallocate() {
        return this.preallocate;
    }
    /**
     * Gets the remote_storage_enable property value. remote.storage.enable
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoteStorageEnable() {
        return this.remoteStorageEnable;
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
     * Gets the retention_ms property value. retention.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRetentionMs() {
        return this.retentionMs;
    }
    /**
     * Gets the segment_bytes property value. segment.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSegmentBytes() {
        return this.segmentBytes;
    }
    /**
     * Gets the segment_index_bytes property value. segment.index.bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSegmentIndexBytes() {
        return this.segmentIndexBytes;
    }
    /**
     * Gets the segment_jitter_ms property value. segment.jitter.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSegmentJitterMs() {
        return this.segmentJitterMs;
    }
    /**
     * Gets the segment_ms property value. segment.ms
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSegmentMs() {
        return this.segmentMs;
    }
    /**
     * Gets the unclean_leader_election_enable property value. unclean.leader.election.enable
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUncleanLeaderElectionEnable() {
        return this.uncleanLeaderElectionEnable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("cleanup_policy", this.getCleanupPolicy());
        writer.writeEnumValue("compression_type", this.getCompressionType());
        writer.writeIntegerValue("delete_retention_ms", this.getDeleteRetentionMs());
        writer.writeIntegerValue("file_delete_delay_ms", this.getFileDeleteDelayMs());
        writer.writeIntegerValue("flush_messages", this.getFlushMessages());
        writer.writeIntegerValue("flush_ms", this.getFlushMs());
        writer.writeIntegerValue("index_interval_bytes", this.getIndexIntervalBytes());
        writer.writeIntegerValue("local_retention_bytes", this.getLocalRetentionBytes());
        writer.writeIntegerValue("local_retention_ms", this.getLocalRetentionMs());
        writer.writeIntegerValue("max_compaction_lag_ms", this.getMaxCompactionLagMs());
        writer.writeIntegerValue("max_message_bytes", this.getMaxMessageBytes());
        writer.writeBooleanValue("message_downconversion_enable", this.getMessageDownconversionEnable());
        writer.writeEnumValue("message_format_version", this.getMessageFormatVersion());
        writer.writeIntegerValue("message_timestamp_difference_max_ms", this.getMessageTimestampDifferenceMaxMs());
        writer.writeEnumValue("message_timestamp_type", this.getMessageTimestampType());
        writer.writeDoubleValue("min_cleanable_dirty_ratio", this.getMinCleanableDirtyRatio());
        writer.writeIntegerValue("min_compaction_lag_ms", this.getMinCompactionLagMs());
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeBooleanValue("preallocate", this.getPreallocate());
        writer.writeBooleanValue("remote_storage_enable", this.getRemoteStorageEnable());
        writer.writeIntegerValue("retention_bytes", this.getRetentionBytes());
        writer.writeIntegerValue("retention_ms", this.getRetentionMs());
        writer.writeIntegerValue("segment_bytes", this.getSegmentBytes());
        writer.writeIntegerValue("segment_index_bytes", this.getSegmentIndexBytes());
        writer.writeIntegerValue("segment_jitter_ms", this.getSegmentJitterMs());
        writer.writeIntegerValue("segment_ms", this.getSegmentMs());
        writer.writeBooleanValue("unclean_leader_election_enable", this.getUncleanLeaderElectionEnable());
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
    public void setCleanupPolicy(@jakarta.annotation.Nullable final ServiceKafkaTopicUpdateRequestBodyConfigCleanupPolicy value) {
        this.cleanupPolicy = value;
    }
    /**
     * Sets the compression_type property value. compression.type
     * @param value Value to set for the compression_type property.
     */
    public void setCompressionType(@jakarta.annotation.Nullable final ServiceKafkaTopicUpdateRequestBodyConfigCompressionType value) {
        this.compressionType = value;
    }
    /**
     * Sets the delete_retention_ms property value. delete.retention.ms
     * @param value Value to set for the delete_retention_ms property.
     */
    public void setDeleteRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.deleteRetentionMs = value;
    }
    /**
     * Sets the file_delete_delay_ms property value. file.delete.delay.ms
     * @param value Value to set for the file_delete_delay_ms property.
     */
    public void setFileDeleteDelayMs(@jakarta.annotation.Nullable final Integer value) {
        this.fileDeleteDelayMs = value;
    }
    /**
     * Sets the flush_messages property value. flush.messages
     * @param value Value to set for the flush_messages property.
     */
    public void setFlushMessages(@jakarta.annotation.Nullable final Integer value) {
        this.flushMessages = value;
    }
    /**
     * Sets the flush_ms property value. flush.ms
     * @param value Value to set for the flush_ms property.
     */
    public void setFlushMs(@jakarta.annotation.Nullable final Integer value) {
        this.flushMs = value;
    }
    /**
     * Sets the index_interval_bytes property value. index.interval.bytes
     * @param value Value to set for the index_interval_bytes property.
     */
    public void setIndexIntervalBytes(@jakarta.annotation.Nullable final Integer value) {
        this.indexIntervalBytes = value;
    }
    /**
     * Sets the local_retention_bytes property value. local.retention.bytes
     * @param value Value to set for the local_retention_bytes property.
     */
    public void setLocalRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.localRetentionBytes = value;
    }
    /**
     * Sets the local_retention_ms property value. local.retention.ms
     * @param value Value to set for the local_retention_ms property.
     */
    public void setLocalRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.localRetentionMs = value;
    }
    /**
     * Sets the max_compaction_lag_ms property value. max.compaction.lag.ms
     * @param value Value to set for the max_compaction_lag_ms property.
     */
    public void setMaxCompactionLagMs(@jakarta.annotation.Nullable final Integer value) {
        this.maxCompactionLagMs = value;
    }
    /**
     * Sets the max_message_bytes property value. max.message.bytes
     * @param value Value to set for the max_message_bytes property.
     */
    public void setMaxMessageBytes(@jakarta.annotation.Nullable final Integer value) {
        this.maxMessageBytes = value;
    }
    /**
     * Sets the message_downconversion_enable property value. message.downconversion.enable
     * @param value Value to set for the message_downconversion_enable property.
     */
    public void setMessageDownconversionEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.messageDownconversionEnable = value;
    }
    /**
     * Sets the message_format_version property value. message.format.version
     * @param value Value to set for the message_format_version property.
     */
    public void setMessageFormatVersion(@jakarta.annotation.Nullable final ServiceKafkaTopicUpdateRequestBodyConfigMessageFormatVersion value) {
        this.messageFormatVersion = value;
    }
    /**
     * Sets the message_timestamp_difference_max_ms property value. message.timestamp.difference.max.ms
     * @param value Value to set for the message_timestamp_difference_max_ms property.
     */
    public void setMessageTimestampDifferenceMaxMs(@jakarta.annotation.Nullable final Integer value) {
        this.messageTimestampDifferenceMaxMs = value;
    }
    /**
     * Sets the message_timestamp_type property value. message.timestamp.type
     * @param value Value to set for the message_timestamp_type property.
     */
    public void setMessageTimestampType(@jakarta.annotation.Nullable final ServiceKafkaTopicUpdateRequestBodyConfigMessageTimestampType value) {
        this.messageTimestampType = value;
    }
    /**
     * Sets the min_cleanable_dirty_ratio property value. min.cleanable.dirty.ratio
     * @param value Value to set for the min_cleanable_dirty_ratio property.
     */
    public void setMinCleanableDirtyRatio(@jakarta.annotation.Nullable final Double value) {
        this.minCleanableDirtyRatio = value;
    }
    /**
     * Sets the min_compaction_lag_ms property value. min.compaction.lag.ms
     * @param value Value to set for the min_compaction_lag_ms property.
     */
    public void setMinCompactionLagMs(@jakarta.annotation.Nullable final Integer value) {
        this.minCompactionLagMs = value;
    }
    /**
     * Sets the min_insync_replicas property value. min.insync.replicas
     * @param value Value to set for the min_insync_replicas property.
     */
    public void setMinInsyncReplicas(@jakarta.annotation.Nullable final Integer value) {
        this.minInsyncReplicas = value;
    }
    /**
     * Sets the preallocate property value. preallocate
     * @param value Value to set for the preallocate property.
     */
    public void setPreallocate(@jakarta.annotation.Nullable final Boolean value) {
        this.preallocate = value;
    }
    /**
     * Sets the remote_storage_enable property value. remote.storage.enable
     * @param value Value to set for the remote_storage_enable property.
     */
    public void setRemoteStorageEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.remoteStorageEnable = value;
    }
    /**
     * Sets the retention_bytes property value. retention.bytes
     * @param value Value to set for the retention_bytes property.
     */
    public void setRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.retentionBytes = value;
    }
    /**
     * Sets the retention_ms property value. retention.ms
     * @param value Value to set for the retention_ms property.
     */
    public void setRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.retentionMs = value;
    }
    /**
     * Sets the segment_bytes property value. segment.bytes
     * @param value Value to set for the segment_bytes property.
     */
    public void setSegmentBytes(@jakarta.annotation.Nullable final Integer value) {
        this.segmentBytes = value;
    }
    /**
     * Sets the segment_index_bytes property value. segment.index.bytes
     * @param value Value to set for the segment_index_bytes property.
     */
    public void setSegmentIndexBytes(@jakarta.annotation.Nullable final Integer value) {
        this.segmentIndexBytes = value;
    }
    /**
     * Sets the segment_jitter_ms property value. segment.jitter.ms
     * @param value Value to set for the segment_jitter_ms property.
     */
    public void setSegmentJitterMs(@jakarta.annotation.Nullable final Integer value) {
        this.segmentJitterMs = value;
    }
    /**
     * Sets the segment_ms property value. segment.ms
     * @param value Value to set for the segment_ms property.
     */
    public void setSegmentMs(@jakarta.annotation.Nullable final Integer value) {
        this.segmentMs = value;
    }
    /**
     * Sets the unclean_leader_election_enable property value. unclean.leader.election.enable
     * @param value Value to set for the unclean_leader_election_enable property.
     */
    public void setUncleanLeaderElectionEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.uncleanLeaderElectionEnable = value;
    }
}
