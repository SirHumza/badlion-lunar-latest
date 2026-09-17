package com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.slayerbosses.SlayerStats;
import org.jetbrains.annotations.NotNull;

public record SlayerBosses() {
   @NotNull
   private final BetterJson elm;

   public SlayerBosses(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SlayerStats blaze() {
      return new SlayerStats(this.elm.get("blaze"));
   }

   public SlayerStats enderman() {
      return new SlayerStats(this.elm.get("enderman"));
   }

   public SlayerStats spider() {
      return new SlayerStats(this.elm.get("spider"));
   }

   public SlayerStats vampire() {
      return new SlayerStats(this.elm.get("vampire"));
   }

   public SlayerStats wolf() {
      return new SlayerStats(this.elm.get("wolf"));
   }

   public SlayerStats zombie() {
      return new SlayerStats(this.elm.get("zombie"));
   }
}
