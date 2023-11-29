package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaConnectListResponseConnectorsTasks implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Related connector name
     */
    private String connector;
    /**
     * Task id / number
     */
    private Integer task;
    /**
     * Instantiates a new ServiceKafkaConnectListResponseConnectorsTasks and sets the default values.
     */
    public ServiceKafkaConnectListResponseConnectorsTasks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectListResponseConnectorsTasks
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaConnectListResponseConnectorsTasks createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectListResponseConnectorsTasks();
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
     * Gets the connector property value. Related connector name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnector() {
        return this.connector;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("connector", (n) -> { this.setConnector(n.getStringValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the task property value. Task id / number
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTask() {
        return this.task;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("connector", this.getConnector());
        writer.writeIntegerValue("task", this.getTask());
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
     * Sets the connector property value. Related connector name
     * @param value Value to set for the connector property.
     */
    public void setConnector(@jakarta.annotation.Nullable final String value) {
        this.connector = value;
    }
    /**
     * Sets the task property value. Task id / number
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final Integer value) {
        this.task = value;
    }
}
