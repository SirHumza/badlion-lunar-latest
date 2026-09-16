package io.sentry.util;

import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Backfillable;
import io.sentry.hints.Cached;
import io.sentry.hints.EventDropReason;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class HintUtils {
   private HintUtils() {
   }

   public static void setIsFromHybridSdk(@NotNull Hint var0, @NotNull String var1) {
      if (var1.startsWith("sentry.javascript") || var1.startsWith("sentry.dart") || var1.startsWith("sentry.dotnet")) {
         var0.set("sentry:isFromHybridSdk", true);
      }
   }

   public static boolean isFromHybridSdk(@NotNull Hint var0) {
      return Boolean.TRUE.equals(var0.getAs("sentry:isFromHybridSdk", Boolean.class));
   }

   public static void setEventDropReason(@NotNull Hint var0, @NotNull EventDropReason var1) {
      var0.set("sentry:eventDropReason", var1);
   }

   @Nullable
   public static EventDropReason getEventDropReason(@NotNull Hint var0) {
      return var0.getAs("sentry:eventDropReason", EventDropReason.class);
   }

   public static Hint createWithTypeCheckHint(Object var0) {
      Hint var1 = new Hint();
      setTypeCheckHint(var1, var0);
      return var1;
   }

   public static void setTypeCheckHint(@NotNull Hint var0, Object var1) {
      var0.set("sentry:typeCheckHint", var1);
   }

   @Nullable
   public static Object getSentrySdkHint(@NotNull Hint var0) {
      return var0.get("sentry:typeCheckHint");
   }

   public static boolean hasType(@NotNull Hint var0, @NotNull Class<?> var1) {
      Object var2 = getSentrySdkHint(var0);
      return var1.isInstance(var2);
   }

   public static <T> void runIfDoesNotHaveType(@NotNull Hint var0, @NotNull Class<T> var1, HintUtils.SentryNullableConsumer<Object> var2) {
      runIfHasType(var0, var1, var0x -> {}, (var1x, var2x) -> var2.accept(var1x));
   }

   public static <T> void runIfHasType(@NotNull Hint var0, @NotNull Class<T> var1, HintUtils.SentryConsumer<T> var2) {
      runIfHasType(var0, var1, var2, (var0x, var1x) -> {});
   }

   public static <T> void runIfHasTypeLogIfNot(@NotNull Hint var0, @NotNull Class<T> var1, ILogger var2, HintUtils.SentryConsumer<T> var3) {
      runIfHasType(var0, var1, var3, (var1x, var2x) -> LogUtils.logNotInstanceOf(var2x, var1x, var2));
   }

   public static <T> void runIfHasType(@NotNull Hint var0, @NotNull Class<T> var1, HintUtils.SentryConsumer<T> var2, HintUtils.SentryHintFallback var3) {
      Object var4 = getSentrySdkHint(var0);
      if (hasType(var0, var1) && var4 != null) {
         var2.accept(var4);
      } else {
         var3.accept(var4, var1);
      }
   }

   public static boolean shouldApplyScopeData(@NotNull Hint var0) {
      return !hasType(var0, Cached.class) && !hasType(var0, Backfillable.class) || hasType(var0, ApplyScopeData.class);
   }

   @FunctionalInterface
   public interface SentryConsumer<T> {
      void accept(@NotNull T var1);
   }

   @FunctionalInterface
   public interface SentryHintFallback {
      void accept(@Nullable Object var1, @NotNull Class<?> var2);
   }

   @FunctionalInterface
   public interface SentryNullableConsumer<T> {
      void accept(@Nullable T var1);
   }
}
