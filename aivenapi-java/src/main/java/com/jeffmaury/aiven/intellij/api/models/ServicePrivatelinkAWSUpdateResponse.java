package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServicePrivatelinkAWSUpdateResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrivatelinkAWSUpdateResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * AWS VPC endpoint service ID
     */
    private String awsServiceId;
    /**
     * AWS VPC endpoint service name
     */
    private String awsServiceName;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServicePrivatelinkAWSUpdateResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * ARN allowlist
     */
    private java.util.List<String> principals;
    /**
     * Privatelink resource state
     */
    private ServicePrivatelinkAWSUpdateResponseState state;
    /**
     * Instantiates a new ServicePrivatelinkAWSUpdateResponse and sets the default values.
     */
    public ServicePrivatelinkAWSUpdateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrivatelinkAWSUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public static ServicePrivatelinkAWSUpdateResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrivatelinkAWSUpdateResponse();
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
     * Gets the aws_service_id property value. AWS VPC endpoint service ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAwsServiceId() {
        return this.awsServiceId;
    }
    /**
     * Gets the aws_service_name property value. AWS VPC endpoint service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAwsServiceName() {
        return this.awsServiceName;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServicePrivatelinkAWSUpdateResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrivatelinkAWSUpdateResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("aws_service_id", (n) -> { this.setAwsServiceId(n.getStringValue()); });
        deserializerMap.put("aws_service_name", (n) -> { this.setAwsServiceName(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServicePrivatelinkAWSUpdateResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("principals", (n) -> { this.setPrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ServicePrivatelinkAWSUpdateResponseState.class)); });
        return deserializerMap;
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
     * Gets the principals property value. ARN allowlist
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPrincipals() {
        return this.principals;
    }
    /**
     * Gets the state property value. Privatelink resource state
     * @return a ServicePrivatelinkAWSUpdateResponseState
     */
    @jakarta.annotation.Nullable
    public ServicePrivatelinkAWSUpdateResponseState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the aws_service_id property value. AWS VPC endpoint service ID
     * @param value Value to set for the aws_service_id property.
     */
    public void setAwsServiceId(@jakarta.annotation.Nullable final String value) {
        this.awsServiceId = value;
    }
    /**
     * Sets the aws_service_name property value. AWS VPC endpoint service name
     * @param value Value to set for the aws_service_name property.
     */
    public void setAwsServiceName(@jakarta.annotation.Nullable final String value) {
        this.awsServiceName = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServicePrivatelinkAWSUpdateResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the principals property value. ARN allowlist
     * @param value Value to set for the principals property.
     */
    public void setPrincipals(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.principals = value;
    }
    /**
     * Sets the state property value. Privatelink resource state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ServicePrivatelinkAWSUpdateResponseState value) {
        this.state = value;
    }
}
