package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.quests.HarpQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.quests.TrapperQuest;
import org.jetbrains.annotations.NotNull;

public record Quests() {
   @NotNull
   private final BetterJson elm;

   public Quests(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public HarpQuest harpQuest() {
      return new HarpQuest(this.elm.get("harp_quest"));
   }

   public TrapperQuest trapperQuest() {
      return new TrapperQuest(this.elm.get("trapper_quest"));
   }
}
