package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectUpdateRequestBody
 */
public class ProjectUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Account ID */
    private String accountId;
    /** [DEPRECATED] If account_id is set, grant account owner team admin access to this project. This flag is ignored and assumed true. */
    private Boolean addAccountOwnersAdminAccess;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** [DEPRECATED] Address lines */
    private java.util.List<String> addressLines;
    /** DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead */
    private String billingAddress;
    /** [DEPRECATED] Billing currency */
    private ProjectUpdateRequestBodyBillingCurrency billingCurrency;
    /** [DEPRECATED] List of project billing email addresses */
    private java.util.List<ProjectUpdateRequestBodyBillingEmails> billingEmails;
    /** [DEPRECATED] Extra text to be included in all project invoices, e.g. purchase order or cost center number */
    private String billingExtraText;
    /** [DEPRECATED] Billing group ID */
    private String billingGroupId;
    /** [DEPRECATED] Credit card ID */
    private String cardId;
    /** [DEPRECATED] Address city */
    private String city;
    /** Target cloud */
    private String cloud;
    /** Name of a company */
    private String company;
    /** Two letter country code for billing country */
    private String countryCode;
    /** Project name */
    private String projectName;
    /** Address state */
    private String state;
    /** Set of resource tags */
    private ProjectUpdateRequestBodyTags tags;
    /** List of project tech email addresses */
    private java.util.List<ProjectUpdateRequestBodyTechEmails> techEmails;
    /** [DEPRECATED] EU VAT Identification Number */
    private String vatId;
    /** [DEPRECATED] Address zip code */
    private String zipCode;
    /**
     * Instantiates a new ProjectUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProjectUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static ProjectUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectUpdateRequestBody();
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
     * Gets the add_account_owners_admin_access property value. [DEPRECATED] If account_id is set, grant account owner team admin access to this project. This flag is ignored and assumed true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAddAccountOwnersAdminAccess() {
        return this.addAccountOwnersAdminAccess;
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
     * Gets the address_lines property value. [DEPRECATED] Address lines
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAddressLines() {
        return this.addressLines;
    }
    /**
     * Gets the billing_address property value. DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billing_currency property value. [DEPRECATED] Billing currency
     * @return a ProjectUpdateRequestBodyBillingCurrency
     */
    @javax.annotation.Nullable
    public ProjectUpdateRequestBodyBillingCurrency getBillingCurrency() {
        return this.billingCurrency;
    }
    /**
     * Gets the billing_emails property value. [DEPRECATED] List of project billing email addresses
     * @return a ProjectUpdateRequestBodyBillingEmails
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectUpdateRequestBodyBillingEmails> getBillingEmails() {
        return this.billingEmails;
    }
    /**
     * Gets the billing_extra_text property value. [DEPRECATED] Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingExtraText() {
        return this.billingExtraText;
    }
    /**
     * Gets the billing_group_id property value. [DEPRECATED] Billing group ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingGroupId() {
        return this.billingGroupId;
    }
    /**
     * Gets the card_id property value. [DEPRECATED] Credit card ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCardId() {
        return this.cardId;
    }
    /**
     * Gets the city property value. [DEPRECATED] Address city
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the cloud property value. Target cloud
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloud() {
        return this.cloud;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("add_account_owners_admin_access", (n) -> { this.setAddAccountOwnersAdminAccess(n.getBooleanValue()); });
        deserializerMap.put("address_lines", (n) -> { this.setAddressLines(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getStringValue()); });
        deserializerMap.put("billing_currency", (n) -> { this.setBillingCurrency(n.getEnumValue(ProjectUpdateRequestBodyBillingCurrency.class)); });
        deserializerMap.put("billing_emails", (n) -> { this.setBillingEmails(n.getCollectionOfObjectValues(ProjectUpdateRequestBodyBillingEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_extra_text", (n) -> { this.setBillingExtraText(n.getStringValue()); });
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("card_id", (n) -> { this.setCardId(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ProjectUpdateRequestBodyTags::createFromDiscriminatorValue)); });
        deserializerMap.put("tech_emails", (n) -> { this.setTechEmails(n.getCollectionOfObjectValues(ProjectUpdateRequestBodyTechEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("vat_id", (n) -> { this.setVatId(n.getStringValue()); });
        deserializerMap.put("zip_code", (n) -> { this.setZipCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the project_name property value. Project name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
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
     * Gets the tags property value. Set of resource tags
     * @return a ProjectUpdateRequestBodyTags
     */
    @javax.annotation.Nullable
    public ProjectUpdateRequestBodyTags getTags() {
        return this.tags;
    }
    /**
     * Gets the tech_emails property value. List of project tech email addresses
     * @return a ProjectUpdateRequestBodyTechEmails
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectUpdateRequestBodyTechEmails> getTechEmails() {
        return this.techEmails;
    }
    /**
     * Gets the vat_id property value. [DEPRECATED] EU VAT Identification Number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVatId() {
        return this.vatId;
    }
    /**
     * Gets the zip_code property value. [DEPRECATED] Address zip code
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
        writer.writeBooleanValue("add_account_owners_admin_access", this.getAddAccountOwnersAdminAccess());
        writer.writeCollectionOfPrimitiveValues("address_lines", this.getAddressLines());
        writer.writeStringValue("billing_address", this.getBillingAddress());
        writer.writeEnumValue("billing_currency", this.getBillingCurrency());
        writer.writeCollectionOfObjectValues("billing_emails", this.getBillingEmails());
        writer.writeStringValue("billing_extra_text", this.getBillingExtraText());
        writer.writeStringValue("billing_group_id", this.getBillingGroupId());
        writer.writeStringValue("card_id", this.getCardId());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("cloud", this.getCloud());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeStringValue("state", this.getState());
        writer.writeObjectValue("tags", this.getTags());
        writer.writeCollectionOfObjectValues("tech_emails", this.getTechEmails());
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
     * Sets the add_account_owners_admin_access property value. [DEPRECATED] If account_id is set, grant account owner team admin access to this project. This flag is ignored and assumed true.
     * @param value Value to set for the addAccountOwnersAdminAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddAccountOwnersAdminAccess(@javax.annotation.Nullable final Boolean value) {
        this.addAccountOwnersAdminAccess = value;
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
     * Sets the address_lines property value. [DEPRECATED] Address lines
     * @param value Value to set for the addressLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddressLines(@javax.annotation.Nullable final java.util.List<String> value) {
        this.addressLines = value;
    }
    /**
     * Sets the billing_address property value. DEPRECATED: use split address fields like company, address_lines, zip_code, city and state instead
     * @param value Value to set for the billingAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingAddress(@javax.annotation.Nullable final String value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billing_currency property value. [DEPRECATED] Billing currency
     * @param value Value to set for the billingCurrency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingCurrency(@javax.annotation.Nullable final ProjectUpdateRequestBodyBillingCurrency value) {
        this.billingCurrency = value;
    }
    /**
     * Sets the billing_emails property value. [DEPRECATED] List of project billing email addresses
     * @param value Value to set for the billingEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingEmails(@javax.annotation.Nullable final java.util.List<ProjectUpdateRequestBodyBillingEmails> value) {
        this.billingEmails = value;
    }
    /**
     * Sets the billing_extra_text property value. [DEPRECATED] Extra text to be included in all project invoices, e.g. purchase order or cost center number
     * @param value Value to set for the billingExtraText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingExtraText(@javax.annotation.Nullable final String value) {
        this.billingExtraText = value;
    }
    /**
     * Sets the billing_group_id property value. [DEPRECATED] Billing group ID
     * @param value Value to set for the billingGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingGroupId(@javax.annotation.Nullable final String value) {
        this.billingGroupId = value;
    }
    /**
     * Sets the card_id property value. [DEPRECATED] Credit card ID
     * @param value Value to set for the cardId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCardId(@javax.annotation.Nullable final String value) {
        this.cardId = value;
    }
    /**
     * Sets the city property value. [DEPRECATED] Address city
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloud(@javax.annotation.Nullable final String value) {
        this.cloud = value;
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
     * Sets the project_name property value. Project name
     * @param value Value to set for the projectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProjectName(@javax.annotation.Nullable final String value) {
        this.projectName = value;
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
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final ProjectUpdateRequestBodyTags value) {
        this.tags = value;
    }
    /**
     * Sets the tech_emails property value. List of project tech email addresses
     * @param value Value to set for the techEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechEmails(@javax.annotation.Nullable final java.util.List<ProjectUpdateRequestBodyTechEmails> value) {
        this.techEmails = value;
    }
    /**
     * Sets the vat_id property value. [DEPRECATED] EU VAT Identification Number
     * @param value Value to set for the vatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVatId(@javax.annotation.Nullable final String value) {
        this.vatId = value;
    }
    /**
     * Sets the zip_code property value. [DEPRECATED] Address zip code
     * @param value Value to set for the zipCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZipCode(@javax.annotation.Nullable final String value) {
        this.zipCode = value;
    }
}
