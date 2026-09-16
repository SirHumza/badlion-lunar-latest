package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.StringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryId implements JsonSerializable {
   @NotNull
   private final UUID uuid;
   public static final SentryId EMPTY_ID = new SentryId(new UUID(0L, 0L));

   public SentryId() {
      this((UUID)null);
   }

   public SentryId(@Nullable UUID var1) {
      if (var1 == null) {
         var1 = UUID.randomUUID();
      }

      this.uuid = var1;
   }

   public SentryId(@NotNull String var1) {
      this.uuid = this.fromStringSentryId(StringUtils.normalizeUUID(var1));
   }

   @Override
   public String toString() {
      return StringUtils.normalizeUUID(this.uuid.toString()).replace("-", "");
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SentryId var2 = (SentryId)var1;
         return this.uuid.compareTo(var2.uuid) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.uuid.hashCode();
   }

   @NotNull
   private UUID fromStringSentryId(@NotNull String var1) {
      if (var1.length() == 32) {
         var1 = new StringBuilder(var1).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
      }

      if (var1.length() != 36) {
         throw new IllegalArgumentException(
            "String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + var1
         );
      } else {
         return UUID.fromString(var1);
      }
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.toString());
   }

   public static final class Deserializer implements JsonDeserializer<SentryId> {
      @NotNull
      public SentryId deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return new SentryId(var1.nextString());
      }
   }
}
