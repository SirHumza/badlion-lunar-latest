package io.sentry;

import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentryTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SentryRuntimeEventProcessor implements EventProcessor {
   @Nullable
   private final String javaVersion;
   @Nullable
   private final String javaVendor;

   public SentryRuntimeEventProcessor(@Nullable String var1, @Nullable String var2) {
      this.javaVersion = var1;
      this.javaVendor = var2;
   }

   public SentryRuntimeEventProcessor() {
      this(System.getProperty("java.version"), System.getProperty("java.vendor"));
   }

   @NotNull
   @Override
   public SentryEvent process(@NotNull SentryEvent var1, @Nullable Hint var2) {
      return this.process(var1);
   }

   @NotNull
   @Override
   public SentryTransaction process(@NotNull SentryTransaction var1, @Nullable Hint var2) {
      return this.process(var1);
   }

   @NotNull
   private <T extends SentryBaseEvent> T process(@NotNull T var1) {
      if (var1.getContexts().getRuntime() == null) {
         var1.getContexts().setRuntime(new SentryRuntime());
      }

      SentryRuntime var2 = var1.getContexts().getRuntime();
      if (var2 != null && var2.getName() == null && var2.getVersion() == null) {
         var2.setName(this.javaVendor);
         var2.setVersion(this.javaVersion);
      }

      return (T)var1;
   }
}
