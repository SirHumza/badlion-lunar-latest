package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

@ApiStatus.Internal
public final class SentryAppStartProfilingOptions implements JsonSerializable, JsonUnknown {
   boolean profileSampled;
   @Nullable
   Double profileSampleRate;
   boolean traceSampled;
   @Nullable
   Double traceSampleRate;
   @Nullable
   String profilingTracesDirPath;
   boolean isProfilingEnabled;
   int profilingTracesHz;
   @Nullable
   private Map<String, Object> unknown;

   @VisibleForTesting
   public SentryAppStartProfilingOptions() {
      this.traceSampled = false;
      this.traceSampleRate = null;
      this.profileSampled = false;
      this.profileSampleRate = null;
      this.profilingTracesDirPath = null;
      this.isProfilingEnabled = false;
      this.profilingTracesHz = 0;
   }

   SentryAppStartProfilingOptions(@NotNull SentryOptions var1, @NotNull TracesSamplingDecision var2) {
      this.traceSampled = var2.getSampled();
      this.traceSampleRate = var2.getSampleRate();
      this.profileSampled = var2.getProfileSampled();
      this.profileSampleRate = var2.getProfileSampleRate();
      this.profilingTracesDirPath = var1.getProfilingTracesDirPath();
      this.isProfilingEnabled = var1.isProfilingEnabled();
      this.profilingTracesHz = var1.getProfilingTracesHz();
   }

   public void setProfileSampled(boolean var1) {
      this.profileSampled = var1;
   }

   public boolean isProfileSampled() {
      return this.profileSampled;
   }

   public void setProfileSampleRate(@Nullable Double var1) {
      this.profileSampleRate = var1;
   }

   @Nullable
   public Double getProfileSampleRate() {
      return this.profileSampleRate;
   }

   public void setTraceSampled(boolean var1) {
      this.traceSampled = var1;
   }

   public boolean isTraceSampled() {
      return this.traceSampled;
   }

   public void setTraceSampleRate(@Nullable Double var1) {
      this.traceSampleRate = var1;
   }

   @Nullable
   public Double getTraceSampleRate() {
      return this.traceSampleRate;
   }

   public void setProfilingTracesDirPath(@Nullable String var1) {
      this.profilingTracesDirPath = var1;
   }

   @Nullable
   public String getProfilingTracesDirPath() {
      return this.profilingTracesDirPath;
   }

   public void setProfilingEnabled(boolean var1) {
      this.isProfilingEnabled = var1;
   }

   public boolean isProfilingEnabled() {
      return this.isProfilingEnabled;
   }

   public void setProfilingTracesHz(int var1) {
      this.profilingTracesHz = var1;
   }

   public int getProfilingTracesHz() {
      return this.profilingTracesHz;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("profile_sampled").value(var2, this.profileSampled);
      var1.name("profile_sample_rate").value(var2, this.profileSampleRate);
      var1.name("trace_sampled").value(var2, this.traceSampled);
      var1.name("trace_sample_rate").value(var2, this.traceSampleRate);
      var1.name("profiling_traces_dir_path").value(var2, this.profilingTracesDirPath);
      var1.name("is_profiling_enabled").value(var2, this.isProfilingEnabled);
      var1.name("profiling_traces_hz").value(var2, this.profilingTracesHz);
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

   public static final class Deserializer implements JsonDeserializer<SentryAppStartProfilingOptions> {
      @NotNull
      public SentryAppStartProfilingOptions deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryAppStartProfilingOptions var3 = new SentryAppStartProfilingOptions();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "profile_sampled":
                  Boolean var8 = var1.nextBooleanOrNull();
                  if (var8 != null) {
                     var3.profileSampled = var8;
                  }
                  break;
               case "profile_sample_rate":
                  Double var9 = var1.nextDoubleOrNull();
                  if (var9 != null) {
                     var3.profileSampleRate = var9;
                  }
                  break;
               case "trace_sampled":
                  Boolean var10 = var1.nextBooleanOrNull();
                  if (var10 != null) {
                     var3.traceSampled = var10;
                  }
                  break;
               case "trace_sample_rate":
                  Double var11 = var1.nextDoubleOrNull();
                  if (var11 != null) {
                     var3.traceSampleRate = var11;
                  }
                  break;
               case "profiling_traces_dir_path":
                  String var12 = var1.nextStringOrNull();
                  if (var12 != null) {
                     var3.profilingTracesDirPath = var12;
                  }
                  break;
               case "is_profiling_enabled":
                  Boolean var13 = var1.nextBooleanOrNull();
                  if (var13 != null) {
                     var3.isProfilingEnabled = var13;
                  }
                  break;
               case "profiling_traces_hz":
                  Integer var14 = var1.nextIntegerOrNull();
                  if (var14 != null) {
                     var3.profilingTracesHz = var14;
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
      public static final String PROFILE_SAMPLED = "profile_sampled";
      public static final String PROFILE_SAMPLE_RATE = "profile_sample_rate";
      public static final String TRACE_SAMPLED = "trace_sampled";
      public static final String TRACE_SAMPLE_RATE = "trace_sample_rate";
      public static final String PROFILING_TRACES_DIR_PATH = "profiling_traces_dir_path";
      public static final String IS_PROFILING_ENABLED = "is_profiling_enabled";
      public static final String PROFILING_TRACES_HZ = "profiling_traces_hz";
   }
}
