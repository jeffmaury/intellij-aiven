package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * consumer group
     */
    private String groupName;
    /**
     * Latest partition message offset
     */
    private Integer offset;
    /**
     * Instantiates a new ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups and sets the default values.
     */
    public ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTopicGetResponseTopicPartitionsConsumerGroups();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("group_name", (n) -> { this.setGroupName(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group_name property value. consumer group
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Gets the offset property value. Latest partition message offset
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("group_name", this.getGroupName());
        writer.writeIntegerValue("offset", this.getOffset());
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
     * Sets the group_name property value. consumer group
     * @param value Value to set for the group_name property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.groupName = value;
    }
    /**
     * Sets the offset property value. Latest partition message offset
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
}
