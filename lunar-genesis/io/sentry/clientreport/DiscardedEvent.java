package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class DiscardedEvent implements JsonSerializable, JsonUnknown {
   @NotNull
   private final String reason;
   @NotNull
   private final String category;
   @NotNull
   private final Long quantity;
   @Nullable
   private Map<String, Object> unknown;

   public DiscardedEvent(@NotNull String var1, @NotNull String var2, @NotNull Long var3) {
      this.reason = var1;
      this.category = var2;
      this.quantity = var3;
   }

   @NotNull
   public String getReason() {
      return this.reason;
   }

   @NotNull
   public String getCategory() {
      return this.category;
   }

   @NotNull
   public Long getQuantity() {
      return this.quantity;
   }

   @Override
   public String toString() {
      return "DiscardedEvent{reason='" + this.reason + '\'' + ", category='" + this.category + '\'' + ", quantity=" + this.quantity + '}';
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

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("reason").value(this.reason);
      var1.name("category").value(this.category);
      var1.name("quantity").value(this.quantity);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<DiscardedEvent> {
      @NotNull
      public DiscardedEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         String var3 = null;
         String var4 = null;
         Long var5 = null;
         HashMap var6 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var7 = var1.nextName();
            switch (var7) {
               case "reason":
                  var3 = var1.nextStringOrNull();
                  break;
               case "category":
                  var4 = var1.nextStringOrNull();
                  break;
               case "quantity":
                  var5 = var1.nextLongOrNull();
                  break;
               default:
                  if (var6 == null) {
                     var6 = new HashMap();
                  }

                  var1.nextUnknown(var2, var6, var7);
            }
         }

         var1.endObject();
         if (var3 == null) {
            throw this.missingRequiredFieldException("reason", var2);
         }

         if (var4 == null) {
            throw this.missingRequiredFieldException("category", var2);
         }

         if (var5 == null) {
            throw this.missingRequiredFieldException("quantity", var2);
         }

         DiscardedEvent var10 = new DiscardedEvent(var3, var4, var5);
         var10.setUnknown(var6);
         return var10;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String REASON = "reason";
      public static final String CATEGORY = "category";
      public static final String QUANTITY = "quantity";
   }
}
