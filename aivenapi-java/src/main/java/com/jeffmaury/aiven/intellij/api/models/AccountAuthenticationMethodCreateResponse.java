package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountAuthenticationMethodCreateResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountAuthenticationMethodCreateResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * AuthenticationMethod
     */
    private AccountAuthenticationMethodCreateResponseAuthenticationMethod authenticationMethod;
    /**
     * Instantiates a new AccountAuthenticationMethodCreateResponse and sets the default values.
     */
    public AccountAuthenticationMethodCreateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodCreateResponse
     */
    @jakarta.annotation.Nonnull
    public static AccountAuthenticationMethodCreateResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodCreateResponse();
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
     * Gets the authentication_method property value. AuthenticationMethod
     * @return a AccountAuthenticationMethodCreateResponseAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public AccountAuthenticationMethodCreateResponseAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("authentication_method", (n) -> { this.setAuthenticationMethod(n.getObjectValue(AccountAuthenticationMethodCreateResponseAuthenticationMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authentication_method", this.getAuthenticationMethod());
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
     * Sets the authentication_method property value. AuthenticationMethod
     * @param value Value to set for the authentication_method property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final AccountAuthenticationMethodCreateResponseAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
}
