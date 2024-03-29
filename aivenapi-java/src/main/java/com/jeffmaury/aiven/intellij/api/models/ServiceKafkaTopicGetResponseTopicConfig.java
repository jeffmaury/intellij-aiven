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
public class ServiceKafkaTopicGetResponseTopicConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * cleanup.policy value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy cleanupPolicy;
    /**
     * compression.type value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigCompressionType compressionType;
    /**
     * delete.retention.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigDeleteRetentionMs deleteRetentionMs;
    /**
     * file.delete.delay.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigFileDeleteDelayMs fileDeleteDelayMs;
    /**
     * flush.messages value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigFlushMessages flushMessages;
    /**
     * flush.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigFlushMs flushMs;
    /**
     * index.interval.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytes indexIntervalBytes;
    /**
     * local.retention.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigLocalRetentionBytes localRetentionBytes;
    /**
     * local.retention.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigLocalRetentionMs localRetentionMs;
    /**
     * max.compaction.lag.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMaxCompactionLagMs maxCompactionLagMs;
    /**
     * max.message.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMaxMessageBytes maxMessageBytes;
    /**
     * message.downconversion.enable value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMessageDownconversionEnable messageDownconversionEnable;
    /**
     * message.format.version value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMessageFormatVersion messageFormatVersion;
    /**
     * message.timestamp.difference.max.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMessageTimestampDifferenceMaxMs messageTimestampDifferenceMaxMs;
    /**
     * message.timestamp.type value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMessageTimestampType messageTimestampType;
    /**
     * min.cleanable.dirty.ratio value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio minCleanableDirtyRatio;
    /**
     * min.compaction.lag.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMinCompactionLagMs minCompactionLagMs;
    /**
     * min.insync.replicas value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigMinInsyncReplicas minInsyncReplicas;
    /**
     * preallocate value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigPreallocate preallocate;
    /**
     * remote.storage.enable value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigRemoteStorageEnable remoteStorageEnable;
    /**
     * retention.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigRetentionBytes retentionBytes;
    /**
     * retention.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigRetentionMs retentionMs;
    /**
     * segment.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigSegmentBytes segmentBytes;
    /**
     * segment.index.bytes value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytes segmentIndexBytes;
    /**
     * segment.jitter.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigSegmentJitterMs segmentJitterMs;
    /**
     * segment.ms value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigSegmentMs segmentMs;
    /**
     * unclean.leader.election.enable value, source and synonyms
     */
    private ServiceKafkaTopicGetResponseTopicConfigUncleanLeaderElectionEnable uncleanLeaderElectionEnable;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicConfig and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopicConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicConfig
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicConfig();
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
     * Gets the cleanup_policy property value. cleanup.policy value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy getCleanupPolicy() {
        return this.cleanupPolicy;
    }
    /**
     * Gets the compression_type property value. compression.type value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigCompressionType
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigCompressionType getCompressionType() {
        return this.compressionType;
    }
    /**
     * Gets the delete_retention_ms property value. delete.retention.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigDeleteRetentionMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigDeleteRetentionMs getDeleteRetentionMs() {
        return this.deleteRetentionMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("cleanup_policy", (n) -> { this.setCleanupPolicy(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("compression_type", (n) -> { this.setCompressionType(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigCompressionType::createFromDiscriminatorValue)); });
        deserializerMap.put("delete_retention_ms", (n) -> { this.setDeleteRetentionMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigDeleteRetentionMs::createFromDiscriminatorValue)); });
        deserializerMap.put("file_delete_delay_ms", (n) -> { this.setFileDeleteDelayMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigFileDeleteDelayMs::createFromDiscriminatorValue)); });
        deserializerMap.put("flush_messages", (n) -> { this.setFlushMessages(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigFlushMessages::createFromDiscriminatorValue)); });
        deserializerMap.put("flush_ms", (n) -> { this.setFlushMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigFlushMs::createFromDiscriminatorValue)); });
        deserializerMap.put("index_interval_bytes", (n) -> { this.setIndexIntervalBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("local_retention_bytes", (n) -> { this.setLocalRetentionBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigLocalRetentionBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("local_retention_ms", (n) -> { this.setLocalRetentionMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigLocalRetentionMs::createFromDiscriminatorValue)); });
        deserializerMap.put("max_compaction_lag_ms", (n) -> { this.setMaxCompactionLagMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMaxCompactionLagMs::createFromDiscriminatorValue)); });
        deserializerMap.put("max_message_bytes", (n) -> { this.setMaxMessageBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMaxMessageBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("message_downconversion_enable", (n) -> { this.setMessageDownconversionEnable(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMessageDownconversionEnable::createFromDiscriminatorValue)); });
        deserializerMap.put("message_format_version", (n) -> { this.setMessageFormatVersion(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMessageFormatVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("message_timestamp_difference_max_ms", (n) -> { this.setMessageTimestampDifferenceMaxMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMessageTimestampDifferenceMaxMs::createFromDiscriminatorValue)); });
        deserializerMap.put("message_timestamp_type", (n) -> { this.setMessageTimestampType(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMessageTimestampType::createFromDiscriminatorValue)); });
        deserializerMap.put("min_cleanable_dirty_ratio", (n) -> { this.setMinCleanableDirtyRatio(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio::createFromDiscriminatorValue)); });
        deserializerMap.put("min_compaction_lag_ms", (n) -> { this.setMinCompactionLagMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMinCompactionLagMs::createFromDiscriminatorValue)); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigMinInsyncReplicas::createFromDiscriminatorValue)); });
        deserializerMap.put("preallocate", (n) -> { this.setPreallocate(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigPreallocate::createFromDiscriminatorValue)); });
        deserializerMap.put("remote_storage_enable", (n) -> { this.setRemoteStorageEnable(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigRemoteStorageEnable::createFromDiscriminatorValue)); });
        deserializerMap.put("retention_bytes", (n) -> { this.setRetentionBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigRetentionBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("retention_ms", (n) -> { this.setRetentionMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigRetentionMs::createFromDiscriminatorValue)); });
        deserializerMap.put("segment_bytes", (n) -> { this.setSegmentBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigSegmentBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("segment_index_bytes", (n) -> { this.setSegmentIndexBytes(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytes::createFromDiscriminatorValue)); });
        deserializerMap.put("segment_jitter_ms", (n) -> { this.setSegmentJitterMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigSegmentJitterMs::createFromDiscriminatorValue)); });
        deserializerMap.put("segment_ms", (n) -> { this.setSegmentMs(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigSegmentMs::createFromDiscriminatorValue)); });
        deserializerMap.put("unclean_leader_election_enable", (n) -> { this.setUncleanLeaderElectionEnable(n.getObjectValue(ServiceKafkaTopicGetResponseTopicConfigUncleanLeaderElectionEnable::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_delete_delay_ms property value. file.delete.delay.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigFileDeleteDelayMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigFileDeleteDelayMs getFileDeleteDelayMs() {
        return this.fileDeleteDelayMs;
    }
    /**
     * Gets the flush_messages property value. flush.messages value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigFlushMessages
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigFlushMessages getFlushMessages() {
        return this.flushMessages;
    }
    /**
     * Gets the flush_ms property value. flush.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigFlushMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigFlushMs getFlushMs() {
        return this.flushMs;
    }
    /**
     * Gets the index_interval_bytes property value. index.interval.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytes getIndexIntervalBytes() {
        return this.indexIntervalBytes;
    }
    /**
     * Gets the local_retention_bytes property value. local.retention.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigLocalRetentionBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigLocalRetentionBytes getLocalRetentionBytes() {
        return this.localRetentionBytes;
    }
    /**
     * Gets the local_retention_ms property value. local.retention.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigLocalRetentionMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigLocalRetentionMs getLocalRetentionMs() {
        return this.localRetentionMs;
    }
    /**
     * Gets the max_compaction_lag_ms property value. max.compaction.lag.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMaxCompactionLagMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMaxCompactionLagMs getMaxCompactionLagMs() {
        return this.maxCompactionLagMs;
    }
    /**
     * Gets the max_message_bytes property value. max.message.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMaxMessageBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMaxMessageBytes getMaxMessageBytes() {
        return this.maxMessageBytes;
    }
    /**
     * Gets the message_downconversion_enable property value. message.downconversion.enable value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMessageDownconversionEnable
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMessageDownconversionEnable getMessageDownconversionEnable() {
        return this.messageDownconversionEnable;
    }
    /**
     * Gets the message_format_version property value. message.format.version value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMessageFormatVersion
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMessageFormatVersion getMessageFormatVersion() {
        return this.messageFormatVersion;
    }
    /**
     * Gets the message_timestamp_difference_max_ms property value. message.timestamp.difference.max.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMessageTimestampDifferenceMaxMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMessageTimestampDifferenceMaxMs getMessageTimestampDifferenceMaxMs() {
        return this.messageTimestampDifferenceMaxMs;
    }
    /**
     * Gets the message_timestamp_type property value. message.timestamp.type value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMessageTimestampType
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMessageTimestampType getMessageTimestampType() {
        return this.messageTimestampType;
    }
    /**
     * Gets the min_cleanable_dirty_ratio property value. min.cleanable.dirty.ratio value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio getMinCleanableDirtyRatio() {
        return this.minCleanableDirtyRatio;
    }
    /**
     * Gets the min_compaction_lag_ms property value. min.compaction.lag.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinCompactionLagMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMinCompactionLagMs getMinCompactionLagMs() {
        return this.minCompactionLagMs;
    }
    /**
     * Gets the min_insync_replicas property value. min.insync.replicas value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigMinInsyncReplicas
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigMinInsyncReplicas getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }
    /**
     * Gets the preallocate property value. preallocate value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigPreallocate
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigPreallocate getPreallocate() {
        return this.preallocate;
    }
    /**
     * Gets the remote_storage_enable property value. remote.storage.enable value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigRemoteStorageEnable
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigRemoteStorageEnable getRemoteStorageEnable() {
        return this.remoteStorageEnable;
    }
    /**
     * Gets the retention_bytes property value. retention.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigRetentionBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigRetentionBytes getRetentionBytes() {
        return this.retentionBytes;
    }
    /**
     * Gets the retention_ms property value. retention.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigRetentionMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigRetentionMs getRetentionMs() {
        return this.retentionMs;
    }
    /**
     * Gets the segment_bytes property value. segment.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigSegmentBytes getSegmentBytes() {
        return this.segmentBytes;
    }
    /**
     * Gets the segment_index_bytes property value. segment.index.bytes value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytes
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytes getSegmentIndexBytes() {
        return this.segmentIndexBytes;
    }
    /**
     * Gets the segment_jitter_ms property value. segment.jitter.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentJitterMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigSegmentJitterMs getSegmentJitterMs() {
        return this.segmentJitterMs;
    }
    /**
     * Gets the segment_ms property value. segment.ms value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigSegmentMs
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigSegmentMs getSegmentMs() {
        return this.segmentMs;
    }
    /**
     * Gets the unclean_leader_election_enable property value. unclean.leader.election.enable value, source and synonyms
     * @return a ServiceKafkaTopicGetResponseTopicConfigUncleanLeaderElectionEnable
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicGetResponseTopicConfigUncleanLeaderElectionEnable getUncleanLeaderElectionEnable() {
        return this.uncleanLeaderElectionEnable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cleanup_policy", this.getCleanupPolicy());
        writer.writeObjectValue("compression_type", this.getCompressionType());
        writer.writeObjectValue("delete_retention_ms", this.getDeleteRetentionMs());
        writer.writeObjectValue("file_delete_delay_ms", this.getFileDeleteDelayMs());
        writer.writeObjectValue("flush_messages", this.getFlushMessages());
        writer.writeObjectValue("flush_ms", this.getFlushMs());
        writer.writeObjectValue("index_interval_bytes", this.getIndexIntervalBytes());
        writer.writeObjectValue("local_retention_bytes", this.getLocalRetentionBytes());
        writer.writeObjectValue("local_retention_ms", this.getLocalRetentionMs());
        writer.writeObjectValue("max_compaction_lag_ms", this.getMaxCompactionLagMs());
        writer.writeObjectValue("max_message_bytes", this.getMaxMessageBytes());
        writer.writeObjectValue("message_downconversion_enable", this.getMessageDownconversionEnable());
        writer.writeObjectValue("message_format_version", this.getMessageFormatVersion());
        writer.writeObjectValue("message_timestamp_difference_max_ms", this.getMessageTimestampDifferenceMaxMs());
        writer.writeObjectValue("message_timestamp_type", this.getMessageTimestampType());
        writer.writeObjectValue("min_cleanable_dirty_ratio", this.getMinCleanableDirtyRatio());
        writer.writeObjectValue("min_compaction_lag_ms", this.getMinCompactionLagMs());
        writer.writeObjectValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeObjectValue("preallocate", this.getPreallocate());
        writer.writeObjectValue("remote_storage_enable", this.getRemoteStorageEnable());
        writer.writeObjectValue("retention_bytes", this.getRetentionBytes());
        writer.writeObjectValue("retention_ms", this.getRetentionMs());
        writer.writeObjectValue("segment_bytes", this.getSegmentBytes());
        writer.writeObjectValue("segment_index_bytes", this.getSegmentIndexBytes());
        writer.writeObjectValue("segment_jitter_ms", this.getSegmentJitterMs());
        writer.writeObjectValue("segment_ms", this.getSegmentMs());
        writer.writeObjectValue("unclean_leader_election_enable", this.getUncleanLeaderElectionEnable());
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
     * Sets the cleanup_policy property value. cleanup.policy value, source and synonyms
     * @param value Value to set for the cleanup_policy property.
     */
    public void setCleanupPolicy(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigCleanupPolicy value) {
        this.cleanupPolicy = value;
    }
    /**
     * Sets the compression_type property value. compression.type value, source and synonyms
     * @param value Value to set for the compression_type property.
     */
    public void setCompressionType(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigCompressionType value) {
        this.compressionType = value;
    }
    /**
     * Sets the delete_retention_ms property value. delete.retention.ms value, source and synonyms
     * @param value Value to set for the delete_retention_ms property.
     */
    public void setDeleteRetentionMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigDeleteRetentionMs value) {
        this.deleteRetentionMs = value;
    }
    /**
     * Sets the file_delete_delay_ms property value. file.delete.delay.ms value, source and synonyms
     * @param value Value to set for the file_delete_delay_ms property.
     */
    public void setFileDeleteDelayMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigFileDeleteDelayMs value) {
        this.fileDeleteDelayMs = value;
    }
    /**
     * Sets the flush_messages property value. flush.messages value, source and synonyms
     * @param value Value to set for the flush_messages property.
     */
    public void setFlushMessages(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigFlushMessages value) {
        this.flushMessages = value;
    }
    /**
     * Sets the flush_ms property value. flush.ms value, source and synonyms
     * @param value Value to set for the flush_ms property.
     */
    public void setFlushMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigFlushMs value) {
        this.flushMs = value;
    }
    /**
     * Sets the index_interval_bytes property value. index.interval.bytes value, source and synonyms
     * @param value Value to set for the index_interval_bytes property.
     */
    public void setIndexIntervalBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigIndexIntervalBytes value) {
        this.indexIntervalBytes = value;
    }
    /**
     * Sets the local_retention_bytes property value. local.retention.bytes value, source and synonyms
     * @param value Value to set for the local_retention_bytes property.
     */
    public void setLocalRetentionBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigLocalRetentionBytes value) {
        this.localRetentionBytes = value;
    }
    /**
     * Sets the local_retention_ms property value. local.retention.ms value, source and synonyms
     * @param value Value to set for the local_retention_ms property.
     */
    public void setLocalRetentionMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigLocalRetentionMs value) {
        this.localRetentionMs = value;
    }
    /**
     * Sets the max_compaction_lag_ms property value. max.compaction.lag.ms value, source and synonyms
     * @param value Value to set for the max_compaction_lag_ms property.
     */
    public void setMaxCompactionLagMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMaxCompactionLagMs value) {
        this.maxCompactionLagMs = value;
    }
    /**
     * Sets the max_message_bytes property value. max.message.bytes value, source and synonyms
     * @param value Value to set for the max_message_bytes property.
     */
    public void setMaxMessageBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMaxMessageBytes value) {
        this.maxMessageBytes = value;
    }
    /**
     * Sets the message_downconversion_enable property value. message.downconversion.enable value, source and synonyms
     * @param value Value to set for the message_downconversion_enable property.
     */
    public void setMessageDownconversionEnable(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMessageDownconversionEnable value) {
        this.messageDownconversionEnable = value;
    }
    /**
     * Sets the message_format_version property value. message.format.version value, source and synonyms
     * @param value Value to set for the message_format_version property.
     */
    public void setMessageFormatVersion(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMessageFormatVersion value) {
        this.messageFormatVersion = value;
    }
    /**
     * Sets the message_timestamp_difference_max_ms property value. message.timestamp.difference.max.ms value, source and synonyms
     * @param value Value to set for the message_timestamp_difference_max_ms property.
     */
    public void setMessageTimestampDifferenceMaxMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMessageTimestampDifferenceMaxMs value) {
        this.messageTimestampDifferenceMaxMs = value;
    }
    /**
     * Sets the message_timestamp_type property value. message.timestamp.type value, source and synonyms
     * @param value Value to set for the message_timestamp_type property.
     */
    public void setMessageTimestampType(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMessageTimestampType value) {
        this.messageTimestampType = value;
    }
    /**
     * Sets the min_cleanable_dirty_ratio property value. min.cleanable.dirty.ratio value, source and synonyms
     * @param value Value to set for the min_cleanable_dirty_ratio property.
     */
    public void setMinCleanableDirtyRatio(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMinCleanableDirtyRatio value) {
        this.minCleanableDirtyRatio = value;
    }
    /**
     * Sets the min_compaction_lag_ms property value. min.compaction.lag.ms value, source and synonyms
     * @param value Value to set for the min_compaction_lag_ms property.
     */
    public void setMinCompactionLagMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMinCompactionLagMs value) {
        this.minCompactionLagMs = value;
    }
    /**
     * Sets the min_insync_replicas property value. min.insync.replicas value, source and synonyms
     * @param value Value to set for the min_insync_replicas property.
     */
    public void setMinInsyncReplicas(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigMinInsyncReplicas value) {
        this.minInsyncReplicas = value;
    }
    /**
     * Sets the preallocate property value. preallocate value, source and synonyms
     * @param value Value to set for the preallocate property.
     */
    public void setPreallocate(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigPreallocate value) {
        this.preallocate = value;
    }
    /**
     * Sets the remote_storage_enable property value. remote.storage.enable value, source and synonyms
     * @param value Value to set for the remote_storage_enable property.
     */
    public void setRemoteStorageEnable(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigRemoteStorageEnable value) {
        this.remoteStorageEnable = value;
    }
    /**
     * Sets the retention_bytes property value. retention.bytes value, source and synonyms
     * @param value Value to set for the retention_bytes property.
     */
    public void setRetentionBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigRetentionBytes value) {
        this.retentionBytes = value;
    }
    /**
     * Sets the retention_ms property value. retention.ms value, source and synonyms
     * @param value Value to set for the retention_ms property.
     */
    public void setRetentionMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigRetentionMs value) {
        this.retentionMs = value;
    }
    /**
     * Sets the segment_bytes property value. segment.bytes value, source and synonyms
     * @param value Value to set for the segment_bytes property.
     */
    public void setSegmentBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigSegmentBytes value) {
        this.segmentBytes = value;
    }
    /**
     * Sets the segment_index_bytes property value. segment.index.bytes value, source and synonyms
     * @param value Value to set for the segment_index_bytes property.
     */
    public void setSegmentIndexBytes(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigSegmentIndexBytes value) {
        this.segmentIndexBytes = value;
    }
    /**
     * Sets the segment_jitter_ms property value. segment.jitter.ms value, source and synonyms
     * @param value Value to set for the segment_jitter_ms property.
     */
    public void setSegmentJitterMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigSegmentJitterMs value) {
        this.segmentJitterMs = value;
    }
    /**
     * Sets the segment_ms property value. segment.ms value, source and synonyms
     * @param value Value to set for the segment_ms property.
     */
    public void setSegmentMs(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigSegmentMs value) {
        this.segmentMs = value;
    }
    /**
     * Sets the unclean_leader_election_enable property value. unclean.leader.election.enable value, source and synonyms
     * @param value Value to set for the unclean_leader_election_enable property.
     */
    public void setUncleanLeaderElectionEnable(@jakarta.annotation.Nullable final ServiceKafkaTopicGetResponseTopicConfigUncleanLeaderElectionEnable value) {
        this.uncleanLeaderElectionEnable = value;
    }
}
