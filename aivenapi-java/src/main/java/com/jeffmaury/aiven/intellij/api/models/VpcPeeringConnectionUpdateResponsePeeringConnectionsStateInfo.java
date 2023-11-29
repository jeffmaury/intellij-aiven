package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * State-specific help or error information
 */
public class VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Human-readable information message */
    private String message;
    /** Type of state information */
    private String type;
    /** List of warnings if any */
    private java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarnings> warnings;
    /**
     * Instantiates a new VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo
     */
    @javax.annotation.Nonnull
    public static VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfo();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarnings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Human-readable information message
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the type property value. Type of state information
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the warnings property value. List of warnings if any
     * @return a VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarnings
     */
    @javax.annotation.Nullable
    public java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarnings> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("type", this.getType());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the message property value. Human-readable information message
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the type property value. Type of state information
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the warnings property value. List of warnings if any
     * @param value Value to set for the warnings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWarnings(@javax.annotation.Nullable final java.util.List<VpcPeeringConnectionUpdateResponsePeeringConnectionsStateInfoWarnings> value) {
        this.warnings = value;
    }
}
