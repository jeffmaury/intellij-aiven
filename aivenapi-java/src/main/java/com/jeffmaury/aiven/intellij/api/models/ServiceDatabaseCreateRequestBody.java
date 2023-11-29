package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceDatabaseCreateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceDatabaseCreateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service database name
     */
    private String database;
    /**
     * Default string sort order (LC_COLLATE) for PostgreSQL database
     */
    private String lcCollate;
    /**
     * Default character classification (LC_CTYPE) for PostgreSQL database
     */
    private String lcCtype;
    /**
     * Instantiates a new ServiceDatabaseCreateRequestBody and sets the default values.
     */
    public ServiceDatabaseCreateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceDatabaseCreateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceDatabaseCreateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceDatabaseCreateRequestBody();
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
     * Gets the database property value. Service database name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDatabase() {
        return this.database;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("database", (n) -> { this.setDatabase(n.getStringValue()); });
        deserializerMap.put("lc_collate", (n) -> { this.setLcCollate(n.getStringValue()); });
        deserializerMap.put("lc_ctype", (n) -> { this.setLcCtype(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lc_collate property value. Default string sort order (LC_COLLATE) for PostgreSQL database
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLcCollate() {
        return this.lcCollate;
    }
    /**
     * Gets the lc_ctype property value. Default character classification (LC_CTYPE) for PostgreSQL database
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLcCtype() {
        return this.lcCtype;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("database", this.getDatabase());
        writer.writeStringValue("lc_collate", this.getLcCollate());
        writer.writeStringValue("lc_ctype", this.getLcCtype());
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
     * Sets the database property value. Service database name
     * @param value Value to set for the database property.
     */
    public void setDatabase(@jakarta.annotation.Nullable final String value) {
        this.database = value;
    }
    /**
     * Sets the lc_collate property value. Default string sort order (LC_COLLATE) for PostgreSQL database
     * @param value Value to set for the lc_collate property.
     */
    public void setLcCollate(@jakarta.annotation.Nullable final String value) {
        this.lcCollate = value;
    }
    /**
     * Sets the lc_ctype property value. Default character classification (LC_CTYPE) for PostgreSQL database
     * @param value Value to set for the lc_ctype property.
     */
    public void setLcCtype(@jakarta.annotation.Nullable final String value) {
        this.lcCtype = value;
    }
}
