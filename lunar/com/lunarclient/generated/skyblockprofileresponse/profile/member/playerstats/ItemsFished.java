package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ItemsFished() {
   @NotNull
   private final BetterJson elm;

   public ItemsFished(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> largeTreasure() {
      return this.elm.get("large_treasure").asDouble();
   }

   public Optional<Double> normal() {
      return this.elm.get("normal").asDouble();
   }

   public Optional<Double> outstanding() {
      return this.elm.get("outstanding").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }

   public Optional<Double> treasure() {
      return this.elm.get("treasure").asDouble();
   }

   public Optional<Double> trophyFish() {
      return this.elm.get("trophy_fish").asDouble();
   }

   public Optional<Double> trophyFrog() {
      return this.elm.get("trophy_frog").asDouble();
   }
}
