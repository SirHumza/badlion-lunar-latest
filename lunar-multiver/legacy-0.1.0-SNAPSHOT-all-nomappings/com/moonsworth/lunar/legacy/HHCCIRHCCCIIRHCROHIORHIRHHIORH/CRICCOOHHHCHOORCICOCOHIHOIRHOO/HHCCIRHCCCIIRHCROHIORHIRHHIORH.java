package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.IInventory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ContainerRepair.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends Container
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public IInventory inputSlots;
   @Shadow
   public int maximumCost;
   @Final
   @Shadow
   public IInventory outputSlot;
   @Shadow
   public int materialCost;
   @Final
   @Shadow
   public EntityPlayer player;
   @Shadow
   public String repairedItemName;

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$outputSlot() {
      return new com.moonsworth.lunar.legacy.wrapper.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.outputSlot);
   }

   public String bridge$repairedItemName() {
      return this.repairedItemName;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$inputSlots() {
      return new com.moonsworth.lunar.legacy.wrapper.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.inputSlots);
   }

   public void bridge$setMaximumCost(int var1) {
      this.maximumCost = var1;
   }

   public void bridge$setMaterialCost(int var1) {
      this.materialCost = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$player() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.player;
   }

   public int bridge$getMaximumCost() {
      return this.maximumCost;
   }

   public void bridge$detectAndSendChanges() {
      this.detectAndSendChanges();
   }
}
