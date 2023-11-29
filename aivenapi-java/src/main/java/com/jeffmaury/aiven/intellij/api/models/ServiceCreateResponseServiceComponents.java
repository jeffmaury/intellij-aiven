package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceCreateResponseServiceComponents implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service component name
     */
    private String component;
    /**
     * DNS name for connecting to the service component
     */
    private String host;
    /**
     * Kafka authentication method. This is a value specific to the 'kafka' service component
     */
    private ServiceCreateResponseServiceComponentsKafkaAuthenticationMethod kafkaAuthenticationMethod;
    /**
     * Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
     */
    private String path;
    /**
     * Port number for connecting to the service component
     */
    private Integer port;
    /**
     * Privatelink connection ID
     */
    private String privatelinkConnectionId;
    /**
     * Network access route
     */
    private ServiceCreateResponseServiceComponentsRoute route;
    /**
     * Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption.
     */
    private Boolean ssl;
    /**
     * DNS usage name
     */
    private ServiceCreateResponseServiceComponentsUsage usage;
    /**
     * Instantiates a new ServiceCreateResponseServiceComponents and sets the default values.
     */
    public ServiceCreateResponseServiceComponents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceCreateResponseServiceComponents
     */
    @jakarta.annotation.Nonnull
    public static ServiceCreateResponseServiceComponents createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceCreateResponseServiceComponents();
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
     * Gets the component property value. Service component name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getStringValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("kafka_authentication_method", (n) -> { this.setKafkaAuthenticationMethod(n.getEnumValue(ServiceCreateResponseServiceComponentsKafkaAuthenticationMethod.class)); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("privatelink_connection_id", (n) -> { this.setPrivatelinkConnectionId(n.getStringValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getEnumValue(ServiceCreateResponseServiceComponentsRoute.class)); });
        deserializerMap.put("ssl", (n) -> { this.setSsl(n.getBooleanValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(ServiceCreateResponseServiceComponentsUsage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. DNS name for connecting to the service component
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the kafka_authentication_method property value. Kafka authentication method. This is a value specific to the 'kafka' service component
     * @return a ServiceCreateResponseServiceComponentsKafkaAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public ServiceCreateResponseServiceComponentsKafkaAuthenticationMethod getKafkaAuthenticationMethod() {
        return this.kafkaAuthenticationMethod;
    }
    /**
     * Gets the path property value. Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the port property value. Port number for connecting to the service component
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the privatelink_connection_id property value. Privatelink connection ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivatelinkConnectionId() {
        return this.privatelinkConnectionId;
    }
    /**
     * Gets the route property value. Network access route
     * @return a ServiceCreateResponseServiceComponentsRoute
     */
    @jakarta.annotation.Nullable
    public ServiceCreateResponseServiceComponentsRoute getRoute() {
        return this.route;
    }
    /**
     * Gets the ssl property value. Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSsl() {
        return this.ssl;
    }
    /**
     * Gets the usage property value. DNS usage name
     * @return a ServiceCreateResponseServiceComponentsUsage
     */
    @jakarta.annotation.Nullable
    public ServiceCreateResponseServiceComponentsUsage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the component property value. Service component name
     * @param value Value to set for the component property.
     */
    public void setComponent(@jakarta.annotation.Nullable final String value) {
        this.component = value;
    }
    /**
     * Sets the host property value. DNS name for connecting to the service component
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the kafka_authentication_method property value. Kafka authentication method. This is a value specific to the 'kafka' service component
     * @param value Value to set for the kafka_authentication_method property.
     */
    public void setKafkaAuthenticationMethod(@jakarta.annotation.Nullable final ServiceCreateResponseServiceComponentsKafkaAuthenticationMethod value) {
        this.kafkaAuthenticationMethod = value;
    }
    /**
     * Sets the path property value. Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the port property value. Port number for connecting to the service component
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the privatelink_connection_id property value. Privatelink connection ID
     * @param value Value to set for the privatelink_connection_id property.
     */
    public void setPrivatelinkConnectionId(@jakarta.annotation.Nullable final String value) {
        this.privatelinkConnectionId = value;
    }
    /**
     * Sets the route property value. Network access route
     * @param value Value to set for the route property.
     */
    public void setRoute(@jakarta.annotation.Nullable final ServiceCreateResponseServiceComponentsRoute value) {
        this.route = value;
    }
    /**
     * Sets the ssl property value. Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted andthis property is only included for service components that may disable encryption.
     * @param value Value to set for the ssl property.
     */
    public void setSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.ssl = value;
    }
    /**
     * Sets the usage property value. DNS usage name
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final ServiceCreateResponseServiceComponentsUsage value) {
        this.usage = value;
    }
}
