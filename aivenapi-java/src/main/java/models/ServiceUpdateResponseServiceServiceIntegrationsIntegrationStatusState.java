package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service integration state
 */
public class ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Errors */
    private java.util.List<String> errors;
    /** Most likely cause of the errors */
    private ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause likelyErrorCause;
    /** Nodes */
    private ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateNodes nodes;
    /** Service integration status */
    private ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateStatus status;
    /**
     * Instantiates a new ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState
     */
    @javax.annotation.Nonnull
    public static ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusState();
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
     * Gets the errors property value. Errors
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("likely_error_cause", (n) -> { this.setLikelyErrorCause(n.getEnumValue(ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause.class)); });
        deserializerMap.put("nodes", (n) -> { this.setNodes(n.getObjectValue(ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateNodes::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the likely_error_cause property value. Most likely cause of the errors
     * @return a ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause
     */
    @javax.annotation.Nullable
    public ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause getLikelyErrorCause() {
        return this.likelyErrorCause;
    }
    /**
     * Gets the nodes property value. Nodes
     * @return a ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateNodes
     */
    @javax.annotation.Nullable
    public ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateNodes getNodes() {
        return this.nodes;
    }
    /**
     * Gets the status property value. Service integration status
     * @return a ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateStatus
     */
    @javax.annotation.Nullable
    public ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateStatus getStatus() {
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
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeEnumValue("likely_error_cause", this.getLikelyErrorCause());
        writer.writeObjectValue("nodes", this.getNodes());
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
     * Sets the errors property value. Errors
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<String> value) {
        this.errors = value;
    }
    /**
     * Sets the likely_error_cause property value. Most likely cause of the errors
     * @param value Value to set for the likelyErrorCause property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLikelyErrorCause(@javax.annotation.Nullable final ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause value) {
        this.likelyErrorCause = value;
    }
    /**
     * Sets the nodes property value. Nodes
     * @param value Value to set for the nodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodes(@javax.annotation.Nullable final ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateNodes value) {
        this.nodes = value;
    }
    /**
     * Sets the status property value. Service integration status
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ServiceUpdateResponseServiceServiceIntegrationsIntegrationStatusStateStatus value) {
        this.status = value;
    }
}
