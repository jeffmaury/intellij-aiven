package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUpdateResponseService implements AdditionalDataHolder, Parsable {
    /**
     * List of Kafka ACL entries
     */
    private java.util.List<ServiceUpdateResponseServiceAcl> acl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of backups for the service
     */
    private java.util.List<ServiceUpdateResponseServiceBackups> backups;
    /**
     * Cloud provider and location
     */
    private String cloudDescription;
    /**
     * Target cloud
     */
    private String cloudName;
    /**
     * Service component information objects
     */
    private java.util.List<ServiceUpdateResponseServiceComponents> components;
    /**
     * Service-specific connection information properties
     */
    private ServiceUpdateResponseServiceConnectionInfo connectionInfo;
    /**
     * PostgreSQL PGBouncer connection pools
     */
    private java.util.List<ServiceUpdateResponseServiceConnectionPools> connectionPools;
    /**
     * Service creation timestamp (ISO 8601)
     */
    private String createTime;
    /**
     * List of service's user database names
     */
    private java.util.List<String> databases;
    /**
     * Megabytes of disk space for data storage
     */
    private Double diskSpaceMb;
    /**
     * Feature flags
     */
    private ServiceUpdateResponseServiceFeatures features;
    /**
     * List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default'
     */
    private java.util.List<String> groupList;
    /**
     * Automatic maintenance settings
     */
    private ServiceUpdateResponseServiceMaintenance maintenance;
    /**
     * Service type specific metadata
     */
    private ServiceUpdateResponseServiceMetadata metadata;
    /**
     * Number of service nodes in the active plan
     */
    private Integer nodeCount;
    /**
     * Number of CPUs for each node
     */
    private Integer nodeCpuCount;
    /**
     * Megabytes of memory for each node
     */
    private Double nodeMemoryMb;
    /**
     * State of individual service nodes
     */
    private java.util.List<ServiceUpdateResponseServiceNodeStates> nodeStates;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Project VPC ID
     */
    private String projectVpcId;
    /**
     * List of Schema Registry ACL entries
     */
    private java.util.List<ServiceUpdateResponseServiceSchemaRegistryAcl> schemaRegistryAcl;
    /**
     * Integrations with other services
     */
    private java.util.List<ServiceUpdateResponseServiceServiceIntegrations> serviceIntegrations;
    /**
     * Service name
     */
    private String serviceName;
    /**
     * Service notifications
     */
    private java.util.List<ServiceUpdateResponseServiceServiceNotifications> serviceNotifications;
    /**
     * Service type code
     */
    private String serviceType;
    /**
     * Single line description of the service
     */
    private String serviceTypeDescription;
    /**
     * URI for connecting to the service (may be null)
     */
    private String serviceUri;
    /**
     * service_uri parameterized into key-value pairs
     */
    private ServiceUpdateResponseServiceServiceUriParams serviceUriParams;
    /**
     * State of the service
     */
    private ServiceUpdateResponseServiceState state;
    /**
     * Set of resource tags
     */
    private ServiceUpdateResponseServiceTags tags;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead
     */
    private java.util.List<ServiceUpdateResponseServiceTopics> topics;
    /**
     * Service last update timestamp (ISO 8601)
     */
    private String updateTime;
    /**
     * Service type-specific settings
     */
    private ServiceUpdateResponseServiceUserConfig userConfig;
    /**
     * List of service users
     */
    private java.util.List<ServiceUpdateResponseServiceUsers> users;
    /**
     * Instantiates a new ServiceUpdateResponseService and sets the default values.
     */
    public ServiceUpdateResponseService() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateResponseService
     */
    @jakarta.annotation.Nonnull
    public static ServiceUpdateResponseService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateResponseService();
    }
    /**
     * Gets the acl property value. List of Kafka ACL entries
     * @return a java.util.List<ServiceUpdateResponseServiceAcl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceAcl> getAcl() {
        return this.acl;
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
     * Gets the backups property value. List of backups for the service
     * @return a java.util.List<ServiceUpdateResponseServiceBackups>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceBackups> getBackups() {
        return this.backups;
    }
    /**
     * Gets the cloud_description property value. Cloud provider and location
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudDescription() {
        return this.cloudDescription;
    }
    /**
     * Gets the cloud_name property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * Gets the components property value. Service component information objects
     * @return a java.util.List<ServiceUpdateResponseServiceComponents>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceComponents> getComponents() {
        return this.components;
    }
    /**
     * Gets the connection_info property value. Service-specific connection information properties
     * @return a ServiceUpdateResponseServiceConnectionInfo
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * Gets the connection_pools property value. PostgreSQL PGBouncer connection pools
     * @return a java.util.List<ServiceUpdateResponseServiceConnectionPools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }
    /**
     * Gets the create_time property value. Service creation timestamp (ISO 8601)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the databases property value. List of service's user database names
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDatabases() {
        return this.databases;
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
     * Gets the features property value. Feature flags
     * @return a ServiceUpdateResponseServiceFeatures
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(35);
        deserializerMap.put("acl", (n) -> { this.setAcl(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceAcl::createFromDiscriminatorValue)); });
        deserializerMap.put("backups", (n) -> { this.setBackups(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceBackups::createFromDiscriminatorValue)); });
        deserializerMap.put("cloud_description", (n) -> { this.setCloudDescription(n.getStringValue()); });
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceComponents::createFromDiscriminatorValue)); });
        deserializerMap.put("connection_info", (n) -> { this.setConnectionInfo(n.getObjectValue(ServiceUpdateResponseServiceConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("connection_pools", (n) -> { this.setConnectionPools(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceConnectionPools::createFromDiscriminatorValue)); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("databases", (n) -> { this.setDatabases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("disk_space_mb", (n) -> { this.setDiskSpaceMb(n.getDoubleValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(ServiceUpdateResponseServiceFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("group_list", (n) -> { this.setGroupList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(ServiceUpdateResponseServiceMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ServiceUpdateResponseServiceMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("node_count", (n) -> { this.setNodeCount(n.getIntegerValue()); });
        deserializerMap.put("node_cpu_count", (n) -> { this.setNodeCpuCount(n.getIntegerValue()); });
        deserializerMap.put("node_memory_mb", (n) -> { this.setNodeMemoryMb(n.getDoubleValue()); });
        deserializerMap.put("node_states", (n) -> { this.setNodeStates(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceNodeStates::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("project_vpc_id", (n) -> { this.setProjectVpcId(n.getStringValue()); });
        deserializerMap.put("schema_registry_acl", (n) -> { this.setSchemaRegistryAcl(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceSchemaRegistryAcl::createFromDiscriminatorValue)); });
        deserializerMap.put("service_integrations", (n) -> { this.setServiceIntegrations(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceServiceIntegrations::createFromDiscriminatorValue)); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("service_notifications", (n) -> { this.setServiceNotifications(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceServiceNotifications::createFromDiscriminatorValue)); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("service_type_description", (n) -> { this.setServiceTypeDescription(n.getStringValue()); });
        deserializerMap.put("service_uri", (n) -> { this.setServiceUri(n.getStringValue()); });
        deserializerMap.put("service_uri_params", (n) -> { this.setServiceUriParams(n.getObjectValue(ServiceUpdateResponseServiceServiceUriParams::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceUpdateResponseServiceState.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ServiceUpdateResponseServiceTags::createFromDiscriminatorValue)); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceTopics::createFromDiscriminatorValue)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceUpdateResponseServiceUserConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(ServiceUpdateResponseServiceUsers::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group_list property value. List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default'
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a ServiceUpdateResponseServiceMaintenance
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the metadata property value. Service type specific metadata
     * @return a ServiceUpdateResponseServiceMetadata
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the node_count property value. Number of service nodes in the active plan
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Gets the node_cpu_count property value. Number of CPUs for each node
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNodeCpuCount() {
        return this.nodeCpuCount;
    }
    /**
     * Gets the node_memory_mb property value. Megabytes of memory for each node
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getNodeMemoryMb() {
        return this.nodeMemoryMb;
    }
    /**
     * Gets the node_states property value. State of individual service nodes
     * @return a java.util.List<ServiceUpdateResponseServiceNodeStates>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceNodeStates> getNodeStates() {
        return this.nodeStates;
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
     * Gets the schema_registry_acl property value. List of Schema Registry ACL entries
     * @return a java.util.List<ServiceUpdateResponseServiceSchemaRegistryAcl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceSchemaRegistryAcl> getSchemaRegistryAcl() {
        return this.schemaRegistryAcl;
    }
    /**
     * Gets the service_integrations property value. Integrations with other services
     * @return a java.util.List<ServiceUpdateResponseServiceServiceIntegrations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceServiceIntegrations> getServiceIntegrations() {
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
     * Gets the service_notifications property value. Service notifications
     * @return a java.util.List<ServiceUpdateResponseServiceServiceNotifications>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceServiceNotifications> getServiceNotifications() {
        return this.serviceNotifications;
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
     * Gets the service_type_description property value. Single line description of the service
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceTypeDescription() {
        return this.serviceTypeDescription;
    }
    /**
     * Gets the service_uri property value. URI for connecting to the service (may be null)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceUri() {
        return this.serviceUri;
    }
    /**
     * Gets the service_uri_params property value. service_uri parameterized into key-value pairs
     * @return a ServiceUpdateResponseServiceServiceUriParams
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceServiceUriParams getServiceUriParams() {
        return this.serviceUriParams;
    }
    /**
     * Gets the state property value. State of the service
     * @return a ServiceUpdateResponseServiceState
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceState getState() {
        return this.state;
    }
    /**
     * Gets the tags property value. Set of resource tags
     * @return a ServiceUpdateResponseServiceTags
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceTags getTags() {
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
     * Gets the topics property value. Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead
     * @return a java.util.List<ServiceUpdateResponseServiceTopics>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceTopics> getTopics() {
        return this.topics;
    }
    /**
     * Gets the update_time property value. Service last update timestamp (ISO 8601)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceUpdateResponseServiceUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateResponseServiceUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Gets the users property value. List of service users
     * @return a java.util.List<ServiceUpdateResponseServiceUsers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceUpdateResponseServiceUsers> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeCollectionOfObjectValues("backups", this.getBackups());
        writer.writeStringValue("cloud_description", this.getCloudDescription());
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeCollectionOfObjectValues("components", this.getComponents());
        writer.writeObjectValue("connection_info", this.getConnectionInfo());
        writer.writeCollectionOfObjectValues("connection_pools", this.getConnectionPools());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeCollectionOfPrimitiveValues("databases", this.getDatabases());
        writer.writeDoubleValue("disk_space_mb", this.getDiskSpaceMb());
        writer.writeObjectValue("features", this.getFeatures());
        writer.writeCollectionOfPrimitiveValues("group_list", this.getGroupList());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeIntegerValue("node_count", this.getNodeCount());
        writer.writeIntegerValue("node_cpu_count", this.getNodeCpuCount());
        writer.writeDoubleValue("node_memory_mb", this.getNodeMemoryMb());
        writer.writeCollectionOfObjectValues("node_states", this.getNodeStates());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeStringValue("project_vpc_id", this.getProjectVpcId());
        writer.writeCollectionOfObjectValues("schema_registry_acl", this.getSchemaRegistryAcl());
        writer.writeCollectionOfObjectValues("service_integrations", this.getServiceIntegrations());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeCollectionOfObjectValues("service_notifications", this.getServiceNotifications());
        writer.writeStringValue("service_type", this.getServiceType());
        writer.writeStringValue("service_type_description", this.getServiceTypeDescription());
        writer.writeStringValue("service_uri", this.getServiceUri());
        writer.writeObjectValue("service_uri_params", this.getServiceUriParams());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("tags", this.getTags());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
        writer.writeCollectionOfObjectValues("topics", this.getTopics());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeObjectValue("user_config", this.getUserConfig());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acl property value. List of Kafka ACL entries
     * @param value Value to set for the acl property.
     */
    public void setAcl(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceAcl> value) {
        this.acl = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the backups property value. List of backups for the service
     * @param value Value to set for the backups property.
     */
    public void setBackups(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceBackups> value) {
        this.backups = value;
    }
    /**
     * Sets the cloud_description property value. Cloud provider and location
     * @param value Value to set for the cloud_description property.
     */
    public void setCloudDescription(@jakarta.annotation.Nullable final String value) {
        this.cloudDescription = value;
    }
    /**
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloud_name property.
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the components property value. Service component information objects
     * @param value Value to set for the components property.
     */
    public void setComponents(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceComponents> value) {
        this.components = value;
    }
    /**
     * Sets the connection_info property value. Service-specific connection information properties
     * @param value Value to set for the connection_info property.
     */
    public void setConnectionInfo(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceConnectionInfo value) {
        this.connectionInfo = value;
    }
    /**
     * Sets the connection_pools property value. PostgreSQL PGBouncer connection pools
     * @param value Value to set for the connection_pools property.
     */
    public void setConnectionPools(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceConnectionPools> value) {
        this.connectionPools = value;
    }
    /**
     * Sets the create_time property value. Service creation timestamp (ISO 8601)
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the databases property value. List of service's user database names
     * @param value Value to set for the databases property.
     */
    public void setDatabases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.databases = value;
    }
    /**
     * Sets the disk_space_mb property value. Megabytes of disk space for data storage
     * @param value Value to set for the disk_space_mb property.
     */
    public void setDiskSpaceMb(@jakarta.annotation.Nullable final Double value) {
        this.diskSpaceMb = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     */
    public void setFeatures(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceFeatures value) {
        this.features = value;
    }
    /**
     * Sets the group_list property value. List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default'
     * @param value Value to set for the group_list property.
     */
    public void setGroupList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupList = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the metadata property value. Service type specific metadata
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the node_count property value. Number of service nodes in the active plan
     * @param value Value to set for the node_count property.
     */
    public void setNodeCount(@jakarta.annotation.Nullable final Integer value) {
        this.nodeCount = value;
    }
    /**
     * Sets the node_cpu_count property value. Number of CPUs for each node
     * @param value Value to set for the node_cpu_count property.
     */
    public void setNodeCpuCount(@jakarta.annotation.Nullable final Integer value) {
        this.nodeCpuCount = value;
    }
    /**
     * Sets the node_memory_mb property value. Megabytes of memory for each node
     * @param value Value to set for the node_memory_mb property.
     */
    public void setNodeMemoryMb(@jakarta.annotation.Nullable final Double value) {
        this.nodeMemoryMb = value;
    }
    /**
     * Sets the node_states property value. State of individual service nodes
     * @param value Value to set for the node_states property.
     */
    public void setNodeStates(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceNodeStates> value) {
        this.nodeStates = value;
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
     * Sets the schema_registry_acl property value. List of Schema Registry ACL entries
     * @param value Value to set for the schema_registry_acl property.
     */
    public void setSchemaRegistryAcl(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceSchemaRegistryAcl> value) {
        this.schemaRegistryAcl = value;
    }
    /**
     * Sets the service_integrations property value. Integrations with other services
     * @param value Value to set for the service_integrations property.
     */
    public void setServiceIntegrations(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceServiceIntegrations> value) {
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
     * Sets the service_notifications property value. Service notifications
     * @param value Value to set for the service_notifications property.
     */
    public void setServiceNotifications(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceServiceNotifications> value) {
        this.serviceNotifications = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the service_type property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the service_type_description property value. Single line description of the service
     * @param value Value to set for the service_type_description property.
     */
    public void setServiceTypeDescription(@jakarta.annotation.Nullable final String value) {
        this.serviceTypeDescription = value;
    }
    /**
     * Sets the service_uri property value. URI for connecting to the service (may be null)
     * @param value Value to set for the service_uri property.
     */
    public void setServiceUri(@jakarta.annotation.Nullable final String value) {
        this.serviceUri = value;
    }
    /**
     * Sets the service_uri_params property value. service_uri parameterized into key-value pairs
     * @param value Value to set for the service_uri_params property.
     */
    public void setServiceUriParams(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceServiceUriParams value) {
        this.serviceUriParams = value;
    }
    /**
     * Sets the state property value. State of the service
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceState value) {
        this.state = value;
    }
    /**
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceTags value) {
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
     * Sets the topics property value. Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead
     * @param value Value to set for the topics property.
     */
    public void setTopics(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceTopics> value) {
        this.topics = value;
    }
    /**
     * Sets the update_time property value. Service last update timestamp (ISO 8601)
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceUpdateResponseServiceUserConfig value) {
        this.userConfig = value;
    }
    /**
     * Sets the users property value. List of service users
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<ServiceUpdateResponseServiceUsers> value) {
        this.users = value;
    }
}
