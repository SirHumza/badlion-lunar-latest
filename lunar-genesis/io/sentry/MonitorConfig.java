package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class MonitorConfig implements JsonSerializable, JsonUnknown {
   @NotNull
   private MonitorSchedule schedule;
   @Nullable
   private Long checkinMargin;
   @Nullable
   private Long maxRuntime;
   @Nullable
   private String timezone;
   @Nullable
   private Long failureIssueThreshold;
   @Nullable
   private Long recoveryThreshold;
   @Nullable
   private Map<String, Object> unknown;

   public MonitorConfig(@NotNull MonitorSchedule var1) {
      this.schedule = var1;
      SentryOptions.Cron var2 = HubAdapter.getInstance().getOptions().getCron();
      if (var2 != null) {
         this.checkinMargin = var2.getDefaultCheckinMargin();
         this.maxRuntime = var2.getDefaultMaxRuntime();
         this.timezone = var2.getDefaultTimezone();
         this.failureIssueThreshold = var2.getDefaultFailureIssueThreshold();
         this.recoveryThreshold = var2.getDefaultRecoveryThreshold();
      }
   }

   @NotNull
   public MonitorSchedule getSchedule() {
      return this.schedule;
   }

   public void setSchedule(@NotNull MonitorSchedule var1) {
      this.schedule = var1;
   }

   @Nullable
   public Long getCheckinMargin() {
      return this.checkinMargin;
   }

   public void setCheckinMargin(@Nullable Long var1) {
      this.checkinMargin = var1;
   }

   @Nullable
   public Long getMaxRuntime() {
      return this.maxRuntime;
   }

   public void setMaxRuntime(@Nullable Long var1) {
      this.maxRuntime = var1;
   }

   @Nullable
   public String getTimezone() {
      return this.timezone;
   }

   public void setTimezone(@Nullable String var1) {
      this.timezone = var1;
   }

   @Nullable
   public Long getFailureIssueThreshold() {
      return this.failureIssueThreshold;
   }

   public void setFailureIssueThreshold(@Nullable Long var1) {
      this.failureIssueThreshold = var1;
   }

   @Nullable
   public Long getRecoveryThreshold() {
      return this.recoveryThreshold;
   }

   public void setRecoveryThreshold(@Nullable Long var1) {
      this.recoveryThreshold = var1;
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
      var1.name("schedule");
      this.schedule.serialize(var1, var2);
      if (this.checkinMargin != null) {
         var1.name("checkin_margin").value(this.checkinMargin);
      }

      if (this.maxRuntime != null) {
         var1.name("max_runtime").value(this.maxRuntime);
      }

      if (this.timezone != null) {
         var1.name("timezone").value(this.timezone);
      }

      if (this.failureIssueThreshold != null) {
         var1.name("failure_issue_threshold").value(this.failureIssueThreshold);
      }

      if (this.recoveryThreshold != null) {
         var1.name("recovery_threshold").value(this.recoveryThreshold);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<MonitorConfig> {
      @NotNull
      public MonitorConfig deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         MonitorSchedule var3 = null;
         Long var4 = null;
         Long var5 = null;
         String var6 = null;
         Long var7 = null;
         Long var8 = null;
         HashMap var9 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var10 = var1.nextName();
            switch (var10) {
               case "schedule":
                  var3 = new MonitorSchedule.Deserializer().deserialize(var1, var2);
                  break;
               case "checkin_margin":
                  var4 = var1.nextLongOrNull();
                  break;
               case "max_runtime":
                  var5 = var1.nextLongOrNull();
                  break;
               case "timezone":
                  var6 = var1.nextStringOrNull();
                  break;
               case "failure_issue_threshold":
                  var7 = var1.nextLongOrNull();
                  break;
               case "recovery_threshold":
                  var8 = var1.nextLongOrNull();
                  break;
               default:
                  if (var9 == null) {
                     var9 = new HashMap();
                  }

                  var1.nextUnknown(var2, var9, var10);
            }
         }

         var1.endObject();
         if (var3 == null) {
            String var14 = "Missing required field \"schedule\"";
            IllegalStateException var15 = new IllegalStateException(var14);
            var2.log(SentryLevel.ERROR, var14, var15);
            throw var15;
         } else {
            MonitorConfig var13 = new MonitorConfig(var3);
            var13.setCheckinMargin(var4);
            var13.setMaxRuntime(var5);
            var13.setTimezone(var6);
            var13.setFailureIssueThreshold(var7);
            var13.setRecoveryThreshold(var8);
            var13.setUnknown(var9);
            return var13;
         }
      }
   }

   public static final class JsonKeys {
      public static final String SCHEDULE = "schedule";
      public static final String CHECKIN_MARGIN = "checkin_margin";
      public static final String MAX_RUNTIME = "max_runtime";
      public static final String TIMEZONE = "timezone";
      public static final String FAILURE_ISSUE_THRESHOLD = "failure_issue_threshold";
      public static final String RECOVERY_THRESHOLD = "recovery_threshold";
   }
}
