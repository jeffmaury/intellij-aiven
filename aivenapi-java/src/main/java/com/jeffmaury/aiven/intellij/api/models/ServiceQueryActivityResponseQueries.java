package com.jeffmaury.aiven.intellij.api.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceQueryActivityResponseQueries implements AdditionalDataHolder, Parsable {
    /** Currently active channel subscriptions */
    private Integer activeChannelSubscriptions;
    /** Selected database */
    private String activeDatabase;
    /** Currently active channel subscriptions using pattern matching */
    private Integer activePatternMatchingChannelSubscriptions;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Application name when set */
    private String applicationName;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String backendStart;
    /** Backend type */
    private String backendType;
    /** XID for current backend */
    private Integer backendXid;
    /** xmin for current backend */
    private Integer backendXmin;
    /** IP address:port pair. Not always available due to load balancers */
    private String clientAddr;
    /** Client hostname */
    private String clientHostname;
    /** Client port, -1 is unknown */
    private Integer clientPort;
    /** Connection age in seconds */
    private Double connectionAgeSeconds;
    /** Connection idle time in seconds */
    private Double connectionIdleSeconds;
    /** Database ID */
    private Integer datid;
    /** Database name */
    private String datname;
    /** Connection state flags */
    private java.util.List<String> flags;
    /** Raw connection flags string */
    private String flagsRaw;
    /** Unique connection ID */
    private String id;
    /** Leader process ID */
    private Integer leaderPid;
    /** Number of MULTI/EXEC comands */
    private Integer multiExecCommands;
    /** Connection name, if specified */
    private String name;
    /** Output buffer length (disabled if 0) */
    private Integer outputBuffer;
    /** Output buffer memory */
    private Integer outputBufferMemory;
    /** Output list, overflow for output buffering */
    private Integer outputListLength;
    /** Connection process ID */
    private Integer pid;
    /** Last/current query running on this connection */
    private String query;
    /** Query buffer length (disabled if 0) */
    private Integer queryBuffer;
    /** Free bytes in query buffer, if enabled */
    private Integer queryBufferFree;
    /** Duration of the last/current query in seconds */
    private Double queryDuration;
    /** Hash code to identify identical normalized queries. */
    private Integer queryId;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String queryStart;
    /** Connection state */
    private String state;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String stateChange;
    /** Username */
    private String usename;
    /** User ID */
    private Integer usesysid;
    /** Connection wait event */
    private String waitEvent;
    /** Connection wait event type */
    private String waitEventType;
    /** Query is waiting */
    private Boolean waiting;
    /** Timestamp in ISO 8601 format, always in UTC */
    private String xactStart;
    /**
     * Instantiates a new ServiceQueryActivityResponseQueries and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceQueryActivityResponseQueries() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceQueryActivityResponseQueries
     */
    @javax.annotation.Nonnull
    public static ServiceQueryActivityResponseQueries createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceQueryActivityResponseQueries();
    }
    /**
     * Gets the active_channel_subscriptions property value. Currently active channel subscriptions
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveChannelSubscriptions() {
        return this.activeChannelSubscriptions;
    }
    /**
     * Gets the active_database property value. Selected database
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActiveDatabase() {
        return this.activeDatabase;
    }
    /**
     * Gets the active_pattern_matching_channel_subscriptions property value. Currently active channel subscriptions using pattern matching
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActivePatternMatchingChannelSubscriptions() {
        return this.activePatternMatchingChannelSubscriptions;
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
     * Gets the application_name property value. Application name when set
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Gets the backend_start property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackendStart() {
        return this.backendStart;
    }
    /**
     * Gets the backend_type property value. Backend type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackendType() {
        return this.backendType;
    }
    /**
     * Gets the backend_xid property value. XID for current backend
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBackendXid() {
        return this.backendXid;
    }
    /**
     * Gets the backend_xmin property value. xmin for current backend
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBackendXmin() {
        return this.backendXmin;
    }
    /**
     * Gets the client_addr property value. IP address:port pair. Not always available due to load balancers
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientAddr() {
        return this.clientAddr;
    }
    /**
     * Gets the client_hostname property value. Client hostname
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientHostname() {
        return this.clientHostname;
    }
    /**
     * Gets the client_port property value. Client port, -1 is unknown
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getClientPort() {
        return this.clientPort;
    }
    /**
     * Gets the connection_age_seconds property value. Connection age in seconds
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getConnectionAgeSeconds() {
        return this.connectionAgeSeconds;
    }
    /**
     * Gets the connection_idle_seconds property value. Connection idle time in seconds
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getConnectionIdleSeconds() {
        return this.connectionIdleSeconds;
    }
    /**
     * Gets the datid property value. Database ID
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDatid() {
        return this.datid;
    }
    /**
     * Gets the datname property value. Database name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDatname() {
        return this.datname;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(39);
        deserializerMap.put("active_channel_subscriptions", (n) -> { this.setActiveChannelSubscriptions(n.getIntegerValue()); });
        deserializerMap.put("active_database", (n) -> { this.setActiveDatabase(n.getStringValue()); });
        deserializerMap.put("active_pattern_matching_channel_subscriptions", (n) -> { this.setActivePatternMatchingChannelSubscriptions(n.getIntegerValue()); });
        deserializerMap.put("application_name", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("backend_start", (n) -> { this.setBackendStart(n.getStringValue()); });
        deserializerMap.put("backend_type", (n) -> { this.setBackendType(n.getStringValue()); });
        deserializerMap.put("backend_xid", (n) -> { this.setBackendXid(n.getIntegerValue()); });
        deserializerMap.put("backend_xmin", (n) -> { this.setBackendXmin(n.getIntegerValue()); });
        deserializerMap.put("client_addr", (n) -> { this.setClientAddr(n.getStringValue()); });
        deserializerMap.put("client_hostname", (n) -> { this.setClientHostname(n.getStringValue()); });
        deserializerMap.put("client_port", (n) -> { this.setClientPort(n.getIntegerValue()); });
        deserializerMap.put("connection_age_seconds", (n) -> { this.setConnectionAgeSeconds(n.getDoubleValue()); });
        deserializerMap.put("connection_idle_seconds", (n) -> { this.setConnectionIdleSeconds(n.getDoubleValue()); });
        deserializerMap.put("datid", (n) -> { this.setDatid(n.getIntegerValue()); });
        deserializerMap.put("datname", (n) -> { this.setDatname(n.getStringValue()); });
        deserializerMap.put("flags", (n) -> { this.setFlags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("flags_raw", (n) -> { this.setFlagsRaw(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leader_pid", (n) -> { this.setLeaderPid(n.getIntegerValue()); });
        deserializerMap.put("multi_exec_commands", (n) -> { this.setMultiExecCommands(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("output_buffer", (n) -> { this.setOutputBuffer(n.getIntegerValue()); });
        deserializerMap.put("output_buffer_memory", (n) -> { this.setOutputBufferMemory(n.getIntegerValue()); });
        deserializerMap.put("output_list_length", (n) -> { this.setOutputListLength(n.getIntegerValue()); });
        deserializerMap.put("pid", (n) -> { this.setPid(n.getIntegerValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("query_buffer", (n) -> { this.setQueryBuffer(n.getIntegerValue()); });
        deserializerMap.put("query_buffer_free", (n) -> { this.setQueryBufferFree(n.getIntegerValue()); });
        deserializerMap.put("query_duration", (n) -> { this.setQueryDuration(n.getDoubleValue()); });
        deserializerMap.put("query_id", (n) -> { this.setQueryId(n.getIntegerValue()); });
        deserializerMap.put("query_start", (n) -> { this.setQueryStart(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("state_change", (n) -> { this.setStateChange(n.getStringValue()); });
        deserializerMap.put("usename", (n) -> { this.setUsename(n.getStringValue()); });
        deserializerMap.put("usesysid", (n) -> { this.setUsesysid(n.getIntegerValue()); });
        deserializerMap.put("wait_event", (n) -> { this.setWaitEvent(n.getStringValue()); });
        deserializerMap.put("wait_event_type", (n) -> { this.setWaitEventType(n.getStringValue()); });
        deserializerMap.put("waiting", (n) -> { this.setWaiting(n.getBooleanValue()); });
        deserializerMap.put("xact_start", (n) -> { this.setXactStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flags property value. Connection state flags
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFlags() {
        return this.flags;
    }
    /**
     * Gets the flags_raw property value. Raw connection flags string
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFlagsRaw() {
        return this.flagsRaw;
    }
    /**
     * Gets the id property value. Unique connection ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the leader_pid property value. Leader process ID
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLeaderPid() {
        return this.leaderPid;
    }
    /**
     * Gets the multi_exec_commands property value. Number of MULTI/EXEC comands
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMultiExecCommands() {
        return this.multiExecCommands;
    }
    /**
     * Gets the name property value. Connection name, if specified
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the output_buffer property value. Output buffer length (disabled if 0)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOutputBuffer() {
        return this.outputBuffer;
    }
    /**
     * Gets the output_buffer_memory property value. Output buffer memory
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOutputBufferMemory() {
        return this.outputBufferMemory;
    }
    /**
     * Gets the output_list_length property value. Output list, overflow for output buffering
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOutputListLength() {
        return this.outputListLength;
    }
    /**
     * Gets the pid property value. Connection process ID
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPid() {
        return this.pid;
    }
    /**
     * Gets the query property value. Last/current query running on this connection
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the query_buffer property value. Query buffer length (disabled if 0)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQueryBuffer() {
        return this.queryBuffer;
    }
    /**
     * Gets the query_buffer_free property value. Free bytes in query buffer, if enabled
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQueryBufferFree() {
        return this.queryBufferFree;
    }
    /**
     * Gets the query_duration property value. Duration of the last/current query in seconds
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getQueryDuration() {
        return this.queryDuration;
    }
    /**
     * Gets the query_id property value. Hash code to identify identical normalized queries.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQueryId() {
        return this.queryId;
    }
    /**
     * Gets the query_start property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryStart() {
        return this.queryStart;
    }
    /**
     * Gets the state property value. Connection state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the state_change property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStateChange() {
        return this.stateChange;
    }
    /**
     * Gets the usename property value. Username
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsename() {
        return this.usename;
    }
    /**
     * Gets the usesysid property value. User ID
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsesysid() {
        return this.usesysid;
    }
    /**
     * Gets the wait_event property value. Connection wait event
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWaitEvent() {
        return this.waitEvent;
    }
    /**
     * Gets the wait_event_type property value. Connection wait event type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWaitEventType() {
        return this.waitEventType;
    }
    /**
     * Gets the waiting property value. Query is waiting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWaiting() {
        return this.waiting;
    }
    /**
     * Gets the xact_start property value. Timestamp in ISO 8601 format, always in UTC
     * @return a string
     */
    @javax.annotation.Nullable
    public String getXactStart() {
        return this.xactStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("active_channel_subscriptions", this.getActiveChannelSubscriptions());
        writer.writeStringValue("active_database", this.getActiveDatabase());
        writer.writeIntegerValue("active_pattern_matching_channel_subscriptions", this.getActivePatternMatchingChannelSubscriptions());
        writer.writeStringValue("application_name", this.getApplicationName());
        writer.writeStringValue("backend_start", this.getBackendStart());
        writer.writeStringValue("backend_type", this.getBackendType());
        writer.writeIntegerValue("backend_xid", this.getBackendXid());
        writer.writeIntegerValue("backend_xmin", this.getBackendXmin());
        writer.writeStringValue("client_addr", this.getClientAddr());
        writer.writeStringValue("client_hostname", this.getClientHostname());
        writer.writeIntegerValue("client_port", this.getClientPort());
        writer.writeDoubleValue("connection_age_seconds", this.getConnectionAgeSeconds());
        writer.writeDoubleValue("connection_idle_seconds", this.getConnectionIdleSeconds());
        writer.writeIntegerValue("datid", this.getDatid());
        writer.writeStringValue("datname", this.getDatname());
        writer.writeCollectionOfPrimitiveValues("flags", this.getFlags());
        writer.writeStringValue("flags_raw", this.getFlagsRaw());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("leader_pid", this.getLeaderPid());
        writer.writeIntegerValue("multi_exec_commands", this.getMultiExecCommands());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("output_buffer", this.getOutputBuffer());
        writer.writeIntegerValue("output_buffer_memory", this.getOutputBufferMemory());
        writer.writeIntegerValue("output_list_length", this.getOutputListLength());
        writer.writeIntegerValue("pid", this.getPid());
        writer.writeStringValue("query", this.getQuery());
        writer.writeIntegerValue("query_buffer", this.getQueryBuffer());
        writer.writeIntegerValue("query_buffer_free", this.getQueryBufferFree());
        writer.writeDoubleValue("query_duration", this.getQueryDuration());
        writer.writeIntegerValue("query_id", this.getQueryId());
        writer.writeStringValue("query_start", this.getQueryStart());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("state_change", this.getStateChange());
        writer.writeStringValue("usename", this.getUsename());
        writer.writeIntegerValue("usesysid", this.getUsesysid());
        writer.writeStringValue("wait_event", this.getWaitEvent());
        writer.writeStringValue("wait_event_type", this.getWaitEventType());
        writer.writeBooleanValue("waiting", this.getWaiting());
        writer.writeStringValue("xact_start", this.getXactStart());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the active_channel_subscriptions property value. Currently active channel subscriptions
     * @param value Value to set for the activeChannelSubscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveChannelSubscriptions(@javax.annotation.Nullable final Integer value) {
        this.activeChannelSubscriptions = value;
    }
    /**
     * Sets the active_database property value. Selected database
     * @param value Value to set for the activeDatabase property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDatabase(@javax.annotation.Nullable final String value) {
        this.activeDatabase = value;
    }
    /**
     * Sets the active_pattern_matching_channel_subscriptions property value. Currently active channel subscriptions using pattern matching
     * @param value Value to set for the activePatternMatchingChannelSubscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivePatternMatchingChannelSubscriptions(@javax.annotation.Nullable final Integer value) {
        this.activePatternMatchingChannelSubscriptions = value;
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
     * Sets the application_name property value. Application name when set
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationName(@javax.annotation.Nullable final String value) {
        this.applicationName = value;
    }
    /**
     * Sets the backend_start property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the backendStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackendStart(@javax.annotation.Nullable final String value) {
        this.backendStart = value;
    }
    /**
     * Sets the backend_type property value. Backend type
     * @param value Value to set for the backendType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackendType(@javax.annotation.Nullable final String value) {
        this.backendType = value;
    }
    /**
     * Sets the backend_xid property value. XID for current backend
     * @param value Value to set for the backendXid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackendXid(@javax.annotation.Nullable final Integer value) {
        this.backendXid = value;
    }
    /**
     * Sets the backend_xmin property value. xmin for current backend
     * @param value Value to set for the backendXmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackendXmin(@javax.annotation.Nullable final Integer value) {
        this.backendXmin = value;
    }
    /**
     * Sets the client_addr property value. IP address:port pair. Not always available due to load balancers
     * @param value Value to set for the clientAddr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientAddr(@javax.annotation.Nullable final String value) {
        this.clientAddr = value;
    }
    /**
     * Sets the client_hostname property value. Client hostname
     * @param value Value to set for the clientHostname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientHostname(@javax.annotation.Nullable final String value) {
        this.clientHostname = value;
    }
    /**
     * Sets the client_port property value. Client port, -1 is unknown
     * @param value Value to set for the clientPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientPort(@javax.annotation.Nullable final Integer value) {
        this.clientPort = value;
    }
    /**
     * Sets the connection_age_seconds property value. Connection age in seconds
     * @param value Value to set for the connectionAgeSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionAgeSeconds(@javax.annotation.Nullable final Double value) {
        this.connectionAgeSeconds = value;
    }
    /**
     * Sets the connection_idle_seconds property value. Connection idle time in seconds
     * @param value Value to set for the connectionIdleSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionIdleSeconds(@javax.annotation.Nullable final Double value) {
        this.connectionIdleSeconds = value;
    }
    /**
     * Sets the datid property value. Database ID
     * @param value Value to set for the datid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDatid(@javax.annotation.Nullable final Integer value) {
        this.datid = value;
    }
    /**
     * Sets the datname property value. Database name
     * @param value Value to set for the datname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDatname(@javax.annotation.Nullable final String value) {
        this.datname = value;
    }
    /**
     * Sets the flags property value. Connection state flags
     * @param value Value to set for the flags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.flags = value;
    }
    /**
     * Sets the flags_raw property value. Raw connection flags string
     * @param value Value to set for the flagsRaw property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlagsRaw(@javax.annotation.Nullable final String value) {
        this.flagsRaw = value;
    }
    /**
     * Sets the id property value. Unique connection ID
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the leader_pid property value. Leader process ID
     * @param value Value to set for the leaderPid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeaderPid(@javax.annotation.Nullable final Integer value) {
        this.leaderPid = value;
    }
    /**
     * Sets the multi_exec_commands property value. Number of MULTI/EXEC comands
     * @param value Value to set for the multiExecCommands property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiExecCommands(@javax.annotation.Nullable final Integer value) {
        this.multiExecCommands = value;
    }
    /**
     * Sets the name property value. Connection name, if specified
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the output_buffer property value. Output buffer length (disabled if 0)
     * @param value Value to set for the outputBuffer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputBuffer(@javax.annotation.Nullable final Integer value) {
        this.outputBuffer = value;
    }
    /**
     * Sets the output_buffer_memory property value. Output buffer memory
     * @param value Value to set for the outputBufferMemory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputBufferMemory(@javax.annotation.Nullable final Integer value) {
        this.outputBufferMemory = value;
    }
    /**
     * Sets the output_list_length property value. Output list, overflow for output buffering
     * @param value Value to set for the outputListLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputListLength(@javax.annotation.Nullable final Integer value) {
        this.outputListLength = value;
    }
    /**
     * Sets the pid property value. Connection process ID
     * @param value Value to set for the pid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPid(@javax.annotation.Nullable final Integer value) {
        this.pid = value;
    }
    /**
     * Sets the query property value. Last/current query running on this connection
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the query_buffer property value. Query buffer length (disabled if 0)
     * @param value Value to set for the queryBuffer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryBuffer(@javax.annotation.Nullable final Integer value) {
        this.queryBuffer = value;
    }
    /**
     * Sets the query_buffer_free property value. Free bytes in query buffer, if enabled
     * @param value Value to set for the queryBufferFree property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryBufferFree(@javax.annotation.Nullable final Integer value) {
        this.queryBufferFree = value;
    }
    /**
     * Sets the query_duration property value. Duration of the last/current query in seconds
     * @param value Value to set for the queryDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryDuration(@javax.annotation.Nullable final Double value) {
        this.queryDuration = value;
    }
    /**
     * Sets the query_id property value. Hash code to identify identical normalized queries.
     * @param value Value to set for the queryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryId(@javax.annotation.Nullable final Integer value) {
        this.queryId = value;
    }
    /**
     * Sets the query_start property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the queryStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryStart(@javax.annotation.Nullable final String value) {
        this.queryStart = value;
    }
    /**
     * Sets the state property value. Connection state
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the state_change property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the stateChange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStateChange(@javax.annotation.Nullable final String value) {
        this.stateChange = value;
    }
    /**
     * Sets the usename property value. Username
     * @param value Value to set for the usename property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsename(@javax.annotation.Nullable final String value) {
        this.usename = value;
    }
    /**
     * Sets the usesysid property value. User ID
     * @param value Value to set for the usesysid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsesysid(@javax.annotation.Nullable final Integer value) {
        this.usesysid = value;
    }
    /**
     * Sets the wait_event property value. Connection wait event
     * @param value Value to set for the waitEvent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWaitEvent(@javax.annotation.Nullable final String value) {
        this.waitEvent = value;
    }
    /**
     * Sets the wait_event_type property value. Connection wait event type
     * @param value Value to set for the waitEventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWaitEventType(@javax.annotation.Nullable final String value) {
        this.waitEventType = value;
    }
    /**
     * Sets the waiting property value. Query is waiting
     * @param value Value to set for the waiting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWaiting(@javax.annotation.Nullable final Boolean value) {
        this.waiting = value;
    }
    /**
     * Sets the xact_start property value. Timestamp in ISO 8601 format, always in UTC
     * @param value Value to set for the xactStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXactStart(@javax.annotation.Nullable final String value) {
        this.xactStart = value;
    }
}
