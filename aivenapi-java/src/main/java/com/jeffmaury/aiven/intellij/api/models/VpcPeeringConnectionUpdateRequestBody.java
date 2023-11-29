package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VpcPeeringConnectionUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcPeeringConnectionUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * CIDRs to add using a specific peering connection
     */
    private java.util.List<VpcPeeringConnectionUpdateRequestBodyAdd> add;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Network CIDRs to remove from the VPC's peering connections' user_peer_network_cidrs
     */
    private java.util.List<String> delete;
    /**
     * Instantiates a new VpcPeeringConnectionUpdateRequestBody and sets the default values.
     */
    public VpcPeeringConnectionUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VpcPeeringConnectionUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionUpdateRequestBody();
    }
    /**
     * Gets the add property value. CIDRs to add using a specific peering connection
     * @return a java.util.List<VpcPeeringConnectionUpdateRequestBodyAdd>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpcPeeringConnectionUpdateRequestBodyAdd> getAdd() {
        return this.add;
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
     * Gets the delete property value. Network CIDRs to remove from the VPC's peering connections' user_peer_network_cidrs
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDelete() {
        return this.delete;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("add", (n) -> { this.setAdd(n.getCollectionOfObjectValues(VpcPeeringConnectionUpdateRequestBodyAdd::createFromDiscriminatorValue)); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("add", this.getAdd());
        writer.writeCollectionOfPrimitiveValues("delete", this.getDelete());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the add property value. CIDRs to add using a specific peering connection
     * @param value Value to set for the add property.
     */
    public void setAdd(@jakarta.annotation.Nullable final java.util.List<VpcPeeringConnectionUpdateRequestBodyAdd> value) {
        this.add = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the delete property value. Network CIDRs to remove from the VPC's peering connections' user_peer_network_cidrs
     * @param value Value to set for the delete property.
     */
    public void setDelete(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.delete = value;
    }
}
