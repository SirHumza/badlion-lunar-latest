package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record AlchemistQuest() {
   @NotNull
   private final BetterJson elm;

   public AlchemistQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> alchemistQuestProgress() {
      return this.elm.get("alchemist_quest_progress").asDouble();
   }

   public Optional<Boolean> alchemistQuestStart() {
      return this.elm.get("alchemist_quest_start").asBool();
   }
}
