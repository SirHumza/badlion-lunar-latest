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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Device implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "device";
   @Nullable
   private String name;
   @Nullable
   private String manufacturer;
   @Nullable
   private String brand;
   @Nullable
   private String family;
   @Nullable
   private String model;
   @Nullable
   private String modelId;
   @Nullable
   private String[] archs;
   @Nullable
   private Float batteryLevel;
   @Nullable
   private Boolean charging;
   @Nullable
   private Boolean online;
   @Nullable
   private Device.DeviceOrientation orientation;
   @Nullable
   private Boolean simulator;
   @Nullable
   private Long memorySize;
   @Nullable
   private Long freeMemory;
   @Nullable
   private Long usableMemory;
   @Nullable
   private Boolean lowMemory;
   @Nullable
   private Long storageSize;
   @Nullable
   private Long freeStorage;
   @Nullable
   private Long externalStorageSize;
   @Nullable
   private Long externalFreeStorage;
   @Nullable
   private Integer screenWidthPixels;
   @Nullable
   private Integer screenHeightPixels;
   @Nullable
   private Float screenDensity;
   @Nullable
   private Integer screenDpi;
   @Nullable
   private Date bootTime;
   @Nullable
   private TimeZone timezone;
   @Nullable
   private String id;
   @Deprecated
   @Nullable
   private String language;
   @Nullable
   private String locale;
   @Nullable
   private String connectionType;
   @Nullable
   private Float batteryTemperature;
   @Nullable
   private Integer processorCount;
   @Nullable
   private Double processorFrequency;
   @Nullable
   private String cpuDescription;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public Device() {
   }

   Device(@NotNull Device var1) {
      this.name = var1.name;
      this.manufacturer = var1.manufacturer;
      this.brand = var1.brand;
      this.family = var1.family;
      this.model = var1.model;
      this.modelId = var1.modelId;
      this.charging = var1.charging;
      this.online = var1.online;
      this.orientation = var1.orientation;
      this.simulator = var1.simulator;
      this.memorySize = var1.memorySize;
      this.freeMemory = var1.freeMemory;
      this.usableMemory = var1.usableMemory;
      this.lowMemory = var1.lowMemory;
      this.storageSize = var1.storageSize;
      this.freeStorage = var1.freeStorage;
      this.externalStorageSize = var1.externalStorageSize;
      this.externalFreeStorage = var1.externalFreeStorage;
      this.screenWidthPixels = var1.screenWidthPixels;
      this.screenHeightPixels = var1.screenHeightPixels;
      this.screenDensity = var1.screenDensity;
      this.screenDpi = var1.screenDpi;
      this.bootTime = var1.bootTime;
      this.id = var1.id;
      this.language = var1.language;
      this.connectionType = var1.connectionType;
      this.batteryTemperature = var1.batteryTemperature;
      this.batteryLevel = var1.batteryLevel;
      String[] var2 = var1.archs;
      this.archs = var2 != null ? (String[])var2.clone() : null;
      this.locale = var1.locale;
      TimeZone var3 = var1.timezone;
      this.timezone = var3 != null ? (TimeZone)var3.clone() : null;
      this.processorCount = var1.processorCount;
      this.processorFrequency = var1.processorFrequency;
      this.cpuDescription = var1.cpuDescription;
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
   public String getManufacturer() {
      return this.manufacturer;
   }

   public void setManufacturer(@Nullable String var1) {
      this.manufacturer = var1;
   }

   @Nullable
   public String getBrand() {
      return this.brand;
   }

   public void setBrand(@Nullable String var1) {
      this.brand = var1;
   }

   @Nullable
   public String getFamily() {
      return this.family;
   }

   public void setFamily(@Nullable String var1) {
      this.family = var1;
   }

   @Nullable
   public String getModel() {
      return this.model;
   }

   public void setModel(@Nullable String var1) {
      this.model = var1;
   }

   @Nullable
   public String getModelId() {
      return this.modelId;
   }

   public void setModelId(@Nullable String var1) {
      this.modelId = var1;
   }

   @Nullable
   public Float getBatteryLevel() {
      return this.batteryLevel;
   }

   public void setBatteryLevel(@Nullable Float var1) {
      this.batteryLevel = var1;
   }

   @Nullable
   public Boolean isCharging() {
      return this.charging;
   }

   public void setCharging(@Nullable Boolean var1) {
      this.charging = var1;
   }

   @Nullable
   public Boolean isOnline() {
      return this.online;
   }

   public void setOnline(@Nullable Boolean var1) {
      this.online = var1;
   }

   @Nullable
   public Device.DeviceOrientation getOrientation() {
      return this.orientation;
   }

   public void setOrientation(@Nullable Device.DeviceOrientation var1) {
      this.orientation = var1;
   }

   @Nullable
   public Boolean isSimulator() {
      return this.simulator;
   }

   public void setSimulator(@Nullable Boolean var1) {
      this.simulator = var1;
   }

   @Nullable
   public Long getMemorySize() {
      return this.memorySize;
   }

   public void setMemorySize(@Nullable Long var1) {
      this.memorySize = var1;
   }

   @Nullable
   public Long getFreeMemory() {
      return this.freeMemory;
   }

   public void setFreeMemory(@Nullable Long var1) {
      this.freeMemory = var1;
   }

   @Nullable
   public Long getUsableMemory() {
      return this.usableMemory;
   }

   public void setUsableMemory(@Nullable Long var1) {
      this.usableMemory = var1;
   }

   @Nullable
   public Boolean isLowMemory() {
      return this.lowMemory;
   }

   public void setLowMemory(@Nullable Boolean var1) {
      this.lowMemory = var1;
   }

   @Nullable
   public Long getStorageSize() {
      return this.storageSize;
   }

   public void setStorageSize(@Nullable Long var1) {
      this.storageSize = var1;
   }

   @Nullable
   public Long getFreeStorage() {
      return this.freeStorage;
   }

   public void setFreeStorage(@Nullable Long var1) {
      this.freeStorage = var1;
   }

   @Nullable
   public Long getExternalStorageSize() {
      return this.externalStorageSize;
   }

   public void setExternalStorageSize(@Nullable Long var1) {
      this.externalStorageSize = var1;
   }

   @Nullable
   public Long getExternalFreeStorage() {
      return this.externalFreeStorage;
   }

   public void setExternalFreeStorage(@Nullable Long var1) {
      this.externalFreeStorage = var1;
   }

   @Nullable
   public Float getScreenDensity() {
      return this.screenDensity;
   }

   public void setScreenDensity(@Nullable Float var1) {
      this.screenDensity = var1;
   }

   @Nullable
   public Integer getScreenDpi() {
      return this.screenDpi;
   }

   public void setScreenDpi(@Nullable Integer var1) {
      this.screenDpi = var1;
   }

   @Nullable
   public Date getBootTime() {
      Date var1 = this.bootTime;
      return var1 != null ? (Date)var1.clone() : null;
   }

   public void setBootTime(@Nullable Date var1) {
      this.bootTime = var1;
   }

   @Nullable
   public TimeZone getTimezone() {
      return this.timezone;
   }

   public void setTimezone(@Nullable TimeZone var1) {
      this.timezone = var1;
   }

   @Nullable
   public String[] getArchs() {
      return this.archs;
   }

   public void setArchs(@Nullable String[] var1) {
      this.archs = var1;
   }

   @Nullable
   public Integer getScreenWidthPixels() {
      return this.screenWidthPixels;
   }

   public void setScreenWidthPixels(@Nullable Integer var1) {
      this.screenWidthPixels = var1;
   }

   @Nullable
   public Integer getScreenHeightPixels() {
      return this.screenHeightPixels;
   }

   public void setScreenHeightPixels(@Nullable Integer var1) {
      this.screenHeightPixels = var1;
   }

   @Nullable
   public String getId() {
      return this.id;
   }

   public void setId(@Nullable String var1) {
      this.id = var1;
   }

   @Nullable
   public String getLanguage() {
      return this.language;
   }

   public void setLanguage(@Nullable String var1) {
      this.language = var1;
   }

   @Nullable
   public String getConnectionType() {
      return this.connectionType;
   }

   public void setConnectionType(@Nullable String var1) {
      this.connectionType = var1;
   }

   @Nullable
   public Float getBatteryTemperature() {
      return this.batteryTemperature;
   }

   public void setBatteryTemperature(@Nullable Float var1) {
      this.batteryTemperature = var1;
   }

   @Nullable
   public Integer getProcessorCount() {
      return this.processorCount;
   }

   public void setProcessorCount(@Nullable Integer var1) {
      this.processorCount = var1;
   }

   @Nullable
   public Double getProcessorFrequency() {
      return this.processorFrequency;
   }

   public void setProcessorFrequency(@Nullable Double var1) {
      this.processorFrequency = var1;
   }

   @Nullable
   public String getCpuDescription() {
      return this.cpuDescription;
   }

   public void setCpuDescription(@Nullable String var1) {
      this.cpuDescription = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Device var2 = (Device)var1;
         return Objects.equals(this.name, var2.name)
            && Objects.equals(this.manufacturer, var2.manufacturer)
            && Objects.equals(this.brand, var2.brand)
            && Objects.equals(this.family, var2.family)
            && Objects.equals(this.model, var2.model)
            && Objects.equals(this.modelId, var2.modelId)
            && Arrays.equals(this.archs, var2.archs)
            && Objects.equals(this.batteryLevel, var2.batteryLevel)
            && Objects.equals(this.charging, var2.charging)
            && Objects.equals(this.online, var2.online)
            && this.orientation == var2.orientation
            && Objects.equals(this.simulator, var2.simulator)
            && Objects.equals(this.memorySize, var2.memorySize)
            && Objects.equals(this.freeMemory, var2.freeMemory)
            && Objects.equals(this.usableMemory, var2.usableMemory)
            && Objects.equals(this.lowMemory, var2.lowMemory)
            && Objects.equals(this.storageSize, var2.storageSize)
            && Objects.equals(this.freeStorage, var2.freeStorage)
            && Objects.equals(this.externalStorageSize, var2.externalStorageSize)
            && Objects.equals(this.externalFreeStorage, var2.externalFreeStorage)
            && Objects.equals(this.screenWidthPixels, var2.screenWidthPixels)
            && Objects.equals(this.screenHeightPixels, var2.screenHeightPixels)
            && Objects.equals(this.screenDensity, var2.screenDensity)
            && Objects.equals(this.screenDpi, var2.screenDpi)
            && Objects.equals(this.bootTime, var2.bootTime)
            && Objects.equals(this.id, var2.id)
            && Objects.equals(this.language, var2.language)
            && Objects.equals(this.locale, var2.locale)
            && Objects.equals(this.connectionType, var2.connectionType)
            && Objects.equals(this.batteryTemperature, var2.batteryTemperature)
            && Objects.equals(this.processorCount, var2.processorCount)
            && Objects.equals(this.processorFrequency, var2.processorFrequency)
            && Objects.equals(this.cpuDescription, var2.cpuDescription);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = Objects.hash(
         this.name,
         this.manufacturer,
         this.brand,
         this.family,
         this.model,
         this.modelId,
         this.batteryLevel,
         this.charging,
         this.online,
         this.orientation,
         this.simulator,
         this.memorySize,
         this.freeMemory,
         this.usableMemory,
         this.lowMemory,
         this.storageSize,
         this.freeStorage,
         this.externalStorageSize,
         this.externalFreeStorage,
         this.screenWidthPixels,
         this.screenHeightPixels,
         this.screenDensity,
         this.screenDpi,
         this.bootTime,
         this.timezone,
         this.id,
         this.language,
         this.locale,
         this.connectionType,
         this.batteryTemperature,
         this.processorCount,
         this.processorFrequency,
         this.cpuDescription
      );
      return 31 * var1 + Arrays.hashCode(this.archs);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.manufacturer != null) {
         var1.name("manufacturer").value(this.manufacturer);
      }

      if (this.brand != null) {
         var1.name("brand").value(this.brand);
      }

      if (this.family != null) {
         var1.name("family").value(this.family);
      }

      if (this.model != null) {
         var1.name("model").value(this.model);
      }

      if (this.modelId != null) {
         var1.name("model_id").value(this.modelId);
      }

      if (this.archs != null) {
         var1.name("archs").value(var2, this.archs);
      }

      if (this.batteryLevel != null) {
         var1.name("battery_level").value(this.batteryLevel);
      }

      if (this.charging != null) {
         var1.name("charging").value(this.charging);
      }

      if (this.online != null) {
         var1.name("online").value(this.online);
      }

      if (this.orientation != null) {
         var1.name("orientation").value(var2, this.orientation);
      }

      if (this.simulator != null) {
         var1.name("simulator").value(this.simulator);
      }

      if (this.memorySize != null) {
         var1.name("memory_size").value(this.memorySize);
      }

      if (this.freeMemory != null) {
         var1.name("free_memory").value(this.freeMemory);
      }

      if (this.usableMemory != null) {
         var1.name("usable_memory").value(this.usableMemory);
      }

      if (this.lowMemory != null) {
         var1.name("low_memory").value(this.lowMemory);
      }

      if (this.storageSize != null) {
         var1.name("storage_size").value(this.storageSize);
      }

      if (this.freeStorage != null) {
         var1.name("free_storage").value(this.freeStorage);
      }

      if (this.externalStorageSize != null) {
         var1.name("external_storage_size").value(this.externalStorageSize);
      }

      if (this.externalFreeStorage != null) {
         var1.name("external_free_storage").value(this.externalFreeStorage);
      }

      if (this.screenWidthPixels != null) {
         var1.name("screen_width_pixels").value(this.screenWidthPixels);
      }

      if (this.screenHeightPixels != null) {
         var1.name("screen_height_pixels").value(this.screenHeightPixels);
      }

      if (this.screenDensity != null) {
         var1.name("screen_density").value(this.screenDensity);
      }

      if (this.screenDpi != null) {
         var1.name("screen_dpi").value(this.screenDpi);
      }

      if (this.bootTime != null) {
         var1.name("boot_time").value(var2, this.bootTime);
      }

      if (this.timezone != null) {
         var1.name("timezone").value(var2, this.timezone);
      }

      if (this.id != null) {
         var1.name("id").value(this.id);
      }

      if (this.language != null) {
         var1.name("language").value(this.language);
      }

      if (this.connectionType != null) {
         var1.name("connection_type").value(this.connectionType);
      }

      if (this.batteryTemperature != null) {
         var1.name("battery_temperature").value(this.batteryTemperature);
      }

      if (this.locale != null) {
         var1.name("locale").value(this.locale);
      }

      if (this.processorCount != null) {
         var1.name("processor_count").value(this.processorCount);
      }

      if (this.processorFrequency != null) {
         var1.name("processor_frequency").value(this.processorFrequency);
      }

      if (this.cpuDescription != null) {
         var1.name("cpu_description").value(this.cpuDescription);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   @Nullable
   public String getLocale() {
      return this.locale;
   }

   public void setLocale(@Nullable String var1) {
      this.locale = var1;
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

   public static final class Deserializer implements JsonDeserializer<Device> {
      @NotNull
      public Device deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Device var3 = new Device();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "name":
                  var3.name = var1.nextStringOrNull();
                  break;
               case "manufacturer":
                  var3.manufacturer = var1.nextStringOrNull();
                  break;
               case "brand":
                  var3.brand = var1.nextStringOrNull();
                  break;
               case "family":
                  var3.family = var1.nextStringOrNull();
                  break;
               case "model":
                  var3.model = var1.nextStringOrNull();
                  break;
               case "model_id":
                  var3.modelId = var1.nextStringOrNull();
                  break;
               case "archs":
                  List var8 = (List)var1.nextObjectOrNull();
                  if (var8 != null) {
                     String[] var9 = new String[var8.size()];
                     var8.toArray(var9);
                     var3.archs = var9;
                  }
                  break;
               case "battery_level":
                  var3.batteryLevel = var1.nextFloatOrNull();
                  break;
               case "charging":
                  var3.charging = var1.nextBooleanOrNull();
                  break;
               case "online":
                  var3.online = var1.nextBooleanOrNull();
                  break;
               case "orientation":
                  var3.orientation = var1.nextOrNull(var2, new Device.DeviceOrientation.Deserializer());
                  break;
               case "simulator":
                  var3.simulator = var1.nextBooleanOrNull();
                  break;
               case "memory_size":
                  var3.memorySize = var1.nextLongOrNull();
                  break;
               case "free_memory":
                  var3.freeMemory = var1.nextLongOrNull();
                  break;
               case "usable_memory":
                  var3.usableMemory = var1.nextLongOrNull();
                  break;
               case "low_memory":
                  var3.lowMemory = var1.nextBooleanOrNull();
                  break;
               case "storage_size":
                  var3.storageSize = var1.nextLongOrNull();
                  break;
               case "free_storage":
                  var3.freeStorage = var1.nextLongOrNull();
                  break;
               case "external_storage_size":
                  var3.externalStorageSize = var1.nextLongOrNull();
                  break;
               case "external_free_storage":
                  var3.externalFreeStorage = var1.nextLongOrNull();
                  break;
               case "screen_width_pixels":
                  var3.screenWidthPixels = var1.nextIntegerOrNull();
                  break;
               case "screen_height_pixels":
                  var3.screenHeightPixels = var1.nextIntegerOrNull();
                  break;
               case "screen_density":
                  var3.screenDensity = var1.nextFloatOrNull();
                  break;
               case "screen_dpi":
                  var3.screenDpi = var1.nextIntegerOrNull();
                  break;
               case "boot_time":
                  if (var1.peek() == JsonToken.STRING) {
                     var3.bootTime = var1.nextDateOrNull(var2);
                  }
                  break;
               case "timezone":
                  var3.timezone = var1.nextTimeZoneOrNull(var2);
                  break;
               case "id":
                  var3.id = var1.nextStringOrNull();
                  break;
               case "language":
                  var3.language = var1.nextStringOrNull();
                  break;
               case "connection_type":
                  var3.connectionType = var1.nextStringOrNull();
                  break;
               case "battery_temperature":
                  var3.batteryTemperature = var1.nextFloatOrNull();
                  break;
               case "locale":
                  var3.locale = var1.nextStringOrNull();
                  break;
               case "processor_count":
                  var3.processorCount = var1.nextIntegerOrNull();
                  break;
               case "processor_frequency":
                  var3.processorFrequency = var1.nextDoubleOrNull();
                  break;
               case "cpu_description":
                  var3.cpuDescription = var1.nextStringOrNull();
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

   public enum DeviceOrientation implements JsonSerializable {
      PORTRAIT,
      LANDSCAPE;

      @Override
      public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
         var1.value(this.toString().toLowerCase(Locale.ROOT));
      }

      public static final class Deserializer implements JsonDeserializer<Device.DeviceOrientation> {
         @NotNull
         public Device.DeviceOrientation deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
            return Device.DeviceOrientation.valueOf(var1.nextString().toUpperCase(Locale.ROOT));
         }
      }
   }

   public static final class JsonKeys {
      public static final String NAME = "name";
      public static final String MANUFACTURER = "manufacturer";
      public static final String BRAND = "brand";
      public static final String FAMILY = "family";
      public static final String MODEL = "model";
      public static final String MODEL_ID = "model_id";
      public static final String ARCHS = "archs";
      public static final String BATTERY_LEVEL = "battery_level";
      public static final String CHARGING = "charging";
      public static final String ONLINE = "online";
      public static final String ORIENTATION = "orientation";
      public static final String SIMULATOR = "simulator";
      public static final String MEMORY_SIZE = "memory_size";
      public static final String FREE_MEMORY = "free_memory";
      public static final String USABLE_MEMORY = "usable_memory";
      public static final String LOW_MEMORY = "low_memory";
      public static final String STORAGE_SIZE = "storage_size";
      public static final String FREE_STORAGE = "free_storage";
      public static final String EXTERNAL_STORAGE_SIZE = "external_storage_size";
      public static final String EXTERNAL_FREE_STORAGE = "external_free_storage";
      public static final String SCREEN_WIDTH_PIXELS = "screen_width_pixels";
      public static final String SCREEN_HEIGHT_PIXELS = "screen_height_pixels";
      public static final String SCREEN_DENSITY = "screen_density";
      public static final String SCREEN_DPI = "screen_dpi";
      public static final String BOOT_TIME = "boot_time";
      public static final String TIMEZONE = "timezone";
      public static final String ID = "id";
      public static final String LANGUAGE = "language";
      public static final String CONNECTION_TYPE = "connection_type";
      public static final String BATTERY_TEMPERATURE = "battery_temperature";
      public static final String LOCALE = "locale";
      public static final String PROCESSOR_COUNT = "processor_count";
      public static final String CPU_DESCRIPTION = "cpu_description";
      public static final String PROCESSOR_FREQUENCY = "processor_frequency";
   }
}
