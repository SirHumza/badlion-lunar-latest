package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.pets;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Milestone() {
   @NotNull
   private final BetterJson elm;

   public Milestone(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> oresMined() {
      return this.elm.get("ores_mined").asDouble();
   }

   public Optional<Double> seaCreaturesKilled() {
      return this.elm.get("sea_creatures_killed").asDouble();
   }
}
