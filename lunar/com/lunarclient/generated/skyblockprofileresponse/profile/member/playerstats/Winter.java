package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Winter() {
   @NotNull
   private final BetterJson elm;

   public Winter(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> mostCannonballsHit() {
      return this.elm.get("most_cannonballs_hit").asDouble();
   }

   public Optional<Double> mostDamageDealt() {
      return this.elm.get("most_damage_dealt").asDouble();
   }

   public Optional<Double> mostMagmaDamageDealt() {
      return this.elm.get("most_magma_damage_dealt").asDouble();
   }

   public Optional<Double> mostSnowballsHit() {
      return this.elm.get("most_snowballs_hit").asDouble();
   }
}
