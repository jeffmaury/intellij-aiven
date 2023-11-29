package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VpcDeleteResponsePeeringConnectionsStateInfoWarnings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** AWS account id of conflicting VPC */
    private String conflictingAwsAccountId;
    /** VPC id which is conflicting with the current one */
    private String conflictingAwsVpcId;
    /** AWS VPC connection id which is conflicting with current VPC */
    private String conflictingAwsVpcPeeringConnectionId;
    /** Warning message to be shown to the user */
    private String message;
    /** Type of warning */
    private VpcDeleteResponsePeeringConnectionsStateInfoWarningsType type;
    /**
     * Instantiates a new VpcDeleteResponsePeeringConnectionsStateInfoWarnings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpcDeleteResponsePeeringConnectionsStateInfoWarnings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcDeleteResponsePeeringConnectionsStateInfoWarnings
     */
    @javax.annotation.Nonnull
    public static VpcDeleteResponsePeeringConnectionsStateInfoWarnings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcDeleteResponsePeeringConnectionsStateInfoWarnings();
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
     * Gets the conflicting_aws_account_id property value. AWS account id of conflicting VPC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConflictingAwsAccountId() {
        return this.conflictingAwsAccountId;
    }
    /**
     * Gets the conflicting_aws_vpc_id property value. VPC id which is conflicting with the current one
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConflictingAwsVpcId() {
        return this.conflictingAwsVpcId;
    }
    /**
     * Gets the conflicting_aws_vpc_peering_connection_id property value. AWS VPC connection id which is conflicting with current VPC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConflictingAwsVpcPeeringConnectionId() {
        return this.conflictingAwsVpcPeeringConnectionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("conflicting_aws_account_id", (n) -> { this.setConflictingAwsAccountId(n.getStringValue()); });
        deserializerMap.put("conflicting_aws_vpc_id", (n) -> { this.setConflictingAwsVpcId(n.getStringValue()); });
        deserializerMap.put("conflicting_aws_vpc_peering_connection_id", (n) -> { this.setConflictingAwsVpcPeeringConnectionId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(VpcDeleteResponsePeeringConnectionsStateInfoWarningsType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Warning message to be shown to the user
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the type property value. Type of warning
     * @return a VpcDeleteResponsePeeringConnectionsStateInfoWarningsType
     */
    @javax.annotation.Nullable
    public VpcDeleteResponsePeeringConnectionsStateInfoWarningsType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conflicting_aws_account_id", this.getConflictingAwsAccountId());
        writer.writeStringValue("conflicting_aws_vpc_id", this.getConflictingAwsVpcId());
        writer.writeStringValue("conflicting_aws_vpc_peering_connection_id", this.getConflictingAwsVpcPeeringConnectionId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the conflicting_aws_account_id property value. AWS account id of conflicting VPC
     * @param value Value to set for the conflictingAwsAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictingAwsAccountId(@javax.annotation.Nullable final String value) {
        this.conflictingAwsAccountId = value;
    }
    /**
     * Sets the conflicting_aws_vpc_id property value. VPC id which is conflicting with the current one
     * @param value Value to set for the conflictingAwsVpcId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictingAwsVpcId(@javax.annotation.Nullable final String value) {
        this.conflictingAwsVpcId = value;
    }
    /**
     * Sets the conflicting_aws_vpc_peering_connection_id property value. AWS VPC connection id which is conflicting with current VPC
     * @param value Value to set for the conflictingAwsVpcPeeringConnectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictingAwsVpcPeeringConnectionId(@javax.annotation.Nullable final String value) {
        this.conflictingAwsVpcPeeringConnectionId = value;
    }
    /**
     * Sets the message property value. Warning message to be shown to the user
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the type property value. Type of warning
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final VpcDeleteResponsePeeringConnectionsStateInfoWarningsType value) {
        this.type = value;
    }
}
