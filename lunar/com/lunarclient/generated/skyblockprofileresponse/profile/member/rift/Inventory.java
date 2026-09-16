package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.google.gson.JsonElement;
import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.inventory.EnderChestContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.inventory.EquipmentContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.inventory.InvArmor;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.inventory.InvContents;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record Inventory() {
   @NotNull
   private final BetterJson elm;

   public Inventory(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public EnderChestContents enderChestContents() {
      return new EnderChestContents(this.elm.get("ender_chest_contents"));
   }

   public List<JsonElement> enderChestPageIcons() {
      return this.elm.get("ender_chest_page_icons").asListOpt(BetterJson::asJsonElement);
   }

   public EquipmentContents equipmentContents() {
      return new EquipmentContents(this.elm.get("equipment_contents"));
   }

   public InvArmor invArmor() {
      return new InvArmor(this.elm.get("inv_armor"));
   }

   public InvContents invContents() {
      return new InvContents(this.elm.get("inv_contents"));
   }
}
