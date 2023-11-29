package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaMirrorMakerPatchReplicationFlowResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaMirrorMakerPatchReplicationFlowResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceKafkaMirrorMakerPatchReplicationFlowResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Replication flow
     */
    private ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlow replicationFlow;
    /**
     * Instantiates a new ServiceKafkaMirrorMakerPatchReplicationFlowResponse and sets the default values.
     */
    public ServiceKafkaMirrorMakerPatchReplicationFlowResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaMirrorMakerPatchReplicationFlowResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaMirrorMakerPatchReplicationFlowResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceKafkaMirrorMakerPatchReplicationFlowResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaMirrorMakerPatchReplicationFlowResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceKafkaMirrorMakerPatchReplicationFlowResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("replication_flow", (n) -> { this.setReplicationFlow(n.getObjectValue(ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the replication_flow property value. Replication flow
     * @return a ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlow
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlow getReplicationFlow() {
        return this.replicationFlow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("replication_flow", this.getReplicationFlow());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaMirrorMakerPatchReplicationFlowResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the replication_flow property value. Replication flow
     * @param value Value to set for the replication_flow property.
     */
    public void setReplicationFlow(@jakarta.annotation.Nullable final ServiceKafkaMirrorMakerPatchReplicationFlowResponseReplicationFlow value) {
        this.replicationFlow = value;
    }
}
