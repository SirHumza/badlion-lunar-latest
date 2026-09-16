package com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Perks() {
   @NotNull
   private final BetterJson elm;

   public Perks(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> doubleDrops() {
      return this.elm.get("double_drops").asDouble();
   }

   public Optional<Double> farmingLevelCap() {
      return this.elm.get("farming_level_cap").asDouble();
   }

   public Optional<Boolean> personalBests() {
      return this.elm.get("personal_bests").asBool();
   }
}
