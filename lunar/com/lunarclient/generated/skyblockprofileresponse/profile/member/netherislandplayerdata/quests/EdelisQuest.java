package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record EdelisQuest() {
   @NotNull
   private final BetterJson elm;

   public EdelisQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> heardStoryHome() {
      return this.elm.get("heard_story_home").asBool();
   }

   public Optional<Boolean> heardStoryStatue() {
      return this.elm.get("heard_story_statue").asBool();
   }
}
