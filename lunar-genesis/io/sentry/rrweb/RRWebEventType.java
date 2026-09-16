package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import org.jetbrains.annotations.NotNull;

public enum RRWebEventType implements JsonSerializable {
   DomContentLoaded,
   Load,
   FullSnapshot,
   IncrementalSnapshot,
   Meta,
   Custom,
   Plugin;

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.ordinal());
   }

   public static final class Deserializer implements JsonDeserializer<RRWebEventType> {
      @NotNull
      public RRWebEventType deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return RRWebEventType.values()[var1.nextInt()];
      }
   }
}
