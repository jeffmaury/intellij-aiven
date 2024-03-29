package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceUserCredentialsModifyRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUserCredentialsModifyRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Service specific access controls for user
     */
    private ServiceUserCredentialsModifyRequestBodyAccessControl accessControl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Authentication details
     */
    private ServiceUserCredentialsModifyRequestBodyAuthentication authentication;
    /**
     * New password
     */
    private String newPassword;
    /**
     * Operation type
     */
    private ServiceUserCredentialsModifyRequestBodyOperation operation;
    /**
     * Instantiates a new ServiceUserCredentialsModifyRequestBody and sets the default values.
     */
    public ServiceUserCredentialsModifyRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCredentialsModifyRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyRequestBody();
    }
    /**
     * Gets the access_control property value. Service specific access controls for user
     * @return a ServiceUserCredentialsModifyRequestBodyAccessControl
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyRequestBodyAccessControl getAccessControl() {
        return this.accessControl;
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
     * Gets the authentication property value. Authentication details
     * @return a ServiceUserCredentialsModifyRequestBodyAuthentication
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyRequestBodyAuthentication getAuthentication() {
        return this.authentication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("access_control", (n) -> { this.setAccessControl(n.getObjectValue(ServiceUserCredentialsModifyRequestBodyAccessControl::createFromDiscriminatorValue)); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getEnumValue(ServiceUserCredentialsModifyRequestBodyAuthentication::forValue)); });
        deserializerMap.put("new_password", (n) -> { this.setNewPassword(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(ServiceUserCredentialsModifyRequestBodyOperation::forValue)); });
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
     * Gets the operation property value. Operation type
     * @return a ServiceUserCredentialsModifyRequestBodyOperation
     */
    @jakarta.annotation.Nullable
    public ServiceUserCredentialsModifyRequestBodyOperation getOperation() {
        return this.operation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("access_control", this.getAccessControl());
        writer.writeEnumValue("authentication", this.getAuthentication());
        writer.writeStringValue("new_password", this.getNewPassword());
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access_control property value. Service specific access controls for user
     * @param value Value to set for the access_control property.
     */
    public void setAccessControl(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyRequestBodyAccessControl value) {
        this.accessControl = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authentication property value. Authentication details
     * @param value Value to set for the authentication property.
     */
    public void setAuthentication(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyRequestBodyAuthentication value) {
        this.authentication = value;
    }
    /**
     * Sets the new_password property value. New password
     * @param value Value to set for the new_password property.
     */
    public void setNewPassword(@jakarta.annotation.Nullable final String value) {
        this.newPassword = value;
    }
    /**
     * Sets the operation property value. Operation type
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final ServiceUserCredentialsModifyRequestBodyOperation value) {
        this.operation = value;
    }
}
