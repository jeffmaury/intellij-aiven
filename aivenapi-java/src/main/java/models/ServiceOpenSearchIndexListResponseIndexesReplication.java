package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Index replication
 */
public class ServiceOpenSearchIndexListResponseIndexesReplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Leader index name */
    private String leaderIndex;
    /** Leader project name */
    private String leaderProject;
    /** Leader service name */
    private String leaderService;
    /**
     * Instantiates a new ServiceOpenSearchIndexListResponseIndexesReplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchIndexListResponseIndexesReplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchIndexListResponseIndexesReplication
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchIndexListResponseIndexesReplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchIndexListResponseIndexesReplication();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("leader_index", (n) -> { this.setLeaderIndex(n.getStringValue()); });
        deserializerMap.put("leader_project", (n) -> { this.setLeaderProject(n.getStringValue()); });
        deserializerMap.put("leader_service", (n) -> { this.setLeaderService(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leader_index property value. Leader index name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLeaderIndex() {
        return this.leaderIndex;
    }
    /**
     * Gets the leader_project property value. Leader project name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLeaderProject() {
        return this.leaderProject;
    }
    /**
     * Gets the leader_service property value. Leader service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLeaderService() {
        return this.leaderService;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("leader_index", this.getLeaderIndex());
        writer.writeStringValue("leader_project", this.getLeaderProject());
        writer.writeStringValue("leader_service", this.getLeaderService());
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
     * Sets the leader_index property value. Leader index name
     * @param value Value to set for the leaderIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeaderIndex(@javax.annotation.Nullable final String value) {
        this.leaderIndex = value;
    }
    /**
     * Sets the leader_project property value. Leader project name
     * @param value Value to set for the leaderProject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeaderProject(@javax.annotation.Nullable final String value) {
        this.leaderProject = value;
    }
    /**
     * Sets the leader_service property value. Leader service name
     * @param value Value to set for the leaderService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeaderService(@javax.annotation.Nullable final String value) {
        this.leaderService = value;
    }
}
