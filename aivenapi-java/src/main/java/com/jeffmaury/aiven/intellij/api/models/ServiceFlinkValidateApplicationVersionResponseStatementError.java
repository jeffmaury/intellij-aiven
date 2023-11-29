package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Job validation error
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkValidateApplicationVersionResponseStatementError implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The error message.
     */
    private String message;
    /**
     * Error position in the SQL.
     */
    private ServiceFlinkValidateApplicationVersionResponseStatementErrorPosition position;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionResponseStatementError and sets the default values.
     */
    public ServiceFlinkValidateApplicationVersionResponseStatementError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionResponseStatementError
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionResponseStatementError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionResponseStatementError();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getObjectValue(ServiceFlinkValidateApplicationVersionResponseStatementErrorPosition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The error message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the position property value. Error position in the SQL.
     * @return a ServiceFlinkValidateApplicationVersionResponseStatementErrorPosition
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseStatementErrorPosition getPosition() {
        return this.position;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("position", this.getPosition());
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
     * Sets the message property value. The error message.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the position property value. Error position in the SQL.
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final ServiceFlinkValidateApplicationVersionResponseStatementErrorPosition value) {
        this.position = value;
    }
}
