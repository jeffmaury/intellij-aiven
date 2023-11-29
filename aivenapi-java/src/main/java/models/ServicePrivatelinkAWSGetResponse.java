package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServicePrivatelinkAWSGetResponse
 */
public class ServicePrivatelinkAWSGetResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** AWS VPC endpoint service ID */
    private String awsServiceId;
    /** AWS VPC endpoint service name */
    private String awsServiceName;
    /** List of errors occurred during request processing */
    private java.util.List<ServicePrivatelinkAWSGetResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** ARN allowlist */
    private java.util.List<String> principals;
    /** Privatelink resource state */
    private ServicePrivatelinkAWSGetResponseState state;
    /**
     * Instantiates a new ServicePrivatelinkAWSGetResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAWSGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAWSGetResponse
     */
    @javax.annotation.Nonnull
    public static ServicePrivatelinkAWSGetResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAWSGetResponse();
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
     * Gets the aws_service_id property value. AWS VPC endpoint service ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAwsServiceId() {
        return this.awsServiceId;
    }
    /**
     * Gets the aws_service_name property value. AWS VPC endpoint service name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAwsServiceName() {
        return this.awsServiceName;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a ServicePrivatelinkAWSGetResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrivatelinkAWSGetResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("aws_service_id", (n) -> { this.setAwsServiceId(n.getStringValue()); });
        deserializerMap.put("aws_service_name", (n) -> { this.setAwsServiceName(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServicePrivatelinkAWSGetResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("principals", (n) -> { this.setPrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAWSGetResponseState.class)); });
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
     * Gets the principals property value. ARN allowlist
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPrincipals() {
        return this.principals;
    }
    /**
     * Gets the state property value. Privatelink resource state
     * @return a ServicePrivatelinkAWSGetResponseState
     */
    @javax.annotation.Nullable
    public ServicePrivatelinkAWSGetResponseState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aws_service_id", this.getAwsServiceId());
        writer.writeStringValue("aws_service_name", this.getAwsServiceName());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfPrimitiveValues("principals", this.getPrincipals());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the aws_service_id property value. AWS VPC endpoint service ID
     * @param value Value to set for the awsServiceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAwsServiceId(@javax.annotation.Nullable final String value) {
        this.awsServiceId = value;
    }
    /**
     * Sets the aws_service_name property value. AWS VPC endpoint service name
     * @param value Value to set for the awsServiceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAwsServiceName(@javax.annotation.Nullable final String value) {
        this.awsServiceName = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServicePrivatelinkAWSGetResponseErrors> value) {
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
     * Sets the principals property value. ARN allowlist
     * @param value Value to set for the principals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipals(@javax.annotation.Nullable final java.util.List<String> value) {
        this.principals = value;
    }
    /**
     * Sets the state property value. Privatelink resource state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ServicePrivatelinkAWSGetResponseState value) {
        this.state = value;
    }
}
