package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public enum SentryLevel implements JsonSerializable {
   DEBUG,
   INFO,
   WARNING,
   ERROR,
   FATAL;

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.name().toLowerCase(Locale.ROOT));
   }

   public static final class Deserializer implements JsonDeserializer<SentryLevel> {
      @NotNull
      public SentryLevel deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return SentryLevel.valueOf(var1.nextString().toUpperCase(Locale.ROOT));
      }
   }
}
