package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaTopicMessageProduceRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicMessageProduceRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The format of the content.
     */
    private ServiceKafkaTopicMessageProduceRequestBodyFormat format;
    /**
     * Full schema encoded as a string (e.g. JSON serialized for Avro data)
     */
    private String keySchema;
    /**
     * ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     */
    private Integer keySchemaId;
    /**
     * List of records to produce to the topic
     */
    private java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> records;
    /**
     * Full schema encoded as a string (e.g. JSON serialized for Avro data)
     */
    private String valueSchema;
    /**
     * ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     */
    private Integer valueSchemaId;
    /**
     * Instantiates a new ServiceKafkaTopicMessageProduceRequestBody and sets the default values.
     */
    public ServiceKafkaTopicMessageProduceRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageProduceRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicMessageProduceRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageProduceRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(ServiceKafkaTopicMessageProduceRequestBodyFormat.class)); });
        deserializerMap.put("key_schema", (n) -> { this.setKeySchema(n.getStringValue()); });
        deserializerMap.put("key_schema_id", (n) -> { this.setKeySchemaId(n.getIntegerValue()); });
        deserializerMap.put("records", (n) -> { this.setRecords(n.getCollectionOfObjectValues(ServiceKafkaTopicMessageProduceRequestBodyRecords::createFromDiscriminatorValue)); });
        deserializerMap.put("value_schema", (n) -> { this.setValueSchema(n.getStringValue()); });
        deserializerMap.put("value_schema_id", (n) -> { this.setValueSchemaId(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format of the content.
     * @return a ServiceKafkaTopicMessageProduceRequestBodyFormat
     */
    @jakarta.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBodyFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the key_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeySchema() {
        return this.keySchema;
    }
    /**
     * Gets the key_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getKeySchemaId() {
        return this.keySchemaId;
    }
    /**
     * Gets the records property value. List of records to produce to the topic
     * @return a java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> getRecords() {
        return this.records;
    }
    /**
     * Gets the value_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValueSchema() {
        return this.valueSchema;
    }
    /**
     * Gets the value_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
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
        writer.writeEnumValue("format", this.getFormat());
        writer.writeStringValue("key_schema", this.getKeySchema());
        writer.writeIntegerValue("key_schema_id", this.getKeySchemaId());
        writer.writeCollectionOfObjectValues("records", this.getRecords());
        writer.writeStringValue("value_schema", this.getValueSchema());
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
     * Sets the format property value. The format of the content.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final ServiceKafkaTopicMessageProduceRequestBodyFormat value) {
        this.format = value;
    }
    /**
     * Sets the key_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @param value Value to set for the key_schema property.
     */
    public void setKeySchema(@jakarta.annotation.Nullable final String value) {
        this.keySchema = value;
    }
    /**
     * Sets the key_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @param value Value to set for the key_schema_id property.
     */
    public void setKeySchemaId(@jakarta.annotation.Nullable final Integer value) {
        this.keySchemaId = value;
    }
    /**
     * Sets the records property value. List of records to produce to the topic
     * @param value Value to set for the records property.
     */
    public void setRecords(@jakarta.annotation.Nullable final java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> value) {
        this.records = value;
    }
    /**
     * Sets the value_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @param value Value to set for the value_schema property.
     */
    public void setValueSchema(@jakarta.annotation.Nullable final String value) {
        this.valueSchema = value;
    }
    /**
     * Sets the value_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @param value Value to set for the value_schema_id property.
     */
    public void setValueSchemaId(@jakarta.annotation.Nullable final Integer value) {
        this.valueSchemaId = value;
    }
}
