package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.Random;
import io.sentry.util.SentryRandom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

final class TracesSampler {
   @NotNull
   private static final Double DEFAULT_TRACES_SAMPLE_RATE = 1.0;
   @NotNull
   private final SentryOptions options;
   @Nullable
   private final Random random;

   public TracesSampler(@NotNull SentryOptions var1) {
      this(Objects.requireNonNull(var1, "options are required"), null);
   }

   @TestOnly
   TracesSampler(@NotNull SentryOptions var1, @Nullable Random var2) {
      this.options = var1;
      this.random = var2;
   }

   @NotNull
   TracesSamplingDecision sample(@NotNull SamplingContext var1) {
      TracesSamplingDecision var2 = var1.getTransactionContext().getSamplingDecision();
      if (var2 != null) {
         return var2;
      }

      Double var3 = null;
      if (this.options.getProfilesSampler() != null) {
         try {
            var3 = this.options.getProfilesSampler().sample(var1);
         } catch (Throwable var13) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", var13);
         }
      }

      if (var3 == null) {
         var3 = this.options.getProfilesSampleRate();
      }

      Boolean var4 = var3 != null && this.sample(var3);
      if (this.options.getTracesSampler() != null) {
         Double var5 = null;

         try {
            var5 = this.options.getTracesSampler().sample(var1);
         } catch (Throwable var12) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", var12);
         }

         if (var5 != null) {
            return new TracesSamplingDecision(this.sample(var5), var5, var4, var3);
         }
      }

      TracesSamplingDecision var14 = var1.getTransactionContext().getParentSamplingDecision();
      if (var14 != null) {
         return var14;
      }

      Double var6 = this.options.getTracesSampleRate();
      Boolean var7 = this.options.getEnableTracing();
      Double var8 = Boolean.TRUE.equals(var7) ? DEFAULT_TRACES_SAMPLE_RATE : null;
      Double var9 = var6 == null ? var8 : var6;
      Double var10 = Math.pow(2.0, this.options.getBackpressureMonitor().getDownsampleFactor());
      Double var11 = var9 == null ? null : var9 / var10;
      return var11 != null ? new TracesSamplingDecision(this.sample(var11), var11, var4, var3) : new TracesSamplingDecision(false, null, false, null);
   }

   private boolean sample(@NotNull Double var1) {
      return !(var1 < this.getRandom().nextDouble());
   }

   private Random getRandom() {
      return this.random == null ? SentryRandom.current() : this.random;
   }
}
