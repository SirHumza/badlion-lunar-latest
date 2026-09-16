package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TracesSamplingDecision {
   @NotNull
   private final Boolean sampled;
   @Nullable
   private final Double sampleRate;
   @NotNull
   private final Boolean profileSampled;
   @Nullable
   private final Double profileSampleRate;

   public TracesSamplingDecision(@NotNull Boolean var1) {
      this(var1, null);
   }

   public TracesSamplingDecision(@NotNull Boolean var1, @Nullable Double var2) {
      this(var1, var2, false, null);
   }

   public TracesSamplingDecision(@NotNull Boolean var1, @Nullable Double var2, @NotNull Boolean var3, @Nullable Double var4) {
      this.sampled = var1;
      this.sampleRate = var2;
      this.profileSampled = var1 && var3;
      this.profileSampleRate = var4;
   }

   @NotNull
   public Boolean getSampled() {
      return this.sampled;
   }

   @Nullable
   public Double getSampleRate() {
      return this.sampleRate;
   }

   @NotNull
   public Boolean getProfileSampled() {
      return this.profileSampled;
   }

   @Nullable
   public Double getProfileSampleRate() {
      return this.profileSampleRate;
   }
}
