package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DuelTrainingQuest() {
   @NotNull
   private final BetterJson elm;

   public DuelTrainingQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> duelTrainingLastCompleteBarbarians() {
      return this.elm.get("duel_training_last_complete_barbarians").asDouble();
   }

   public Optional<Double> duelTrainingLastCompleteMages() {
      return this.elm.get("duel_training_last_complete_mages").asDouble();
   }

   public Optional<Double> duelTrainingPhaseBarbarians() {
      return this.elm.get("duel_training_phase_barbarians").asDouble();
   }

   public Optional<Double> duelTrainingPhaseMages() {
      return this.elm.get("duel_training_phase_mages").asDouble();
   }
}
