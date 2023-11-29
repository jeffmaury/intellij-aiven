package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaConnectGetConnectorStatusResponseStatusTasks implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Task identifier */
    private Integer id;
    /** Current status of the task */
    private ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState state;
    /** Task error information */
    private String trace;
    /**
     * Instantiates a new ServiceKafkaConnectGetConnectorStatusResponseStatusTasks and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorStatusResponseStatusTasks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectGetConnectorStatusResponseStatusTasks
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaConnectGetConnectorStatusResponseStatusTasks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectGetConnectorStatusResponseStatusTasks();
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
        deserializerMap.put("id", (n) -> { this.setId(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState.class)); });
        deserializerMap.put("trace", (n) -> { this.setTrace(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Task identifier
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getId() {
        return this.id;
    }
    /**
     * Gets the state property value. Current status of the task
     * @return a ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState getState() {
        return this.state;
    }
    /**
     * Gets the trace property value. Task error information
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrace() {
        return this.trace;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("id", this.getId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("trace", this.getTrace());
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
     * Sets the id property value. Task identifier
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final Integer value) {
        this.id = value;
    }
    /**
     * Sets the state property value. Current status of the task
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServiceKafkaConnectGetConnectorStatusResponseStatusTasksState value) {
        this.state = value;
    }
    /**
     * Sets the trace property value. Task error information
     * @param value Value to set for the trace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrace(@javax.annotation.Nullable final String value) {
        this.trace = value;
    }
}
