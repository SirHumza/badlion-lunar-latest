package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class SpanId implements JsonSerializable {
   public static final SpanId EMPTY_ID = new SpanId(new UUID(0L, 0L));
   @NotNull
   private final String value;

   public SpanId(@NotNull String var1) {
      this.value = Objects.requireNonNull(var1, "value is required");
   }

   public SpanId() {
      this(UUID.randomUUID());
   }

   private SpanId(@NotNull UUID var1) {
      this(StringUtils.normalizeUUID(var1.toString()).replace("-", "").substring(0, 16));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SpanId var2 = (SpanId)var1;
         return this.value.equals(var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.value.hashCode();
   }

   @Override
   public String toString() {
      return this.value;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.value);
   }

   public static final class Deserializer implements JsonDeserializer<SpanId> {
      @NotNull
      public SpanId deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return new SpanId(var1.nextString());
      }
   }
}
