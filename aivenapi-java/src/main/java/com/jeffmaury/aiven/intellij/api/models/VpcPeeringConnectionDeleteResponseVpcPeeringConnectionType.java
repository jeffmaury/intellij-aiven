package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Type of network connection from the VPC */
public enum VpcPeeringConnectionDeleteResponseVpcPeeringConnectionType implements ValuedEnum {
    AwsTgwVpcAttachment("aws-tgw-vpc-attachment"),
    AwsVpcPeeringConnection("aws-vpc-peering-connection"),
    AzureVnetPeering("azure-vnet-peering"),
    GoogleVpcPeering("google-vpc-peering"),
    UpcloudVpcPeering("upcloud-vpc-peering");
    public final String value;
    VpcPeeringConnectionDeleteResponseVpcPeeringConnectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpcPeeringConnectionDeleteResponseVpcPeeringConnectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aws-tgw-vpc-attachment": return AwsTgwVpcAttachment;
            case "aws-vpc-peering-connection": return AwsVpcPeeringConnection;
            case "azure-vnet-peering": return AzureVnetPeering;
            case "google-vpc-peering": return GoogleVpcPeering;
            case "upcloud-vpc-peering": return UpcloudVpcPeering;
            default: return null;
        }
    }
}
