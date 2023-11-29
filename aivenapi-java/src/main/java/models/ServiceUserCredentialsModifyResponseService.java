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
public class ServiceUserCredentialsModifyResponseService implements AdditionalDataHolder, Parsable {
    /** List of Kafka ACL entries */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceAcl> acl;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of backups for the service */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceBackups> backups;
    /** Cloud provider and location */
    private String cloudDescription;
    /** Target cloud */
    private String cloudName;
    /** Service component information objects */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceComponents> components;
    /** Service-specific connection information properties */
    private ServiceUserCredentialsModifyResponseServiceConnectionInfo connectionInfo;
    /** PostgreSQL PGBouncer connection pools */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceConnectionPools> connectionPools;
    /** Service creation timestamp (ISO 8601) */
    private String createTime;
    /** List of service's user database names */
    private java.util.List<String> databases;
    /** Megabytes of disk space for data storage */
    private Double diskSpaceMb;
    /** Feature flags */
    private ServiceUserCredentialsModifyResponseServiceFeatures features;
    /** List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default' */
    private java.util.List<String> groupList;
    /** Automatic maintenance settings */
    private ServiceUserCredentialsModifyResponseServiceMaintenance maintenance;
    /** Service type specific metadata */
    private ServiceUserCredentialsModifyResponseServiceMetadata metadata;
    /** Number of service nodes in the active plan */
    private Integer nodeCount;
    /** Number of CPUs for each node */
    private Integer nodeCpuCount;
    /** Megabytes of memory for each node */
    private Double nodeMemoryMb;
    /** State of individual service nodes */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceNodeStates> nodeStates;
    /** Subscription plan */
    private String plan;
    /** Project VPC ID */
    private String projectVpcId;
    /** List of Schema Registry ACL entries */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceSchemaRegistryAcl> schemaRegistryAcl;
    /** Integrations with other services */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceServiceIntegrations> serviceIntegrations;
    /** Service name */
    private String serviceName;
    /** Service notifications */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceServiceNotifications> serviceNotifications;
    /** Service type code */
    private String serviceType;
    /** Single line description of the service */
    private String serviceTypeDescription;
    /** URI for connecting to the service (may be null) */
    private String serviceUri;
    /** service_uri parameterized into key-value pairs */
    private ServiceUserCredentialsModifyResponseServiceServiceUriParams serviceUriParams;
    /** State of the service */
    private ServiceUserCredentialsModifyResponseServiceState state;
    /** Set of resource tags */
    private ServiceUserCredentialsModifyResponseServiceTags tags;
    /** Service is protected against termination and powering off */
    private Boolean terminationProtection;
    /** Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceTopics> topics;
    /** Service last update timestamp (ISO 8601) */
    private String updateTime;
    /** Service type-specific settings */
    private ServiceUserCredentialsModifyResponseServiceUserConfig userConfig;
    /** List of service users */
    private java.util.List<ServiceUserCredentialsModifyResponseServiceUsers> users;
    /**
     * Instantiates a new ServiceUserCredentialsModifyResponseService and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseService() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyResponseService
     */
    @javax.annotation.Nonnull
    public static ServiceUserCredentialsModifyResponseService createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyResponseService();
    }
    /**
     * Gets the acl property value. List of Kafka ACL entries
     * @return a ServiceUserCredentialsModifyResponseServiceAcl
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceAcl> getAcl() {
        return this.acl;
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
     * Gets the backups property value. List of backups for the service
     * @return a ServiceUserCredentialsModifyResponseServiceBackups
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceBackups> getBackups() {
        return this.backups;
    }
    /**
     * Gets the cloud_description property value. Cloud provider and location
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudDescription() {
        return this.cloudDescription;
    }
    /**
     * Gets the cloud_name property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * Gets the components property value. Service component information objects
     * @return a ServiceUserCredentialsModifyResponseServiceComponents
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceComponents> getComponents() {
        return this.components;
    }
    /**
     * Gets the connection_info property value. Service-specific connection information properties
     * @return a ServiceUserCredentialsModifyResponseServiceConnectionInfo
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * Gets the connection_pools property value. PostgreSQL PGBouncer connection pools
     * @return a ServiceUserCredentialsModifyResponseServiceConnectionPools
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }
    /**
     * Gets the create_time property value. Service creation timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the databases property value. List of service's user database names
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDatabases() {
        return this.databases;
    }
    /**
     * Gets the disk_space_mb property value. Megabytes of disk space for data storage
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getDiskSpaceMb() {
        return this.diskSpaceMb;
    }
    /**
     * Gets the features property value. Feature flags
     * @return a ServiceUserCredentialsModifyResponseServiceFeatures
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(35);
        deserializerMap.put("acl", (n) -> { this.setAcl(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceAcl::createFromDiscriminatorValue)); });
        deserializerMap.put("backups", (n) -> { this.setBackups(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceBackups::createFromDiscriminatorValue)); });
        deserializerMap.put("cloud_description", (n) -> { this.setCloudDescription(n.getStringValue()); });
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceComponents::createFromDiscriminatorValue)); });
        deserializerMap.put("connection_info", (n) -> { this.setConnectionInfo(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("connection_pools", (n) -> { this.setConnectionPools(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceConnectionPools::createFromDiscriminatorValue)); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("databases", (n) -> { this.setDatabases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("disk_space_mb", (n) -> { this.setDiskSpaceMb(n.getDoubleValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("group_list", (n) -> { this.setGroupList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("node_count", (n) -> { this.setNodeCount(n.getIntegerValue()); });
        deserializerMap.put("node_cpu_count", (n) -> { this.setNodeCpuCount(n.getIntegerValue()); });
        deserializerMap.put("node_memory_mb", (n) -> { this.setNodeMemoryMb(n.getDoubleValue()); });
        deserializerMap.put("node_states", (n) -> { this.setNodeStates(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceNodeStates::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("project_vpc_id", (n) -> { this.setProjectVpcId(n.getStringValue()); });
        deserializerMap.put("schema_registry_acl", (n) -> { this.setSchemaRegistryAcl(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceSchemaRegistryAcl::createFromDiscriminatorValue)); });
        deserializerMap.put("service_integrations", (n) -> { this.setServiceIntegrations(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceServiceIntegrations::createFromDiscriminatorValue)); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("service_notifications", (n) -> { this.setServiceNotifications(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceServiceNotifications::createFromDiscriminatorValue)); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getStringValue()); });
        deserializerMap.put("service_type_description", (n) -> { this.setServiceTypeDescription(n.getStringValue()); });
        deserializerMap.put("service_uri", (n) -> { this.setServiceUri(n.getStringValue()); });
        deserializerMap.put("service_uri_params", (n) -> { this.setServiceUriParams(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceServiceUriParams::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServiceUserCredentialsModifyResponseServiceState.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceTags::createFromDiscriminatorValue)); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceTopics::createFromDiscriminatorValue)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceUserCredentialsModifyResponseServiceUserConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(ServiceUserCredentialsModifyResponseServiceUsers::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group_list property value. List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default'
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a ServiceUserCredentialsModifyResponseServiceMaintenance
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the metadata property value. Service type specific metadata
     * @return a ServiceUserCredentialsModifyResponseServiceMetadata
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the node_count property value. Number of service nodes in the active plan
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Gets the node_cpu_count property value. Number of CPUs for each node
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNodeCpuCount() {
        return this.nodeCpuCount;
    }
    /**
     * Gets the node_memory_mb property value. Megabytes of memory for each node
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getNodeMemoryMb() {
        return this.nodeMemoryMb;
    }
    /**
     * Gets the node_states property value. State of individual service nodes
     * @return a ServiceUserCredentialsModifyResponseServiceNodeStates
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceNodeStates> getNodeStates() {
        return this.nodeStates;
    }
    /**
     * Gets the plan property value. Subscription plan
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the project_vpc_id property value. Project VPC ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProjectVpcId() {
        return this.projectVpcId;
    }
    /**
     * Gets the schema_registry_acl property value. List of Schema Registry ACL entries
     * @return a ServiceUserCredentialsModifyResponseServiceSchemaRegistryAcl
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceSchemaRegistryAcl> getSchemaRegistryAcl() {
        return this.schemaRegistryAcl;
    }
    /**
     * Gets the service_integrations property value. Integrations with other services
     * @return a ServiceUserCredentialsModifyResponseServiceServiceIntegrations
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceServiceIntegrations> getServiceIntegrations() {
        return this.serviceIntegrations;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the service_notifications property value. Service notifications
     * @return a ServiceUserCredentialsModifyResponseServiceServiceNotifications
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceServiceNotifications> getServiceNotifications() {
        return this.serviceNotifications;
    }
    /**
     * Gets the service_type property value. Service type code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the service_type_description property value. Single line description of the service
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceTypeDescription() {
        return this.serviceTypeDescription;
    }
    /**
     * Gets the service_uri property value. URI for connecting to the service (may be null)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceUri() {
        return this.serviceUri;
    }
    /**
     * Gets the service_uri_params property value. service_uri parameterized into key-value pairs
     * @return a ServiceUserCredentialsModifyResponseServiceServiceUriParams
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceServiceUriParams getServiceUriParams() {
        return this.serviceUriParams;
    }
    /**
     * Gets the state property value. State of the service
     * @return a ServiceUserCredentialsModifyResponseServiceState
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceState getState() {
        return this.state;
    }
    /**
     * Gets the tags property value. Set of resource tags
     * @return a ServiceUserCredentialsModifyResponseServiceTags
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceTags getTags() {
        return this.tags;
    }
    /**
     * Gets the termination_protection property value. Service is protected against termination and powering off
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the topics property value. Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead
     * @return a ServiceUserCredentialsModifyResponseServiceTopics
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceTopics> getTopics() {
        return this.topics;
    }
    /**
     * Gets the update_time property value. Service last update timestamp (ISO 8601)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceUserCredentialsModifyResponseServiceUserConfig
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsModifyResponseServiceUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Gets the users property value. List of service users
     * @return a ServiceUserCredentialsModifyResponseServiceUsers
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUserCredentialsModifyResponseServiceUsers> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcl(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceAcl> value) {
        this.acl = value;
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
     * Sets the backups property value. List of backups for the service
     * @param value Value to set for the backups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackups(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceBackups> value) {
        this.backups = value;
    }
    /**
     * Sets the cloud_description property value. Cloud provider and location
     * @param value Value to set for the cloudDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudDescription(@javax.annotation.Nullable final String value) {
        this.cloudDescription = value;
    }
    /**
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloudName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudName(@javax.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the components property value. Service component information objects
     * @param value Value to set for the components property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComponents(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceComponents> value) {
        this.components = value;
    }
    /**
     * Sets the connection_info property value. Service-specific connection information properties
     * @param value Value to set for the connectionInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionInfo(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceConnectionInfo value) {
        this.connectionInfo = value;
    }
    /**
     * Sets the connection_pools property value. PostgreSQL PGBouncer connection pools
     * @param value Value to set for the connectionPools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionPools(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceConnectionPools> value) {
        this.connectionPools = value;
    }
    /**
     * Sets the create_time property value. Service creation timestamp (ISO 8601)
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the databases property value. List of service's user database names
     * @param value Value to set for the databases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDatabases(@javax.annotation.Nullable final java.util.List<String> value) {
        this.databases = value;
    }
    /**
     * Sets the disk_space_mb property value. Megabytes of disk space for data storage
     * @param value Value to set for the diskSpaceMb property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiskSpaceMb(@javax.annotation.Nullable final Double value) {
        this.diskSpaceMb = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatures(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceFeatures value) {
        this.features = value;
    }
    /**
     * Sets the group_list property value. List of service groups the service belongs to. This field is deprecated. It is always set to single element with value 'default'
     * @param value Value to set for the groupList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.groupList = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaintenance(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the metadata property value. Service type specific metadata
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the node_count property value. Number of service nodes in the active plan
     * @param value Value to set for the nodeCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodeCount(@javax.annotation.Nullable final Integer value) {
        this.nodeCount = value;
    }
    /**
     * Sets the node_cpu_count property value. Number of CPUs for each node
     * @param value Value to set for the nodeCpuCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodeCpuCount(@javax.annotation.Nullable final Integer value) {
        this.nodeCpuCount = value;
    }
    /**
     * Sets the node_memory_mb property value. Megabytes of memory for each node
     * @param value Value to set for the nodeMemoryMb property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodeMemoryMb(@javax.annotation.Nullable final Double value) {
        this.nodeMemoryMb = value;
    }
    /**
     * Sets the node_states property value. State of individual service nodes
     * @param value Value to set for the nodeStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNodeStates(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceNodeStates> value) {
        this.nodeStates = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlan(@javax.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the project_vpc_id property value. Project VPC ID
     * @param value Value to set for the projectVpcId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectVpcId(@javax.annotation.Nullable final String value) {
        this.projectVpcId = value;
    }
    /**
     * Sets the schema_registry_acl property value. List of Schema Registry ACL entries
     * @param value Value to set for the schemaRegistryAcl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaRegistryAcl(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceSchemaRegistryAcl> value) {
        this.schemaRegistryAcl = value;
    }
    /**
     * Sets the service_integrations property value. Integrations with other services
     * @param value Value to set for the serviceIntegrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceIntegrations(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceServiceIntegrations> value) {
        this.serviceIntegrations = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the service_notifications property value. Service notifications
     * @param value Value to set for the serviceNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceNotifications(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceServiceNotifications> value) {
        this.serviceNotifications = value;
    }
    /**
     * Sets the service_type property value. Service type code
     * @param value Value to set for the serviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceType(@javax.annotation.Nullable final String value) {
        this.serviceType = value;
    }
    /**
     * Sets the service_type_description property value. Single line description of the service
     * @param value Value to set for the serviceTypeDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceTypeDescription(@javax.annotation.Nullable final String value) {
        this.serviceTypeDescription = value;
    }
    /**
     * Sets the service_uri property value. URI for connecting to the service (may be null)
     * @param value Value to set for the serviceUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceUri(@javax.annotation.Nullable final String value) {
        this.serviceUri = value;
    }
    /**
     * Sets the service_uri_params property value. service_uri parameterized into key-value pairs
     * @param value Value to set for the serviceUriParams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceUriParams(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceServiceUriParams value) {
        this.serviceUriParams = value;
    }
    /**
     * Sets the state property value. State of the service
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceState value) {
        this.state = value;
    }
    /**
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceTags value) {
        this.tags = value;
    }
    /**
     * Sets the termination_protection property value. Service is protected against termination and powering off
     * @param value Value to set for the terminationProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerminationProtection(@javax.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the topics property value. Kafka topics. DEPRECATED: Use /project/$project/service/$service/topic instead
     * @param value Value to set for the topics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopics(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceTopics> value) {
        this.topics = value;
    }
    /**
     * Sets the update_time property value. Service last update timestamp (ISO 8601)
     * @param value Value to set for the updateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateTime(@javax.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the userConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserConfig(@javax.annotation.Nullable final ServiceUserCredentialsModifyResponseServiceUserConfig value) {
        this.userConfig = value;
    }
    /**
     * Sets the users property value. List of service users
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final java.util.List<ServiceUserCredentialsModifyResponseServiceUsers> value) {
        this.users = value;
    }
}
