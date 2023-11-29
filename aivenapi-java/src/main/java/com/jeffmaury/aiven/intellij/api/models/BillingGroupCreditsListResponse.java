package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BillingGroupCreditsListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupCreditsListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of credits assigned to a billing group
     */
    private java.util.List<BillingGroupCreditsListResponseCredits> credits;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<BillingGroupCreditsListResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Instantiates a new BillingGroupCreditsListResponse and sets the default values.
     */
    public BillingGroupCreditsListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupCreditsListResponse
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupCreditsListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupCreditsListResponse();
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
     * Gets the credits property value. List of credits assigned to a billing group
     * @return a java.util.List<BillingGroupCreditsListResponseCredits>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BillingGroupCreditsListResponseCredits> getCredits() {
        return this.credits;
    }
    /**
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<BillingGroupCreditsListResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BillingGroupCreditsListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("credits", (n) -> { this.setCredits(n.getCollectionOfObjectValues(BillingGroupCreditsListResponseCredits::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(BillingGroupCreditsListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("credits", this.getCredits());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the credits property value. List of credits assigned to a billing group
     * @param value Value to set for the credits property.
     */
    public void setCredits(@jakarta.annotation.Nullable final java.util.List<BillingGroupCreditsListResponseCredits> value) {
        this.credits = value;
    }
    /**
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<BillingGroupCreditsListResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
