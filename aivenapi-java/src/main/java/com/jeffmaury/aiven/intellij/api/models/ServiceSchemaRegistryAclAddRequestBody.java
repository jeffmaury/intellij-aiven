package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceSchemaRegistryAclAddRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceSchemaRegistryAclAddRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ACL entry for Schema Registry
     */
    private ServiceSchemaRegistryAclAddRequestBodyPermission permission;
    /**
     * Schema Registry ACL entry resource name pattern
     */
    private String resource;
    /**
     * Username
     */
    private String username;
    /**
     * Instantiates a new ServiceSchemaRegistryAclAddRequestBody and sets the default values.
     */
    public ServiceSchemaRegistryAclAddRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceSchemaRegistryAclAddRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceSchemaRegistryAclAddRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceSchemaRegistryAclAddRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ServiceSchemaRegistryAclAddRequestBodyPermission::forValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the permission property value. ACL entry for Schema Registry
     * @return a ServiceSchemaRegistryAclAddRequestBodyPermission
     */
    @jakarta.annotation.Nullable
    public ServiceSchemaRegistryAclAddRequestBodyPermission getPermission() {
        return this.permission;
    }
    /**
     * Gets the resource property value. Schema Registry ACL entry resource name pattern
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.resource;
    }
    /**
     * Gets the username property value. Username
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
        writer.writeEnumValue("permission", this.getPermission());
        writer.writeStringValue("resource", this.getResource());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the permission property value. ACL entry for Schema Registry
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final ServiceSchemaRegistryAclAddRequestBodyPermission value) {
        this.permission = value;
    }
    /**
     * Sets the resource property value. Schema Registry ACL entry resource name pattern
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.resource = value;
    }
    /**
     * Sets the username property value. Username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
