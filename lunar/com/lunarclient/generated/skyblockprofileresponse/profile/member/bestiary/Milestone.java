package com.lunarclient.generated.skyblockprofileresponse.profile.member.bestiary;

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

   public Optional<Double> lastClaimedMilestone() {
      return this.elm.get("last_claimed_milestone").asDouble();
   }
}
