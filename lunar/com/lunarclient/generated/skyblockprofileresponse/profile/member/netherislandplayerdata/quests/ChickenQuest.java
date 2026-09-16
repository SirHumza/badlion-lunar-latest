package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ChickenQuest() {
   @NotNull
   private final BetterJson elm;

   public ChickenQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> chickenQuestCollected() {
      return this.elm.get("chicken_quest_collected").asListOpt(BetterJson::asString);
   }

   public Optional<Double> chickenQuestProgress() {
      return this.elm.get("chicken_quest_progress").asDouble();
   }

   public Optional<Boolean> chickenQuestStart() {
      return this.elm.get("chicken_quest_start").asBool();
   }
}
