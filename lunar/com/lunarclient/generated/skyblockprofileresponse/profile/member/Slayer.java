package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.SlayerBosses;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.SlayerQuest;
import org.jetbrains.annotations.NotNull;

public record Slayer() {
   @NotNull
   private final BetterJson elm;

   public Slayer(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SlayerBosses slayerBosses() {
      return new SlayerBosses(this.elm.get("slayer_bosses"));
   }

   public SlayerQuest slayerQuest() {
      return new SlayerQuest(this.elm.get("slayer_quest"));
   }
}
