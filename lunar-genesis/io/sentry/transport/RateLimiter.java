package io.sentry.transport;

import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RateLimiter implements Closeable {
   private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
   @NotNull
   private final ICurrentDateProvider currentDateProvider;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final Map<DataCategory, Date> sentryRetryAfterLimit = new ConcurrentHashMap<>();
   @NotNull
   private final List<RateLimiter.IRateLimitObserver> rateLimitObservers = new CopyOnWriteArrayList<>();
   @Nullable
   private Timer timer = null;
   @NotNull
   private final Object timerLock = new Object();

   public RateLimiter(@NotNull ICurrentDateProvider var1, @NotNull SentryOptions var2) {
      this.currentDateProvider = var1;
      this.options = var2;
   }

   public RateLimiter(@NotNull SentryOptions var1) {
      this(CurrentDateProvider.getInstance(), var1);
   }

   @Nullable
   public SentryEnvelope filter(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
      ArrayList var3 = null;

      for (SentryEnvelopeItem var5 : var1.getItems()) {
         if (this.isRetryAfter(var5.getHeader().getType().getItemType())) {
            if (var3 == null) {
               var3 = new ArrayList();
            }

            var3.add(var5);
            this.options.getClientReportRecorder().recordLostEnvelopeItem(DiscardReason.RATELIMIT_BACKOFF, var5);
         }
      }

      if (var3 != null) {
         this.options.getLogger().log(SentryLevel.INFO, "%d items will be dropped due rate limiting.", var3.size());
         ArrayList var7 = new ArrayList();

         for (SentryEnvelopeItem var6 : var1.getItems()) {
            if (!var3.contains(var6)) {
               var7.add(var6);
            }
         }

         if (var7.isEmpty()) {
            this.options.getLogger().log(SentryLevel.INFO, "Envelope discarded due all items rate limited.");
            markHintWhenSendingFailed(var2, false);
            return null;
         } else {
            return new SentryEnvelope(var1.getHeader(), var7);
         }
      } else {
         return var1;
      }
   }

   public boolean isActiveForCategory(@NotNull DataCategory var1) {
      Date var2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
      Date var3 = this.sentryRetryAfterLimit.get(DataCategory.All);
      if (var3 != null && !var2.after(var3)) {
         return true;
      }

      if (DataCategory.Unknown.equals(var1)) {
         return false;
      }

      Date var4 = this.sentryRetryAfterLimit.get(var1);
      return var4 != null ? !var2.after(var4) : false;
   }

   public boolean isAnyRateLimitActive() {
      Date var1 = new Date(this.currentDateProvider.getCurrentTimeMillis());

      for (DataCategory var3 : this.sentryRetryAfterLimit.keySet()) {
         Date var4 = this.sentryRetryAfterLimit.get(var3);
         if (var4 != null && !var1.after(var4)) {
            return true;
         }
      }

      return false;
   }

   private static void markHintWhenSendingFailed(@NotNull Hint var0, boolean var1) {
      HintUtils.runIfHasType(var0, SubmissionResult.class, var0x -> var0x.setResult(false));
      HintUtils.runIfHasType(var0, Retryable.class, var1x -> var1x.setRetry(var1));
   }

   private boolean isRetryAfter(@NotNull String var1) {
      DataCategory var2 = this.getCategoryFromItemType(var1);
      return this.isActiveForCategory(var2);
   }

   @NotNull
   private DataCategory getCategoryFromItemType(@NotNull String var1) {
      switch (var1) {
         case "event":
            return DataCategory.Error;
         case "session":
            return DataCategory.Session;
         case "attachment":
            return DataCategory.Attachment;
         case "profile":
            return DataCategory.Profile;
         case "statsd":
            return DataCategory.MetricBucket;
         case "transaction":
            return DataCategory.Transaction;
         case "check_in":
            return DataCategory.Monitor;
         case "replay_video":
            return DataCategory.Replay;
         default:
            return DataCategory.Unknown;
      }
   }

   public void updateRetryAfterLimits(@Nullable String var1, @Nullable String var2, int var3) {
      if (var1 != null) {
         for (String var7 : var1.split(",", -1)) {
            var7 = var7.replace(" ", "");
            String[] var8 = var7.split(":", -1);
            String var9 = var8.length > 4 ? var8[4] : null;
            if (var8.length > 0) {
               String var10 = var8[0];
               long var11 = this.parseRetryAfterOrDefault(var10);
               if (var8.length > 1) {
                  String var13 = var8[1];
                  Date var14 = new Date(this.currentDateProvider.getCurrentTimeMillis() + var11);
                  if (var13 != null && !var13.isEmpty()) {
                     String[] var15 = var13.split(";", -1);

                     for (String var19 : var15) {
                        DataCategory var20 = DataCategory.Unknown;

                        try {
                           String var21 = StringUtils.camelCase(var19);
                           if (var21 != null) {
                              var20 = DataCategory.valueOf(var21);
                           } else {
                              this.options.getLogger().log(SentryLevel.ERROR, "Couldn't capitalize: %s", var19);
                           }
                        } catch (IllegalArgumentException var22) {
                           this.options.getLogger().log(SentryLevel.INFO, var22, "Unknown category: %s", var19);
                        }

                        if (!DataCategory.Unknown.equals(var20)) {
                           if (DataCategory.MetricBucket.equals(var20) && var9 != null && !var9.equals("")) {
                              String[] var26 = var9.split(";", -1);
                              if (var26.length > 0 && !CollectionUtils.contains(var26, "custom")) {
                                 continue;
                              }
                           }

                           this.applyRetryAfterOnlyIfLonger(var20, var14);
                        }
                     }
                  } else {
                     this.applyRetryAfterOnlyIfLonger(DataCategory.All, var14);
                  }
               }
            }
         }
      } else if (var3 == 429) {
         long var23 = this.parseRetryAfterOrDefault(var2);
         Date var24 = new Date(this.currentDateProvider.getCurrentTimeMillis() + var23);
         this.applyRetryAfterOnlyIfLonger(DataCategory.All, var24);
      }
   }

   private void applyRetryAfterOnlyIfLonger(@NotNull DataCategory var1, @NotNull Date var2) {
      Date var3 = this.sentryRetryAfterLimit.get(var1);
      if (var3 == null || var2.after(var3)) {
         this.sentryRetryAfterLimit.put(var1, var2);
         this.notifyRateLimitObservers();
         synchronized (this.timerLock) {
            if (this.timer == null) {
               this.timer = new Timer(true);
            }

            this.timer.schedule(new TimerTask() {
               @Override
               public void run() {
                  RateLimiter.this.notifyRateLimitObservers();
               }
            }, var2);
         }
      }
   }

   private long parseRetryAfterOrDefault(@Nullable String var1) {
      long var2 = 60000L;
      if (var1 != null) {
         try {
            var2 = (long)(Double.parseDouble(var1) * 1000.0);
         } catch (NumberFormatException var5) {
         }
      }

      return var2;
   }

   private void notifyRateLimitObservers() {
      for (RateLimiter.IRateLimitObserver var2 : this.rateLimitObservers) {
         var2.onRateLimitChanged(this);
      }
   }

   public void addRateLimitObserver(@NotNull RateLimiter.IRateLimitObserver var1) {
      this.rateLimitObservers.add(var1);
   }

   public void removeRateLimitObserver(@NotNull RateLimiter.IRateLimitObserver var1) {
      this.rateLimitObservers.remove(var1);
   }

   @Override
   public void close() {
      synchronized (this.timerLock) {
         if (this.timer != null) {
            this.timer.cancel();
            this.timer = null;
         }
      }

      this.rateLimitObservers.clear();
   }

   public interface IRateLimitObserver {
      void onRateLimitChanged(@NotNull RateLimiter var1);
   }
}
