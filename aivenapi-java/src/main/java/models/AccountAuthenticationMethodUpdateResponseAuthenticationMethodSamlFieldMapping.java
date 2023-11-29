package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * SAMLFieldMapping
 */
public class AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Field name for user email */
    private String email;
    /** Field name for user's first name */
    private String firstName;
    /** Field name for user's identity. This field must always exist in responses, and must be immutable and unique. Contents of this field are used to identify the user. Using user ID (such as unix user ID) is highly recommended, as email address may change, requiring relinking user to Aiven user. */
    private String identity;
    /** Field name for user's lastname */
    private String lastName;
    /** Field name for user's full name. If specified, first_name and last_name mappings are ignored */
    private String realName;
    /**
     * Instantiates a new AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping
     */
    @javax.annotation.Nonnull
    public static AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountAuthenticationMethodUpdateResponseAuthenticationMethodSamlFieldMapping();
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
     * Gets the email property value. Field name for user email
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. Field name for user's first name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the identity property value. Field name for user's identity. This field must always exist in responses, and must be immutable and unique. Contents of this field are used to identify the user. Using user ID (such as unix user ID) is highly recommended, as email address may change, requiring relinking user to Aiven user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentity() {
        return this.identity;
    }
    /**
     * Gets the last_name property value. Field name for user's lastname
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the real_name property value. Field name for user's full name. If specified, first_name and last_name mappings are ignored
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("identity", this.getIdentity());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("real_name", this.getRealName());
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
     * Sets the email property value. Field name for user email
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the first_name property value. Field name for user's first name
     * @param value Value to set for the firstName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstName(@javax.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the identity property value. Field name for user's identity. This field must always exist in responses, and must be immutable and unique. Contents of this field are used to identify the user. Using user ID (such as unix user ID) is highly recommended, as email address may change, requiring relinking user to Aiven user.
     * @param value Value to set for the identity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentity(@javax.annotation.Nullable final String value) {
        this.identity = value;
    }
    /**
     * Sets the last_name property value. Field name for user's lastname
     * @param value Value to set for the lastName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastName(@javax.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the real_name property value. Field name for user's full name. If specified, first_name and last_name mappings are ignored
     * @param value Value to set for the realName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealName(@javax.annotation.Nullable final String value) {
        this.realName = value;
    }
}
