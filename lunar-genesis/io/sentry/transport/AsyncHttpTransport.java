package io.sentry.transport;

import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AsyncHttpTransport implements ITransport {
   @NotNull
   private final QueuedThreadPoolExecutor executor;
   @NotNull
   private final IEnvelopeCache envelopeCache;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final RateLimiter rateLimiter;
   @NotNull
   private final ITransportGate transportGate;
   @NotNull
   private final HttpConnection connection;
   @Nullable
   private volatile Runnable currentRunnable = null;

   public AsyncHttpTransport(@NotNull SentryOptions var1, @NotNull RateLimiter var2, @NotNull ITransportGate var3, @NotNull RequestDetails var4) {
      this(
         initExecutor(var1.getMaxQueueSize(), var1.getEnvelopeDiskCache(), var1.getLogger(), var1.getDateProvider()),
         var1,
         var2,
         var3,
         new HttpConnection(var1, var4, var2)
      );
   }

   public AsyncHttpTransport(
      @NotNull QueuedThreadPoolExecutor var1,
      @NotNull SentryOptions var2,
      @NotNull RateLimiter var3,
      @NotNull ITransportGate var4,
      @NotNull HttpConnection var5
   ) {
      this.executor = Objects.requireNonNull(var1, "executor is required");
      this.envelopeCache = Objects.requireNonNull(var2.getEnvelopeDiskCache(), "envelopeCache is required");
      this.options = Objects.requireNonNull(var2, "options is required");
      this.rateLimiter = Objects.requireNonNull(var3, "rateLimiter is required");
      this.transportGate = Objects.requireNonNull(var4, "transportGate is required");
      this.connection = Objects.requireNonNull(var5, "httpConnection is required");
   }

   @Override
   public void send(@NotNull SentryEnvelope var1, @NotNull Hint var2) {
      IEnvelopeCache var3 = this.envelopeCache;
      boolean var4 = false;
      if (HintUtils.hasType(var2, Cached.class)) {
         var3 = NoOpEnvelopeCache.getInstance();
         var4 = true;
         this.options.getLogger().log(SentryLevel.DEBUG, "Captured Envelope is already cached");
      }

      SentryEnvelope var5 = this.rateLimiter.filter(var1, var2);
      if (var5 == null) {
         if (var4) {
            this.envelopeCache.discard(var1);
         }
      } else {
         SentryEnvelope var6;
         if (HintUtils.hasType(var2, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            var6 = this.options.getClientReportRecorder().attachReportToEnvelope(var5);
         } else {
            var6 = var5;
         }

         Future var7 = this.executor.submit(new AsyncHttpTransport.EnvelopeSender(var6, var2, var3));
         if (var7 != null && var7.isCancelled()) {
            this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.QUEUE_OVERFLOW, var6);
         } else {
            HintUtils.runIfHasType(var2, Enqueable.class, var1x -> {
               var1x.markEnqueued();
               this.options.getLogger().log(SentryLevel.DEBUG, "Envelope enqueued");
            });
         }
      }
   }

   @Override
   public void flush(long var1) {
      this.executor.waitTillIdle(var1);
   }

   private static QueuedThreadPoolExecutor initExecutor(int var0, @NotNull IEnvelopeCache var1, @NotNull ILogger var2, @NotNull SentryDateProvider var3) {
      RejectedExecutionHandler var4 = (var2x, var3x) -> {
         if (var2x instanceof AsyncHttpTransport.EnvelopeSender) {
            AsyncHttpTransport.EnvelopeSender var4x = (AsyncHttpTransport.EnvelopeSender)var2x;
            if (!HintUtils.hasType(var4x.hint, Cached.class)) {
               var1.store(var4x.envelope, var4x.hint);
            }

            markHintWhenSendingFailed(var4x.hint, true);
            var2.log(SentryLevel.WARNING, "Envelope rejected");
         }
      };
      return new QueuedThreadPoolExecutor(1, var0, new AsyncHttpTransport.AsyncConnectionThreadFactory(), var4, var2, var3);
   }

   @NotNull
   @Override
   public RateLimiter getRateLimiter() {
      return this.rateLimiter;
   }

   @Override
   public boolean isHealthy() {
      boolean var1 = this.rateLimiter.isAnyRateLimitActive();
      boolean var2 = this.executor.didRejectRecently();
      return !var1 && !var2;
   }

   @Override
   public void close() {
      this.close(false);
   }

   @Override
   public void close(boolean var1) {
      this.rateLimiter.close();
      this.executor.shutdown();
      this.options.getLogger().log(SentryLevel.DEBUG, "Shutting down");

      try {
         long var2 = var1 ? 0L : this.options.getFlushTimeoutMillis();
         if (!this.executor.awaitTermination(var2, TimeUnit.MILLISECONDS)) {
            this.options
               .getLogger()
               .log(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + var2 + " ms. Trying to force it now.");
            this.executor.shutdownNow();
            if (this.currentRunnable != null) {
               this.executor.getRejectedExecutionHandler().rejectedExecution(this.currentRunnable, this.executor);
            }
         }
      } catch (InterruptedException var4) {
         this.options.getLogger().log(SentryLevel.DEBUG, "Thread interrupted while closing the connection.");
         Thread.currentThread().interrupt();
      }
   }

   private static void markHintWhenSendingFailed(@NotNull Hint var0, boolean var1) {
      HintUtils.runIfHasType(var0, SubmissionResult.class, var0x -> var0x.setResult(false));
      HintUtils.runIfHasType(var0, Retryable.class, var1x -> var1x.setRetry(var1));
   }

   private static final class AsyncConnectionThreadFactory implements ThreadFactory {
      private int cnt;

      private AsyncConnectionThreadFactory() {
      }

      @NotNull
      @Override
      public Thread newThread(@NotNull Runnable var1) {
         Thread var2 = new Thread(var1, "SentryAsyncConnection-" + this.cnt++);
         var2.setDaemon(true);
         return var2;
      }
   }

   private final class EnvelopeSender implements Runnable {
      @NotNull
      private final SentryEnvelope envelope;
      @NotNull
      private final Hint hint;
      @NotNull
      private final IEnvelopeCache envelopeCache;
      private final TransportResult failedResult = TransportResult.error();

      EnvelopeSender(@NotNull SentryEnvelope var2, @NotNull Hint var3, @NotNull IEnvelopeCache var4) {
         this.envelope = Objects.requireNonNull(var2, "Envelope is required.");
         this.hint = var3;
         this.envelopeCache = Objects.requireNonNull(var4, "EnvelopeCache is required.");
      }

      @Override
      public void run() {
         AsyncHttpTransport.this.currentRunnable = this;
         TransportResult var1 = this.failedResult;

         try {
            var1 = this.flush();
            AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Envelope flushed");
         } catch (Throwable var7) {
            AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, var7, "Envelope submission failed");
            throw var7;
         } finally {
            TransportResult var4 = var1;
            HintUtils.runIfHasType(this.hint, SubmissionResult.class, var2 -> {
               AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Marking envelope submission result: %s", var4.isSuccess());
               var2.setResult(var4.isSuccess());
            });
            AsyncHttpTransport.this.currentRunnable = null;
         }
      }

      @NotNull
      private TransportResult flush() {
         TransportResult var1 = this.failedResult;
         this.envelope.getHeader().setSentAt(null);
         this.envelopeCache.store(this.envelope, this.hint);
         HintUtils.runIfHasType(this.hint, DiskFlushNotification.class, var1x -> {
            if (var1x.isFlushable(this.envelope.getHeader().getEventId())) {
               var1x.markFlushed();
               AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired");
            } else {
               AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction");
            }
         });
         if (AsyncHttpTransport.this.transportGate.isConnected()) {
            SentryEnvelope var2 = AsyncHttpTransport.this.options.getClientReportRecorder().attachReportToEnvelope(this.envelope);

            try {
               SentryDate var3 = AsyncHttpTransport.this.options.getDateProvider().now();
               var2.getHeader().setSentAt(DateUtils.nanosToDate(var3.nanoTimestamp()));
               var1 = AsyncHttpTransport.this.connection.send(var2);
               if (!var1.isSuccess()) {
                  String var4 = "The transport failed to send the envelope with response code " + var1.getResponseCode();
                  AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, var4);
                  if (var1.getResponseCode() >= 400 && var1.getResponseCode() != 429) {
                     HintUtils.runIfDoesNotHaveType(
                        this.hint,
                        Retryable.class,
                        var2x -> AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, var2)
                     );
                  }

                  throw new IllegalStateException(var4);
               }

               this.envelopeCache.discard(this.envelope);
            } catch (IOException var5) {
               HintUtils.runIfHasType(this.hint, Retryable.class, var0 -> var0.setRetry(true), (var2x, var3x) -> {
                  LogUtils.logNotInstanceOf(var3x, var2x, AsyncHttpTransport.this.options.getLogger());
                  AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, var2);
               });
               throw new IllegalStateException("Sending the event failed.", var5);
            }
         } else {
            HintUtils.runIfHasType(this.hint, Retryable.class, var0 -> var0.setRetry(true), (var1x, var2x) -> {
               LogUtils.logNotInstanceOf(var2x, var1x, AsyncHttpTransport.this.options.getLogger());
               AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, this.envelope);
            });
         }

         return var1;
      }
   }
}
