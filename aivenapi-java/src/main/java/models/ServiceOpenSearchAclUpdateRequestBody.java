package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceOpenSearchAclUpdateRequestBody
 */
public class ServiceOpenSearchAclUpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** OpenSearch ACL configuration */
    private ServiceOpenSearchAclUpdateRequestBodyOpensearchAclConfig opensearchAclConfig;
    /**
     * Instantiates a new ServiceOpenSearchAclUpdateRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchAclUpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclUpdateRequestBody
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchAclUpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclUpdateRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("opensearch_acl_config", (n) -> { this.setOpensearchAclConfig(n.getObjectValue(ServiceOpenSearchAclUpdateRequestBodyOpensearchAclConfig::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the opensearch_acl_config property value. OpenSearch ACL configuration
     * @return a ServiceOpenSearchAclUpdateRequestBodyOpensearchAclConfig
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchAclUpdateRequestBodyOpensearchAclConfig getOpensearchAclConfig() {
        return this.opensearchAclConfig;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("opensearch_acl_config", this.getOpensearchAclConfig());
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
     * Sets the opensearch_acl_config property value. OpenSearch ACL configuration
     * @param value Value to set for the opensearchAclConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpensearchAclConfig(@javax.annotation.Nullable final ServiceOpenSearchAclUpdateRequestBodyOpensearchAclConfig value) {
        this.opensearchAclConfig = value;
    }
}
