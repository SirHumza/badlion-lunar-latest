package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Slot.class)
public abstract class IHICORCROOROHCIHIHCOIHRRHICICO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Final
   @Shadow
   public int slotIndex;
   @Shadow
   public int xPos;
   @Shadow
   public int yPos;
   @Final
   @Shadow
   public IInventory inventory;
   @Shadow
   public int slotNumber;

   @Shadow
   public abstract ItemStack getStack();

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getItemStack() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getStack();
      return var1 == null
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI().ORIHOCRRHHCCOIHICIOHCIOCIIHOOO()
         : var1;
   }

   public int bridge$getIndex() {
      return this.slotIndex;
   }

   public int bridge$getNumber() {
      return this.slotNumber;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getInventory() {
      return new com.moonsworth.lunar.legacy.wrapper.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.inventory);
   }

   public int bridge$getXDisplayPosition() {
      return this.xPos;
   }

   public int bridge$getYDisplayPosition() {
      return this.yPos;
   }
}
