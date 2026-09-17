package com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents.FishingBag;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents.PotionBag;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents.Quiver;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents.SacksBag;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents.TalismanBag;
import org.jetbrains.annotations.NotNull;

public record BagContents() {
   @NotNull
   private final BetterJson elm;

   public BagContents(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public FishingBag fishingBag() {
      return new FishingBag(this.elm.get("fishing_bag"));
   }

   public PotionBag potionBag() {
      return new PotionBag(this.elm.get("potion_bag"));
   }

   public Quiver quiver() {
      return new Quiver(this.elm.get("quiver"));
   }

   public SacksBag sacksBag() {
      return new SacksBag(this.elm.get("sacks_bag"));
   }

   public TalismanBag talismanBag() {
      return new TalismanBag(this.elm.get("talisman_bag"));
   }
}
