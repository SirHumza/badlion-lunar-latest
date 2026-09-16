package io.sentry.protocol;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentrySpan implements JsonSerializable, JsonUnknown {
   @NotNull
   private final Double startTimestamp;
   @Nullable
   private final Double timestamp;
   @NotNull
   private final SentryId traceId;
   @NotNull
   private final SpanId spanId;
   @Nullable
   private final SpanId parentSpanId;
   @NotNull
   private final String op;
   @Nullable
   private final String description;
   @Nullable
   private final SpanStatus status;
   @Nullable
   private final String origin;
   @NotNull
   private final Map<String, String> tags;
   @Nullable
   private Map<String, Object> data;
   @NotNull
   private final Map<String, MeasurementValue> measurements;
   @Nullable
   private final Map<String, List<MetricSummary>> metricsSummaries;
   @Nullable
   private Map<String, Object> unknown;

   public SentrySpan(@NotNull Span var1) {
      this(var1, var1.getData());
   }

   @ApiStatus.Internal
   public SentrySpan(@NotNull Span var1, @Nullable Map<String, Object> var2) {
      Objects.requireNonNull(var1, "span is required");
      this.description = var1.getDescription();
      this.op = var1.getOperation();
      this.spanId = var1.getSpanId();
      this.parentSpanId = var1.getParentSpanId();
      this.traceId = var1.getTraceId();
      this.status = var1.getStatus();
      this.origin = var1.getSpanContext().getOrigin();
      Map var3 = CollectionUtils.newConcurrentHashMap(var1.getTags());
      this.tags = var3 != null ? var3 : new ConcurrentHashMap<>();
      Map var4 = CollectionUtils.newConcurrentHashMap(var1.getMeasurements());
      this.measurements = var4 != null ? var4 : new ConcurrentHashMap<>();
      this.timestamp = var1.getFinishDate() == null ? null : DateUtils.nanosToSeconds(var1.getStartDate().laterDateNanosTimestampByDiff(var1.getFinishDate()));
      this.startTimestamp = DateUtils.nanosToSeconds(var1.getStartDate().nanoTimestamp());
      this.data = var2;
      LocalMetricsAggregator var5 = var1.getLocalMetricsAggregator();
      if (var5 != null) {
         this.metricsSummaries = var5.getSummaries();
      } else {
         this.metricsSummaries = null;
      }
   }

   @ApiStatus.Internal
   public SentrySpan(
      @NotNull Double var1,
      @Nullable Double var2,
      @NotNull SentryId var3,
      @NotNull SpanId var4,
      @Nullable SpanId var5,
      @NotNull String var6,
      @Nullable String var7,
      @Nullable SpanStatus var8,
      @Nullable String var9,
      @NotNull Map<String, String> var10,
      @NotNull Map<String, MeasurementValue> var11,
      @Nullable Map<String, List<MetricSummary>> var12,
      @Nullable Map<String, Object> var13
   ) {
      this.startTimestamp = var1;
      this.timestamp = var2;
      this.traceId = var3;
      this.spanId = var4;
      this.parentSpanId = var5;
      this.op = var6;
      this.description = var7;
      this.status = var8;
      this.origin = var9;
      this.tags = var10;
      this.measurements = var11;
      this.metricsSummaries = var12;
      this.data = var13;
   }

   public boolean isFinished() {
      return this.timestamp != null;
   }

   @NotNull
   public Double getStartTimestamp() {
      return this.startTimestamp;
   }

   @Nullable
   public Double getTimestamp() {
      return this.timestamp;
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
   public SpanId getParentSpanId() {
      return this.parentSpanId;
   }

   @NotNull
   public String getOp() {
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
   public Map<String, Object> getData() {
      return this.data;
   }

   public void setData(@Nullable Map<String, Object> var1) {
      this.data = var1;
   }

   @Nullable
   public String getOrigin() {
      return this.origin;
   }

   @NotNull
   public Map<String, MeasurementValue> getMeasurements() {
      return this.measurements;
   }

   @Nullable
   public Map<String, List<MetricSummary>> getMetricsSummaries() {
      return this.metricsSummaries;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("start_timestamp").value(var2, this.doubleToBigDecimal(this.startTimestamp));
      if (this.timestamp != null) {
         var1.name("timestamp").value(var2, this.doubleToBigDecimal(this.timestamp));
      }

      var1.name("trace_id").value(var2, this.traceId);
      var1.name("span_id").value(var2, this.spanId);
      if (this.parentSpanId != null) {
         var1.name("parent_span_id").value(var2, this.parentSpanId);
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

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
      }

      if (!this.measurements.isEmpty()) {
         var1.name("measurements").value(var2, this.measurements);
      }

      if (this.metricsSummaries != null && !this.metricsSummaries.isEmpty()) {
         var1.name("_metrics_summary").value(var2, this.metricsSummaries);
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

   @NotNull
   private BigDecimal doubleToBigDecimal(@NotNull Double var1) {
      return BigDecimal.valueOf(var1).setScale(6, RoundingMode.DOWN);
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

   public static final class Deserializer implements JsonDeserializer<SentrySpan> {
      @NotNull
      public SentrySpan deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Double var3 = null;
         Double var4 = null;
         SentryId var5 = null;
         SpanId var6 = null;
         SpanId var7 = null;
         String var8 = null;
         String var9 = null;
         SpanStatus var10 = null;
         String var11 = null;
         Map var12 = null;
         Map var13 = null;
         Map var14 = null;
         Map var15 = null;
         ConcurrentHashMap var16 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var17 = var1.nextName();
            switch (var17) {
               case "start_timestamp":
                  try {
                     var3 = var1.nextDoubleOrNull();
                  } catch (NumberFormatException var23) {
                     Date var25 = var1.nextDateOrNull(var2);
                     var3 = var25 != null ? DateUtils.dateToSeconds(var25) : null;
                  }
                  break;
               case "timestamp":
                  try {
                     var4 = var1.nextDoubleOrNull();
                  } catch (NumberFormatException var22) {
                     Date var21 = var1.nextDateOrNull(var2);
                     var4 = var21 != null ? DateUtils.dateToSeconds(var21) : null;
                  }
                  break;
               case "trace_id":
                  var5 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               case "span_id":
                  var6 = new SpanId.Deserializer().deserialize(var1, var2);
                  break;
               case "parent_span_id":
                  var7 = var1.nextOrNull(var2, new SpanId.Deserializer());
                  break;
               case "op":
                  var8 = var1.nextStringOrNull();
                  break;
               case "description":
                  var9 = var1.nextStringOrNull();
                  break;
               case "status":
                  var10 = var1.nextOrNull(var2, new SpanStatus.Deserializer());
                  break;
               case "origin":
                  var11 = var1.nextStringOrNull();
                  break;
               case "tags":
                  var12 = (Map)var1.nextObjectOrNull();
                  break;
               case "data":
                  var15 = (Map)var1.nextObjectOrNull();
                  break;
               case "measurements":
                  var13 = var1.nextMapOrNull(var2, new MeasurementValue.Deserializer());
                  break;
               case "_metrics_summary":
                  var14 = var1.nextMapOfListOrNull(var2, new MetricSummary.Deserializer());
                  break;
               default:
                  if (var16 == null) {
                     var16 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var16, var17);
            }
         }

         if (var3 == null) {
            throw this.missingRequiredFieldException("start_timestamp", var2);
         }

         if (var5 == null) {
            throw this.missingRequiredFieldException("trace_id", var2);
         }

         if (var6 == null) {
            throw this.missingRequiredFieldException("span_id", var2);
         }

         if (var8 == null) {
            throw this.missingRequiredFieldException("op", var2);
         }

         if (var12 == null) {
            var12 = new HashMap();
         }

         if (var13 == null) {
            var13 = new HashMap();
         }

         SentrySpan var24 = new SentrySpan(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
         var24.setUnknown(var16);
         var1.endObject();
         return var24;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String START_TIMESTAMP = "start_timestamp";
      public static final String TIMESTAMP = "timestamp";
      public static final String TRACE_ID = "trace_id";
      public static final String SPAN_ID = "span_id";
      public static final String PARENT_SPAN_ID = "parent_span_id";
      public static final String OP = "op";
      public static final String DESCRIPTION = "description";
      public static final String STATUS = "status";
      public static final String ORIGIN = "origin";
      public static final String TAGS = "tags";
      public static final String MEASUREMENTS = "measurements";
      public static final String METRICS_SUMMARY = "_metrics_summary";
      public static final String DATA = "data";
   }
}
