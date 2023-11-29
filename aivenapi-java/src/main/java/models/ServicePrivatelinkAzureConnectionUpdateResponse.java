package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServicePrivatelinkAzureConnectionUpdateResponse
 */
public class ServicePrivatelinkAzureConnectionUpdateResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<ServicePrivatelinkAzureConnectionUpdateResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** Azure private endpoint ID */
    private String privateEndpointId;
    /** Privatelink connection ID */
    private String privatelinkConnectionId;
    /** Privatelink connection state */
    private ServicePrivatelinkAzureConnectionUpdateResponseState state;
    /** (Private) IP address of Privatelink endpoint */
    private String userIpAddress;
    /**
     * Instantiates a new ServicePrivatelinkAzureConnectionUpdateResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAzureConnectionUpdateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAzureConnectionUpdateResponse
     */
    @javax.annotation.Nonnull
    public static ServicePrivatelinkAzureConnectionUpdateResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAzureConnectionUpdateResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServicePrivatelinkAzureConnectionUpdateResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrivatelinkAzureConnectionUpdateResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServicePrivatelinkAzureConnectionUpdateResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("private_endpoint_id", (n) -> { this.setPrivateEndpointId(n.getStringValue()); });
        deserializerMap.put("privatelink_connection_id", (n) -> { this.setPrivatelinkConnectionId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAzureConnectionUpdateResponseState.class)); });
        deserializerMap.put("user_ip_address", (n) -> { this.setUserIpAddress(n.getStringValue()); });
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
     * @return a ServicePrivatelinkAzureConnectionUpdateResponseState
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAzureConnectionUpdateResponseState getState() {
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
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServicePrivatelinkAzureConnectionUpdateResponseErrors> value) {
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
    public void setState(@javax.annotation.Nullable final ServicePrivatelinkAzureConnectionUpdateResponseState value) {
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
