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
public class CheckPasswordStrengthExistingUserRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** New password */
    private String newPassword;
    /** User password */
    private String oldPassword;
    /**
     * Instantiates a new CheckPasswordStrengthExistingUserRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CheckPasswordStrengthExistingUserRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CheckPasswordStrengthExistingUserRequestBody
     */
    @javax.annotation.Nonnull
    public static CheckPasswordStrengthExistingUserRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CheckPasswordStrengthExistingUserRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("new_password", (n) -> { this.setNewPassword(n.getStringValue()); });
        deserializerMap.put("old_password", (n) -> { this.setOldPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the new_password property value. New password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewPassword() {
        return this.newPassword;
    }
    /**
     * Gets the old_password property value. User password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldPassword() {
        return this.oldPassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("new_password", this.getNewPassword());
        writer.writeStringValue("old_password", this.getOldPassword());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the new_password property value. New password
     * @param value Value to set for the newPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewPassword(@javax.annotation.Nullable final String value) {
        this.newPassword = value;
    }
    /**
     * Sets the old_password property value. User password
     * @param value Value to set for the oldPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldPassword(@javax.annotation.Nullable final String value) {
        this.oldPassword = value;
    }
}
