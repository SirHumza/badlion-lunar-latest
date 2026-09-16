package io.sentry;

import org.jetbrains.annotations.NotNull;

public final class ExperimentalOptions {
   @NotNull
   private SentryReplayOptions sessionReplay;

   public ExperimentalOptions(boolean var1) {
      this.sessionReplay = new SentryReplayOptions(var1);
   }

   @NotNull
   public SentryReplayOptions getSessionReplay() {
      return this.sessionReplay;
   }

   public void setSessionReplay(@NotNull SentryReplayOptions var1) {
      this.sessionReplay = var1;
   }
}
