package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountAuthenticationMethodUpdateResponse
 */
public class AccountAuthenticationMethodUpdateResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** AuthenticationMethod */
    private AccountAuthenticationMethodUpdateResponseAuthenticationMethod authenticationMethod;
    /**
     * Instantiates a new AccountAuthenticationMethodUpdateResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodUpdateResponse
     */
    @javax.annotation.Nonnull
    public static AccountAuthenticationMethodUpdateResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodUpdateResponse();
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
     * Gets the authentication_method property value. AuthenticationMethod
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethod
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("authentication_method", (n) -> { this.setAuthenticationMethod(n.getObjectValue(AccountAuthenticationMethodUpdateResponseAuthenticationMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authentication_method", this.getAuthenticationMethod());
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
     * Sets the authentication_method property value. AuthenticationMethod
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final AccountAuthenticationMethodUpdateResponseAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
}
