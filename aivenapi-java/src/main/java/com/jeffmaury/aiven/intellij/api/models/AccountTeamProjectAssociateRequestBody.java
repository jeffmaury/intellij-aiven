package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountTeamProjectAssociateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountTeamProjectAssociateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Team type (permission level)
     */
    private AccountTeamProjectAssociateRequestBodyTeamType teamType;
    /**
     * Instantiates a new AccountTeamProjectAssociateRequestBody and sets the default values.
     */
    public AccountTeamProjectAssociateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountTeamProjectAssociateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccountTeamProjectAssociateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountTeamProjectAssociateRequestBody();
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
        deserializerMap.put("team_type", (n) -> { this.setTeamType(n.getEnumValue(AccountTeamProjectAssociateRequestBodyTeamType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the team_type property value. Team type (permission level)
     * @return a AccountTeamProjectAssociateRequestBodyTeamType
     */
    @jakarta.annotation.Nullable
    public AccountTeamProjectAssociateRequestBodyTeamType getTeamType() {
        return this.teamType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("team_type", this.getTeamType());
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
     * Sets the team_type property value. Team type (permission level)
     * @param value Value to set for the team_type property.
     */
    public void setTeamType(@jakarta.annotation.Nullable final AccountTeamProjectAssociateRequestBodyTeamType value) {
        this.teamType = value;
    }
}
