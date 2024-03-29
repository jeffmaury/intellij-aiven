package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Credit card assigned to the project
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountProjectsListResponseProjectsCardInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Brand
     */
    private String brand;
    /**
     * Credit card ID
     */
    private String cardId;
    /**
     * Country
     */
    private String country;
    /**
     * Two letter ISO country code
     */
    private String countryCode;
    /**
     * Expiration month
     */
    private Integer expMonth;
    /**
     * Expiration year
     */
    private Integer expYear;
    /**
     * Credit card last four digits
     */
    private String last4;
    /**
     * Name on the credit card
     */
    private String name;
    /**
     * User email address
     */
    private String userEmail;
    /**
     * Instantiates a new AccountProjectsListResponseProjectsCardInfo and sets the default values.
     */
    public AccountProjectsListResponseProjectsCardInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountProjectsListResponseProjectsCardInfo
     */
    @jakarta.annotation.Nonnull
    public static AccountProjectsListResponseProjectsCardInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountProjectsListResponseProjectsCardInfo();
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
     * Gets the brand property value. Brand
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the card_id property value. Credit card ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCardId() {
        return this.cardId;
    }
    /**
     * Gets the country property value. Country
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the country_code property value. Two letter ISO country code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the exp_month property value. Expiration month
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpMonth() {
        return this.expMonth;
    }
    /**
     * Gets the exp_year property value. Expiration year
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpYear() {
        return this.expYear;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("card_id", (n) -> { this.setCardId(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("exp_month", (n) -> { this.setExpMonth(n.getIntegerValue()); });
        deserializerMap.put("exp_year", (n) -> { this.setExpYear(n.getIntegerValue()); });
        deserializerMap.put("last4", (n) -> { this.setLast4(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("user_email", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the last4 property value. Credit card last four digits
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLast4() {
        return this.last4;
    }
    /**
     * Gets the name property value. Name on the credit card
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the user_email property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeStringValue("card_id", this.getCardId());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeIntegerValue("exp_month", this.getExpMonth());
        writer.writeIntegerValue("exp_year", this.getExpYear());
        writer.writeStringValue("last4", this.getLast4());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("user_email", this.getUserEmail());
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
     * Sets the brand property value. Brand
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the card_id property value. Credit card ID
     * @param value Value to set for the card_id property.
     */
    public void setCardId(@jakarta.annotation.Nullable final String value) {
        this.cardId = value;
    }
    /**
     * Sets the country property value. Country
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the country_code property value. Two letter ISO country code
     * @param value Value to set for the country_code property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the exp_month property value. Expiration month
     * @param value Value to set for the exp_month property.
     */
    public void setExpMonth(@jakarta.annotation.Nullable final Integer value) {
        this.expMonth = value;
    }
    /**
     * Sets the exp_year property value. Expiration year
     * @param value Value to set for the exp_year property.
     */
    public void setExpYear(@jakarta.annotation.Nullable final Integer value) {
        this.expYear = value;
    }
    /**
     * Sets the last4 property value. Credit card last four digits
     * @param value Value to set for the last4 property.
     */
    public void setLast4(@jakarta.annotation.Nullable final String value) {
        this.last4 = value;
    }
    /**
     * Sets the name property value. Name on the credit card
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the user_email property value. User email address
     * @param value Value to set for the user_email property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
