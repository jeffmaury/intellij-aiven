package com.jeffmaury.aiven.intellij.api.account.item.teams;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountTeamCreateResponse403ErrorErrors implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * feature_not_enabled: This feature is not enabled in your context, please contact support to enable it. team_limit_exceeded: Maximum number of teams reached, please contact support to increase the limit
     */
    private AccountTeamCreateResponse403ErrorErrorsErrorCode errorCode;
    /**
     * The message property
     */
    private String message;
    /**
     * Instantiates a new AccountTeamCreateResponse403ErrorErrors and sets the default values.
     */
    public AccountTeamCreateResponse403ErrorErrors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountTeamCreateResponse403ErrorErrors
     */
    @jakarta.annotation.Nonnull
    public static AccountTeamCreateResponse403ErrorErrors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountTeamCreateResponse403ErrorErrors();
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
     * Gets the error_code property value. feature_not_enabled: This feature is not enabled in your context, please contact support to enable it. team_limit_exceeded: Maximum number of teams reached, please contact support to increase the limit
     * @return a AccountTeamCreateResponse403ErrorErrorsErrorCode
     */
    @jakarta.annotation.Nullable
    public AccountTeamCreateResponse403ErrorErrorsErrorCode getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("error_code", (n) -> { this.setErrorCode(n.getEnumValue(AccountTeamCreateResponse403ErrorErrorsErrorCode::forValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
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
        writer.writeEnumValue("error_code", this.getErrorCode());
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
     * Sets the error_code property value. feature_not_enabled: This feature is not enabled in your context, please contact support to enable it. team_limit_exceeded: Maximum number of teams reached, please contact support to increase the limit
     * @param value Value to set for the error_code property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final AccountTeamCreateResponse403ErrorErrorsErrorCode value) {
        this.errorCode = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
