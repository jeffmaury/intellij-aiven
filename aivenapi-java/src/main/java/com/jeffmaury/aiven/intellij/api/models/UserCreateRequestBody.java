package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * UserCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of a company
     */
    private String company;
    /**
     * Two letter country code for country
     */
    private String countryCode;
    /**
     * Credit code
     */
    private String creditCode;
    /**
     * User email address
     */
    private String email;
    /**
     * Categories of email communication enabled for user during signup
     */
    private java.util.List<String> emailCommunicationCategories;
    /**
     * Origin of the user
     */
    private String origin;
    /**
     * User password
     */
    private String password;
    /**
     * User real name
     */
    private String realName;
    /**
     * Address state
     */
    private String state;
    /**
     * Signup token for single sign-on linking
     */
    private String token;
    /**
     * Instantiates a new UserCreateRequestBody and sets the default values.
     */
    public UserCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UserCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCreateRequestBody();
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
     * Gets the company property value. Name of a company
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompany() {
        return this.company;
    }
    /**
     * Gets the country_code property value. Two letter country code for country
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the credit_code property value. Credit code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreditCode() {
        return this.creditCode;
    }
    /**
     * Gets the email property value. User email address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the email_communication_categories property value. Categories of email communication enabled for user during signup
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailCommunicationCategories() {
        return this.emailCommunicationCategories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("credit_code", (n) -> { this.setCreditCode(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("email_communication_categories", (n) -> { this.setEmailCommunicationCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("real_name", (n) -> { this.setRealName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the origin property value. Origin of the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the password property value. User password
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the real_name property value. User real name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealName() {
        return this.realName;
    }
    /**
     * Gets the state property value. Address state
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the token property value. Signup token for single sign-on linking
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("credit_code", this.getCreditCode());
        writer.writeStringValue("email", this.getEmail());
        writer.writeCollectionOfPrimitiveValues("email_communication_categories", this.getEmailCommunicationCategories());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("real_name", this.getRealName());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("token", this.getToken());
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
     * Sets the company property value. Name of a company
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the country_code property value. Two letter country code for country
     * @param value Value to set for the country_code property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the credit_code property value. Credit code
     * @param value Value to set for the credit_code property.
     */
    public void setCreditCode(@jakarta.annotation.Nullable final String value) {
        this.creditCode = value;
    }
    /**
     * Sets the email property value. User email address
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the email_communication_categories property value. Categories of email communication enabled for user during signup
     * @param value Value to set for the email_communication_categories property.
     */
    public void setEmailCommunicationCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.emailCommunicationCategories = value;
    }
    /**
     * Sets the origin property value. Origin of the user
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the password property value. User password
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the real_name property value. User real name
     * @param value Value to set for the real_name property.
     */
    public void setRealName(@jakarta.annotation.Nullable final String value) {
        this.realName = value;
    }
    /**
     * Sets the state property value. Address state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the token property value. Signup token for single sign-on linking
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
