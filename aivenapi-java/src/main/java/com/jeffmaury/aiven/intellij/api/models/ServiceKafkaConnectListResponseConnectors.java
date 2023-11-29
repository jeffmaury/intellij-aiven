package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaConnectListResponseConnectors implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Connector configuration parameters
     */
    private ServiceKafkaConnectListResponseConnectorsConfig config;
    /**
     * Connector name
     */
    private String name;
    /**
     * Kafka Connector plugin information
     */
    private ServiceKafkaConnectListResponseConnectorsPlugin plugin;
    /**
     * List of tasks of a connector
     */
    private java.util.List<ServiceKafkaConnectListResponseConnectorsTasks> tasks;
    /**
     * Instantiates a new ServiceKafkaConnectListResponseConnectors and sets the default values.
     */
    public ServiceKafkaConnectListResponseConnectors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectListResponseConnectors
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaConnectListResponseConnectors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectListResponseConnectors();
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
     * Gets the config property value. Connector configuration parameters
     * @return a ServiceKafkaConnectListResponseConnectorsConfig
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectListResponseConnectorsConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(ServiceKafkaConnectListResponseConnectorsConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plugin", (n) -> { this.setPlugin(n.getObjectValue(ServiceKafkaConnectListResponseConnectorsPlugin::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(ServiceKafkaConnectListResponseConnectorsTasks::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Connector name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the plugin property value. Kafka Connector plugin information
     * @return a ServiceKafkaConnectListResponseConnectorsPlugin
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaConnectListResponseConnectorsPlugin getPlugin() {
        return this.plugin;
    }
    /**
     * Gets the tasks property value. List of tasks of a connector
     * @return a java.util.List<ServiceKafkaConnectListResponseConnectorsTasks>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaConnectListResponseConnectorsTasks> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("config", this.getConfig());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("plugin", this.getPlugin());
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
     * Sets the config property value. Connector configuration parameters
     * @param value Value to set for the config property.
     */
    public void setConfig(@jakarta.annotation.Nullable final ServiceKafkaConnectListResponseConnectorsConfig value) {
        this.config = value;
    }
    /**
     * Sets the name property value. Connector name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the plugin property value. Kafka Connector plugin information
     * @param value Value to set for the plugin property.
     */
    public void setPlugin(@jakarta.annotation.Nullable final ServiceKafkaConnectListResponseConnectorsPlugin value) {
        this.plugin = value;
    }
    /**
     * Sets the tasks property value. List of tasks of a connector
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaConnectListResponseConnectorsTasks> value) {
        this.tasks = value;
    }
}
