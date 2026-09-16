package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit;

import com.lunarclient.BetterJson;
import org.jetbrains.annotations.NotNull;

public record InUse() {
   @NotNull
   private final BetterJson elm;

   public InUse(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.FishingNet fishingNet() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.FishingNet(this.elm.get("FISHING_NET"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.HuntingScythe huntingScythe() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.HuntingScythe(this.elm.get("HUNTING_SCYTHE"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.Lasso lasso() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.Lasso(this.elm.get("LASSO"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.PocketBlackHole pocketBlackHole() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.PocketBlackHole(
         this.elm.get("POCKET_BLACK_HOLE")
      );
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.Trap trap() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse.Trap(this.elm.get("TRAP"));
   }
}
