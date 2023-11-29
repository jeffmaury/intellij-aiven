package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BillingGroupUpdateRequestBody
 */
public class BillingGroupUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Account ID */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Address lines */
    private java.util.List<String> addressLines;
    /** Billing currency */
    private BillingGroupUpdateRequestBodyBillingCurrency billingCurrency;
    /** List of project billing email addresses */
    private java.util.List<BillingGroupUpdateRequestBodyBillingEmails> billingEmails;
    /** Extra text to be included in all project invoices, e.g. purchase order or cost center number */
    private String billingExtraText;
    /** Billing group name */
    private String billingGroupName;
    /** Credit card ID */
    private String cardId;
    /** Address city */
    private String city;
    /** Name of a company */
    private String company;
    /** Two letter country code for billing country */
    private String countryCode;
    /** Address state */
    private String state;
    /** EU VAT Identification Number */
    private String vatId;
    /** Address zip code */
    private String zipCode;
    /**
     * Instantiates a new BillingGroupUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BillingGroupUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static BillingGroupUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupUpdateRequestBody();
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
     * Gets the address_lines property value. Address lines
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAddressLines() {
        return this.addressLines;
    }
    /**
     * Gets the billing_currency property value. Billing currency
     * @return a BillingGroupUpdateRequestBodyBillingCurrency
     */
    @javax.annotation.Nullable
    public BillingGroupUpdateRequestBodyBillingCurrency getBillingCurrency() {
        return this.billingCurrency;
    }
    /**
     * Gets the billing_emails property value. List of project billing email addresses
     * @return a BillingGroupUpdateRequestBodyBillingEmails
     */
    @javax.annotation.Nullable
    public java.util.List<BillingGroupUpdateRequestBodyBillingEmails> getBillingEmails() {
        return this.billingEmails;
    }
    /**
     * Gets the billing_extra_text property value. Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingExtraText() {
        return this.billingExtraText;
    }
    /**
     * Gets the billing_group_name property value. Billing group name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingGroupName() {
        return this.billingGroupName;
    }
    /**
     * Gets the card_id property value. Credit card ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCardId() {
        return this.cardId;
    }
    /**
     * Gets the city property value. Address city
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the company property value. Name of a company
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompany() {
        return this.company;
    }
    /**
     * Gets the country_code property value. Two letter country code for billing country
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("address_lines", (n) -> { this.setAddressLines(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("billing_currency", (n) -> { this.setBillingCurrency(n.getEnumValue(BillingGroupUpdateRequestBodyBillingCurrency.class)); });
        deserializerMap.put("billing_emails", (n) -> { this.setBillingEmails(n.getCollectionOfObjectValues(BillingGroupUpdateRequestBodyBillingEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_extra_text", (n) -> { this.setBillingExtraText(n.getStringValue()); });
        deserializerMap.put("billing_group_name", (n) -> { this.setBillingGroupName(n.getStringValue()); });
        deserializerMap.put("card_id", (n) -> { this.setCardId(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("vat_id", (n) -> { this.setVatId(n.getStringValue()); });
        deserializerMap.put("zip_code", (n) -> { this.setZipCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. Address state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the vat_id property value. EU VAT Identification Number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVatId() {
        return this.vatId;
    }
    /**
     * Gets the zip_code property value. Address zip code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getZipCode() {
        return this.zipCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeCollectionOfPrimitiveValues("address_lines", this.getAddressLines());
        writer.writeEnumValue("billing_currency", this.getBillingCurrency());
        writer.writeCollectionOfObjectValues("billing_emails", this.getBillingEmails());
        writer.writeStringValue("billing_extra_text", this.getBillingExtraText());
        writer.writeStringValue("billing_group_name", this.getBillingGroupName());
        writer.writeStringValue("card_id", this.getCardId());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("vat_id", this.getVatId());
        writer.writeStringValue("zip_code", this.getZipCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
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
     * Sets the address_lines property value. Address lines
     * @param value Value to set for the addressLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddressLines(@javax.annotation.Nullable final java.util.List<String> value) {
        this.addressLines = value;
    }
    /**
     * Sets the billing_currency property value. Billing currency
     * @param value Value to set for the billingCurrency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingCurrency(@javax.annotation.Nullable final BillingGroupUpdateRequestBodyBillingCurrency value) {
        this.billingCurrency = value;
    }
    /**
     * Sets the billing_emails property value. List of project billing email addresses
     * @param value Value to set for the billingEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingEmails(@javax.annotation.Nullable final java.util.List<BillingGroupUpdateRequestBodyBillingEmails> value) {
        this.billingEmails = value;
    }
    /**
     * Sets the billing_extra_text property value. Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @param value Value to set for the billingExtraText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingExtraText(@javax.annotation.Nullable final String value) {
        this.billingExtraText = value;
    }
    /**
     * Sets the billing_group_name property value. Billing group name
     * @param value Value to set for the billingGroupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingGroupName(@javax.annotation.Nullable final String value) {
        this.billingGroupName = value;
    }
    /**
     * Sets the card_id property value. Credit card ID
     * @param value Value to set for the cardId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCardId(@javax.annotation.Nullable final String value) {
        this.cardId = value;
    }
    /**
     * Sets the city property value. Address city
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the company property value. Name of a company
     * @param value Value to set for the company property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompany(@javax.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the country_code property value. Two letter country code for billing country
     * @param value Value to set for the countryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryCode(@javax.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the state property value. Address state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the vat_id property value. EU VAT Identification Number
     * @param value Value to set for the vatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVatId(@javax.annotation.Nullable final String value) {
        this.vatId = value;
    }
    /**
     * Sets the zip_code property value. Address zip code
     * @param value Value to set for the zipCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZipCode(@javax.annotation.Nullable final String value) {
        this.zipCode = value;
    }
}
