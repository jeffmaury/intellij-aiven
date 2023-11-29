package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Integration status
 */
public class ServiceGetResponseServiceServiceIntegrationsIntegrationStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Service integration state */
    private ServiceGetResponseServiceServiceIntegrationsIntegrationStatusState state;
    /** Integration status description */
    private String statusUserDesc;
    /**
     * Instantiates a new ServiceGetResponseServiceServiceIntegrationsIntegrationStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceGetResponseServiceServiceIntegrationsIntegrationStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceServiceIntegrationsIntegrationStatus
     */
    @javax.annotation.Nonnull
    public static ServiceGetResponseServiceServiceIntegrationsIntegrationStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceServiceIntegrationsIntegrationStatus();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("state", (n) -> { this.setState(n.getObjectValue(ServiceGetResponseServiceServiceIntegrationsIntegrationStatusState::createFromDiscriminatorValue)); });
        deserializerMap.put("status_user_desc", (n) -> { this.setStatusUserDesc(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. Service integration state
     * @return a ServiceGetResponseServiceServiceIntegrationsIntegrationStatusState
     */
    @javax.annotation.Nullable
    public ServiceGetResponseServiceServiceIntegrationsIntegrationStatusState getState() {
        return this.state;
    }
    /**
     * Gets the status_user_desc property value. Integration status description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusUserDesc() {
        return this.statusUserDesc;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("state", this.getState());
        writer.writeStringValue("status_user_desc", this.getStatusUserDesc());
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
     * Sets the state property value. Service integration state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServiceGetResponseServiceServiceIntegrationsIntegrationStatusState value) {
        this.state = value;
    }
    /**
     * Sets the status_user_desc property value. Integration status description
     * @param value Value to set for the statusUserDesc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusUserDesc(@javax.annotation.Nullable final String value) {
        this.statusUserDesc = value;
    }
}
