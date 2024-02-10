package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceIntegrationEndpointCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceIntegrationEndpointCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Integration endpoint name
     */
    private String endpointName;
    /**
     * Service integration endpoint type
     */
    private ServiceIntegrationEndpointCreateRequestBodyEndpointType endpointType;
    /**
     * Service type-specific settings
     */
    private ServiceIntegrationEndpointCreateRequestBodyUserConfig userConfig;
    /**
     * Instantiates a new ServiceIntegrationEndpointCreateRequestBody and sets the default values.
     */
    public ServiceIntegrationEndpointCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationEndpointCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceIntegrationEndpointCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationEndpointCreateRequestBody();
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
     * Gets the endpoint_name property value. Integration endpoint name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndpointName() {
        return this.endpointName;
    }
    /**
     * Gets the endpoint_type property value. Service integration endpoint type
     * @return a ServiceIntegrationEndpointCreateRequestBodyEndpointType
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointCreateRequestBodyEndpointType getEndpointType() {
        return this.endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("endpoint_name", (n) -> { this.setEndpointName(n.getStringValue()); });
        deserializerMap.put("endpoint_type", (n) -> { this.setEndpointType(n.getEnumValue(ServiceIntegrationEndpointCreateRequestBodyEndpointType::forValue)); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceIntegrationEndpointCreateRequestBodyUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceIntegrationEndpointCreateRequestBodyUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationEndpointCreateRequestBodyUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the endpoint_name property value. Integration endpoint name
     * @param value Value to set for the endpoint_name property.
     */
    public void setEndpointName(@jakarta.annotation.Nullable final String value) {
        this.endpointName = value;
    }
    /**
     * Sets the endpoint_type property value. Service integration endpoint type
     * @param value Value to set for the endpoint_type property.
     */
    public void setEndpointType(@jakarta.annotation.Nullable final ServiceIntegrationEndpointCreateRequestBodyEndpointType value) {
        this.endpointType = value;
    }
    /**
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceIntegrationEndpointCreateRequestBodyUserConfig value) {
        this.userConfig = value;
    }
}
