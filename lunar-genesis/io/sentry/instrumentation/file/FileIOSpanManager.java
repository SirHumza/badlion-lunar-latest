package io.sentry.instrumentation.file;

import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanStatus;
import io.sentry.util.Platform;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FileIOSpanManager {
   @Nullable
   private final ISpan currentSpan;
   @Nullable
   private final File file;
   @NotNull
   private final SentryOptions options;
   @NotNull
   private SpanStatus spanStatus = SpanStatus.OK;
   private long byteCount;
   @NotNull
   private final SentryStackTraceFactory stackTraceFactory;

   @Nullable
   static ISpan startSpan(@NotNull IHub var0, @NotNull String var1) {
      ISpan var2 = Platform.isAndroid() ? var0.getTransaction() : var0.getSpan();
      return var2 != null ? var2.startChild(var1) : null;
   }

   FileIOSpanManager(@Nullable ISpan var1, @Nullable File var2, @NotNull SentryOptions var3) {
      this.currentSpan = var1;
      this.file = var2;
      this.options = var3;
      this.stackTraceFactory = new SentryStackTraceFactory(var3);
      SentryIntegrationPackageStorage.getInstance().addIntegration("FileIO");
   }

   <T> T performIO(@NotNull FileIOSpanManager.FileIOCallable<T> var1) {
      try {
         Object var2 = var1.call();
         if (var2 instanceof Integer) {
            int var3 = (Integer)var2;
            if (var3 != -1) {
               this.byteCount += var3;
            }
         } else if (var2 instanceof Long) {
            long var6 = (Long)var2;
            if (var6 != -1L) {
               this.byteCount += var6;
            }
         }

         return (T)var2;
      } catch (IOException var5) {
         this.spanStatus = SpanStatus.INTERNAL_ERROR;
         if (this.currentSpan != null) {
            this.currentSpan.setThrowable(var5);
         }

         throw var5;
      }
   }

   void finish(@NotNull Closeable var1) {
      try {
         var1.close();
      } catch (IOException var6) {
         this.spanStatus = SpanStatus.INTERNAL_ERROR;
         if (this.currentSpan != null) {
            this.currentSpan.setThrowable(var6);
         }

         throw var6;
      } finally {
         this.finishSpan();
      }
   }

   private void finishSpan() {
      if (this.currentSpan != null) {
         String var1 = StringUtils.byteCountToString(this.byteCount);
         if (this.file != null) {
            String var2 = this.file.getName() + " (" + var1 + ")";
            this.currentSpan.setDescription(var2);
            if (Platform.isAndroid() || this.options.isSendDefaultPii()) {
               this.currentSpan.setData("file.path", this.file.getAbsolutePath());
            }
         } else {
            this.currentSpan.setDescription(var1);
         }

         this.currentSpan.setData("file.size", this.byteCount);
         boolean var3 = this.options.getMainThreadChecker().isMainThread();
         this.currentSpan.setData("blocked_main_thread", var3);
         if (var3) {
            this.currentSpan.setData("call_stack", this.stackTraceFactory.getInAppCallStack());
         }

         this.currentSpan.finish(this.spanStatus);
      }
   }

   @FunctionalInterface
   interface FileIOCallable<T> {
      T call();
   }
}
