package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StaticIPListResponseStaticIps implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Target cloud */
    private String cloudName;
    /** IPv4 address */
    private String ipAddress;
    /** Service name */
    private String serviceName;
    /** Static IP address state */
    private StaticIPListResponseStaticIpsState state;
    /** Static IP address identifier */
    private String staticIpAddressId;
    /** Static IP address is protected against deletion */
    private Boolean terminationProtection;
    /**
     * Instantiates a new StaticIPListResponseStaticIps and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public StaticIPListResponseStaticIps() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StaticIPListResponseStaticIps
     */
    @javax.annotation.Nonnull
    public static StaticIPListResponseStaticIps createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaticIPListResponseStaticIps();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("ip_address", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(StaticIPListResponseStaticIpsState.class)); });
        deserializerMap.put("static_ip_address_id", (n) -> { this.setStaticIpAddressId(n.getStringValue()); });
        deserializerMap.put("termination_protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ip_address property value. IPv4 address
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the service_name property value. Service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the state property value. Static IP address state
     * @return a StaticIPListResponseStaticIpsState
     */
    @javax.annotation.Nullable
    public StaticIPListResponseStaticIpsState getState() {
        return this.state;
    }
    /**
     * Gets the static_ip_address_id property value. Static IP address identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStaticIpAddressId() {
        return this.staticIpAddressId;
    }
    /**
     * Gets the termination_protection property value. Static IP address is protected against deletion
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
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
        writer.writeStringValue("ip_address", this.getIpAddress());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("static_ip_address_id", this.getStaticIpAddressId());
        writer.writeBooleanValue("termination_protection", this.getTerminationProtection());
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
     * Sets the ip_address property value. IPv4 address
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the service_name property value. Service name
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the state property value. Static IP address state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final StaticIPListResponseStaticIpsState value) {
        this.state = value;
    }
    /**
     * Sets the static_ip_address_id property value. Static IP address identifier
     * @param value Value to set for the staticIpAddressId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStaticIpAddressId(@javax.annotation.Nullable final String value) {
        this.staticIpAddressId = value;
    }
    /**
     * Sets the termination_protection property value. Static IP address is protected against deletion
     * @param value Value to set for the terminationProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerminationProtection(@javax.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
}
