package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class MeasurementValue implements JsonSerializable, JsonUnknown {
   public static final String KEY_APP_START_COLD = "app_start_cold";
   public static final String KEY_APP_START_WARM = "app_start_warm";
   public static final String KEY_FRAMES_TOTAL = "frames_total";
   public static final String KEY_FRAMES_SLOW = "frames_slow";
   public static final String KEY_FRAMES_FROZEN = "frames_frozen";
   public static final String KEY_FRAMES_DELAY = "frames_delay";
   public static final String KEY_TIME_TO_INITIAL_DISPLAY = "time_to_initial_display";
   public static final String KEY_TIME_TO_FULL_DISPLAY = "time_to_full_display";
   @NotNull
   private final Number value;
   @Nullable
   private final String unit;
   @Nullable
   private Map<String, Object> unknown;

   public MeasurementValue(@NotNull Number var1, @Nullable String var2) {
      this.value = var1;
      this.unit = var2;
   }

   @TestOnly
   public MeasurementValue(@NotNull Number var1, @Nullable String var2, @Nullable Map<String, Object> var3) {
      this.value = var1;
      this.unit = var2;
      this.unknown = var3;
   }

   @TestOnly
   @NotNull
   public Number getValue() {
      return this.value;
   }

   @Nullable
   public String getUnit() {
      return this.unit;
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
      var1.name("value").value(this.value);
      if (this.unit != null) {
         var1.name("unit").value(this.unit);
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

   public static final class Deserializer implements JsonDeserializer<MeasurementValue> {
      @NotNull
      public MeasurementValue deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         String var3 = null;
         Number var4 = null;
         ConcurrentHashMap var5 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "value":
                  var4 = (Number)var1.nextObjectOrNull();
                  break;
               case "unit":
                  var3 = var1.nextStringOrNull();
                  break;
               default:
                  if (var5 == null) {
                     var5 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var5, var6);
            }
         }

         var1.endObject();
         if (var4 == null) {
            String var10 = "Missing required field \"value\"";
            IllegalStateException var11 = new IllegalStateException("Missing required field \"value\"");
            var2.log(SentryLevel.ERROR, "Missing required field \"value\"", var11);
            throw var11;
         } else {
            MeasurementValue var9 = new MeasurementValue(var4, var3);
            var9.setUnknown(var5);
            return var9;
         }
      }
   }

   public static final class JsonKeys {
      public static final String VALUE = "value";
      public static final String UNIT = "unit";
   }
}
