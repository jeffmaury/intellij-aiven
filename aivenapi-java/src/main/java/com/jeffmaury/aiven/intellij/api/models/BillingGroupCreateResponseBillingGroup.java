package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Billing group information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupCreateResponseBillingGroup implements AdditionalDataHolder, Parsable {
    /**
     * Account ID
     */
    private String accountId;
    /**
     * Account name
     */
    private String accountName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Address lines
     */
    private java.util.List<String> addressLines;
    /**
     * DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead
     */
    private String billingAddress;
    /**
     * Billing currency
     */
    private BillingGroupCreateResponseBillingGroupBillingCurrency billingCurrency;
    /**
     * List of project billing email addresses
     */
    private java.util.List<BillingGroupCreateResponseBillingGroupBillingEmails> billingEmails;
    /**
     * Extra text to be included in all project invoices, e.g. purchase order or cost center number
     */
    private String billingExtraText;
    /**
     * Billing group ID
     */
    private String billingGroupId;
    /**
     * Billing group name
     */
    private String billingGroupName;
    /**
     * Credit card assigned to the project
     */
    private BillingGroupCreateResponseBillingGroupCardInfo cardInfo;
    /**
     * Address city
     */
    private String city;
    /**
     * Name of a company
     */
    private String company;
    /**
     * Billing country
     */
    private String country;
    /**
     * Two letter ISO country code
     */
    private String countryCode;
    /**
     * Estimated balance in billing currency, before tax
     */
    private String estimatedBalanceLocal;
    /**
     * Estimated balance in USD, before tax
     */
    private String estimatedBalanceUsd;
    /**
     * Payment method
     */
    private BillingGroupCreateResponseBillingGroupPaymentMethod paymentMethod;
    /**
     * Address state
     */
    private String state;
    /**
     * EU VAT Identification Number
     */
    private String vatId;
    /**
     * Address zip code
     */
    private String zipCode;
    /**
     * Instantiates a new BillingGroupCreateResponseBillingGroup and sets the default values.
     */
    public BillingGroupCreateResponseBillingGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupCreateResponseBillingGroup
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupCreateResponseBillingGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupCreateResponseBillingGroup();
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the account_name property value. Account name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
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
     * Gets the address_lines property value. Address lines
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAddressLines() {
        return this.addressLines;
    }
    /**
     * Gets the billing_address property value. DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billing_currency property value. Billing currency
     * @return a BillingGroupCreateResponseBillingGroupBillingCurrency
     */
    @jakarta.annotation.Nullable
    public BillingGroupCreateResponseBillingGroupBillingCurrency getBillingCurrency() {
        return this.billingCurrency;
    }
    /**
     * Gets the billing_emails property value. List of project billing email addresses
     * @return a java.util.List<BillingGroupCreateResponseBillingGroupBillingEmails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BillingGroupCreateResponseBillingGroupBillingEmails> getBillingEmails() {
        return this.billingEmails;
    }
    /**
     * Gets the billing_extra_text property value. Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBillingExtraText() {
        return this.billingExtraText;
    }
    /**
     * Gets the billing_group_id property value. Billing group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBillingGroupId() {
        return this.billingGroupId;
    }
    /**
     * Gets the billing_group_name property value. Billing group name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBillingGroupName() {
        return this.billingGroupName;
    }
    /**
     * Gets the card_info property value. Credit card assigned to the project
     * @return a BillingGroupCreateResponseBillingGroupCardInfo
     */
    @jakarta.annotation.Nullable
    public BillingGroupCreateResponseBillingGroupCardInfo getCardInfo() {
        return this.cardInfo;
    }
    /**
     * Gets the city property value. Address city
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the company property value. Name of a company
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompany() {
        return this.company;
    }
    /**
     * Gets the country property value. Billing country
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
     * Gets the estimated_balance_local property value. Estimated balance in billing currency, before tax
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEstimatedBalanceLocal() {
        return this.estimatedBalanceLocal;
    }
    /**
     * Gets the estimated_balance_usd property value. Estimated balance in USD, before tax
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEstimatedBalanceUsd() {
        return this.estimatedBalanceUsd;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("account_name", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("address_lines", (n) -> { this.setAddressLines(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getStringValue()); });
        deserializerMap.put("billing_currency", (n) -> { this.setBillingCurrency(n.getEnumValue(BillingGroupCreateResponseBillingGroupBillingCurrency::forValue)); });
        deserializerMap.put("billing_emails", (n) -> { this.setBillingEmails(n.getCollectionOfObjectValues(BillingGroupCreateResponseBillingGroupBillingEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_extra_text", (n) -> { this.setBillingExtraText(n.getStringValue()); });
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("billing_group_name", (n) -> { this.setBillingGroupName(n.getStringValue()); });
        deserializerMap.put("card_info", (n) -> { this.setCardInfo(n.getObjectValue(BillingGroupCreateResponseBillingGroupCardInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("estimated_balance_local", (n) -> { this.setEstimatedBalanceLocal(n.getStringValue()); });
        deserializerMap.put("estimated_balance_usd", (n) -> { this.setEstimatedBalanceUsd(n.getStringValue()); });
        deserializerMap.put("payment_method", (n) -> { this.setPaymentMethod(n.getEnumValue(BillingGroupCreateResponseBillingGroupPaymentMethod::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("vat_id", (n) -> { this.setVatId(n.getStringValue()); });
        deserializerMap.put("zip_code", (n) -> { this.setZipCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payment_method property value. Payment method
     * @return a BillingGroupCreateResponseBillingGroupPaymentMethod
     */
    @jakarta.annotation.Nullable
    public BillingGroupCreateResponseBillingGroupPaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }
    /**
     * Gets the state property value. Address state
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the vat_id property value. EU VAT Identification Number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVatId() {
        return this.vatId;
    }
    /**
     * Gets the zip_code property value. Address zip code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getZipCode() {
        return this.zipCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("account_name", this.getAccountName());
        writer.writeCollectionOfPrimitiveValues("address_lines", this.getAddressLines());
        writer.writeStringValue("billing_address", this.getBillingAddress());
        writer.writeEnumValue("billing_currency", this.getBillingCurrency());
        writer.writeCollectionOfObjectValues("billing_emails", this.getBillingEmails());
        writer.writeStringValue("billing_extra_text", this.getBillingExtraText());
        writer.writeStringValue("billing_group_id", this.getBillingGroupId());
        writer.writeStringValue("billing_group_name", this.getBillingGroupName());
        writer.writeObjectValue("card_info", this.getCardInfo());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("estimated_balance_local", this.getEstimatedBalanceLocal());
        writer.writeStringValue("estimated_balance_usd", this.getEstimatedBalanceUsd());
        writer.writeEnumValue("payment_method", this.getPaymentMethod());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("vat_id", this.getVatId());
        writer.writeStringValue("zip_code", this.getZipCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the account_id property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the account_name property value. Account name
     * @param value Value to set for the account_name property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address_lines property value. Address lines
     * @param value Value to set for the address_lines property.
     */
    public void setAddressLines(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.addressLines = value;
    }
    /**
     * Sets the billing_address property value. DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead
     * @param value Value to set for the billing_address property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final String value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billing_currency property value. Billing currency
     * @param value Value to set for the billing_currency property.
     */
    public void setBillingCurrency(@jakarta.annotation.Nullable final BillingGroupCreateResponseBillingGroupBillingCurrency value) {
        this.billingCurrency = value;
    }
    /**
     * Sets the billing_emails property value. List of project billing email addresses
     * @param value Value to set for the billing_emails property.
     */
    public void setBillingEmails(@jakarta.annotation.Nullable final java.util.List<BillingGroupCreateResponseBillingGroupBillingEmails> value) {
        this.billingEmails = value;
    }
    /**
     * Sets the billing_extra_text property value. Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @param value Value to set for the billing_extra_text property.
     */
    public void setBillingExtraText(@jakarta.annotation.Nullable final String value) {
        this.billingExtraText = value;
    }
    /**
     * Sets the billing_group_id property value. Billing group ID
     * @param value Value to set for the billing_group_id property.
     */
    public void setBillingGroupId(@jakarta.annotation.Nullable final String value) {
        this.billingGroupId = value;
    }
    /**
     * Sets the billing_group_name property value. Billing group name
     * @param value Value to set for the billing_group_name property.
     */
    public void setBillingGroupName(@jakarta.annotation.Nullable final String value) {
        this.billingGroupName = value;
    }
    /**
     * Sets the card_info property value. Credit card assigned to the project
     * @param value Value to set for the card_info property.
     */
    public void setCardInfo(@jakarta.annotation.Nullable final BillingGroupCreateResponseBillingGroupCardInfo value) {
        this.cardInfo = value;
    }
    /**
     * Sets the city property value. Address city
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the company property value. Name of a company
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the country property value. Billing country
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
     * Sets the estimated_balance_local property value. Estimated balance in billing currency, before tax
     * @param value Value to set for the estimated_balance_local property.
     */
    public void setEstimatedBalanceLocal(@jakarta.annotation.Nullable final String value) {
        this.estimatedBalanceLocal = value;
    }
    /**
     * Sets the estimated_balance_usd property value. Estimated balance in USD, before tax
     * @param value Value to set for the estimated_balance_usd property.
     */
    public void setEstimatedBalanceUsd(@jakarta.annotation.Nullable final String value) {
        this.estimatedBalanceUsd = value;
    }
    /**
     * Sets the payment_method property value. Payment method
     * @param value Value to set for the payment_method property.
     */
    public void setPaymentMethod(@jakarta.annotation.Nullable final BillingGroupCreateResponseBillingGroupPaymentMethod value) {
        this.paymentMethod = value;
    }
    /**
     * Sets the state property value. Address state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the vat_id property value. EU VAT Identification Number
     * @param value Value to set for the vat_id property.
     */
    public void setVatId(@jakarta.annotation.Nullable final String value) {
        this.vatId = value;
    }
    /**
     * Sets the zip_code property value. Address zip code
     * @param value Value to set for the zip_code property.
     */
    public void setZipCode(@jakarta.annotation.Nullable final String value) {
        this.zipCode = value;
    }
}
