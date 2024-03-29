package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * AccountUsersSearchRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountUsersSearchRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Maximum number of results to return
     */
    private Integer limit;
    /**
     * Sorting criteria; desc is descending order and asc ascending
     */
    private AccountUsersSearchRequestBodyOrderBy orderBy;
    /**
     * Filter keyword
     */
    private String query;
    /**
     * Instantiates a new AccountUsersSearchRequestBody and sets the default values.
     */
    public AccountUsersSearchRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountUsersSearchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccountUsersSearchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountUsersSearchRequestBody();
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
        deserializerMap.put("order_by", (n) -> { this.setOrderBy(n.getEnumValue(AccountUsersSearchRequestBodyOrderBy::forValue)); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Maximum number of results to return
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the order_by property value. Sorting criteria; desc is descending order and asc ascending
     * @return a AccountUsersSearchRequestBodyOrderBy
     */
    @jakarta.annotation.Nullable
    public AccountUsersSearchRequestBodyOrderBy getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the query property value. Filter keyword
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeEnumValue("order_by", this.getOrderBy());
        writer.writeStringValue("query", this.getQuery());
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
     * Sets the limit property value. Maximum number of results to return
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the order_by property value. Sorting criteria; desc is descending order and asc ascending
     * @param value Value to set for the order_by property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final AccountUsersSearchRequestBodyOrderBy value) {
        this.orderBy = value;
    }
    /**
     * Sets the query property value. Filter keyword
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
}
