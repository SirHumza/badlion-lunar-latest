package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record WyldWoods() {
   @NotNull
   private final BetterJson elm;

   public WyldWoods(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bughunterStep() {
      return this.elm.get("bughunter_step").asDouble();
   }

   public Optional<Boolean> siriusClaimedDoubloon() {
      return this.elm.get("sirius_claimed_doubloon").asBool();
   }

   public Optional<Boolean> siriusCompletedQA() {
      return this.elm.get("sirius_completed_q_a").asBool();
   }

   public Optional<Boolean> siriusQAChainDone() {
      return this.elm.get("sirius_q_a_chain_done").asBool();
   }

   public Optional<Boolean> siriusStartedQA() {
      return this.elm.get("sirius_started_q_a").asBool();
   }

   public List<String> talkedThreebrothers() {
      return this.elm.get("talked_threebrothers").asListOpt(BetterJson::asString);
   }
}
