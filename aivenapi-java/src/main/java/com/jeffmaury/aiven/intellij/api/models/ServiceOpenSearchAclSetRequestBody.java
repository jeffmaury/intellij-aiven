package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceOpenSearchAclSetRequestBody
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceOpenSearchAclSetRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OpenSearch ACL configuration
     */
    private ServiceOpenSearchAclSetRequestBodyOpensearchAclConfig opensearchAclConfig;
    /**
     * Instantiates a new ServiceOpenSearchAclSetRequestBody and sets the default values.
     */
    public ServiceOpenSearchAclSetRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclSetRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceOpenSearchAclSetRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclSetRequestBody();
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
        deserializerMap.put("opensearch_acl_config", (n) -> { this.setOpensearchAclConfig(n.getObjectValue(ServiceOpenSearchAclSetRequestBodyOpensearchAclConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the opensearch_acl_config property value. OpenSearch ACL configuration
     * @return a ServiceOpenSearchAclSetRequestBodyOpensearchAclConfig
     */
    @jakarta.annotation.Nullable
    public ServiceOpenSearchAclSetRequestBodyOpensearchAclConfig getOpensearchAclConfig() {
        return this.opensearchAclConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("opensearch_acl_config", this.getOpensearchAclConfig());
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
     * Sets the opensearch_acl_config property value. OpenSearch ACL configuration
     * @param value Value to set for the opensearch_acl_config property.
     */
    public void setOpensearchAclConfig(@jakarta.annotation.Nullable final ServiceOpenSearchAclSetRequestBodyOpensearchAclConfig value) {
        this.opensearchAclConfig = value;
    }
}
