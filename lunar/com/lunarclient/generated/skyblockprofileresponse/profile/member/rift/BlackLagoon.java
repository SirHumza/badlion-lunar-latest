package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record BlackLagoon() {
   @NotNull
   private final BetterJson elm;

   public BlackLagoon(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> completedStep() {
      return this.elm.get("completed_step").asDouble();
   }

   public Optional<Boolean> deliveredSciencePaper() {
      return this.elm.get("delivered_science_paper").asBool();
   }

   public Optional<Boolean> receivedSciencePaper() {
      return this.elm.get("received_science_paper").asBool();
   }

   public Optional<Boolean> talkedToEdwin() {
      return this.elm.get("talked_to_edwin").asBool();
   }
}
