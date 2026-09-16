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

public final class OperatingSystem implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "os";
   @Nullable
   private String name;
   @Nullable
   private String version;
   @Nullable
   private String rawDescription;
   @Nullable
   private String build;
   @Nullable
   private String kernelVersion;
   @Nullable
   private Boolean rooted;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public OperatingSystem() {
   }

   OperatingSystem(@NotNull OperatingSystem var1) {
      this.name = var1.name;
      this.version = var1.version;
      this.rawDescription = var1.rawDescription;
      this.build = var1.build;
      this.kernelVersion = var1.kernelVersion;
      this.rooted = var1.rooted;
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

   @Nullable
   public String getRawDescription() {
      return this.rawDescription;
   }

   public void setRawDescription(@Nullable String var1) {
      this.rawDescription = var1;
   }

   @Nullable
   public String getBuild() {
      return this.build;
   }

   public void setBuild(@Nullable String var1) {
      this.build = var1;
   }

   @Nullable
   public String getKernelVersion() {
      return this.kernelVersion;
   }

   public void setKernelVersion(@Nullable String var1) {
      this.kernelVersion = var1;
   }

   @Nullable
   public Boolean isRooted() {
      return this.rooted;
   }

   public void setRooted(@Nullable Boolean var1) {
      this.rooted = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         OperatingSystem var2 = (OperatingSystem)var1;
         return Objects.equals(this.name, var2.name)
            && Objects.equals(this.version, var2.version)
            && Objects.equals(this.rawDescription, var2.rawDescription)
            && Objects.equals(this.build, var2.build)
            && Objects.equals(this.kernelVersion, var2.kernelVersion)
            && Objects.equals(this.rooted, var2.rooted);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.version, this.rawDescription, this.build, this.kernelVersion, this.rooted);
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

      if (this.rawDescription != null) {
         var1.name("raw_description").value(this.rawDescription);
      }

      if (this.build != null) {
         var1.name("build").value(this.build);
      }

      if (this.kernelVersion != null) {
         var1.name("kernel_version").value(this.kernelVersion);
      }

      if (this.rooted != null) {
         var1.name("rooted").value(this.rooted);
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

   @Nullable
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   public static final class Deserializer implements JsonDeserializer<OperatingSystem> {
      @NotNull
      public OperatingSystem deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         OperatingSystem var3 = new OperatingSystem();
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
               case "raw_description":
                  var3.rawDescription = var1.nextStringOrNull();
                  break;
               case "build":
                  var3.build = var1.nextStringOrNull();
                  break;
               case "kernel_version":
                  var3.kernelVersion = var1.nextStringOrNull();
                  break;
               case "rooted":
                  var3.rooted = var1.nextBooleanOrNull();
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
      public static final String RAW_DESCRIPTION = "raw_description";
      public static final String BUILD = "build";
      public static final String KERNEL_VERSION = "kernel_version";
      public static final String ROOTED = "rooted";
   }
}
