package io.sentry;

import io.sentry.hints.Cached;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.transport.RateLimiter;
import io.sentry.util.HintUtils;
import java.io.File;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

abstract class DirectoryProcessor {
   private static final long ENVELOPE_PROCESSING_DELAY = 100L;
   @NotNull
   private final IHub hub;
   @NotNull
   private final ILogger logger;
   private final long flushTimeoutMillis;
   private final Queue<String> processedEnvelopes;

   DirectoryProcessor(@NotNull IHub var1, @NotNull ILogger var2, long var3, int var5) {
      this.hub = var1;
      this.logger = var2;
      this.flushTimeoutMillis = var3;
      this.processedEnvelopes = SynchronizedQueue.synchronizedQueue(new CircularFifoQueue<>(var5));
   }

   public void processDirectory(@NotNull File var1) {
      try {
         this.logger.log(SentryLevel.DEBUG, "Processing dir. %s", var1.getAbsolutePath());
         if (!var1.exists()) {
            this.logger.log(SentryLevel.WARNING, "Directory '%s' doesn't exist. No cached events to send.", var1.getAbsolutePath());
            return;
         }

         if (!var1.isDirectory()) {
            this.logger.log(SentryLevel.ERROR, "Cache dir %s is not a directory.", var1.getAbsolutePath());
            return;
         }

         File[] var2 = var1.listFiles();
         if (var2 == null) {
            this.logger.log(SentryLevel.ERROR, "Cache dir %s is null.", var1.getAbsolutePath());
            return;
         }

         File[] var3 = var1.listFiles((var1x, var2x) -> this.isRelevantFileName(var2x));
         this.logger.log(SentryLevel.DEBUG, "Processing %d items from cache dir %s", var3 != null ? var3.length : 0, var1.getAbsolutePath());

         for (File var7 : var2) {
            if (!var7.isFile()) {
               this.logger.log(SentryLevel.DEBUG, "File %s is not a File.", var7.getAbsolutePath());
            } else {
               String var8 = var7.getAbsolutePath();
               if (this.processedEnvelopes.contains(var8)) {
                  this.logger.log(SentryLevel.DEBUG, "File '%s' has already been processed so it will not be processed again.", var8);
               } else {
                  RateLimiter var9 = this.hub.getRateLimiter();
                  if (var9 != null && var9.isActiveForCategory(DataCategory.All)) {
                     this.logger.log(SentryLevel.INFO, "DirectoryProcessor, rate limiting active.");
                     return;
                  }

                  this.logger.log(SentryLevel.DEBUG, "Processing file: %s", var8);
                  DirectoryProcessor.SendCachedEnvelopeHint var10 = new DirectoryProcessor.SendCachedEnvelopeHint(
                     this.flushTimeoutMillis, this.logger, var8, this.processedEnvelopes
                  );
                  Hint var11 = HintUtils.createWithTypeCheckHint(var10);
                  this.processFile(var7, var11);
                  Thread.sleep(100L);
               }
            }
         }
      } catch (Throwable var12) {
         this.logger.log(SentryLevel.ERROR, var12, "Failed processing '%s'", var1.getAbsolutePath());
      }
   }

   protected abstract void processFile(@NotNull File var1, @NotNull Hint var2);

   protected abstract boolean isRelevantFileName(String var1);

   private static final class SendCachedEnvelopeHint implements Cached, Enqueable, Flushable, Retryable, SubmissionResult {
      boolean retry = false;
      boolean succeeded = false;
      private final CountDownLatch latch;
      private final long flushTimeoutMillis;
      @NotNull
      private final ILogger logger;
      @NotNull
      private final String filePath;
      @NotNull
      private final Queue<String> processedEnvelopes;

      public SendCachedEnvelopeHint(long var1, @NotNull ILogger var3, @NotNull String var4, @NotNull Queue<String> var5) {
         this.flushTimeoutMillis = var1;
         this.filePath = var4;
         this.processedEnvelopes = var5;
         this.latch = new CountDownLatch(1);
         this.logger = var3;
      }

      @Override
      public boolean isRetry() {
         return this.retry;
      }

      @Override
      public void setRetry(boolean var1) {
         this.retry = var1;
      }

      @Override
      public boolean waitFlush() {
         try {
            return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
         } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
            this.logger.log(SentryLevel.ERROR, "Exception while awaiting on lock.", var2);
            return false;
         }
      }

      @Override
      public void setResult(boolean var1) {
         this.succeeded = var1;
         this.latch.countDown();
      }

      @Override
      public boolean isSuccess() {
         return this.succeeded;
      }

      @Override
      public void markEnqueued() {
         this.processedEnvelopes.add(this.filePath);
      }
   }
}
