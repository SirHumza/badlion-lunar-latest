package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ItemArmor.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends Item
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public ArmorMaterial material;
   @Final
   @Shadow
   public int armorType$v1_7;
   @Final
   @Shadow
   public EntityEquipmentSlot armorType$v1_12;
   @Shadow
   public int damageReduceAmount;

   @Shadow
   public abstract boolean hasColor(ItemStack var1);

   @Shadow
   public abstract int getColor(ItemStack var1);

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR bridge$getSlot() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         if (this.armorType$v1_12 == EntityEquipmentSlot.MAINHAND) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.MAINHAND;
         } else if (this.armorType$v1_12 == EntityEquipmentSlot.OFFHAND) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OFFHAND;
         } else if (this.armorType$v1_12 == EntityEquipmentSlot.FEET) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.FEET;
         } else if (this.armorType$v1_12 == EntityEquipmentSlot.LEGS) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LEGS;
         } else if (this.armorType$v1_12 == EntityEquipmentSlot.CHEST) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CHEST;
         } else {
            return this.armorType$v1_12 == EntityEquipmentSlot.HEAD
               ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HEAD
               : null;
         }
      } else {
         return switch (this.armorType$v1_7) {
            case 0 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.MAINHAND;
            case 1 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.FEET;
            case 2 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LEGS;
            case 3 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CHEST;
            case 4 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HEAD;
            default -> null;
         };
      }
   }

   public boolean bridge$hasColor(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.hasColor((ItemStack)var1);
   }

   public int bridge$getColor(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.getColor((ItemStack)var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getArmorMaterial() {
      return switch (this.material) {
         case CHAIN -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHAIN;
         case IRON -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRON;
         case GOLD -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GOLD;
         case DIAMOND -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DIAMOND;
         default -> (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 0 || this.material != ArmorMaterial.CLOTH$v1_7)
               && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1 || this.material != ArmorMaterial.LEATHER$v1_8)
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UNKNOWN
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LEATHER;
      };
   }

   public int bridge$getArmorValue(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.damageReduceAmount;
   }

   public String bridge$getResourcePath() {
      boolean var1 = this.bridge$getSlot()
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LEGS;
      Object var2 = null;
      String var3 = this.bridge$getArmorMaterial().getMaterial();
      String var4 = "minecraft";
      int var5 = var3.indexOf(58);
      if (var5 != -1) {
         var4 = var3.substring(0, var5);
         var3 = var3.substring(var5 + 1);
      }

      return String.format("%s:textures/models/armor/%s_layer_%d%s.png", var4, var3, var1 ? 2 : 1, var2 == null ? "" : String.format("_%s", var2));
   }
}
