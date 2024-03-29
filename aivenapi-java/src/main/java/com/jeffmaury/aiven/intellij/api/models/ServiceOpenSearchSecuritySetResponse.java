package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceOpenSearchSecuritySetResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceOpenSearchSecuritySetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceOpenSearchSecuritySetResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * security plugin admin defined
     */
    private Boolean securityPluginAdminEnabled;
    /**
     * Opensearch security available for the service
     */
    private Boolean securityPluginAvailable;
    /**
     * Opensearch security enabled for the service
     */
    private Boolean securityPluginEnabled;
    /**
     * Instantiates a new ServiceOpenSearchSecuritySetResponse and sets the default values.
     */
    public ServiceOpenSearchSecuritySetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchSecuritySetResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceOpenSearchSecuritySetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchSecuritySetResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceOpenSearchSecuritySetResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceOpenSearchSecuritySetResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceOpenSearchSecuritySetResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("security_plugin_admin_enabled", (n) -> { this.setSecurityPluginAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("security_plugin_available", (n) -> { this.setSecurityPluginAvailable(n.getBooleanValue()); });
        deserializerMap.put("security_plugin_enabled", (n) -> { this.setSecurityPluginEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the security_plugin_admin_enabled property value. security plugin admin defined
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityPluginAdminEnabled() {
        return this.securityPluginAdminEnabled;
    }
    /**
     * Gets the security_plugin_available property value. Opensearch security available for the service
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityPluginAvailable() {
        return this.securityPluginAvailable;
    }
    /**
     * Gets the security_plugin_enabled property value. Opensearch security enabled for the service
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityPluginEnabled() {
        return this.securityPluginEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeBooleanValue("security_plugin_admin_enabled", this.getSecurityPluginAdminEnabled());
        writer.writeBooleanValue("security_plugin_available", this.getSecurityPluginAvailable());
        writer.writeBooleanValue("security_plugin_enabled", this.getSecurityPluginEnabled());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceOpenSearchSecuritySetResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the security_plugin_admin_enabled property value. security plugin admin defined
     * @param value Value to set for the security_plugin_admin_enabled property.
     */
    public void setSecurityPluginAdminEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.securityPluginAdminEnabled = value;
    }
    /**
     * Sets the security_plugin_available property value. Opensearch security available for the service
     * @param value Value to set for the security_plugin_available property.
     */
    public void setSecurityPluginAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.securityPluginAvailable = value;
    }
    /**
     * Sets the security_plugin_enabled property value. Opensearch security enabled for the service
     * @param value Value to set for the security_plugin_enabled property.
     */
    public void setSecurityPluginEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.securityPluginEnabled = value;
    }
}
