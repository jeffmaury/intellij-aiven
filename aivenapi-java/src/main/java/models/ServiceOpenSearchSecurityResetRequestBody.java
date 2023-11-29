package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceOpenSearchSecurityResetRequestBody
 */
public class ServiceOpenSearchSecurityResetRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Current os-sec-admin password */
    private String adminPassword;
    /** New os-sec-admin password */
    private String newPassword;
    /**
     * Instantiates a new ServiceOpenSearchSecurityResetRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchSecurityResetRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchSecurityResetRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchSecurityResetRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchSecurityResetRequestBody();
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
     * Gets the admin_password property value. Current os-sec-admin password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminPassword() {
        return this.adminPassword;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("admin_password", (n) -> { this.setAdminPassword(n.getStringValue()); });
        deserializerMap.put("new_password", (n) -> { this.setNewPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the new_password property value. New os-sec-admin password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewPassword() {
        return this.newPassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("admin_password", this.getAdminPassword());
        writer.writeStringValue("new_password", this.getNewPassword());
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
     * Sets the admin_password property value. Current os-sec-admin password
     * @param value Value to set for the adminPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminPassword(@javax.annotation.Nullable final String value) {
        this.adminPassword = value;
    }
    /**
     * Sets the new_password property value. New os-sec-admin password
     * @param value Value to set for the newPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewPassword(@javax.annotation.Nullable final String value) {
        this.newPassword = value;
    }
}
