package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * PGServiceQueryStatisticsRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PGServiceQueryStatisticsRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Limit for number of results
     */
    private Integer limit;
    /**
     * Offset for retrieved results based on sort order
     */
    private Integer offset;
    /**
     * Order in which to sort retrieved results
     */
    private String orderBy;
    /**
     * Instantiates a new PGServiceQueryStatisticsRequestBody and sets the default values.
     */
    public PGServiceQueryStatisticsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PGServiceQueryStatisticsRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PGServiceQueryStatisticsRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PGServiceQueryStatisticsRequestBody();
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
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("order_by", (n) -> { this.setOrderBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Limit for number of results
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. Offset for retrieved results based on sort order
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the order_by property value. Order in which to sort retrieved results
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrderBy() {
        return this.orderBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("order_by", this.getOrderBy());
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
     * Sets the limit property value. Limit for number of results
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. Offset for retrieved results based on sort order
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the order_by property value. Order in which to sort retrieved results
     * @param value Value to set for the order_by property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final String value) {
        this.orderBy = value;
    }
}
