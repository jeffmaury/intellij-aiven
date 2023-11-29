package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Connector status information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaConnectGetConnectorStatusResponseStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Current status of the connector
     */
    private ServiceKafkaConnectGetConnectorStatusResponseStatusState state;
    /**
     * List of tasks currently running for the connector
     */
    private java.util.List<ServiceKafkaConnectGetConnectorStatusResponseStatusTasks> tasks;
    /**
     * Instantiates a new ServiceKafkaConnectGetConnectorStatusResponseStatus and sets the default values.
     */
    public ServiceKafkaConnectGetConnectorStatusResponseStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectGetConnectorStatusResponseStatus
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaConnectGetConnectorStatusResponseStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectGetConnectorStatusResponseStatus();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceKafkaConnectGetConnectorStatusResponseStatusState.class)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(ServiceKafkaConnectGetConnectorStatusResponseStatusTasks::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. Current status of the connector
     * @return a ServiceKafkaConnectGetConnectorStatusResponseStatusState
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectGetConnectorStatusResponseStatusState getState() {
        return this.state;
    }
    /**
     * Gets the tasks property value. List of tasks currently running for the connector
     * @return a java.util.List<ServiceKafkaConnectGetConnectorStatusResponseStatusTasks>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaConnectGetConnectorStatusResponseStatusTasks> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
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
     * Sets the state property value. Current status of the connector
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceKafkaConnectGetConnectorStatusResponseStatusState value) {
        this.state = value;
    }
    /**
     * Sets the tasks property value. List of tasks currently running for the connector
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaConnectGetConnectorStatusResponseStatusTasks> value) {
        this.tasks = value;
    }
}
