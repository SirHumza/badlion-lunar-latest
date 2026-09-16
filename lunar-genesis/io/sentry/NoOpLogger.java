package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpLogger implements ILogger {
   private static final NoOpLogger instance = new NoOpLogger();

   public static NoOpLogger getInstance() {
      return instance;
   }

   private NoOpLogger() {
   }

   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Object... var3) {
   }

   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Throwable var3) {
   }

   @Override
   public void log(@NotNull SentryLevel var1, @Nullable Throwable var2, @NotNull String var3, @Nullable Object... var4) {
   }

   @Override
   public boolean isEnabled(@Nullable SentryLevel var1) {
      return false;
   }
}
