package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingGroupInvoiceLinesListResponseLines implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the cloud, if billed resource is associated with a cloud resource
     */
    private String cloudName;
    /**
     * Name of the commitment which is referred to this invoice line
     */
    private String commitmentName;
    /**
     * Human-readable short description of the invoice line
     */
    private String description;
    /**
     * Pre-tax sum of invoice line, in local currency, before any discounts
     */
    private String linePreDiscountLocal;
    /**
     * Pre-tax sum of invoice line, in the local currency configured for the invoice
     */
    private String lineTotalLocal;
    /**
     * Pre-tax sum of invoice line, in USD
     */
    private String lineTotalUsd;
    /**
     * Type of the invoice line
     */
    private BillingGroupInvoiceLinesListResponseLinesLineType lineType;
    /**
     * Currency used for line_local_total
     */
    private String localCurrency;
    /**
     * Name of the project this line is associated with, if any
     */
    private String projectName;
    /**
     * Name of the service, if invoice line is for service use
     */
    private String serviceName;
    /**
     * Service plan name, if invoice line is for service use
     */
    private String servicePlan;
    /**
     * Service type, if invoice line is for service use
     */
    private BillingGroupInvoiceLinesListResponseLinesServiceType serviceType;
    /**
     * Billing tags
     */
    private BillingGroupInvoiceLinesListResponseLinesTags tags;
    /**
     * Begin timestamp of the billed time period, for resources billed by time
     */
    private String timestampBegin;
    /**
     * End timestamp of the billed time period, for resources billed by time
     */
    private String timestampEnd;
    /**
     * Instantiates a new BillingGroupInvoiceLinesListResponseLines and sets the default values.
     */
    public BillingGroupInvoiceLinesListResponseLines() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BillingGroupInvoiceLinesListResponseLines
     */
    @jakarta.annotation.Nonnull
    public static BillingGroupInvoiceLinesListResponseLines createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingGroupInvoiceLinesListResponseLines();
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
     * Gets the cloud_name property value. Name of the cloud, if billed resource is associated with a cloud resource
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.cloudName;
    }
    /**
     * Gets the commitment_name property value. Name of the commitment which is referred to this invoice line
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCommitmentName() {
        return this.commitmentName;
    }
    /**
     * Gets the description property value. Human-readable short description of the invoice line
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("cloud_name", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("commitment_name", (n) -> { this.setCommitmentName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("line_pre_discount_local", (n) -> { this.setLinePreDiscountLocal(n.getStringValue()); });
        deserializerMap.put("line_total_local", (n) -> { this.setLineTotalLocal(n.getStringValue()); });
        deserializerMap.put("line_total_usd", (n) -> { this.setLineTotalUsd(n.getStringValue()); });
        deserializerMap.put("line_type", (n) -> { this.setLineType(n.getEnumValue(BillingGroupInvoiceLinesListResponseLinesLineType::forValue)); });
        deserializerMap.put("local_currency", (n) -> { this.setLocalCurrency(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("service_name", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("service_plan", (n) -> { this.setServicePlan(n.getStringValue()); });
        deserializerMap.put("service_type", (n) -> { this.setServiceType(n.getEnumValue(BillingGroupInvoiceLinesListResponseLinesServiceType::forValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getObjectValue(BillingGroupInvoiceLinesListResponseLinesTags::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamp_begin", (n) -> { this.setTimestampBegin(n.getStringValue()); });
        deserializerMap.put("timestamp_end", (n) -> { this.setTimestampEnd(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the line_pre_discount_local property value. Pre-tax sum of invoice line, in local currency, before any discounts
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLinePreDiscountLocal() {
        return this.linePreDiscountLocal;
    }
    /**
     * Gets the line_total_local property value. Pre-tax sum of invoice line, in the local currency configured for the invoice
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLineTotalLocal() {
        return this.lineTotalLocal;
    }
    /**
     * Gets the line_total_usd property value. Pre-tax sum of invoice line, in USD
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLineTotalUsd() {
        return this.lineTotalUsd;
    }
    /**
     * Gets the line_type property value. Type of the invoice line
     * @return a BillingGroupInvoiceLinesListResponseLinesLineType
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceLinesListResponseLinesLineType getLineType() {
        return this.lineType;
    }
    /**
     * Gets the local_currency property value. Currency used for line_local_total
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalCurrency() {
        return this.localCurrency;
    }
    /**
     * Gets the project_name property value. Name of the project this line is associated with, if any
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Gets the service_name property value. Name of the service, if invoice line is for service use
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the service_plan property value. Service plan name, if invoice line is for service use
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlan() {
        return this.servicePlan;
    }
    /**
     * Gets the service_type property value. Service type, if invoice line is for service use
     * @return a BillingGroupInvoiceLinesListResponseLinesServiceType
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceLinesListResponseLinesServiceType getServiceType() {
        return this.serviceType;
    }
    /**
     * Gets the tags property value. Billing tags
     * @return a BillingGroupInvoiceLinesListResponseLinesTags
     */
    @jakarta.annotation.Nullable
    public BillingGroupInvoiceLinesListResponseLinesTags getTags() {
        return this.tags;
    }
    /**
     * Gets the timestamp_begin property value. Begin timestamp of the billed time period, for resources billed by time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimestampBegin() {
        return this.timestampBegin;
    }
    /**
     * Gets the timestamp_end property value. End timestamp of the billed time period, for resources billed by time
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimestampEnd() {
        return this.timestampEnd;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloud_name", this.getCloudName());
        writer.writeStringValue("commitment_name", this.getCommitmentName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("line_pre_discount_local", this.getLinePreDiscountLocal());
        writer.writeStringValue("line_total_local", this.getLineTotalLocal());
        writer.writeStringValue("line_total_usd", this.getLineTotalUsd());
        writer.writeEnumValue("line_type", this.getLineType());
        writer.writeStringValue("local_currency", this.getLocalCurrency());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeStringValue("service_name", this.getServiceName());
        writer.writeStringValue("service_plan", this.getServicePlan());
        writer.writeEnumValue("service_type", this.getServiceType());
        writer.writeObjectValue("tags", this.getTags());
        writer.writeStringValue("timestamp_begin", this.getTimestampBegin());
        writer.writeStringValue("timestamp_end", this.getTimestampEnd());
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
     * Sets the cloud_name property value. Name of the cloud, if billed resource is associated with a cloud resource
     * @param value Value to set for the cloud_name property.
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.cloudName = value;
    }
    /**
     * Sets the commitment_name property value. Name of the commitment which is referred to this invoice line
     * @param value Value to set for the commitment_name property.
     */
    public void setCommitmentName(@jakarta.annotation.Nullable final String value) {
        this.commitmentName = value;
    }
    /**
     * Sets the description property value. Human-readable short description of the invoice line
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the line_pre_discount_local property value. Pre-tax sum of invoice line, in local currency, before any discounts
     * @param value Value to set for the line_pre_discount_local property.
     */
    public void setLinePreDiscountLocal(@jakarta.annotation.Nullable final String value) {
        this.linePreDiscountLocal = value;
    }
    /**
     * Sets the line_total_local property value. Pre-tax sum of invoice line, in the local currency configured for the invoice
     * @param value Value to set for the line_total_local property.
     */
    public void setLineTotalLocal(@jakarta.annotation.Nullable final String value) {
        this.lineTotalLocal = value;
    }
    /**
     * Sets the line_total_usd property value. Pre-tax sum of invoice line, in USD
     * @param value Value to set for the line_total_usd property.
     */
    public void setLineTotalUsd(@jakarta.annotation.Nullable final String value) {
        this.lineTotalUsd = value;
    }
    /**
     * Sets the line_type property value. Type of the invoice line
     * @param value Value to set for the line_type property.
     */
    public void setLineType(@jakarta.annotation.Nullable final BillingGroupInvoiceLinesListResponseLinesLineType value) {
        this.lineType = value;
    }
    /**
     * Sets the local_currency property value. Currency used for line_local_total
     * @param value Value to set for the local_currency property.
     */
    public void setLocalCurrency(@jakarta.annotation.Nullable final String value) {
        this.localCurrency = value;
    }
    /**
     * Sets the project_name property value. Name of the project this line is associated with, if any
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
    /**
     * Sets the service_name property value. Name of the service, if invoice line is for service use
     * @param value Value to set for the service_name property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the service_plan property value. Service plan name, if invoice line is for service use
     * @param value Value to set for the service_plan property.
     */
    public void setServicePlan(@jakarta.annotation.Nullable final String value) {
        this.servicePlan = value;
    }
    /**
     * Sets the service_type property value. Service type, if invoice line is for service use
     * @param value Value to set for the service_type property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final BillingGroupInvoiceLinesListResponseLinesServiceType value) {
        this.serviceType = value;
    }
    /**
     * Sets the tags property value. Billing tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final BillingGroupInvoiceLinesListResponseLinesTags value) {
        this.tags = value;
    }
    /**
     * Sets the timestamp_begin property value. Begin timestamp of the billed time period, for resources billed by time
     * @param value Value to set for the timestamp_begin property.
     */
    public void setTimestampBegin(@jakarta.annotation.Nullable final String value) {
        this.timestampBegin = value;
    }
    /**
     * Sets the timestamp_end property value. End timestamp of the billed time period, for resources billed by time
     * @param value Value to set for the timestamp_end property.
     */
    public void setTimestampEnd(@jakarta.annotation.Nullable final String value) {
        this.timestampEnd = value;
    }
}
