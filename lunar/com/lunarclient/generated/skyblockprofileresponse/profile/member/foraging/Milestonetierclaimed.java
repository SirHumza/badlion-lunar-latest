package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.treegifts.MilestoneTierClaimed;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TreeGifts() {
   @NotNull
   private final BetterJson elm;

   public TreeGifts(@NotNull BetterJson var1) {
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

   public MilestoneTierClaimed milestoneTierClaimed() {
      return new MilestoneTierClaimed(this.elm.get("milestone_tier_claimed"));
   }
}
