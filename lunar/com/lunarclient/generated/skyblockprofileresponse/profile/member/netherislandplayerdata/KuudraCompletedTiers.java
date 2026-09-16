package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record KuudraCompletedTiers() {
   @NotNull
   private final BetterJson elm;

   public KuudraCompletedTiers(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> burning() {
      return this.elm.get("burning").asDouble();
   }

   public Optional<Double> fiery() {
      return this.elm.get("fiery").asDouble();
   }

   public Optional<Double> highestWaveBurning() {
      return this.elm.get("highest_wave_burning").asDouble();
   }

   public Optional<Double> highestWaveFiery() {
      return this.elm.get("highest_wave_fiery").asDouble();
   }

   public Optional<Double> highestWaveHot() {
      return this.elm.get("highest_wave_hot").asDouble();
   }

   public Optional<Double> highestWaveInfernal() {
      return this.elm.get("highest_wave_infernal").asDouble();
   }

   public Optional<Double> highestWaveNone() {
      return this.elm.get("highest_wave_none").asDouble();
   }

   public Optional<Double> hot() {
      return this.elm.get("hot").asDouble();
   }

   public Optional<Double> infernal() {
      return this.elm.get("infernal").asDouble();
   }

   public Optional<Double> none() {
      return this.elm.get("none").asDouble();
   }
}
