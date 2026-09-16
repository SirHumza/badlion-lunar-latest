package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryExceptionFactory {
   @NotNull
   private final SentryStackTraceFactory sentryStackTraceFactory;

   public SentryExceptionFactory(@NotNull SentryStackTraceFactory var1) {
      this.sentryStackTraceFactory = Objects.requireNonNull(var1, "The SentryStackTraceFactory is required.");
   }

   @NotNull
   public List<SentryException> getSentryExceptionsFromThread(@NotNull SentryThread var1, @NotNull Mechanism var2, @NotNull Throwable var3) {
      SentryStackTrace var4 = var1.getStacktrace();
      if (var4 == null) {
         return new ArrayList<>(0);
      }

      ArrayList var5 = new ArrayList(1);
      var5.add(this.getSentryException(var3, var2, var1.getId(), var4.getFrames(), true));
      return var5;
   }

   @NotNull
   public List<SentryException> getSentryExceptions(@NotNull Throwable var1) {
      return this.getSentryExceptions(this.extractExceptionQueue(var1));
   }

   @NotNull
   private List<SentryException> getSentryExceptions(@NotNull Deque<SentryException> var1) {
      return new ArrayList<>(var1);
   }

   @NotNull
   private SentryException getSentryException(
      @NotNull Throwable var1, @Nullable Mechanism var2, @Nullable Long var3, @Nullable List<SentryStackFrame> var4, boolean var5
   ) {
      Package var6 = var1.getClass().getPackage();
      String var7 = var1.getClass().getName();
      SentryException var8 = new SentryException();
      String var9 = var1.getMessage();
      String var10 = var6 != null ? var7.replace(var6.getName() + ".", "") : var7;
      String var11 = var6 != null ? var6.getName() : null;
      if (var4 != null && !var4.isEmpty()) {
         SentryStackTrace var12 = new SentryStackTrace(var4);
         if (var5) {
            var12.setSnapshot(true);
         }

         var8.setStacktrace(var12);
      }

      var8.setThreadId(var3);
      var8.setType(var10);
      var8.setMechanism(var2);
      var8.setModule(var11);
      var8.setValue(var9);
      return var8;
   }

   @TestOnly
   @NotNull
   Deque<SentryException> extractExceptionQueue(@NotNull Throwable var1) {
      ArrayDeque var2 = new ArrayDeque();
      HashSet var3 = new HashSet();

      for (Throwable var6 = var1; var6 != null && var3.add(var6); var6 = var6.getCause()) {
         boolean var7 = false;
         Mechanism var4;
         Thread var5;
         if (var6 instanceof ExceptionMechanismException) {
            ExceptionMechanismException var8 = (ExceptionMechanismException)var6;
            var4 = var8.getExceptionMechanism();
            var6 = var8.getThrowable();
            var5 = var8.getThread();
            var7 = var8.isSnapshot();
         } else {
            var4 = null;
            var5 = Thread.currentThread();
         }

         boolean var11 = var4 != null && Boolean.FALSE.equals(var4.isHandled());
         List var9 = this.sentryStackTraceFactory.getStackFrames(var6.getStackTrace(), var11);
         SentryException var10 = this.getSentryException(var6, var4, var5.getId(), var9, var7);
         var2.addFirst(var10);
      }

      return var2;
   }
}
