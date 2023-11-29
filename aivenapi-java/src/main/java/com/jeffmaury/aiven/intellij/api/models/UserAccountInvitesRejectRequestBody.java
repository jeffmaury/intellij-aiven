package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserAccountInvitesRejectRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAccountInvitesRejectRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Account ID
     */
    private String accountId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Team ID
     */
    private String teamId;
    /**
     * Instantiates a new UserAccountInvitesRejectRequestBody and sets the default values.
     */
    public UserAccountInvitesRejectRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAccountInvitesRejectRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UserAccountInvitesRejectRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccountInvitesRejectRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("account_id", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("team_id", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the team_id property value. Team ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("account_id", this.getAccountId());
        writer.writeStringValue("team_id", this.getTeamId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the account_id property value. Account ID
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
     * Sets the team_id property value. Team ID
     * @param value Value to set for the team_id property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
