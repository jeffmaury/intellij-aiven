package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VpcPeeringConnectionWithResourceGroupDeleteResponse
 */
public class VpcPeeringConnectionWithResourceGroupDeleteResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** VPC peering connection creation timestamp */
    private String createTime;
    /** List of errors occurred during request processing */
    private java.util.List<VpcPeeringConnectionWithResourceGroupDeleteResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet */
    private String peerAzureAppId;
    /** Azure tenant id in UUID4 form */
    private String peerAzureTenantId;
    /** AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections */
    private String peerCloudAccount;
    /** The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds */
    private String peerRegion;
    /** Azure resource group name of the peered VPC */
    private String peerResourceGroup;
    /** AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID */
    private String peerVpc;
    /** Project VPC peering connection state */
    private VpcPeeringConnectionWithResourceGroupDeleteResponseState state;
    /** State-specific help or error information */
    private VpcPeeringConnectionWithResourceGroupDeleteResponseStateInfo stateInfo;
    /** Timestamp of last change to the VPC peering connection */
    private String updateTime;
    /** List of private IPv4 ranges to route through the peering connection */
    private java.util.List<String> userPeerNetworkCidrs;
    /** Type of network connection from the VPC */
    private VpcPeeringConnectionWithResourceGroupDeleteResponseVpcPeeringConnectionType vpcPeeringConnectionType;
    /**
     * Instantiates a new VpcPeeringConnectionWithResourceGroupDeleteResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionWithResourceGroupDeleteResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionWithResourceGroupDeleteResponse
     */
    @javax.annotation.Nonnull
    public static VpcPeeringConnectionWithResourceGroupDeleteResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionWithResourceGroupDeleteResponse();
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
     * Gets the create_time property value. VPC peering connection creation timestamp
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a VpcPeeringConnectionWithResourceGroupDeleteResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<VpcPeeringConnectionWithResourceGroupDeleteResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(VpcPeeringConnectionWithResourceGroupDeleteResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("peer_azure_app_id", (n) -> { this.setPeerAzureAppId(n.getStringValue()); });
        deserializerMap.put("peer_azure_tenant_id", (n) -> { this.setPeerAzureTenantId(n.getStringValue()); });
        deserializerMap.put("peer_cloud_account", (n) -> { this.setPeerCloudAccount(n.getStringValue()); });
        deserializerMap.put("peer_region", (n) -> { this.setPeerRegion(n.getStringValue()); });
        deserializerMap.put("peer_resource_group", (n) -> { this.setPeerResourceGroup(n.getStringValue()); });
        deserializerMap.put("peer_vpc", (n) -> { this.setPeerVpc(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VpcPeeringConnectionWithResourceGroupDeleteResponseState.class)); });
        deserializerMap.put("state_info", (n) -> { this.setStateInfo(n.getObjectValue(VpcPeeringConnectionWithResourceGroupDeleteResponseStateInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_peer_network_cidrs", (n) -> { this.setUserPeerNetworkCidrs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vpc_peering_connection_type", (n) -> { this.setVpcPeeringConnectionType(n.getEnumValue(VpcPeeringConnectionWithResourceGroupDeleteResponseVpcPeeringConnectionType.class)); });
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
     * Gets the peer_azure_app_id property value. Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerAzureAppId() {
        return this.peerAzureAppId;
    }
    /**
     * Gets the peer_azure_tenant_id property value. Azure tenant id in UUID4 form
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerAzureTenantId() {
        return this.peerAzureTenantId;
    }
    /**
     * Gets the peer_cloud_account property value. AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerCloudAccount() {
        return this.peerCloudAccount;
    }
    /**
     * Gets the peer_region property value. The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerRegion() {
        return this.peerRegion;
    }
    /**
     * Gets the peer_resource_group property value. Azure resource group name of the peered VPC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerResourceGroup() {
        return this.peerResourceGroup;
    }
    /**
     * Gets the peer_vpc property value. AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeerVpc() {
        return this.peerVpc;
    }
    /**
     * Gets the state property value. Project VPC peering connection state
     * @return a VpcPeeringConnectionWithResourceGroupDeleteResponseState
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionWithResourceGroupDeleteResponseState getState() {
        return this.state;
    }
    /**
     * Gets the state_info property value. State-specific help or error information
     * @return a VpcPeeringConnectionWithResourceGroupDeleteResponseStateInfo
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionWithResourceGroupDeleteResponseStateInfo getStateInfo() {
        return this.stateInfo;
    }
    /**
     * Gets the update_time property value. Timestamp of last change to the VPC peering connection
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserPeerNetworkCidrs() {
        return this.userPeerNetworkCidrs;
    }
    /**
     * Gets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @return a VpcPeeringConnectionWithResourceGroupDeleteResponseVpcPeeringConnectionType
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionWithResourceGroupDeleteResponseVpcPeeringConnectionType getVpcPeeringConnectionType() {
        return this.vpcPeeringConnectionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("peer_azure_app_id", this.getPeerAzureAppId());
        writer.writeStringValue("peer_azure_tenant_id", this.getPeerAzureTenantId());
        writer.writeStringValue("peer_cloud_account", this.getPeerCloudAccount());
        writer.writeStringValue("peer_region", this.getPeerRegion());
        writer.writeStringValue("peer_resource_group", this.getPeerResourceGroup());
        writer.writeStringValue("peer_vpc", this.getPeerVpc());
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("state_info", this.getStateInfo());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeCollectionOfPrimitiveValues("user_peer_network_cidrs", this.getUserPeerNetworkCidrs());
        writer.writeEnumValue("vpc_peering_connection_type", this.getVpcPeeringConnectionType());
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
     * Sets the create_time property value. VPC peering connection creation timestamp
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
    public void setErrors(@javax.annotation.Nullable final java.util.List<VpcPeeringConnectionWithResourceGroupDeleteResponseErrors> value) {
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
     * Sets the peer_azure_app_id property value. Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet
     * @param value Value to set for the peerAzureAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerAzureAppId(@javax.annotation.Nullable final String value) {
        this.peerAzureAppId = value;
    }
    /**
     * Sets the peer_azure_tenant_id property value. Azure tenant id in UUID4 form
     * @param value Value to set for the peerAzureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerAzureTenantId(@javax.annotation.Nullable final String value) {
        this.peerAzureTenantId = value;
    }
    /**
     * Sets the peer_cloud_account property value. AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections
     * @param value Value to set for the peerCloudAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerCloudAccount(@javax.annotation.Nullable final String value) {
        this.peerCloudAccount = value;
    }
    /**
     * Sets the peer_region property value. The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds
     * @param value Value to set for the peerRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerRegion(@javax.annotation.Nullable final String value) {
        this.peerRegion = value;
    }
    /**
     * Sets the peer_resource_group property value. Azure resource group name of the peered VPC
     * @param value Value to set for the peerResourceGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerResourceGroup(@javax.annotation.Nullable final String value) {
        this.peerResourceGroup = value;
    }
    /**
     * Sets the peer_vpc property value. AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID
     * @param value Value to set for the peerVpc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeerVpc(@javax.annotation.Nullable final String value) {
        this.peerVpc = value;
    }
    /**
     * Sets the state property value. Project VPC peering connection state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final VpcPeeringConnectionWithResourceGroupDeleteResponseState value) {
        this.state = value;
    }
    /**
     * Sets the state_info property value. State-specific help or error information
     * @param value Value to set for the stateInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStateInfo(@javax.annotation.Nullable final VpcPeeringConnectionWithResourceGroupDeleteResponseStateInfo value) {
        this.stateInfo = value;
    }
    /**
     * Sets the update_time property value. Timestamp of last change to the VPC peering connection
     * @param value Value to set for the updateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateTime(@javax.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @param value Value to set for the userPeerNetworkCidrs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPeerNetworkCidrs(@javax.annotation.Nullable final java.util.List<String> value) {
        this.userPeerNetworkCidrs = value;
    }
    /**
     * Sets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @param value Value to set for the vpcPeeringConnectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpcPeeringConnectionType(@javax.annotation.Nullable final VpcPeeringConnectionWithResourceGroupDeleteResponseVpcPeeringConnectionType value) {
        this.vpcPeeringConnectionType = value;
    }
}
