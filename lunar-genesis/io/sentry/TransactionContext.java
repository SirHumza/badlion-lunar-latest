package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TransactionContext extends SpanContext {
   @NotNull
   private static final String DEFAULT_NAME = "<unlabeled transaction>";
   @NotNull
   private static final TransactionNameSource DEFAULT_NAME_SOURCE = TransactionNameSource.CUSTOM;
   @NotNull
   private static final String DEFAULT_OPERATION = "default";
   @NotNull
   private String name;
   @NotNull
   private TransactionNameSource transactionNameSource;
   @Nullable
   private TracesSamplingDecision parentSamplingDecision;
   @Nullable
   private Baggage baggage;
   @NotNull
   private Instrumenter instrumenter = Instrumenter.SENTRY;
   private boolean isForNextAppStart = false;

   @Deprecated
   @NotNull
   public static TransactionContext fromSentryTrace(@NotNull String var0, @NotNull String var1, @NotNull SentryTraceHeader var2) {
      Boolean var3 = var2.isSampled();
      TracesSamplingDecision var4 = var3 == null ? null : new TracesSamplingDecision(var3);
      TransactionContext var5 = new TransactionContext(var2.getTraceId(), new SpanId(), var2.getSpanId(), var4, null);
      var5.setName(var0);
      var5.setTransactionNameSource(TransactionNameSource.CUSTOM);
      var5.setOperation(var1);
      return var5;
   }

   @ApiStatus.Internal
   public static TransactionContext fromPropagationContext(@NotNull PropagationContext var0) {
      Boolean var1 = var0.isSampled();
      TracesSamplingDecision var2 = var1 == null ? null : new TracesSamplingDecision(var1);
      Baggage var3 = var0.getBaggage();
      if (var3 != null) {
         var3.freeze();
         Double var4 = var3.getSampleRateDouble();
         Boolean var5 = var1 != null ? var1 : false;
         if (var4 != null) {
            var2 = new TracesSamplingDecision(var5, var4);
         } else {
            var2 = new TracesSamplingDecision(var5);
         }
      }

      return new TransactionContext(var0.getTraceId(), var0.getSpanId(), var0.getParentSpanId(), var2, var3);
   }

   public TransactionContext(@NotNull String var1, @NotNull String var2) {
      this(var1, var2, null);
   }

   @ApiStatus.Internal
   public TransactionContext(@NotNull String var1, @NotNull TransactionNameSource var2, @NotNull String var3) {
      this(var1, var2, var3, null);
   }

   public TransactionContext(@NotNull String var1, @NotNull String var2, @Nullable TracesSamplingDecision var3) {
      this(var1, TransactionNameSource.CUSTOM, var2, var3);
   }

   @ApiStatus.Internal
   public TransactionContext(@NotNull String var1, @NotNull TransactionNameSource var2, @NotNull String var3, @Nullable TracesSamplingDecision var4) {
      super(var3);
      this.name = Objects.requireNonNull(var1, "name is required");
      this.transactionNameSource = var2;
      this.setSamplingDecision(var4);
   }

   @ApiStatus.Internal
   public TransactionContext(@NotNull SentryId var1, @NotNull SpanId var2, @Nullable SpanId var3, @Nullable TracesSamplingDecision var4, @Nullable Baggage var5) {
      super(var1, var2, "default", var3, null);
      this.name = "<unlabeled transaction>";
      this.parentSamplingDecision = var4;
      this.transactionNameSource = DEFAULT_NAME_SOURCE;
      this.baggage = var5;
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   @Nullable
   public Boolean getParentSampled() {
      return this.parentSamplingDecision == null ? null : this.parentSamplingDecision.getSampled();
   }

   @Nullable
   public TracesSamplingDecision getParentSamplingDecision() {
      return this.parentSamplingDecision;
   }

   @Nullable
   public Baggage getBaggage() {
      return this.baggage;
   }

   public void setParentSampled(@Nullable Boolean var1) {
      if (var1 == null) {
         this.parentSamplingDecision = null;
      } else {
         this.parentSamplingDecision = new TracesSamplingDecision(var1);
      }
   }

   public void setParentSampled(@Nullable Boolean var1, @Nullable Boolean var2) {
      if (var1 == null) {
         this.parentSamplingDecision = null;
      } else if (var2 == null) {
         this.parentSamplingDecision = new TracesSamplingDecision(var1);
      } else {
         this.parentSamplingDecision = new TracesSamplingDecision(var1, null, var2, null);
      }
   }

   @NotNull
   public TransactionNameSource getTransactionNameSource() {
      return this.transactionNameSource;
   }

   @NotNull
   public Instrumenter getInstrumenter() {
      return this.instrumenter;
   }

   public void setInstrumenter(@NotNull Instrumenter var1) {
      this.instrumenter = var1;
   }

   public void setName(@NotNull String var1) {
      this.name = Objects.requireNonNull(var1, "name is required");
   }

   public void setTransactionNameSource(@NotNull TransactionNameSource var1) {
      this.transactionNameSource = var1;
   }

   @ApiStatus.Internal
   public void setForNextAppStart(boolean var1) {
      this.isForNextAppStart = var1;
   }

   public boolean isForNextAppStart() {
      return this.isForNextAppStart;
   }
}
