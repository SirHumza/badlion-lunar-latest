package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SdkInfo implements JsonSerializable, JsonUnknown {
   @Nullable
   private String sdkName;
   @Nullable
   private Integer versionMajor;
   @Nullable
   private Integer versionMinor;
   @Nullable
   private Integer versionPatchlevel;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public String getSdkName() {
      return this.sdkName;
   }

   public void setSdkName(@Nullable String var1) {
      this.sdkName = var1;
   }

   @Nullable
   public Integer getVersionMajor() {
      return this.versionMajor;
   }

   public void setVersionMajor(@Nullable Integer var1) {
      this.versionMajor = var1;
   }

   @Nullable
   public Integer getVersionMinor() {
      return this.versionMinor;
   }

   public void setVersionMinor(@Nullable Integer var1) {
      this.versionMinor = var1;
   }

   @Nullable
   public Integer getVersionPatchlevel() {
      return this.versionPatchlevel;
   }

   public void setVersionPatchlevel(@Nullable Integer var1) {
      this.versionPatchlevel = var1;
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
      if (this.sdkName != null) {
         var1.name("sdk_name").value(this.sdkName);
      }

      if (this.versionMajor != null) {
         var1.name("version_major").value(this.versionMajor);
      }

      if (this.versionMinor != null) {
         var1.name("version_minor").value(this.versionMinor);
      }

      if (this.versionPatchlevel != null) {
         var1.name("version_patchlevel").value(this.versionPatchlevel);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<SdkInfo> {
      @NotNull
      public SdkInfo deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SdkInfo var3 = new SdkInfo();
         HashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "sdk_name":
                  var3.sdkName = var1.nextStringOrNull();
                  break;
               case "version_major":
                  var3.versionMajor = var1.nextIntegerOrNull();
                  break;
               case "version_minor":
                  var3.versionMinor = var1.nextIntegerOrNull();
                  break;
               case "version_patchlevel":
                  var3.versionPatchlevel = var1.nextIntegerOrNull();
                  break;
               default:
                  if (var4 == null) {
                     var4 = new HashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var1.endObject();
         var3.setUnknown(var4);
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String SDK_NAME = "sdk_name";
      public static final String VERSION_MAJOR = "version_major";
      public static final String VERSION_MINOR = "version_minor";
      public static final String VERSION_PATCHLEVEL = "version_patchlevel";
   }
}
