package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserAuthLoginOptionsResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAuthLoginOptionsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Action
     */
    private UserAuthLoginOptionsResponseAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * HTTP method used for redirecting
     */
    private UserAuthLoginOptionsResponseMethod method;
    /**
     * Human readable name
     */
    private String name;
    /**
     * List of available login methods
     */
    private java.util.List<UserAuthLoginOptionsResponseNone> none;
    /**
     * Redirect URL for signing in
     */
    private String redirectUrl;
    /**
     * Instantiates a new UserAuthLoginOptionsResponse and sets the default values.
     */
    public UserAuthLoginOptionsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAuthLoginOptionsResponse
     */
    @jakarta.annotation.Nonnull
    public static UserAuthLoginOptionsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAuthLoginOptionsResponse();
    }
    /**
     * Gets the action property value. Action
     * @return a UserAuthLoginOptionsResponseAction
     */
    @jakarta.annotation.Nullable
    public UserAuthLoginOptionsResponseAction getAction() {
        return this.action;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(UserAuthLoginOptionsResponseAction::forValue)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(UserAuthLoginOptionsResponseMethod::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("None", (n) -> { this.setNone(n.getCollectionOfObjectValues(UserAuthLoginOptionsResponseNone::createFromDiscriminatorValue)); });
        deserializerMap.put("redirect_url", (n) -> { this.setRedirectUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the method property value. HTTP method used for redirecting
     * @return a UserAuthLoginOptionsResponseMethod
     */
    @jakarta.annotation.Nullable
    public UserAuthLoginOptionsResponseMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the name property value. Human readable name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the None property value. List of available login methods
     * @return a java.util.List<UserAuthLoginOptionsResponseNone>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAuthLoginOptionsResponseNone> getNone() {
        return this.none;
    }
    /**
     * Gets the redirect_url property value. Redirect URL for signing in
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("method", this.getMethod());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("None", this.getNone());
        writer.writeStringValue("redirect_url", this.getRedirectUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Action
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final UserAuthLoginOptionsResponseAction value) {
        this.action = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the method property value. HTTP method used for redirecting
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final UserAuthLoginOptionsResponseMethod value) {
        this.method = value;
    }
    /**
     * Sets the name property value. Human readable name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the None property value. List of available login methods
     * @param value Value to set for the None property.
     */
    public void setNone(@jakarta.annotation.Nullable final java.util.List<UserAuthLoginOptionsResponseNone> value) {
        this.none = value;
    }
    /**
     * Sets the redirect_url property value. Redirect URL for signing in
     * @param value Value to set for the redirect_url property.
     */
    public void setRedirectUrl(@jakarta.annotation.Nullable final String value) {
        this.redirectUrl = value;
    }
}
