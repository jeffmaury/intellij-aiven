package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceIntegrationEndpointTypesResponseEndpointTypes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Endpoint type name */
    private String endpointType;
    /** Supported service types */
    private java.util.List<String> serviceTypes;
    /** Endpoint type description */
    private String title;
    /** JSON-Schema for the 'user_config' properties */
    private ServiceIntegrationEndpointTypesResponseEndpointTypesUserConfigSchema userConfigSchema;
    /**
     * Instantiates a new ServiceIntegrationEndpointTypesResponseEndpointTypes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceIntegrationEndpointTypesResponseEndpointTypes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationEndpointTypesResponseEndpointTypes
     */
    @javax.annotation.Nonnull
    public static ServiceIntegrationEndpointTypesResponseEndpointTypes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationEndpointTypesResponseEndpointTypes();
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
     * Gets the endpoint_type property value. Endpoint type name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endpoint_type", (n) -> { this.setEndpointType(n.getStringValue()); });
        deserializerMap.put("service_types", (n) -> { this.setServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("user_config_schema", (n) -> { this.setUserConfigSchema(n.getObjectValue(ServiceIntegrationEndpointTypesResponseEndpointTypesUserConfigSchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the service_types property value. Supported service types
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServiceTypes() {
        return this.serviceTypes;
    }
    /**
     * Gets the title property value. Endpoint type description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @return a ServiceIntegrationEndpointTypesResponseEndpointTypesUserConfigSchema
     */
    @javax.annotation.Nullable
    public ServiceIntegrationEndpointTypesResponseEndpointTypesUserConfigSchema getUserConfigSchema() {
        return this.userConfigSchema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("endpoint_type", this.getEndpointType());
        writer.writeCollectionOfPrimitiveValues("service_types", this.getServiceTypes());
        writer.writeStringValue("title", this.getTitle());
        writer.writeObjectValue("user_config_schema", this.getUserConfigSchema());
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
     * Sets the endpoint_type property value. Endpoint type name
     * @param value Value to set for the endpointType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndpointType(@javax.annotation.Nullable final String value) {
        this.endpointType = value;
    }
    /**
     * Sets the service_types property value. Supported service types
     * @param value Value to set for the serviceTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.serviceTypes = value;
    }
    /**
     * Sets the title property value. Endpoint type description
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the user_config_schema property value. JSON-Schema for the 'user_config' properties
     * @param value Value to set for the userConfigSchema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserConfigSchema(@javax.annotation.Nullable final ServiceIntegrationEndpointTypesResponseEndpointTypesUserConfigSchema value) {
        this.userConfigSchema = value;
    }
}
