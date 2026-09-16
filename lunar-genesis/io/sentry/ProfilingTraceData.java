package io.sentry;

import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ProfilingTraceData implements JsonSerializable, JsonUnknown {
   private static final String DEFAULT_ENVIRONMENT = "production";
   @ApiStatus.Internal
   public static final String TRUNCATION_REASON_NORMAL = "normal";
   @ApiStatus.Internal
   public static final String TRUNCATION_REASON_TIMEOUT = "timeout";
   @ApiStatus.Internal
   public static final String TRUNCATION_REASON_BACKGROUNDED = "backgrounded";
   @NotNull
   private final File traceFile;
   @NotNull
   private final Callable<List<Integer>> deviceCpuFrequenciesReader;
   private int androidApiLevel;
   @NotNull
   private String deviceLocale;
   @NotNull
   private String deviceManufacturer;
   @NotNull
   private String deviceModel;
   @NotNull
   private String deviceOsBuildNumber;
   @NotNull
   private String deviceOsName;
   @NotNull
   private String deviceOsVersion;
   private boolean deviceIsEmulator;
   @NotNull
   private String cpuArchitecture;
   @NotNull
   private List<Integer> deviceCpuFrequencies = new ArrayList<>();
   @NotNull
   private String devicePhysicalMemoryBytes;
   @NotNull
   private String platform;
   @NotNull
   private String buildId;
   @NotNull
   private List<ProfilingTransactionData> transactions;
   @NotNull
   private String transactionName;
   @NotNull
   private String durationNs;
   @NotNull
   private String versionCode;
   @NotNull
   private String release;
   @NotNull
   private String transactionId;
   @NotNull
   private String traceId;
   @NotNull
   private String profileId;
   @NotNull
   private String environment;
   @NotNull
   private String truncationReason;
   @NotNull
   private Date timestamp;
   @NotNull
   private final Map<String, ProfileMeasurement> measurementsMap;
   @Nullable
   private String sampledProfile = null;
   @Nullable
   private Map<String, Object> unknown;

   private ProfilingTraceData() {
      this(new File("dummy"), NoOpTransaction.getInstance());
   }

   public ProfilingTraceData(@NotNull File var1, @NotNull ITransaction var2) {
      this(
         var1,
         DateUtils.getCurrentDateTime(),
         new ArrayList<>(),
         var2.getName(),
         var2.getEventId().toString(),
         var2.getSpanContext().getTraceId().toString(),
         "0",
         0,
         "",
         () -> new ArrayList<>(),
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         "normal",
         new HashMap<>()
      );
   }

   public ProfilingTraceData(
      @NotNull File var1,
      @NotNull Date var2,
      @NotNull List<ProfilingTransactionData> var3,
      @NotNull String var4,
      @NotNull String var5,
      @NotNull String var6,
      @NotNull String var7,
      int var8,
      @NotNull String var9,
      @NotNull Callable<List<Integer>> var10,
      @Nullable String var11,
      @Nullable String var12,
      @Nullable String var13,
      @Nullable Boolean var14,
      @Nullable String var15,
      @Nullable String var16,
      @Nullable String var17,
      @Nullable String var18,
      @NotNull String var19,
      @NotNull Map<String, ProfileMeasurement> var20
   ) {
      this.traceFile = var1;
      this.timestamp = var2;
      this.cpuArchitecture = var9;
      this.deviceCpuFrequenciesReader = var10;
      this.androidApiLevel = var8;
      this.deviceLocale = Locale.getDefault().toString();
      this.deviceManufacturer = var11 != null ? var11 : "";
      this.deviceModel = var12 != null ? var12 : "";
      this.deviceOsVersion = var13 != null ? var13 : "";
      this.deviceIsEmulator = var14 != null ? var14 : false;
      this.devicePhysicalMemoryBytes = var15 != null ? var15 : "0";
      this.deviceOsBuildNumber = "";
      this.deviceOsName = "android";
      this.platform = "android";
      this.buildId = var16 != null ? var16 : "";
      this.transactions = var3;
      this.transactionName = var4.isEmpty() ? "unknown" : var4;
      this.durationNs = var7;
      this.versionCode = "";
      this.release = var17 != null ? var17 : "";
      this.transactionId = var5;
      this.traceId = var6;
      this.profileId = UUID.randomUUID().toString();
      this.environment = var18 != null ? var18 : "production";
      this.truncationReason = var19;
      if (!this.isTruncationReasonValid()) {
         this.truncationReason = "normal";
      }

      this.measurementsMap = var20;
   }

   private boolean isTruncationReasonValid() {
      return this.truncationReason.equals("normal") || this.truncationReason.equals("timeout") || this.truncationReason.equals("backgrounded");
   }

   @NotNull
   public File getTraceFile() {
      return this.traceFile;
   }

   public int getAndroidApiLevel() {
      return this.androidApiLevel;
   }

   @NotNull
   public String getCpuArchitecture() {
      return this.cpuArchitecture;
   }

   @NotNull
   public String getDeviceLocale() {
      return this.deviceLocale;
   }

   @NotNull
   public String getDeviceManufacturer() {
      return this.deviceManufacturer;
   }

   @NotNull
   public String getDeviceModel() {
      return this.deviceModel;
   }

   @NotNull
   public String getDeviceOsBuildNumber() {
      return this.deviceOsBuildNumber;
   }

   @NotNull
   public String getDeviceOsName() {
      return this.deviceOsName;
   }

   @NotNull
   public String getDeviceOsVersion() {
      return this.deviceOsVersion;
   }

   public boolean isDeviceIsEmulator() {
      return this.deviceIsEmulator;
   }

   @NotNull
   public String getPlatform() {
      return this.platform;
   }

   @NotNull
   public String getBuildId() {
      return this.buildId;
   }

   @NotNull
   public String getTransactionName() {
      return this.transactionName;
   }

   @NotNull
   public String getRelease() {
      return this.release;
   }

   @NotNull
   public String getTransactionId() {
      return this.transactionId;
   }

   @NotNull
   public List<ProfilingTransactionData> getTransactions() {
      return this.transactions;
   }

   @NotNull
   public String getTraceId() {
      return this.traceId;
   }

   @NotNull
   public String getProfileId() {
      return this.profileId;
   }

   @NotNull
   public String getEnvironment() {
      return this.environment;
   }

   @Nullable
   public String getSampledProfile() {
      return this.sampledProfile;
   }

   @NotNull
   public String getDurationNs() {
      return this.durationNs;
   }

   @NotNull
   public List<Integer> getDeviceCpuFrequencies() {
      return this.deviceCpuFrequencies;
   }

   @NotNull
   public String getDevicePhysicalMemoryBytes() {
      return this.devicePhysicalMemoryBytes;
   }

   @NotNull
   public String getTruncationReason() {
      return this.truncationReason;
   }

   @NotNull
   public Date getTimestamp() {
      return this.timestamp;
   }

   @NotNull
   public Map<String, ProfileMeasurement> getMeasurementsMap() {
      return this.measurementsMap;
   }

   public void setAndroidApiLevel(int var1) {
      this.androidApiLevel = var1;
   }

   public void setCpuArchitecture(@NotNull String var1) {
      this.cpuArchitecture = var1;
   }

   public void setDeviceLocale(@NotNull String var1) {
      this.deviceLocale = var1;
   }

   public void setDeviceManufacturer(@NotNull String var1) {
      this.deviceManufacturer = var1;
   }

   public void setDeviceModel(@NotNull String var1) {
      this.deviceModel = var1;
   }

   public void setDeviceOsBuildNumber(@NotNull String var1) {
      this.deviceOsBuildNumber = var1;
   }

   public void setDeviceOsVersion(@NotNull String var1) {
      this.deviceOsVersion = var1;
   }

   public void setDeviceIsEmulator(boolean var1) {
      this.deviceIsEmulator = var1;
   }

   public void setDeviceCpuFrequencies(@NotNull List<Integer> var1) {
      this.deviceCpuFrequencies = var1;
   }

   public void setDevicePhysicalMemoryBytes(@NotNull String var1) {
      this.devicePhysicalMemoryBytes = var1;
   }

   public void setTimestamp(@NotNull Date var1) {
      this.timestamp = var1;
   }

   public void setTruncationReason(@NotNull String var1) {
      this.truncationReason = var1;
   }

   public void setTransactions(@NotNull List<ProfilingTransactionData> var1) {
      this.transactions = var1;
   }

   public void setBuildId(@NotNull String var1) {
      this.buildId = var1;
   }

   public void setTransactionName(@NotNull String var1) {
      this.transactionName = var1;
   }

   public void setDurationNs(@NotNull String var1) {
      this.durationNs = var1;
   }

   public void setRelease(@NotNull String var1) {
      this.release = var1;
   }

   public void setTransactionId(@NotNull String var1) {
      this.transactionId = var1;
   }

   public void setTraceId(@NotNull String var1) {
      this.traceId = var1;
   }

   public void setProfileId(@NotNull String var1) {
      this.profileId = var1;
   }

   public void setEnvironment(@NotNull String var1) {
      this.environment = var1;
   }

   public void setSampledProfile(@Nullable String var1) {
      this.sampledProfile = var1;
   }

   public void readDeviceCpuFrequencies() {
      try {
         this.deviceCpuFrequencies = this.deviceCpuFrequenciesReader.call();
      } catch (Throwable var2) {
      }
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("android_api_level").value(var2, this.androidApiLevel);
      var1.name("device_locale").value(var2, this.deviceLocale);
      var1.name("device_manufacturer").value(this.deviceManufacturer);
      var1.name("device_model").value(this.deviceModel);
      var1.name("device_os_build_number").value(this.deviceOsBuildNumber);
      var1.name("device_os_name").value(this.deviceOsName);
      var1.name("device_os_version").value(this.deviceOsVersion);
      var1.name("device_is_emulator").value(this.deviceIsEmulator);
      var1.name("architecture").value(var2, this.cpuArchitecture);
      var1.name("device_cpu_frequencies").value(var2, this.deviceCpuFrequencies);
      var1.name("device_physical_memory_bytes").value(this.devicePhysicalMemoryBytes);
      var1.name("platform").value(this.platform);
      var1.name("build_id").value(this.buildId);
      var1.name("transaction_name").value(this.transactionName);
      var1.name("duration_ns").value(this.durationNs);
      var1.name("version_name").value(this.release);
      var1.name("version_code").value(this.versionCode);
      if (!this.transactions.isEmpty()) {
         var1.name("transactions").value(var2, this.transactions);
      }

      var1.name("transaction_id").value(this.transactionId);
      var1.name("trace_id").value(this.traceId);
      var1.name("profile_id").value(this.profileId);
      var1.name("environment").value(this.environment);
      var1.name("truncation_reason").value(this.truncationReason);
      if (this.sampledProfile != null) {
         var1.name("sampled_profile").value(this.sampledProfile);
      }

      var1.name("measurements").value(var2, this.measurementsMap);
      var1.name("timestamp").value(var2, this.timestamp);
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

   public static final class Deserializer implements JsonDeserializer<ProfilingTraceData> {
      @NotNull
      public ProfilingTraceData deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         ProfilingTraceData var3 = new ProfilingTraceData();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "android_api_level":
                  Integer var8 = var1.nextIntegerOrNull();
                  if (var8 != null) {
                     var3.androidApiLevel = var8;
                  }
                  break;
               case "device_locale":
                  String var9 = var1.nextStringOrNull();
                  if (var9 != null) {
                     var3.deviceLocale = var9;
                  }
                  break;
               case "device_manufacturer":
                  String var10 = var1.nextStringOrNull();
                  if (var10 != null) {
                     var3.deviceManufacturer = var10;
                  }
                  break;
               case "device_model":
                  String var11 = var1.nextStringOrNull();
                  if (var11 != null) {
                     var3.deviceModel = var11;
                  }
                  break;
               case "device_os_build_number":
                  String var12 = var1.nextStringOrNull();
                  if (var12 != null) {
                     var3.deviceOsBuildNumber = var12;
                  }
                  break;
               case "device_os_name":
                  String var13 = var1.nextStringOrNull();
                  if (var13 != null) {
                     var3.deviceOsName = var13;
                  }
                  break;
               case "device_os_version":
                  String var14 = var1.nextStringOrNull();
                  if (var14 != null) {
                     var3.deviceOsVersion = var14;
                  }
                  break;
               case "device_is_emulator":
                  Boolean var15 = var1.nextBooleanOrNull();
                  if (var15 != null) {
                     var3.deviceIsEmulator = var15;
                  }
                  break;
               case "architecture":
                  String var16 = var1.nextStringOrNull();
                  if (var16 != null) {
                     var3.cpuArchitecture = var16;
                  }
                  break;
               case "device_cpu_frequencies":
                  List var17 = (List)var1.nextObjectOrNull();
                  if (var17 != null) {
                     var3.deviceCpuFrequencies = var17;
                  }
                  break;
               case "device_physical_memory_bytes":
                  String var18 = var1.nextStringOrNull();
                  if (var18 != null) {
                     var3.devicePhysicalMemoryBytes = var18;
                  }
                  break;
               case "platform":
                  String var19 = var1.nextStringOrNull();
                  if (var19 != null) {
                     var3.platform = var19;
                  }
                  break;
               case "build_id":
                  String var20 = var1.nextStringOrNull();
                  if (var20 != null) {
                     var3.buildId = var20;
                  }
                  break;
               case "transaction_name":
                  String var21 = var1.nextStringOrNull();
                  if (var21 != null) {
                     var3.transactionName = var21;
                  }
                  break;
               case "duration_ns":
                  String var22 = var1.nextStringOrNull();
                  if (var22 != null) {
                     var3.durationNs = var22;
                  }
                  break;
               case "version_code":
                  String var23 = var1.nextStringOrNull();
                  if (var23 != null) {
                     var3.versionCode = var23;
                  }
                  break;
               case "version_name":
                  String var24 = var1.nextStringOrNull();
                  if (var24 != null) {
                     var3.release = var24;
                  }
                  break;
               case "transactions":
                  List var25 = var1.nextListOrNull(var2, new ProfilingTransactionData.Deserializer());
                  if (var25 != null) {
                     var3.transactions.addAll(var25);
                  }
                  break;
               case "transaction_id":
                  String var26 = var1.nextStringOrNull();
                  if (var26 != null) {
                     var3.transactionId = var26;
                  }
                  break;
               case "trace_id":
                  String var27 = var1.nextStringOrNull();
                  if (var27 != null) {
                     var3.traceId = var27;
                  }
                  break;
               case "profile_id":
                  String var28 = var1.nextStringOrNull();
                  if (var28 != null) {
                     var3.profileId = var28;
                  }
                  break;
               case "environment":
                  String var29 = var1.nextStringOrNull();
                  if (var29 != null) {
                     var3.environment = var29;
                  }
                  break;
               case "truncation_reason":
                  String var30 = var1.nextStringOrNull();
                  if (var30 != null) {
                     var3.truncationReason = var30;
                  }
                  break;
               case "measurements":
                  Map var31 = var1.nextMapOrNull(var2, new ProfileMeasurement.Deserializer());
                  if (var31 != null) {
                     var3.measurementsMap.putAll(var31);
                  }
                  break;
               case "timestamp":
                  Date var32 = var1.nextDateOrNull(var2);
                  if (var32 != null) {
                     var3.timestamp = var32;
                  }
                  break;
               case "sampled_profile":
                  String var33 = var1.nextStringOrNull();
                  if (var33 != null) {
                     var3.sampledProfile = var33;
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
      public static final String ANDROID_API_LEVEL = "android_api_level";
      public static final String DEVICE_LOCALE = "device_locale";
      public static final String DEVICE_MANUFACTURER = "device_manufacturer";
      public static final String DEVICE_MODEL = "device_model";
      public static final String DEVICE_OS_BUILD_NUMBER = "device_os_build_number";
      public static final String DEVICE_OS_NAME = "device_os_name";
      public static final String DEVICE_OS_VERSION = "device_os_version";
      public static final String DEVICE_IS_EMULATOR = "device_is_emulator";
      public static final String ARCHITECTURE = "architecture";
      public static final String DEVICE_CPU_FREQUENCIES = "device_cpu_frequencies";
      public static final String DEVICE_PHYSICAL_MEMORY_BYTES = "device_physical_memory_bytes";
      public static final String PLATFORM = "platform";
      public static final String BUILD_ID = "build_id";
      public static final String TRANSACTION_NAME = "transaction_name";
      public static final String DURATION_NS = "duration_ns";
      public static final String RELEASE = "version_name";
      public static final String VERSION_CODE = "version_code";
      public static final String TRANSACTION_LIST = "transactions";
      public static final String TRANSACTION_ID = "transaction_id";
      public static final String TRACE_ID = "trace_id";
      public static final String PROFILE_ID = "profile_id";
      public static final String ENVIRONMENT = "environment";
      public static final String SAMPLED_PROFILE = "sampled_profile";
      public static final String TRUNCATION_REASON = "truncation_reason";
      public static final String MEASUREMENTS = "measurements";
      public static final String TIMESTAMP = "timestamp";
   }
}
