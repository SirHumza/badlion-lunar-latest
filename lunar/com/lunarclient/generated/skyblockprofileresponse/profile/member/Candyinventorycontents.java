package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.sharedinventory.CandyInventoryContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.sharedinventory.CarnivalMaskInventoryContents;
import org.jetbrains.annotations.NotNull;

public record SharedInventory() {
   @NotNull
   private final BetterJson elm;

   public SharedInventory(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public CandyInventoryContents candyInventoryContents() {
      return new CandyInventoryContents(this.elm.get("candy_inventory_contents"));
   }

   public CarnivalMaskInventoryContents carnivalMaskInventoryContents() {
      return new CarnivalMaskInventoryContents(this.elm.get("carnival_mask_inventory_contents"));
   }
}
