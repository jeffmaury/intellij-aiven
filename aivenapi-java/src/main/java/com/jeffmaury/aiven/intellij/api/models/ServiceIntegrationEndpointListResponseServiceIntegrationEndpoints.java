package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service integration endpoint backend settings
     */
    private ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointConfig endpointConfig;
    /**
     * Integration endpoint ID
     */
    private String endpointId;
    /**
     * Integration endpoint name
     */
    private String endpointName;
    /**
     * Integration endpoint type
     */
    private ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointType endpointType;
    /**
     * Service integration settings
     */
    private ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsUserConfig userConfig;
    /**
     * Instantiates a new ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints and sets the default values.
     */
    public ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints
     */
    @jakarta.annotation.Nonnull
    public static ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationEndpointListResponseServiceIntegrationEndpoints();
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
     * Gets the endpoint_config property value. Service integration endpoint backend settings
     * @return a ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointConfig
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointConfig getEndpointConfig() {
        return this.endpointConfig;
    }
    /**
     * Gets the endpoint_id property value. Integration endpoint ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndpointId() {
        return this.endpointId;
    }
    /**
     * Gets the endpoint_name property value. Integration endpoint name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndpointName() {
        return this.endpointName;
    }
    /**
     * Gets the endpoint_type property value. Integration endpoint type
     * @return a ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointType
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointType getEndpointType() {
        return this.endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("endpoint_config", (n) -> { this.setEndpointConfig(n.getObjectValue(ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("endpoint_id", (n) -> { this.setEndpointId(n.getStringValue()); });
        deserializerMap.put("endpoint_name", (n) -> { this.setEndpointName(n.getStringValue()); });
        deserializerMap.put("endpoint_type", (n) -> { this.setEndpointType(n.getEnumValue(ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointType.class)); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user_config property value. Service integration settings
     * @return a ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endpoint_config", this.getEndpointConfig());
        writer.writeStringValue("endpoint_id", this.getEndpointId());
        writer.writeStringValue("endpoint_name", this.getEndpointName());
        writer.writeEnumValue("endpoint_type", this.getEndpointType());
        writer.writeObjectValue("user_config", this.getUserConfig());
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
     * Sets the endpoint_config property value. Service integration endpoint backend settings
     * @param value Value to set for the endpoint_config property.
     */
    public void setEndpointConfig(@jakarta.annotation.Nullable final ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointConfig value) {
        this.endpointConfig = value;
    }
    /**
     * Sets the endpoint_id property value. Integration endpoint ID
     * @param value Value to set for the endpoint_id property.
     */
    public void setEndpointId(@jakarta.annotation.Nullable final String value) {
        this.endpointId = value;
    }
    /**
     * Sets the endpoint_name property value. Integration endpoint name
     * @param value Value to set for the endpoint_name property.
     */
    public void setEndpointName(@jakarta.annotation.Nullable final String value) {
        this.endpointName = value;
    }
    /**
     * Sets the endpoint_type property value. Integration endpoint type
     * @param value Value to set for the endpoint_type property.
     */
    public void setEndpointType(@jakarta.annotation.Nullable final ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsEndpointType value) {
        this.endpointType = value;
    }
    /**
     * Sets the user_config property value. Service integration settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceIntegrationEndpointListResponseServiceIntegrationEndpointsUserConfig value) {
        this.userConfig = value;
    }
}