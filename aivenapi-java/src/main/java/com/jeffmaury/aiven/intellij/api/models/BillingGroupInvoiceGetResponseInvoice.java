package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A single invoice
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupInvoiceGetResponseInvoice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The time when the invoice was generated
     */
    private String generatedAt;
    /**
     * Unique invoice reference code
     */
    private String invoiceNumber;
    /**
     * State of this invoice
     */
    private BillingGroupInvoiceGetResponseInvoiceInvoiceState invoiceState;
    /**
     * Invoice total in chosen billing currency, after VAT
     */
    private String localIncVat;
    /**
     * Invoice total in chosen billing currency, before VAT
     */
    private String localVatZero;
    /**
     * Instantiates a new BillingGroupInvoiceGetResponseInvoice and sets the default values.
     */
    public BillingGroupInvoiceGetResponseInvoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupInvoiceGetResponseInvoice
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupInvoiceGetResponseInvoice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupInvoiceGetResponseInvoice();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("generated_at", (n) -> { this.setGeneratedAt(n.getStringValue()); });
        deserializerMap.put("invoice_number", (n) -> { this.setInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("invoice_state", (n) -> { this.setInvoiceState(n.getEnumValue(BillingGroupInvoiceGetResponseInvoiceInvoiceState.class)); });
        deserializerMap.put("local_inc_vat", (n) -> { this.setLocalIncVat(n.getStringValue()); });
        deserializerMap.put("local_vat_zero", (n) -> { this.setLocalVatZero(n.getStringValue()); });
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
     * Gets the invoice_state property value. State of this invoice
     * @return a BillingGroupInvoiceGetResponseInvoiceInvoiceState
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceGetResponseInvoiceInvoiceState getInvoiceState() {
        return this.invoiceState;
    }
    /**
     * Gets the local_inc_vat property value. Invoice total in chosen billing currency, after VAT
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalIncVat() {
        return this.localIncVat;
    }
    /**
     * Gets the local_vat_zero property value. Invoice total in chosen billing currency, before VAT
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalVatZero() {
        return this.localVatZero;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("generated_at", this.getGeneratedAt());
        writer.writeStringValue("invoice_number", this.getInvoiceNumber());
        writer.writeEnumValue("invoice_state", this.getInvoiceState());
        writer.writeStringValue("local_inc_vat", this.getLocalIncVat());
        writer.writeStringValue("local_vat_zero", this.getLocalVatZero());
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
     * Sets the invoice_state property value. State of this invoice
     * @param value Value to set for the invoice_state property.
     */
    public void setInvoiceState(@jakarta.annotation.Nullable final BillingGroupInvoiceGetResponseInvoiceInvoiceState value) {
        this.invoiceState = value;
    }
    /**
     * Sets the local_inc_vat property value. Invoice total in chosen billing currency, after VAT
     * @param value Value to set for the local_inc_vat property.
     */
    public void setLocalIncVat(@jakarta.annotation.Nullable final String value) {
        this.localIncVat = value;
    }
    /**
     * Sets the local_vat_zero property value. Invoice total in chosen billing currency, before VAT
     * @param value Value to set for the local_vat_zero property.
     */
    public void setLocalVatZero(@jakarta.annotation.Nullable final String value) {
        this.localVatZero = value;
    }
}
