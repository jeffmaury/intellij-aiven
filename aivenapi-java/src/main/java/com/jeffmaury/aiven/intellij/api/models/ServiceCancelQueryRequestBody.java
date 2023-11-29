package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceCancelQueryRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceCancelQueryRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Database server connection ID
     */
    private Integer pid;
    /**
     * Request immediate termination instead of soft cancel
     */
    private Boolean terminate;
    /**
     * Instantiates a new ServiceCancelQueryRequestBody and sets the default values.
     */
    public ServiceCancelQueryRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceCancelQueryRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceCancelQueryRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceCancelQueryRequestBody();
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
        deserializerMap.put("pid", (n) -> { this.setPid(n.getIntegerValue()); });
        deserializerMap.put("terminate", (n) -> { this.setTerminate(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pid property value. Database server connection ID
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPid() {
        return this.pid;
    }
    /**
     * Gets the terminate property value. Request immediate termination instead of soft cancel
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminate() {
        return this.terminate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("pid", this.getPid());
        writer.writeBooleanValue("terminate", this.getTerminate());
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
     * Sets the pid property value. Database server connection ID
     * @param value Value to set for the pid property.
     */
    public void setPid(@jakarta.annotation.Nullable final Integer value) {
        this.pid = value;
    }
    /**
     * Sets the terminate property value. Request immediate termination instead of soft cancel
     * @param value Value to set for the terminate property.
     */
    public void setTerminate(@jakarta.annotation.Nullable final Boolean value) {
        this.terminate = value;
    }
}
