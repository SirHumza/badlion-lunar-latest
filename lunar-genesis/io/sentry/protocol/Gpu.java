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

public final class Gpu implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "gpu";
   @Nullable
   private String name;
   @Nullable
   private Integer id;
   @Nullable
   private String vendorId;
   @Nullable
   private String vendorName;
   @Nullable
   private Integer memorySize;
   @Nullable
   private String apiType;
   @Nullable
   private Boolean multiThreadedRendering;
   @Nullable
   private String version;
   @Nullable
   private String npotSupport;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public Gpu() {
   }

   Gpu(@NotNull Gpu var1) {
      this.name = var1.name;
      this.id = var1.id;
      this.vendorId = var1.vendorId;
      this.vendorName = var1.vendorName;
      this.memorySize = var1.memorySize;
      this.apiType = var1.apiType;
      this.multiThreadedRendering = var1.multiThreadedRendering;
      this.version = var1.version;
      this.npotSupport = var1.npotSupport;
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   @Nullable
   public Integer getId() {
      return this.id;
   }

   public void setId(Integer var1) {
      this.id = var1;
   }

   @Nullable
   public String getVendorId() {
      return this.vendorId;
   }

   public void setVendorId(@Nullable String var1) {
      this.vendorId = var1;
   }

   @Nullable
   public String getVendorName() {
      return this.vendorName;
   }

   public void setVendorName(@Nullable String var1) {
      this.vendorName = var1;
   }

   @Nullable
   public Integer getMemorySize() {
      return this.memorySize;
   }

   public void setMemorySize(@Nullable Integer var1) {
      this.memorySize = var1;
   }

   @Nullable
   public String getApiType() {
      return this.apiType;
   }

   public void setApiType(@Nullable String var1) {
      this.apiType = var1;
   }

   @Nullable
   public Boolean isMultiThreadedRendering() {
      return this.multiThreadedRendering;
   }

   public void setMultiThreadedRendering(@Nullable Boolean var1) {
      this.multiThreadedRendering = var1;
   }

   @Nullable
   public String getVersion() {
      return this.version;
   }

   public void setVersion(@Nullable String var1) {
      this.version = var1;
   }

   @Nullable
   public String getNpotSupport() {
      return this.npotSupport;
   }

   public void setNpotSupport(@Nullable String var1) {
      this.npotSupport = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Gpu var2 = (Gpu)var1;
         return Objects.equals(this.name, var2.name)
            && Objects.equals(this.id, var2.id)
            && Objects.equals(this.vendorId, var2.vendorId)
            && Objects.equals(this.vendorName, var2.vendorName)
            && Objects.equals(this.memorySize, var2.memorySize)
            && Objects.equals(this.apiType, var2.apiType)
            && Objects.equals(this.multiThreadedRendering, var2.multiThreadedRendering)
            && Objects.equals(this.version, var2.version)
            && Objects.equals(this.npotSupport, var2.npotSupport);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.name, this.id, this.vendorId, this.vendorName, this.memorySize, this.apiType, this.multiThreadedRendering, this.version, this.npotSupport
      );
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.id != null) {
         var1.name("id").value(this.id);
      }

      if (this.vendorId != null) {
         var1.name("vendor_id").value(this.vendorId);
      }

      if (this.vendorName != null) {
         var1.name("vendor_name").value(this.vendorName);
      }

      if (this.memorySize != null) {
         var1.name("memory_size").value(this.memorySize);
      }

      if (this.apiType != null) {
         var1.name("api_type").value(this.apiType);
      }

      if (this.multiThreadedRendering != null) {
         var1.name("multi_threaded_rendering").value(this.multiThreadedRendering);
      }

      if (this.version != null) {
         var1.name("version").value(this.version);
      }

      if (this.npotSupport != null) {
         var1.name("npot_support").value(this.npotSupport);
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

   public static final class Deserializer implements JsonDeserializer<Gpu> {
      @NotNull
      public Gpu deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Gpu var3 = new Gpu();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "name":
                  var3.name = var1.nextStringOrNull();
                  break;
               case "id":
                  var3.id = var1.nextIntegerOrNull();
                  break;
               case "vendor_id":
                  var3.vendorId = var1.nextStringOrNull();
                  break;
               case "vendor_name":
                  var3.vendorName = var1.nextStringOrNull();
                  break;
               case "memory_size":
                  var3.memorySize = var1.nextIntegerOrNull();
                  break;
               case "api_type":
                  var3.apiType = var1.nextStringOrNull();
                  break;
               case "multi_threaded_rendering":
                  var3.multiThreadedRendering = var1.nextBooleanOrNull();
                  break;
               case "version":
                  var3.version = var1.nextStringOrNull();
                  break;
               case "npot_support":
                  var3.npotSupport = var1.nextStringOrNull();
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
      public static final String ID = "id";
      public static final String VENDOR_ID = "vendor_id";
      public static final String VENDOR_NAME = "vendor_name";
      public static final String MEMORY_SIZE = "memory_size";
      public static final String API_TYPE = "api_type";
      public static final String MULTI_THREADED_RENDERING = "multi_threaded_rendering";
      public static final String VERSION = "version";
      public static final String NPOT_SUPPORT = "npot_support";
   }
}
