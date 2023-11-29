package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ProjectGetServiceLogsRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectGetServiceLogsRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * How many log entries to receive at most
     */
    private Integer limit;
    /**
     * Opaque offset identifier
     */
    private String offset;
    /**
     * Sort order for log messages
     */
    private ProjectGetServiceLogsRequestBodySortOrder sortOrder;
    /**
     * Instantiates a new ProjectGetServiceLogsRequestBody and sets the default values.
     */
    public ProjectGetServiceLogsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProjectGetServiceLogsRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProjectGetServiceLogsRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProjectGetServiceLogsRequestBody();
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
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getStringValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getEnumValue(ProjectGetServiceLogsRequestBodySortOrder.class)); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. How many log entries to receive at most
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. Opaque offset identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOffset() {
        return this.offset;
    }
    /**
     * Gets the sort_order property value. Sort order for log messages
     * @return a ProjectGetServiceLogsRequestBodySortOrder
     */
    @jakarta.annotation.Nullable
    public ProjectGetServiceLogsRequestBodySortOrder getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("offset", this.getOffset());
        writer.writeEnumValue("sort_order", this.getSortOrder());
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
     * Sets the limit property value. How many log entries to receive at most
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. Opaque offset identifier
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final String value) {
        this.offset = value;
    }
    /**
     * Sets the sort_order property value. Sort order for log messages
     * @param value Value to set for the sort_order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final ProjectGetServiceLogsRequestBodySortOrder value) {
        this.sortOrder = value;
    }
}
