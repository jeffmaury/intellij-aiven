package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Target cloud */
    private String cloudName;
    /** Hourly peering connection price in this cloud region */
    private String priceUsd;
    /** Type of network connection from the VPC */
    private ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypesVpcPeeringConnectionType vpcPeeringConnectionType;
    /**
     * Instantiates a new ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes
     */
    @javax.annotation.Nonnull
    public static ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypes();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("price_usd", (n) -> { this.setPriceUsd(n.getStringValue()); });
        deserializerMap.put("vpc_peering_connection_type", (n) -> { this.setVpcPeeringConnectionType(n.getEnumValue(ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypesVpcPeeringConnectionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the price_usd property value. Hourly peering connection price in this cloud region
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPriceUsd() {
        return this.priceUsd;
    }
    /**
     * Gets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @return a ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypesVpcPeeringConnectionType
     */
    @javax.annotation.Nullable
    public ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypesVpcPeeringConnectionType getVpcPeeringConnectionType() {
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
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeStringValue("price_usd", this.getPriceUsd());
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
     * Sets the cloud_name property value. Target cloud
     * @param value Value to set for the cloudName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudName(@javax.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the price_usd property value. Hourly peering connection price in this cloud region
     * @param value Value to set for the priceUsd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriceUsd(@javax.annotation.Nullable final String value) {
        this.priceUsd = value;
    }
    /**
     * Sets the vpc_peering_connection_type property value. Type of network connection from the VPC
     * @param value Value to set for the vpcPeeringConnectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpcPeeringConnectionType(@javax.annotation.Nullable final ListProjectVpcPeeringConnectionTypesResponseVpcPeeringConnectionTypesVpcPeeringConnectionType value) {
        this.vpcPeeringConnectionType = value;
    }
}
