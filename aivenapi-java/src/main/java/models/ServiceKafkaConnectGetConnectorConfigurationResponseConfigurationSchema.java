package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Default value to be set if field omitted in configuration */
    private String defaultValue;
    /** Human friendly name of the field */
    private String displayName;
    /** Assisting help text */
    private String documentation;
    /** Name of the field group to which the field belongs to */
    private String group;
    /** How important is the field */
    private ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance importance;
    /** Machine friendly name of the field */
    private String name;
    /** Position of the field in the configuration form */
    private Integer order;
    /** Defines if the field value is mandatory or not */
    private Boolean required;
    /** Configuration value type */
    private ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType type;
    /** Expected length of the input value */
    private ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth width;
    /**
     * Instantiates a new ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchema();
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
     * Gets the default_value property value. Default value to be set if field omitted in configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the display_name property value. Human friendly name of the field
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the documentation property value. Assisting help text
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentation() {
        return this.documentation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("default_value", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("display_name", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentation", (n) -> { this.setDocumentation(n.getStringValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType.class)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getEnumValue(ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth.class)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. Name of the field group to which the field belongs to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroup() {
        return this.group;
    }
    /**
     * Gets the importance property value. How important is the field
     * @return a ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance getImportance() {
        return this.importance;
    }
    /**
     * Gets the name property value. Machine friendly name of the field
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the order property value. Position of the field in the configuration form
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOrder() {
        return this.order;
    }
    /**
     * Gets the required property value. Defines if the field value is mandatory or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Gets the type property value. Configuration value type
     * @return a ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType getType() {
        return this.type;
    }
    /**
     * Gets the width property value. Expected length of the input value
     * @return a ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth
     */
    @javax.annotation.Nullable
    public ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("default_value", this.getDefaultValue());
        writer.writeStringValue("display_name", this.getDisplayName());
        writer.writeStringValue("documentation", this.getDocumentation());
        writer.writeStringValue("group", this.getGroup());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeEnumValue("type", this.getType());
        writer.writeEnumValue("width", this.getWidth());
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
     * Sets the default_value property value. Default value to be set if field omitted in configuration
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the display_name property value. Human friendly name of the field
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the documentation property value. Assisting help text
     * @param value Value to set for the documentation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentation(@javax.annotation.Nullable final String value) {
        this.documentation = value;
    }
    /**
     * Sets the group property value. Name of the field group to which the field belongs to
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final String value) {
        this.group = value;
    }
    /**
     * Sets the importance property value. How important is the field
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaImportance value) {
        this.importance = value;
    }
    /**
     * Sets the name property value. Machine friendly name of the field
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the order property value. Position of the field in the configuration form
     * @param value Value to set for the order property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrder(@javax.annotation.Nullable final Integer value) {
        this.order = value;
    }
    /**
     * Sets the required property value. Defines if the field value is mandatory or not
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this.required = value;
    }
    /**
     * Sets the type property value. Configuration value type
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaType value) {
        this.type = value;
    }
    /**
     * Sets the width property value. Expected length of the input value
     * @param value Value to set for the width property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWidth(@javax.annotation.Nullable final ServiceKafkaConnectGetConnectorConfigurationResponseConfigurationSchemaWidth value) {
        this.width = value;
    }
}
