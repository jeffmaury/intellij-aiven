package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaConnectCreateConnectorResponseConnectorTasks implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Related connector name */
    private String connector;
    /** Task id / number */
    private Integer task;
    /**
     * Instantiates a new ServiceKafkaConnectCreateConnectorResponseConnectorTasks and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectCreateConnectorResponseConnectorTasks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectCreateConnectorResponseConnectorTasks
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaConnectCreateConnectorResponseConnectorTasks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectCreateConnectorResponseConnectorTasks();
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
     * Gets the connector property value. Related connector name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnector() {
        return this.connector;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("connector", (n) -> { this.setConnector(n.getStringValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the task property value. Task id / number
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTask() {
        return this.task;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("connector", this.getConnector());
        writer.writeIntegerValue("task", this.getTask());
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
     * Sets the connector property value. Related connector name
     * @param value Value to set for the connector property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnector(@javax.annotation.Nullable final String value) {
        this.connector = value;
    }
    /**
     * Sets the task property value. Task id / number
     * @param value Value to set for the task property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTask(@javax.annotation.Nullable final Integer value) {
        this.task = value;
    }
}
