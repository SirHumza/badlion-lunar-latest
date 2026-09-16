package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryStackTraceFactory {
   private static final int STACKTRACE_FRAME_LIMIT = 100;
   @NotNull
   private final SentryOptions options;

   public SentryStackTraceFactory(@NotNull SentryOptions var1) {
      this.options = var1;
   }

   @Nullable
   public List<SentryStackFrame> getStackFrames(@Nullable StackTraceElement[] var1, boolean var2) {
      ArrayList var3 = null;
      if (var1 != null && var1.length > 0) {
         var3 = new ArrayList();

         for (StackTraceElement var7 : var1) {
            if (var7 != null) {
               String var8 = var7.getClassName();
               if (var2 || !var8.startsWith("io.sentry.") || var8.startsWith("io.sentry.samples.") || var8.startsWith("io.sentry.mobile.")) {
                  SentryStackFrame var9 = new SentryStackFrame();
                  var9.setInApp(this.isInApp(var8));
                  var9.setModule(var8);
                  var9.setFunction(var7.getMethodName());
                  var9.setFilename(var7.getFileName());
                  if (var7.getLineNumber() >= 0) {
                     var9.setLineno(var7.getLineNumber());
                  }

                  var9.setNative(var7.isNativeMethod());
                  var3.add(var9);
                  if (var3.size() >= 100) {
                     break;
                  }
               }
            }
         }

         Collections.reverse(var3);
      }

      return var3;
   }

   @Nullable
   public Boolean isInApp(@Nullable String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (String var4 : this.options.getInAppIncludes()) {
            if (var1.startsWith(var4)) {
               return true;
            }
         }

         for (String var5 : this.options.getInAppExcludes()) {
            if (var1.startsWith(var5)) {
               return false;
            }
         }

         return null;
      } else {
         return true;
      }
   }

   @NotNull
   List<SentryStackFrame> getInAppCallStack(@NotNull Throwable var1) {
      StackTraceElement[] var2 = var1.getStackTrace();
      List var3 = this.getStackFrames(var2, false);
      if (var3 == null) {
         return Collections.emptyList();
      }

      List var4 = CollectionUtils.filterListEntries(var3, var0 -> Boolean.TRUE.equals(var0.isInApp()));
      return !var4.isEmpty() ? var4 : CollectionUtils.filterListEntries(var3, var0 -> {
         String var1x = var0.getModule();
         boolean var2x = false;
         if (var1x != null) {
            var2x = var1x.startsWith("sun.") || var1x.startsWith("java.") || var1x.startsWith("android.") || var1x.startsWith("com.android.");
         }

         return !var2x;
      });
   }

   @ApiStatus.Internal
   @NotNull
   public List<SentryStackFrame> getInAppCallStack() {
      return this.getInAppCallStack(new Exception());
   }
}
