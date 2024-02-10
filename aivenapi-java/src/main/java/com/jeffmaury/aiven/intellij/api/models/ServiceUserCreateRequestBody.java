package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceUserCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUserCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Service specific access controls for user
     */
    private ServiceUserCreateRequestBodyAccessControl accessControl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Authentication details
     */
    private ServiceUserCreateRequestBodyAuthentication authentication;
    /**
     * Service username
     */
    private String username;
    /**
     * Instantiates a new ServiceUserCreateRequestBody and sets the default values.
     */
    public ServiceUserCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCreateRequestBody();
    }
    /**
     * Gets the access_control property value. Service specific access controls for user
     * @return a ServiceUserCreateRequestBodyAccessControl
     */
    @jakarta.annotation.Nullable
    public ServiceUserCreateRequestBodyAccessControl getAccessControl() {
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
     * @return a ServiceUserCreateRequestBodyAuthentication
     */
    @jakarta.annotation.Nullable
    public ServiceUserCreateRequestBodyAuthentication getAuthentication() {
        return this.authentication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("access_control", (n) -> { this.setAccessControl(n.getObjectValue(ServiceUserCreateRequestBodyAccessControl::createFromDiscriminatorValue)); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getEnumValue(ServiceUserCreateRequestBodyAuthentication::forValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the username property value. Service username
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("access_control", this.getAccessControl());
        writer.writeEnumValue("authentication", this.getAuthentication());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access_control property value. Service specific access controls for user
     * @param value Value to set for the access_control property.
     */
    public void setAccessControl(@jakarta.annotation.Nullable final ServiceUserCreateRequestBodyAccessControl value) {
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
    public void setAuthentication(@jakarta.annotation.Nullable final ServiceUserCreateRequestBodyAuthentication value) {
        this.authentication = value;
    }
    /**
     * Sets the username property value. Service username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
