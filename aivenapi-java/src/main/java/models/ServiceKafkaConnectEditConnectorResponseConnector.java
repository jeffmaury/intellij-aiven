package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka connector information
 */
public class ServiceKafkaConnectEditConnectorResponseConnector implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Connector configuration parameters */
    private ServiceKafkaConnectEditConnectorResponseConnectorConfig config;
    /** Connector name */
    private String name;
    /** Kafka Connector plugin information */
    private ServiceKafkaConnectEditConnectorResponseConnectorPlugin plugin;
    /** List of tasks of a connector */
    private java.util.List<ServiceKafkaConnectEditConnectorResponseConnectorTasks> tasks;
    /**
     * Instantiates a new ServiceKafkaConnectEditConnectorResponseConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectEditConnectorResponseConnector() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectEditConnectorResponseConnector
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaConnectEditConnectorResponseConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectEditConnectorResponseConnector();
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
     * Gets the config property value. Connector configuration parameters
     * @return a ServiceKafkaConnectEditConnectorResponseConnectorConfig
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectEditConnectorResponseConnectorConfig getConfig() {
        return this.config;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("config", (n) -> { this.setConfig(n.getObjectValue(ServiceKafkaConnectEditConnectorResponseConnectorConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plugin", (n) -> { this.setPlugin(n.getObjectValue(ServiceKafkaConnectEditConnectorResponseConnectorPlugin::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(ServiceKafkaConnectEditConnectorResponseConnectorTasks::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Connector name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the plugin property value. Kafka Connector plugin information
     * @return a ServiceKafkaConnectEditConnectorResponseConnectorPlugin
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectEditConnectorResponseConnectorPlugin getPlugin() {
        return this.plugin;
    }
    /**
     * Gets the tasks property value. List of tasks of a connector
     * @return a ServiceKafkaConnectEditConnectorResponseConnectorTasks
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceKafkaConnectEditConnectorResponseConnectorTasks> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("config", this.getConfig());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("plugin", this.getPlugin());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
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
     * Sets the config property value. Connector configuration parameters
     * @param value Value to set for the config property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfig(@javax.annotation.Nullable final ServiceKafkaConnectEditConnectorResponseConnectorConfig value) {
        this.config = value;
    }
    /**
     * Sets the name property value. Connector name
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the plugin property value. Kafka Connector plugin information
     * @param value Value to set for the plugin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlugin(@javax.annotation.Nullable final ServiceKafkaConnectEditConnectorResponseConnectorPlugin value) {
        this.plugin = value;
    }
    /**
     * Sets the tasks property value. List of tasks of a connector
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<ServiceKafkaConnectEditConnectorResponseConnectorTasks> value) {
        this.tasks = value;
    }
}
