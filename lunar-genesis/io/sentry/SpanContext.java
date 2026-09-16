package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public class SpanContext implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "trace";
   @NotNull
   private final SentryId traceId;
   @NotNull
   private final SpanId spanId;
   @Nullable
   private final SpanId parentSpanId;
   @Nullable
   private transient TracesSamplingDecision samplingDecision;
   @NotNull
   protected String op;
   @Nullable
   protected String description;
   @Nullable
   protected SpanStatus status;
   @NotNull
   protected Map<String, String> tags = new ConcurrentHashMap<>();
   @Nullable
   protected String origin = "manual";
   @Nullable
   private Map<String, Object> unknown;

   public SpanContext(@NotNull String var1, @Nullable TracesSamplingDecision var2) {
      this(new SentryId(), new SpanId(), var1, null, var2);
   }

   public SpanContext(@NotNull String var1) {
      this(new SentryId(), new SpanId(), var1, null, null);
   }

   public SpanContext(@NotNull SentryId var1, @NotNull SpanId var2, @NotNull String var3, @Nullable SpanId var4, @Nullable TracesSamplingDecision var5) {
      this(var1, var2, var4, var3, null, var5, null, "manual");
   }

   @ApiStatus.Internal
   public SpanContext(
      @NotNull SentryId var1,
      @NotNull SpanId var2,
      @Nullable SpanId var3,
      @NotNull String var4,
      @Nullable String var5,
      @Nullable TracesSamplingDecision var6,
      @Nullable SpanStatus var7,
      @Nullable String var8
   ) {
      this.traceId = Objects.requireNonNull(var1, "traceId is required");
      this.spanId = Objects.requireNonNull(var2, "spanId is required");
      this.op = Objects.requireNonNull(var4, "operation is required");
      this.parentSpanId = var3;
      this.samplingDecision = var6;
      this.description = var5;
      this.status = var7;
      this.origin = var8;
   }

   public SpanContext(@NotNull SpanContext var1) {
      this.traceId = var1.traceId;
      this.spanId = var1.spanId;
      this.parentSpanId = var1.parentSpanId;
      this.samplingDecision = var1.samplingDecision;
      this.op = var1.op;
      this.description = var1.description;
      this.status = var1.status;
      Map var2 = CollectionUtils.newConcurrentHashMap(var1.tags);
      if (var2 != null) {
         this.tags = var2;
      }
   }

   public void setOperation(@NotNull String var1) {
      this.op = Objects.requireNonNull(var1, "operation is required");
   }

   public void setTag(@NotNull String var1, @NotNull String var2) {
      Objects.requireNonNull(var1, "name is required");
      Objects.requireNonNull(var2, "value is required");
      this.tags.put(var1, var2);
   }

   public void setDescription(@Nullable String var1) {
      this.description = var1;
   }

   public void setStatus(@Nullable SpanStatus var1) {
      this.status = var1;
   }

   @NotNull
   public SentryId getTraceId() {
      return this.traceId;
   }

   @NotNull
   public SpanId getSpanId() {
      return this.spanId;
   }

   @Nullable
   @TestOnly
   public SpanId getParentSpanId() {
      return this.parentSpanId;
   }

   @NotNull
   public String getOperation() {
      return this.op;
   }

   @Nullable
   public String getDescription() {
      return this.description;
   }

   @Nullable
   public SpanStatus getStatus() {
      return this.status;
   }

   @NotNull
   public Map<String, String> getTags() {
      return this.tags;
   }

   @Nullable
   public TracesSamplingDecision getSamplingDecision() {
      return this.samplingDecision;
   }

   @Nullable
   public Boolean getSampled() {
      return this.samplingDecision == null ? null : this.samplingDecision.getSampled();
   }

   @Nullable
   public Boolean getProfileSampled() {
      return this.samplingDecision == null ? null : this.samplingDecision.getProfileSampled();
   }

   @ApiStatus.Internal
   public void setSampled(@Nullable Boolean var1) {
      if (var1 == null) {
         this.setSamplingDecision(null);
      } else {
         this.setSamplingDecision(new TracesSamplingDecision(var1));
      }
   }

   @ApiStatus.Internal
   public void setSampled(@Nullable Boolean var1, @Nullable Boolean var2) {
      if (var1 == null) {
         this.setSamplingDecision(null);
      } else if (var2 == null) {
         this.setSamplingDecision(new TracesSamplingDecision(var1));
      } else {
         this.setSamplingDecision(new TracesSamplingDecision(var1, null, var2, null));
      }
   }

   @ApiStatus.Internal
   public void setSamplingDecision(@Nullable TracesSamplingDecision var1) {
      this.samplingDecision = var1;
   }

   @Nullable
   public String getOrigin() {
      return this.origin;
   }

   public void setOrigin(@Nullable String var1) {
      this.origin = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SpanContext)) {
         return false;
      }

      SpanContext var2 = (SpanContext)var1;
      return this.traceId.equals(var2.traceId)
         && this.spanId.equals(var2.spanId)
         && Objects.equals(this.parentSpanId, var2.parentSpanId)
         && this.op.equals(var2.op)
         && Objects.equals(this.description, var2.description)
         && this.status == var2.status;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.traceId, this.spanId, this.parentSpanId, this.op, this.description, this.status);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("trace_id");
      this.traceId.serialize(var1, var2);
      var1.name("span_id");
      this.spanId.serialize(var1, var2);
      if (this.parentSpanId != null) {
         var1.name("parent_span_id");
         this.parentSpanId.serialize(var1, var2);
      }

      var1.name("op").value(this.op);
      if (this.description != null) {
         var1.name("description").value(this.description);
      }

      if (this.status != null) {
         var1.name("status").value(var2, this.status);
      }

      if (this.origin != null) {
         var1.name("origin").value(var2, this.origin);
      }

      if (!this.tags.isEmpty()) {
         var1.name("tags").value(var2, this.tags);
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
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   public static final class Deserializer implements JsonDeserializer<SpanContext> {
      @NotNull
      public SpanContext deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryId var3 = null;
         SpanId var4 = null;
         SpanId var5 = null;
         String var6 = null;
         String var7 = null;
         SpanStatus var8 = null;
         String var9 = null;
         Map var10 = null;
         ConcurrentHashMap var11 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var12 = var1.nextName();
            switch (var12) {
               case "trace_id":
                  var3 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               case "span_id":
                  var4 = new SpanId.Deserializer().deserialize(var1, var2);
                  break;
               case "parent_span_id":
                  var5 = var1.nextOrNull(var2, new SpanId.Deserializer());
                  break;
               case "op":
                  var6 = var1.nextString();
                  break;
               case "description":
                  var7 = var1.nextString();
                  break;
               case "status":
                  var8 = var1.nextOrNull(var2, new SpanStatus.Deserializer());
                  break;
               case "origin":
                  var9 = var1.nextString();
                  break;
               case "tags":
                  var10 = CollectionUtils.newConcurrentHashMap((Map)var1.nextObjectOrNull());
                  break;
               default:
                  if (var11 == null) {
                     var11 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var11, var12);
            }
         }

         if (var3 == null) {
            String var17 = "Missing required field \"trace_id\"";
            IllegalStateException var19 = new IllegalStateException(var17);
            var2.log(SentryLevel.ERROR, var17, var19);
            throw var19;
         }

         if (var4 == null) {
            String var16 = "Missing required field \"span_id\"";
            IllegalStateException var18 = new IllegalStateException(var16);
            var2.log(SentryLevel.ERROR, var16, var18);
            throw var18;
         }

         if (var6 == null) {
            var6 = "";
         }

         SpanContext var15 = new SpanContext(var3, var4, var6, var5, null);
         var15.setDescription(var7);
         var15.setStatus(var8);
         var15.setOrigin(var9);
         if (var10 != null) {
            var15.tags = var10;
         }

         var15.setUnknown(var11);
         var1.endObject();
         return var15;
      }
   }

   public static final class JsonKeys {
      public static final String TRACE_ID = "trace_id";
      public static final String SPAN_ID = "span_id";
      public static final String PARENT_SPAN_ID = "parent_span_id";
      public static final String OP = "op";
      public static final String DESCRIPTION = "description";
      public static final String STATUS = "status";
      public static final String TAGS = "tags";
      public static final String ORIGIN = "origin";
   }
}
