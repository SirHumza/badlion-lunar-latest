package io.sentry;

import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Cached;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

@ApiStatus.Internal
public final class MainEventProcessor implements EventProcessor, Closeable {
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final SentryThreadFactory sentryThreadFactory;
   @NotNull
   private final SentryExceptionFactory sentryExceptionFactory;
   @Nullable
   private volatile HostnameCache hostnameCache = null;

   public MainEventProcessor(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "The SentryOptions is required.");
      SentryStackTraceFactory var2 = new SentryStackTraceFactory(this.options);
      this.sentryExceptionFactory = new SentryExceptionFactory(var2);
      this.sentryThreadFactory = new SentryThreadFactory(var2, this.options);
   }

   MainEventProcessor(@NotNull SentryOptions var1, @NotNull SentryThreadFactory var2, @NotNull SentryExceptionFactory var3) {
      this.options = Objects.requireNonNull(var1, "The SentryOptions is required.");
      this.sentryThreadFactory = Objects.requireNonNull(var2, "The SentryThreadFactory is required.");
      this.sentryExceptionFactory = Objects.requireNonNull(var3, "The SentryExceptionFactory is required.");
   }

   @NotNull
   @Override
   public SentryEvent process(@NotNull SentryEvent var1, @NotNull Hint var2) {
      this.setCommons(var1);
      this.setExceptions(var1);
      this.setDebugMeta(var1);
      this.setModules(var1);
      if (this.shouldApplyScopeData(var1, var2)) {
         this.processNonCachedEvent(var1);
         this.setThreads(var1, var2);
      }

      return var1;
   }

   private void setDebugMeta(@NotNull SentryBaseEvent var1) {
      ArrayList var2 = new ArrayList();
      if (this.options.getProguardUuid() != null) {
         DebugImage var3 = new DebugImage();
         var3.setType("proguard");
         var3.setUuid(this.options.getProguardUuid());
         var2.add(var3);
      }

      for (String var4 : this.options.getBundleIds()) {
         DebugImage var5 = new DebugImage();
         var5.setType("jvm");
         var5.setDebugId(var4);
         var2.add(var5);
      }

      if (!var2.isEmpty()) {
         DebugMeta var7 = var1.getDebugMeta();
         if (var7 == null) {
            var7 = new DebugMeta();
         }

         if (var7.getImages() == null) {
            var7.setImages(var2);
         } else {
            var7.getImages().addAll(var2);
         }

         var1.setDebugMeta(var7);
      }
   }

   private void setModules(@NotNull SentryEvent var1) {
      Map var2 = this.options.getModulesLoader().getOrLoadModules();
      if (var2 != null) {
         Map var3 = var1.getModules();
         if (var3 == null) {
            var1.setModules(var2);
         } else {
            var3.putAll(var2);
         }
      }
   }

   private boolean shouldApplyScopeData(@NotNull SentryBaseEvent var1, @NotNull Hint var2) {
      if (HintUtils.shouldApplyScopeData(var2)) {
         return true;
      }

      this.options
         .getLogger()
         .log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", var1.getEventId());
      return false;
   }

   private void processNonCachedEvent(@NotNull SentryBaseEvent var1) {
      this.setRelease(var1);
      this.setEnvironment(var1);
      this.setServerName(var1);
      this.setDist(var1);
      this.setSdk(var1);
      this.setTags(var1);
      this.mergeUser(var1);
   }

   @NotNull
   @Override
   public SentryTransaction process(@NotNull SentryTransaction var1, @NotNull Hint var2) {
      this.setCommons(var1);
      this.setDebugMeta(var1);
      if (this.shouldApplyScopeData(var1, var2)) {
         this.processNonCachedEvent(var1);
      }

      return var1;
   }

   @NotNull
   @Override
   public SentryReplayEvent process(@NotNull SentryReplayEvent var1, @NotNull Hint var2) {
      this.setCommons(var1);
      if (this.shouldApplyScopeData(var1, var2)) {
         this.processNonCachedEvent(var1);
      }

      return var1;
   }

   private void setCommons(@NotNull SentryBaseEvent var1) {
      this.setPlatform(var1);
   }

   private void setPlatform(@NotNull SentryBaseEvent var1) {
      if (var1.getPlatform() == null) {
         var1.setPlatform("java");
      }
   }

   private void setRelease(@NotNull SentryBaseEvent var1) {
      if (var1.getRelease() == null) {
         var1.setRelease(this.options.getRelease());
      }
   }

   private void setEnvironment(@NotNull SentryBaseEvent var1) {
      if (var1.getEnvironment() == null) {
         var1.setEnvironment(this.options.getEnvironment());
      }
   }

   private void setServerName(@NotNull SentryBaseEvent var1) {
      if (var1.getServerName() == null) {
         var1.setServerName(this.options.getServerName());
      }

      if (this.options.isAttachServerName() && var1.getServerName() == null) {
         this.ensureHostnameCache();
         if (this.hostnameCache != null) {
            var1.setServerName(this.hostnameCache.getHostname());
         }
      }
   }

   private void ensureHostnameCache() {
      if (this.hostnameCache == null) {
         synchronized (this) {
            if (this.hostnameCache == null) {
               this.hostnameCache = HostnameCache.getInstance();
            }
         }
      }
   }

   private void setDist(@NotNull SentryBaseEvent var1) {
      if (var1.getDist() == null) {
         var1.setDist(this.options.getDist());
      }
   }

   private void setSdk(@NotNull SentryBaseEvent var1) {
      if (var1.getSdk() == null) {
         var1.setSdk(this.options.getSdkVersion());
      }
   }

   private void setTags(@NotNull SentryBaseEvent var1) {
      if (var1.getTags() == null) {
         var1.setTags(new HashMap<>(this.options.getTags()));
      } else {
         for (Entry var3 : this.options.getTags().entrySet()) {
            if (!var1.getTags().containsKey(var3.getKey())) {
               var1.setTag((String)var3.getKey(), (String)var3.getValue());
            }
         }
      }
   }

   private void mergeUser(@NotNull SentryBaseEvent var1) {
      User var2 = var1.getUser();
      if (var2 == null) {
         var2 = new User();
         var1.setUser(var2);
      }

      if (var2.getIpAddress() == null) {
         var2.setIpAddress("{{auto}}");
      }
   }

   private void setExceptions(@NotNull SentryEvent var1) {
      Throwable var2 = var1.getThrowableMechanism();
      if (var2 != null) {
         var1.setExceptions(this.sentryExceptionFactory.getSentryExceptions(var2));
      }
   }

   private void setThreads(@NotNull SentryEvent var1, @NotNull Hint var2) {
      if (var1.getThreads() == null) {
         ArrayList var3 = null;
         List var4 = var1.getExceptions();
         if (var4 != null && !var4.isEmpty()) {
            for (SentryException var6 : var4) {
               if (var6.getMechanism() != null && var6.getThreadId() != null) {
                  if (var3 == null) {
                     var3 = new ArrayList();
                  }

                  var3.add(var6.getThreadId());
               }
            }
         }

         if (this.options.isAttachThreads() || HintUtils.hasType(var2, AbnormalExit.class)) {
            Object var7 = HintUtils.getSentrySdkHint(var2);
            boolean var8 = false;
            if (var7 instanceof AbnormalExit) {
               var8 = ((AbnormalExit)var7).ignoreCurrentThread();
            }

            var1.setThreads(this.sentryThreadFactory.getCurrentThreads(var3, var8));
         } else if (this.options.isAttachStacktrace() && (var4 == null || var4.isEmpty()) && !this.isCachedHint(var2)) {
            var1.setThreads(this.sentryThreadFactory.getCurrentThread());
         }
      }
   }

   private boolean isCachedHint(@NotNull Hint var1) {
      return HintUtils.hasType(var1, Cached.class);
   }

   @Override
   public void close() {
      if (this.hostnameCache != null) {
         this.hostnameCache.close();
      }
   }

   boolean isClosed() {
      return this.hostnameCache != null ? this.hostnameCache.isClosed() : true;
   }

   @VisibleForTesting
   @Nullable
   HostnameCache getHostnameCache() {
      return this.hostnameCache;
   }
}
