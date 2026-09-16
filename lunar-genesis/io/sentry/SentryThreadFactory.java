package io.sentry;

import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryThreadFactory {
   @NotNull
   private final SentryStackTraceFactory sentryStackTraceFactory;
   @NotNull
   private final SentryOptions options;

   public SentryThreadFactory(@NotNull SentryStackTraceFactory var1, @NotNull SentryOptions var2) {
      this.sentryStackTraceFactory = Objects.requireNonNull(var1, "The SentryStackTraceFactory is required.");
      this.options = Objects.requireNonNull(var2, "The SentryOptions is required");
   }

   @Nullable
   List<SentryThread> getCurrentThread() {
      HashMap var1 = new HashMap();
      Thread var2 = Thread.currentThread();
      var1.put(var2, var2.getStackTrace());
      return this.getCurrentThreads(var1, null, false);
   }

   @Nullable
   List<SentryThread> getCurrentThreads(@Nullable List<Long> var1, boolean var2) {
      return this.getCurrentThreads(Thread.getAllStackTraces(), var1, var2);
   }

   @Nullable
   List<SentryThread> getCurrentThreads(@Nullable List<Long> var1) {
      return this.getCurrentThreads(Thread.getAllStackTraces(), var1, false);
   }

   @TestOnly
   @Nullable
   List<SentryThread> getCurrentThreads(@NotNull Map<Thread, StackTraceElement[]> var1, @Nullable List<Long> var2, boolean var3) {
      ArrayList var4 = null;
      Thread var5 = Thread.currentThread();
      if (!var1.isEmpty()) {
         var4 = new ArrayList();
         if (!var1.containsKey(var5)) {
            var1.put(var5, var5.getStackTrace());
         }

         for (Entry var7 : var1.entrySet()) {
            Thread var8 = (Thread)var7.getKey();
            boolean var9 = var8 == var5 && !var3 || var2 != null && var2.contains(var8.getId());
            var4.add(this.getSentryThread(var9, (StackTraceElement[])var7.getValue(), (Thread)var7.getKey()));
         }
      }

      return var4;
   }

   @NotNull
   private SentryThread getSentryThread(boolean var1, @NotNull StackTraceElement[] var2, @NotNull Thread var3) {
      SentryThread var4 = new SentryThread();
      var4.setName(var3.getName());
      var4.setPriority(var3.getPriority());
      var4.setId(var3.getId());
      var4.setDaemon(var3.isDaemon());
      var4.setState(var3.getState().name());
      var4.setCrashed(var1);
      List var5 = this.sentryStackTraceFactory.getStackFrames(var2, false);
      if (this.options.isAttachStacktrace() && var5 != null && !var5.isEmpty()) {
         SentryStackTrace var6 = new SentryStackTrace(var5);
         var6.setSnapshot(true);
         var4.setStacktrace(var6);
      }

      return var4;
   }
}
