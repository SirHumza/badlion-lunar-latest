package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PomtairQuest() {
   @NotNull
   private final BetterJson elm;

   public PomtairQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> lastCompletion() {
      return this.elm.get("last_completion").asDouble();
   }

   public Optional<Boolean> talkedToNpc() {
      return this.elm.get("talked_to_npc").asBool();
   }
}
