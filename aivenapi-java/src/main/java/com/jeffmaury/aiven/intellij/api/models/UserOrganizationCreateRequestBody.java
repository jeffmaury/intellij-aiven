package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserOrganizationCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserOrganizationCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Organization's name
     */
    private String organizationName;
    /**
     * Billing group ID
     */
    private String primaryBillingGroupId;
    /**
     * Tier of the organization
     */
    private UserOrganizationCreateRequestBodyTier tier;
    /**
     * Instantiates a new UserOrganizationCreateRequestBody and sets the default values.
     */
    public UserOrganizationCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserOrganizationCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UserOrganizationCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserOrganizationCreateRequestBody();
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
        deserializerMap.put("organization_name", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("primary_billing_group_id", (n) -> { this.setPrimaryBillingGroupId(n.getStringValue()); });
        deserializerMap.put("tier", (n) -> { this.setTier(n.getEnumValue(UserOrganizationCreateRequestBodyTier::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organization_name property value. Organization's name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
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
     * Gets the tier property value. Tier of the organization
     * @return a UserOrganizationCreateRequestBodyTier
     */
    @jakarta.annotation.Nullable
    public UserOrganizationCreateRequestBodyTier getTier() {
        return this.tier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("organization_name", this.getOrganizationName());
        writer.writeStringValue("primary_billing_group_id", this.getPrimaryBillingGroupId());
        writer.writeEnumValue("tier", this.getTier());
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
     * Sets the organization_name property value. Organization's name
     * @param value Value to set for the organization_name property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the primary_billing_group_id property value. Billing group ID
     * @param value Value to set for the primary_billing_group_id property.
     */
    public void setPrimaryBillingGroupId(@jakarta.annotation.Nullable final String value) {
        this.primaryBillingGroupId = value;
    }
    /**
     * Sets the tier property value. Tier of the organization
     * @param value Value to set for the tier property.
     */
    public void setTier(@jakarta.annotation.Nullable final UserOrganizationCreateRequestBodyTier value) {
        this.tier = value;
    }
}
