package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Topic configuration properties that should not be replicated
     */
    private String configPropertiesExclude;
    /**
     * Emit backward heartbeats enabled
     */
    private Boolean emitBackwardHeartbeatsEnabled;
    /**
     * Emit heartbeats enabled
     */
    private Boolean emitHeartbeatsEnabled;
    /**
     * Is replication flow enabled
     */
    private Boolean enabled;
    /**
     * Offset syncs topic location
     */
    private ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation offsetSyncsTopicLocation;
    /**
     * Replication policy class
     */
    private ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyReplicationPolicyClass replicationPolicyClass;
    /**
     * Sync consumer group offsets
     */
    private Boolean syncGroupOffsetsEnabled;
    /**
     * Frequency of consumer group offset sync
     */
    private Integer syncGroupOffsetsIntervalSeconds;
    /**
     * List of topics and/or regular expressions to replicate.
     */
    private java.util.List<String> topics;
    /**
     * List of topics and/or regular expressions to not replicate.
     */
    private java.util.List<String> topicsBlacklist;
    /**
     * Instantiates a new ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody and sets the default values.
     */
    public ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaMirrorMakerPatchReplicationFlowRequestBody();
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
     * Gets the config_properties_exclude property value. Topic configuration properties that should not be replicated
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConfigPropertiesExclude() {
        return this.configPropertiesExclude;
    }
    /**
     * Gets the emit_backward_heartbeats_enabled property value. Emit backward heartbeats enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEmitBackwardHeartbeatsEnabled() {
        return this.emitBackwardHeartbeatsEnabled;
    }
    /**
     * Gets the emit_heartbeats_enabled property value. Emit heartbeats enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEmitHeartbeatsEnabled() {
        return this.emitHeartbeatsEnabled;
    }
    /**
     * Gets the enabled property value. Is replication flow enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("config_properties_exclude", (n) -> { this.setConfigPropertiesExclude(n.getStringValue()); });
        deserializerMap.put("emit_backward_heartbeats_enabled", (n) -> { this.setEmitBackwardHeartbeatsEnabled(n.getBooleanValue()); });
        deserializerMap.put("emit_heartbeats_enabled", (n) -> { this.setEmitHeartbeatsEnabled(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("offset_syncs_topic_location", (n) -> { this.setOffsetSyncsTopicLocation(n.getEnumValue(ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation::forValue)); });
        deserializerMap.put("replication_policy_class", (n) -> { this.setReplicationPolicyClass(n.getEnumValue(ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyReplicationPolicyClass::forValue)); });
        deserializerMap.put("sync_group_offsets_enabled", (n) -> { this.setSyncGroupOffsetsEnabled(n.getBooleanValue()); });
        deserializerMap.put("sync_group_offsets_interval_seconds", (n) -> { this.setSyncGroupOffsetsIntervalSeconds(n.getIntegerValue()); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topics.blacklist", (n) -> { this.setTopicsBlacklist(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the offset_syncs_topic_location property value. Offset syncs topic location
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation getOffsetSyncsTopicLocation() {
        return this.offsetSyncsTopicLocation;
    }
    /**
     * Gets the replication_policy_class property value. Replication policy class
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyReplicationPolicyClass
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyReplicationPolicyClass getReplicationPolicyClass() {
        return this.replicationPolicyClass;
    }
    /**
     * Gets the sync_group_offsets_enabled property value. Sync consumer group offsets
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSyncGroupOffsetsEnabled() {
        return this.syncGroupOffsetsEnabled;
    }
    /**
     * Gets the sync_group_offsets_interval_seconds property value. Frequency of consumer group offset sync
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSyncGroupOffsetsIntervalSeconds() {
        return this.syncGroupOffsetsIntervalSeconds;
    }
    /**
     * Gets the topics property value. List of topics and/or regular expressions to replicate.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopics() {
        return this.topics;
    }
    /**
     * Gets the topics.blacklist property value. List of topics and/or regular expressions to not replicate.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopicsBlacklist() {
        return this.topicsBlacklist;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("config_properties_exclude", this.getConfigPropertiesExclude());
        writer.writeBooleanValue("emit_backward_heartbeats_enabled", this.getEmitBackwardHeartbeatsEnabled());
        writer.writeBooleanValue("emit_heartbeats_enabled", this.getEmitHeartbeatsEnabled());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("offset_syncs_topic_location", this.getOffsetSyncsTopicLocation());
        writer.writeEnumValue("replication_policy_class", this.getReplicationPolicyClass());
        writer.writeBooleanValue("sync_group_offsets_enabled", this.getSyncGroupOffsetsEnabled());
        writer.writeIntegerValue("sync_group_offsets_interval_seconds", this.getSyncGroupOffsetsIntervalSeconds());
        writer.writeCollectionOfPrimitiveValues("topics", this.getTopics());
        writer.writeCollectionOfPrimitiveValues("topics.blacklist", this.getTopicsBlacklist());
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
     * Sets the config_properties_exclude property value. Topic configuration properties that should not be replicated
     * @param value Value to set for the config_properties_exclude property.
     */
    public void setConfigPropertiesExclude(@jakarta.annotation.Nullable final String value) {
        this.configPropertiesExclude = value;
    }
    /**
     * Sets the emit_backward_heartbeats_enabled property value. Emit backward heartbeats enabled
     * @param value Value to set for the emit_backward_heartbeats_enabled property.
     */
    public void setEmitBackwardHeartbeatsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.emitBackwardHeartbeatsEnabled = value;
    }
    /**
     * Sets the emit_heartbeats_enabled property value. Emit heartbeats enabled
     * @param value Value to set for the emit_heartbeats_enabled property.
     */
    public void setEmitHeartbeatsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.emitHeartbeatsEnabled = value;
    }
    /**
     * Sets the enabled property value. Is replication flow enabled
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the offset_syncs_topic_location property value. Offset syncs topic location
     * @param value Value to set for the offset_syncs_topic_location property.
     */
    public void setOffsetSyncsTopicLocation(@jakarta.annotation.Nullable final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyOffsetSyncsTopicLocation value) {
        this.offsetSyncsTopicLocation = value;
    }
    /**
     * Sets the replication_policy_class property value. Replication policy class
     * @param value Value to set for the replication_policy_class property.
     */
    public void setReplicationPolicyClass(@jakarta.annotation.Nullable final ServiceKafkaMirrorMakerPatchReplicationFlowRequestBodyReplicationPolicyClass value) {
        this.replicationPolicyClass = value;
    }
    /**
     * Sets the sync_group_offsets_enabled property value. Sync consumer group offsets
     * @param value Value to set for the sync_group_offsets_enabled property.
     */
    public void setSyncGroupOffsetsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.syncGroupOffsetsEnabled = value;
    }
    /**
     * Sets the sync_group_offsets_interval_seconds property value. Frequency of consumer group offset sync
     * @param value Value to set for the sync_group_offsets_interval_seconds property.
     */
    public void setSyncGroupOffsetsIntervalSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.syncGroupOffsetsIntervalSeconds = value;
    }
    /**
     * Sets the topics property value. List of topics and/or regular expressions to replicate.
     * @param value Value to set for the topics property.
     */
    public void setTopics(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.topics = value;
    }
    /**
     * Sets the topics.blacklist property value. List of topics and/or regular expressions to not replicate.
     * @param value Value to set for the topics.blacklist property.
     */
    public void setTopicsBlacklist(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.topicsBlacklist = value;
    }
}
