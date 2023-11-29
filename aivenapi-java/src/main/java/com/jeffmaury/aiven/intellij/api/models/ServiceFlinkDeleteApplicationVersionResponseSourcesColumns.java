package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkDeleteApplicationVersionResponseSourcesColumns implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The data type of the column
     */
    private String dataType;
    /**
     * Column extra information
     */
    private String extras;
    /**
     * The key info of the column
     */
    private String key;
    /**
     * The name of the column
     */
    private String name;
    /**
     * Whether the column is nullable, i.e. if true, the column is NOT NULL
     */
    private Boolean nullable;
    /**
     * Information of the watermark if the column is used for watermark.
     */
    private String watermark;
    /**
     * Instantiates a new ServiceFlinkDeleteApplicationVersionResponseSourcesColumns and sets the default values.
     */
    public ServiceFlinkDeleteApplicationVersionResponseSourcesColumns() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkDeleteApplicationVersionResponseSourcesColumns
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkDeleteApplicationVersionResponseSourcesColumns createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkDeleteApplicationVersionResponseSourcesColumns();
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
     * Gets the data_type property value. The data type of the column
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * Gets the extras property value. Column extra information
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExtras() {
        return this.extras;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("data_type", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("extras", (n) -> { this.setExtras(n.getStringValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nullable", (n) -> { this.setNullable(n.getBooleanValue()); });
        deserializerMap.put("watermark", (n) -> { this.setWatermark(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The key info of the column
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the name property value. The name of the column
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the nullable property value. Whether the column is nullable, i.e. if true, the column is NOT NULL
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNullable() {
        return this.nullable;
    }
    /**
     * Gets the watermark property value. Information of the watermark if the column is used for watermark.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWatermark() {
        return this.watermark;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("data_type", this.getDataType());
        writer.writeStringValue("extras", this.getExtras());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("nullable", this.getNullable());
        writer.writeStringValue("watermark", this.getWatermark());
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
     * Sets the data_type property value. The data type of the column
     * @param value Value to set for the data_type property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the extras property value. Column extra information
     * @param value Value to set for the extras property.
     */
    public void setExtras(@jakarta.annotation.Nullable final String value) {
        this.extras = value;
    }
    /**
     * Sets the key property value. The key info of the column
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the name property value. The name of the column
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the nullable property value. Whether the column is nullable, i.e. if true, the column is NOT NULL
     * @param value Value to set for the nullable property.
     */
    public void setNullable(@jakarta.annotation.Nullable final Boolean value) {
        this.nullable = value;
    }
    /**
     * Sets the watermark property value. Information of the watermark if the column is used for watermark.
     * @param value Value to set for the watermark property.
     */
    public void setWatermark(@jakarta.annotation.Nullable final String value) {
        this.watermark = value;
    }
}
