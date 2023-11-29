package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * PublicStaticIPAvailabilityListResponse
 */
public class PublicStaticIPAvailabilityListResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** List of errors occurred during request processing */
    private java.util.List<PublicStaticIPAvailabilityListResponseErrors> errors;
    /** Printable result of the request */
    private String message;
    /** Paginated array */
    private java.util.List<PublicStaticIPAvailabilityListResponseStaticIpAddressAvailability> staticIpAddressAvailability;
    /**
     * Instantiates a new PublicStaticIPAvailabilityListResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PublicStaticIPAvailabilityListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PublicStaticIPAvailabilityListResponse
     */
    @javax.annotation.Nonnull
    public static PublicStaticIPAvailabilityListResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicStaticIPAvailabilityListResponse();
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
     * @return a PublicStaticIPAvailabilityListResponseErrors
     */
    @javax.annotation.Nullable
    public java.util.List<PublicStaticIPAvailabilityListResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(PublicStaticIPAvailabilityListResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("static_ip_address_availability", (n) -> { this.setStaticIpAddressAvailability(n.getCollectionOfObjectValues(PublicStaticIPAvailabilityListResponseStaticIpAddressAvailability::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the static_ip_address_availability property value. Paginated array
     * @return a PublicStaticIPAvailabilityListResponseStaticIpAddressAvailability
     */
    @javax.annotation.Nullable
    public java.util.List<PublicStaticIPAvailabilityListResponseStaticIpAddressAvailability> getStaticIpAddressAvailability() {
        return this.staticIpAddressAvailability;
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
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("static_ip_address_availability", this.getStaticIpAddressAvailability());
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
    public void setErrors(@javax.annotation.Nullable final java.util.List<PublicStaticIPAvailabilityListResponseErrors> value) {
        this.errors = value;
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
    /**
     * Sets the static_ip_address_availability property value. Paginated array
     * @param value Value to set for the staticIpAddressAvailability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStaticIpAddressAvailability(@javax.annotation.Nullable final java.util.List<PublicStaticIPAvailabilityListResponseStaticIpAddressAvailability> value) {
        this.staticIpAddressAvailability = value;
    }
}
