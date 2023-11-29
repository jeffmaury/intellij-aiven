package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Error position in the SQL.
 */
public class ServiceFlinkValidateApplicationVersionResponseSinksPosition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Character number of where the error starts, starting from 1. */
    private Integer characterNumber;
    /** Character number of where the error starts, starting from 1. */
    private Integer endCharacterNumber;
    /** Line number of where the error ends, starting from 1. */
    private Integer endLineNumber;
    /** Line number of where the error starts, starting from 1. */
    private Integer lineNumber;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionResponseSinksPosition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseSinksPosition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionResponseSinksPosition
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionResponseSinksPosition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionResponseSinksPosition();
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
     * Gets the character_number property value. Character number of where the error starts, starting from 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCharacterNumber() {
        return this.characterNumber;
    }
    /**
     * Gets the end_character_number property value. Character number of where the error starts, starting from 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndCharacterNumber() {
        return this.endCharacterNumber;
    }
    /**
     * Gets the end_line_number property value. Line number of where the error ends, starting from 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndLineNumber() {
        return this.endLineNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("character_number", (n) -> { this.setCharacterNumber(n.getIntegerValue()); });
        deserializerMap.put("end_character_number", (n) -> { this.setEndCharacterNumber(n.getIntegerValue()); });
        deserializerMap.put("end_line_number", (n) -> { this.setEndLineNumber(n.getIntegerValue()); });
        deserializerMap.put("line_number", (n) -> { this.setLineNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the line_number property value. Line number of where the error starts, starting from 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLineNumber() {
        return this.lineNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("character_number", this.getCharacterNumber());
        writer.writeIntegerValue("end_character_number", this.getEndCharacterNumber());
        writer.writeIntegerValue("end_line_number", this.getEndLineNumber());
        writer.writeIntegerValue("line_number", this.getLineNumber());
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
     * Sets the character_number property value. Character number of where the error starts, starting from 1.
     * @param value Value to set for the characterNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCharacterNumber(@javax.annotation.Nullable final Integer value) {
        this.characterNumber = value;
    }
    /**
     * Sets the end_character_number property value. Character number of where the error starts, starting from 1.
     * @param value Value to set for the endCharacterNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndCharacterNumber(@javax.annotation.Nullable final Integer value) {
        this.endCharacterNumber = value;
    }
    /**
     * Sets the end_line_number property value. Line number of where the error ends, starting from 1.
     * @param value Value to set for the endLineNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndLineNumber(@javax.annotation.Nullable final Integer value) {
        this.endLineNumber = value;
    }
    /**
     * Sets the line_number property value. Line number of where the error starts, starting from 1.
     * @param value Value to set for the lineNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLineNumber(@javax.annotation.Nullable final Integer value) {
        this.lineNumber = value;
    }
}
