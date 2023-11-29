package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationGetResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Account ID of the organization's root unit
     */
    private String accountId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Time of creating the organization
     */
    private String createTime;
    /**
     * Organization's ID
     */
    private String organizationId;
    /**
     * Organization's name
     */
    private String organizationName;
    /**
     * Tier of the organization
     */
    private OrganizationGetResponseTier tier;
    /**
     * Time of the organization's latest update
     */
    private String updateTime;
    /**
     * Instantiates a new OrganizationGetResponse and sets the default values.
     */
    public OrganizationGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationGetResponse
     */
    @jakarta.annotation.Nonnull
    public static OrganizationGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationGetResponse();
    }
    /**
     * Gets the account_id property value. Account ID of the organization's root unit
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
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
     * Gets the create_time property value. Time of creating the organization
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("organization_name", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("tier", (n) -> { this.setTier(n.getEnumValue(OrganizationGetResponseTier.class)); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the organization_id property value. Organization's ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
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
     * Gets the tier property value. Tier of the organization
     * @return a OrganizationGetResponseTier
     */
    @jakarta.annotation.Nullable
    public OrganizationGetResponseTier getTier() {
        return this.tier;
    }
    /**
     * Gets the update_time property value. Time of the organization's latest update
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("organization_name", this.getOrganizationName());
        writer.writeEnumValue("tier", this.getTier());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID of the organization's root unit
     * @param value Value to set for the account_id property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the create_time property value. Time of creating the organization
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the organization_id property value. Organization's ID
     * @param value Value to set for the organization_id property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the organization_name property value. Organization's name
     * @param value Value to set for the organization_name property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the tier property value. Tier of the organization
     * @param value Value to set for the tier property.
     */
    public void setTier(@jakarta.annotation.Nullable final OrganizationGetResponseTier value) {
        this.tier = value;
    }
    /**
     * Sets the update_time property value. Time of the organization's latest update
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
}
