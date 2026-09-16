package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ProfileMeasurement implements JsonSerializable, JsonUnknown {
   public static final String ID_FROZEN_FRAME_RENDERS = "frozen_frame_renders";
   public static final String ID_SLOW_FRAME_RENDERS = "slow_frame_renders";
   public static final String ID_SCREEN_FRAME_RATES = "screen_frame_rates";
   public static final String ID_CPU_USAGE = "cpu_usage";
   public static final String ID_MEMORY_FOOTPRINT = "memory_footprint";
   public static final String ID_MEMORY_NATIVE_FOOTPRINT = "memory_native_footprint";
   public static final String ID_UNKNOWN = "unknown";
   public static final String UNIT_HZ = "hz";
   public static final String UNIT_NANOSECONDS = "nanosecond";
   public static final String UNIT_BYTES = "byte";
   public static final String UNIT_PERCENT = "percent";
   public static final String UNIT_UNKNOWN = "unknown";
   @Nullable
   private Map<String, Object> unknown;
   @NotNull
   private String unit;
   @NotNull
   private Collection<ProfileMeasurementValue> values;

   public ProfileMeasurement() {
      this("unknown", new ArrayList<>());
   }

   public ProfileMeasurement(@NotNull String var1, @NotNull Collection<ProfileMeasurementValue> var2) {
      this.unit = var1;
      this.values = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ProfileMeasurement var2 = (ProfileMeasurement)var1;
         return Objects.equals(this.unknown, var2.unknown) && this.unit.equals(var2.unit) && new ArrayList<>(this.values).equals(new ArrayList<>(var2.values));
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.unknown, this.unit, this.values);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("unit").value(var2, this.unit);
      var1.name("values").value(var2, this.values);
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

   @NotNull
   public String getUnit() {
      return this.unit;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   public void setUnit(@NotNull String var1) {
      this.unit = var1;
   }

   @NotNull
   public Collection<ProfileMeasurementValue> getValues() {
      return this.values;
   }

   public void setValues(@NotNull Collection<ProfileMeasurementValue> var1) {
      this.values = var1;
   }

   public static final class Deserializer implements JsonDeserializer<ProfileMeasurement> {
      @NotNull
      public ProfileMeasurement deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         ProfileMeasurement var3 = new ProfileMeasurement();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "unit":
                  String var8 = var1.nextStringOrNull();
                  if (var8 != null) {
                     var3.unit = var8;
                  }
                  break;
               case "values":
                  List var9 = var1.nextListOrNull(var2, new ProfileMeasurementValue.Deserializer());
                  if (var9 != null) {
                     var3.values = var9;
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
      public static final String UNIT = "unit";
      public static final String VALUES = "values";
   }
}
