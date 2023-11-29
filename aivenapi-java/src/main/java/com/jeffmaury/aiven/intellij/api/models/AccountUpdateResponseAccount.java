package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Account details
 */
public class AccountUpdateResponseAccount implements AdditionalDataHolder, Parsable {
    /** Describe the source of the account */
    private AccountUpdateResponseAccountAccessSource accessSource;
    /** Account ID */
    private String accountId;
    /** Account name */
    private String accountName;
    /** Team ID */
    private String accountOwnerTeamId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String createTime;
    /** Feature flags */
    private AccountUpdateResponseAccountFeatures features;
    /** If true, user is part of a team of this or a parent account */
    private Boolean isAccountMember;
    /** If true, user is part of the owners team for this account */
    private Boolean isAccountOwner;
    /** Organization ID */
    private String organizationId;
    /** Account ID */
    private String parentAccountId;
    /** Billing group ID */
    private String primaryBillingGroupId;
    /** Account ID */
    private String rootAccountId;
    /** Tenant identifier */
    private String tenantId;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String updateTime;
    /**
     * Instantiates a new AccountUpdateResponseAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountUpdateResponseAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountUpdateResponseAccount
     */
    @javax.annotation.Nonnull
    public static AccountUpdateResponseAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountUpdateResponseAccount();
    }
    /**
     * Gets the access_source property value. Describe the source of the account
     * @return a AccountUpdateResponseAccountAccessSource
     */
    @javax.annotation.Nullable
    public AccountUpdateResponseAccountAccessSource getAccessSource() {
        return this.accessSource;
    }
    /**
     * Gets the account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the account_name property value. Account name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the account_owner_team_id property value. Team ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountOwnerTeamId() {
        return this.accountOwnerTeamId;
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
     * Gets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Gets the features property value. Feature flags
     * @return a AccountUpdateResponseAccountFeatures
     */
    @javax.annotation.Nullable
    public AccountUpdateResponseAccountFeatures getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("access_source", (n) -> { this.setAccessSource(n.getEnumValue(AccountUpdateResponseAccountAccessSource.class)); });
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("account_name", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("account_owner_team_id", (n) -> { this.setAccountOwnerTeamId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(AccountUpdateResponseAccountFeatures::createFromDiscriminatorValue)); });
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAccountMember() {
        return this.isAccountMember;
    }
    /**
     * Gets the is_account_owner property value. If true, user is part of the owners team for this account
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAccountOwner() {
        return this.isAccountOwner;
    }
    /**
     * Gets the organization_id property value. Organization ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the parent_account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentAccountId() {
        return this.parentAccountId;
    }
    /**
     * Gets the primary_billing_group_id property value. Billing group ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryBillingGroupId() {
        return this.primaryBillingGroupId;
    }
    /**
     * Gets the root_account_id property value. Account ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootAccountId() {
        return this.rootAccountId;
    }
    /**
     * Gets the tenant_id property value. Tenant identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the update_time property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the accessSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessSource(@javax.annotation.Nullable final AccountUpdateResponseAccountAccessSource value) {
        this.accessSource = value;
    }
    /**
     * Sets the account_id property value. Account ID
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the account_name property value. Account name
     * @param value Value to set for the accountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the account_owner_team_id property value. Team ID
     * @param value Value to set for the accountOwnerTeamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountOwnerTeamId(@javax.annotation.Nullable final String value) {
        this.accountOwnerTeamId = value;
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
     * Sets the create_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the createTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreateTime(@javax.annotation.Nullable final String value) {
        this.createTime = value;
    }
    /**
     * Sets the features property value. Feature flags
     * @param value Value to set for the features property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatures(@javax.annotation.Nullable final AccountUpdateResponseAccountFeatures value) {
        this.features = value;
    }
    /**
     * Sets the is_account_member property value. If true, user is part of a team of this or a parent account
     * @param value Value to set for the isAccountMember property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAccountMember(@javax.annotation.Nullable final Boolean value) {
        this.isAccountMember = value;
    }
    /**
     * Sets the is_account_owner property value. If true, user is part of the owners team for this account
     * @param value Value to set for the isAccountOwner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAccountOwner(@javax.annotation.Nullable final Boolean value) {
        this.isAccountOwner = value;
    }
    /**
     * Sets the organization_id property value. Organization ID
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the parent_account_id property value. Account ID
     * @param value Value to set for the parentAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentAccountId(@javax.annotation.Nullable final String value) {
        this.parentAccountId = value;
    }
    /**
     * Sets the primary_billing_group_id property value. Billing group ID
     * @param value Value to set for the primaryBillingGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryBillingGroupId(@javax.annotation.Nullable final String value) {
        this.primaryBillingGroupId = value;
    }
    /**
     * Sets the root_account_id property value. Account ID
     * @param value Value to set for the rootAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootAccountId(@javax.annotation.Nullable final String value) {
        this.rootAccountId = value;
    }
    /**
     * Sets the tenant_id property value. Tenant identifier
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the update_time property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the updateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateTime(@javax.annotation.Nullable final String value) {
        this.updateTime = value;
    }
}
