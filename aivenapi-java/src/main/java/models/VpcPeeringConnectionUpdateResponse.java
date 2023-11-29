package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VpcPeeringConnectionUpdateResponse
 */
public class VpcPeeringConnectionUpdateResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Target cloud */
    private String cloudName;
    /** VPC creation timestamp */
    private String createTime;
    /** List of errors occurred during request processing */
    private java.util.List<VpcPeeringConnectionUpdateResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** IPv4 network range CIDR */
    private String networkCidr;
    /** List of peering connections */
    private java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnections> peeringConnections;
    /** VPC rebuild is scheduled */
    private String pendingBuildOnlyPeeringConnections;
    /** Project VPC ID */
    private String projectVpcId;
    /** Project VPC state */
    private VpcPeeringConnectionUpdateResponseState state;
    /** Timestamp of last change to VPC */
    private String updateTime;
    /**
     * Instantiates a new VpcPeeringConnectionUpdateResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionUpdateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionUpdateResponse
     */
    @javax.annotation.Nonnull
    public static VpcPeeringConnectionUpdateResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionUpdateResponse();
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
     * Gets the cloud_name property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * Gets the create_time property value. VPC creation timestamp
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a VpcPeeringConnectionUpdateResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<VpcPeeringConnectionUpdateResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(VpcPeeringConnectionUpdateResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("network_cidr", (n) -> { this.setNetworkCidr(n.getStringValue()); });
        deserializerMap.put("peering_connections", (n) -> { this.setPeeringConnections(n.getCollectionOfObjectValues(VpcPeeringConnectionUpdateResponsePeeringConnections::createFromDiscriminatorValue)); });
        deserializerMap.put("pending_build_only_peering_connections", (n) -> { this.setPendingBuildOnlyPeeringConnections(n.getStringValue()); });
        deserializerMap.put("project_vpc_id", (n) -> { this.setProjectVpcId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VpcPeeringConnectionUpdateResponseState.class)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the network_cidr property value. IPv4 network range CIDR
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkCidr() {
        return this.networkCidr;
    }
    /**
     * Gets the peering_connections property value. List of peering connections
     * @return a VpcPeeringConnectionUpdateResponsePeeringConnections
     */
    @javax.annotation.Nullable
    public java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnections> getPeeringConnections() {
        return this.peeringConnections;
    }
    /**
     * Gets the pending_build_only_peering_connections property value. VPC rebuild is scheduled
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPendingBuildOnlyPeeringConnections() {
        return this.pendingBuildOnlyPeeringConnections;
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
     * Gets the state property value. Project VPC state
     * @return a VpcPeeringConnectionUpdateResponseState
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionUpdateResponseState getState() {
        return this.state;
    }
    /**
     * Gets the update_time property value. Timestamp of last change to VPC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("network_cidr", this.getNetworkCidr());
        writer.writeCollectionOfObjectValues("peering_connections", this.getPeeringConnections());
        writer.writeStringValue("pending_build_only_peering_connections", this.getPendingBuildOnlyPeeringConnections());
        writer.writeStringValue("project_vpc_id", this.getProjectVpcId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("update_time", this.getUpdateTime());
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
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloudName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudName(@javax.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the create_time property value. VPC creation timestamp
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<VpcPeeringConnectionUpdateResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the network_cidr property value. IPv4 network range CIDR
     * @param value Value to set for the networkCidr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkCidr(@javax.annotation.Nullable final String value) {
        this.networkCidr = value;
    }
    /**
     * Sets the peering_connections property value. List of peering connections
     * @param value Value to set for the peeringConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeeringConnections(@javax.annotation.Nullable final java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnections> value) {
        this.peeringConnections = value;
    }
    /**
     * Sets the pending_build_only_peering_connections property value. VPC rebuild is scheduled
     * @param value Value to set for the pendingBuildOnlyPeeringConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingBuildOnlyPeeringConnections(@javax.annotation.Nullable final String value) {
        this.pendingBuildOnlyPeeringConnections = value;
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
     * Sets the state property value. Project VPC state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final VpcPeeringConnectionUpdateResponseState value) {
        this.state = value;
    }
    /**
     * Sets the update_time property value. Timestamp of last change to VPC
     * @param value Value to set for the updateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateTime(@javax.annotation.Nullable final String value) {
        this.updateTime = value;
    }
}
