package io.sentry;

import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ProfilingTransactionData implements JsonSerializable, JsonUnknown {
   @NotNull
   private String id;
   @NotNull
   private String traceId;
   @NotNull
   private String name;
   @NotNull
   private Long relativeStartNs;
   @Nullable
   private Long relativeEndNs;
   @NotNull
   private Long relativeStartCpuMs;
   @Nullable
   private Long relativeEndCpuMs;
   @Nullable
   private Map<String, Object> unknown;

   public ProfilingTransactionData() {
      this(NoOpTransaction.getInstance(), 0L, 0L);
   }

   public ProfilingTransactionData(@NotNull ITransaction var1, @NotNull Long var2, @NotNull Long var3) {
      this.id = var1.getEventId().toString();
      this.traceId = var1.getSpanContext().getTraceId().toString();
      this.name = var1.getName().isEmpty() ? "unknown" : var1.getName();
      this.relativeStartNs = var2;
      this.relativeStartCpuMs = var3;
   }

   public void notifyFinish(@NotNull Long var1, @NotNull Long var2, @NotNull Long var3, @NotNull Long var4) {
      if (this.relativeEndNs == null) {
         this.relativeEndNs = var1 - var2;
         this.relativeStartNs = this.relativeStartNs - var2;
         this.relativeEndCpuMs = var3 - var4;
         this.relativeStartCpuMs = this.relativeStartCpuMs - var4;
      }
   }

   @NotNull
   public String getId() {
      return this.id;
   }

   @NotNull
   public String getTraceId() {
      return this.traceId;
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   @NotNull
   public Long getRelativeStartNs() {
      return this.relativeStartNs;
   }

   @Nullable
   public Long getRelativeEndNs() {
      return this.relativeEndNs;
   }

   @Nullable
   public Long getRelativeEndCpuMs() {
      return this.relativeEndCpuMs;
   }

   @NotNull
   public Long getRelativeStartCpuMs() {
      return this.relativeStartCpuMs;
   }

   public void setId(@NotNull String var1) {
      this.id = var1;
   }

   public void setTraceId(@NotNull String var1) {
      this.traceId = var1;
   }

   public void setName(@NotNull String var1) {
      this.name = var1;
   }

   public void setRelativeStartNs(@NotNull Long var1) {
      this.relativeStartNs = var1;
   }

   public void setRelativeEndNs(@Nullable Long var1) {
      this.relativeEndNs = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ProfilingTransactionData var2 = (ProfilingTransactionData)var1;
         return this.id.equals(var2.id)
            && this.traceId.equals(var2.traceId)
            && this.name.equals(var2.name)
            && this.relativeStartNs.equals(var2.relativeStartNs)
            && this.relativeStartCpuMs.equals(var2.relativeStartCpuMs)
            && Objects.equals(this.relativeEndCpuMs, var2.relativeEndCpuMs)
            && Objects.equals(this.relativeEndNs, var2.relativeEndNs)
            && Objects.equals(this.unknown, var2.unknown);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.id, this.traceId, this.name, this.relativeStartNs, this.relativeEndNs, this.relativeStartCpuMs, this.relativeEndCpuMs, this.unknown
      );
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("id").value(var2, this.id);
      var1.name("trace_id").value(var2, this.traceId);
      var1.name("name").value(var2, this.name);
      var1.name("relative_start_ns").value(var2, this.relativeStartNs);
      var1.name("relative_end_ns").value(var2, this.relativeEndNs);
      var1.name("relative_cpu_start_ms").value(var2, this.relativeStartCpuMs);
      var1.name("relative_cpu_end_ms").value(var2, this.relativeEndCpuMs);
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

   public static final class Deserializer implements JsonDeserializer<ProfilingTransactionData> {
      @NotNull
      public ProfilingTransactionData deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         ProfilingTransactionData var3 = new ProfilingTransactionData();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "id":
                  String var8 = var1.nextStringOrNull();
                  if (var8 != null) {
                     var3.id = var8;
                  }
                  break;
               case "trace_id":
                  String var9 = var1.nextStringOrNull();
                  if (var9 != null) {
                     var3.traceId = var9;
                  }
                  break;
               case "name":
                  String var10 = var1.nextStringOrNull();
                  if (var10 != null) {
                     var3.name = var10;
                  }
                  break;
               case "relative_start_ns":
                  Long var11 = var1.nextLongOrNull();
                  if (var11 != null) {
                     var3.relativeStartNs = var11;
                  }
                  break;
               case "relative_end_ns":
                  Long var12 = var1.nextLongOrNull();
                  if (var12 != null) {
                     var3.relativeEndNs = var12;
                  }
                  break;
               case "relative_cpu_start_ms":
                  Long var13 = var1.nextLongOrNull();
                  if (var13 != null) {
                     var3.relativeStartCpuMs = var13;
                  }
                  break;
               case "relative_cpu_end_ms":
                  Long var14 = var1.nextLongOrNull();
                  if (var14 != null) {
                     var3.relativeEndCpuMs = var14;
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
      public static final String ID = "id";
      public static final String TRACE_ID = "trace_id";
      public static final String NAME = "name";
      public static final String START_NS = "relative_start_ns";
      public static final String END_NS = "relative_end_ns";
      public static final String START_CPU_MS = "relative_cpu_start_ms";
      public static final String END_CPU_MS = "relative_cpu_end_ms";
   }
}
