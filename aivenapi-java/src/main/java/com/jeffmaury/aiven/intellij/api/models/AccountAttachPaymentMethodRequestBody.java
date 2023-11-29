package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountAttachPaymentMethodRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountAttachPaymentMethodRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier for a Stripe payment method
     */
    private String paymentMethodId;
    /**
     * Instantiates a new AccountAttachPaymentMethodRequestBody and sets the default values.
     */
    public AccountAttachPaymentMethodRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAttachPaymentMethodRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccountAttachPaymentMethodRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAttachPaymentMethodRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("payment_method_id", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payment_method_id property value. Unique identifier for a Stripe payment method
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("payment_method_id", this.getPaymentMethodId());
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
     * Sets the payment_method_id property value. Unique identifier for a Stripe payment method
     * @param value Value to set for the payment_method_id property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
}
