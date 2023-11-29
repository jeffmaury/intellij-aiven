package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKmsGetKeypairResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKmsGetKeypairResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * PEM encoded certificate
     */
    private String certificate;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceKmsGetKeypairResponseErrors> errors;
    /**
     * PEM encoded private key
     */
    private String key;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Instantiates a new ServiceKmsGetKeypairResponse and sets the default values.
     */
    public ServiceKmsGetKeypairResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKmsGetKeypairResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceKmsGetKeypairResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKmsGetKeypairResponse();
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
     * Gets the certificate property value. PEM encoded certificate
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceKmsGetKeypairResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKmsGetKeypairResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceKmsGetKeypairResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. PEM encoded private key
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the certificate property value. PEM encoded certificate
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceKmsGetKeypairResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the key property value. PEM encoded private key
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
