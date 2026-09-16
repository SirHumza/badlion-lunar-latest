package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.treegifts;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MilestoneTierClaimed() {
   @NotNull
   private final BetterJson elm;

   public MilestoneTierClaimed(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> fig() {
      return this.elm.get("FIG").asDouble();
   }

   public Optional<Double> mangrove() {
      return this.elm.get("MANGROVE").asDouble();
   }
}
