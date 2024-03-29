package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * End of life extension information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountProjectsListResponseProjectsEndOfLifeExtension implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service EOL extension
     */
    private AccountProjectsListResponseProjectsEndOfLifeExtensionElasticsearch elasticsearch;
    /**
     * Instantiates a new AccountProjectsListResponseProjectsEndOfLifeExtension and sets the default values.
     */
    public AccountProjectsListResponseProjectsEndOfLifeExtension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccountProjectsListResponseProjectsEndOfLifeExtension
     */
    @jakarta.annotation.Nonnull
    public static AccountProjectsListResponseProjectsEndOfLifeExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountProjectsListResponseProjectsEndOfLifeExtension();
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
     * Gets the elasticsearch property value. Service EOL extension
     * @return a AccountProjectsListResponseProjectsEndOfLifeExtensionElasticsearch
     */
    @jakarta.annotation.Nullable
    public AccountProjectsListResponseProjectsEndOfLifeExtensionElasticsearch getElasticsearch() {
        return this.elasticsearch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("elasticsearch", (n) -> { this.setElasticsearch(n.getObjectValue(AccountProjectsListResponseProjectsEndOfLifeExtensionElasticsearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("elasticsearch", this.getElasticsearch());
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
     * Sets the elasticsearch property value. Service EOL extension
     * @param value Value to set for the elasticsearch property.
     */
    public void setElasticsearch(@jakarta.annotation.Nullable final AccountProjectsListResponseProjectsEndOfLifeExtensionElasticsearch value) {
        this.elasticsearch = value;
    }
}
