package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * TwoFactorAuthConfigureOTPRequestBody
 */
public class TwoFactorAuthConfigureOTPRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** One-time password */
    private String otp;
    /** Current password */
    private String password;
    /** URI describing the TOTP */
    private String uri;
    /**
     * Instantiates a new TwoFactorAuthConfigureOTPRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TwoFactorAuthConfigureOTPRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TwoFactorAuthConfigureOTPRequestBody
     */
    @javax.annotation.Nonnull
    public static TwoFactorAuthConfigureOTPRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TwoFactorAuthConfigureOTPRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("otp", (n) -> { this.setOtp(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the otp property value. One-time password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOtp() {
        return this.otp;
    }
    /**
     * Gets the password property value. Current password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this.password;
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
        writer.writeStringValue("otp", this.getOtp());
        writer.writeStringValue("password", this.getPassword());
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
     * Sets the otp property value. One-time password
     * @param value Value to set for the otp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtp(@javax.annotation.Nullable final String value) {
        this.otp = value;
    }
    /**
     * Sets the password property value. Current password
     * @param value Value to set for the password property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassword(@javax.annotation.Nullable final String value) {
        this.password = value;
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
