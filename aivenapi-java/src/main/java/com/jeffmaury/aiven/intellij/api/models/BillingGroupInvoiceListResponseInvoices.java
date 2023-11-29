package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BillingGroupInvoiceListResponseInvoices implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Billing group ID */
    private String billingGroupId;
    /** Billing group name */
    private String billingGroupName;
    /** Billing group state */
    private BillingGroupInvoiceListResponseInvoicesBillingGroupState billingGroupState;
    /** Billing currency */
    private BillingGroupInvoiceListResponseInvoicesCurrency currency;
    /** Authentication cookie for downloads */
    private String downloadCookie;
    /** The time when the invoice was generated */
    private String generatedAt;
    /** Unique invoice reference code */
    private String invoiceNumber;
    /** Period begin */
    private String periodBegin;
    /** Period end */
    private String periodEnd;
    /** State of this invoice */
    private BillingGroupInvoiceListResponseInvoicesState state;
    /** Total including taxes */
    private String totalIncVat;
    /** Total excluding taxes */
    private String totalVatZero;
    /**
     * Instantiates a new BillingGroupInvoiceListResponseInvoices and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BillingGroupInvoiceListResponseInvoices() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupInvoiceListResponseInvoices
     */
    @javax.annotation.Nonnull
    public static BillingGroupInvoiceListResponseInvoices createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupInvoiceListResponseInvoices();
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
     * Gets the billing_group_id property value. Billing group ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillingGroupId() {
        return this.billingGroupId;
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
     * Gets the billing_group_state property value. Billing group state
     * @return a BillingGroupInvoiceListResponseInvoicesBillingGroupState
     */
    @javax.annotation.Nullable
    public BillingGroupInvoiceListResponseInvoicesBillingGroupState getBillingGroupState() {
        return this.billingGroupState;
    }
    /**
     * Gets the currency property value. Billing currency
     * @return a BillingGroupInvoiceListResponseInvoicesCurrency
     */
    @javax.annotation.Nullable
    public BillingGroupInvoiceListResponseInvoicesCurrency getCurrency() {
        return this.currency;
    }
    /**
     * Gets the download_cookie property value. Authentication cookie for downloads
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDownloadCookie() {
        return this.downloadCookie;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("billing_group_id", (n) -> { this.setBillingGroupId(n.getStringValue()); });
        deserializerMap.put("billing_group_name", (n) -> { this.setBillingGroupName(n.getStringValue()); });
        deserializerMap.put("billing_group_state", (n) -> { this.setBillingGroupState(n.getEnumValue(BillingGroupInvoiceListResponseInvoicesBillingGroupState.class)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getEnumValue(BillingGroupInvoiceListResponseInvoicesCurrency.class)); });
        deserializerMap.put("download_cookie", (n) -> { this.setDownloadCookie(n.getStringValue()); });
        deserializerMap.put("generated_at", (n) -> { this.setGeneratedAt(n.getStringValue()); });
        deserializerMap.put("invoice_number", (n) -> { this.setInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("period_begin", (n) -> { this.setPeriodBegin(n.getStringValue()); });
        deserializerMap.put("period_end", (n) -> { this.setPeriodEnd(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(BillingGroupInvoiceListResponseInvoicesState.class)); });
        deserializerMap.put("total_inc_vat", (n) -> { this.setTotalIncVat(n.getStringValue()); });
        deserializerMap.put("total_vat_zero", (n) -> { this.setTotalVatZero(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generated_at property value. The time when the invoice was generated
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGeneratedAt() {
        return this.generatedAt;
    }
    /**
     * Gets the invoice_number property value. Unique invoice reference code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }
    /**
     * Gets the period_begin property value. Period begin
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeriodBegin() {
        return this.periodBegin;
    }
    /**
     * Gets the period_end property value. Period end
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeriodEnd() {
        return this.periodEnd;
    }
    /**
     * Gets the state property value. State of this invoice
     * @return a BillingGroupInvoiceListResponseInvoicesState
     */
    @javax.annotation.Nullable
    public BillingGroupInvoiceListResponseInvoicesState getState() {
        return this.state;
    }
    /**
     * Gets the total_inc_vat property value. Total including taxes
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTotalIncVat() {
        return this.totalIncVat;
    }
    /**
     * Gets the total_vat_zero property value. Total excluding taxes
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTotalVatZero() {
        return this.totalVatZero;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the billing_group_id property value. Billing group ID
     * @param value Value to set for the billingGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingGroupId(@javax.annotation.Nullable final String value) {
        this.billingGroupId = value;
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
     * Sets the billing_group_state property value. Billing group state
     * @param value Value to set for the billingGroupState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingGroupState(@javax.annotation.Nullable final BillingGroupInvoiceListResponseInvoicesBillingGroupState value) {
        this.billingGroupState = value;
    }
    /**
     * Sets the currency property value. Billing currency
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final BillingGroupInvoiceListResponseInvoicesCurrency value) {
        this.currency = value;
    }
    /**
     * Sets the download_cookie property value. Authentication cookie for downloads
     * @param value Value to set for the downloadCookie property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDownloadCookie(@javax.annotation.Nullable final String value) {
        this.downloadCookie = value;
    }
    /**
     * Sets the generated_at property value. The time when the invoice was generated
     * @param value Value to set for the generatedAt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeneratedAt(@javax.annotation.Nullable final String value) {
        this.generatedAt = value;
    }
    /**
     * Sets the invoice_number property value. Unique invoice reference code
     * @param value Value to set for the invoiceNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvoiceNumber(@javax.annotation.Nullable final String value) {
        this.invoiceNumber = value;
    }
    /**
     * Sets the period_begin property value. Period begin
     * @param value Value to set for the periodBegin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodBegin(@javax.annotation.Nullable final String value) {
        this.periodBegin = value;
    }
    /**
     * Sets the period_end property value. Period end
     * @param value Value to set for the periodEnd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodEnd(@javax.annotation.Nullable final String value) {
        this.periodEnd = value;
    }
    /**
     * Sets the state property value. State of this invoice
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final BillingGroupInvoiceListResponseInvoicesState value) {
        this.state = value;
    }
    /**
     * Sets the total_inc_vat property value. Total including taxes
     * @param value Value to set for the totalIncVat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalIncVat(@javax.annotation.Nullable final String value) {
        this.totalIncVat = value;
    }
    /**
     * Sets the total_vat_zero property value. Total excluding taxes
     * @param value Value to set for the totalVatZero property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalVatZero(@javax.annotation.Nullable final String value) {
        this.totalVatZero = value;
    }
}
