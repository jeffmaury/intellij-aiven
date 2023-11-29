package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetResponseServiceNodeStates implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the service node
     */
    private String name;
    /**
     * Extra information regarding the progress for current state
     */
    private java.util.List<ServiceGetResponseServiceNodeStatesProgressUpdates> progressUpdates;
    /**
     * Role of this node. Only returned for a subset of service types
     */
    private ServiceGetResponseServiceNodeStatesRole role;
    /**
     * Shard of this node. Only returned for a subset of service types
     */
    private ServiceGetResponseServiceNodeStatesShard shard;
    /**
     * Current state of the service node
     */
    private ServiceGetResponseServiceNodeStatesState state;
    /**
     * Instantiates a new ServiceGetResponseServiceNodeStates and sets the default values.
     */
    public ServiceGetResponseServiceNodeStates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceNodeStates
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetResponseServiceNodeStates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceNodeStates();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("progress_updates", (n) -> { this.setProgressUpdates(n.getCollectionOfObjectValues(ServiceGetResponseServiceNodeStatesProgressUpdates::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ServiceGetResponseServiceNodeStatesRole.class)); });
        deserializerMap.put("shard", (n) -> { this.setShard(n.getObjectValue(ServiceGetResponseServiceNodeStatesShard::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceGetResponseServiceNodeStatesState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the service node
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the progress_updates property value. Extra information regarding the progress for current state
     * @return a java.util.List<ServiceGetResponseServiceNodeStatesProgressUpdates>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceGetResponseServiceNodeStatesProgressUpdates> getProgressUpdates() {
        return this.progressUpdates;
    }
    /**
     * Gets the role property value. Role of this node. Only returned for a subset of service types
     * @return a ServiceGetResponseServiceNodeStatesRole
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceNodeStatesRole getRole() {
        return this.role;
    }
    /**
     * Gets the shard property value. Shard of this node. Only returned for a subset of service types
     * @return a ServiceGetResponseServiceNodeStatesShard
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceNodeStatesShard getShard() {
        return this.shard;
    }
    /**
     * Gets the state property value. Current state of the service node
     * @return a ServiceGetResponseServiceNodeStatesState
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceNodeStatesState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("progress_updates", this.getProgressUpdates());
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("shard", this.getShard());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the name property value. Name of the service node
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the progress_updates property value. Extra information regarding the progress for current state
     * @param value Value to set for the progress_updates property.
     */
    public void setProgressUpdates(@jakarta.annotation.Nullable final java.util.List<ServiceGetResponseServiceNodeStatesProgressUpdates> value) {
        this.progressUpdates = value;
    }
    /**
     * Sets the role property value. Role of this node. Only returned for a subset of service types
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final ServiceGetResponseServiceNodeStatesRole value) {
        this.role = value;
    }
    /**
     * Sets the shard property value. Shard of this node. Only returned for a subset of service types
     * @param value Value to set for the shard property.
     */
    public void setShard(@jakarta.annotation.Nullable final ServiceGetResponseServiceNodeStatesShard value) {
        this.shard = value;
    }
    /**
     * Sets the state property value. Current state of the service node
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceGetResponseServiceNodeStatesState value) {
        this.state = value;
    }
}
