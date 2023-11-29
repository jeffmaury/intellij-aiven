package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccessTokenCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessTokenCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name / description of an access token
     */
    private String description;
    /**
     * Extend token expiration time when token is used. Only applicable if max_age_seconds is specified.
     */
    private Boolean extendWhenUsed;
    /**
     * Time the token remains valid since creation (or since last use if extend_when_used is true)
     */
    private Double maxAgeSeconds;
    /**
     * Scopes this token is restricted to, if specified
     */
    private java.util.List<String> scopes;
    /**
     * Instantiates a new AccessTokenCreateRequestBody and sets the default values.
     */
    public AccessTokenCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessTokenCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccessTokenCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessTokenCreateRequestBody();
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
     * Gets the description property value. Name / description of an access token
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the extend_when_used property value. Extend token expiration time when token is used. Only applicable if max_age_seconds is specified.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExtendWhenUsed() {
        return this.extendWhenUsed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("extend_when_used", (n) -> { this.setExtendWhenUsed(n.getBooleanValue()); });
        deserializerMap.put("max_age_seconds", (n) -> { this.setMaxAgeSeconds(n.getDoubleValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the max_age_seconds property value. Time the token remains valid since creation (or since last use if extend_when_used is true)
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    /**
     * Gets the scopes property value. Scopes this token is restricted to, if specified
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("extend_when_used", this.getExtendWhenUsed());
        writer.writeDoubleValue("max_age_seconds", this.getMaxAgeSeconds());
        writer.writeCollectionOfPrimitiveValues("scopes", this.getScopes());
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
     * Sets the description property value. Name / description of an access token
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the extend_when_used property value. Extend token expiration time when token is used. Only applicable if max_age_seconds is specified.
     * @param value Value to set for the extend_when_used property.
     */
    public void setExtendWhenUsed(@jakarta.annotation.Nullable final Boolean value) {
        this.extendWhenUsed = value;
    }
    /**
     * Sets the max_age_seconds property value. Time the token remains valid since creation (or since last use if extend_when_used is true)
     * @param value Value to set for the max_age_seconds property.
     */
    public void setMaxAgeSeconds(@jakarta.annotation.Nullable final Double value) {
        this.maxAgeSeconds = value;
    }
    /**
     * Sets the scopes property value. Scopes this token is restricted to, if specified
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.scopes = value;
    }
}
