package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Account Team details
 */
public class AccountTeamGetResponseTeam implements AdditionalDataHolder, Parsable {
    /** Account ID */
    private String accountId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String createTime;
    /** Team ID */
    private String teamId;
    /** Team name */
    private String teamName;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String updateTime;
    /**
     * Instantiates a new AccountTeamGetResponseTeam and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountTeamGetResponseTeam() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountTeamGetResponseTeam
     */
    @javax.annotation.Nonnull
    public static AccountTeamGetResponseTeam createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountTeamGetResponseTeam();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("create_time", (n) -> { this.setCreateTime(n.getStringValue()); });
        deserializerMap.put("team_id", (n) -> { this.setTeamId(n.getStringValue()); });
        deserializerMap.put("team_name", (n) -> { this.setTeamName(n.getStringValue()); });
        deserializerMap.put("update_time", (n) -> { this.setUpdateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the team_id property value. Team ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Gets the team_name property value. Team name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamName() {
        return this.teamName;
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
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("create_time", this.getCreateTime());
        writer.writeStringValue("team_id", this.getTeamId());
        writer.writeStringValue("team_name", this.getTeamName());
        writer.writeStringValue("update_time", this.getUpdateTime());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the team_id property value. Team ID
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this.teamId = value;
    }
    /**
     * Sets the team_name property value. Team name
     * @param value Value to set for the teamName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamName(@javax.annotation.Nullable final String value) {
        this.teamName = value;
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
