package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrivatelinkAWSConnectionListResponseConnections implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * AWS VPC Endpoint DNS name
     */
    private String dnsName;
    /**
     * Privatelink connection ID
     */
    private String privatelinkConnectionId;
    /**
     * Privatelink connection state
     */
    private ServicePrivatelinkAWSConnectionListResponseConnectionsState state;
    /**
     * AWS VPC Endpoint ID
     */
    private String vpcEndpointId;
    /**
     * Instantiates a new ServicePrivatelinkAWSConnectionListResponseConnections and sets the default values.
     */
    public ServicePrivatelinkAWSConnectionListResponseConnections() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAWSConnectionListResponseConnections
     */
    @jakarta.annotation.Nonnull
    public static ServicePrivatelinkAWSConnectionListResponseConnections createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAWSConnectionListResponseConnections();
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
     * Gets the dns_name property value. AWS VPC Endpoint DNS name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDnsName() {
        return this.dnsName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dns_name", (n) -> { this.setDnsName(n.getStringValue()); });
        deserializerMap.put("privatelink_connection_id", (n) -> { this.setPrivatelinkConnectionId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAWSConnectionListResponseConnectionsState::forValue)); });
        deserializerMap.put("vpc_endpoint_id", (n) -> { this.setVpcEndpointId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the privatelink_connection_id property value. Privatelink connection ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivatelinkConnectionId() {
        return this.privatelinkConnectionId;
    }
    /**
     * Gets the state property value. Privatelink connection state
     * @return a ServicePrivatelinkAWSConnectionListResponseConnectionsState
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSConnectionListResponseConnectionsState getState() {
        return this.state;
    }
    /**
     * Gets the vpc_endpoint_id property value. AWS VPC Endpoint ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dns_name", this.getDnsName());
        writer.writeStringValue("privatelink_connection_id", this.getPrivatelinkConnectionId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("vpc_endpoint_id", this.getVpcEndpointId());
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
     * Sets the dns_name property value. AWS VPC Endpoint DNS name
     * @param value Value to set for the dns_name property.
     */
    public void setDnsName(@jakarta.annotation.Nullable final String value) {
        this.dnsName = value;
    }
    /**
     * Sets the privatelink_connection_id property value. Privatelink connection ID
     * @param value Value to set for the privatelink_connection_id property.
     */
    public void setPrivatelinkConnectionId(@jakarta.annotation.Nullable final String value) {
        this.privatelinkConnectionId = value;
    }
    /**
     * Sets the state property value. Privatelink connection state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServicePrivatelinkAWSConnectionListResponseConnectionsState value) {
        this.state = value;
    }
    /**
     * Sets the vpc_endpoint_id property value. AWS VPC Endpoint ID
     * @param value Value to set for the vpc_endpoint_id property.
     */
    public void setVpcEndpointId(@jakarta.annotation.Nullable final String value) {
        this.vpcEndpointId = value;
    }
}
