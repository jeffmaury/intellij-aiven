package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VpcPeeringConnectionUpdateRequestBodyAdd implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** IPv4 network range CIDR */
    private String cidr;
    /** AWS account ID, GCP project ID, Azure subscription ID of the peered VPC, or string &quot;upcloud&quot; for UpCloud peering connections */
    private String peerCloudAccount;
    /** Azure resource group name of the peered VPC */
    private String peerResourceGroup;
    /** AWS VPC ID, GCP VPC network name, Azure Virtual network name of the peered VPC, or UpCloud VPC ID */
    private String peerVpc;
    /**
     * Instantiates a new VpcPeeringConnectionUpdateRequestBodyAdd and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionUpdateRequestBodyAdd() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionUpdateRequestBodyAdd
     */
    @javax.annotation.Nonnull
    public static VpcPeeringConnectionUpdateRequestBodyAdd createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionUpdateRequestBodyAdd();
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
     * Gets the cidr property value. IPv4 network range CIDR
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCidr() {
        return this.cidr;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cidr", (n) -> { this.setCidr(n.getStringValue()); });
        deserializerMap.put("peer_cloud_account", (n) -> { this.setPeerCloudAccount(n.getStringValue()); });
        deserializerMap.put("peer_resource_group", (n) -> { this.setPeerResourceGroup(n.getStringValue()); });
        deserializerMap.put("peer_vpc", (n) -> { this.setPeerVpc(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cidr", this.getCidr());
        writer.writeStringValue("peer_cloud_account", this.getPeerCloudAccount());
        writer.writeStringValue("peer_resource_group", this.getPeerResourceGroup());
        writer.writeStringValue("peer_vpc", this.getPeerVpc());
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
     * Sets the cidr property value. IPv4 network range CIDR
     * @param value Value to set for the cidr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCidr(@javax.annotation.Nullable final String value) {
        this.cidr = value;
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
}
