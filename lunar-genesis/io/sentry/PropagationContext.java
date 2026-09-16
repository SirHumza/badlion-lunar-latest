package io.sentry;

import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class PropagationContext {
   @NotNull
   private SentryId traceId;
   @NotNull
   private SpanId spanId;
   @Nullable
   private SpanId parentSpanId;
   @Nullable
   private Boolean sampled;
   @Nullable
   private Baggage baggage;

   public static PropagationContext fromHeaders(@NotNull ILogger var0, @Nullable String var1, @Nullable String var2) {
      return fromHeaders(var0, var1, Arrays.asList(var2));
   }

   @NotNull
   public static PropagationContext fromHeaders(@NotNull ILogger var0, @Nullable String var1, @Nullable List<String> var2) {
      if (var1 == null) {
         return new PropagationContext();
      }

      try {
         SentryTraceHeader var3 = new SentryTraceHeader(var1);
         Baggage var4 = Baggage.fromHeader(var2, var0);
         return fromHeaders(var3, var4, null);
      } catch (InvalidSentryTraceHeaderException var5) {
         var0.log(SentryLevel.DEBUG, var5, "Failed to parse Sentry trace header: %s", var5.getMessage());
         return new PropagationContext();
      }
   }

   @NotNull
   public static PropagationContext fromHeaders(@NotNull SentryTraceHeader var0, @Nullable Baggage var1, @Nullable SpanId var2) {
      SpanId var3 = var2 == null ? new SpanId() : var2;
      return new PropagationContext(var0.getTraceId(), var3, var0.getSpanId(), var1, var0.isSampled());
   }

   public PropagationContext() {
      this(new SentryId(), new SpanId(), null, null, null);
   }

   public PropagationContext(@NotNull PropagationContext var1) {
      this(var1.getTraceId(), var1.getSpanId(), var1.getParentSpanId(), cloneBaggage(var1.getBaggage()), var1.isSampled());
   }

   @Nullable
   private static Baggage cloneBaggage(@Nullable Baggage var0) {
      return var0 != null ? new Baggage(var0) : null;
   }

   public PropagationContext(@NotNull SentryId var1, @NotNull SpanId var2, @Nullable SpanId var3, @Nullable Baggage var4, @Nullable Boolean var5) {
      this.traceId = var1;
      this.spanId = var2;
      this.parentSpanId = var3;
      this.baggage = var4;
      this.sampled = var5;
   }

   @NotNull
   public SentryId getTraceId() {
      return this.traceId;
   }

   public void setTraceId(@NotNull SentryId var1) {
      this.traceId = var1;
   }

   @NotNull
   public SpanId getSpanId() {
      return this.spanId;
   }

   public void setSpanId(@NotNull SpanId var1) {
      this.spanId = var1;
   }

   @Nullable
   public SpanId getParentSpanId() {
      return this.parentSpanId;
   }

   public void setParentSpanId(@Nullable SpanId var1) {
      this.parentSpanId = var1;
   }

   @Nullable
   public Baggage getBaggage() {
      return this.baggage;
   }

   public void setBaggage(@Nullable Baggage var1) {
      this.baggage = var1;
   }

   @Nullable
   public Boolean isSampled() {
      return this.sampled;
   }

   public void setSampled(@Nullable Boolean var1) {
      this.sampled = var1;
   }

   @Nullable
   public TraceContext traceContext() {
      return this.baggage != null ? this.baggage.toTraceContext() : null;
   }

   @NotNull
   public SpanContext toSpanContext() {
      SpanContext var1 = new SpanContext(this.traceId, this.spanId, "default", null, null);
      var1.setOrigin("auto");
      return var1;
   }
}
