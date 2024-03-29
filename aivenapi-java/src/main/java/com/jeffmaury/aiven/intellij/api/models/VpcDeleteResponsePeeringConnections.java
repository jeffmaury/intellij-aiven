package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcDeleteResponsePeeringConnections implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * VPC peering connection creation timestamp
     */
    private String createTime;
    /**
     * Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet
     */
    private String peerAzureAppId;
    /**
     * Azure tenant id in UUID4 form
     */
    private String peerAzureTenantId;
    /**
     * AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections
     */
    private String peerCloudAccount;
    /**
     * The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds
     */
    private String peerRegion;
    /**
     * Azure resource group name of the peered VPC
     */
    private String peerResourceGroup;
    /**
     * AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID
     */
    private String peerVpc;
    /**
     * Project VPC peering connection state
     */
    private VpcDeleteResponsePeeringConnectionsState state;
    /**
     * State-specific help or error information
     */
    private VpcDeleteResponsePeeringConnectionsStateInfo stateInfo;
    /**
     * Timestamp of last change to the VPC peering connection
     */
    private String updateTime;
    /**
     * List of private IPv4 ranges to route through the peering connection
     */
    private java.util.List<String> userPeerNetworkCidrs;
    /**
     * Type of network connection from the VPC
     */
    private VpcDeleteResponsePeeringConnectionsVpcPeeringConnectionType vpcPeeringConnectionType;
    /**
     * Instantiates a new VpcDeleteResponsePeeringConnections and sets the default values.
     */
    public VpcDeleteResponsePeeringConnections() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcDeleteResponsePeeringConnections
     */
    @jakarta.annotation.Nonnull
    public static VpcDeleteResponsePeeringConnections createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcDeleteResponsePeeringConnections();
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
     * Gets the create_time property value. VPC peering connection creation timestamp
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("peer_azure_app_id", (n) -> { this.setPeerAzureAppId(n.getStringValue()); });
        deserializerMap.put("peer_azure_tenant_id", (n) -> { this.setPeerAzureTenantId(n.getStringValue()); });
        deserializerMap.put("peer_cloud_account", (n) -> { this.setPeerCloudAccount(n.getStringValue()); });
        deserializerMap.put("peer_region", (n) -> { this.setPeerRegion(n.getStringValue()); });
        deserializerMap.put("peer_resource_group", (n) -> { this.setPeerResourceGroup(n.getStringValue()); });
        deserializerMap.put("peer_vpc", (n) -> { this.setPeerVpc(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VpcDeleteResponsePeeringConnectionsState::forValue)); });
        deserializerMap.put("state_info", (n) -> { this.setStateInfo(n.getObjectValue(VpcDeleteResponsePeeringConnectionsStateInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        deserializerMap.put("user_peer_network_cidrs", (n) -> { this.setUserPeerNetworkCidrs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vpc_peering_connection_type", (n) -> { this.setVpcPeeringConnectionType(n.getEnumValue(VpcDeleteResponsePeeringConnectionsVpcPeeringConnectionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the peer_azure_app_id property value. Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerAzureAppId() {
        return this.peerAzureAppId;
    }
    /**
     * Gets the peer_azure_tenant_id property value. Azure tenant id in UUID4 form
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerAzureTenantId() {
        return this.peerAzureTenantId;
    }
    /**
     * Gets the peer_cloud_account property value. AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerCloudAccount() {
        return this.peerCloudAccount;
    }
    /**
     * Gets the peer_region property value. The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerRegion() {
        return this.peerRegion;
    }
    /**
     * Gets the peer_resource_group property value. Azure resource group name of the peered VPC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerResourceGroup() {
        return this.peerResourceGroup;
    }
    /**
     * Gets the peer_vpc property value. AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeerVpc() {
        return this.peerVpc;
    }
    /**
     * Gets the state property value. Project VPC peering connection state
     * @return a VpcDeleteResponsePeeringConnectionsState
     */
    @jakarta.annotation.Nullable
    public VpcDeleteResponsePeeringConnectionsState getState() {
        return this.state;
    }
    /**
     * Gets the state_info property value. State-specific help or error information
     * @return a VpcDeleteResponsePeeringConnectionsStateInfo
     */
    @jakarta.annotation.Nullable
    public VpcDeleteResponsePeeringConnectionsStateInfo getStateInfo() {
        return this.stateInfo;
    }
    /**
     * Gets the update_time property value. Timestamp of last change to the VPC peering connection
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Gets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserPeerNetworkCidrs() {
        return this.userPeerNetworkCidrs;
    }
    /**
     * Gets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @return a VpcDeleteResponsePeeringConnectionsVpcPeeringConnectionType
     */
    @jakarta.annotation.Nullable
    public VpcDeleteResponsePeeringConnectionsVpcPeeringConnectionType getVpcPeeringConnectionType() {
        return this.vpcPeeringConnectionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("create_time", this.getCreateTime());
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the create_time property value. VPC peering connection creation timestamp
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the peer_azure_app_id property value. Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet
     * @param value Value to set for the peer_azure_app_id property.
     */
    public void setPeerAzureAppId(@jakarta.annotation.Nullable final String value) {
        this.peerAzureAppId = value;
    }
    /**
     * Sets the peer_azure_tenant_id property value. Azure tenant id in UUID4 form
     * @param value Value to set for the peer_azure_tenant_id property.
     */
    public void setPeerAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.peerAzureTenantId = value;
    }
    /**
     * Sets the peer_cloud_account property value. AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections
     * @param value Value to set for the peer_cloud_account property.
     */
    public void setPeerCloudAccount(@jakarta.annotation.Nullable final String value) {
        this.peerCloudAccount = value;
    }
    /**
     * Sets the peer_region property value. The peer VPC's region in AWS clouds. Always null in GCP, Azure, or UpCloud clouds
     * @param value Value to set for the peer_region property.
     */
    public void setPeerRegion(@jakarta.annotation.Nullable final String value) {
        this.peerRegion = value;
    }
    /**
     * Sets the peer_resource_group property value. Azure resource group name of the peered VPC
     * @param value Value to set for the peer_resource_group property.
     */
    public void setPeerResourceGroup(@jakarta.annotation.Nullable final String value) {
        this.peerResourceGroup = value;
    }
    /**
     * Sets the peer_vpc property value. AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID
     * @param value Value to set for the peer_vpc property.
     */
    public void setPeerVpc(@jakarta.annotation.Nullable final String value) {
        this.peerVpc = value;
    }
    /**
     * Sets the state property value. Project VPC peering connection state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final VpcDeleteResponsePeeringConnectionsState value) {
        this.state = value;
    }
    /**
     * Sets the state_info property value. State-specific help or error information
     * @param value Value to set for the state_info property.
     */
    public void setStateInfo(@jakarta.annotation.Nullable final VpcDeleteResponsePeeringConnectionsStateInfo value) {
        this.stateInfo = value;
    }
    /**
     * Sets the update_time property value. Timestamp of last change to the VPC peering connection
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
    /**
     * Sets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @param value Value to set for the user_peer_network_cidrs property.
     */
    public void setUserPeerNetworkCidrs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userPeerNetworkCidrs = value;
    }
    /**
     * Sets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @param value Value to set for the vpc_peering_connection_type property.
     */
    public void setVpcPeeringConnectionType(@jakarta.annotation.Nullable final VpcDeleteResponsePeeringConnectionsVpcPeeringConnectionType value) {
        this.vpcPeeringConnectionType = value;
    }
}
