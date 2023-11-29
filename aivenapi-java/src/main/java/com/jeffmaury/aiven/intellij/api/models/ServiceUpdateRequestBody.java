package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceUpdateRequestBody
 */
public class ServiceUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Target cloud */
    private String cloud;
    /** Megabytes of disk space for data storage */
    private Double diskSpaceMb;
    /** Service group name (DEPRECATED: do not use) */
    private String groupName;
    /** Switch the service to use Karapace for schema registry and REST proxy */
    private Boolean karapace;
    /** Automatic maintenance settings */
    private ServiceUpdateRequestBodyMaintenance maintenance;
    /** Subscription plan */
    private String plan;
    /** Power-on the service (true) or power-off (false) */
    private Boolean powered;
    /** Project VPC ID */
    private String projectVpcId;
    /** Enable or disable Schema Registry authorization */
    private Boolean schemaRegistryAuthz;
    /** Service is protected against termination and powering off */
    private Boolean terminationProtection;
    /** Service type-specific settings */
    private ServiceUpdateRequestBodyUserConfig userConfig;
    /**
     * Instantiates a new ServiceUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateRequestBody();
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
     * Gets the cloud property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloud() {
        return this.cloud;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("disk_space_mb", (n) -> { this.setDiskSpaceMb(n.getDoubleValue()); });
        deserializerMap.put("group_name", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("karapace", (n) -> { this.setKarapace(n.getBooleanValue()); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(ServiceUpdateRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("powered", (n) -> { this.setPowered(n.getBooleanValue()); });
        deserializerMap.put("project_vpc_id", (n) -> { this.setProjectVpcId(n.getStringValue()); });
        deserializerMap.put("schema_registry_authz", (n) -> { this.setSchemaRegistryAuthz(n.getBooleanValue()); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceUpdateRequestBodyUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group_name property value. Service group name (DEPRECATED: do not use)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Gets the karapace property value. Switch the service to use Karapace for schema registry and REST proxy
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKarapace() {
        return this.karapace;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a ServiceUpdateRequestBodyMaintenance
     */
    @javax.annotation.Nullable
    public ServiceUpdateRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
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
     * Gets the powered property value. Power-on the service (true) or power-off (false)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowered() {
        return this.powered;
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
     * Gets the schema_registry_authz property value. Enable or disable Schema Registry authorization
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSchemaRegistryAuthz() {
        return this.schemaRegistryAuthz;
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
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceUpdateRequestBodyUserConfig
     */
    @javax.annotation.Nullable
    public ServiceUpdateRequestBodyUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeDoubleValue("disk_space_mb", this.getDiskSpaceMb());
        writer.writeStringValue("group_name", this.getGroupName());
        writer.writeBooleanValue("karapace", this.getKarapace());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeBooleanValue("powered", this.getPowered());
        writer.writeStringValue("project_vpc_id", this.getProjectVpcId());
        writer.writeBooleanValue("schema_registry_authz", this.getSchemaRegistryAuthz());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
        writer.writeObjectValue("user_config", this.getUserConfig());
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
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloud(@javax.annotation.Nullable final String value) {
        this.cloud = value;
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
     * Sets the group_name property value. Service group name (DEPRECATED: do not use)
     * @param value Value to set for the groupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupName(@javax.annotation.Nullable final String value) {
        this.groupName = value;
    }
    /**
     * Sets the karapace property value. Switch the service to use Karapace for schema registry and REST proxy
     * @param value Value to set for the karapace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKarapace(@javax.annotation.Nullable final Boolean value) {
        this.karapace = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaintenance(@javax.annotation.Nullable final ServiceUpdateRequestBodyMaintenance value) {
        this.maintenance = value;
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
     * Sets the powered property value. Power-on the service (true) or power-off (false)
     * @param value Value to set for the powered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowered(@javax.annotation.Nullable final Boolean value) {
        this.powered = value;
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
     * Sets the schema_registry_authz property value. Enable or disable Schema Registry authorization
     * @param value Value to set for the schemaRegistryAuthz property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchemaRegistryAuthz(@javax.annotation.Nullable final Boolean value) {
        this.schemaRegistryAuthz = value;
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
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the userConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserConfig(@javax.annotation.Nullable final ServiceUpdateRequestBodyUserConfig value) {
        this.userConfig = value;
    }
}
