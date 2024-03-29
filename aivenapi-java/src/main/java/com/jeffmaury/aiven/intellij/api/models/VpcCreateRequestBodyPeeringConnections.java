package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcCreateRequestBodyPeeringConnections implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
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
     * The peer VPC's region on AWS. May be omitted or set to null if the peer is in the same region as the Aiven project VPC. Omit or set to null on GCP, Azure, or UpCloud.
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
     * List of private IPv4 ranges to route through the peering connection
     */
    private java.util.List<String> userPeerNetworkCidrs;
    /**
     * Instantiates a new VpcCreateRequestBodyPeeringConnections and sets the default values.
     */
    public VpcCreateRequestBodyPeeringConnections() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcCreateRequestBodyPeeringConnections
     */
    @jakarta.annotation.Nonnull
    public static VpcCreateRequestBodyPeeringConnections createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcCreateRequestBodyPeeringConnections();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("peer_azure_app_id", (n) -> { this.setPeerAzureAppId(n.getStringValue()); });
        deserializerMap.put("peer_azure_tenant_id", (n) -> { this.setPeerAzureTenantId(n.getStringValue()); });
        deserializerMap.put("peer_cloud_account", (n) -> { this.setPeerCloudAccount(n.getStringValue()); });
        deserializerMap.put("peer_region", (n) -> { this.setPeerRegion(n.getStringValue()); });
        deserializerMap.put("peer_resource_group", (n) -> { this.setPeerResourceGroup(n.getStringValue()); });
        deserializerMap.put("peer_vpc", (n) -> { this.setPeerVpc(n.getStringValue()); });
        deserializerMap.put("user_peer_network_cidrs", (n) -> { this.setUserPeerNetworkCidrs(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the peer_region property value. The peer VPC's region on AWS. May be omitted or set to null if the peer is in the same region as the Aiven project VPC. Omit or set to null on GCP, Azure, or UpCloud.
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
     * Gets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserPeerNetworkCidrs() {
        return this.userPeerNetworkCidrs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("peer_azure_app_id", this.getPeerAzureAppId());
        writer.writeStringValue("peer_azure_tenant_id", this.getPeerAzureTenantId());
        writer.writeStringValue("peer_cloud_account", this.getPeerCloudAccount());
        writer.writeStringValue("peer_region", this.getPeerRegion());
        writer.writeStringValue("peer_resource_group", this.getPeerResourceGroup());
        writer.writeStringValue("peer_vpc", this.getPeerVpc());
        writer.writeCollectionOfPrimitiveValues("user_peer_network_cidrs", this.getUserPeerNetworkCidrs());
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
     * Sets the peer_region property value. The peer VPC's region on AWS. May be omitted or set to null if the peer is in the same region as the Aiven project VPC. Omit or set to null on GCP, Azure, or UpCloud.
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
     * Sets the user_peer_network_cidrs property value. List of private IPv4 ranges to route through the peering connection
     * @param value Value to set for the user_peer_network_cidrs property.
     */
    public void setUserPeerNetworkCidrs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userPeerNetworkCidrs = value;
    }
}
