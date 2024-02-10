package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceGetResponseServiceUsers implements AdditionalDataHolder, Parsable {
    /**
     * Access certificate for TLS client authentication
     */
    private String accessCert;
    /**
     * Validity end time (ISO8601) for the current access certificate
     */
    private String accessCertNotValidAfterTime;
    /**
     * Service specific access controls for user
     */
    private ServiceGetResponseServiceUsersAccessControl accessControl;
    /**
     * Access key for TLS client authentication
     */
    private String accessKey;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Authentication details
     */
    private ServiceGetResponseServiceUsersAuthentication authentication;
    /**
     * Validity end time (ISO8601) for the expiring access certificate
     */
    private String expiringCertNotValidAfterTime;
    /**
     * Account password. A null value indicates a user overridden password.
     */
    private String password;
    /**
     * Account type
     */
    private String type;
    /**
     * Account username
     */
    private String username;
    /**
     * Instantiates a new ServiceGetResponseServiceUsers and sets the default values.
     */
    public ServiceGetResponseServiceUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceGetResponseServiceUsers
     */
    @jakarta.annotation.Nonnull
    public static ServiceGetResponseServiceUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceGetResponseServiceUsers();
    }
    /**
     * Gets the access_cert property value. Access certificate for TLS client authentication
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessCert() {
        return this.accessCert;
    }
    /**
     * Gets the access_cert_not_valid_after_time property value. Validity end time (ISO8601) for the current access certificate
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessCertNotValidAfterTime() {
        return this.accessCertNotValidAfterTime;
    }
    /**
     * Gets the access_control property value. Service specific access controls for user
     * @return a ServiceGetResponseServiceUsersAccessControl
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceUsersAccessControl getAccessControl() {
        return this.accessControl;
    }
    /**
     * Gets the access_key property value. Access key for TLS client authentication
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessKey() {
        return this.accessKey;
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
     * @return a ServiceGetResponseServiceUsersAuthentication
     */
    @jakarta.annotation.Nullable
    public ServiceGetResponseServiceUsersAuthentication getAuthentication() {
        return this.authentication;
    }
    /**
     * Gets the expiring_cert_not_valid_after_time property value. Validity end time (ISO8601) for the expiring access certificate
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpiringCertNotValidAfterTime() {
        return this.expiringCertNotValidAfterTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("access_cert", (n) -> { this.setAccessCert(n.getStringValue()); });
        deserializerMap.put("access_cert_not_valid_after_time", (n) -> { this.setAccessCertNotValidAfterTime(n.getStringValue()); });
        deserializerMap.put("access_control", (n) -> { this.setAccessControl(n.getObjectValue(ServiceGetResponseServiceUsersAccessControl::createFromDiscriminatorValue)); });
        deserializerMap.put("access_key", (n) -> { this.setAccessKey(n.getStringValue()); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getEnumValue(ServiceGetResponseServiceUsersAuthentication::forValue)); });
        deserializerMap.put("expiring_cert_not_valid_after_time", (n) -> { this.setExpiringCertNotValidAfterTime(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. Account password. A null value indicates a user overridden password.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the type property value. Account type
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the username property value. Account username
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
        writer.writeStringValue("access_cert", this.getAccessCert());
        writer.writeStringValue("access_cert_not_valid_after_time", this.getAccessCertNotValidAfterTime());
        writer.writeObjectValue("access_control", this.getAccessControl());
        writer.writeStringValue("access_key", this.getAccessKey());
        writer.writeEnumValue("authentication", this.getAuthentication());
        writer.writeStringValue("expiring_cert_not_valid_after_time", this.getExpiringCertNotValidAfterTime());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access_cert property value. Access certificate for TLS client authentication
     * @param value Value to set for the access_cert property.
     */
    public void setAccessCert(@jakarta.annotation.Nullable final String value) {
        this.accessCert = value;
    }
    /**
     * Sets the access_cert_not_valid_after_time property value. Validity end time (ISO8601) for the current access certificate
     * @param value Value to set for the access_cert_not_valid_after_time property.
     */
    public void setAccessCertNotValidAfterTime(@jakarta.annotation.Nullable final String value) {
        this.accessCertNotValidAfterTime = value;
    }
    /**
     * Sets the access_control property value. Service specific access controls for user
     * @param value Value to set for the access_control property.
     */
    public void setAccessControl(@jakarta.annotation.Nullable final ServiceGetResponseServiceUsersAccessControl value) {
        this.accessControl = value;
    }
    /**
     * Sets the access_key property value. Access key for TLS client authentication
     * @param value Value to set for the access_key property.
     */
    public void setAccessKey(@jakarta.annotation.Nullable final String value) {
        this.accessKey = value;
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
    public void setAuthentication(@jakarta.annotation.Nullable final ServiceGetResponseServiceUsersAuthentication value) {
        this.authentication = value;
    }
    /**
     * Sets the expiring_cert_not_valid_after_time property value. Validity end time (ISO8601) for the expiring access certificate
     * @param value Value to set for the expiring_cert_not_valid_after_time property.
     */
    public void setExpiringCertNotValidAfterTime(@jakarta.annotation.Nullable final String value) {
        this.expiringCertNotValidAfterTime = value;
    }
    /**
     * Sets the password property value. Account password. A null value indicates a user overridden password.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the type property value. Account type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the username property value. Account username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
