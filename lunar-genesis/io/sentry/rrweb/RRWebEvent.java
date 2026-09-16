package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;

public abstract class RRWebEvent {
   @NotNull
   private RRWebEventType type;
   private long timestamp;

   protected RRWebEvent(@NotNull RRWebEventType var1) {
      this.type = var1;
      this.timestamp = System.currentTimeMillis();
   }

   protected RRWebEvent() {
      this(RRWebEventType.Custom);
   }

   @NotNull
   public RRWebEventType getType() {
      return this.type;
   }

   public void setType(@NotNull RRWebEventType var1) {
      this.type = var1;
   }

   public long getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(long var1) {
      this.timestamp = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof RRWebEvent)) {
         return false;
      }

      RRWebEvent var2 = (RRWebEvent)var1;
      return this.timestamp == var2.timestamp && this.type == var2.type;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.timestamp);
   }

   public static final class Deserializer {
      public boolean deserializeValue(@NotNull RRWebEvent var1, @NotNull String var2, @NotNull ObjectReader var3, @NotNull ILogger var4) {
         switch (var2) {
            case "type":
               var1.type = Objects.requireNonNull(var3.nextOrNull(var4, new RRWebEventType.Deserializer()), "");
               return true;
            case "timestamp":
               var1.timestamp = var3.nextLong();
               return true;
            default:
               return false;
         }
      }
   }

   public static final class JsonKeys {
      public static final String TYPE = "type";
      public static final String TIMESTAMP = "timestamp";
      public static final String TAG = "tag";
   }

   public static final class Serializer {
      public void serialize(@NotNull RRWebEvent var1, @NotNull ObjectWriter var2, @NotNull ILogger var3) {
         var2.name("type").value(var3, var1.type);
         var2.name("timestamp").value(var1.timestamp);
      }
   }
}
