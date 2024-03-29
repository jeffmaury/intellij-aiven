package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServicePGBouncerUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePGBouncerUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service database name
     */
    private String database;
    /**
     * PGBouncer pool mode
     */
    private ServicePGBouncerUpdateRequestBodyPoolMode poolMode;
    /**
     * Size of PGBouncer's PostgreSQL side connection pool
     */
    private Integer poolSize;
    /**
     * Service username
     */
    private String username;
    /**
     * Instantiates a new ServicePGBouncerUpdateRequestBody and sets the default values.
     */
    public ServicePGBouncerUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePGBouncerUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServicePGBouncerUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePGBouncerUpdateRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("database", (n) -> { this.setDatabase(n.getStringValue()); });
        deserializerMap.put("pool_mode", (n) -> { this.setPoolMode(n.getEnumValue(ServicePGBouncerUpdateRequestBodyPoolMode::forValue)); });
        deserializerMap.put("pool_size", (n) -> { this.setPoolSize(n.getIntegerValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pool_mode property value. PGBouncer pool mode
     * @return a ServicePGBouncerUpdateRequestBodyPoolMode
     */
    @jakarta.annotation.Nullable
    public ServicePGBouncerUpdateRequestBodyPoolMode getPoolMode() {
        return this.poolMode;
    }
    /**
     * Gets the pool_size property value. Size of PGBouncer's PostgreSQL side connection pool
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPoolSize() {
        return this.poolSize;
    }
    /**
     * Gets the username property value. Service username
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("database", this.getDatabase());
        writer.writeEnumValue("pool_mode", this.getPoolMode());
        writer.writeIntegerValue("pool_size", this.getPoolSize());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the pool_mode property value. PGBouncer pool mode
     * @param value Value to set for the pool_mode property.
     */
    public void setPoolMode(@jakarta.annotation.Nullable final ServicePGBouncerUpdateRequestBodyPoolMode value) {
        this.poolMode = value;
    }
    /**
     * Sets the pool_size property value. Size of PGBouncer's PostgreSQL side connection pool
     * @param value Value to set for the pool_size property.
     */
    public void setPoolSize(@jakarta.annotation.Nullable final Integer value) {
        this.poolSize = value;
    }
    /**
     * Sets the username property value. Service username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
