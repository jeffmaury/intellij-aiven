package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OpenSearch ACL configuration
 */
public class ServiceOpenSearchAclUpdateResponseOpensearchAclConfig implements AdditionalDataHolder, Parsable {
    /** List of OpenSearch ACLs */
    private java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> acls;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access. */
    private Boolean enabled;
    /**
     * Instantiates a new ServiceOpenSearchAclUpdateResponseOpensearchAclConfig and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceOpenSearchAclUpdateResponseOpensearchAclConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceOpenSearchAclUpdateResponseOpensearchAclConfig
     */
    @javax.annotation.Nonnull
    public static ServiceOpenSearchAclUpdateResponseOpensearchAclConfig createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceOpenSearchAclUpdateResponseOpensearchAclConfig();
    }
    /**
     * Gets the acls property value. List of OpenSearch ACLs
     * @return a ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> getAcls() {
        return this.acls;
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
     * Gets the enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("acls", (n) -> { this.setAcls(n.getCollectionOfObjectValues(ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("acls", this.getAcls());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acls property value. List of OpenSearch ACLs
     * @param value Value to set for the acls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcls(@javax.annotation.Nullable final java.util.List<ServiceOpenSearchAclUpdateResponseOpensearchAclConfigAcls> value) {
        this.acls = value;
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
     * Sets the enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
}
