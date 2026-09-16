package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MollimQuest() {
   @NotNull
   private final BetterJson elm;

   public MollimQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> completedQuest() {
      return this.elm.get("completed_quest").asBool();
   }

   public Optional<Boolean> splashedGrandExpBottle() {
      return this.elm.get("splashed_grand_exp_bottle").asBool();
   }

   public Optional<Boolean> talkedToNpc() {
      return this.elm.get("talked_to_npc").asBool();
   }
}
