package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class TransactionInfo implements JsonSerializable, JsonUnknown {
   @Nullable
   private final String source;
   @Nullable
   private Map<String, Object> unknown;

   public TransactionInfo(@Nullable String var1) {
      this.source = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.source != null) {
         var1.name("source").value(var2, this.source);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   @Nullable
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   public static final class Deserializer implements JsonDeserializer<TransactionInfo> {
      @NotNull
      public TransactionInfo deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         String var3 = null;
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "source":
                  var3 = var1.nextStringOrNull();
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         TransactionInfo var8 = new TransactionInfo(var3);
         var8.setUnknown(var4);
         var1.endObject();
         return var8;
      }
   }

   public static final class JsonKeys {
      public static final String SOURCE = "source";
   }
}
