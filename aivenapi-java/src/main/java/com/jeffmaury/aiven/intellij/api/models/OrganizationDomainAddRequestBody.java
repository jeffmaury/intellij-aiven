package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationDomainAddRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationDomainAddRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the domain to be added
     */
    private String domainName;
    /**
     * Type of verification to be made
     */
    private OrganizationDomainAddRequestBodyVerificationType verificationType;
    /**
     * Instantiates a new OrganizationDomainAddRequestBody and sets the default values.
     */
    public OrganizationDomainAddRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationDomainAddRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationDomainAddRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationDomainAddRequestBody();
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
     * Gets the domain_name property value. Name of the domain to be added
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("domain_name", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("verification_type", (n) -> { this.setVerificationType(n.getEnumValue(OrganizationDomainAddRequestBodyVerificationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the verification_type property value. Type of verification to be made
     * @return a OrganizationDomainAddRequestBodyVerificationType
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainAddRequestBodyVerificationType getVerificationType() {
        return this.verificationType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("domain_name", this.getDomainName());
        writer.writeEnumValue("verification_type", this.getVerificationType());
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
     * Sets the domain_name property value. Name of the domain to be added
     * @param value Value to set for the domain_name property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the verification_type property value. Type of verification to be made
     * @param value Value to set for the verification_type property.
     */
    public void setVerificationType(@jakarta.annotation.Nullable final OrganizationDomainAddRequestBodyVerificationType value) {
        this.verificationType = value;
    }
}
