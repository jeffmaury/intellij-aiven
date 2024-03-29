package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetResponseServiceServiceIntegrations implements AdditionalDataHolder, Parsable {
    /**
     * True when integration is active
     */
    private Boolean active;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Description of the integration
     */
    private String description;
    /**
     * Destination endpoint name
     */
    private String destEndpoint;
    /**
     * Destination endpoint id
     */
    private String destEndpointId;
    /**
     * Project name
     */
    private String destProject;
    /**
     * Destination service name
     */
    private String destService;
    /**
     * Service type code
     */
    private String destServiceType;
    /**
     * True when integration is enabled
     */
    private Boolean enabled;
    /**
     * Integration status
     */
    private ServiceGetResponseServiceServiceIntegrationsIntegrationStatus integrationStatus;
    /**
     * Type of the integration
     */
    private String integrationType;
    /**
     * Integration ID
     */
    private String serviceIntegrationId;
    /**
     * Source endpoint name
     */
    private String sourceEndpoint;
    /**
     * Source endpoint ID
     */
    private String sourceEndpointId;
    /**
     * Project name
     */
    private String sourceProject;
    /**
     * Source service name
     */
    private String sourceService;
    /**
     * Service type code
     */
    private String sourceServiceType;
    /**
     * Service integration settings
     */
    private ServiceGetResponseServiceServiceIntegrationsUserConfig userConfig;
    /**
     * Instantiates a new ServiceGetResponseServiceServiceIntegrations and sets the default values.
     */
    public ServiceGetResponseServiceServiceIntegrations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceServiceIntegrations
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetResponseServiceServiceIntegrations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceServiceIntegrations();
    }
    /**
     * Gets the active property value. True when integration is active
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActive() {
        return this.active;
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
     * Gets the description property value. Description of the integration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the dest_endpoint property value. Destination endpoint name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestEndpoint() {
        return this.destEndpoint;
    }
    /**
     * Gets the dest_endpoint_id property value. Destination endpoint id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestEndpointId() {
        return this.destEndpointId;
    }
    /**
     * Gets the dest_project property value. Project name
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
     * Gets the dest_service_type property value. Service type code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestServiceType() {
        return this.destServiceType;
    }
    /**
     * Gets the enabled property value. True when integration is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("dest_endpoint", (n) -> { this.setDestEndpoint(n.getStringValue()); });
        deserializerMap.put("dest_endpoint_id", (n) -> { this.setDestEndpointId(n.getStringValue()); });
        deserializerMap.put("dest_project", (n) -> { this.setDestProject(n.getStringValue()); });
        deserializerMap.put("dest_service", (n) -> { this.setDestService(n.getStringValue()); });
        deserializerMap.put("dest_service_type", (n) -> { this.setDestServiceType(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("integration_status", (n) -> { this.setIntegrationStatus(n.getObjectValue(ServiceGetResponseServiceServiceIntegrationsIntegrationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("integration_type", (n) -> { this.setIntegrationType(n.getStringValue()); });
        deserializerMap.put("service_integration_id", (n) -> { this.setServiceIntegrationId(n.getStringValue()); });
        deserializerMap.put("source_endpoint", (n) -> { this.setSourceEndpoint(n.getStringValue()); });
        deserializerMap.put("source_endpoint_id", (n) -> { this.setSourceEndpointId(n.getStringValue()); });
        deserializerMap.put("source_project", (n) -> { this.setSourceProject(n.getStringValue()); });
        deserializerMap.put("source_service", (n) -> { this.setSourceService(n.getStringValue()); });
        deserializerMap.put("source_service_type", (n) -> { this.setSourceServiceType(n.getStringValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceGetResponseServiceServiceIntegrationsUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integration_status property value. Integration status
     * @return a ServiceGetResponseServiceServiceIntegrationsIntegrationStatus
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceServiceIntegrationsIntegrationStatus getIntegrationStatus() {
        return this.integrationStatus;
    }
    /**
     * Gets the integration_type property value. Type of the integration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntegrationType() {
        return this.integrationType;
    }
    /**
     * Gets the service_integration_id property value. Integration ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceIntegrationId() {
        return this.serviceIntegrationId;
    }
    /**
     * Gets the source_endpoint property value. Source endpoint name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceEndpoint() {
        return this.sourceEndpoint;
    }
    /**
     * Gets the source_endpoint_id property value. Source endpoint ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }
    /**
     * Gets the source_project property value. Project name
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
     * Gets the source_service_type property value. Service type code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceServiceType() {
        return this.sourceServiceType;
    }
    /**
     * Gets the user_config property value. Service integration settings
     * @return a ServiceGetResponseServiceServiceIntegrationsUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceServiceIntegrationsUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("active", this.getActive());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("dest_endpoint", this.getDestEndpoint());
        writer.writeStringValue("dest_endpoint_id", this.getDestEndpointId());
        writer.writeStringValue("dest_project", this.getDestProject());
        writer.writeStringValue("dest_service", this.getDestService());
        writer.writeStringValue("dest_service_type", this.getDestServiceType());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeObjectValue("integration_status", this.getIntegrationStatus());
        writer.writeStringValue("integration_type", this.getIntegrationType());
        writer.writeStringValue("service_integration_id", this.getServiceIntegrationId());
        writer.writeStringValue("source_endpoint", this.getSourceEndpoint());
        writer.writeStringValue("source_endpoint_id", this.getSourceEndpointId());
        writer.writeStringValue("source_project", this.getSourceProject());
        writer.writeStringValue("source_service", this.getSourceService());
        writer.writeStringValue("source_service_type", this.getSourceServiceType());
        writer.writeObjectValue("user_config", this.getUserConfig());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the active property value. True when integration is active
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Boolean value) {
        this.active = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. Description of the integration
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the dest_endpoint property value. Destination endpoint name
     * @param value Value to set for the dest_endpoint property.
     */
    public void setDestEndpoint(@jakarta.annotation.Nullable final String value) {
        this.destEndpoint = value;
    }
    /**
     * Sets the dest_endpoint_id property value. Destination endpoint id
     * @param value Value to set for the dest_endpoint_id property.
     */
    public void setDestEndpointId(@jakarta.annotation.Nullable final String value) {
        this.destEndpointId = value;
    }
    /**
     * Sets the dest_project property value. Project name
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
     * Sets the dest_service_type property value. Service type code
     * @param value Value to set for the dest_service_type property.
     */
    public void setDestServiceType(@jakarta.annotation.Nullable final String value) {
        this.destServiceType = value;
    }
    /**
     * Sets the enabled property value. True when integration is enabled
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the integration_status property value. Integration status
     * @param value Value to set for the integration_status property.
     */
    public void setIntegrationStatus(@jakarta.annotation.Nullable final ServiceGetResponseServiceServiceIntegrationsIntegrationStatus value) {
        this.integrationStatus = value;
    }
    /**
     * Sets the integration_type property value. Type of the integration
     * @param value Value to set for the integration_type property.
     */
    public void setIntegrationType(@jakarta.annotation.Nullable final String value) {
        this.integrationType = value;
    }
    /**
     * Sets the service_integration_id property value. Integration ID
     * @param value Value to set for the service_integration_id property.
     */
    public void setServiceIntegrationId(@jakarta.annotation.Nullable final String value) {
        this.serviceIntegrationId = value;
    }
    /**
     * Sets the source_endpoint property value. Source endpoint name
     * @param value Value to set for the source_endpoint property.
     */
    public void setSourceEndpoint(@jakarta.annotation.Nullable final String value) {
        this.sourceEndpoint = value;
    }
    /**
     * Sets the source_endpoint_id property value. Source endpoint ID
     * @param value Value to set for the source_endpoint_id property.
     */
    public void setSourceEndpointId(@jakarta.annotation.Nullable final String value) {
        this.sourceEndpointId = value;
    }
    /**
     * Sets the source_project property value. Project name
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
     * Sets the source_service_type property value. Service type code
     * @param value Value to set for the source_service_type property.
     */
    public void setSourceServiceType(@jakarta.annotation.Nullable final String value) {
        this.sourceServiceType = value;
    }
    /**
     * Sets the user_config property value. Service integration settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceGetResponseServiceServiceIntegrationsUserConfig value) {
        this.userConfig = value;
    }
}
