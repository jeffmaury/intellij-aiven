package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * TwoFactorAuthConfigureResponse
 */
public class TwoFactorAuthConfigureResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<TwoFactorAuthConfigureResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** Two-factor authentication method being used, if any */
    private String method;
    /** QR code describing the TOTP as a base64-encoded PNG */
    private String qrcode;
    /** URI describing the TOTP */
    private String uri;
    /**
     * Instantiates a new TwoFactorAuthConfigureResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TwoFactorAuthConfigureResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TwoFactorAuthConfigureResponse
     */
    @javax.annotation.Nonnull
    public static TwoFactorAuthConfigureResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TwoFactorAuthConfigureResponse();
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
     * @return a TwoFactorAuthConfigureResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<TwoFactorAuthConfigureResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(TwoFactorAuthConfigureResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("qrcode", (n) -> { this.setQrcode(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
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
     * Gets the method property value. Two-factor authentication method being used, if any
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the qrcode property value. QR code describing the TOTP as a base64-encoded PNG
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQrcode() {
        return this.qrcode;
    }
    /**
     * Gets the uri property value. URI describing the TOTP
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUri() {
        return this.uri;
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
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("qrcode", this.getQrcode());
        writer.writeStringValue("uri", this.getUri());
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
    public void setErrors(@javax.annotation.Nullable final java.util.List<TwoFactorAuthConfigureResponseErrors> value) {
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
     * Sets the method property value. Two-factor authentication method being used, if any
     * @param value Value to set for the method property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethod(@javax.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the qrcode property value. QR code describing the TOTP as a base64-encoded PNG
     * @param value Value to set for the qrcode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQrcode(@javax.annotation.Nullable final String value) {
        this.qrcode = value;
    }
    /**
     * Sets the uri property value. URI describing the TOTP
     * @param value Value to set for the uri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUri(@javax.annotation.Nullable final String value) {
        this.uri = value;
    }
}
