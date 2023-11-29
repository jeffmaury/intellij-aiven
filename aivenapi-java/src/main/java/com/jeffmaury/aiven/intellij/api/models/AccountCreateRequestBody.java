package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Account name
     */
    private String accountName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Account ID
     */
    private String parentAccountId;
    /**
     * Billing group ID
     */
    private String primaryBillingGroupId;
    /**
     * Instantiates a new AccountCreateRequestBody and sets the default values.
     */
    public AccountCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccountCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountCreateRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("account_name", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("parent_account_id", (n) -> { this.setParentAccountId(n.getStringValue()); });
        deserializerMap.put("primary_billing_group_id", (n) -> { this.setPrimaryBillingGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the parent_account_id property value. Account ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentAccountId() {
        return this.parentAccountId;
    }
    /**
     * Gets the primary_billing_group_id property value. Billing group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryBillingGroupId() {
        return this.primaryBillingGroupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_name", this.getAccountName());
        writer.writeStringValue("parent_account_id", this.getParentAccountId());
        writer.writeStringValue("primary_billing_group_id", this.getPrimaryBillingGroupId());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the parent_account_id property value. Account ID
     * @param value Value to set for the parent_account_id property.
     */
    public void setParentAccountId(@jakarta.annotation.Nullable final String value) {
        this.parentAccountId = value;
    }
    /**
     * Sets the primary_billing_group_id property value. Billing group ID
     * @param value Value to set for the primary_billing_group_id property.
     */
    public void setPrimaryBillingGroupId(@jakarta.annotation.Nullable final String value) {
        this.primaryBillingGroupId = value;
    }
}
