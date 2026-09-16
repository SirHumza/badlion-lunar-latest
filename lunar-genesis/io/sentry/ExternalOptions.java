package io.sentry;

import io.sentry.config.PropertiesProvider;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ExternalOptions {
   private static final String PROXY_PORT_DEFAULT = "80";
   @Nullable
   private String dsn;
   @Nullable
   private String environment;
   @Nullable
   private String release;
   @Nullable
   private String dist;
   @Nullable
   private String serverName;
   @Nullable
   private Boolean enableUncaughtExceptionHandler;
   @Nullable
   private Boolean debug;
   @Nullable
   private Boolean enableDeduplication;
   @Nullable
   private Boolean enableTracing;
   @Nullable
   private Double tracesSampleRate;
   @Nullable
   private Double profilesSampleRate;
   @Nullable
   private SentryOptions.RequestSize maxRequestBodySize;
   @NotNull
   private final Map<String, String> tags = new ConcurrentHashMap<>();
   @Nullable
   private SentryOptions.Proxy proxy;
   @NotNull
   private final List<String> inAppExcludes = new CopyOnWriteArrayList<>();
   @NotNull
   private final List<String> inAppIncludes = new CopyOnWriteArrayList<>();
   @Nullable
   private List<String> tracePropagationTargets = null;
   @NotNull
   private final List<String> contextTags = new CopyOnWriteArrayList<>();
   @Nullable
   private String proguardUuid;
   @Nullable
   private Long idleTimeout;
   @NotNull
   private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet<>();
   @Nullable
   private Boolean printUncaughtStackTrace;
   @Nullable
   private Boolean sendClientReports;
   @NotNull
   private Set<String> bundleIds = new CopyOnWriteArraySet<>();
   @Nullable
   private Boolean enabled;
   @Nullable
   private Boolean enablePrettySerializationOutput;
   @Nullable
   private List<String> ignoredCheckIns;
   @Nullable
   private Boolean sendModules;
   @Nullable
   private Boolean enableBackpressureHandling;
   @Nullable
   private SentryOptions.Cron cron;

   @NotNull
   public static ExternalOptions from(@NotNull PropertiesProvider var0, @NotNull ILogger var1) {
      ExternalOptions var2 = new ExternalOptions();
      var2.setDsn(var0.getProperty("dsn"));
      var2.setEnvironment(var0.getProperty("environment"));
      var2.setRelease(var0.getProperty("release"));
      var2.setDist(var0.getProperty("dist"));
      var2.setServerName(var0.getProperty("servername"));
      var2.setEnableUncaughtExceptionHandler(var0.getBooleanProperty("uncaught.handler.enabled"));
      var2.setPrintUncaughtStackTrace(var0.getBooleanProperty("uncaught.handler.print-stacktrace"));
      var2.setEnableTracing(var0.getBooleanProperty("enable-tracing"));
      var2.setTracesSampleRate(var0.getDoubleProperty("traces-sample-rate"));
      var2.setProfilesSampleRate(var0.getDoubleProperty("profiles-sample-rate"));
      var2.setDebug(var0.getBooleanProperty("debug"));
      var2.setEnableDeduplication(var0.getBooleanProperty("enable-deduplication"));
      var2.setSendClientReports(var0.getBooleanProperty("send-client-reports"));
      String var3 = var0.getProperty("max-request-body-size");
      if (var3 != null) {
         var2.setMaxRequestBodySize(SentryOptions.RequestSize.valueOf(var3.toUpperCase(Locale.ROOT)));
      }

      Map var4 = var0.getMap("tags");

      for (Entry var6 : var4.entrySet()) {
         var2.setTag((String)var6.getKey(), (String)var6.getValue());
      }

      String var17 = var0.getProperty("proxy.host");
      String var18 = var0.getProperty("proxy.user");
      String var7 = var0.getProperty("proxy.pass");
      String var8 = var0.getProperty("proxy.port", "80");
      if (var17 != null) {
         var2.setProxy(new SentryOptions.Proxy(var17, var8, var18, var7));
      }

      for (String var10 : var0.getList("in-app-includes")) {
         var2.addInAppInclude(var10);
      }

      for (String var21 : var0.getList("in-app-excludes")) {
         var2.addInAppExclude(var21);
      }

      List var20 = null;
      if (var0.getProperty("trace-propagation-targets") != null) {
         var20 = var0.getList("trace-propagation-targets");
      }

      if (var20 == null && var0.getProperty("tracing-origins") != null) {
         var20 = var0.getList("tracing-origins");
      }

      if (var20 != null) {
         for (String var11 : var20) {
            var2.addTracePropagationTarget(var11);
         }
      }

      for (String var27 : var0.getList("context-tags")) {
         var2.addContextTag(var27);
      }

      var2.setProguardUuid(var0.getProperty("proguard-uuid"));

      for (String var28 : var0.getList("bundle-ids")) {
         var2.addBundleId(var28);
      }

      var2.setIdleTimeout(var0.getLongProperty("idle-timeout"));
      var2.setEnabled(var0.getBooleanProperty("enabled"));
      var2.setEnablePrettySerializationOutput(var0.getBooleanProperty("enable-pretty-serialization-output"));
      var2.setSendModules(var0.getBooleanProperty("send-modules"));
      var2.setIgnoredCheckIns(var0.getList("ignored-checkins"));
      var2.setEnableBackpressureHandling(var0.getBooleanProperty("enable-backpressure-handling"));

      for (String var29 : var0.getList("ignored-exceptions-for-type")) {
         try {
            Class var12 = Class.forName(var29);
            if (Throwable.class.isAssignableFrom(var12)) {
               var2.addIgnoredExceptionForType(var12);
            } else {
               var1.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", var29, var29);
            }
         } catch (ClassNotFoundException var16) {
            var1.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", var29, var29);
         }
      }

      Long var26 = var0.getLongProperty("cron.default-checkin-margin");
      Long var30 = var0.getLongProperty("cron.default-max-runtime");
      String var31 = var0.getProperty("cron.default-timezone");
      Long var13 = var0.getLongProperty("cron.default-failure-issue-threshold");
      Long var14 = var0.getLongProperty("cron.default-recovery-threshold");
      if (var26 != null || var30 != null || var31 != null || var13 != null || var14 != null) {
         SentryOptions.Cron var15 = new SentryOptions.Cron();
         var15.setDefaultCheckinMargin(var26);
         var15.setDefaultMaxRuntime(var30);
         var15.setDefaultTimezone(var31);
         var15.setDefaultFailureIssueThreshold(var13);
         var15.setDefaultRecoveryThreshold(var14);
         var2.setCron(var15);
      }

      return var2;
   }

   @Nullable
   public String getDsn() {
      return this.dsn;
   }

   public void setDsn(@Nullable String var1) {
      this.dsn = var1;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment;
   }

   public void setEnvironment(@Nullable String var1) {
      this.environment = var1;
   }

   @Nullable
   public String getRelease() {
      return this.release;
   }

   public void setRelease(@Nullable String var1) {
      this.release = var1;
   }

   @Nullable
   public String getDist() {
      return this.dist;
   }

   public void setDist(@Nullable String var1) {
      this.dist = var1;
   }

   @Nullable
   public String getServerName() {
      return this.serverName;
   }

   public void setServerName(@Nullable String var1) {
      this.serverName = var1;
   }

   @Nullable
   public Boolean getEnableUncaughtExceptionHandler() {
      return this.enableUncaughtExceptionHandler;
   }

   public void setEnableUncaughtExceptionHandler(@Nullable Boolean var1) {
      this.enableUncaughtExceptionHandler = var1;
   }

   @Deprecated
   @Nullable
   public List<String> getTracingOrigins() {
      return this.tracePropagationTargets;
   }

   @Nullable
   public List<String> getTracePropagationTargets() {
      return this.tracePropagationTargets;
   }

   @Nullable
   public Boolean getDebug() {
      return this.debug;
   }

   public void setDebug(@Nullable Boolean var1) {
      this.debug = var1;
   }

   @Nullable
   public Boolean getEnableDeduplication() {
      return this.enableDeduplication;
   }

   public void setEnableDeduplication(@Nullable Boolean var1) {
      this.enableDeduplication = var1;
   }

   @Nullable
   public Boolean getEnableTracing() {
      return this.enableTracing;
   }

   public void setEnableTracing(@Nullable Boolean var1) {
      this.enableTracing = var1;
   }

   @Nullable
   public Double getTracesSampleRate() {
      return this.tracesSampleRate;
   }

   public void setTracesSampleRate(@Nullable Double var1) {
      this.tracesSampleRate = var1;
   }

   @Nullable
   public Double getProfilesSampleRate() {
      return this.profilesSampleRate;
   }

   public void setProfilesSampleRate(@Nullable Double var1) {
      this.profilesSampleRate = var1;
   }

   @Nullable
   public SentryOptions.RequestSize getMaxRequestBodySize() {
      return this.maxRequestBodySize;
   }

   public void setMaxRequestBodySize(@Nullable SentryOptions.RequestSize var1) {
      this.maxRequestBodySize = var1;
   }

   @NotNull
   public Map<String, String> getTags() {
      return this.tags;
   }

   @Nullable
   public SentryOptions.Proxy getProxy() {
      return this.proxy;
   }

   public void setProxy(@Nullable SentryOptions.Proxy var1) {
      this.proxy = var1;
   }

   @NotNull
   public List<String> getInAppExcludes() {
      return this.inAppExcludes;
   }

   @NotNull
   public List<String> getInAppIncludes() {
      return this.inAppIncludes;
   }

   @NotNull
   public List<String> getContextTags() {
      return this.contextTags;
   }

   @Nullable
   public String getProguardUuid() {
      return this.proguardUuid;
   }

   public void setProguardUuid(@Nullable String var1) {
      this.proguardUuid = var1;
   }

   @NotNull
   public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
      return this.ignoredExceptionsForType;
   }

   public void addInAppInclude(@NotNull String var1) {
      this.inAppIncludes.add(var1);
   }

   public void addInAppExclude(@NotNull String var1) {
      this.inAppExcludes.add(var1);
   }

   @Deprecated
   public void addTracingOrigin(@NotNull String var1) {
      this.addTracePropagationTarget(var1);
   }

   public void addTracePropagationTarget(@NotNull String var1) {
      if (this.tracePropagationTargets == null) {
         this.tracePropagationTargets = new CopyOnWriteArrayList<>();
      }

      if (!var1.isEmpty()) {
         this.tracePropagationTargets.add(var1);
      }
   }

   public void addContextTag(@NotNull String var1) {
      this.contextTags.add(var1);
   }

   public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> var1) {
      this.ignoredExceptionsForType.add(var1);
   }

   public void setTag(@NotNull String var1, @NotNull String var2) {
      this.tags.put(var1, var2);
   }

   @Nullable
   public Boolean getPrintUncaughtStackTrace() {
      return this.printUncaughtStackTrace;
   }

   public void setPrintUncaughtStackTrace(@Nullable Boolean var1) {
      this.printUncaughtStackTrace = var1;
   }

   @Nullable
   public Long getIdleTimeout() {
      return this.idleTimeout;
   }

   public void setIdleTimeout(@Nullable Long var1) {
      this.idleTimeout = var1;
   }

   @Nullable
   public Boolean getSendClientReports() {
      return this.sendClientReports;
   }

   public void setSendClientReports(@Nullable Boolean var1) {
      this.sendClientReports = var1;
   }

   @NotNull
   public Set<String> getBundleIds() {
      return this.bundleIds;
   }

   public void addBundleId(@NotNull String var1) {
      this.bundleIds.add(var1);
   }

   @Nullable
   public Boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(@Nullable Boolean var1) {
      this.enabled = var1;
   }

   @Nullable
   public Boolean isEnablePrettySerializationOutput() {
      return this.enablePrettySerializationOutput;
   }

   public void setEnablePrettySerializationOutput(@Nullable Boolean var1) {
      this.enablePrettySerializationOutput = var1;
   }

   @Nullable
   public Boolean isSendModules() {
      return this.sendModules;
   }

   public void setSendModules(@Nullable Boolean var1) {
      this.sendModules = var1;
   }

   @ApiStatus.Experimental
   public void setIgnoredCheckIns(@Nullable List<String> var1) {
      this.ignoredCheckIns = var1;
   }

   @ApiStatus.Experimental
   @Nullable
   public List<String> getIgnoredCheckIns() {
      return this.ignoredCheckIns;
   }

   @ApiStatus.Experimental
   public void setEnableBackpressureHandling(@Nullable Boolean var1) {
      this.enableBackpressureHandling = var1;
   }

   @ApiStatus.Experimental
   @Nullable
   public Boolean isEnableBackpressureHandling() {
      return this.enableBackpressureHandling;
   }

   @ApiStatus.Experimental
   @Nullable
   public SentryOptions.Cron getCron() {
      return this.cron;
   }

   @ApiStatus.Experimental
   public void setCron(@Nullable SentryOptions.Cron var1) {
      this.cron = var1;
   }
}
