package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Password strength
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CheckPasswordStrengthExistingUserResponsePasswordStrength implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True if the password is acceptable
     */
    private Boolean isAcceptable;
    /**
     * Password strength message
     */
    private String message;
    /**
     * Password strength score
     */
    private Integer score;
    /**
     * Instantiates a new CheckPasswordStrengthExistingUserResponsePasswordStrength and sets the default values.
     */
    public CheckPasswordStrengthExistingUserResponsePasswordStrength() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CheckPasswordStrengthExistingUserResponsePasswordStrength
     */
    @jakarta.annotation.Nonnull
    public static CheckPasswordStrengthExistingUserResponsePasswordStrength createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CheckPasswordStrengthExistingUserResponsePasswordStrength();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("is_acceptable", (n) -> { this.setIsAcceptable(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_acceptable property value. True if the password is acceptable
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAcceptable() {
        return this.isAcceptable;
    }
    /**
     * Gets the message property value. Password strength message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the score property value. Password strength score
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScore() {
        return this.score;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("is_acceptable", this.getIsAcceptable());
        writer.writeStringValue("message", this.getMessage());
        writer.writeIntegerValue("score", this.getScore());
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
     * Sets the is_acceptable property value. True if the password is acceptable
     * @param value Value to set for the is_acceptable property.
     */
    public void setIsAcceptable(@jakarta.annotation.Nullable final Boolean value) {
        this.isAcceptable = value;
    }
    /**
     * Sets the message property value. Password strength message
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the score property value. Password strength score
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Integer value) {
        this.score = value;
    }
}
