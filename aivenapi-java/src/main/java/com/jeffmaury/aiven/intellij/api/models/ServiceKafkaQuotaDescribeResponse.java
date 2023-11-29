package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaQuotaDescribeResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaQuotaDescribeResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceKafkaQuotaDescribeResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * kafka quota
     */
    private ServiceKafkaQuotaDescribeResponseQuota quota;
    /**
     * Instantiates a new ServiceKafkaQuotaDescribeResponse and sets the default values.
     */
    public ServiceKafkaQuotaDescribeResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaQuotaDescribeResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaQuotaDescribeResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaQuotaDescribeResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceKafkaQuotaDescribeResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaQuotaDescribeResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceKafkaQuotaDescribeResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("quota", (n) -> { this.setQuota(n.getObjectValue(ServiceKafkaQuotaDescribeResponseQuota::createFromDiscriminatorValue)); });
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
     * Gets the quota property value. kafka quota
     * @return a ServiceKafkaQuotaDescribeResponseQuota
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaQuotaDescribeResponseQuota getQuota() {
        return this.quota;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("quota", this.getQuota());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaQuotaDescribeResponseErrors> value) {
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
     * Sets the quota property value. kafka quota
     * @param value Value to set for the quota property.
     */
    public void setQuota(@jakarta.annotation.Nullable final ServiceKafkaQuotaDescribeResponseQuota value) {
        this.quota = value;
    }
}
