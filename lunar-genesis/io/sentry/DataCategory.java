package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public enum DataCategory {
   All("__all__"),
   Default("default"),
   Error("error"),
   Session("session"),
   Attachment("attachment"),
   Monitor("monitor"),
   Profile("profile"),
   MetricBucket("metric_bucket"),
   Transaction("transaction"),
   Replay("replay"),
   Span("span"),
   Security("security"),
   UserReport("user_report"),
   Unknown("unknown");

   private final String category;

   DataCategory(@NotNull String var3) {
      this.category = var3;
   }

   public String getCategory() {
      return this.category;
   }
}
