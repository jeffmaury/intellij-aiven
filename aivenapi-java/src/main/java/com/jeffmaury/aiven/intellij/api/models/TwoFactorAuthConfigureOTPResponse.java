package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * TwoFactorAuthConfigureOTPResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TwoFactorAuthConfigureOTPResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<TwoFactorAuthConfigureOTPResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Two-factor authentication method being used, if any
     */
    private String method;
    /**
     * New API session authentication token when configuration is complete
     */
    private String token;
    /**
     * Instantiates a new TwoFactorAuthConfigureOTPResponse and sets the default values.
     */
    public TwoFactorAuthConfigureOTPResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TwoFactorAuthConfigureOTPResponse
     */
    @jakarta.annotation.Nonnull
    public static TwoFactorAuthConfigureOTPResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TwoFactorAuthConfigureOTPResponse();
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
     * @return a java.util.List<TwoFactorAuthConfigureOTPResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TwoFactorAuthConfigureOTPResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(TwoFactorAuthConfigureOTPResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
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
     * Gets the method property value. Two-factor authentication method being used, if any
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the token property value. New API session authentication token when configuration is complete
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("token", this.getToken());
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
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<TwoFactorAuthConfigureOTPResponseErrors> value) {
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
     * Sets the method property value. Two-factor authentication method being used, if any
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the token property value. New API session authentication token when configuration is complete
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
