package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserCreditCardUpdateRequestBody
 */
public class UserCreditCardUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Expiration month */
    private Integer expMonth;
    /** Expiration year */
    private Integer expYear;
    /** Name on the credit card */
    private String name;
    /**
     * Instantiates a new UserCreditCardUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserCreditCardUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCreditCardUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static UserCreditCardUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCreditCardUpdateRequestBody();
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
     * Gets the exp_month property value. Expiration month
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExpMonth() {
        return this.expMonth;
    }
    /**
     * Gets the exp_year property value. Expiration year
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExpYear() {
        return this.expYear;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("exp_month", (n) -> { this.setExpMonth(n.getIntegerValue()); });
        deserializerMap.put("exp_year", (n) -> { this.setExpYear(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name on the credit card
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("exp_month", this.getExpMonth());
        writer.writeIntegerValue("exp_year", this.getExpYear());
        writer.writeStringValue("name", this.getName());
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
     * Sets the exp_month property value. Expiration month
     * @param value Value to set for the expMonth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpMonth(@javax.annotation.Nullable final Integer value) {
        this.expMonth = value;
    }
    /**
     * Sets the exp_year property value. Expiration year
     * @param value Value to set for the expYear property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpYear(@javax.annotation.Nullable final Integer value) {
        this.expYear = value;
    }
    /**
     * Sets the name property value. Name on the credit card
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
}
