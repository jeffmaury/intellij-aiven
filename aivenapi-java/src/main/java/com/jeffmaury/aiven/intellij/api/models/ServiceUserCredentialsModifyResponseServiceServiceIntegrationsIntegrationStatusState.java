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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Errors
     */
    private java.util.List<String> errors;
    /**
     * Most likely cause of the errors
     */
    private ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause likelyErrorCause;
    /**
     * Nodes
     */
    private ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateNodes nodes;
    /**
     * Service integration status
     */
    private ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateStatus status;
    /**
     * Instantiates a new ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState and sets the default values.
     */
    public ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusState();
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
     * Gets the errors property value. Errors
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("likely_error_cause", (n) -> { this.setLikelyErrorCause(n.getEnumValue(ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause::forValue)); });
        deserializerMap.put("nodes", (n) -> { this.setNodes(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateNodes::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the likely_error_cause property value. Most likely cause of the errors
     * @return a ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause getLikelyErrorCause() {
        return this.likelyErrorCause;
    }
    /**
     * Gets the nodes property value. Nodes
     * @return a ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateNodes
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateNodes getNodes() {
        return this.nodes;
    }
    /**
     * Gets the status property value. Service integration status
     * @return a ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateStatus
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeEnumValue("likely_error_cause", this.getLikelyErrorCause());
        writer.writeObjectValue("nodes", this.getNodes());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the errors property value. Errors
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.errors = value;
    }
    /**
     * Sets the likely_error_cause property value. Most likely cause of the errors
     * @param value Value to set for the likely_error_cause property.
     */
    public void setLikelyErrorCause(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateLikelyErrorCause value) {
        this.likelyErrorCause = value;
    }
    /**
     * Sets the nodes property value. Nodes
     * @param value Value to set for the nodes property.
     */
    public void setNodes(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateNodes value) {
        this.nodes = value;
    }
    /**
     * Sets the status property value. Service integration status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceServiceIntegrationsIntegrationStatusStateStatus value) {
        this.status = value;
    }
}
