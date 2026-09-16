package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.FishingNet;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.HuntingScythe;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.InUse;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.Lasso;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.PocketBlackHole;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.ToolKit;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.Trap;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record HuntingToolkit() {
   @NotNull
   private final BetterJson elm;

   public HuntingToolkit(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<FishingNet> fishingNet() {
      return this.elm.get("FISHING_NET").asList(FishingNet::new);
   }

   public SafeList<HuntingScythe> huntingScythe() {
      return this.elm.get("HUNTING_SCYTHE").asList(HuntingScythe::new);
   }

   public SafeList<ToolKit> huntingToolkit() {
      return this.elm.get("HUNTING_TOOLKIT").asList(ToolKit::new);
   }

   public InUse inUse() {
      return new InUse(this.elm.get("IN_USE"));
   }

   public Optional<Boolean> isUnlocked() {
      return this.elm.get("IS_UNLOCKED").asBool();
   }

   public SafeList<Lasso> lasso() {
      return this.elm.get("LASSO").asList(Lasso::new);
   }

   public SafeList<PocketBlackHole> pocketBlackHole() {
      return this.elm.get("POCKET_BLACK_HOLE").asList(PocketBlackHole::new);
   }

   public SafeList<Trap> trap() {
      return this.elm.get("TRAP").asList(Trap::new);
   }
}
