package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ProfileMeasurementValue implements JsonSerializable, JsonUnknown {
   @Nullable
   private Map<String, Object> unknown;
   @NotNull
   private String relativeStartNs;
   private double value;

   public ProfileMeasurementValue() {
      this(0L, 0);
   }

   public ProfileMeasurementValue(@NotNull Long var1, @NotNull Number var2) {
      this.relativeStartNs = var1.toString();
      this.value = var2.doubleValue();
   }

   public double getValue() {
      return this.value;
   }

   @NotNull
   public String getRelativeStartNs() {
      return this.relativeStartNs;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ProfileMeasurementValue var2 = (ProfileMeasurementValue)var1;
         return Objects.equals(this.unknown, var2.unknown) && this.relativeStartNs.equals(var2.relativeStartNs) && this.value == var2.value;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.unknown, this.relativeStartNs, this.value);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("value").value(var2, this.value);
      var1.name("elapsed_since_start_ns").value(var2, this.relativeStartNs);
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

   public static final class Deserializer implements JsonDeserializer<ProfileMeasurementValue> {
      @NotNull
      public ProfileMeasurementValue deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         ProfileMeasurementValue var3 = new ProfileMeasurementValue();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "value":
                  Double var8 = var1.nextDoubleOrNull();
                  if (var8 != null) {
                     var3.value = var8;
                  }
                  break;
               case "elapsed_since_start_ns":
                  String var9 = var1.nextStringOrNull();
                  if (var9 != null) {
                     var3.relativeStartNs = var9;
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
      public static final String VALUE = "value";
      public static final String START_NS = "elapsed_since_start_ns";
   }
}
