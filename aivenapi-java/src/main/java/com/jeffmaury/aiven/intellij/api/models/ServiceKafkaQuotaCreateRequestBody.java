package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceKafkaQuotaCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaQuotaCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * client-id
     */
    private String clientId;
    /**
     * consumer network throttle
     */
    private Double consumerByteRate;
    /**
     * producer network throttle
     */
    private Double producerByteRate;
    /**
     * cpu percentage throttle
     */
    private Double requestPercentage;
    /**
     * user
     */
    private String user;
    /**
     * Instantiates a new ServiceKafkaQuotaCreateRequestBody and sets the default values.
     */
    public ServiceKafkaQuotaCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaQuotaCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaQuotaCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaQuotaCreateRequestBody();
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
     * Gets the client-id property value. client-id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the consumer_byte_rate property value. consumer network throttle
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getConsumerByteRate() {
        return this.consumerByteRate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("client-id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("consumer_byte_rate", (n) -> { this.setConsumerByteRate(n.getDoubleValue()); });
        deserializerMap.put("producer_byte_rate", (n) -> { this.setProducerByteRate(n.getDoubleValue()); });
        deserializerMap.put("request_percentage", (n) -> { this.setRequestPercentage(n.getDoubleValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the producer_byte_rate property value. producer network throttle
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProducerByteRate() {
        return this.producerByteRate;
    }
    /**
     * Gets the request_percentage property value. cpu percentage throttle
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRequestPercentage() {
        return this.requestPercentage;
    }
    /**
     * Gets the user property value. user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("client-id", this.getClientId());
        writer.writeDoubleValue("consumer_byte_rate", this.getConsumerByteRate());
        writer.writeDoubleValue("producer_byte_rate", this.getProducerByteRate());
        writer.writeDoubleValue("request_percentage", this.getRequestPercentage());
        writer.writeStringValue("user", this.getUser());
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
     * Sets the client-id property value. client-id
     * @param value Value to set for the client-id property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the consumer_byte_rate property value. consumer network throttle
     * @param value Value to set for the consumer_byte_rate property.
     */
    public void setConsumerByteRate(@jakarta.annotation.Nullable final Double value) {
        this.consumerByteRate = value;
    }
    /**
     * Sets the producer_byte_rate property value. producer network throttle
     * @param value Value to set for the producer_byte_rate property.
     */
    public void setProducerByteRate(@jakarta.annotation.Nullable final Double value) {
        this.producerByteRate = value;
    }
    /**
     * Sets the request_percentage property value. cpu percentage throttle
     * @param value Value to set for the request_percentage property.
     */
    public void setRequestPercentage(@jakarta.annotation.Nullable final Double value) {
        this.requestPercentage = value;
    }
    /**
     * Sets the user property value. user
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}
