package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Castle() {
   @NotNull
   private final BetterJson elm;

   public Castle(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> boughtPathwaySkip() {
      return this.elm.get("bought_pathway_skip").asBool();
   }

   public Optional<Double> fairyStep() {
      return this.elm.get("fairy_step").asDouble();
   }

   public Optional<Double> grubberStacks() {
      return this.elm.get("grubber_stacks").asDouble();
   }

   public Optional<Boolean> unlockedPathwaySkip() {
      return this.elm.get("unlocked_pathway_skip").asBool();
   }
}
