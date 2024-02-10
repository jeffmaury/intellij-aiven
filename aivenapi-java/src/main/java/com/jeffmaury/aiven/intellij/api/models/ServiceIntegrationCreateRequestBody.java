package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceIntegrationCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceIntegrationCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Integration destination endpoint ID
     */
    private String destEndpointId;
    /**
     * Destination project name
     */
    private String destProject;
    /**
     * Destination service name
     */
    private String destService;
    /**
     * Service integration type
     */
    private ServiceIntegrationCreateRequestBodyIntegrationType integrationType;
    /**
     * Integration source endpoint ID
     */
    private String sourceEndpointId;
    /**
     * Source project name
     */
    private String sourceProject;
    /**
     * Source service name
     */
    private String sourceService;
    /**
     * Service type-specific settings
     */
    private ServiceIntegrationCreateRequestBodyUserConfig userConfig;
    /**
     * Instantiates a new ServiceIntegrationCreateRequestBody and sets the default values.
     */
    public ServiceIntegrationCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceIntegrationCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationCreateRequestBody();
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
     * Gets the dest_endpoint_id property value. Integration destination endpoint ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestEndpointId() {
        return this.destEndpointId;
    }
    /**
     * Gets the dest_project property value. Destination project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestProject() {
        return this.destProject;
    }
    /**
     * Gets the dest_service property value. Destination service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestService() {
        return this.destService;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("dest_endpoint_id", (n) -> { this.setDestEndpointId(n.getStringValue()); });
        deserializerMap.put("dest_project", (n) -> { this.setDestProject(n.getStringValue()); });
        deserializerMap.put("dest_service", (n) -> { this.setDestService(n.getStringValue()); });
        deserializerMap.put("integration_type", (n) -> { this.setIntegrationType(n.getEnumValue(ServiceIntegrationCreateRequestBodyIntegrationType::forValue)); });
        deserializerMap.put("source_endpoint_id", (n) -> { this.setSourceEndpointId(n.getStringValue()); });
        deserializerMap.put("source_project", (n) -> { this.setSourceProject(n.getStringValue()); });
        deserializerMap.put("source_service", (n) -> { this.setSourceService(n.getStringValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceIntegrationCreateRequestBodyUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integration_type property value. Service integration type
     * @return a ServiceIntegrationCreateRequestBodyIntegrationType
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationCreateRequestBodyIntegrationType getIntegrationType() {
        return this.integrationType;
    }
    /**
     * Gets the source_endpoint_id property value. Integration source endpoint ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }
    /**
     * Gets the source_project property value. Source project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceProject() {
        return this.sourceProject;
    }
    /**
     * Gets the source_service property value. Source service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceService() {
        return this.sourceService;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceIntegrationCreateRequestBodyUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationCreateRequestBodyUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dest_endpoint_id", this.getDestEndpointId());
        writer.writeStringValue("dest_project", this.getDestProject());
        writer.writeStringValue("dest_service", this.getDestService());
        writer.writeEnumValue("integration_type", this.getIntegrationType());
        writer.writeStringValue("source_endpoint_id", this.getSourceEndpointId());
        writer.writeStringValue("source_project", this.getSourceProject());
        writer.writeStringValue("source_service", this.getSourceService());
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
     * Sets the dest_endpoint_id property value. Integration destination endpoint ID
     * @param value Value to set for the dest_endpoint_id property.
     */
    public void setDestEndpointId(@jakarta.annotation.Nullable final String value) {
        this.destEndpointId = value;
    }
    /**
     * Sets the dest_project property value. Destination project name
     * @param value Value to set for the dest_project property.
     */
    public void setDestProject(@jakarta.annotation.Nullable final String value) {
        this.destProject = value;
    }
    /**
     * Sets the dest_service property value. Destination service name
     * @param value Value to set for the dest_service property.
     */
    public void setDestService(@jakarta.annotation.Nullable final String value) {
        this.destService = value;
    }
    /**
     * Sets the integration_type property value. Service integration type
     * @param value Value to set for the integration_type property.
     */
    public void setIntegrationType(@jakarta.annotation.Nullable final ServiceIntegrationCreateRequestBodyIntegrationType value) {
        this.integrationType = value;
    }
    /**
     * Sets the source_endpoint_id property value. Integration source endpoint ID
     * @param value Value to set for the source_endpoint_id property.
     */
    public void setSourceEndpointId(@jakarta.annotation.Nullable final String value) {
        this.sourceEndpointId = value;
    }
    /**
     * Sets the source_project property value. Source project name
     * @param value Value to set for the source_project property.
     */
    public void setSourceProject(@jakarta.annotation.Nullable final String value) {
        this.sourceProject = value;
    }
    /**
     * Sets the source_service property value. Source service name
     * @param value Value to set for the source_service property.
     */
    public void setSourceService(@jakarta.annotation.Nullable final String value) {
        this.sourceService = value;
    }
    /**
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceIntegrationCreateRequestBodyUserConfig value) {
        this.userConfig = value;
    }
}
