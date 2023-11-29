package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Intercom settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserUpdateResponseUserIntercom implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Intercom application ID
     */
    private String appId;
    /**
     * Intercom authentication HMAC
     */
    private String hmac;
    /**
     * Instantiates a new UserUpdateResponseUserIntercom and sets the default values.
     */
    public UserUpdateResponseUserIntercom() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserUpdateResponseUserIntercom
     */
    @jakarta.annotation.Nonnull
    public static UserUpdateResponseUserIntercom createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserUpdateResponseUserIntercom();
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
     * Gets the app_id property value. Intercom application ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("app_id", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("hmac", (n) -> { this.setHmac(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hmac property value. Intercom authentication HMAC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHmac() {
        return this.hmac;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("app_id", this.getAppId());
        writer.writeStringValue("hmac", this.getHmac());
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
     * Sets the app_id property value. Intercom application ID
     * @param value Value to set for the app_id property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the hmac property value. Intercom authentication HMAC
     * @param value Value to set for the hmac property.
     */
    public void setHmac(@jakarta.annotation.Nullable final String value) {
        this.hmac = value;
    }
}
