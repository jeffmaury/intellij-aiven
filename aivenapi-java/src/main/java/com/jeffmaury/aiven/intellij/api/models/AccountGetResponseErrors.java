package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccountGetResponseErrors implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Printable error message */
    private String message;
    /** URL to the documentation of the error */
    private String moreInfo;
    /** HTTP error status code */
    private Integer status;
    /**
     * Instantiates a new AccountGetResponseErrors and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccountGetResponseErrors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountGetResponseErrors
     */
    @javax.annotation.Nonnull
    public static AccountGetResponseErrors createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountGetResponseErrors();
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
        deserializerMap.put("more_info", (n) -> { this.setMoreInfo(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable error message
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the more_info property value. URL to the documentation of the error
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMoreInfo() {
        return this.moreInfo;
    }
    /**
     * Gets the status property value. HTTP error status code
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStatus() {
        return this.status;
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
        writer.writeStringValue("more_info", this.getMoreInfo());
        writer.writeIntegerValue("status", this.getStatus());
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
     * Sets the message property value. Printable error message
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the more_info property value. URL to the documentation of the error
     * @param value Value to set for the moreInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMoreInfo(@javax.annotation.Nullable final String value) {
        this.moreInfo = value;
    }
    /**
     * Sets the status property value. HTTP error status code
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final Integer value) {
        this.status = value;
    }
}
