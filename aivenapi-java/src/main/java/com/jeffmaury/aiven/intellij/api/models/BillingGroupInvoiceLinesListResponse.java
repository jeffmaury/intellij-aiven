package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * BillingGroupInvoiceLinesListResponse
 */
public class BillingGroupInvoiceLinesListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<BillingGroupInvoiceLinesListResponseErrors> errors;
    /** List of invoice lines */
    private java.util.List<BillingGroupInvoiceLinesListResponseLines> lines;
    /** Printable result of the request */
    private String message;
    /**
     * Instantiates a new BillingGroupInvoiceLinesListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BillingGroupInvoiceLinesListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupInvoiceLinesListResponse
     */
    @javax.annotation.Nonnull
    public static BillingGroupInvoiceLinesListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupInvoiceLinesListResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a BillingGroupInvoiceLinesListResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<BillingGroupInvoiceLinesListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(BillingGroupInvoiceLinesListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("lines", (n) -> { this.setLines(n.getCollectionOfObjectValues(BillingGroupInvoiceLinesListResponseLines::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lines property value. List of invoice lines
     * @return a BillingGroupInvoiceLinesListResponseLines
     */
    @javax.annotation.Nullable
    public java.util.List<BillingGroupInvoiceLinesListResponseLines> getLines() {
        return this.lines;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeCollectionOfObjectValues("lines", this.getLines());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<BillingGroupInvoiceLinesListResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the lines property value. List of invoice lines
     * @param value Value to set for the lines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLines(@javax.annotation.Nullable final java.util.List<BillingGroupInvoiceLinesListResponseLines> value) {
        this.lines = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
}
