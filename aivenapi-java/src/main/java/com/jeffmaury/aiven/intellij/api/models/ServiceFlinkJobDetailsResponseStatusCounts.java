package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Status counts
 */
public class ServiceFlinkJobDetailsResponseStatusCounts implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** CANCELED */
    private Integer cANCELED;
    /** CANCELING */
    private Integer cANCELING;
    /** CREATED */
    private Integer cREATED;
    /** DEPLOYING */
    private Integer dEPLOYING;
    /** FAILED */
    private Integer fAILED;
    /** FINISHED */
    private Integer fINISHED;
    /** INITIALIZING */
    private Integer iNITIALIZING;
    /** RECONCILING */
    private Integer rECONCILING;
    /** RUNNING */
    private Integer rUNNING;
    /** SCHEDULED */
    private Integer sCHEDULED;
    /**
     * Instantiates a new ServiceFlinkJobDetailsResponseStatusCounts and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceFlinkJobDetailsResponseStatusCounts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkJobDetailsResponseStatusCounts
     */
    @javax.annotation.Nonnull
    public static ServiceFlinkJobDetailsResponseStatusCounts createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkJobDetailsResponseStatusCounts();
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
     * Gets the cANCELED property value. CANCELED
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCANCELED() {
        return this.cANCELED;
    }
    /**
     * Gets the cANCELING property value. CANCELING
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCANCELING() {
        return this.cANCELING;
    }
    /**
     * Gets the cREATED property value. CREATED
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCREATED() {
        return this.cREATED;
    }
    /**
     * Gets the dEPLOYING property value. DEPLOYING
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDEPLOYING() {
        return this.dEPLOYING;
    }
    /**
     * Gets the fAILED property value. FAILED
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFAILED() {
        return this.fAILED;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("CANCELED", (n) -> { this.setCANCELED(n.getIntegerValue()); });
        deserializerMap.put("CANCELING", (n) -> { this.setCANCELING(n.getIntegerValue()); });
        deserializerMap.put("CREATED", (n) -> { this.setCREATED(n.getIntegerValue()); });
        deserializerMap.put("DEPLOYING", (n) -> { this.setDEPLOYING(n.getIntegerValue()); });
        deserializerMap.put("FAILED", (n) -> { this.setFAILED(n.getIntegerValue()); });
        deserializerMap.put("FINISHED", (n) -> { this.setFINISHED(n.getIntegerValue()); });
        deserializerMap.put("INITIALIZING", (n) -> { this.setINITIALIZING(n.getIntegerValue()); });
        deserializerMap.put("RECONCILING", (n) -> { this.setRECONCILING(n.getIntegerValue()); });
        deserializerMap.put("RUNNING", (n) -> { this.setRUNNING(n.getIntegerValue()); });
        deserializerMap.put("SCHEDULED", (n) -> { this.setSCHEDULED(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fINISHED property value. FINISHED
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFINISHED() {
        return this.fINISHED;
    }
    /**
     * Gets the iNITIALIZING property value. INITIALIZING
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getINITIALIZING() {
        return this.iNITIALIZING;
    }
    /**
     * Gets the rECONCILING property value. RECONCILING
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRECONCILING() {
        return this.rECONCILING;
    }
    /**
     * Gets the rUNNING property value. RUNNING
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRUNNING() {
        return this.rUNNING;
    }
    /**
     * Gets the sCHEDULED property value. SCHEDULED
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSCHEDULED() {
        return this.sCHEDULED;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("CANCELED", this.getCANCELED());
        writer.writeIntegerValue("CANCELING", this.getCANCELING());
        writer.writeIntegerValue("CREATED", this.getCREATED());
        writer.writeIntegerValue("DEPLOYING", this.getDEPLOYING());
        writer.writeIntegerValue("FAILED", this.getFAILED());
        writer.writeIntegerValue("FINISHED", this.getFINISHED());
        writer.writeIntegerValue("INITIALIZING", this.getINITIALIZING());
        writer.writeIntegerValue("RECONCILING", this.getRECONCILING());
        writer.writeIntegerValue("RUNNING", this.getRUNNING());
        writer.writeIntegerValue("SCHEDULED", this.getSCHEDULED());
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
     * Sets the cANCELED property value. CANCELED
     * @param value Value to set for the CANCELED property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCANCELED(@javax.annotation.Nullable final Integer value) {
        this.cANCELED = value;
    }
    /**
     * Sets the cANCELING property value. CANCELING
     * @param value Value to set for the CANCELING property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCANCELING(@javax.annotation.Nullable final Integer value) {
        this.cANCELING = value;
    }
    /**
     * Sets the cREATED property value. CREATED
     * @param value Value to set for the CREATED property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCREATED(@javax.annotation.Nullable final Integer value) {
        this.cREATED = value;
    }
    /**
     * Sets the dEPLOYING property value. DEPLOYING
     * @param value Value to set for the DEPLOYING property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDEPLOYING(@javax.annotation.Nullable final Integer value) {
        this.dEPLOYING = value;
    }
    /**
     * Sets the fAILED property value. FAILED
     * @param value Value to set for the FAILED property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFAILED(@javax.annotation.Nullable final Integer value) {
        this.fAILED = value;
    }
    /**
     * Sets the fINISHED property value. FINISHED
     * @param value Value to set for the FINISHED property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFINISHED(@javax.annotation.Nullable final Integer value) {
        this.fINISHED = value;
    }
    /**
     * Sets the iNITIALIZING property value. INITIALIZING
     * @param value Value to set for the INITIALIZING property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setINITIALIZING(@javax.annotation.Nullable final Integer value) {
        this.iNITIALIZING = value;
    }
    /**
     * Sets the rECONCILING property value. RECONCILING
     * @param value Value to set for the RECONCILING property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRECONCILING(@javax.annotation.Nullable final Integer value) {
        this.rECONCILING = value;
    }
    /**
     * Sets the rUNNING property value. RUNNING
     * @param value Value to set for the RUNNING property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRUNNING(@javax.annotation.Nullable final Integer value) {
        this.rUNNING = value;
    }
    /**
     * Sets the sCHEDULED property value. SCHEDULED
     * @param value Value to set for the SCHEDULED property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSCHEDULED(@javax.annotation.Nullable final Integer value) {
        this.sCHEDULED = value;
    }
}
