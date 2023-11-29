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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkJobDetailsResponseStatusCounts implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * CANCELED
     */
    private Integer cANCELED;
    /**
     * CANCELING
     */
    private Integer cANCELING;
    /**
     * CREATED
     */
    private Integer cREATED;
    /**
     * DEPLOYING
     */
    private Integer dEPLOYING;
    /**
     * FAILED
     */
    private Integer fAILED;
    /**
     * FINISHED
     */
    private Integer fINISHED;
    /**
     * INITIALIZING
     */
    private Integer iNITIALIZING;
    /**
     * RECONCILING
     */
    private Integer rECONCILING;
    /**
     * RUNNING
     */
    private Integer rUNNING;
    /**
     * SCHEDULED
     */
    private Integer sCHEDULED;
    /**
     * Instantiates a new ServiceFlinkJobDetailsResponseStatusCounts and sets the default values.
     */
    public ServiceFlinkJobDetailsResponseStatusCounts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkJobDetailsResponseStatusCounts
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkJobDetailsResponseStatusCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkJobDetailsResponseStatusCounts();
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
     * Gets the CANCELED property value. CANCELED
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCANCELED() {
        return this.cANCELED;
    }
    /**
     * Gets the CANCELING property value. CANCELING
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCANCELING() {
        return this.cANCELING;
    }
    /**
     * Gets the CREATED property value. CREATED
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCREATED() {
        return this.cREATED;
    }
    /**
     * Gets the DEPLOYING property value. DEPLOYING
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDEPLOYING() {
        return this.dEPLOYING;
    }
    /**
     * Gets the FAILED property value. FAILED
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFAILED() {
        return this.fAILED;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the FINISHED property value. FINISHED
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFINISHED() {
        return this.fINISHED;
    }
    /**
     * Gets the INITIALIZING property value. INITIALIZING
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getINITIALIZING() {
        return this.iNITIALIZING;
    }
    /**
     * Gets the RECONCILING property value. RECONCILING
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRECONCILING() {
        return this.rECONCILING;
    }
    /**
     * Gets the RUNNING property value. RUNNING
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRUNNING() {
        return this.rUNNING;
    }
    /**
     * Gets the SCHEDULED property value. SCHEDULED
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSCHEDULED() {
        return this.sCHEDULED;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the CANCELED property value. CANCELED
     * @param value Value to set for the CANCELED property.
     */
    public void setCANCELED(@jakarta.annotation.Nullable final Integer value) {
        this.cANCELED = value;
    }
    /**
     * Sets the CANCELING property value. CANCELING
     * @param value Value to set for the CANCELING property.
     */
    public void setCANCELING(@jakarta.annotation.Nullable final Integer value) {
        this.cANCELING = value;
    }
    /**
     * Sets the CREATED property value. CREATED
     * @param value Value to set for the CREATED property.
     */
    public void setCREATED(@jakarta.annotation.Nullable final Integer value) {
        this.cREATED = value;
    }
    /**
     * Sets the DEPLOYING property value. DEPLOYING
     * @param value Value to set for the DEPLOYING property.
     */
    public void setDEPLOYING(@jakarta.annotation.Nullable final Integer value) {
        this.dEPLOYING = value;
    }
    /**
     * Sets the FAILED property value. FAILED
     * @param value Value to set for the FAILED property.
     */
    public void setFAILED(@jakarta.annotation.Nullable final Integer value) {
        this.fAILED = value;
    }
    /**
     * Sets the FINISHED property value. FINISHED
     * @param value Value to set for the FINISHED property.
     */
    public void setFINISHED(@jakarta.annotation.Nullable final Integer value) {
        this.fINISHED = value;
    }
    /**
     * Sets the INITIALIZING property value. INITIALIZING
     * @param value Value to set for the INITIALIZING property.
     */
    public void setINITIALIZING(@jakarta.annotation.Nullable final Integer value) {
        this.iNITIALIZING = value;
    }
    /**
     * Sets the RECONCILING property value. RECONCILING
     * @param value Value to set for the RECONCILING property.
     */
    public void setRECONCILING(@jakarta.annotation.Nullable final Integer value) {
        this.rECONCILING = value;
    }
    /**
     * Sets the RUNNING property value. RUNNING
     * @param value Value to set for the RUNNING property.
     */
    public void setRUNNING(@jakarta.annotation.Nullable final Integer value) {
        this.rUNNING = value;
    }
    /**
     * Sets the SCHEDULED property value. SCHEDULED
     * @param value Value to set for the SCHEDULED property.
     */
    public void setSCHEDULED(@jakarta.annotation.Nullable final Integer value) {
        this.sCHEDULED = value;
    }
}
