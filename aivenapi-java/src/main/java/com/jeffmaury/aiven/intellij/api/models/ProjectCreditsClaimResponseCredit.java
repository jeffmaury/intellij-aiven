package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Assigned credit
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectCreditsClaimResponseCredit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Credit code
     */
    private String code;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String expireTime;
    /**
     * Remaining credit value
     */
    private String remainingValue;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String startTime;
    /**
     * Credit type
     */
    private ProjectCreditsClaimResponseCreditType type;
    /**
     * Original credit value, or for expired credits, the consumed credit value
     */
    private String value;
    /**
     * Instantiates a new ProjectCreditsClaimResponseCredit and sets the default values.
     */
    public ProjectCreditsClaimResponseCredit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectCreditsClaimResponseCredit
     */
    @jakarta.annotation.Nonnull
    public static ProjectCreditsClaimResponseCredit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectCreditsClaimResponseCredit();
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
     * Gets the code property value. Credit code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the expire_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("expire_time", (n) -> { this.setExpireTime(n.getStringValue()); });
        deserializerMap.put("remaining_value", (n) -> { this.setRemainingValue(n.getStringValue()); });
        deserializerMap.put("start_time", (n) -> { this.setStartTime(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ProjectCreditsClaimResponseCreditType::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remaining_value property value. Remaining credit value
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemainingValue() {
        return this.remainingValue;
    }
    /**
     * Gets the start_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Gets the type property value. Credit type
     * @return a ProjectCreditsClaimResponseCreditType
     */
    @jakarta.annotation.Nullable
    public ProjectCreditsClaimResponseCreditType getType() {
        return this.type;
    }
    /**
     * Gets the value property value. Original credit value, or for expired credits, the consumed credit value
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("expire_time", this.getExpireTime());
        writer.writeStringValue("remaining_value", this.getRemainingValue());
        writer.writeStringValue("start_time", this.getStartTime());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the code property value. Credit code
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the expire_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the expire_time property.
     */
    public void setExpireTime(@jakarta.annotation.Nullable final String value) {
        this.expireTime = value;
    }
    /**
     * Sets the remaining_value property value. Remaining credit value
     * @param value Value to set for the remaining_value property.
     */
    public void setRemainingValue(@jakarta.annotation.Nullable final String value) {
        this.remainingValue = value;
    }
    /**
     * Sets the start_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the start_time property.
     */
    public void setStartTime(@jakarta.annotation.Nullable final String value) {
        this.startTime = value;
    }
    /**
     * Sets the type property value. Credit type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ProjectCreditsClaimResponseCreditType value) {
        this.type = value;
    }
    /**
     * Sets the value property value. Original credit value, or for expired credits, the consumed credit value
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
