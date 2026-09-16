package io.sentry;

import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class DiagnosticLogger implements ILogger {
   @NotNull
   private final SentryOptions options;
   @Nullable
   private final ILogger logger;

   public DiagnosticLogger(@NotNull SentryOptions var1, @Nullable ILogger var2) {
      this.options = Objects.requireNonNull(var1, "SentryOptions is required.");
      this.logger = var2;
   }

   @Override
   public boolean isEnabled(@Nullable SentryLevel var1) {
      SentryLevel var2 = this.options.getDiagnosticLevel();
      return var1 == null ? false : this.options.isDebug() && var1.ordinal() >= var2.ordinal();
   }

   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Object... var3) {
      if (this.logger != null && this.isEnabled(var1)) {
         this.logger.log(var1, var2, var3);
      }
   }

   @Override
   public void log(@NotNull SentryLevel var1, @NotNull String var2, @Nullable Throwable var3) {
      if (this.logger != null && this.isEnabled(var1)) {
         this.logger.log(var1, var2, var3);
      }
   }

   @Override
   public void log(@NotNull SentryLevel var1, @Nullable Throwable var2, @NotNull String var3, @Nullable Object... var4) {
      if (this.logger != null && this.isEnabled(var1)) {
         this.logger.log(var1, var2, var3, var4);
      }
   }

   @TestOnly
   @Nullable
   public ILogger getLogger() {
      return this.logger;
   }
}
