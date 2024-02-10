package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Account ID
     */
    private String accountId;
    /**
     * [DEPRECATED] If account_id is set, grant account owner team admin access to the new project. This flag is ignored, and assumed true.
     */
    private Boolean addAccountOwnersAdminAccess;
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
    private ProjectCreateRequestBodyBillingCurrency billingCurrency;
    /**
     * List of project billing email addresses
     */
    private java.util.List<ProjectCreateRequestBodyBillingEmails> billingEmails;
    /**
     * Extra text to be included in all project invoices, e.g. purchase order or cost center number
     */
    private String billingExtraText;
    /**
     * Billing group ID
     */
    private String billingGroupId;
    /**
     * Credit card ID
     */
    private String cardId;
    /**
     * Address city
     */
    private String city;
    /**
     * Target cloud
     */
    private String cloud;
    /**
     * Name of a company
     */
    private String company;
    /**
     * Project name from which to copy settings to the new project
     */
    private String copyFromProject;
    /**
     * Copy tags from the source project. If request contains additional tags, the tags copied from source are updated with them.
     */
    private Boolean copyTags;
    /**
     * Two letter country code for billing country
     */
    private String countryCode;
    /**
     * Project name
     */
    private String project;
    /**
     * Address state
     */
    private String state;
    /**
     * Set of resource tags
     */
    private ProjectCreateRequestBodyTags tags;
    /**
     * List of project tech email addresses
     */
    private java.util.List<ProjectCreateRequestBodyTechEmails> techEmails;
    /**
     * Use the same billing group that is used in source project.
     */
    private Boolean useSourceProjectBillingGroup;
    /**
     * EU VAT Identification Number
     */
    private String vatId;
    /**
     * Address zip code
     */
    private String zipCode;
    /**
     * Instantiates a new ProjectCreateRequestBody and sets the default values.
     */
    public ProjectCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProjectCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectCreateRequestBody();
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
     * Gets the add_account_owners_admin_access property value. [DEPRECATED] If account_id is set, grant account owner team admin access to the new project. This flag is ignored, and assumed true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAddAccountOwnersAdminAccess() {
        return this.addAccountOwnersAdminAccess;
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
     * @return a ProjectCreateRequestBodyBillingCurrency
     */
    @jakarta.annotation.Nullable
    public ProjectCreateRequestBodyBillingCurrency getBillingCurrency() {
        return this.billingCurrency;
    }
    /**
     * Gets the billing_emails property value. List of project billing email addresses
     * @return a java.util.List<ProjectCreateRequestBodyBillingEmails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectCreateRequestBodyBillingEmails> getBillingEmails() {
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
     * Gets the card_id property value. Credit card ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCardId() {
        return this.cardId;
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
     * Gets the cloud property value. Target cloud
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloud() {
        return this.cloud;
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
     * Gets the copy_from_project property value. Project name from which to copy settings to the new project
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCopyFromProject() {
        return this.copyFromProject;
    }
    /**
     * Gets the copy_tags property value. Copy tags from the source project. If request contains additional tags, the tags copied from source are updated with them.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCopyTags() {
        return this.copyTags;
    }
    /**
     * Gets the country_code property value. Two letter country code for billing country
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("add_account_owners_admin_access", (n) -> { this.setAddAccountOwnersAdminAccess(n.getBooleanValue()); });
        deserializerMap.put("address_lines", (n) -> { this.setAddressLines(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getStringValue()); });
        deserializerMap.put("billing_currency", (n) -> { this.setBillingCurrency(n.getEnumValue(ProjectCreateRequestBodyBillingCurrency::forValue)); });
        deserializerMap.put("billing_emails", (n) -> { this.setBillingEmails(n.getCollectionOfObjectValues(ProjectCreateRequestBodyBillingEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_extra_text", (n) -> { this.setBillingExtraText(n.getStringValue()); });
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("card_id", (n) -> { this.setCardId(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("cloud", (n) -> { this.setCloud(n.getStringValue()); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("copy_from_project", (n) -> { this.setCopyFromProject(n.getStringValue()); });
        deserializerMap.put("copy_tags", (n) -> { this.setCopyTags(n.getBooleanValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("project", (n) -> { this.setProject(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(ProjectCreateRequestBodyTags::createFromDiscriminatorValue)); });
        deserializerMap.put("tech_emails", (n) -> { this.setTechEmails(n.getCollectionOfObjectValues(ProjectCreateRequestBodyTechEmails::createFromDiscriminatorValue)); });
        deserializerMap.put("use_source_project_billing_group", (n) -> { this.setUseSourceProjectBillingGroup(n.getBooleanValue()); });
        deserializerMap.put("vat_id", (n) -> { this.setVatId(n.getStringValue()); });
        deserializerMap.put("zip_code", (n) -> { this.setZipCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the project property value. Project name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProject() {
        return this.project;
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
     * Gets the tags property value. Set of resource tags
     * @return a ProjectCreateRequestBodyTags
     */
    @jakarta.annotation.Nullable
    public ProjectCreateRequestBodyTags getTags() {
        return this.tags;
    }
    /**
     * Gets the tech_emails property value. List of project tech email addresses
     * @return a java.util.List<ProjectCreateRequestBodyTechEmails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectCreateRequestBodyTechEmails> getTechEmails() {
        return this.techEmails;
    }
    /**
     * Gets the use_source_project_billing_group property value. Use the same billing group that is used in source project.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseSourceProjectBillingGroup() {
        return this.useSourceProjectBillingGroup;
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
        writer.writeStringValue("copy_from_project", this.getCopyFromProject());
        writer.writeBooleanValue("copy_tags", this.getCopyTags());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("project", this.getProject());
        writer.writeStringValue("state", this.getState());
        writer.writeObjectValue("tags", this.getTags());
        writer.writeCollectionOfObjectValues("tech_emails", this.getTechEmails());
        writer.writeBooleanValue("use_source_project_billing_group", this.getUseSourceProjectBillingGroup());
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
     * Sets the add_account_owners_admin_access property value. [DEPRECATED] If account_id is set, grant account owner team admin access to the new project. This flag is ignored, and assumed true.
     * @param value Value to set for the add_account_owners_admin_access property.
     */
    public void setAddAccountOwnersAdminAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.addAccountOwnersAdminAccess = value;
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
    public void setBillingCurrency(@jakarta.annotation.Nullable final ProjectCreateRequestBodyBillingCurrency value) {
        this.billingCurrency = value;
    }
    /**
     * Sets the billing_emails property value. List of project billing email addresses
     * @param value Value to set for the billing_emails property.
     */
    public void setBillingEmails(@jakarta.annotation.Nullable final java.util.List<ProjectCreateRequestBodyBillingEmails> value) {
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
     * Sets the card_id property value. Credit card ID
     * @param value Value to set for the card_id property.
     */
    public void setCardId(@jakarta.annotation.Nullable final String value) {
        this.cardId = value;
    }
    /**
     * Sets the city property value. Address city
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the cloud property value. Target cloud
     * @param value Value to set for the cloud property.
     */
    public void setCloud(@jakarta.annotation.Nullable final String value) {
        this.cloud = value;
    }
    /**
     * Sets the company property value. Name of a company
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the copy_from_project property value. Project name from which to copy settings to the new project
     * @param value Value to set for the copy_from_project property.
     */
    public void setCopyFromProject(@jakarta.annotation.Nullable final String value) {
        this.copyFromProject = value;
    }
    /**
     * Sets the copy_tags property value. Copy tags from the source project. If request contains additional tags, the tags copied from source are updated with them.
     * @param value Value to set for the copy_tags property.
     */
    public void setCopyTags(@jakarta.annotation.Nullable final Boolean value) {
        this.copyTags = value;
    }
    /**
     * Sets the country_code property value. Two letter country code for billing country
     * @param value Value to set for the country_code property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the project property value. Project name
     * @param value Value to set for the project property.
     */
    public void setProject(@jakarta.annotation.Nullable final String value) {
        this.project = value;
    }
    /**
     * Sets the state property value. Address state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the tags property value. Set of resource tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final ProjectCreateRequestBodyTags value) {
        this.tags = value;
    }
    /**
     * Sets the tech_emails property value. List of project tech email addresses
     * @param value Value to set for the tech_emails property.
     */
    public void setTechEmails(@jakarta.annotation.Nullable final java.util.List<ProjectCreateRequestBodyTechEmails> value) {
        this.techEmails = value;
    }
    /**
     * Sets the use_source_project_billing_group property value. Use the same billing group that is used in source project.
     * @param value Value to set for the use_source_project_billing_group property.
     */
    public void setUseSourceProjectBillingGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.useSourceProjectBillingGroup = value;
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
