package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.crystals;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CrystalData() {
   @NotNull
   private final BetterJson elm;

   public CrystalData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> state() {
      return this.elm.get("state").asString();
   }

   public Optional<Double> totalFound() {
      return this.elm.get("total_found").asDouble();
   }

   public Optional<Double> totalPlaced() {
      return this.elm.get("total_placed").asDouble();
   }
}
