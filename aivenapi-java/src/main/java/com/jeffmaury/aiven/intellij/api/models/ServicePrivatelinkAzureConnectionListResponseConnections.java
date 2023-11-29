package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePrivatelinkAzureConnectionListResponseConnections implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Azure private endpoint ID */
    private String privateEndpointId;
    /** Privatelink connection ID */
    private String privatelinkConnectionId;
    /** Privatelink connection state */
    private ServicePrivatelinkAzureConnectionListResponseConnectionsState state;
    /** (Private) IP address of Privatelink endpoint */
    private String userIpAddress;
    /**
     * Instantiates a new ServicePrivatelinkAzureConnectionListResponseConnections and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAzureConnectionListResponseConnections() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAzureConnectionListResponseConnections
     */
    @javax.annotation.Nonnull
    public static ServicePrivatelinkAzureConnectionListResponseConnections createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAzureConnectionListResponseConnections();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("private_endpoint_id", (n) -> { this.setPrivateEndpointId(n.getStringValue()); });
        deserializerMap.put("privatelink_connection_id", (n) -> { this.setPrivatelinkConnectionId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAzureConnectionListResponseConnectionsState.class)); });
        deserializerMap.put("user_ip_address", (n) -> { this.setUserIpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the private_endpoint_id property value. Azure private endpoint ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivateEndpointId() {
        return this.privateEndpointId;
    }
    /**
     * Gets the privatelink_connection_id property value. Privatelink connection ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivatelinkConnectionId() {
        return this.privatelinkConnectionId;
    }
    /**
     * Gets the state property value. Privatelink connection state
     * @return a ServicePrivatelinkAzureConnectionListResponseConnectionsState
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAzureConnectionListResponseConnectionsState getState() {
        return this.state;
    }
    /**
     * Gets the user_ip_address property value. (Private) IP address of Privatelink endpoint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserIpAddress() {
        return this.userIpAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("private_endpoint_id", this.getPrivateEndpointId());
        writer.writeStringValue("privatelink_connection_id", this.getPrivatelinkConnectionId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("user_ip_address", this.getUserIpAddress());
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
     * Sets the private_endpoint_id property value. Azure private endpoint ID
     * @param value Value to set for the privateEndpointId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivateEndpointId(@javax.annotation.Nullable final String value) {
        this.privateEndpointId = value;
    }
    /**
     * Sets the privatelink_connection_id property value. Privatelink connection ID
     * @param value Value to set for the privatelinkConnectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivatelinkConnectionId(@javax.annotation.Nullable final String value) {
        this.privatelinkConnectionId = value;
    }
    /**
     * Sets the state property value. Privatelink connection state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServicePrivatelinkAzureConnectionListResponseConnectionsState value) {
        this.state = value;
    }
    /**
     * Sets the user_ip_address property value. (Private) IP address of Privatelink endpoint
     * @param value Value to set for the userIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserIpAddress(@javax.annotation.Nullable final String value) {
        this.userIpAddress = value;
    }
}
