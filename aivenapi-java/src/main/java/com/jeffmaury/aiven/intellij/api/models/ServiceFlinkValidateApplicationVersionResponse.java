package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceFlinkValidateApplicationVersionResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceFlinkValidateApplicationVersionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of errors occurred during request processing
     */
    private java.util.List<ServiceFlinkValidateApplicationVersionResponseErrors> errors;
    /**
     * Printable result of the request
     */
    private String message;
    /**
     * Sinks and sink validation errors
     */
    private java.util.List<ServiceFlinkValidateApplicationVersionResponseSinks> sinks;
    /**
     * Sources and source validation errors
     */
    private java.util.List<ServiceFlinkValidateApplicationVersionResponseSources> sources;
    /**
     * Job SQL statement
     */
    private String statement;
    /**
     * Job validation error
     */
    private ServiceFlinkValidateApplicationVersionResponseStatementError statementError;
    /**
     * Instantiates a new ServiceFlinkValidateApplicationVersionResponse and sets the default values.
     */
    public ServiceFlinkValidateApplicationVersionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceFlinkValidateApplicationVersionResponse
     */
    @jakarta.annotation.Nonnull
    public static ServiceFlinkValidateApplicationVersionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceFlinkValidateApplicationVersionResponse();
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
     * Gets the errors property value. List of errors occurred during request processing
     * @return a java.util.List<ServiceFlinkValidateApplicationVersionResponseErrors>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionResponseErrors> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionResponseErrors::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("sinks", (n) -> { this.setSinks(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionResponseSinks::createFromDiscriminatorValue)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(ServiceFlinkValidateApplicationVersionResponseSources::createFromDiscriminatorValue)); });
        deserializerMap.put("statement", (n) -> { this.setStatement(n.getStringValue()); });
        deserializerMap.put("statement_error", (n) -> { this.setStatementError(n.getObjectValue(ServiceFlinkValidateApplicationVersionResponseStatementError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Printable result of the request
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the sinks property value. Sinks and sink validation errors
     * @return a java.util.List<ServiceFlinkValidateApplicationVersionResponseSinks>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionResponseSinks> getSinks() {
        return this.sinks;
    }
    /**
     * Gets the sources property value. Sources and source validation errors
     * @return a java.util.List<ServiceFlinkValidateApplicationVersionResponseSources>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceFlinkValidateApplicationVersionResponseSources> getSources() {
        return this.sources;
    }
    /**
     * Gets the statement property value. Job SQL statement
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatement() {
        return this.statement;
    }
    /**
     * Gets the statement_error property value. Job validation error
     * @return a ServiceFlinkValidateApplicationVersionResponseStatementError
     */
    @jakarta.annotation.Nullable
    public ServiceFlinkValidateApplicationVersionResponseStatementError getStatementError() {
        return this.statementError;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfObjectValues("sinks", this.getSinks());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeStringValue("statement", this.getStatement());
        writer.writeObjectValue("statement_error", this.getStatementError());
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
     * Sets the errors property value. List of errors occurred during request processing
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionResponseErrors> value) {
        this.errors = value;
    }
    /**
     * Sets the message property value. Printable result of the request
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the sinks property value. Sinks and sink validation errors
     * @param value Value to set for the sinks property.
     */
    public void setSinks(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionResponseSinks> value) {
        this.sinks = value;
    }
    /**
     * Sets the sources property value. Sources and source validation errors
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<ServiceFlinkValidateApplicationVersionResponseSources> value) {
        this.sources = value;
    }
    /**
     * Sets the statement property value. Job SQL statement
     * @param value Value to set for the statement property.
     */
    public void setStatement(@jakarta.annotation.Nullable final String value) {
        this.statement = value;
    }
    /**
     * Sets the statement_error property value. Job validation error
     * @param value Value to set for the statement_error property.
     */
    public void setStatementError(@jakarta.annotation.Nullable final ServiceFlinkValidateApplicationVersionResponseStatementError value) {
        this.statementError = value;
    }
}
