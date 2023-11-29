package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaAclAddResponseAcl implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ID
     */
    private String id;
    /**
     * Kafka permission
     */
    private ServiceKafkaAclAddResponseAclPermission permission;
    /**
     * Topic name pattern
     */
    private String topic;
    /**
     * Username
     */
    private String username;
    /**
     * Instantiates a new ServiceKafkaAclAddResponseAcl and sets the default values.
     */
    public ServiceKafkaAclAddResponseAcl() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaAclAddResponseAcl
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaAclAddResponseAcl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaAclAddResponseAcl();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ServiceKafkaAclAddResponseAclPermission.class)); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the permission property value. Kafka permission
     * @return a ServiceKafkaAclAddResponseAclPermission
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaAclAddResponseAclPermission getPermission() {
        return this.permission;
    }
    /**
     * Gets the topic property value. Topic name pattern
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopic() {
        return this.topic;
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
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("permission", this.getPermission());
        writer.writeStringValue("topic", this.getTopic());
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
     * Sets the id property value. ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the permission property value. Kafka permission
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final ServiceKafkaAclAddResponseAclPermission value) {
        this.permission = value;
    }
    /**
     * Sets the topic property value. Topic name pattern
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final String value) {
        this.topic = value;
    }
    /**
     * Sets the username property value. Username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
