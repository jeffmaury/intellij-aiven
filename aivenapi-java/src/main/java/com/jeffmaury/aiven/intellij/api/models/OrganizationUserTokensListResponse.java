package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OrganizationUserTokensListResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationUserTokensListResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of user tokens accessible to the organization
     */
    private java.util.List<OrganizationUserTokensListResponseTokens> tokens;
    /**
     * Instantiates a new OrganizationUserTokensListResponse and sets the default values.
     */
    public OrganizationUserTokensListResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationUserTokensListResponse
     */
    @jakarta.annotation.Nonnull
    public static OrganizationUserTokensListResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationUserTokensListResponse();
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
        deserializerMap.put("tokens", (n) -> { this.setTokens(n.getCollectionOfObjectValues(OrganizationUserTokensListResponseTokens::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tokens property value. List of user tokens accessible to the organization
     * @return a java.util.List<OrganizationUserTokensListResponseTokens>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationUserTokensListResponseTokens> getTokens() {
        return this.tokens;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tokens", this.getTokens());
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
     * Sets the tokens property value. List of user tokens accessible to the organization
     * @param value Value to set for the tokens property.
     */
    public void setTokens(@jakarta.annotation.Nullable final java.util.List<OrganizationUserTokensListResponseTokens> value) {
        this.tokens = value;
    }
}
