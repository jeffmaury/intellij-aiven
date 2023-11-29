package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceIntegrationUpdateRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceIntegrationUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service type-specific settings
     */
    private ServiceIntegrationUpdateRequestBodyUserConfig userConfig;
    /**
     * Instantiates a new ServiceIntegrationUpdateRequestBody and sets the default values.
     */
    public ServiceIntegrationUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceIntegrationUpdateRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceIntegrationUpdateRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceIntegrationUpdateRequestBody();
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
        deserializerMap.put("user_config", (n) -> { this.setUserConfig(n.getObjectValue(ServiceIntegrationUpdateRequestBodyUserConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user_config property value. Service type-specific settings
     * @return a ServiceIntegrationUpdateRequestBodyUserConfig
     */
    @jakarta.annotation.Nullable
    public ServiceIntegrationUpdateRequestBodyUserConfig getUserConfig() {
        return this.userConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("user_config", this.getUserConfig());
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
     * Sets the user_config property value. Service type-specific settings
     * @param value Value to set for the user_config property.
     */
    public void setUserConfig(@jakarta.annotation.Nullable final ServiceIntegrationUpdateRequestBodyUserConfig value) {
        this.userConfig = value;
    }
}
