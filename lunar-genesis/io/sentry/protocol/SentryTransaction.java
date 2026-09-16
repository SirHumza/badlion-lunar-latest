package io.sentry.protocol;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryTracer;
import io.sentry.Span;
import io.sentry.SpanContext;
import io.sentry.SpanStatus;
import io.sentry.TracesSamplingDecision;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryTransaction extends SentryBaseEvent implements JsonSerializable, JsonUnknown {
   @Nullable
   private String transaction;
   @NotNull
   private Double startTimestamp;
   @Nullable
   private Double timestamp;
   @NotNull
   private final List<SentrySpan> spans = new ArrayList<>();
   @NotNull
   private final String type = "transaction";
   @NotNull
   private final Map<String, MeasurementValue> measurements = new HashMap<>();
   @Nullable
   private Map<String, List<MetricSummary>> metricSummaries;
   @NotNull
   private TransactionInfo transactionInfo;
   @Nullable
   private Map<String, Object> unknown;

   public SentryTransaction(@NotNull SentryTracer var1) {
      super(var1.getEventId());
      Objects.requireNonNull(var1, "sentryTracer is required");
      this.startTimestamp = DateUtils.nanosToSeconds(var1.getStartDate().nanoTimestamp());
      this.timestamp = DateUtils.nanosToSeconds(var1.getStartDate().laterDateNanosTimestampByDiff(var1.getFinishDate()));
      this.transaction = var1.getName();

      for (Span var3 : var1.getChildren()) {
         if (Boolean.TRUE.equals(var3.isSampled())) {
            this.spans.add(new SentrySpan(var3));
         }
      }

      Contexts var7 = this.getContexts();
      var7.putAll(var1.getContexts());
      SpanContext var8 = var1.getSpanContext();
      var7.setTrace(
         new SpanContext(
            var8.getTraceId(),
            var8.getSpanId(),
            var8.getParentSpanId(),
            var8.getOperation(),
            var8.getDescription(),
            var8.getSamplingDecision(),
            var8.getStatus(),
            var8.getOrigin()
         )
      );

      for (Entry var5 : var8.getTags().entrySet()) {
         this.setTag((String)var5.getKey(), (String)var5.getValue());
      }

      Map var9 = var1.getData();
      if (var9 != null) {
         for (Entry var6 : var9.entrySet()) {
            this.setExtra((String)var6.getKey(), var6.getValue());
         }
      }

      this.transactionInfo = new TransactionInfo(var1.getTransactionNameSource().apiName());
      LocalMetricsAggregator var11 = var1.getLocalMetricsAggregator();
      if (var11 != null) {
         this.metricSummaries = var11.getSummaries();
      } else {
         this.metricSummaries = null;
      }
   }

   @ApiStatus.Internal
   public SentryTransaction(
      @Nullable String var1,
      @NotNull Double var2,
      @Nullable Double var3,
      @NotNull List<SentrySpan> var4,
      @NotNull Map<String, MeasurementValue> var5,
      @Nullable Map<String, List<MetricSummary>> var6,
      @NotNull TransactionInfo var7
   ) {
      this.transaction = var1;
      this.startTimestamp = var2;
      this.timestamp = var3;
      this.spans.addAll(var4);
      this.measurements.putAll(var5);

      for (SentrySpan var9 : var4) {
         this.measurements.putAll(var9.getMeasurements());
      }

      this.transactionInfo = var7;
      this.metricSummaries = var6;
   }

   @NotNull
   public List<SentrySpan> getSpans() {
      return this.spans;
   }

   public boolean isFinished() {
      return this.timestamp != null;
   }

   @Nullable
   public String getTransaction() {
      return this.transaction;
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
   public String getType() {
      return "transaction";
   }

   @Nullable
   public SpanStatus getStatus() {
      SpanContext var1 = this.getContexts().getTrace();
      return var1 != null ? var1.getStatus() : null;
   }

   public boolean isSampled() {
      TracesSamplingDecision var1 = this.getSamplingDecision();
      return var1 == null ? false : var1.getSampled();
   }

   @Nullable
   public TracesSamplingDecision getSamplingDecision() {
      SpanContext var1 = this.getContexts().getTrace();
      return var1 == null ? null : var1.getSamplingDecision();
   }

   @NotNull
   public Map<String, MeasurementValue> getMeasurements() {
      return this.measurements;
   }

   @Nullable
   public Map<String, List<MetricSummary>> getMetricSummaries() {
      return this.metricSummaries;
   }

   public void setMetricSummaries(@Nullable Map<String, List<MetricSummary>> var1) {
      this.metricSummaries = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.transaction != null) {
         var1.name("transaction").value(this.transaction);
      }

      var1.name("start_timestamp").value(var2, this.doubleToBigDecimal(this.startTimestamp));
      if (this.timestamp != null) {
         var1.name("timestamp").value(var2, this.doubleToBigDecimal(this.timestamp));
      }

      if (!this.spans.isEmpty()) {
         var1.name("spans").value(var2, this.spans);
      }

      var1.name("type").value("transaction");
      if (!this.measurements.isEmpty()) {
         var1.name("measurements").value(var2, this.measurements);
      }

      if (this.metricSummaries != null && !this.metricSummaries.isEmpty()) {
         var1.name("_metrics_summary").value(var2, this.metricSummaries);
      }

      var1.name("transaction_info").value(var2, this.transactionInfo);
      new SentryBaseEvent.Serializer().serialize(this, var1, var2);
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

   public static final class Deserializer implements JsonDeserializer<SentryTransaction> {
      @NotNull
      public SentryTransaction deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryTransaction var3 = new SentryTransaction(
            "", 0.0, null, new ArrayList<>(), new HashMap<>(), null, new TransactionInfo(TransactionNameSource.CUSTOM.apiName())
         );
         ConcurrentHashMap var4 = null;
         SentryBaseEvent.Deserializer var5 = new SentryBaseEvent.Deserializer();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "transaction":
                  var3.transaction = var1.nextStringOrNull();
                  break;
               case "start_timestamp":
                  try {
                     Double var14 = var1.nextDoubleOrNull();
                     if (var14 != null) {
                        var3.startTimestamp = var14;
                     }
                  } catch (NumberFormatException var12) {
                     Date var16 = var1.nextDateOrNull(var2);
                     if (var16 != null) {
                        var3.startTimestamp = DateUtils.dateToSeconds(var16);
                     }
                  }
                  break;
               case "timestamp":
                  try {
                     Double var13 = var1.nextDoubleOrNull();
                     if (var13 != null) {
                        var3.timestamp = var13;
                     }
                  } catch (NumberFormatException var11) {
                     Date var15 = var1.nextDateOrNull(var2);
                     if (var15 != null) {
                        var3.timestamp = DateUtils.dateToSeconds(var15);
                     }
                  }
                  break;
               case "spans":
                  List var9 = var1.nextListOrNull(var2, new SentrySpan.Deserializer());
                  if (var9 != null) {
                     var3.spans.addAll(var9);
                  }
                  break;
               case "type":
                  var1.nextString();
                  break;
               case "measurements":
                  Map var10 = var1.nextMapOrNull(var2, new MeasurementValue.Deserializer());
                  if (var10 != null) {
                     var3.measurements.putAll(var10);
                  }
                  break;
               case "_metrics_summary":
                  var3.metricSummaries = var1.nextMapOfListOrNull(var2, new MetricSummary.Deserializer());
                  break;
               case "transaction_info":
                  var3.transactionInfo = new TransactionInfo.Deserializer().deserialize(var1, var2);
                  break;
               default:
                  if (!var5.deserializeValue(var3, var6, var1, var2)) {
                     if (var4 == null) {
                        var4 = new ConcurrentHashMap();
                     }

                     var1.nextUnknown(var2, var4, var6);
                  }
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String TRANSACTION = "transaction";
      public static final String START_TIMESTAMP = "start_timestamp";
      public static final String TIMESTAMP = "timestamp";
      public static final String SPANS = "spans";
      public static final String TYPE = "type";
      public static final String MEASUREMENTS = "measurements";
      public static final String METRICS_SUMMARY = "_metrics_summary";
      public static final String TRANSACTION_INFO = "transaction_info";
   }
}
