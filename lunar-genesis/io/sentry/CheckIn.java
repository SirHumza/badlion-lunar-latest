package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class CheckIn implements JsonSerializable, JsonUnknown {
   @NotNull
   private final SentryId checkInId;
   @NotNull
   private String monitorSlug;
   @NotNull
   private String status;
   @Nullable
   private Double duration;
   @Nullable
   private String release;
   @Nullable
   private String environment;
   @NotNull
   private final MonitorContexts contexts = new MonitorContexts();
   @Nullable
   private MonitorConfig monitorConfig;
   @Nullable
   private Map<String, Object> unknown;

   public CheckIn(@NotNull String var1, @NotNull CheckInStatus var2) {
      this(null, var1, var2.apiName());
   }

   public CheckIn(@Nullable SentryId var1, @NotNull String var2, @NotNull CheckInStatus var3) {
      this(var1, var2, var3.apiName());
   }

   @ApiStatus.Internal
   public CheckIn(@Nullable SentryId var1, @NotNull String var2, @NotNull String var3) {
      this.checkInId = var1 == null ? new SentryId() : var1;
      this.monitorSlug = var2;
      this.status = var3;
   }

   @NotNull
   public SentryId getCheckInId() {
      return this.checkInId;
   }

   @NotNull
   public String getMonitorSlug() {
      return this.monitorSlug;
   }

   public void setMonitorSlug(@NotNull String var1) {
      this.monitorSlug = var1;
   }

   @NotNull
   public String getStatus() {
      return this.status;
   }

   public void setStatus(@NotNull String var1) {
      this.status = var1;
   }

   public void setStatus(@NotNull CheckInStatus var1) {
      this.status = var1.apiName();
   }

   @Nullable
   public Double getDuration() {
      return this.duration;
   }

   public void setDuration(@Nullable Double var1) {
      this.duration = var1;
   }

   @Nullable
   public String getRelease() {
      return this.release;
   }

   public void setRelease(@Nullable String var1) {
      this.release = var1;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment;
   }

   public void setEnvironment(@Nullable String var1) {
      this.environment = var1;
   }

   @Nullable
   public MonitorConfig getMonitorConfig() {
      return this.monitorConfig;
   }

   public void setMonitorConfig(@Nullable MonitorConfig var1) {
      this.monitorConfig = var1;
   }

   @NotNull
   public MonitorContexts getContexts() {
      return this.contexts;
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
      var1.name("check_in_id");
      this.checkInId.serialize(var1, var2);
      var1.name("monitor_slug").value(this.monitorSlug);
      var1.name("status").value(this.status);
      if (this.duration != null) {
         var1.name("duration").value(this.duration);
      }

      if (this.release != null) {
         var1.name("release").value(this.release);
      }

      if (this.environment != null) {
         var1.name("environment").value(this.environment);
      }

      if (this.monitorConfig != null) {
         var1.name("monitor_config");
         this.monitorConfig.serialize(var1, var2);
      }

      if (this.contexts != null) {
         var1.name("contexts");
         this.contexts.serialize(var1, var2);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<CheckIn> {
      @NotNull
      public CheckIn deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryId var3 = null;
         MonitorConfig var4 = null;
         String var5 = null;
         String var6 = null;
         Double var7 = null;
         String var8 = null;
         String var9 = null;
         MonitorContexts var10 = null;
         HashMap var11 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var12 = var1.nextName();
            switch (var12) {
               case "check_in_id":
                  var3 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               case "monitor_slug":
                  var5 = var1.nextStringOrNull();
                  break;
               case "status":
                  var6 = var1.nextStringOrNull();
                  break;
               case "duration":
                  var7 = var1.nextDoubleOrNull();
                  break;
               case "release":
                  var8 = var1.nextStringOrNull();
                  break;
               case "environment":
                  var9 = var1.nextStringOrNull();
                  break;
               case "monitor_config":
                  var4 = new MonitorConfig.Deserializer().deserialize(var1, var2);
                  break;
               case "contexts":
                  var10 = new MonitorContexts.Deserializer().deserialize(var1, var2);
                  break;
               default:
                  if (var11 == null) {
                     var11 = new HashMap();
                  }

                  var1.nextUnknown(var2, var11, var12);
            }
         }

         var1.endObject();
         if (var3 == null) {
            String var18 = "Missing required field \"check_in_id\"";
            IllegalStateException var21 = new IllegalStateException(var18);
            var2.log(SentryLevel.ERROR, var18, var21);
            throw var21;
         } else if (var5 == null) {
            String var17 = "Missing required field \"monitor_slug\"";
            IllegalStateException var20 = new IllegalStateException(var17);
            var2.log(SentryLevel.ERROR, var17, var20);
            throw var20;
         } else if (var6 == null) {
            String var16 = "Missing required field \"status\"";
            IllegalStateException var19 = new IllegalStateException(var16);
            var2.log(SentryLevel.ERROR, var16, var19);
            throw var19;
         } else {
            CheckIn var15 = new CheckIn(var3, var5, var6);
            var15.setDuration(var7);
            var15.setRelease(var8);
            var15.setEnvironment(var9);
            var15.setMonitorConfig(var4);
            var15.getContexts().putAll(var10);
            var15.setUnknown(var11);
            return var15;
         }
      }
   }

   public static final class JsonKeys {
      public static final String CHECK_IN_ID = "check_in_id";
      public static final String MONITOR_SLUG = "monitor_slug";
      public static final String STATUS = "status";
      public static final String DURATION = "duration";
      public static final String RELEASE = "release";
      public static final String ENVIRONMENT = "environment";
      public static final String CONTEXTS = "contexts";
      public static final String MONITOR_CONFIG = "monitor_config";
   }
}
