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
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class App implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "app";
   @Nullable
   private String appIdentifier;
   @Nullable
   private Date appStartTime;
   @Nullable
   private String deviceAppHash;
   @Nullable
   private String buildType;
   @Nullable
   private String appName;
   @Nullable
   private String appVersion;
   @Nullable
   private String appBuild;
   @Nullable
   private Map<String, String> permissions;
   @Nullable
   private List<String> viewNames;
   @Nullable
   private String startType;
   @Nullable
   private Boolean inForeground;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public App() {
   }

   App(@NotNull App var1) {
      this.appBuild = var1.appBuild;
      this.appIdentifier = var1.appIdentifier;
      this.appName = var1.appName;
      this.appStartTime = var1.appStartTime;
      this.appVersion = var1.appVersion;
      this.buildType = var1.buildType;
      this.deviceAppHash = var1.deviceAppHash;
      this.permissions = CollectionUtils.newConcurrentHashMap(var1.permissions);
      this.inForeground = var1.inForeground;
      this.viewNames = CollectionUtils.newArrayList(var1.viewNames);
      this.startType = var1.startType;
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
   }

   @Nullable
   public String getAppIdentifier() {
      return this.appIdentifier;
   }

   public void setAppIdentifier(@Nullable String var1) {
      this.appIdentifier = var1;
   }

   @Nullable
   public Date getAppStartTime() {
      Date var1 = this.appStartTime;
      return var1 != null ? (Date)var1.clone() : null;
   }

   public void setAppStartTime(@Nullable Date var1) {
      this.appStartTime = var1;
   }

   @Nullable
   public String getDeviceAppHash() {
      return this.deviceAppHash;
   }

   public void setDeviceAppHash(@Nullable String var1) {
      this.deviceAppHash = var1;
   }

   @Nullable
   public String getBuildType() {
      return this.buildType;
   }

   public void setBuildType(@Nullable String var1) {
      this.buildType = var1;
   }

   @Nullable
   public String getAppName() {
      return this.appName;
   }

   public void setAppName(@Nullable String var1) {
      this.appName = var1;
   }

   @Nullable
   public String getAppVersion() {
      return this.appVersion;
   }

   public void setAppVersion(@Nullable String var1) {
      this.appVersion = var1;
   }

   @Nullable
   public String getAppBuild() {
      return this.appBuild;
   }

   public void setAppBuild(@Nullable String var1) {
      this.appBuild = var1;
   }

   @Nullable
   public Map<String, String> getPermissions() {
      return this.permissions;
   }

   public void setPermissions(@Nullable Map<String, String> var1) {
      this.permissions = var1;
   }

   @Nullable
   public Boolean getInForeground() {
      return this.inForeground;
   }

   public void setInForeground(@Nullable Boolean var1) {
      this.inForeground = var1;
   }

   @Nullable
   public List<String> getViewNames() {
      return this.viewNames;
   }

   public void setViewNames(@Nullable List<String> var1) {
      this.viewNames = var1;
   }

   @Nullable
   public String getStartType() {
      return this.startType;
   }

   public void setStartType(@Nullable String var1) {
      this.startType = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         App var2 = (App)var1;
         return Objects.equals(this.appIdentifier, var2.appIdentifier)
            && Objects.equals(this.appStartTime, var2.appStartTime)
            && Objects.equals(this.deviceAppHash, var2.deviceAppHash)
            && Objects.equals(this.buildType, var2.buildType)
            && Objects.equals(this.appName, var2.appName)
            && Objects.equals(this.appVersion, var2.appVersion)
            && Objects.equals(this.appBuild, var2.appBuild)
            && Objects.equals(this.permissions, var2.permissions)
            && Objects.equals(this.inForeground, var2.inForeground)
            && Objects.equals(this.viewNames, var2.viewNames)
            && Objects.equals(this.startType, var2.startType);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.appIdentifier,
         this.appStartTime,
         this.deviceAppHash,
         this.buildType,
         this.appName,
         this.appVersion,
         this.appBuild,
         this.permissions,
         this.inForeground,
         this.viewNames,
         this.startType
      );
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
      if (this.appIdentifier != null) {
         var1.name("app_identifier").value(this.appIdentifier);
      }

      if (this.appStartTime != null) {
         var1.name("app_start_time").value(var2, this.appStartTime);
      }

      if (this.deviceAppHash != null) {
         var1.name("device_app_hash").value(this.deviceAppHash);
      }

      if (this.buildType != null) {
         var1.name("build_type").value(this.buildType);
      }

      if (this.appName != null) {
         var1.name("app_name").value(this.appName);
      }

      if (this.appVersion != null) {
         var1.name("app_version").value(this.appVersion);
      }

      if (this.appBuild != null) {
         var1.name("app_build").value(this.appBuild);
      }

      if (this.permissions != null && !this.permissions.isEmpty()) {
         var1.name("permissions").value(var2, this.permissions);
      }

      if (this.inForeground != null) {
         var1.name("in_foreground").value(this.inForeground);
      }

      if (this.viewNames != null) {
         var1.name("view_names").value(var2, this.viewNames);
      }

      if (this.startType != null) {
         var1.name("start_type").value(this.startType);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<App> {
      @NotNull
      public App deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         App var3 = new App();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "app_identifier":
                  var3.appIdentifier = var1.nextStringOrNull();
                  break;
               case "app_start_time":
                  var3.appStartTime = var1.nextDateOrNull(var2);
                  break;
               case "device_app_hash":
                  var3.deviceAppHash = var1.nextStringOrNull();
                  break;
               case "build_type":
                  var3.buildType = var1.nextStringOrNull();
                  break;
               case "app_name":
                  var3.appName = var1.nextStringOrNull();
                  break;
               case "app_version":
                  var3.appVersion = var1.nextStringOrNull();
                  break;
               case "app_build":
                  var3.appBuild = var1.nextStringOrNull();
                  break;
               case "permissions":
                  var3.permissions = CollectionUtils.newConcurrentHashMap((Map<String, String>)var1.nextObjectOrNull());
                  break;
               case "in_foreground":
                  var3.inForeground = var1.nextBooleanOrNull();
                  break;
               case "view_names":
                  List var8 = (List)var1.nextObjectOrNull();
                  if (var8 != null) {
                     var3.setViewNames(var8);
                  }
                  break;
               case "start_type":
                  var3.startType = var1.nextStringOrNull();
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
      public static final String APP_IDENTIFIER = "app_identifier";
      public static final String APP_START_TIME = "app_start_time";
      public static final String DEVICE_APP_HASH = "device_app_hash";
      public static final String BUILD_TYPE = "build_type";
      public static final String APP_NAME = "app_name";
      public static final String APP_VERSION = "app_version";
      public static final String APP_BUILD = "app_build";
      public static final String APP_PERMISSIONS = "permissions";
      public static final String IN_FOREGROUND = "in_foreground";
      public static final String VIEW_NAMES = "view_names";
      public static final String START_TYPE = "start_type";
   }
}
