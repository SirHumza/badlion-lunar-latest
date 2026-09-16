package io.sentry;

import io.sentry.backpressure.IBackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.ClientReportRecorder;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.clientreport.NoOpClientReportRecorder;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.viewhierarchy.ViewHierarchyExporter;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Platform;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import io.sentry.util.thread.IMainThreadChecker;
import io.sentry.util.thread.NoOpMainThreadChecker;
import java.io.File;
import java.net.Proxy.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public class SentryOptions {
   @ApiStatus.Internal
   @NotNull
   public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
   static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
   private static final String DEFAULT_ENVIRONMENT = "production";
   @NotNull
   private final List<EventProcessor> eventProcessors = new CopyOnWriteArrayList<>();
   @NotNull
   private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet<>();
   @NotNull
   private final List<Integration> integrations = new CopyOnWriteArrayList<>();
   @NotNull
   private final Set<String> bundleIds = new CopyOnWriteArraySet<>();
   @Nullable
   private String dsn;
   @NotNull
   private final LazyEvaluator<Dsn> parsedDsn = new LazyEvaluator<>(() -> new Dsn(this.dsn));
   @Nullable
   private String dsnHash;
   private long shutdownTimeoutMillis = 2000L;
   private long flushTimeoutMillis = 15000L;
   private long sessionFlushTimeoutMillis = 15000L;
   private boolean debug;
   @NotNull
   private ILogger logger = NoOpLogger.getInstance();
   @NotNull
   private SentryLevel diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
   @NotNull
   private final LazyEvaluator<ISerializer> serializer = new LazyEvaluator<>(() -> new JsonSerializer(this));
   @NotNull
   private final LazyEvaluator<IEnvelopeReader> envelopeReader = new LazyEvaluator<>(() -> new EnvelopeReader(this.serializer.getValue()));
   private int maxDepth = 100;
   @Nullable
   private String sentryClientName;
   @Nullable
   private SentryOptions.BeforeSendCallback beforeSend;
   @Nullable
   private SentryOptions.BeforeSendTransactionCallback beforeSendTransaction;
   @Nullable
   private SentryOptions.BeforeSendReplayCallback beforeSendReplay;
   @Nullable
   private SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb;
   @Nullable
   private String cacheDirPath;
   private int maxCacheItems = 30;
   private int maxQueueSize = this.maxCacheItems;
   private int maxBreadcrumbs = 100;
   @Nullable
   private String release;
   @Nullable
   private String environment;
   @Nullable
   private SentryOptions.Proxy proxy;
   @Nullable
   private Double sampleRate;
   @Nullable
   private Boolean enableTracing;
   @Nullable
   private Double tracesSampleRate;
   @Nullable
   private SentryOptions.TracesSamplerCallback tracesSampler;
   @NotNull
   private final List<String> inAppExcludes = new CopyOnWriteArrayList<>();
   @NotNull
   private final List<String> inAppIncludes = new CopyOnWriteArrayList<>();
   @NotNull
   private ITransportFactory transportFactory = NoOpTransportFactory.getInstance();
   @NotNull
   private ITransportGate transportGate = NoOpTransportGate.getInstance();
   @Nullable
   private String dist;
   private boolean attachThreads;
   private boolean attachStacktrace = true;
   private boolean enableAutoSessionTracking = true;
   private long sessionTrackingIntervalMillis = 30000L;
   @Nullable
   private String distinctId;
   @Nullable
   private String serverName;
   private boolean attachServerName = true;
   private boolean enableUncaughtExceptionHandler = true;
   private boolean printUncaughtStackTrace = false;
   @NotNull
   private ISentryExecutorService executorService = NoOpSentryExecutorService.getInstance();
   private int connectionTimeoutMillis = 5000;
   private int readTimeoutMillis = 5000;
   @NotNull
   private IEnvelopeCache envelopeDiskCache = NoOpEnvelopeCache.getInstance();
   @Nullable
   private SdkVersion sdkVersion;
   private boolean sendDefaultPii = false;
   @Nullable
   private SSLSocketFactory sslSocketFactory;
   @NotNull
   private final List<IScopeObserver> observers = new CopyOnWriteArrayList<>();
   @NotNull
   private final List<IOptionsObserver> optionsObservers = new CopyOnWriteArrayList<>();
   private boolean enableExternalConfiguration;
   @NotNull
   private final Map<String, String> tags = new ConcurrentHashMap<>();
   private long maxAttachmentSize = 20971520L;
   private boolean enableDeduplication = true;
   private int maxSpans = 1000;
   private boolean enableShutdownHook = true;
   @NotNull
   private SentryOptions.RequestSize maxRequestBodySize = SentryOptions.RequestSize.NONE;
   private boolean traceSampling = true;
   @Nullable
   private Double profilesSampleRate;
   @Nullable
   private SentryOptions.ProfilesSamplerCallback profilesSampler;
   private long maxTraceFileSize = 5242880L;
   @NotNull
   private ITransactionProfiler transactionProfiler = NoOpTransactionProfiler.getInstance();
   @Nullable
   private List<String> tracePropagationTargets = null;
   @NotNull
   private final List<String> defaultTracePropagationTargets = Collections.singletonList(".*");
   @Nullable
   private String proguardUuid;
   @Nullable
   private Long idleTimeout = 3000L;
   @NotNull
   private final List<String> contextTags = new CopyOnWriteArrayList<>();
   private boolean sendClientReports = true;
   @NotNull
   IClientReportRecorder clientReportRecorder = new ClientReportRecorder(this);
   @NotNull
   private IModulesLoader modulesLoader = NoOpModulesLoader.getInstance();
   @NotNull
   private IDebugMetaLoader debugMetaLoader = NoOpDebugMetaLoader.getInstance();
   private boolean enableUserInteractionTracing = false;
   private boolean enableUserInteractionBreadcrumbs = true;
   @NotNull
   private Instrumenter instrumenter = Instrumenter.SENTRY;
   @NotNull
   private final List<GestureTargetLocator> gestureTargetLocators = new ArrayList<>();
   @NotNull
   private final List<ViewHierarchyExporter> viewHierarchyExporters = new ArrayList<>();
   @NotNull
   private IMainThreadChecker mainThreadChecker = NoOpMainThreadChecker.getInstance();
   private boolean traceOptionsRequests = true;
   @ApiStatus.Internal
   @NotNull
   private final LazyEvaluator<SentryDateProvider> dateProvider = new LazyEvaluator<>(() -> new SentryAutoDateProvider());
   @NotNull
   private final List<IPerformanceCollector> performanceCollectors = new ArrayList<>();
   @NotNull
   private TransactionPerformanceCollector transactionPerformanceCollector = NoOpTransactionPerformanceCollector.getInstance();
   private boolean enableTimeToFullDisplayTracing = false;
   @NotNull
   private FullyDisplayedReporter fullyDisplayedReporter = FullyDisplayedReporter.getInstance();
   @NotNull
   private IConnectionStatusProvider connectionStatusProvider = new NoOpConnectionStatusProvider();
   private boolean enabled = true;
   private boolean enablePrettySerializationOutput = true;
   private boolean sendModules = true;
   @Nullable
   private SentryOptions.BeforeEnvelopeCallback beforeEnvelopeCallback;
   private boolean enableSpotlight = false;
   @Nullable
   private String spotlightConnectionUrl;
   private boolean enableScopePersistence = true;
   @ApiStatus.Experimental
   @Nullable
   private List<String> ignoredCheckIns = null;
   @NotNull
   private IBackpressureMonitor backpressureMonitor = NoOpBackpressureMonitor.getInstance();
   private boolean enableBackpressureHandling = true;
   private boolean enableAppStartProfiling = false;
   private boolean enableMetrics = false;
   private boolean enableDefaultTagsForMetrics = true;
   private boolean enableSpanLocalMetricAggregation = true;
   @Nullable
   private SentryOptions.BeforeEmitMetricCallback beforeEmitMetricCallback = null;
   private int profilingTracesHz = 101;
   @ApiStatus.Experimental
   @Nullable
   private SentryOptions.Cron cron = null;
   @NotNull
   private final ExperimentalOptions experimental;
   @NotNull
   private ReplayController replayController = NoOpReplayController.getInstance();
   @ApiStatus.Experimental
   private boolean enableScreenTracking = true;

   public void addEventProcessor(@NotNull EventProcessor var1) {
      this.eventProcessors.add(var1);
   }

   @NotNull
   public List<EventProcessor> getEventProcessors() {
      return this.eventProcessors;
   }

   public void addIntegration(@NotNull Integration var1) {
      this.integrations.add(var1);
   }

   @NotNull
   public List<Integration> getIntegrations() {
      return this.integrations;
   }

   @Nullable
   public String getDsn() {
      return this.dsn;
   }

   @ApiStatus.Internal
   @NotNull
   Dsn retrieveParsedDsn() {
      return this.parsedDsn.getValue();
   }

   public void setDsn(@Nullable String var1) {
      this.dsn = var1;
      this.parsedDsn.resetValue();
      this.dsnHash = StringUtils.calculateStringHash(this.dsn, this.logger);
   }

   public boolean isDebug() {
      return this.debug;
   }

   public void setDebug(boolean var1) {
      this.debug = var1;
   }

   @NotNull
   public ILogger getLogger() {
      return this.logger;
   }

   public void setLogger(@Nullable ILogger var1) {
      this.logger = var1 == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, var1);
   }

   @NotNull
   public SentryLevel getDiagnosticLevel() {
      return this.diagnosticLevel;
   }

   public void setDiagnosticLevel(@Nullable SentryLevel var1) {
      this.diagnosticLevel = var1 != null ? var1 : DEFAULT_DIAGNOSTIC_LEVEL;
   }

   @NotNull
   public ISerializer getSerializer() {
      return this.serializer.getValue();
   }

   public void setSerializer(@Nullable ISerializer var1) {
      this.serializer.setValue(var1 != null ? var1 : NoOpSerializer.getInstance());
   }

   public int getMaxDepth() {
      return this.maxDepth;
   }

   public void setMaxDepth(int var1) {
      this.maxDepth = var1;
   }

   @NotNull
   public IEnvelopeReader getEnvelopeReader() {
      return this.envelopeReader.getValue();
   }

   public void setEnvelopeReader(@Nullable IEnvelopeReader var1) {
      this.envelopeReader.setValue(var1 != null ? var1 : NoOpEnvelopeReader.getInstance());
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval
   public long getShutdownTimeout() {
      return this.shutdownTimeoutMillis;
   }

   public long getShutdownTimeoutMillis() {
      return this.shutdownTimeoutMillis;
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval
   public void setShutdownTimeout(long var1) {
      this.shutdownTimeoutMillis = var1;
   }

   public void setShutdownTimeoutMillis(long var1) {
      this.shutdownTimeoutMillis = var1;
   }

   @Nullable
   public String getSentryClientName() {
      return this.sentryClientName;
   }

   public void setSentryClientName(@Nullable String var1) {
      this.sentryClientName = var1;
   }

   @Nullable
   public SentryOptions.BeforeSendCallback getBeforeSend() {
      return this.beforeSend;
   }

   public void setBeforeSend(@Nullable SentryOptions.BeforeSendCallback var1) {
      this.beforeSend = var1;
   }

   @Nullable
   public SentryOptions.BeforeSendTransactionCallback getBeforeSendTransaction() {
      return this.beforeSendTransaction;
   }

   public void setBeforeSendTransaction(@Nullable SentryOptions.BeforeSendTransactionCallback var1) {
      this.beforeSendTransaction = var1;
   }

   @Nullable
   public SentryOptions.BeforeSendReplayCallback getBeforeSendReplay() {
      return this.beforeSendReplay;
   }

   public void setBeforeSendReplay(@Nullable SentryOptions.BeforeSendReplayCallback var1) {
      this.beforeSendReplay = var1;
   }

   @Nullable
   public SentryOptions.BeforeBreadcrumbCallback getBeforeBreadcrumb() {
      return this.beforeBreadcrumb;
   }

   public void setBeforeBreadcrumb(@Nullable SentryOptions.BeforeBreadcrumbCallback var1) {
      this.beforeBreadcrumb = var1;
   }

   @Nullable
   public String getCacheDirPath() {
      if (this.cacheDirPath != null && !this.cacheDirPath.isEmpty()) {
         return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
      } else {
         return null;
      }
   }

   @Nullable
   String getCacheDirPathWithoutDsn() {
      return this.cacheDirPath != null && !this.cacheDirPath.isEmpty() ? this.cacheDirPath : null;
   }

   @Nullable
   public String getOutboxPath() {
      String var1 = this.getCacheDirPath();
      return var1 == null ? null : new File(var1, "outbox").getAbsolutePath();
   }

   public void setCacheDirPath(@Nullable String var1) {
      this.cacheDirPath = var1;
   }

   public int getMaxBreadcrumbs() {
      return this.maxBreadcrumbs;
   }

   public void setMaxBreadcrumbs(int var1) {
      this.maxBreadcrumbs = var1;
   }

   @Nullable
   public String getRelease() {
      return this.release;
   }

   public void setRelease(@Nullable String var1) {
      this.release = var1;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment != null ? this.environment : "production";
   }

   public void setEnvironment(@Nullable String var1) {
      this.environment = var1;
   }

   @Nullable
   public SentryOptions.Proxy getProxy() {
      return this.proxy;
   }

   public void setProxy(@Nullable SentryOptions.Proxy var1) {
      this.proxy = var1;
   }

   @Nullable
   public Double getSampleRate() {
      return this.sampleRate;
   }

   public void setSampleRate(Double var1) {
      if (!SampleRateUtils.isValidSampleRate(var1)) {
         throw new IllegalArgumentException("The value " + var1 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
      }

      this.sampleRate = var1;
   }

   @Deprecated
   @Nullable
   public Boolean getEnableTracing() {
      return this.enableTracing;
   }

   @Deprecated
   public void setEnableTracing(@Nullable Boolean var1) {
      this.enableTracing = var1;
   }

   @Nullable
   public Double getTracesSampleRate() {
      return this.tracesSampleRate;
   }

   public void setTracesSampleRate(@Nullable Double var1) {
      if (!SampleRateUtils.isValidTracesSampleRate(var1)) {
         throw new IllegalArgumentException("The value " + var1 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
      }

      this.tracesSampleRate = var1;
   }

   @Nullable
   public SentryOptions.TracesSamplerCallback getTracesSampler() {
      return this.tracesSampler;
   }

   public void setTracesSampler(@Nullable SentryOptions.TracesSamplerCallback var1) {
      this.tracesSampler = var1;
   }

   @NotNull
   public List<String> getInAppExcludes() {
      return this.inAppExcludes;
   }

   public void addInAppExclude(@NotNull String var1) {
      this.inAppExcludes.add(var1);
   }

   @NotNull
   public List<String> getInAppIncludes() {
      return this.inAppIncludes;
   }

   public void addInAppInclude(@NotNull String var1) {
      this.inAppIncludes.add(var1);
   }

   @NotNull
   public ITransportFactory getTransportFactory() {
      return this.transportFactory;
   }

   public void setTransportFactory(@Nullable ITransportFactory var1) {
      this.transportFactory = var1 != null ? var1 : NoOpTransportFactory.getInstance();
   }

   @Nullable
   public String getDist() {
      return this.dist;
   }

   public void setDist(@Nullable String var1) {
      this.dist = var1;
   }

   @NotNull
   public ITransportGate getTransportGate() {
      return this.transportGate;
   }

   public void setTransportGate(@Nullable ITransportGate var1) {
      this.transportGate = var1 != null ? var1 : NoOpTransportGate.getInstance();
   }

   public boolean isAttachStacktrace() {
      return this.attachStacktrace;
   }

   public void setAttachStacktrace(boolean var1) {
      this.attachStacktrace = var1;
   }

   public boolean isAttachThreads() {
      return this.attachThreads;
   }

   public void setAttachThreads(boolean var1) {
      this.attachThreads = var1;
   }

   public boolean isEnableAutoSessionTracking() {
      return this.enableAutoSessionTracking;
   }

   public void setEnableAutoSessionTracking(boolean var1) {
      this.enableAutoSessionTracking = var1;
   }

   @Nullable
   public String getServerName() {
      return this.serverName;
   }

   public void setServerName(@Nullable String var1) {
      this.serverName = var1;
   }

   public boolean isAttachServerName() {
      return this.attachServerName;
   }

   public void setAttachServerName(boolean var1) {
      this.attachServerName = var1;
   }

   public long getSessionTrackingIntervalMillis() {
      return this.sessionTrackingIntervalMillis;
   }

   public void setSessionTrackingIntervalMillis(long var1) {
      this.sessionTrackingIntervalMillis = var1;
   }

   @ApiStatus.Internal
   @Nullable
   public String getDistinctId() {
      return this.distinctId;
   }

   @ApiStatus.Internal
   public void setDistinctId(@Nullable String var1) {
      this.distinctId = var1;
   }

   public long getFlushTimeoutMillis() {
      return this.flushTimeoutMillis;
   }

   public void setFlushTimeoutMillis(long var1) {
      this.flushTimeoutMillis = var1;
   }

   public boolean isEnableUncaughtExceptionHandler() {
      return this.enableUncaughtExceptionHandler;
   }

   public void setEnableUncaughtExceptionHandler(boolean var1) {
      this.enableUncaughtExceptionHandler = var1;
   }

   public boolean isPrintUncaughtStackTrace() {
      return this.printUncaughtStackTrace;
   }

   public void setPrintUncaughtStackTrace(boolean var1) {
      this.printUncaughtStackTrace = var1;
   }

   @ApiStatus.Internal
   @NotNull
   public ISentryExecutorService getExecutorService() {
      return this.executorService;
   }

   @ApiStatus.Internal
   @TestOnly
   public void setExecutorService(@NotNull ISentryExecutorService var1) {
      if (var1 != null) {
         this.executorService = var1;
      }
   }

   public int getConnectionTimeoutMillis() {
      return this.connectionTimeoutMillis;
   }

   public void setConnectionTimeoutMillis(int var1) {
      this.connectionTimeoutMillis = var1;
   }

   public int getReadTimeoutMillis() {
      return this.readTimeoutMillis;
   }

   public void setReadTimeoutMillis(int var1) {
      this.readTimeoutMillis = var1;
   }

   @NotNull
   public IEnvelopeCache getEnvelopeDiskCache() {
      return this.envelopeDiskCache;
   }

   public void setEnvelopeDiskCache(@Nullable IEnvelopeCache var1) {
      this.envelopeDiskCache = var1 != null ? var1 : NoOpEnvelopeCache.getInstance();
   }

   public int getMaxQueueSize() {
      return this.maxQueueSize;
   }

   public void setMaxQueueSize(int var1) {
      if (var1 > 0) {
         this.maxQueueSize = var1;
      }
   }

   @Nullable
   public SdkVersion getSdkVersion() {
      return this.sdkVersion;
   }

   @Nullable
   public SSLSocketFactory getSslSocketFactory() {
      return this.sslSocketFactory;
   }

   public void setSslSocketFactory(@Nullable SSLSocketFactory var1) {
      this.sslSocketFactory = var1;
   }

   @ApiStatus.Internal
   public void setSdkVersion(@Nullable SdkVersion var1) {
      this.sdkVersion = var1;
   }

   public boolean isSendDefaultPii() {
      return this.sendDefaultPii;
   }

   public void setSendDefaultPii(boolean var1) {
      this.sendDefaultPii = var1;
   }

   public void addScopeObserver(@NotNull IScopeObserver var1) {
      this.observers.add(var1);
   }

   @NotNull
   public List<IScopeObserver> getScopeObservers() {
      return this.observers;
   }

   public void addOptionsObserver(@NotNull IOptionsObserver var1) {
      this.optionsObservers.add(var1);
   }

   @NotNull
   public List<IOptionsObserver> getOptionsObservers() {
      return this.optionsObservers;
   }

   public boolean isEnableExternalConfiguration() {
      return this.enableExternalConfiguration;
   }

   public void setEnableExternalConfiguration(boolean var1) {
      this.enableExternalConfiguration = var1;
   }

   @NotNull
   public Map<String, String> getTags() {
      return this.tags;
   }

   public void setTag(@NotNull String var1, @NotNull String var2) {
      this.tags.put(var1, var2);
   }

   public long getMaxAttachmentSize() {
      return this.maxAttachmentSize;
   }

   public void setMaxAttachmentSize(long var1) {
      this.maxAttachmentSize = var1;
   }

   public boolean isEnableDeduplication() {
      return this.enableDeduplication;
   }

   public void setEnableDeduplication(boolean var1) {
      this.enableDeduplication = var1;
   }

   public boolean isTracingEnabled() {
      return this.enableTracing != null ? this.enableTracing : this.getTracesSampleRate() != null || this.getTracesSampler() != null;
   }

   @NotNull
   public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
      return this.ignoredExceptionsForType;
   }

   public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> var1) {
      this.ignoredExceptionsForType.add(var1);
   }

   boolean containsIgnoredExceptionForType(@NotNull Throwable var1) {
      return this.ignoredExceptionsForType.contains(var1.getClass());
   }

   @ApiStatus.Experimental
   public int getMaxSpans() {
      return this.maxSpans;
   }

   @ApiStatus.Experimental
   public void setMaxSpans(int var1) {
      this.maxSpans = var1;
   }

   public boolean isEnableShutdownHook() {
      return this.enableShutdownHook;
   }

   public void setEnableShutdownHook(boolean var1) {
      this.enableShutdownHook = var1;
   }

   public int getMaxCacheItems() {
      return this.maxCacheItems;
   }

   public void setMaxCacheItems(int var1) {
      this.maxCacheItems = var1;
   }

   @NotNull
   public SentryOptions.RequestSize getMaxRequestBodySize() {
      return this.maxRequestBodySize;
   }

   public void setMaxRequestBodySize(@NotNull SentryOptions.RequestSize var1) {
      this.maxRequestBodySize = var1;
   }

   @ApiStatus.Experimental
   public boolean isTraceSampling() {
      return this.traceSampling;
   }

   @Deprecated
   public void setTraceSampling(boolean var1) {
      this.traceSampling = var1;
   }

   public long getMaxTraceFileSize() {
      return this.maxTraceFileSize;
   }

   public void setMaxTraceFileSize(long var1) {
      this.maxTraceFileSize = var1;
   }

   @NotNull
   public ITransactionProfiler getTransactionProfiler() {
      return this.transactionProfiler;
   }

   public void setTransactionProfiler(@Nullable ITransactionProfiler var1) {
      if (this.transactionProfiler == NoOpTransactionProfiler.getInstance() && var1 != null) {
         this.transactionProfiler = var1;
      }
   }

   public boolean isProfilingEnabled() {
      return this.getProfilesSampleRate() != null && this.getProfilesSampleRate() > 0.0 || this.getProfilesSampler() != null;
   }

   @Deprecated
   public void setProfilingEnabled(boolean var1) {
      if (this.getProfilesSampleRate() == null) {
         this.setProfilesSampleRate(var1 ? 1.0 : null);
      }
   }

   @Nullable
   public SentryOptions.ProfilesSamplerCallback getProfilesSampler() {
      return this.profilesSampler;
   }

   public void setProfilesSampler(@Nullable SentryOptions.ProfilesSamplerCallback var1) {
      this.profilesSampler = var1;
   }

   @Nullable
   public Double getProfilesSampleRate() {
      return this.profilesSampleRate;
   }

   public void setProfilesSampleRate(@Nullable Double var1) {
      if (!SampleRateUtils.isValidProfilesSampleRate(var1)) {
         throw new IllegalArgumentException("The value " + var1 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
      }

      this.profilesSampleRate = var1;
   }

   @Nullable
   public String getProfilingTracesDirPath() {
      String var1 = this.getCacheDirPath();
      return var1 == null ? null : new File(var1, "profiling_traces").getAbsolutePath();
   }

   @Deprecated
   @NotNull
   public List<String> getTracingOrigins() {
      return this.getTracePropagationTargets();
   }

   @Deprecated
   public void addTracingOrigin(@NotNull String var1) {
      if (this.tracePropagationTargets == null) {
         this.tracePropagationTargets = new CopyOnWriteArrayList<>();
      }

      if (!var1.isEmpty()) {
         this.tracePropagationTargets.add(var1);
      }
   }

   @Deprecated
   @ApiStatus.Internal
   public void setTracingOrigins(@Nullable List<String> var1) {
      this.setTracePropagationTargets(var1);
   }

   @NotNull
   public List<String> getTracePropagationTargets() {
      return this.tracePropagationTargets == null ? this.defaultTracePropagationTargets : this.tracePropagationTargets;
   }

   @ApiStatus.Internal
   public void setTracePropagationTargets(@Nullable List<String> var1) {
      if (var1 == null) {
         this.tracePropagationTargets = null;
      } else {
         ArrayList var2 = new ArrayList();

         for (String var4 : var1) {
            if (!var4.isEmpty()) {
               var2.add(var4);
            }
         }

         this.tracePropagationTargets = var2;
      }
   }

   @Nullable
   public String getProguardUuid() {
      return this.proguardUuid;
   }

   public void setProguardUuid(@Nullable String var1) {
      this.proguardUuid = var1;
   }

   public void addBundleId(@Nullable String var1) {
      if (var1 != null) {
         String var2 = var1.trim();
         if (!var2.isEmpty()) {
            this.bundleIds.add(var2);
         }
      }
   }

   @NotNull
   public Set<String> getBundleIds() {
      return this.bundleIds;
   }

   @NotNull
   public List<String> getContextTags() {
      return this.contextTags;
   }

   public void addContextTag(@NotNull String var1) {
      this.contextTags.add(var1);
   }

   @Nullable
   public Long getIdleTimeout() {
      return this.idleTimeout;
   }

   public void setIdleTimeout(@Nullable Long var1) {
      this.idleTimeout = var1;
   }

   public boolean isSendClientReports() {
      return this.sendClientReports;
   }

   public void setSendClientReports(boolean var1) {
      this.sendClientReports = var1;
      if (var1) {
         this.clientReportRecorder = new ClientReportRecorder(this);
      } else {
         this.clientReportRecorder = new NoOpClientReportRecorder();
      }
   }

   public boolean isEnableUserInteractionTracing() {
      return this.enableUserInteractionTracing;
   }

   public void setEnableUserInteractionTracing(boolean var1) {
      this.enableUserInteractionTracing = var1;
   }

   public boolean isEnableUserInteractionBreadcrumbs() {
      return this.enableUserInteractionBreadcrumbs;
   }

   public void setEnableUserInteractionBreadcrumbs(boolean var1) {
      this.enableUserInteractionBreadcrumbs = var1;
   }

   public void setInstrumenter(@NotNull Instrumenter var1) {
      this.instrumenter = var1;
   }

   @NotNull
   public Instrumenter getInstrumenter() {
      return this.instrumenter;
   }

   @ApiStatus.Internal
   @NotNull
   public IClientReportRecorder getClientReportRecorder() {
      return this.clientReportRecorder;
   }

   @ApiStatus.Internal
   @NotNull
   public IModulesLoader getModulesLoader() {
      return this.modulesLoader;
   }

   @ApiStatus.Internal
   public void setModulesLoader(@Nullable IModulesLoader var1) {
      this.modulesLoader = var1 != null ? var1 : NoOpModulesLoader.getInstance();
   }

   @ApiStatus.Internal
   @NotNull
   public IDebugMetaLoader getDebugMetaLoader() {
      return this.debugMetaLoader;
   }

   @ApiStatus.Internal
   public void setDebugMetaLoader(@Nullable IDebugMetaLoader var1) {
      this.debugMetaLoader = var1 != null ? var1 : NoOpDebugMetaLoader.getInstance();
   }

   public List<GestureTargetLocator> getGestureTargetLocators() {
      return this.gestureTargetLocators;
   }

   public void setGestureTargetLocators(@NotNull List<GestureTargetLocator> var1) {
      this.gestureTargetLocators.clear();
      this.gestureTargetLocators.addAll(var1);
   }

   @NotNull
   public final List<ViewHierarchyExporter> getViewHierarchyExporters() {
      return this.viewHierarchyExporters;
   }

   public void setViewHierarchyExporters(@NotNull List<ViewHierarchyExporter> var1) {
      this.viewHierarchyExporters.clear();
      this.viewHierarchyExporters.addAll(var1);
   }

   @NotNull
   public IMainThreadChecker getMainThreadChecker() {
      return this.mainThreadChecker;
   }

   public void setMainThreadChecker(@NotNull IMainThreadChecker var1) {
      this.mainThreadChecker = var1;
   }

   @ApiStatus.Internal
   @NotNull
   public TransactionPerformanceCollector getTransactionPerformanceCollector() {
      return this.transactionPerformanceCollector;
   }

   @ApiStatus.Internal
   public void setTransactionPerformanceCollector(@NotNull TransactionPerformanceCollector var1) {
      this.transactionPerformanceCollector = var1;
   }

   public boolean isEnableTimeToFullDisplayTracing() {
      return this.enableTimeToFullDisplayTracing;
   }

   public void setEnableTimeToFullDisplayTracing(boolean var1) {
      this.enableTimeToFullDisplayTracing = var1;
   }

   @ApiStatus.Internal
   @NotNull
   public FullyDisplayedReporter getFullyDisplayedReporter() {
      return this.fullyDisplayedReporter;
   }

   @ApiStatus.Internal
   @TestOnly
   public void setFullyDisplayedReporter(@NotNull FullyDisplayedReporter var1) {
      this.fullyDisplayedReporter = var1;
   }

   public boolean isTraceOptionsRequests() {
      return this.traceOptionsRequests;
   }

   public void setTraceOptionsRequests(boolean var1) {
      this.traceOptionsRequests = var1;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }

   public boolean isEnablePrettySerializationOutput() {
      return this.enablePrettySerializationOutput;
   }

   public boolean isSendModules() {
      return this.sendModules;
   }

   public void setEnablePrettySerializationOutput(boolean var1) {
      this.enablePrettySerializationOutput = var1;
   }

   public boolean isEnableAppStartProfiling() {
      return this.isProfilingEnabled() && this.enableAppStartProfiling;
   }

   public void setEnableAppStartProfiling(boolean var1) {
      this.enableAppStartProfiling = var1;
   }

   public void setSendModules(boolean var1) {
      this.sendModules = var1;
   }

   @ApiStatus.Experimental
   public void setIgnoredCheckIns(@Nullable List<String> var1) {
      if (var1 == null) {
         this.ignoredCheckIns = null;
      } else {
         ArrayList var2 = new ArrayList();

         for (String var4 : var1) {
            if (!var4.isEmpty()) {
               var2.add(var4);
            }
         }

         this.ignoredCheckIns = var2;
      }
   }

   @ApiStatus.Experimental
   @Nullable
   public List<String> getIgnoredCheckIns() {
      return this.ignoredCheckIns;
   }

   @ApiStatus.Internal
   @NotNull
   public SentryDateProvider getDateProvider() {
      return this.dateProvider.getValue();
   }

   @ApiStatus.Internal
   public void setDateProvider(@NotNull SentryDateProvider var1) {
      this.dateProvider.setValue(var1);
   }

   @ApiStatus.Internal
   public void addPerformanceCollector(@NotNull IPerformanceCollector var1) {
      this.performanceCollectors.add(var1);
   }

   @ApiStatus.Internal
   @NotNull
   public List<IPerformanceCollector> getPerformanceCollectors() {
      return this.performanceCollectors;
   }

   @NotNull
   public IConnectionStatusProvider getConnectionStatusProvider() {
      return this.connectionStatusProvider;
   }

   public void setConnectionStatusProvider(@NotNull IConnectionStatusProvider var1) {
      this.connectionStatusProvider = var1;
   }

   @ApiStatus.Internal
   @NotNull
   public IBackpressureMonitor getBackpressureMonitor() {
      return this.backpressureMonitor;
   }

   @ApiStatus.Internal
   public void setBackpressureMonitor(@NotNull IBackpressureMonitor var1) {
      this.backpressureMonitor = var1;
   }

   @ApiStatus.Experimental
   public void setEnableBackpressureHandling(boolean var1) {
      this.enableBackpressureHandling = var1;
   }

   @ApiStatus.Internal
   public int getProfilingTracesHz() {
      return this.profilingTracesHz;
   }

   @ApiStatus.Internal
   public void setProfilingTracesHz(int var1) {
      this.profilingTracesHz = var1;
   }

   @ApiStatus.Experimental
   public boolean isEnableBackpressureHandling() {
      return this.enableBackpressureHandling;
   }

   @ApiStatus.Internal
   public long getSessionFlushTimeoutMillis() {
      return this.sessionFlushTimeoutMillis;
   }

   @ApiStatus.Internal
   public void setSessionFlushTimeoutMillis(long var1) {
      this.sessionFlushTimeoutMillis = var1;
   }

   @ApiStatus.Internal
   @Nullable
   public SentryOptions.BeforeEnvelopeCallback getBeforeEnvelopeCallback() {
      return this.beforeEnvelopeCallback;
   }

   @ApiStatus.Internal
   public void setBeforeEnvelopeCallback(@Nullable SentryOptions.BeforeEnvelopeCallback var1) {
      this.beforeEnvelopeCallback = var1;
   }

   @ApiStatus.Experimental
   @Nullable
   public String getSpotlightConnectionUrl() {
      return this.spotlightConnectionUrl;
   }

   @ApiStatus.Experimental
   public void setSpotlightConnectionUrl(@Nullable String var1) {
      this.spotlightConnectionUrl = var1;
   }

   @ApiStatus.Experimental
   public boolean isEnableSpotlight() {
      return this.enableSpotlight;
   }

   @ApiStatus.Experimental
   public void setEnableSpotlight(boolean var1) {
      this.enableSpotlight = var1;
   }

   public boolean isEnableScopePersistence() {
      return this.enableScopePersistence;
   }

   public void setEnableScopePersistence(boolean var1) {
      this.enableScopePersistence = var1;
   }

   @ApiStatus.Experimental
   public boolean isEnableMetrics() {
      return this.enableMetrics;
   }

   @ApiStatus.Experimental
   public void setEnableMetrics(boolean var1) {
      this.enableMetrics = var1;
   }

   @ApiStatus.Experimental
   public boolean isEnableSpanLocalMetricAggregation() {
      return this.isEnableMetrics() && this.enableSpanLocalMetricAggregation;
   }

   @ApiStatus.Experimental
   public void setEnableSpanLocalMetricAggregation(boolean var1) {
      this.enableSpanLocalMetricAggregation = var1;
   }

   @ApiStatus.Experimental
   public boolean isEnableDefaultTagsForMetrics() {
      return this.isEnableMetrics() && this.enableDefaultTagsForMetrics;
   }

   @ApiStatus.Experimental
   public void setEnableDefaultTagsForMetrics(boolean var1) {
      this.enableDefaultTagsForMetrics = var1;
   }

   @ApiStatus.Experimental
   @Nullable
   public SentryOptions.BeforeEmitMetricCallback getBeforeEmitMetricCallback() {
      return this.beforeEmitMetricCallback;
   }

   @ApiStatus.Experimental
   public void setBeforeEmitMetricCallback(@Nullable SentryOptions.BeforeEmitMetricCallback var1) {
      this.beforeEmitMetricCallback = var1;
   }

   @Nullable
   public SentryOptions.Cron getCron() {
      return this.cron;
   }

   @ApiStatus.Experimental
   public void setCron(@Nullable SentryOptions.Cron var1) {
      this.cron = var1;
   }

   @NotNull
   public ExperimentalOptions getExperimental() {
      return this.experimental;
   }

   @NotNull
   public ReplayController getReplayController() {
      return this.replayController;
   }

   public void setReplayController(@Nullable ReplayController var1) {
      this.replayController = var1 != null ? var1 : NoOpReplayController.getInstance();
   }

   @ApiStatus.Experimental
   public boolean isEnableScreenTracking() {
      return this.enableScreenTracking;
   }

   @ApiStatus.Experimental
   public void setEnableScreenTracking(boolean var1) {
      this.enableScreenTracking = var1;
   }

   void loadLazyFields() {
      this.getSerializer();
      this.retrieveParsedDsn();
      this.getEnvelopeReader();
      this.getDateProvider();
   }

   @ApiStatus.Internal
   @NotNull
   public static SentryOptions empty() {
      return new SentryOptions(true);
   }

   public SentryOptions() {
      this(false);
   }

   private SentryOptions(boolean var1) {
      this.experimental = new ExperimentalOptions(var1);
      if (!var1) {
         this.executorService = new SentryExecutorService();
         this.integrations.add(new UncaughtExceptionHandlerIntegration());
         this.integrations.add(new ShutdownHookIntegration());
         this.integrations.add(new SpotlightIntegration());
         this.eventProcessors.add(new MainEventProcessor(this));
         this.eventProcessors.add(new DuplicateEventDetectionEventProcessor(this));
         if (Platform.isJvm()) {
            this.eventProcessors.add(new SentryRuntimeEventProcessor());
         }

         this.setSentryClientName("sentry.java/7.18.1");
         this.setSdkVersion(this.createSdkVersion());
         this.addPackageInfo();
      }
   }

   public void merge(@NotNull ExternalOptions var1) {
      if (var1.getDsn() != null) {
         this.setDsn(var1.getDsn());
      }

      if (var1.getEnvironment() != null) {
         this.setEnvironment(var1.getEnvironment());
      }

      if (var1.getRelease() != null) {
         this.setRelease(var1.getRelease());
      }

      if (var1.getDist() != null) {
         this.setDist(var1.getDist());
      }

      if (var1.getServerName() != null) {
         this.setServerName(var1.getServerName());
      }

      if (var1.getProxy() != null) {
         this.setProxy(var1.getProxy());
      }

      if (var1.getEnableUncaughtExceptionHandler() != null) {
         this.setEnableUncaughtExceptionHandler(var1.getEnableUncaughtExceptionHandler());
      }

      if (var1.getPrintUncaughtStackTrace() != null) {
         this.setPrintUncaughtStackTrace(var1.getPrintUncaughtStackTrace());
      }

      if (var1.getEnableTracing() != null) {
         this.setEnableTracing(var1.getEnableTracing());
      }

      if (var1.getTracesSampleRate() != null) {
         this.setTracesSampleRate(var1.getTracesSampleRate());
      }

      if (var1.getProfilesSampleRate() != null) {
         this.setProfilesSampleRate(var1.getProfilesSampleRate());
      }

      if (var1.getDebug() != null) {
         this.setDebug(var1.getDebug());
      }

      if (var1.getEnableDeduplication() != null) {
         this.setEnableDeduplication(var1.getEnableDeduplication());
      }

      if (var1.getSendClientReports() != null) {
         this.setSendClientReports(var1.getSendClientReports());
      }

      HashMap var2 = new HashMap<>(var1.getTags());

      for (Entry var4 : var2.entrySet()) {
         this.tags.put((String)var4.getKey(), (String)var4.getValue());
      }

      for (String var5 : new ArrayList<>(var1.getInAppIncludes())) {
         this.addInAppInclude(var5);
      }

      for (String var6 : new ArrayList<>(var1.getInAppExcludes())) {
         this.addInAppExclude(var6);
      }

      for (Class var15 : new HashSet<>(var1.getIgnoredExceptionsForType())) {
         this.addIgnoredExceptionForType(var15);
      }

      if (var1.getTracePropagationTargets() != null) {
         ArrayList var13 = new ArrayList<>(var1.getTracePropagationTargets());
         this.setTracePropagationTargets(var13);
      }

      for (String var7 : new ArrayList<>(var1.getContextTags())) {
         this.addContextTag(var7);
      }

      if (var1.getProguardUuid() != null) {
         this.setProguardUuid(var1.getProguardUuid());
      }

      if (var1.getIdleTimeout() != null) {
         this.setIdleTimeout(var1.getIdleTimeout());
      }

      for (String var19 : var1.getBundleIds()) {
         this.addBundleId(var19);
      }

      if (var1.isEnabled() != null) {
         this.setEnabled(var1.isEnabled());
      }

      if (var1.isEnablePrettySerializationOutput() != null) {
         this.setEnablePrettySerializationOutput(var1.isEnablePrettySerializationOutput());
      }

      if (var1.isSendModules() != null) {
         this.setSendModules(var1.isSendModules());
      }

      if (var1.getIgnoredCheckIns() != null) {
         ArrayList var18 = new ArrayList<>(var1.getIgnoredCheckIns());
         this.setIgnoredCheckIns(var18);
      }

      if (var1.isEnableBackpressureHandling() != null) {
         this.setEnableBackpressureHandling(var1.isEnableBackpressureHandling());
      }

      if (var1.getCron() != null) {
         if (this.getCron() == null) {
            this.setCron(var1.getCron());
         } else {
            if (var1.getCron().getDefaultCheckinMargin() != null) {
               this.getCron().setDefaultCheckinMargin(var1.getCron().getDefaultCheckinMargin());
            }

            if (var1.getCron().getDefaultMaxRuntime() != null) {
               this.getCron().setDefaultMaxRuntime(var1.getCron().getDefaultMaxRuntime());
            }

            if (var1.getCron().getDefaultTimezone() != null) {
               this.getCron().setDefaultTimezone(var1.getCron().getDefaultTimezone());
            }

            if (var1.getCron().getDefaultFailureIssueThreshold() != null) {
               this.getCron().setDefaultFailureIssueThreshold(var1.getCron().getDefaultFailureIssueThreshold());
            }

            if (var1.getCron().getDefaultRecoveryThreshold() != null) {
               this.getCron().setDefaultRecoveryThreshold(var1.getCron().getDefaultRecoveryThreshold());
            }
         }
      }
   }

   @NotNull
   private SdkVersion createSdkVersion() {
      String var1 = "7.18.1";
      SdkVersion var2 = new SdkVersion("sentry.java", "7.18.1");
      var2.setVersion("7.18.1");
      return var2;
   }

   private void addPackageInfo() {
      SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry", "7.18.1");
   }

   public interface BeforeBreadcrumbCallback {
      @Nullable
      Breadcrumb execute(@NotNull Breadcrumb var1, @NotNull Hint var2);
   }

   @ApiStatus.Experimental
   public interface BeforeEmitMetricCallback {
      boolean execute(@NotNull String var1, @Nullable Map<String, String> var2);
   }

   @ApiStatus.Internal
   public interface BeforeEnvelopeCallback {
      void execute(@NotNull SentryEnvelope var1, @Nullable Hint var2);
   }

   public interface BeforeSendCallback {
      @Nullable
      SentryEvent execute(@NotNull SentryEvent var1, @NotNull Hint var2);
   }

   public interface BeforeSendReplayCallback {
      @Nullable
      SentryReplayEvent execute(@NotNull SentryReplayEvent var1, @NotNull Hint var2);
   }

   public interface BeforeSendTransactionCallback {
      @Nullable
      SentryTransaction execute(@NotNull SentryTransaction var1, @NotNull Hint var2);
   }

   public static final class Cron {
      @Nullable
      private Long defaultCheckinMargin;
      @Nullable
      private Long defaultMaxRuntime;
      @Nullable
      private String defaultTimezone;
      @Nullable
      private Long defaultFailureIssueThreshold;
      @Nullable
      private Long defaultRecoveryThreshold;

      @Nullable
      public Long getDefaultCheckinMargin() {
         return this.defaultCheckinMargin;
      }

      public void setDefaultCheckinMargin(@Nullable Long var1) {
         this.defaultCheckinMargin = var1;
      }

      @Nullable
      public Long getDefaultMaxRuntime() {
         return this.defaultMaxRuntime;
      }

      public void setDefaultMaxRuntime(@Nullable Long var1) {
         this.defaultMaxRuntime = var1;
      }

      @Nullable
      public String getDefaultTimezone() {
         return this.defaultTimezone;
      }

      public void setDefaultTimezone(@Nullable String var1) {
         this.defaultTimezone = var1;
      }

      @Nullable
      public Long getDefaultFailureIssueThreshold() {
         return this.defaultFailureIssueThreshold;
      }

      public void setDefaultFailureIssueThreshold(@Nullable Long var1) {
         this.defaultFailureIssueThreshold = var1;
      }

      @Nullable
      public Long getDefaultRecoveryThreshold() {
         return this.defaultRecoveryThreshold;
      }

      public void setDefaultRecoveryThreshold(@Nullable Long var1) {
         this.defaultRecoveryThreshold = var1;
      }
   }

   public interface ProfilesSamplerCallback {
      @Nullable
      Double sample(@NotNull SamplingContext var1);
   }

   public static final class Proxy {
      @Nullable
      private String host;
      @Nullable
      private String port;
      @Nullable
      private String user;
      @Nullable
      private String pass;
      @Nullable
      private Type type;

      public Proxy() {
         this(null, null, null, null, null);
      }

      public Proxy(@Nullable String var1, @Nullable String var2) {
         this(var1, var2, null, null, null);
      }

      public Proxy(@Nullable String var1, @Nullable String var2, @Nullable Type var3) {
         this(var1, var2, var3, null, null);
      }

      public Proxy(@Nullable String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4) {
         this(var1, var2, null, var3, var4);
      }

      public Proxy(@Nullable String var1, @Nullable String var2, @Nullable Type var3, @Nullable String var4, @Nullable String var5) {
         this.host = var1;
         this.port = var2;
         this.type = var3;
         this.user = var4;
         this.pass = var5;
      }

      @Nullable
      public String getHost() {
         return this.host;
      }

      public void setHost(@Nullable String var1) {
         this.host = var1;
      }

      @Nullable
      public String getPort() {
         return this.port;
      }

      public void setPort(@Nullable String var1) {
         this.port = var1;
      }

      @Nullable
      public String getUser() {
         return this.user;
      }

      public void setUser(@Nullable String var1) {
         this.user = var1;
      }

      @Nullable
      public String getPass() {
         return this.pass;
      }

      public void setPass(@Nullable String var1) {
         this.pass = var1;
      }

      @Nullable
      public Type getType() {
         return this.type;
      }

      public void setType(@Nullable Type var1) {
         this.type = var1;
      }
   }

   public enum RequestSize {
      NONE,
      SMALL,
      MEDIUM,
      ALWAYS;
   }

   public interface TracesSamplerCallback {
      @Nullable
      Double sample(@NotNull SamplingContext var1);
   }
}
