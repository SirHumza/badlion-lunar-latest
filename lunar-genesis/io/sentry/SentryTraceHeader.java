package io.sentry;

import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryTraceHeader {
   public static final String SENTRY_TRACE_HEADER = "sentry-trace";
   @NotNull
   private final SentryId traceId;
   @NotNull
   private final SpanId spanId;
   @Nullable
   private final Boolean sampled;

   public SentryTraceHeader(@NotNull SentryId var1, @NotNull SpanId var2, @Nullable Boolean var3) {
      this.traceId = var1;
      this.spanId = var2;
      this.sampled = var3;
   }

   public SentryTraceHeader(@NotNull String var1) {
      String[] var2 = var1.split("-", -1);
      if (var2.length < 2) {
         throw new InvalidSentryTraceHeaderException(var1);
      }

      if (var2.length == 3) {
         this.sampled = "1".equals(var2[2]);
      } else {
         this.sampled = null;
      }

      try {
         this.traceId = new SentryId(var2[0]);
         this.spanId = new SpanId(var2[1]);
      } catch (Throwable var4) {
         throw new InvalidSentryTraceHeaderException(var1, var4);
      }
   }

   @NotNull
   public String getName() {
      return "sentry-trace";
   }

   @NotNull
   public String getValue() {
      return this.sampled != null
         ? String.format("%s-%s-%s", this.traceId, this.spanId, this.sampled ? "1" : "0")
         : String.format("%s-%s", this.traceId, this.spanId);
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
   public Boolean isSampled() {
      return this.sampled;
   }
}
