package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeMap;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.BackpackContent;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.BackpackIcon;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.BagContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.EnderChestContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.EquipmentContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.InvArmor;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.InvContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.PersonalVaultContents;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.WardrobeContents;
import java.util.Map;
import java.util.Optional;
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

   public SafeMap<BackpackContent> backpackContents() {
      return this.elm.get("backpack_contents").asMap(BackpackContent::new);
   }

   public SafeMap<BackpackIcon> backpackIcons() {
      return this.elm.get("backpack_icons").asMap(BackpackIcon::new);
   }

   public BagContents bagContents() {
      return new BagContents(this.elm.get("bag_contents"));
   }

   public EnderChestContents enderChestContents() {
      return new EnderChestContents(this.elm.get("ender_chest_contents"));
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

   public PersonalVaultContents personalVaultContents() {
      return new PersonalVaultContents(this.elm.get("personal_vault_contents"));
   }

   public Map<String, Double> sacksCounts() {
      return this.elm.get("sacks_counts").asMapOpt(BetterJson::asDouble);
   }

   public WardrobeContents wardrobeContents() {
      return new WardrobeContents(this.elm.get("wardrobe_contents"));
   }

   public Optional<Double> wardrobeEquippedSlot() {
      return this.elm.get("wardrobe_equipped_slot").asDouble();
   }
}
