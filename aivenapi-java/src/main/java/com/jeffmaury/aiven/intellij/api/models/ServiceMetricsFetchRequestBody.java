package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceMetricsFetchRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceMetricsFetchRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Metrics time period
     */
    private ServiceMetricsFetchRequestBodyPeriod period;
    /**
     * Instantiates a new ServiceMetricsFetchRequestBody and sets the default values.
     */
    public ServiceMetricsFetchRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceMetricsFetchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceMetricsFetchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceMetricsFetchRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getEnumValue(ServiceMetricsFetchRequestBodyPeriod::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the period property value. Metrics time period
     * @return a ServiceMetricsFetchRequestBodyPeriod
     */
    @jakarta.annotation.Nullable
    public ServiceMetricsFetchRequestBodyPeriod getPeriod() {
        return this.period;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("period", this.getPeriod());
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
     * Sets the period property value. Metrics time period
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final ServiceMetricsFetchRequestBodyPeriod value) {
        this.period = value;
    }
}
