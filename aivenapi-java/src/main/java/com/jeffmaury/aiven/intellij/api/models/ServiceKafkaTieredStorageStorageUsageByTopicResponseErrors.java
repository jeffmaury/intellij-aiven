package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Printable error message
     */
    private String message;
    /**
     * URL to the documentation of the error
     */
    private String moreInfo;
    /**
     * HTTP error status code
     */
    private Integer status;
    /**
     * Instantiates a new ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors and sets the default values.
     */
    public ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors
     */
    @jakarta.annotation.Nonnull
    public static ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceKafkaTieredStorageStorageUsageByTopicResponseErrors();
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
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("more_info", (n) -> { this.setMoreInfo(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable error message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the more_info property value. URL to the documentation of the error
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMoreInfo() {
        return this.moreInfo;
    }
    /**
     * Gets the status property value. HTTP error status code
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("more_info", this.getMoreInfo());
        writer.writeIntegerValue("status", this.getStatus());
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
     * Sets the message property value. Printable error message
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the more_info property value. URL to the documentation of the error
     * @param value Value to set for the more_info property.
     */
    public void setMoreInfo(@jakarta.annotation.Nullable final String value) {
        this.moreInfo = value;
    }
    /**
     * Sets the status property value. HTTP error status code
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Integer value) {
        this.status = value;
    }
}
