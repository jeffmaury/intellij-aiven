package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Replication flow
 */
public class ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Topic configuration properties that should not be replicated */
    private String configPropertiesExclude;
    /** Emit backward heartbeats enabled */
    private Boolean emitBackwardHeartbeatsEnabled;
    /** Emit heartbeats enabled */
    private Boolean emitHeartbeatsEnabled;
    /** Is replication flow enabled */
    private Boolean enabled;
    /** Offset syncs topic location */
    private ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowOffsetSyncsTopicLocation offsetSyncsTopicLocation;
    /** Replication policy class */
    private ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass replicationPolicyClass;
    /** Source cluster alias */
    private String sourceCluster;
    /** Sync consumer group offsets */
    private Boolean syncGroupOffsetsEnabled;
    /** Frequency of consumer group offset sync */
    private Integer syncGroupOffsetsIntervalSeconds;
    /** Target cluster alias */
    private String targetCluster;
    /** List of topics and/or regular expressions to replicate. */
    private java.util.List<String> topics;
    /** List of topics and/or regular expressions to not replicate. */
    private java.util.List<String> topicsBlacklist;
    /**
     * Instantiates a new ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlow();
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
     * Gets the config_properties_exclude property value. Topic configuration properties that should not be replicated
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigPropertiesExclude() {
        return this.configPropertiesExclude;
    }
    /**
     * Gets the emit_backward_heartbeats_enabled property value. Emit backward heartbeats enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEmitBackwardHeartbeatsEnabled() {
        return this.emitBackwardHeartbeatsEnabled;
    }
    /**
     * Gets the emit_heartbeats_enabled property value. Emit heartbeats enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEmitHeartbeatsEnabled() {
        return this.emitHeartbeatsEnabled;
    }
    /**
     * Gets the enabled property value. Is replication flow enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("config_properties_exclude", (n) -> { this.setConfigPropertiesExclude(n.getStringValue()); });
        deserializerMap.put("emit_backward_heartbeats_enabled", (n) -> { this.setEmitBackwardHeartbeatsEnabled(n.getBooleanValue()); });
        deserializerMap.put("emit_heartbeats_enabled", (n) -> { this.setEmitHeartbeatsEnabled(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("offset_syncs_topic_location", (n) -> { this.setOffsetSyncsTopicLocation(n.getEnumValue(ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowOffsetSyncsTopicLocation.class)); });
        deserializerMap.put("replication_policy_class", (n) -> { this.setReplicationPolicyClass(n.getEnumValue(ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass.class)); });
        deserializerMap.put("source_cluster", (n) -> { this.setSourceCluster(n.getStringValue()); });
        deserializerMap.put("sync_group_offsets_enabled", (n) -> { this.setSyncGroupOffsetsEnabled(n.getBooleanValue()); });
        deserializerMap.put("sync_group_offsets_interval_seconds", (n) -> { this.setSyncGroupOffsetsIntervalSeconds(n.getIntegerValue()); });
        deserializerMap.put("target_cluster", (n) -> { this.setTargetCluster(n.getStringValue()); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topics.blacklist", (n) -> { this.setTopicsBlacklist(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the offset_syncs_topic_location property value. Offset syncs topic location
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowOffsetSyncsTopicLocation
     */
    @javax.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowOffsetSyncsTopicLocation getOffsetSyncsTopicLocation() {
        return this.offsetSyncsTopicLocation;
    }
    /**
     * Gets the replication_policy_class property value. Replication policy class
     * @return a ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass
     */
    @javax.annotation.Nullable
    public ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass getReplicationPolicyClass() {
        return this.replicationPolicyClass;
    }
    /**
     * Gets the source_cluster property value. Source cluster alias
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceCluster() {
        return this.sourceCluster;
    }
    /**
     * Gets the sync_group_offsets_enabled property value. Sync consumer group offsets
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSyncGroupOffsetsEnabled() {
        return this.syncGroupOffsetsEnabled;
    }
    /**
     * Gets the sync_group_offsets_interval_seconds property value. Frequency of consumer group offset sync
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSyncGroupOffsetsIntervalSeconds() {
        return this.syncGroupOffsetsIntervalSeconds;
    }
    /**
     * Gets the target_cluster property value. Target cluster alias
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetCluster() {
        return this.targetCluster;
    }
    /**
     * Gets the topics property value. List of topics and/or regular expressions to replicate.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTopics() {
        return this.topics;
    }
    /**
     * Gets the topics.blacklist property value. List of topics and/or regular expressions to not replicate.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTopicsBlacklist() {
        return this.topicsBlacklist;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("config_properties_exclude", this.getConfigPropertiesExclude());
        writer.writeBooleanValue("emit_backward_heartbeats_enabled", this.getEmitBackwardHeartbeatsEnabled());
        writer.writeBooleanValue("emit_heartbeats_enabled", this.getEmitHeartbeatsEnabled());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("offset_syncs_topic_location", this.getOffsetSyncsTopicLocation());
        writer.writeEnumValue("replication_policy_class", this.getReplicationPolicyClass());
        writer.writeStringValue("source_cluster", this.getSourceCluster());
        writer.writeBooleanValue("sync_group_offsets_enabled", this.getSyncGroupOffsetsEnabled());
        writer.writeIntegerValue("sync_group_offsets_interval_seconds", this.getSyncGroupOffsetsIntervalSeconds());
        writer.writeStringValue("target_cluster", this.getTargetCluster());
        writer.writeCollectionOfPrimitiveValues("topics", this.getTopics());
        writer.writeCollectionOfPrimitiveValues("topics.blacklist", this.getTopicsBlacklist());
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
     * Sets the config_properties_exclude property value. Topic configuration properties that should not be replicated
     * @param value Value to set for the configPropertiesExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigPropertiesExclude(@javax.annotation.Nullable final String value) {
        this.configPropertiesExclude = value;
    }
    /**
     * Sets the emit_backward_heartbeats_enabled property value. Emit backward heartbeats enabled
     * @param value Value to set for the emitBackwardHeartbeatsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmitBackwardHeartbeatsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.emitBackwardHeartbeatsEnabled = value;
    }
    /**
     * Sets the emit_heartbeats_enabled property value. Emit heartbeats enabled
     * @param value Value to set for the emitHeartbeatsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmitHeartbeatsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.emitHeartbeatsEnabled = value;
    }
    /**
     * Sets the enabled property value. Is replication flow enabled
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the offset_syncs_topic_location property value. Offset syncs topic location
     * @param value Value to set for the offsetSyncsTopicLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffsetSyncsTopicLocation(@javax.annotation.Nullable final ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowOffsetSyncsTopicLocation value) {
        this.offsetSyncsTopicLocation = value;
    }
    /**
     * Sets the replication_policy_class property value. Replication policy class
     * @param value Value to set for the replicationPolicyClass property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplicationPolicyClass(@javax.annotation.Nullable final ServiceKafkaMirrorMakerGetReplicationFlowResponseReplicationFlowReplicationPolicyClass value) {
        this.replicationPolicyClass = value;
    }
    /**
     * Sets the source_cluster property value. Source cluster alias
     * @param value Value to set for the sourceCluster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceCluster(@javax.annotation.Nullable final String value) {
        this.sourceCluster = value;
    }
    /**
     * Sets the sync_group_offsets_enabled property value. Sync consumer group offsets
     * @param value Value to set for the syncGroupOffsetsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncGroupOffsetsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.syncGroupOffsetsEnabled = value;
    }
    /**
     * Sets the sync_group_offsets_interval_seconds property value. Frequency of consumer group offset sync
     * @param value Value to set for the syncGroupOffsetsIntervalSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncGroupOffsetsIntervalSeconds(@javax.annotation.Nullable final Integer value) {
        this.syncGroupOffsetsIntervalSeconds = value;
    }
    /**
     * Sets the target_cluster property value. Target cluster alias
     * @param value Value to set for the targetCluster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetCluster(@javax.annotation.Nullable final String value) {
        this.targetCluster = value;
    }
    /**
     * Sets the topics property value. List of topics and/or regular expressions to replicate.
     * @param value Value to set for the topics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopics(@javax.annotation.Nullable final java.util.List<String> value) {
        this.topics = value;
    }
    /**
     * Sets the topics.blacklist property value. List of topics and/or regular expressions to not replicate.
     * @param value Value to set for the topicsBlacklist property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopicsBlacklist(@javax.annotation.Nullable final java.util.List<String> value) {
        this.topicsBlacklist = value;
    }
}
