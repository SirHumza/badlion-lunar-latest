package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.pets.Milestone;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Pets() {
   @NotNull
   private final BetterJson elm;

   public Pets(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Milestone milestone() {
      return new Milestone(this.elm.get("milestone"));
   }

   public Optional<Double> totalExpGained() {
      return this.elm.get("total_exp_gained").asDouble();
   }
}
