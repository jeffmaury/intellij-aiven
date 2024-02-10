package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceListResponseServicesConnectionPools implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Connection URI for the DB pool
     */
    private String connectionUri;
    /**
     * Database name
     */
    private String database;
    /**
     * PGBouncer pool mode
     */
    private ServiceListResponseServicesConnectionPoolsPoolMode poolMode;
    /**
     * Connection pool name
     */
    private String poolName;
    /**
     * Size of PGBouncer's PostgreSQL side connection pool
     */
    private Integer poolSize;
    /**
     * Pool username
     */
    private String username;
    /**
     * Instantiates a new ServiceListResponseServicesConnectionPools and sets the default values.
     */
    public ServiceListResponseServicesConnectionPools() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceListResponseServicesConnectionPools
     */
    @jakarta.annotation.Nonnull
    public static ServiceListResponseServicesConnectionPools createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceListResponseServicesConnectionPools();
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
     * Gets the connection_uri property value. Connection URI for the DB pool
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionUri() {
        return this.connectionUri;
    }
    /**
     * Gets the database property value. Database name
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("connection_uri", (n) -> { this.setConnectionUri(n.getStringValue()); });
        deserializerMap.put("database", (n) -> { this.setDatabase(n.getStringValue()); });
        deserializerMap.put("pool_mode", (n) -> { this.setPoolMode(n.getEnumValue(ServiceListResponseServicesConnectionPoolsPoolMode::forValue)); });
        deserializerMap.put("pool_name", (n) -> { this.setPoolName(n.getStringValue()); });
        deserializerMap.put("pool_size", (n) -> { this.setPoolSize(n.getIntegerValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pool_mode property value. PGBouncer pool mode
     * @return a ServiceListResponseServicesConnectionPoolsPoolMode
     */
    @jakarta.annotation.Nullable
    public ServiceListResponseServicesConnectionPoolsPoolMode getPoolMode() {
        return this.poolMode;
    }
    /**
     * Gets the pool_name property value. Connection pool name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPoolName() {
        return this.poolName;
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
     * Gets the username property value. Pool username
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
        writer.writeStringValue("connection_uri", this.getConnectionUri());
        writer.writeStringValue("database", this.getDatabase());
        writer.writeEnumValue("pool_mode", this.getPoolMode());
        writer.writeStringValue("pool_name", this.getPoolName());
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
     * Sets the connection_uri property value. Connection URI for the DB pool
     * @param value Value to set for the connection_uri property.
     */
    public void setConnectionUri(@jakarta.annotation.Nullable final String value) {
        this.connectionUri = value;
    }
    /**
     * Sets the database property value. Database name
     * @param value Value to set for the database property.
     */
    public void setDatabase(@jakarta.annotation.Nullable final String value) {
        this.database = value;
    }
    /**
     * Sets the pool_mode property value. PGBouncer pool mode
     * @param value Value to set for the pool_mode property.
     */
    public void setPoolMode(@jakarta.annotation.Nullable final ServiceListResponseServicesConnectionPoolsPoolMode value) {
        this.poolMode = value;
    }
    /**
     * Sets the pool_name property value. Connection pool name
     * @param value Value to set for the pool_name property.
     */
    public void setPoolName(@jakarta.annotation.Nullable final String value) {
        this.poolName = value;
    }
    /**
     * Sets the pool_size property value. Size of PGBouncer's PostgreSQL side connection pool
     * @param value Value to set for the pool_size property.
     */
    public void setPoolSize(@jakarta.annotation.Nullable final Integer value) {
        this.poolSize = value;
    }
    /**
     * Sets the username property value. Pool username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
