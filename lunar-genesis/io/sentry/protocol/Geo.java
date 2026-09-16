package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Geo implements JsonSerializable, JsonUnknown {
   @Nullable
   private String city;
   @Nullable
   private String countryCode;
   @Nullable
   private String region;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public Geo() {
   }

   public Geo(@NotNull Geo var1) {
      this.city = var1.city;
      this.countryCode = var1.countryCode;
      this.region = var1.region;
   }

   public static Geo fromMap(@NotNull Map<String, Object> var0) {
      Geo var1 = new Geo();

      for (Entry var3 : var0.entrySet()) {
         Object var4 = var3.getValue();
         switch ((String)var3.getKey()) {
            case "city":
               var1.city = var4 instanceof String ? (String)var4 : null;
               break;
            case "country_code":
               var1.countryCode = var4 instanceof String ? (String)var4 : null;
               break;
            case "region":
               var1.region = var4 instanceof String ? (String)var4 : null;
         }
      }

      return var1;
   }

   @Nullable
   public String getCity() {
      return this.city;
   }

   public void setCity(@Nullable String var1) {
      this.city = var1;
   }

   @Nullable
   public String getCountryCode() {
      return this.countryCode;
   }

   public void setCountryCode(@Nullable String var1) {
      this.countryCode = var1;
   }

   @Nullable
   public String getRegion() {
      return this.region;
   }

   public void setRegion(@Nullable String var1) {
      this.region = var1;
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
      if (this.city != null) {
         var1.name("city").value(this.city);
      }

      if (this.countryCode != null) {
         var1.name("country_code").value(this.countryCode);
      }

      if (this.region != null) {
         var1.name("region").value(this.region);
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

   public static final class Deserializer implements JsonDeserializer<Geo> {
      @NotNull
      public Geo deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Geo var3 = new Geo();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "city":
                  var3.city = var1.nextStringOrNull();
                  break;
               case "country_code":
                  var3.countryCode = var1.nextStringOrNull();
                  break;
               case "region":
                  var3.region = var1.nextStringOrNull();
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
      public static final String CITY = "city";
      public static final String COUNTRY_CODE = "country_code";
      public static final String REGION = "region";
   }
}
