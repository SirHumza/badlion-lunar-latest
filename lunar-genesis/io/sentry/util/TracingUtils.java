package io.sentry.util;

import io.sentry.Baggage;
import io.sentry.BaggageHeader;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.PropagationContext;
import io.sentry.SentryOptions;
import io.sentry.SentryTraceHeader;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TracingUtils {
   public static void startNewTrace(@NotNull IHub var0) {
      var0.configureScope(var0x -> var0x.withPropagationContext(var1 -> var0x.setPropagationContext(new PropagationContext())));
   }

   @Nullable
   public static TracingUtils.TracingHeaders traceIfAllowed(@NotNull IHub var0, @NotNull String var1, @Nullable List<String> var2, @Nullable ISpan var3) {
      SentryOptions var4 = var0.getOptions();
      return var4.isTraceSampling() && shouldAttachTracingHeaders(var1, var4) ? trace(var0, var2, var3) : null;
   }

   @Nullable
   public static TracingUtils.TracingHeaders trace(@NotNull IHub var0, @Nullable List<String> var1, @Nullable ISpan var2) {
      SentryOptions var3 = var0.getOptions();
      if (var2 != null && !var2.isNoOp()) {
         return new TracingUtils.TracingHeaders(var2.toSentryTrace(), var2.toBaggageHeader(var1));
      }

      TracingUtils.PropagationContextHolder var4 = new TracingUtils.PropagationContextHolder();
      var0.configureScope(var2x -> var4.propagationContext = maybeUpdateBaggage(var2x, var3));
      if (var4.propagationContext != null) {
         PropagationContext var5 = var4.propagationContext;
         Baggage var6 = var5.getBaggage();
         BaggageHeader var7 = null;
         if (var6 != null) {
            var7 = BaggageHeader.fromBaggageAndOutgoingHeader(var6, var1);
         }

         return new TracingUtils.TracingHeaders(new SentryTraceHeader(var5.getTraceId(), var5.getSpanId(), null), var7);
      } else {
         return null;
      }
   }

   @NotNull
   public static PropagationContext maybeUpdateBaggage(@NotNull IScope var0, @NotNull SentryOptions var1) {
      return var0.withPropagationContext(var2 -> {
         Baggage var3 = var2.getBaggage();
         if (var3 == null) {
            var3 = new Baggage(var1.getLogger());
            var2.setBaggage(var3);
         }

         if (var3.isMutable()) {
            var3.setValuesFromScope(var0, var1);
            var3.freeze();
         }
      });
   }

   private static boolean shouldAttachTracingHeaders(@NotNull String var0, @NotNull SentryOptions var1) {
      return PropagationTargetsUtils.contain(var1.getTracePropagationTargets(), var0);
   }

   private static final class PropagationContextHolder {
      @Nullable
      private PropagationContext propagationContext = null;

      private PropagationContextHolder() {
      }
   }

   public static final class TracingHeaders {
      @NotNull
      private final SentryTraceHeader sentryTraceHeader;
      @Nullable
      private final BaggageHeader baggageHeader;

      public TracingHeaders(@NotNull SentryTraceHeader var1, @Nullable BaggageHeader var2) {
         this.sentryTraceHeader = var1;
         this.baggageHeader = var2;
      }

      @NotNull
      public SentryTraceHeader getSentryTraceHeader() {
         return this.sentryTraceHeader;
      }

      @Nullable
      public BaggageHeader getBaggageHeader() {
         return this.baggageHeader;
      }
   }
}
