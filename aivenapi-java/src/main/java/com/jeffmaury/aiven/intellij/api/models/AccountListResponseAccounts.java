package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountListResponseAccounts implements AdditionalDataHolder, Parsable {
    /**
     * Describe the source of the account
     */
    private AccountListResponseAccountsAccessSource accessSource;
    /**
     * Account ID
     */
    private String accountId;
    /**
     * Account name
     */
    private String accountName;
    /**
     * Team ID
     */
    private String accountOwnerTeamId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String createTime;
    /**
     * Feature flags
     */
    private AccountListResponseAccountsFeatures features;
    /**
     * If true, user is part of a team of this or a parent account
     */
    private Boolean isAccountMember;
    /**
     * If true, user is part of the owners team for this account
     */
    private Boolean isAccountOwner;
    /**
     * Organization ID
     */
    private String organizationId;
    /**
     * Account ID
     */
    private String parentAccountId;
    /**
     * Billing group ID
     */
    private String primaryBillingGroupId;
    /**
     * Account ID
     */
    private String rootAccountId;
    /**
     * Tenant identifier
     */
    private String tenantId;
    /**
     * Timestamp in ISO 8601 format, always in UTC
     */
    private String updateTime;
    /**
     * Instantiates a new AccountListResponseAccounts and sets the default values.
     */
    public AccountListResponseAccounts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountListResponseAccounts
     */
    @jakarta.annotation.Nonnull
    public static AccountListResponseAccounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountListResponseAccounts();
    }
    /**
     * Gets the access_source property value. Describe the source of the account
     * @return a AccountListResponseAccountsAccessSource
     */
    @jakarta.annotation.Nullable
    public AccountListResponseAccountsAccessSource getAccessSource() {
        return this.accessSource;
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
     * Gets the account_name property value. Account name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the account_owner_team_id property value. Team ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountOwnerTeamId() {
        return this.accountOwnerTeamId;
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
     * Gets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the features property value. Feature flags
     * @return a AccountListResponseAccountsFeatures
     */
    @jakarta.annotation.Nullable
    public AccountListResponseAccountsFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("access_source", (n) -> { this.setAccessSource(n.getEnumValue(AccountListResponseAccountsAccessSource.class)); });
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("account_name", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("account_owner_team_id", (n) -> { this.setAccountOwnerTeamId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(AccountListResponseAccountsFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("is_account_member", (n) -> { this.setIsAccountMember(n.getBooleanValue()); });
        deserializerMap.put("is_account_owner", (n) -> { this.setIsAccountOwner(n.getBooleanValue()); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("parent_account_id", (n) -> { this.setParentAccountId(n.getStringValue()); });
        deserializerMap.put("primary_billing_group_id", (n) -> { this.setPrimaryBillingGroupId(n.getStringValue()); });
        deserializerMap.put("root_account_id", (n) -> { this.setRootAccountId(n.getStringValue()); });
        deserializerMap.put("tenant_id", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_account_member property value. If true, user is part of a team of this or a parent account
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAccountMember() {
        return this.isAccountMember;
    }
    /**
     * Gets the is_account_owner property value. If true, user is part of the owners team for this account
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAccountOwner() {
        return this.isAccountOwner;
    }
    /**
     * Gets the organization_id property value. Organization ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
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
     * Gets the root_account_id property value. Account ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRootAccountId() {
        return this.rootAccountId;
    }
    /**
     * Gets the tenant_id property value. Tenant identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the update_time property value. Timestamp in ISO 8601 format, always in UTC
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
        writer.writeEnumValue("access_source", this.getAccessSource());
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("account_name", this.getAccountName());
        writer.writeStringValue("account_owner_team_id", this.getAccountOwnerTeamId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeObjectValue("features", this.getFeatures());
        writer.writeBooleanValue("is_account_member", this.getIsAccountMember());
        writer.writeBooleanValue("is_account_owner", this.getIsAccountOwner());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeStringValue("parent_account_id", this.getParentAccountId());
        writer.writeStringValue("primary_billing_group_id", this.getPrimaryBillingGroupId());
        writer.writeStringValue("root_account_id", this.getRootAccountId());
        writer.writeStringValue("tenant_id", this.getTenantId());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access_source property value. Describe the source of the account
     * @param value Value to set for the access_source property.
     */
    public void setAccessSource(@jakarta.annotation.Nullable final AccountListResponseAccountsAccessSource value) {
        this.accessSource = value;
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the account_id property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the account_name property value. Account name
     * @param value Value to set for the account_name property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the account_owner_team_id property value. Team ID
     * @param value Value to set for the account_owner_team_id property.
     */
    public void setAccountOwnerTeamId(@jakarta.annotation.Nullable final String value) {
        this.accountOwnerTeamId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the create_time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     */
    public void setFeatures(@jakarta.annotation.Nullable final AccountListResponseAccountsFeatures value) {
        this.features = value;
    }
    /**
     * Sets the is_account_member property value. If true, user is part of a team of this or a parent account
     * @param value Value to set for the is_account_member property.
     */
    public void setIsAccountMember(@jakarta.annotation.Nullable final Boolean value) {
        this.isAccountMember = value;
    }
    /**
     * Sets the is_account_owner property value. If true, user is part of the owners team for this account
     * @param value Value to set for the is_account_owner property.
     */
    public void setIsAccountOwner(@jakarta.annotation.Nullable final Boolean value) {
        this.isAccountOwner = value;
    }
    /**
     * Sets the organization_id property value. Organization ID
     * @param value Value to set for the organization_id property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
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
    /**
     * Sets the root_account_id property value. Account ID
     * @param value Value to set for the root_account_id property.
     */
    public void setRootAccountId(@jakarta.annotation.Nullable final String value) {
        this.rootAccountId = value;
    }
    /**
     * Sets the tenant_id property value. Tenant identifier
     * @param value Value to set for the tenant_id property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the update_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the update_time property.
     */
    public void setUpdateTime(@jakarta.annotation.Nullable final String value) {
        this.updateTime = value;
    }
}
