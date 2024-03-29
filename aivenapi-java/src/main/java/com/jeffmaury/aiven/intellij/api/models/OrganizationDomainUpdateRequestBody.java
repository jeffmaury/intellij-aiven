package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationDomainUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationDomainUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OrganizationDomainVerificationType
     */
    private OrganizationDomainUpdateRequestBodyVerificationType verificationType;
    /**
     * Instantiates a new OrganizationDomainUpdateRequestBody and sets the default values.
     */
    public OrganizationDomainUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationDomainUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OrganizationDomainUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationDomainUpdateRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("verification_type", (n) -> { this.setVerificationType(n.getEnumValue(OrganizationDomainUpdateRequestBodyVerificationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the verification_type property value. OrganizationDomainVerificationType
     * @return a OrganizationDomainUpdateRequestBodyVerificationType
     */
    @jakarta.annotation.Nullable
    public OrganizationDomainUpdateRequestBodyVerificationType getVerificationType() {
        return this.verificationType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the verification_type property value. OrganizationDomainVerificationType
     * @param value Value to set for the verification_type property.
     */
    public void setVerificationType(@jakarta.annotation.Nullable final OrganizationDomainUpdateRequestBodyVerificationType value) {
        this.verificationType = value;
    }
}
