package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VpcCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloudName;
    /**
     * IPv4 network range CIDR
     */
    private String networkCidr;
    /**
     * List of peering connection requests for the VPC
     */
    private java.util.List<VpcCreateRequestBodyPeeringConnections> peeringConnections;
    /**
     * Instantiates a new VpcCreateRequestBody and sets the default values.
     */
    public VpcCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VpcCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcCreateRequestBody();
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
     * Gets the cloud_name property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("network_cidr", (n) -> { this.setNetworkCidr(n.getStringValue()); });
        deserializerMap.put("peering_connections", (n) -> { this.setPeeringConnections(n.getCollectionOfObjectValues(VpcCreateRequestBodyPeeringConnections::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the network_cidr property value. IPv4 network range CIDR
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkCidr() {
        return this.networkCidr;
    }
    /**
     * Gets the peering_connections property value. List of peering connection requests for the VPC
     * @return a java.util.List<VpcCreateRequestBodyPeeringConnections>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpcCreateRequestBodyPeeringConnections> getPeeringConnections() {
        return this.peeringConnections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeStringValue("network_cidr", this.getNetworkCidr());
        writer.writeCollectionOfObjectValues("peering_connections", this.getPeeringConnections());
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
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloud_name property.
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the network_cidr property value. IPv4 network range CIDR
     * @param value Value to set for the network_cidr property.
     */
    public void setNetworkCidr(@jakarta.annotation.Nullable final String value) {
        this.networkCidr = value;
    }
    /**
     * Sets the peering_connections property value. List of peering connection requests for the VPC
     * @param value Value to set for the peering_connections property.
     */
    public void setPeeringConnections(@jakarta.annotation.Nullable final java.util.List<VpcCreateRequestBodyPeeringConnections> value) {
        this.peeringConnections = value;
    }
}
