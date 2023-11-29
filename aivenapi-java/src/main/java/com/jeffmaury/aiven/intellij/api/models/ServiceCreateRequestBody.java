package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloud;
    /**
     * If this is a forked service, copy tags from the source service. If request contains additional tags, the tags copied from source are updated with them.
     */
    private Boolean copyTags;
    /**
     * Megabytes of disk space for data storage
     */
    private Double diskSpaceMb;
    /**
     * Service group name (DEPRECATED: do not use)
     */
    private String groupName;
    /**
     * Automatic maintenance settings
     */
    private ServiceCreateRequestBodyMaintenance maintenance;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Project VPC ID
     */
    private String projectVpcId;
    /**
     * Service integrations to enable for the service. Some integration types affect how a service is created and they must be provided as part of the creation call instead of being defined later.
     */
    private java.util.List<ServiceCreateRequestBodyServiceIntegrations> serviceIntegrations;
    /**
     * Service name
     */
    private String serviceName;
    /**
     * Service type code
     */
    private String serviceType;
    /**
     * Static IP addresses to associate with the service
     */
    private java.util.List<String> staticIps;
    /**
     * Set of resource tags
     */
    private ServiceCreateRequestBodyTags tags;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * Service type-specific settings
     */
    private ServiceCreateRequestBodyUserConfig userConfig;
    /**
     * Instantiates a new ServiceCreateRequestBody and sets the default values.
     */
    public ServiceCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceCreateRequestBody();
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
     * Gets the cloud property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloud() {
        return this.cloud;
    }
    /**
     * Gets the copy_tags property value. If this is a forked service, copy tags from the source service. If request contains additional tags, the tags copied from source are updated with them.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCopyTags() {
        return this.copyTags;
    }
    /**
     * Gets the disk_space_mb property value. Megabytes of disk space for data storage
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getDiskSpaceMb() {
        return this.diskSpaceMb;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("copy_tags", (n) -> { this.setCopyTags(n.getBooleanValue()); });
        deserializerMap.put("disk_space_mb", (n) -> { this.setDiskSpaceMb(n.getDoubleValue()); });
        deserializerMap.put("group_name", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(ServiceCreateRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("project_vpc_id", (n) -> { this.setProjectVpcId(n.getStringValue()); });
        deserializerMap.put("service_integrations", (n) -> { this.setServiceIntegrations(n.getCollectionOfObjectValues(ServiceCreateRequestBodyServiceIntegrations::createFromDiscriminatorValue)); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("static_ips", (n) -> { this.setStaticIps(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ServiceCreateRequestBodyTags::createFromDiscriminatorValue)); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceCreateRequestBodyUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group_name property value. Service group name (DEPRECATED: do not use)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a ServiceCreateRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public ServiceCreateRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the plan property value. Subscription plan
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the project_vpc_id property value. Project VPC ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectVpcId() {
        return this.projectVpcId;
    }
    /**
     * Gets the service_integrations property value. Service integrations to enable for the service. Some integration types affect how a service is created and they must be provided as part of the creation call instead of being defined later.
     * @return a java.util.List<ServiceCreateRequestBodyServiceIntegrations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceCreateRequestBodyServiceIntegrations> getServiceIntegrations() {
        return this.serviceIntegrations;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the service_type property value. Service type code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the static_ips property value. Static IP addresses to associate with the service
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStaticIps() {
        return this.staticIps;
    }
    /**
     * Gets the tags property value. Set of resource tags
     * @return a ServiceCreateRequestBodyTags
     */
    @jakarta.annotation.Nullable
    public ServiceCreateRequestBodyTags getTags() {
        return this.tags;
    }
    /**
     * Gets the termination_protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceCreateRequestBodyUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceCreateRequestBodyUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeBooleanValue("copy_tags", this.getCopyTags());
        writer.writeDoubleValue("disk_space_mb", this.getDiskSpaceMb());
        writer.writeStringValue("group_name", this.getGroupName());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeStringValue("project_vpc_id", this.getProjectVpcId());
        writer.writeCollectionOfObjectValues("service_integrations", this.getServiceIntegrations());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeStringValue("service_type", this.getServiceType());
        writer.writeCollectionOfPrimitiveValues("static_ips", this.getStaticIps());
        writer.writeObjectValue("tags", this.getTags());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
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
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     */
    public void setCloud(@jakarta.annotation.Nullable final String value) {
        this.cloud = value;
    }
    /**
     * Sets the copy_tags property value. If this is a forked service, copy tags from the source service. If request contains additional tags, the tags copied from source are updated with them.
     * @param value Value to set for the copy_tags property.
     */
    public void setCopyTags(@jakarta.annotation.Nullable final Boolean value) {
        this.copyTags = value;
    }
    /**
     * Sets the disk_space_mb property value. Megabytes of disk space for data storage
     * @param value Value to set for the disk_space_mb property.
     */
    public void setDiskSpaceMb(@jakarta.annotation.Nullable final Double value) {
        this.diskSpaceMb = value;
    }
    /**
     * Sets the group_name property value. Service group name (DEPRECATED: do not use)
     * @param value Value to set for the group_name property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.groupName = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final ServiceCreateRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the project_vpc_id property value. Project VPC ID
     * @param value Value to set for the project_vpc_id property.
     */
    public void setProjectVpcId(@jakarta.annotation.Nullable final String value) {
        this.projectVpcId = value;
    }
    /**
     * Sets the service_integrations property value. Service integrations to enable for the service. Some integration types affect how a service is created and they must be provided as part of the creation call instead of being defined later.
     * @param value Value to set for the service_integrations property.
     */
    public void setServiceIntegrations(@jakarta.annotation.Nullable final java.util.List<ServiceCreateRequestBodyServiceIntegrations> value) {
        this.serviceIntegrations = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the service_name property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the service_type property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the static_ips property value. Static IP addresses to associate with the service
     * @param value Value to set for the static_ips property.
     */
    public void setStaticIps(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.staticIps = value;
    }
    /**
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final ServiceCreateRequestBodyTags value) {
        this.tags = value;
    }
    /**
     * Sets the termination_protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination_protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceCreateRequestBodyUserConfig value) {
        this.userConfig = value;
    }
}
