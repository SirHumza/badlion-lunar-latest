package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(EntityArmorStand.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public ItemStack[] contents$v1_8;

   @Shadow
   public abstract ItemStack getItemStackFromSlot$v1_12(EntityEquipmentSlot var1);

   @Shadow
   public abstract boolean hasMarker();

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getHelmet() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
         ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.contents$v1_8[4]
         : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.HEAD);
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getChestplate() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
         ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.contents$v1_8[3]
         : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.CHEST);
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getLeggings() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
         ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.contents$v1_8[2]
         : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.LEGS);
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getBoots() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
         ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.contents$v1_8[1]
         : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.FEET);
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getMainHand() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
         ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.contents$v1_8[0]
         : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.MAINHAND);
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getOffhand() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getItemStackFromSlot$v1_12(EntityEquipmentSlot.OFFHAND);
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   public boolean bridge$isMarker() {
      return this.hasMarker();
   }
}
