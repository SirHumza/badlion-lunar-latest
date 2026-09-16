package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Goblin() {
   @NotNull
   private final BetterJson elm;

   public Goblin(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> kingQuestActive() {
      return this.elm.get("king_quest_active").asBool();
   }

   public Optional<Double> kingQuestsCompleted() {
      return this.elm.get("king_quests_completed").asDouble();
   }
}
