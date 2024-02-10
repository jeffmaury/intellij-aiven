package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpcPeeringConnectionCreateResponseStateInfoWarnings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * AWS account id of conflicting VPC
     */
    private String conflictingAwsAccountId;
    /**
     * VPC id which is conflicting with the current one
     */
    private String conflictingAwsVpcId;
    /**
     * AWS VPC connection id which is conflicting with current VPC
     */
    private String conflictingAwsVpcPeeringConnectionId;
    /**
     * Warning message to be shown to the user
     */
    private String message;
    /**
     * Type of warning
     */
    private VpcPeeringConnectionCreateResponseStateInfoWarningsType type;
    /**
     * Instantiates a new VpcPeeringConnectionCreateResponseStateInfoWarnings and sets the default values.
     */
    public VpcPeeringConnectionCreateResponseStateInfoWarnings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpcPeeringConnectionCreateResponseStateInfoWarnings
     */
    @jakarta.annotation.Nonnull
    public static VpcPeeringConnectionCreateResponseStateInfoWarnings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpcPeeringConnectionCreateResponseStateInfoWarnings();
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
     * Gets the conflicting_aws_account_id property value. AWS account id of conflicting VPC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConflictingAwsAccountId() {
        return this.conflictingAwsAccountId;
    }
    /**
     * Gets the conflicting_aws_vpc_id property value. VPC id which is conflicting with the current one
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConflictingAwsVpcId() {
        return this.conflictingAwsVpcId;
    }
    /**
     * Gets the conflicting_aws_vpc_peering_connection_id property value. AWS VPC connection id which is conflicting with current VPC
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConflictingAwsVpcPeeringConnectionId() {
        return this.conflictingAwsVpcPeeringConnectionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("conflicting_aws_account_id", (n) -> { this.setConflictingAwsAccountId(n.getStringValue()); });
        deserializerMap.put("conflicting_aws_vpc_id", (n) -> { this.setConflictingAwsVpcId(n.getStringValue()); });
        deserializerMap.put("conflicting_aws_vpc_peering_connection_id", (n) -> { this.setConflictingAwsVpcPeeringConnectionId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(VpcPeeringConnectionCreateResponseStateInfoWarningsType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Warning message to be shown to the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the type property value. Type of warning
     * @return a VpcPeeringConnectionCreateResponseStateInfoWarningsType
     */
    @jakarta.annotation.Nullable
    public VpcPeeringConnectionCreateResponseStateInfoWarningsType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conflicting_aws_account_id", this.getConflictingAwsAccountId());
        writer.writeStringValue("conflicting_aws_vpc_id", this.getConflictingAwsVpcId());
        writer.writeStringValue("conflicting_aws_vpc_peering_connection_id", this.getConflictingAwsVpcPeeringConnectionId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the conflicting_aws_account_id property value. AWS account id of conflicting VPC
     * @param value Value to set for the conflicting_aws_account_id property.
     */
    public void setConflictingAwsAccountId(@jakarta.annotation.Nullable final String value) {
        this.conflictingAwsAccountId = value;
    }
    /**
     * Sets the conflicting_aws_vpc_id property value. VPC id which is conflicting with the current one
     * @param value Value to set for the conflicting_aws_vpc_id property.
     */
    public void setConflictingAwsVpcId(@jakarta.annotation.Nullable final String value) {
        this.conflictingAwsVpcId = value;
    }
    /**
     * Sets the conflicting_aws_vpc_peering_connection_id property value. AWS VPC connection id which is conflicting with current VPC
     * @param value Value to set for the conflicting_aws_vpc_peering_connection_id property.
     */
    public void setConflictingAwsVpcPeeringConnectionId(@jakarta.annotation.Nullable final String value) {
        this.conflictingAwsVpcPeeringConnectionId = value;
    }
    /**
     * Sets the message property value. Warning message to be shown to the user
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the type property value. Type of warning
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final VpcPeeringConnectionCreateResponseStateInfoWarningsType value) {
        this.type = value;
    }
}
