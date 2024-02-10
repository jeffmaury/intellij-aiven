package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Payload to be used with dataset_import
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceTaskCreateRequestBodyDatasetImport implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the dataset to import to PostgreSQL database. Used with dataset_import.
     */
    private ServiceTaskCreateRequestBodyDatasetImportDatasetName datasetName;
    /**
     * Instantiates a new ServiceTaskCreateRequestBodyDatasetImport and sets the default values.
     */
    public ServiceTaskCreateRequestBodyDatasetImport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceTaskCreateRequestBodyDatasetImport
     */
    @jakarta.annotation.Nonnull
    public static ServiceTaskCreateRequestBodyDatasetImport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceTaskCreateRequestBodyDatasetImport();
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
     * Gets the dataset_name property value. Name of the dataset to import to PostgreSQL database. Used with dataset_import.
     * @return a ServiceTaskCreateRequestBodyDatasetImportDatasetName
     */
    @jakarta.annotation.Nullable
    public ServiceTaskCreateRequestBodyDatasetImportDatasetName getDatasetName() {
        return this.datasetName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("dataset_name", (n) -> { this.setDatasetName(n.getEnumValue(ServiceTaskCreateRequestBodyDatasetImportDatasetName::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dataset_name", this.getDatasetName());
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
     * Sets the dataset_name property value. Name of the dataset to import to PostgreSQL database. Used with dataset_import.
     * @param value Value to set for the dataset_name property.
     */
    public void setDatasetName(@jakarta.annotation.Nullable final ServiceTaskCreateRequestBodyDatasetImportDatasetName value) {
        this.datasetName = value;
    }
}
