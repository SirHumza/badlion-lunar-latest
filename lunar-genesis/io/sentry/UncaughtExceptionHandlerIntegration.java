package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.hints.EventDropReason;
import io.sentry.hints.SessionEnd;
import io.sentry.hints.TransactionEnd;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryId;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public final class UncaughtExceptionHandlerIntegration implements Integration, Closeable, java.lang.Thread.UncaughtExceptionHandler {
   @Nullable
   private UncaughtExceptionHandler defaultExceptionHandler;
   @Nullable
   private IHub hub;
   @Nullable
   private SentryOptions options;
   private boolean registered = false;
   @NotNull
   private final UncaughtExceptionHandler threadAdapter;

   public UncaughtExceptionHandlerIntegration() {
      this(UncaughtExceptionHandler.Adapter.getInstance());
   }

   UncaughtExceptionHandlerIntegration(@NotNull UncaughtExceptionHandler var1) {
      this.threadAdapter = Objects.requireNonNull(var1, "threadAdapter is required.");
   }

   @Override
   public void register(@NotNull IHub var1, @NotNull SentryOptions var2) {
      if (this.registered) {
         var2.getLogger().log(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.");
      } else {
         this.registered = true;
         this.hub = Objects.requireNonNull(var1, "Hub is required");
         this.options = Objects.requireNonNull(var2, "SentryOptions is required");
         this.options.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration enabled: %s", this.options.isEnableUncaughtExceptionHandler());
         if (this.options.isEnableUncaughtExceptionHandler()) {
            java.lang.Thread.UncaughtExceptionHandler var3 = this.threadAdapter.getDefaultUncaughtExceptionHandler();
            if (var3 != null) {
               this.options.getLogger().log(SentryLevel.DEBUG, "default UncaughtExceptionHandler class='" + var3.getClass().getName() + "'");
               if (var3 instanceof UncaughtExceptionHandlerIntegration) {
                  UncaughtExceptionHandlerIntegration var4 = (UncaughtExceptionHandlerIntegration)var3;
                  this.defaultExceptionHandler = var4.defaultExceptionHandler;
               } else {
                  this.defaultExceptionHandler = var3;
               }
            }

            this.threadAdapter.setDefaultUncaughtExceptionHandler(this);
            this.options.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration installed.");
            IntegrationUtils.addIntegrationToSdkVersion("UncaughtExceptionHandler");
         }
      }
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      if (this.options != null && this.hub != null) {
         this.options.getLogger().log(SentryLevel.INFO, "Uncaught exception received.");

         try {
            UncaughtExceptionHandlerIntegration.UncaughtExceptionHint var3 = new UncaughtExceptionHandlerIntegration.UncaughtExceptionHint(
               this.options.getFlushTimeoutMillis(), this.options.getLogger()
            );
            Throwable var4 = getUnhandledThrowable(var1, var2);
            SentryEvent var5 = new SentryEvent(var4);
            var5.setLevel(SentryLevel.FATAL);
            ITransaction var6 = this.hub.getTransaction();
            if (var6 == null && var5.getEventId() != null) {
               var3.setFlushable(var5.getEventId());
            }

            Hint var7 = HintUtils.createWithTypeCheckHint(var3);
            SentryId var8 = this.hub.captureEvent(var5, var7);
            boolean var9 = var8.equals(SentryId.EMPTY_ID);
            EventDropReason var10 = HintUtils.getEventDropReason(var7);
            if ((!var9 || EventDropReason.MULTITHREADED_DEDUPLICATION.equals(var10)) && !var3.waitFlush()) {
               this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", var5.getEventId());
            }
         } catch (Throwable var11) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", var11);
         }

         if (this.defaultExceptionHandler != null) {
            this.options.getLogger().log(SentryLevel.INFO, "Invoking inner uncaught exception handler.");
            this.defaultExceptionHandler.uncaughtException(var1, var2);
         } else if (this.options.isPrintUncaughtStackTrace()) {
            var2.printStackTrace();
         }
      }
   }

   @TestOnly
   @NotNull
   static Throwable getUnhandledThrowable(@NotNull Thread var0, @NotNull Throwable var1) {
      Mechanism var2 = new Mechanism();
      var2.setHandled(false);
      var2.setType("UncaughtExceptionHandler");
      return new ExceptionMechanismException(var2, var1, var0);
   }

   @Override
   public void close() {
      if (this == this.threadAdapter.getDefaultUncaughtExceptionHandler()) {
         this.threadAdapter.setDefaultUncaughtExceptionHandler(this.defaultExceptionHandler);
         if (this.options != null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.");
         }
      }
   }

   @ApiStatus.Internal
   public static class UncaughtExceptionHint extends BlockingFlushHint implements SessionEnd, TransactionEnd {
      private final AtomicReference<SentryId> flushableEventId = new AtomicReference<>();

      public UncaughtExceptionHint(long var1, @NotNull ILogger var3) {
         super(var1, var3);
      }

      @Override
      public boolean isFlushable(@Nullable SentryId var1) {
         SentryId var2 = this.flushableEventId.get();
         return var2 != null && var2.equals(var1);
      }

      @Override
      public void setFlushable(@NotNull SentryId var1) {
         this.flushableEventId.set(var1);
      }
   }
}
