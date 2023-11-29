package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaTopicMessageProduceResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicMessageProduceResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceKafkaTopicMessageProduceResponseErrors> errors;
    /**
     * The ID for the schema used to produce keys, or null if keys were not used
     */
    private Integer keySchemaId;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * List of offsets for the produced record
     */
    private java.util.List<ServiceKafkaTopicMessageProduceResponseOffsets> offsets;
    /**
     * The ID for the schema used to produce values
     */
    private Integer valueSchemaId;
    /**
     * Instantiates a new ServiceKafkaTopicMessageProduceResponse and sets the default values.
     */
    public ServiceKafkaTopicMessageProduceResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageProduceResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicMessageProduceResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageProduceResponse();
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
     * @return a java.util.List<ServiceKafkaTopicMessageProduceResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicMessageProduceResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceKafkaTopicMessageProduceResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("key_schema_id", (n) -> { this.setKeySchemaId(n.getIntegerValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("offsets", (n) -> { this.setOffsets(n.getCollectionOfObjectValues(ServiceKafkaTopicMessageProduceResponseOffsets::createFromDiscriminatorValue)); });
        deserializerMap.put("value_schema_id", (n) -> { this.setValueSchemaId(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key_schema_id property value. The ID for the schema used to produce keys, or null if keys were not used
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getKeySchemaId() {
        return this.keySchemaId;
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
     * Gets the offsets property value. List of offsets for the produced record
     * @return a java.util.List<ServiceKafkaTopicMessageProduceResponseOffsets>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicMessageProduceResponseOffsets> getOffsets() {
        return this.offsets;
    }
    /**
     * Gets the value_schema_id property value. The ID for the schema used to produce values
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getValueSchemaId() {
        return this.valueSchemaId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeIntegerValue("key_schema_id", this.getKeySchemaId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("offsets", this.getOffsets());
        writer.writeIntegerValue("value_schema_id", this.getValueSchemaId());
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
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicMessageProduceResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the key_schema_id property value. The ID for the schema used to produce keys, or null if keys were not used
     * @param value Value to set for the key_schema_id property.
     */
    public void setKeySchemaId(@jakarta.annotation.Nullable final Integer value) {
        this.keySchemaId = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the offsets property value. List of offsets for the produced record
     * @param value Value to set for the offsets property.
     */
    public void setOffsets(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicMessageProduceResponseOffsets> value) {
        this.offsets = value;
    }
    /**
     * Sets the value_schema_id property value. The ID for the schema used to produce values
     * @param value Value to set for the value_schema_id property.
     */
    public void setValueSchemaId(@jakarta.annotation.Nullable final Integer value) {
        this.valueSchemaId = value;
    }
}
