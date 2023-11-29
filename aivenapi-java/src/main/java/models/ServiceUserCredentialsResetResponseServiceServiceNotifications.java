package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUserCredentialsResetResponseServiceServiceNotifications implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Notification level */
    private ServiceUserCredentialsResetResponseServiceServiceNotificationsLevel level;
    /** Human notification message */
    private String message;
    /** Notification metadata */
    private ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata metadata;
    /** Notification type */
    private ServiceUserCredentialsResetResponseServiceServiceNotificationsType type;
    /**
     * Instantiates a new ServiceUserCredentialsResetResponseServiceServiceNotifications and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsResetResponseServiceServiceNotifications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserCredentialsResetResponseServiceServiceNotifications
     */
    @javax.annotation.Nonnull
    public static ServiceUserCredentialsResetResponseServiceServiceNotifications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserCredentialsResetResponseServiceServiceNotifications();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(ServiceUserCredentialsResetResponseServiceServiceNotificationsLevel.class)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ServiceUserCredentialsResetResponseServiceServiceNotificationsType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. Notification level
     * @return a ServiceUserCredentialsResetResponseServiceServiceNotificationsLevel
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsResetResponseServiceServiceNotificationsLevel getLevel() {
        return this.level;
    }
    /**
     * Gets the message property value. Human notification message
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the metadata property value. Notification metadata
     * @return a ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the type property value. Notification type
     * @return a ServiceUserCredentialsResetResponseServiceServiceNotificationsType
     */
    @javax.annotation.Nullable
    public ServiceUserCredentialsResetResponseServiceServiceNotificationsType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("level", this.getLevel());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the level property value. Notification level
     * @param value Value to set for the level property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLevel(@javax.annotation.Nullable final ServiceUserCredentialsResetResponseServiceServiceNotificationsLevel value) {
        this.level = value;
    }
    /**
     * Sets the message property value. Human notification message
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the metadata property value. Notification metadata
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final ServiceUserCredentialsResetResponseServiceServiceNotificationsMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the type property value. Notification type
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ServiceUserCredentialsResetResponseServiceServiceNotificationsType value) {
        this.type = value;
    }
}
