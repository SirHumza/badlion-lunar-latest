package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class MonitorSchedule implements JsonSerializable, JsonUnknown {
   @NotNull
   private String type;
   @NotNull
   private String value;
   @Nullable
   private String unit;
   @Nullable
   private Map<String, Object> unknown;

   @NotNull
   public static MonitorSchedule crontab(@NotNull String var0) {
      return new MonitorSchedule(MonitorScheduleType.CRONTAB.apiName(), var0, null);
   }

   @NotNull
   public static MonitorSchedule interval(@NotNull Integer var0, @NotNull MonitorScheduleUnit var1) {
      return new MonitorSchedule(MonitorScheduleType.INTERVAL.apiName(), var0.toString(), var1.apiName());
   }

   @ApiStatus.Internal
   public MonitorSchedule(@NotNull String var1, @NotNull String var2, @Nullable String var3) {
      this.type = var1;
      this.value = var2;
      this.unit = var3;
   }

   @NotNull
   public String getType() {
      return this.type;
   }

   public void setType(@NotNull String var1) {
      this.type = var1;
   }

   @NotNull
   public String getValue() {
      return this.value;
   }

   public void setValue(@NotNull String var1) {
      this.value = var1;
   }

   public void setValue(@NotNull Integer var1) {
      this.value = var1.toString();
   }

   @Nullable
   public String getUnit() {
      return this.unit;
   }

   public void setUnit(@Nullable String var1) {
      this.unit = var1;
   }

   public void setUnit(@Nullable MonitorScheduleUnit var1) {
      this.unit = var1 == null ? null : var1.apiName();
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
      var1.name("type").value(this.type);
      if (MonitorScheduleType.INTERVAL.apiName().equalsIgnoreCase(this.type)) {
         try {
            var1.name("value").value(Integer.valueOf(this.value));
         } catch (Throwable var6) {
            var2.log(SentryLevel.ERROR, "Unable to serialize monitor schedule value: %s", this.value);
         }
      } else {
         var1.name("value").value(this.value);
      }

      if (this.unit != null) {
         var1.name("unit").value(this.unit);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<MonitorSchedule> {
      @NotNull
      public MonitorSchedule deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         String var3 = null;
         String var4 = null;
         String var5 = null;
         HashMap var6 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var7 = var1.nextName();
            switch (var7) {
               case "type":
                  var3 = var1.nextStringOrNull();
                  break;
               case "value":
                  var4 = var1.nextStringOrNull();
                  break;
               case "unit":
                  var5 = var1.nextStringOrNull();
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
            String var12 = "Missing required field \"type\"";
            IllegalStateException var14 = new IllegalStateException(var12);
            var2.log(SentryLevel.ERROR, var12, var14);
            throw var14;
         } else if (var4 == null) {
            String var11 = "Missing required field \"value\"";
            IllegalStateException var13 = new IllegalStateException(var11);
            var2.log(SentryLevel.ERROR, var11, var13);
            throw var13;
         } else {
            MonitorSchedule var10 = new MonitorSchedule(var3, var4, var5);
            var10.setUnknown(var6);
            return var10;
         }
      }
   }

   public static final class JsonKeys {
      public static final String TYPE = "type";
      public static final String VALUE = "value";
      public static final String UNIT = "unit";
   }
}
