package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Message implements JsonSerializable, JsonUnknown {
   @Nullable
   private String formatted;
   @Nullable
   private String message;
   @Nullable
   private List<String> params;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public String getFormatted() {
      return this.formatted;
   }

   public void setFormatted(@Nullable String var1) {
      this.formatted = var1;
   }

   @Nullable
   public String getMessage() {
      return this.message;
   }

   public void setMessage(@Nullable String var1) {
      this.message = var1;
   }

   @Nullable
   public List<String> getParams() {
      return this.params;
   }

   public void setParams(@Nullable List<String> var1) {
      this.params = CollectionUtils.newArrayList(var1);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.formatted != null) {
         var1.name("formatted").value(this.formatted);
      }

      if (this.message != null) {
         var1.name("message").value(this.message);
      }

      if (this.params != null && !this.params.isEmpty()) {
         var1.name("params").value(var2, this.params);
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

   public static final class Deserializer implements JsonDeserializer<Message> {
      @NotNull
      public Message deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Message var3 = new Message();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "formatted":
                  var3.formatted = var1.nextStringOrNull();
                  break;
               case "message":
                  var3.message = var1.nextStringOrNull();
                  break;
               case "params":
                  List var8 = (List)var1.nextObjectOrNull();
                  if (var8 != null) {
                     var3.params = var8;
                  }
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String FORMATTED = "formatted";
      public static final String MESSAGE = "message";
      public static final String PARAMS = "params";
   }
}
