package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum SpanStatus implements JsonSerializable {
   OK(200, 299),
   CANCELLED(499),
   INTERNAL_ERROR(500),
   UNKNOWN(500),
   UNKNOWN_ERROR(500),
   INVALID_ARGUMENT(400),
   DEADLINE_EXCEEDED(504),
   NOT_FOUND(404),
   ALREADY_EXISTS(409),
   PERMISSION_DENIED(403),
   RESOURCE_EXHAUSTED(429),
   FAILED_PRECONDITION(400),
   ABORTED(409),
   OUT_OF_RANGE(400),
   UNIMPLEMENTED(501),
   UNAVAILABLE(503),
   DATA_LOSS(500),
   UNAUTHENTICATED(401);

   private final int minHttpStatusCode;
   private final int maxHttpStatusCode;

   SpanStatus(int var3) {
      this.minHttpStatusCode = var3;
      this.maxHttpStatusCode = var3;
   }

   SpanStatus(int var3, int var4) {
      this.minHttpStatusCode = var3;
      this.maxHttpStatusCode = var4;
   }

   @Nullable
   public static SpanStatus fromHttpStatusCode(int var0) {
      for (SpanStatus var4 : values()) {
         if (var4.matches(var0)) {
            return var4;
         }
      }

      return null;
   }

   @NotNull
   public static SpanStatus fromHttpStatusCode(@Nullable Integer var0, @NotNull SpanStatus var1) {
      SpanStatus var2 = var0 != null ? fromHttpStatusCode(var0) : var1;
      return var2 != null ? var2 : var1;
   }

   private boolean matches(int var1) {
      return var1 >= this.minHttpStatusCode && var1 <= this.maxHttpStatusCode;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.name().toLowerCase(Locale.ROOT));
   }

   public static final class Deserializer implements JsonDeserializer<SpanStatus> {
      @NotNull
      public SpanStatus deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return SpanStatus.valueOf(var1.nextString().toUpperCase(Locale.ROOT));
      }
   }
}
