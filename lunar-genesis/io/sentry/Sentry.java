package io.sentry;

import io.sentry.backpressure.BackpressureMonitor;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.config.PropertiesProviderFactory;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.debugmeta.ResourcesDebugMetaLoader;
import io.sentry.internal.modules.CompositeModulesLoader;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.ManifestModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.modules.ResourcesModulesLoader;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.DebugMetaPropertiesApplier;
import io.sentry.util.FileUtils;
import io.sentry.util.Platform;
import io.sentry.util.thread.IMainThreadChecker;
import io.sentry.util.thread.MainThreadChecker;
import io.sentry.util.thread.NoOpMainThreadChecker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Sentry {
   @NotNull
   private static final ThreadLocal<IHub> currentHub = new ThreadLocal<>();
   @NotNull
   private static volatile IHub mainHub = NoOpHub.getInstance();
   private static final boolean GLOBAL_HUB_DEFAULT_MODE = false;
   private static volatile boolean globalHubMode = false;
   @ApiStatus.Internal
   @NotNull
   public static final String APP_START_PROFILING_CONFIG_FILE_NAME = "app_start_profiling_config";
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   private static final long classCreationTimestamp = System.currentTimeMillis();

   private Sentry() {
   }

   @ApiStatus.Internal
   @NotNull
   public static IHub getCurrentHub() {
      if (globalHubMode) {
         return mainHub;
      }

      IHub var0 = currentHub.get();
      if (var0 == null || var0 instanceof NoOpHub) {
         var0 = mainHub.clone();
         currentHub.set(var0);
      }

      return var0;
   }

   @ApiStatus.Internal
   @ApiStatus.Experimental
   @NotNull
   public static IHub cloneMainHub() {
      return globalHubMode ? mainHub : mainHub.clone();
   }

   @ApiStatus.Internal
   public static void setCurrentHub(@NotNull IHub var0) {
      currentHub.set(var0);
   }

   public static boolean isEnabled() {
      return getCurrentHub().isEnabled();
   }

   public static void init() {
      init(var0 -> var0.setEnableExternalConfiguration(true), false);
   }

   public static void init(@NotNull String var0) {
      init(var1 -> var1.setDsn(var0));
   }

   public static <T extends SentryOptions> void init(@NotNull OptionsContainer<T> var0, @NotNull Sentry.OptionsConfiguration<T> var1) {
      init(var0, var1, false);
   }

   public static <T extends SentryOptions> void init(@NotNull OptionsContainer<T> var0, @NotNull Sentry.OptionsConfiguration<T> var1, boolean var2) {
      SentryOptions var3 = (SentryOptions)var0.createInstance();
      applyOptionsConfiguration(var1, var3);
      init(var3, var2);
   }

   public static void init(@NotNull Sentry.OptionsConfiguration<SentryOptions> var0) {
      init(var0, false);
   }

   public static void init(@NotNull Sentry.OptionsConfiguration<SentryOptions> var0, boolean var1) {
      SentryOptions var2 = new SentryOptions();
      applyOptionsConfiguration(var0, var2);
      init(var2, var1);
   }

   private static <T extends SentryOptions> void applyOptionsConfiguration(Sentry.OptionsConfiguration<T> var0, T var1) {
      try {
         var0.configure(var1);
      } catch (Throwable var3) {
         var1.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", var3);
      }
   }

   @ApiStatus.Internal
   public static void init(@NotNull SentryOptions var0) {
      init(var0, false);
   }

   private static synchronized void init(@NotNull SentryOptions var0, boolean var1) {
      if (isEnabled()) {
         var0.getLogger().log(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.");
      }

      if (initConfigurations(var0)) {
         try {
            var0.getExecutorService().submit(() -> var0.loadLazyFields());
         } catch (RejectedExecutionException var5) {
            var0.getLogger().log(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", var5);
         }

         var0.getLogger().log(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(var1));
         globalHubMode = var1;
         IHub var2 = getCurrentHub();
         mainHub = new Hub(var0);
         currentHub.set(mainHub);
         var2.close(true);
         if (var0.getExecutorService().isClosed()) {
            var0.setExecutorService(new SentryExecutorService());
         }

         for (Integration var4 : var0.getIntegrations()) {
            var4.register(HubAdapter.getInstance(), var0);
         }

         notifyOptionsObservers(var0);
         finalizePreviousSession(var0, HubAdapter.getInstance());
         handleAppStartProfilingConfig(var0, var0.getExecutorService());
      }
   }

   private static void handleAppStartProfilingConfig(@NotNull SentryOptions var0, @NotNull ISentryExecutorService var1) {
      try {
         var1.submit(() -> {
            String var1x = var0.getCacheDirPathWithoutDsn();
            if (var1x != null) {
               File var2 = new File(var1x, "app_start_profiling_config");

               try {
                  FileUtils.deleteRecursively(var2);
                  if (!var0.isEnableAppStartProfiling()) {
                     return;
                  }

                  if (!var0.isTracingEnabled()) {
                     var0.getLogger().log(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.");
                     return;
                  }

                  if (var2.createNewFile()) {
                     TracesSamplingDecision var3x = sampleAppStartProfiling(var0);
                     SentryAppStartProfilingOptions var4 = new SentryAppStartProfilingOptions(var0, var3x);
                     FileOutputStream var5 = new FileOutputStream(var2);

                     try {
                        BufferedWriter var6 = new BufferedWriter(new OutputStreamWriter(var5, UTF_8));

                        try {
                           var0.getSerializer().serialize(var4, var6);
                        } catch (Throwable var11) {
                           try {
                              var6.close();
                           } catch (Throwable var10) {
                              var11.addSuppressed(var10);
                           }

                           throw var11;
                        }

                        var6.close();
                     } catch (Throwable var12) {
                        try {
                           var5.close();
                        } catch (Throwable var9) {
                           var12.addSuppressed(var9);
                        }

                        throw var12;
                     }

                     var5.close();
                  }
               } catch (Throwable var13) {
                  var0.getLogger().log(SentryLevel.ERROR, "Unable to create app start profiling config file. ", var13);
               }
            }
         });
      } catch (Throwable var3) {
         var0.getLogger()
            .log(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", var3);
      }
   }

   @NotNull
   private static TracesSamplingDecision sampleAppStartProfiling(@NotNull SentryOptions var0) {
      TransactionContext var1 = new TransactionContext("app.launch", "profile");
      var1.setForNextAppStart(true);
      SamplingContext var2 = new SamplingContext(var1, null);
      return new TracesSampler(var0).sample(var2);
   }

   private static void finalizePreviousSession(@NotNull SentryOptions var0, @NotNull IHub var1) {
      try {
         var0.getExecutorService().submit(new PreviousSessionFinalizer(var0, var1));
      } catch (Throwable var3) {
         var0.getLogger().log(SentryLevel.DEBUG, "Failed to finalize previous session.", var3);
      }
   }

   private static void notifyOptionsObservers(@NotNull SentryOptions var0) {
      try {
         var0.getExecutorService().submit(() -> {
            for (IOptionsObserver var2x : var0.getOptionsObservers()) {
               var2x.setRelease(var0.getRelease());
               var2x.setProguardUuid(var0.getProguardUuid());
               var2x.setSdkVersion(var0.getSdkVersion());
               var2x.setDist(var0.getDist());
               var2x.setEnvironment(var0.getEnvironment());
               var2x.setTags(var0.getTags());
               var2x.setReplayErrorSampleRate(var0.getExperimental().getSessionReplay().getOnErrorSampleRate());
            }
         });
      } catch (Throwable var2) {
         var0.getLogger().log(SentryLevel.DEBUG, "Failed to notify options observers.", var2);
      }
   }

   private static boolean initConfigurations(@NotNull SentryOptions var0) {
      if (var0.isEnableExternalConfiguration()) {
         var0.merge(ExternalOptions.from(PropertiesProviderFactory.create(), var0.getLogger()));
      }

      String var1 = var0.getDsn();
      if (var0.isEnabled() && (var1 == null || !var1.isEmpty())) {
         if (var1 == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
         }

         var0.retrieveParsedDsn();
         ILogger var2 = var0.getLogger();
         if (var0.isDebug() && var2 instanceof NoOpLogger) {
            var0.setLogger(new SystemOutLogger());
            var2 = var0.getLogger();
         }

         var2.log(SentryLevel.INFO, "Initializing SDK with DSN: '%s'", var0.getDsn());
         String var3 = var0.getOutboxPath();
         if (var3 != null) {
            File var4 = new File(var3);
            var4.mkdirs();
         } else {
            var2.log(SentryLevel.INFO, "No outbox dir path is defined in options.");
         }

         String var10 = var0.getCacheDirPath();
         if (var10 != null) {
            File var5 = new File(var10);
            var5.mkdirs();
            IEnvelopeCache var6 = var0.getEnvelopeDiskCache();
            if (var6 instanceof NoOpEnvelopeCache) {
               var0.setEnvelopeDiskCache(EnvelopeCache.create(var0));
            }
         }

         String var11 = var0.getProfilingTracesDirPath();
         if (var0.isProfilingEnabled() && var11 != null) {
            File var12 = new File(var11);
            var12.mkdirs();

            try {
               var0.getExecutorService().submit(() -> {
                  File[] var1x = var12.listFiles();
                  if (var1x != null) {
                     for (File var5x : var1x) {
                        if (var5x.lastModified() < classCreationTimestamp - TimeUnit.MINUTES.toMillis(5L)) {
                           FileUtils.deleteRecursively(var5x);
                        }
                     }
                  }
               });
            } catch (RejectedExecutionException var9) {
               var0.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", var9);
            }
         }

         IModulesLoader var13 = var0.getModulesLoader();
         if (!var0.isSendModules()) {
            var0.setModulesLoader(NoOpModulesLoader.getInstance());
         } else if (var13 instanceof NoOpModulesLoader) {
            var0.setModulesLoader(
               new CompositeModulesLoader(
                  Arrays.asList(new ManifestModulesLoader(var0.getLogger()), new ResourcesModulesLoader(var0.getLogger())), var0.getLogger()
               )
            );
         }

         if (var0.getDebugMetaLoader() instanceof NoOpDebugMetaLoader) {
            var0.setDebugMetaLoader(new ResourcesDebugMetaLoader(var0.getLogger()));
         }

         List var7 = var0.getDebugMetaLoader().loadDebugMeta();
         DebugMetaPropertiesApplier.applyToOptions(var0, var7);
         IMainThreadChecker var8 = var0.getMainThreadChecker();
         if (var8 instanceof NoOpMainThreadChecker) {
            var0.setMainThreadChecker(MainThreadChecker.getInstance());
         }

         if (var0.getPerformanceCollectors().isEmpty()) {
            var0.addPerformanceCollector(new JavaMemoryCollector());
         }

         if (var0.isEnableBackpressureHandling() && Platform.isJvm()) {
            var0.setBackpressureMonitor(new BackpressureMonitor(var0, HubAdapter.getInstance()));
            var0.getBackpressureMonitor().start();
         }

         return true;
      } else {
         close();
         return false;
      }
   }

   public static synchronized void close() {
      IHub var0 = getCurrentHub();
      mainHub = NoOpHub.getInstance();
      currentHub.remove();
      var0.close(false);
   }

   @NotNull
   public static SentryId captureEvent(@NotNull SentryEvent var0) {
      return getCurrentHub().captureEvent(var0);
   }

   @NotNull
   public static SentryId captureEvent(@NotNull SentryEvent var0, @NotNull ScopeCallback var1) {
      return getCurrentHub().captureEvent(var0, var1);
   }

   @NotNull
   public static SentryId captureEvent(@NotNull SentryEvent var0, @Nullable Hint var1) {
      return getCurrentHub().captureEvent(var0, var1);
   }

   @NotNull
   public static SentryId captureEvent(@NotNull SentryEvent var0, @Nullable Hint var1, @NotNull ScopeCallback var2) {
      return getCurrentHub().captureEvent(var0, var1, var2);
   }

   @NotNull
   public static SentryId captureMessage(@NotNull String var0) {
      return getCurrentHub().captureMessage(var0);
   }

   @NotNull
   public static SentryId captureMessage(@NotNull String var0, @NotNull ScopeCallback var1) {
      return getCurrentHub().captureMessage(var0, var1);
   }

   @NotNull
   public static SentryId captureMessage(@NotNull String var0, @NotNull SentryLevel var1) {
      return getCurrentHub().captureMessage(var0, var1);
   }

   @NotNull
   public static SentryId captureMessage(@NotNull String var0, @NotNull SentryLevel var1, @NotNull ScopeCallback var2) {
      return getCurrentHub().captureMessage(var0, var1, var2);
   }

   @NotNull
   public static SentryId captureException(@NotNull Throwable var0) {
      return getCurrentHub().captureException(var0);
   }

   @NotNull
   public static SentryId captureException(@NotNull Throwable var0, @NotNull ScopeCallback var1) {
      return getCurrentHub().captureException(var0, var1);
   }

   @NotNull
   public static SentryId captureException(@NotNull Throwable var0, @Nullable Hint var1) {
      return getCurrentHub().captureException(var0, var1);
   }

   @NotNull
   public static SentryId captureException(@NotNull Throwable var0, @Nullable Hint var1, @NotNull ScopeCallback var2) {
      return getCurrentHub().captureException(var0, var1, var2);
   }

   public static void captureUserFeedback(@NotNull UserFeedback var0) {
      getCurrentHub().captureUserFeedback(var0);
   }

   public static void addBreadcrumb(@NotNull Breadcrumb var0, @Nullable Hint var1) {
      getCurrentHub().addBreadcrumb(var0, var1);
   }

   public static void addBreadcrumb(@NotNull Breadcrumb var0) {
      getCurrentHub().addBreadcrumb(var0);
   }

   public static void addBreadcrumb(@NotNull String var0) {
      getCurrentHub().addBreadcrumb(var0);
   }

   public static void addBreadcrumb(@NotNull String var0, @NotNull String var1) {
      getCurrentHub().addBreadcrumb(var0, var1);
   }

   public static void setLevel(@Nullable SentryLevel var0) {
      getCurrentHub().setLevel(var0);
   }

   public static void setTransaction(@Nullable String var0) {
      getCurrentHub().setTransaction(var0);
   }

   public static void setUser(@Nullable User var0) {
      getCurrentHub().setUser(var0);
   }

   public static void setFingerprint(@NotNull List<String> var0) {
      getCurrentHub().setFingerprint(var0);
   }

   public static void clearBreadcrumbs() {
      getCurrentHub().clearBreadcrumbs();
   }

   public static void setTag(@NotNull String var0, @NotNull String var1) {
      getCurrentHub().setTag(var0, var1);
   }

   public static void removeTag(@NotNull String var0) {
      getCurrentHub().removeTag(var0);
   }

   public static void setExtra(@NotNull String var0, @NotNull String var1) {
      getCurrentHub().setExtra(var0, var1);
   }

   public static void removeExtra(@NotNull String var0) {
      getCurrentHub().removeExtra(var0);
   }

   @NotNull
   public static SentryId getLastEventId() {
      return getCurrentHub().getLastEventId();
   }

   public static void pushScope() {
      if (!globalHubMode) {
         getCurrentHub().pushScope();
      }
   }

   public static void popScope() {
      if (!globalHubMode) {
         getCurrentHub().popScope();
      }
   }

   public static void withScope(@NotNull ScopeCallback var0) {
      getCurrentHub().withScope(var0);
   }

   public static void configureScope(@NotNull ScopeCallback var0) {
      getCurrentHub().configureScope(var0);
   }

   public static void bindClient(@NotNull ISentryClient var0) {
      getCurrentHub().bindClient(var0);
   }

   public static boolean isHealthy() {
      return getCurrentHub().isHealthy();
   }

   public static void flush(long var0) {
      getCurrentHub().flush(var0);
   }

   public static void startSession() {
      getCurrentHub().startSession();
   }

   public static void endSession() {
      getCurrentHub().endSession();
   }

   @NotNull
   public static ITransaction startTransaction(@NotNull String var0, @NotNull String var1) {
      return getCurrentHub().startTransaction(var0, var1);
   }

   @NotNull
   public static ITransaction startTransaction(@NotNull String var0, @NotNull String var1, @NotNull TransactionOptions var2) {
      return getCurrentHub().startTransaction(var0, var1, var2);
   }

   @NotNull
   public static ITransaction startTransaction(@NotNull String var0, @NotNull String var1, @Nullable String var2, @NotNull TransactionOptions var3) {
      ITransaction var4 = getCurrentHub().startTransaction(var0, var1, var3);
      var4.setDescription(var2);
      return var4;
   }

   @NotNull
   public static ITransaction startTransaction(@NotNull TransactionContext var0) {
      return getCurrentHub().startTransaction(var0);
   }

   @NotNull
   public static ITransaction startTransaction(@NotNull TransactionContext var0, @NotNull TransactionOptions var1) {
      return getCurrentHub().startTransaction(var0, var1);
   }

   @Deprecated
   @Nullable
   public static SentryTraceHeader traceHeaders() {
      return getCurrentHub().traceHeaders();
   }

   @Nullable
   public static ISpan getSpan() {
      return globalHubMode && Platform.isAndroid() ? getCurrentHub().getTransaction() : getCurrentHub().getSpan();
   }

   @Nullable
   public static Boolean isCrashedLastRun() {
      return getCurrentHub().isCrashedLastRun();
   }

   public static void reportFullyDisplayed() {
      getCurrentHub().reportFullyDisplayed();
   }

   @Deprecated
   public static void reportFullDisplayed() {
      reportFullyDisplayed();
   }

   @NotNull
   @ApiStatus.Experimental
   public static MetricsApi metrics() {
      return getCurrentHub().metrics();
   }

   @Nullable
   public static TransactionContext continueTrace(@Nullable String var0, @Nullable List<String> var1) {
      return getCurrentHub().continueTrace(var0, var1);
   }

   @Nullable
   public static SentryTraceHeader getTraceparent() {
      return getCurrentHub().getTraceparent();
   }

   @Nullable
   public static BaggageHeader getBaggage() {
      return getCurrentHub().getBaggage();
   }

   @ApiStatus.Experimental
   @NotNull
   public static SentryId captureCheckIn(@NotNull CheckIn var0) {
      return getCurrentHub().captureCheckIn(var0);
   }

   public interface OptionsConfiguration<T extends SentryOptions> {
      void configure(@NotNull T var1);
   }
}
