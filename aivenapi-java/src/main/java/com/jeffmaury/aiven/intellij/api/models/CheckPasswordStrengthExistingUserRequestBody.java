package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * CheckPasswordStrengthExistingUserRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CheckPasswordStrengthExistingUserRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * New password
     */
    private String newPassword;
    /**
     * User password
     */
    private String oldPassword;
    /**
     * Instantiates a new CheckPasswordStrengthExistingUserRequestBody and sets the default values.
     */
    public CheckPasswordStrengthExistingUserRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CheckPasswordStrengthExistingUserRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CheckPasswordStrengthExistingUserRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CheckPasswordStrengthExistingUserRequestBody();
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
        deserializerMap.put("new_password", (n) -> { this.setNewPassword(n.getStringValue()); });
        deserializerMap.put("old_password", (n) -> { this.setOldPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the new_password property value. New password
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNewPassword() {
        return this.newPassword;
    }
    /**
     * Gets the old_password property value. User password
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOldPassword() {
        return this.oldPassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("new_password", this.getNewPassword());
        writer.writeStringValue("old_password", this.getOldPassword());
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
     * Sets the new_password property value. New password
     * @param value Value to set for the new_password property.
     */
    public void setNewPassword(@jakarta.annotation.Nullable final String value) {
        this.newPassword = value;
    }
    /**
     * Sets the old_password property value. User password
     * @param value Value to set for the old_password property.
     */
    public void setOldPassword(@jakarta.annotation.Nullable final String value) {
        this.oldPassword = value;
    }
}
