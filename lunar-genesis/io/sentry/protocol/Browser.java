package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Browser implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "browser";
   @Nullable
   private String name;
   @Nullable
   private String version;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public Browser() {
   }

   Browser(@NotNull Browser var1) {
      this.name = var1.name;
      this.version = var1.version;
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(@Nullable String var1) {
      this.name = var1;
   }

   @Nullable
   public String getVersion() {
      return this.version;
   }

   public void setVersion(@Nullable String var1) {
      this.version = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Browser var2 = (Browser)var1;
         return Objects.equals(this.name, var2.name) && Objects.equals(this.version, var2.version);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.version);
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
      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.version != null) {
         var1.name("version").value(this.version);
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

   public static final class Deserializer implements JsonDeserializer<Browser> {
      @NotNull
      public Browser deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Browser var3 = new Browser();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "name":
                  var3.name = var1.nextStringOrNull();
                  break;
               case "version":
                  var3.version = var1.nextStringOrNull();
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
      public static final String NAME = "name";
      public static final String VERSION = "version";
   }
}
