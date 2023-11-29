package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListPublicServiceTypesResponseServiceTypesANYServicePlans implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Backup configuration for this service plan */
    private ListPublicServiceTypesResponseServiceTypesANYServicePlansBackupConfig backupConfig;
    /** Maximum amount of system memory as a percentage (0-100) the service can actually use after taking into account management overhead. This is relevant for memory bound services for which some service management operations require allocating proportional amount of memory on top the basic load. */
    private Integer maxMemoryPercent;
    /** Number of nodes in this service plan */
    private Integer nodeCount;
    /** Service plan hourly price per cloud region */
    private ListPublicServiceTypesResponseServiceTypesANYServicePlansRegions regions;
    /** Subscription plan */
    private String servicePlan;
    /** Service type code */
    private String serviceType;
    /** Number of shards in this service plan */
    private Integer shardCount;
    /**
     * Instantiates a new ListPublicServiceTypesResponseServiceTypesANYServicePlans and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListPublicServiceTypesResponseServiceTypesANYServicePlans() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListPublicServiceTypesResponseServiceTypesANYServicePlans
     */
    @javax.annotation.Nonnull
    public static ListPublicServiceTypesResponseServiceTypesANYServicePlans createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListPublicServiceTypesResponseServiceTypesANYServicePlans();
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
     * Gets the backup_config property value. Backup configuration for this service plan
     * @return a ListPublicServiceTypesResponseServiceTypesANYServicePlansBackupConfig
     */
    @javax.annotation.Nullable
    public ListPublicServiceTypesResponseServiceTypesANYServicePlansBackupConfig getBackupConfig() {
        return this.backupConfig;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("backup_config", (n) -> { this.setBackupConfig(n.getObjectValue(ListPublicServiceTypesResponseServiceTypesANYServicePlansBackupConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("max_memory_percent", (n) -> { this.setMaxMemoryPercent(n.getIntegerValue()); });
        deserializerMap.put("node_count", (n) -> { this.setNodeCount(n.getIntegerValue()); });
        deserializerMap.put("regions", (n) -> { this.setRegions(n.getObjectValue(ListPublicServiceTypesResponseServiceTypesANYServicePlansRegions::createFromDiscriminatorValue)); });
        deserializerMap.put("service_plan", (n) -> { this.setServicePlan(n.getStringValue()); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("shard_count", (n) -> { this.setShardCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_memory_percent property value. Maximum amount of system memory as a percentage (0-100) the service can actually use after taking into account management overhead. This is relevant for memory bound services for which some service management operations require allocating proportional amount of memory on top the basic load.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxMemoryPercent() {
        return this.maxMemoryPercent;
    }
    /**
     * Gets the node_count property value. Number of nodes in this service plan
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Gets the regions property value. Service plan hourly price per cloud region
     * @return a ListPublicServiceTypesResponseServiceTypesANYServicePlansRegions
     */
    @javax.annotation.Nullable
    public ListPublicServiceTypesResponseServiceTypesANYServicePlansRegions getRegions() {
        return this.regions;
    }
    /**
     * Gets the service_plan property value. Subscription plan
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlan() {
        return this.servicePlan;
    }
    /**
     * Gets the service_type property value. Service type code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the shard_count property value. Number of shards in this service plan
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getShardCount() {
        return this.shardCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("backup_config", this.getBackupConfig());
        writer.writeIntegerValue("max_memory_percent", this.getMaxMemoryPercent());
        writer.writeIntegerValue("node_count", this.getNodeCount());
        writer.writeObjectValue("regions", this.getRegions());
        writer.writeStringValue("service_plan", this.getServicePlan());
        writer.writeStringValue("service_type", this.getServiceType());
        writer.writeIntegerValue("shard_count", this.getShardCount());
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
     * Sets the backup_config property value. Backup configuration for this service plan
     * @param value Value to set for the backupConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackupConfig(@javax.annotation.Nullable final ListPublicServiceTypesResponseServiceTypesANYServicePlansBackupConfig value) {
        this.backupConfig = value;
    }
    /**
     * Sets the max_memory_percent property value. Maximum amount of system memory as a percentage (0-100) the service can actually use after taking into account management overhead. This is relevant for memory bound services for which some service management operations require allocating proportional amount of memory on top the basic load.
     * @param value Value to set for the maxMemoryPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxMemoryPercent(@javax.annotation.Nullable final Integer value) {
        this.maxMemoryPercent = value;
    }
    /**
     * Sets the node_count property value. Number of nodes in this service plan
     * @param value Value to set for the nodeCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodeCount(@javax.annotation.Nullable final Integer value) {
        this.nodeCount = value;
    }
    /**
     * Sets the regions property value. Service plan hourly price per cloud region
     * @param value Value to set for the regions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegions(@javax.annotation.Nullable final ListPublicServiceTypesResponseServiceTypesANYServicePlansRegions value) {
        this.regions = value;
    }
    /**
     * Sets the service_plan property value. Subscription plan
     * @param value Value to set for the servicePlan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlan(@javax.annotation.Nullable final String value) {
        this.servicePlan = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the serviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceType(@javax.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the shard_count property value. Number of shards in this service plan
     * @param value Value to set for the shardCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShardCount(@javax.annotation.Nullable final Integer value) {
        this.shardCount = value;
    }
}
