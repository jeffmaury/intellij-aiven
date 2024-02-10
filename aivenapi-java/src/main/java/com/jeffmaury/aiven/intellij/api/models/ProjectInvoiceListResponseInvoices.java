package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectInvoiceListResponseInvoices implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Billing group ID
     */
    private String billingGroupId;
    /**
     * Billing group name
     */
    private String billingGroupName;
    /**
     * Billing group state
     */
    private ProjectInvoiceListResponseInvoicesBillingGroupState billingGroupState;
    /**
     * Billing currency
     */
    private ProjectInvoiceListResponseInvoicesCurrency currency;
    /**
     * Authentication cookie for downloads
     */
    private String downloadCookie;
    /**
     * The time when the invoice was generated
     */
    private String generatedAt;
    /**
     * Unique invoice reference code
     */
    private String invoiceNumber;
    /**
     * Period begin
     */
    private String periodBegin;
    /**
     * Period end
     */
    private String periodEnd;
    /**
     * State of this invoice
     */
    private ProjectInvoiceListResponseInvoicesState state;
    /**
     * Total including taxes
     */
    private String totalIncVat;
    /**
     * Total excluding taxes
     */
    private String totalVatZero;
    /**
     * Instantiates a new ProjectInvoiceListResponseInvoices and sets the default values.
     */
    public ProjectInvoiceListResponseInvoices() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectInvoiceListResponseInvoices
     */
    @jakarta.annotation.Nonnull
    public static ProjectInvoiceListResponseInvoices createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectInvoiceListResponseInvoices();
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
     * Gets the billing_group_state property value. Billing group state
     * @return a ProjectInvoiceListResponseInvoicesBillingGroupState
     */
    @jakarta.annotation.Nullable
    public ProjectInvoiceListResponseInvoicesBillingGroupState getBillingGroupState() {
        return this.billingGroupState;
    }
    /**
     * Gets the currency property value. Billing currency
     * @return a ProjectInvoiceListResponseInvoicesCurrency
     */
    @jakarta.annotation.Nullable
    public ProjectInvoiceListResponseInvoicesCurrency getCurrency() {
        return this.currency;
    }
    /**
     * Gets the download_cookie property value. Authentication cookie for downloads
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDownloadCookie() {
        return this.downloadCookie;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("billing_group_name", (n) -> { this.setBillingGroupName(n.getStringValue()); });
        deserializerMap.put("billing_group_state", (n) -> { this.setBillingGroupState(n.getEnumValue(ProjectInvoiceListResponseInvoicesBillingGroupState::forValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(ProjectInvoiceListResponseInvoicesCurrency::forValue)); });
        deserializerMap.put("download_cookie", (n) -> { this.setDownloadCookie(n.getStringValue()); });
        deserializerMap.put("generated_at", (n) -> { this.setGeneratedAt(n.getStringValue()); });
        deserializerMap.put("invoice_number", (n) -> { this.setInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("period_begin", (n) -> { this.setPeriodBegin(n.getStringValue()); });
        deserializerMap.put("period_end", (n) -> { this.setPeriodEnd(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ProjectInvoiceListResponseInvoicesState::forValue)); });
        deserializerMap.put("total_inc_vat", (n) -> { this.setTotalIncVat(n.getStringValue()); });
        deserializerMap.put("total_vat_zero", (n) -> { this.setTotalVatZero(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generated_at property value. The time when the invoice was generated
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGeneratedAt() {
        return this.generatedAt;
    }
    /**
     * Gets the invoice_number property value. Unique invoice reference code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }
    /**
     * Gets the period_begin property value. Period begin
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeriodBegin() {
        return this.periodBegin;
    }
    /**
     * Gets the period_end property value. Period end
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeriodEnd() {
        return this.periodEnd;
    }
    /**
     * Gets the state property value. State of this invoice
     * @return a ProjectInvoiceListResponseInvoicesState
     */
    @jakarta.annotation.Nullable
    public ProjectInvoiceListResponseInvoicesState getState() {
        return this.state;
    }
    /**
     * Gets the total_inc_vat property value. Total including taxes
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTotalIncVat() {
        return this.totalIncVat;
    }
    /**
     * Gets the total_vat_zero property value. Total excluding taxes
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTotalVatZero() {
        return this.totalVatZero;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("billing_group_id", this.getBillingGroupId());
        writer.writeStringValue("billing_group_name", this.getBillingGroupName());
        writer.writeEnumValue("billing_group_state", this.getBillingGroupState());
        writer.writeEnumValue("currency", this.getCurrency());
        writer.writeStringValue("download_cookie", this.getDownloadCookie());
        writer.writeStringValue("generated_at", this.getGeneratedAt());
        writer.writeStringValue("invoice_number", this.getInvoiceNumber());
        writer.writeStringValue("period_begin", this.getPeriodBegin());
        writer.writeStringValue("period_end", this.getPeriodEnd());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("total_inc_vat", this.getTotalIncVat());
        writer.writeStringValue("total_vat_zero", this.getTotalVatZero());
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
     * Sets the billing_group_state property value. Billing group state
     * @param value Value to set for the billing_group_state property.
     */
    public void setBillingGroupState(@jakarta.annotation.Nullable final ProjectInvoiceListResponseInvoicesBillingGroupState value) {
        this.billingGroupState = value;
    }
    /**
     * Sets the currency property value. Billing currency
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final ProjectInvoiceListResponseInvoicesCurrency value) {
        this.currency = value;
    }
    /**
     * Sets the download_cookie property value. Authentication cookie for downloads
     * @param value Value to set for the download_cookie property.
     */
    public void setDownloadCookie(@jakarta.annotation.Nullable final String value) {
        this.downloadCookie = value;
    }
    /**
     * Sets the generated_at property value. The time when the invoice was generated
     * @param value Value to set for the generated_at property.
     */
    public void setGeneratedAt(@jakarta.annotation.Nullable final String value) {
        this.generatedAt = value;
    }
    /**
     * Sets the invoice_number property value. Unique invoice reference code
     * @param value Value to set for the invoice_number property.
     */
    public void setInvoiceNumber(@jakarta.annotation.Nullable final String value) {
        this.invoiceNumber = value;
    }
    /**
     * Sets the period_begin property value. Period begin
     * @param value Value to set for the period_begin property.
     */
    public void setPeriodBegin(@jakarta.annotation.Nullable final String value) {
        this.periodBegin = value;
    }
    /**
     * Sets the period_end property value. Period end
     * @param value Value to set for the period_end property.
     */
    public void setPeriodEnd(@jakarta.annotation.Nullable final String value) {
        this.periodEnd = value;
    }
    /**
     * Sets the state property value. State of this invoice
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ProjectInvoiceListResponseInvoicesState value) {
        this.state = value;
    }
    /**
     * Sets the total_inc_vat property value. Total including taxes
     * @param value Value to set for the total_inc_vat property.
     */
    public void setTotalIncVat(@jakarta.annotation.Nullable final String value) {
        this.totalIncVat = value;
    }
    /**
     * Sets the total_vat_zero property value. Total excluding taxes
     * @param value Value to set for the total_vat_zero property.
     */
    public void setTotalVatZero(@jakarta.annotation.Nullable final String value) {
        this.totalVatZero = value;
    }
}
