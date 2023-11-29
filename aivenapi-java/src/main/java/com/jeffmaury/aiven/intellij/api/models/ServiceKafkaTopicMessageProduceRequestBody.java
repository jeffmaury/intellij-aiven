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
public class ServiceKafkaTopicMessageProduceRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The format of the content. */
    private ServiceKafkaTopicMessageProduceRequestBodyFormat format;
    /** Full schema encoded as a string (e.g. JSON serialized for Avro data) */
    private String keySchema;
    /** ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry. */
    private Integer keySchemaId;
    /** List of records to produce to the topic */
    private java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> records;
    /** Full schema encoded as a string (e.g. JSON serialized for Avro data) */
    private String valueSchema;
    /** ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry. */
    private Integer valueSchemaId;
    /**
     * Instantiates a new ServiceKafkaTopicMessageProduceRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicMessageProduceRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceKafkaTopicMessageProduceRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicMessageProduceRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public ServiceKafkaTopicMessageProduceRequestBodyFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the key_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeySchema() {
        return this.keySchema;
    }
    /**
     * Gets the key_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKeySchemaId() {
        return this.keySchemaId;
    }
    /**
     * Gets the records property value. List of records to produce to the topic
     * @return a ServiceKafkaTopicMessageProduceRequestBodyRecords
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> getRecords() {
        return this.records;
    }
    /**
     * Gets the value_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueSchema() {
        return this.valueSchema;
    }
    /**
     * Gets the value_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getValueSchemaId() {
        return this.valueSchemaId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the format property value. The format of the content.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final ServiceKafkaTopicMessageProduceRequestBodyFormat value) {
        this.format = value;
    }
    /**
     * Sets the key_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @param value Value to set for the keySchema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeySchema(@javax.annotation.Nullable final String value) {
        this.keySchema = value;
    }
    /**
     * Sets the key_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @param value Value to set for the keySchemaId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeySchemaId(@javax.annotation.Nullable final Integer value) {
        this.keySchemaId = value;
    }
    /**
     * Sets the records property value. List of records to produce to the topic
     * @param value Value to set for the records property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecords(@javax.annotation.Nullable final java.util.List<ServiceKafkaTopicMessageProduceRequestBodyRecords> value) {
        this.records = value;
    }
    /**
     * Sets the value_schema property value. Full schema encoded as a string (e.g. JSON serialized for Avro data)
     * @param value Value to set for the valueSchema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueSchema(@javax.annotation.Nullable final String value) {
        this.valueSchema = value;
    }
    /**
     * Sets the value_schema_id property value. ID returned by a previous request using the same schema. This ID corresponds to the ID of the schema in the registry.
     * @param value Value to set for the valueSchemaId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueSchemaId(@javax.annotation.Nullable final Integer value) {
        this.valueSchemaId = value;
    }
}
