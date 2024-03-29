package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectStaticIPPatchResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectStaticIPPatchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target cloud
     */
    private String cloudName;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ProjectStaticIPPatchResponseErrors> errors;
    /**
     * IPv4 address
     */
    private String ipAddress;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Service name
     */
    private String serviceName;
    /**
     * Static IP address state
     */
    private ProjectStaticIPPatchResponseState state;
    /**
     * Static IP address identifier
     */
    private String staticIpAddressId;
    /**
     * Static IP address is protected against deletion
     */
    private Boolean terminationProtection;
    /**
     * Instantiates a new ProjectStaticIPPatchResponse and sets the default values.
     */
    public ProjectStaticIPPatchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectStaticIPPatchResponse
     */
    @jakarta.annotation.Nonnull
    public static ProjectStaticIPPatchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectStaticIPPatchResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ProjectStaticIPPatchResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectStaticIPPatchResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ProjectStaticIPPatchResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("ip_address", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ProjectStaticIPPatchResponseState::forValue)); });
        deserializerMap.put("static_ip_address_id", (n) -> { this.setStaticIpAddressId(n.getStringValue()); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ip_address property value. IPv4 address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the state property value. Static IP address state
     * @return a ProjectStaticIPPatchResponseState
     */
    @jakarta.annotation.Nullable
    public ProjectStaticIPPatchResponseState getState() {
        return this.state;
    }
    /**
     * Gets the static_ip_address_id property value. Static IP address identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStaticIpAddressId() {
        return this.staticIpAddressId;
    }
    /**
     * Gets the termination_protection property value. Static IP address is protected against deletion
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("ip_address", this.getIpAddress());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("static_ip_address_id", this.getStaticIpAddressId());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ProjectStaticIPPatchResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the ip_address property value. IPv4 address
     * @param value Value to set for the ip_address property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the service_name property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the state property value. Static IP address state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ProjectStaticIPPatchResponseState value) {
        this.state = value;
    }
    /**
     * Sets the static_ip_address_id property value. Static IP address identifier
     * @param value Value to set for the static_ip_address_id property.
     */
    public void setStaticIpAddressId(@jakarta.annotation.Nullable final String value) {
        this.staticIpAddressId = value;
    }
    /**
     * Sets the termination_protection property value. Static IP address is protected against deletion
     * @param value Value to set for the termination_protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
}
