package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceListResponseServicesComponents implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Service component name */
    private String component;
    /** DNS name for connecting to the service component */
    private String host;
    /** Kafka authentication method. This is a value specific to the 'kafka' service component */
    private ServiceListResponseServicesComponentsKafkaAuthenticationMethod kafkaAuthenticationMethod;
    /** Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint) */
    private String path;
    /** Port number for connecting to the service component */
    private Integer port;
    /** Privatelink connection ID */
    private String privatelinkConnectionId;
    /** Network access route */
    private ServiceListResponseServicesComponentsRoute route;
    /** Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption. */
    private Boolean ssl;
    /** DNS usage name */
    private ServiceListResponseServicesComponentsUsage usage;
    /**
     * Instantiates a new ServiceListResponseServicesComponents and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesComponents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceListResponseServicesComponents
     */
    @javax.annotation.Nonnull
    public static ServiceListResponseServicesComponents createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceListResponseServicesComponents();
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
     * Gets the component property value. Service component name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getStringValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("kafka_authentication_method", (n) -> { this.setKafkaAuthenticationMethod(n.getEnumValue(ServiceListResponseServicesComponentsKafkaAuthenticationMethod.class)); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("privatelink_connection_id", (n) -> { this.setPrivatelinkConnectionId(n.getStringValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getEnumValue(ServiceListResponseServicesComponentsRoute.class)); });
        deserializerMap.put("ssl", (n) -> { this.setSsl(n.getBooleanValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(ServiceListResponseServicesComponentsUsage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. DNS name for connecting to the service component
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the kafka_authentication_method property value. Kafka authentication method. This is a value specific to the 'kafka' service component
     * @return a ServiceListResponseServicesComponentsKafkaAuthenticationMethod
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesComponentsKafkaAuthenticationMethod getKafkaAuthenticationMethod() {
        return this.kafkaAuthenticationMethod;
    }
    /**
     * Gets the path property value. Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the port property value. Port number for connecting to the service component
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the privatelink_connection_id property value. Privatelink connection ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivatelinkConnectionId() {
        return this.privatelinkConnectionId;
    }
    /**
     * Gets the route property value. Network access route
     * @return a ServiceListResponseServicesComponentsRoute
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesComponentsRoute getRoute() {
        return this.route;
    }
    /**
     * Gets the ssl property value. Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSsl() {
        return this.ssl;
    }
    /**
     * Gets the usage property value. DNS usage name
     * @return a ServiceListResponseServicesComponentsUsage
     */
    @javax.annotation.Nullable
    public ServiceListResponseServicesComponentsUsage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("component", this.getComponent());
        writer.writeStringValue("host", this.getHost());
        writer.writeEnumValue("kafka_authentication_method", this.getKafkaAuthenticationMethod());
        writer.writeStringValue("path", this.getPath());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeStringValue("privatelink_connection_id", this.getPrivatelinkConnectionId());
        writer.writeEnumValue("route", this.getRoute());
        writer.writeBooleanValue("ssl", this.getSsl());
        writer.writeEnumValue("usage", this.getUsage());
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
     * Sets the component property value. Service component name
     * @param value Value to set for the component property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComponent(@javax.annotation.Nullable final String value) {
        this.component = value;
    }
    /**
     * Sets the host property value. DNS name for connecting to the service component
     * @param value Value to set for the host property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHost(@javax.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the kafka_authentication_method property value. Kafka authentication method. This is a value specific to the 'kafka' service component
     * @param value Value to set for the kafkaAuthenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKafkaAuthenticationMethod(@javax.annotation.Nullable final ServiceListResponseServicesComponentsKafkaAuthenticationMethod value) {
        this.kafkaAuthenticationMethod = value;
    }
    /**
     * Sets the path property value. Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the port property value. Port number for connecting to the service component
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the privatelink_connection_id property value. Privatelink connection ID
     * @param value Value to set for the privatelinkConnectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivatelinkConnectionId(@javax.annotation.Nullable final String value) {
        this.privatelinkConnectionId = value;
    }
    /**
     * Sets the route property value. Network access route
     * @param value Value to set for the route property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoute(@javax.annotation.Nullable final ServiceListResponseServicesComponentsRoute value) {
        this.route = value;
    }
    /**
     * Sets the ssl property value. Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption.
     * @param value Value to set for the ssl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsl(@javax.annotation.Nullable final Boolean value) {
        this.ssl = value;
    }
    /**
     * Sets the usage property value. DNS usage name
     * @param value Value to set for the usage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsage(@javax.annotation.Nullable final ServiceListResponseServicesComponentsUsage value) {
        this.usage = value;
    }
}
