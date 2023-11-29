package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceListResponseServicesNodeStates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Name of the service node */
    private String name;
    /** Extra information regarding the progress for current state */
    private java.util.List<ServiceListResponseServicesNodeStatesProgressUpdates> progressUpdates;
    /** Role of this node. Only returned for a subset of service types */
    private ServiceListResponseServicesNodeStatesRole role;
    /** Shard of this node. Only returned for a subset of service types */
    private ServiceListResponseServicesNodeStatesShard shard;
    /** Current state of the service node */
    private ServiceListResponseServicesNodeStatesState state;
    /**
     * Instantiates a new ServiceListResponseServicesNodeStates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceListResponseServicesNodeStates
     */
    @javax.annotation.Nonnull
    public static ServiceListResponseServicesNodeStates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceListResponseServicesNodeStates();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("progress_updates", (n) -> { this.setProgressUpdates(n.getCollectionOfObjectValues(ServiceListResponseServicesNodeStatesProgressUpdates::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ServiceListResponseServicesNodeStatesRole.class)); });
        deserializerMap.put("shard", (n) -> { this.setShard(n.getObjectValue(ServiceListResponseServicesNodeStatesShard::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceListResponseServicesNodeStatesState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the service node
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the progress_updates property value. Extra information regarding the progress for current state
     * @return a ServiceListResponseServicesNodeStatesProgressUpdates
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceListResponseServicesNodeStatesProgressUpdates> getProgressUpdates() {
        return this.progressUpdates;
    }
    /**
     * Gets the role property value. Role of this node. Only returned for a subset of service types
     * @return a ServiceListResponseServicesNodeStatesRole
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesRole getRole() {
        return this.role;
    }
    /**
     * Gets the shard property value. Shard of this node. Only returned for a subset of service types
     * @return a ServiceListResponseServicesNodeStatesShard
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesShard getShard() {
        return this.shard;
    }
    /**
     * Gets the state property value. Current state of the service node
     * @return a ServiceListResponseServicesNodeStatesState
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesNodeStatesState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("progress_updates", this.getProgressUpdates());
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("shard", this.getShard());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the name property value. Name of the service node
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the progress_updates property value. Extra information regarding the progress for current state
     * @param value Value to set for the progressUpdates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgressUpdates(@javax.annotation.Nullable final java.util.List<ServiceListResponseServicesNodeStatesProgressUpdates> value) {
        this.progressUpdates = value;
    }
    /**
     * Sets the role property value. Role of this node. Only returned for a subset of service types
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final ServiceListResponseServicesNodeStatesRole value) {
        this.role = value;
    }
    /**
     * Sets the shard property value. Shard of this node. Only returned for a subset of service types
     * @param value Value to set for the shard property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShard(@javax.annotation.Nullable final ServiceListResponseServicesNodeStatesShard value) {
        this.shard = value;
    }
    /**
     * Sets the state property value. Current state of the service node
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServiceListResponseServicesNodeStatesState value) {
        this.state = value;
    }
}
