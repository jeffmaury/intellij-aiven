package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceOpenSearchIndexListResponseIndexes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String createTime;
    /** Number of documents in index. -1 means not available. */
    private Integer docs;
    /** Index health */
    private ServiceOpenSearchIndexListResponseIndexesHealth health;
    /** Index name */
    private String indexName;
    /** Number of replicas for an index */
    private Integer numberOfReplicas;
    /** Number of shards in an index */
    private Integer numberOfShards;
    /** Whether an index is set as read-only (but allows deletion). null means unknown. */
    private Boolean readOnlyAllowDelete;
    /** Index replication */
    private ServiceOpenSearchIndexListResponseIndexesReplication replication;
    /** Index size in bytes. -1 means not available. */
    private Integer size;
    /** Index status */
    private ServiceOpenSearchIndexListResponseIndexesStatus status;
    /**
     * Instantiates a new ServiceOpenSearchIndexListResponseIndexes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchIndexListResponseIndexes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchIndexListResponseIndexes
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchIndexListResponseIndexes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchIndexListResponseIndexes();
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
     * Gets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the docs property value. Number of documents in index. -1 means not available.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDocs() {
        return this.docs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("docs", (n) -> { this.setDocs(n.getIntegerValue()); });
        deserializerMap.put("health", (n) -> { this.setHealth(n.getEnumValue(ServiceOpenSearchIndexListResponseIndexesHealth.class)); });
        deserializerMap.put("index_name", (n) -> { this.setIndexName(n.getStringValue()); });
        deserializerMap.put("number_of_replicas", (n) -> { this.setNumberOfReplicas(n.getIntegerValue()); });
        deserializerMap.put("number_of_shards", (n) -> { this.setNumberOfShards(n.getIntegerValue()); });
        deserializerMap.put("read_only_allow_delete", (n) -> { this.setReadOnlyAllowDelete(n.getBooleanValue()); });
        deserializerMap.put("replication", (n) -> { this.setReplication(n.getObjectValue(ServiceOpenSearchIndexListResponseIndexesReplication::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceOpenSearchIndexListResponseIndexesStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the health property value. Index health
     * @return a ServiceOpenSearchIndexListResponseIndexesHealth
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchIndexListResponseIndexesHealth getHealth() {
        return this.health;
    }
    /**
     * Gets the index_name property value. Index name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIndexName() {
        return this.indexName;
    }
    /**
     * Gets the number_of_replicas property value. Number of replicas for an index
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfReplicas() {
        return this.numberOfReplicas;
    }
    /**
     * Gets the number_of_shards property value. Number of shards in an index
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfShards() {
        return this.numberOfShards;
    }
    /**
     * Gets the read_only_allow_delete property value. Whether an index is set as read-only (but allows deletion). null means unknown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReadOnlyAllowDelete() {
        return this.readOnlyAllowDelete;
    }
    /**
     * Gets the replication property value. Index replication
     * @return a ServiceOpenSearchIndexListResponseIndexesReplication
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchIndexListResponseIndexesReplication getReplication() {
        return this.replication;
    }
    /**
     * Gets the size property value. Index size in bytes. -1 means not available.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the status property value. Index status
     * @return a ServiceOpenSearchIndexListResponseIndexesStatus
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchIndexListResponseIndexesStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeIntegerValue("docs", this.getDocs());
        writer.writeEnumValue("health", this.getHealth());
        writer.writeStringValue("index_name", this.getIndexName());
        writer.writeIntegerValue("number_of_replicas", this.getNumberOfReplicas());
        writer.writeIntegerValue("number_of_shards", this.getNumberOfShards());
        writer.writeBooleanValue("read_only_allow_delete", this.getReadOnlyAllowDelete());
        writer.writeObjectValue("replication", this.getReplication());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the docs property value. Number of documents in index. -1 means not available.
     * @param value Value to set for the docs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocs(@javax.annotation.Nullable final Integer value) {
        this.docs = value;
    }
    /**
     * Sets the health property value. Index health
     * @param value Value to set for the health property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealth(@javax.annotation.Nullable final ServiceOpenSearchIndexListResponseIndexesHealth value) {
        this.health = value;
    }
    /**
     * Sets the index_name property value. Index name
     * @param value Value to set for the indexName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndexName(@javax.annotation.Nullable final String value) {
        this.indexName = value;
    }
    /**
     * Sets the number_of_replicas property value. Number of replicas for an index
     * @param value Value to set for the numberOfReplicas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfReplicas(@javax.annotation.Nullable final Integer value) {
        this.numberOfReplicas = value;
    }
    /**
     * Sets the number_of_shards property value. Number of shards in an index
     * @param value Value to set for the numberOfShards property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfShards(@javax.annotation.Nullable final Integer value) {
        this.numberOfShards = value;
    }
    /**
     * Sets the read_only_allow_delete property value. Whether an index is set as read-only (but allows deletion). null means unknown.
     * @param value Value to set for the readOnlyAllowDelete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReadOnlyAllowDelete(@javax.annotation.Nullable final Boolean value) {
        this.readOnlyAllowDelete = value;
    }
    /**
     * Sets the replication property value. Index replication
     * @param value Value to set for the replication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplication(@javax.annotation.Nullable final ServiceOpenSearchIndexListResponseIndexesReplication value) {
        this.replication = value;
    }
    /**
     * Sets the size property value. Index size in bytes. -1 means not available.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the status property value. Index status
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ServiceOpenSearchIndexListResponseIndexesStatus value) {
        this.status = value;
    }
}
