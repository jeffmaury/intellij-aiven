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
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /project/{project}/service/{service_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithServiceNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The acl property
     */
    @jakarta.annotation.Nonnull
    public AclRequestBuilder acl() {
        return new AclRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The alerts property
     */
    @jakarta.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The availableConnectors property
     */
    @jakarta.annotation.Nonnull
    public AvailableConnectorsRequestBuilder availableConnectors() {
        return new AvailableConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The backups property
     */
    @jakarta.annotation.Nonnull
    public BackupsRequestBuilder backups() {
        return new BackupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The backup_to_another_region property
     */
    @jakarta.annotation.Nonnull
    public BackupToAnotherRegionRequestBuilder backupToAnotherRegion() {
        return new BackupToAnotherRegionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clickhouse property
     */
    @jakarta.annotation.Nonnull
    public ClickhouseRequestBuilder clickhouse() {
        return new ClickhouseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The connection_pool property
     */
    @jakarta.annotation.Nonnull
    public ConnectionPoolRequestBuilder connectionPool() {
        return new ConnectionPoolRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The connectorPlugins property
     */
    @jakarta.annotation.Nonnull
    public ConnectorPluginsRequestBuilder connectorPlugins() {
        return new ConnectorPluginsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The connectors property
     */
    @jakarta.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The db property
     */
    @jakarta.annotation.Nonnull
    public DbRequestBuilder db() {
        return new DbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The enableWrites property
     */
    @jakarta.annotation.Nonnull
    public EnableWritesRequestBuilder enableWrites() {
        return new EnableWritesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The flink property
     */
    @jakarta.annotation.Nonnull
    public FlinkRequestBuilder flink() {
        return new FlinkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The index property
     */
    @jakarta.annotation.Nonnull
    public IndexRequestBuilder index() {
        return new IndexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The influxdb property
     */
    @jakarta.annotation.Nonnull
    public InfluxdbRequestBuilder influxdb() {
        return new InfluxdbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The integration property
     */
    @jakarta.annotation.Nonnull
    public IntegrationRequestBuilder integration() {
        return new IntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The kafka property
     */
    @jakarta.annotation.Nonnull
    public KafkaRequestBuilder kafka() {
        return new KafkaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The kms property
     */
    @jakarta.annotation.Nonnull
    public KmsRequestBuilder kms() {
        return new KmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The logs property
     */
    @jakarta.annotation.Nonnull
    public LogsRequestBuilder logs() {
        return new LogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The maintenance property
     */
    @jakarta.annotation.Nonnull
    public MaintenanceRequestBuilder maintenance() {
        return new MaintenanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The metrics property
     */
    @jakarta.annotation.Nonnull
    public MetricsRequestBuilder metrics() {
        return new MetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The migration property
     */
    @jakarta.annotation.Nonnull
    public MigrationRequestBuilder migration() {
        return new MigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mirrormaker property
     */
    @jakarta.annotation.Nonnull
    public MirrormakerRequestBuilder mirrormaker() {
        return new MirrormakerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mysql property
     */
    @jakarta.annotation.Nonnull
    public MysqlRequestBuilder mysql() {
        return new MysqlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The opensearch property
     */
    @jakarta.annotation.Nonnull
    public OpensearchRequestBuilder opensearch() {
        return new OpensearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pg property
     */
    @jakarta.annotation.Nonnull
    public PgRequestBuilder pg() {
        return new PgRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The privatelink property
     */
    @jakarta.annotation.Nonnull
    public PrivatelinkRequestBuilder privatelink() {
        return new PrivatelinkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The query property
     */
    @jakarta.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The quota property
     */
    @jakarta.annotation.Nonnull
    public QuotaRequestBuilder quota() {
        return new QuotaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tags property
     */
    @jakarta.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The task property
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The topic property
     */
    @jakarta.annotation.Nonnull
    public TopicRequestBuilder topic() {
        return new TopicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithService_nameItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}{?allow_unclean_poweroff*}", pathParameters);
    }
    /**
     * Instantiates a new WithService_nameItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/project/{project}/service/{service_name}{?allow_unclean_poweroff*}", rawUrl);
    }
    /**
     * Terminate a service
     * @return a CompletableFuture of ServiceDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceDeleteResponse> delete() {
        return delete(null);
    }
    /**
     * Terminate a service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceDeleteResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceDeleteResponse> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceDeleteResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Get service information
     * @return a CompletableFuture of ServiceGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceGetResponse> get() {
        return get(null);
    }
    /**
     * Get service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceGetResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @return a CompletableFuture of ServiceUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateResponse> put(@jakarta.annotation.Nonnull final ServiceUpdateRequestBody body) {
        return put(body, null);
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceUpdateResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateResponse> put(@jakarta.annotation.Nonnull final ServiceUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.sendAsync(requestInfo, ServiceUpdateResponse::createFromDiscriminatorValue, null);
    }
    /**
     * Terminate a service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Terminate a service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get service information
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get service information
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceUpdateRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update service configuration
     * @param body ServiceUpdateRequestBody
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ServiceUpdateRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithServiceNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithServiceNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithServiceNameItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Update service configuration
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutQueryParameters {
        /**
         * Allows or disallows powering off a service if some WAL segments are not available for a future restoration of the service, which might result in data loss when powering the service back on
         */
        @QueryParameter(name = "allow_unclean_poweroff")
        @jakarta.annotation.Nullable
        public Boolean allowUncleanPoweroff;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PutQueryParameters queryParameters = new PutQueryParameters();
    }
}
