package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service specific access controls for user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUserCredentialsModifyResponseServiceUsersAccessControl implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * M3 access group to associate users with
     */
    private String m3Group;
    /**
     * Enable REPLICATION role option
     */
    private Boolean pgAllowReplication;
    /**
     * Command category rules
     */
    private java.util.List<String> redisAclCategories;
    /**
     * Permitted pub/sub channel patterns
     */
    private java.util.List<String> redisAclChannels;
    /**
     * Rules for individual commands
     */
    private java.util.List<String> redisAclCommands;
    /**
     * Key access rules
     */
    private java.util.List<String> redisAclKeys;
    /**
     * Instantiates a new ServiceUserCredentialsModifyResponseServiceUsersAccessControl and sets the default values.
     */
    public ServiceUserCredentialsModifyResponseServiceUsersAccessControl() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsModifyResponseServiceUsersAccessControl
     */
    @jakarta.annotation.Nonnull
    public static ServiceUserCredentialsModifyResponseServiceUsersAccessControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsModifyResponseServiceUsersAccessControl();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("m3_group", (n) -> { this.setM3Group(n.getStringValue()); });
        deserializerMap.put("pg_allow_replication", (n) -> { this.setPgAllowReplication(n.getBooleanValue()); });
        deserializerMap.put("redis_acl_categories", (n) -> { this.setRedisAclCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("redis_acl_channels", (n) -> { this.setRedisAclChannels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("redis_acl_commands", (n) -> { this.setRedisAclCommands(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("redis_acl_keys", (n) -> { this.setRedisAclKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the m3_group property value. M3 access group to associate users with
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getM3Group() {
        return this.m3Group;
    }
    /**
     * Gets the pg_allow_replication property value. Enable REPLICATION role option
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPgAllowReplication() {
        return this.pgAllowReplication;
    }
    /**
     * Gets the redis_acl_categories property value. Command category rules
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRedisAclCategories() {
        return this.redisAclCategories;
    }
    /**
     * Gets the redis_acl_channels property value. Permitted pub/sub channel patterns
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRedisAclChannels() {
        return this.redisAclChannels;
    }
    /**
     * Gets the redis_acl_commands property value. Rules for individual commands
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRedisAclCommands() {
        return this.redisAclCommands;
    }
    /**
     * Gets the redis_acl_keys property value. Key access rules
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRedisAclKeys() {
        return this.redisAclKeys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("m3_group", this.getM3Group());
        writer.writeBooleanValue("pg_allow_replication", this.getPgAllowReplication());
        writer.writeCollectionOfPrimitiveValues("redis_acl_categories", this.getRedisAclCategories());
        writer.writeCollectionOfPrimitiveValues("redis_acl_channels", this.getRedisAclChannels());
        writer.writeCollectionOfPrimitiveValues("redis_acl_commands", this.getRedisAclCommands());
        writer.writeCollectionOfPrimitiveValues("redis_acl_keys", this.getRedisAclKeys());
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
     * Sets the m3_group property value. M3 access group to associate users with
     * @param value Value to set for the m3_group property.
     */
    public void setM3Group(@jakarta.annotation.Nullable final String value) {
        this.m3Group = value;
    }
    /**
     * Sets the pg_allow_replication property value. Enable REPLICATION role option
     * @param value Value to set for the pg_allow_replication property.
     */
    public void setPgAllowReplication(@jakarta.annotation.Nullable final Boolean value) {
        this.pgAllowReplication = value;
    }
    /**
     * Sets the redis_acl_categories property value. Command category rules
     * @param value Value to set for the redis_acl_categories property.
     */
    public void setRedisAclCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.redisAclCategories = value;
    }
    /**
     * Sets the redis_acl_channels property value. Permitted pub/sub channel patterns
     * @param value Value to set for the redis_acl_channels property.
     */
    public void setRedisAclChannels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.redisAclChannels = value;
    }
    /**
     * Sets the redis_acl_commands property value. Rules for individual commands
     * @param value Value to set for the redis_acl_commands property.
     */
    public void setRedisAclCommands(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.redisAclCommands = value;
    }
    /**
     * Sets the redis_acl_keys property value. Key access rules
     * @param value Value to set for the redis_acl_keys property.
     */
    public void setRedisAclKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.redisAclKeys = value;
    }
}
