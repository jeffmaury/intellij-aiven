package com.jeffmaury.aiven.intellij.api.project.item.service.item;

import com.jeffmaury.aiven.intellij.api.models.ServiceDeleteResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceGetResponse;
import com.jeffmaury.aiven.intellij.api.models.ServiceUpdateRequestBody;
import com.jeffmaury.aiven.intellij.api.models.ServiceUpdateResponse;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.acl.AclRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.alerts.AlertsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.availableconnectors.AvailableConnectorsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.backup_to_another_region.BackupToAnotherRegionRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.backups.BackupsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.clickhouse.ClickhouseRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connection_pool.ConnectionPoolRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectorplugins.ConnectorPluginsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.connectors.ConnectorsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.db.DbRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.enablewrites.EnableWritesRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.flink.FlinkRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.index.IndexRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.influxdb.InfluxdbRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.integration.IntegrationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kafka.KafkaRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.kms.KmsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.logs.LogsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.maintenance.MaintenanceRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.metrics.MetricsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.migration.MigrationRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.mirrormaker.MirrormakerRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.mysql.MysqlRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.opensearch.OpensearchRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.pg.PgRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.privatelink.PrivatelinkRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.query.QueryRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.quota.QuotaRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.tags.TagsRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.task.TaskRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.topic.TopicRequestBuilder;
import com.jeffmaury.aiven.intellij.api.project.item.service.item.user.UserRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}
 */
public class WithServiceNameItemRequestBuilder extends BaseRequestBuilder {
    /** The acl property */
    @javax.annotation.Nonnull
    public AclRequestBuilder acl() {
        return new AclRequestBuilder(pathParameters, requestAdapter);
    }
    /** The alerts property */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The availableConnectors property */
    @javax.annotation.Nonnull
    public AvailableConnectorsRequestBuilder availableConnectors() {
        return new AvailableConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The backup_to_another_region property */
    @javax.annotation.Nonnull
    public BackupToAnotherRegionRequestBuilder backup_to_another_region() {
        return new BackupToAnotherRegionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The backups property */
    @javax.annotation.Nonnull
    public BackupsRequestBuilder backups() {
        return new BackupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The clickhouse property */
    @javax.annotation.Nonnull
    public ClickhouseRequestBuilder clickhouse() {
        return new ClickhouseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The connection_pool property */
    @javax.annotation.Nonnull
    public ConnectionPoolRequestBuilder connection_pool() {
        return new ConnectionPoolRequestBuilder(pathParameters, requestAdapter);
    }
    /** The connectorPlugins property */
    @javax.annotation.Nonnull
    public ConnectorPluginsRequestBuilder connectorPlugins() {
        return new ConnectorPluginsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The connectors property */
    @javax.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The db property */
    @javax.annotation.Nonnull
    public DbRequestBuilder db() {
        return new DbRequestBuilder(pathParameters, requestAdapter);
    }
    /** The enableWrites property */
    @javax.annotation.Nonnull
    public EnableWritesRequestBuilder enableWrites() {
        return new EnableWritesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The flink property */
    @javax.annotation.Nonnull
    public FlinkRequestBuilder flink() {
        return new FlinkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The index property */
    @javax.annotation.Nonnull
    public IndexRequestBuilder index() {
        return new IndexRequestBuilder(pathParameters, requestAdapter);
    }
    /** The influxdb property */
    @javax.annotation.Nonnull
    public InfluxdbRequestBuilder influxdb() {
        return new InfluxdbRequestBuilder(pathParameters, requestAdapter);
    }
    /** The integration property */
    @javax.annotation.Nonnull
    public IntegrationRequestBuilder integration() {
        return new IntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kafka property */
    @javax.annotation.Nonnull
    public KafkaRequestBuilder kafka() {
        return new KafkaRequestBuilder(pathParameters, requestAdapter);
    }
    /** The kms property */
    @javax.annotation.Nonnull
    public KmsRequestBuilder kms() {
        return new KmsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The logs property */
    @javax.annotation.Nonnull
    public LogsRequestBuilder logs() {
        return new LogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The maintenance property */
    @javax.annotation.Nonnull
    public MaintenanceRequestBuilder maintenance() {
        return new MaintenanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The metrics property */
    @javax.annotation.Nonnull
    public MetricsRequestBuilder metrics() {
        return new MetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The migration property */
    @javax.annotation.Nonnull
    public MigrationRequestBuilder migration() {
        return new MigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mirrormaker property */
    @javax.annotation.Nonnull
    public MirrormakerRequestBuilder mirrormaker() {
        return new MirrormakerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mysql property */
    @javax.annotation.Nonnull
    public MysqlRequestBuilder mysql() {
        return new MysqlRequestBuilder(pathParameters, requestAdapter);
    }
    /** The opensearch property */
    @javax.annotation.Nonnull
    public OpensearchRequestBuilder opensearch() {
        return new OpensearchRequestBuilder(pathParameters, requestAdapter);
    }
    /** The pg property */
    @javax.annotation.Nonnull
    public PgRequestBuilder pg() {
        return new PgRequestBuilder(pathParameters, requestAdapter);
    }
    /** The privatelink property */
    @javax.annotation.Nonnull
    public PrivatelinkRequestBuilder privatelink() {
        return new PrivatelinkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The query property */
    @javax.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The quota property */
    @javax.annotation.Nonnull
    public QuotaRequestBuilder quota() {
        return new QuotaRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tags property */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The task property */
    @javax.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /** The topic property */
    @javax.annotation.Nonnull
    public TopicRequestBuilder topic() {
        return new TopicRequestBuilder(pathParameters, requestAdapter);
    }
    /** The user property */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithService_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithServiceNameItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}{?allow_unclean_poweroff*}", pathParameters);
    }
    /**
     * Instantiates a new WithService_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WithServiceNameItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}{?allow_unclean_poweroff*}", rawUrl);
    }
    /**
     * Terminate a service
     * @return a CompletableFuture of ServiceDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceDeleteResponse> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Terminate a service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceDeleteResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceDeleteResponse> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceDeleteResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceDeleteResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceDeleteResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service information
     * @return a CompletableFuture of ServiceGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceGetResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceGetResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceGetResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceGetResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceGetResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceGetResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @return a CompletableFuture of ServiceUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateResponse> put(@javax.annotation.Nonnull final ServiceUpdateRequestBody body) {
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ServiceUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceUpdateResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateResponse> put(@javax.annotation.Nonnull final ServiceUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ServiceUpdateResponse::createFromDiscriminatorValue, null);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ServiceUpdateResponse> executionException = new java.util.concurrent.CompletableFuture<ServiceUpdateResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Terminate a service
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Terminate a service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get service information
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceUpdateRequestBody body) throws URISyntaxException {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@javax.annotation.Nonnull final ServiceUpdateRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Update service configuration
     */
    public class PutQueryParameters {
        /** Allows or disallows powering off a service if some WAL segments are not available for a future restoration of the service, which might result in data loss when powering the service back on */
        @javax.annotation.Nullable
        public Boolean allow_unclean_poweroff;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public PutQueryParameters queryParameters = new PutQueryParameters();
    }
}
