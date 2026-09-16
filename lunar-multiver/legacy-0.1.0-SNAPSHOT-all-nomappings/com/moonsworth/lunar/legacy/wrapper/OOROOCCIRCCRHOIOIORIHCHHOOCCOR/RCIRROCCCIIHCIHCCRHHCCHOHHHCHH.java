package com.moonsworth.lunar.legacy.wrapper.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorldNameable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final IInventory RHCROCIHIICRHIIICOHIOHHCCOCIHC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IInventory var1) {
      this.RHCROCIHIICRHIIICOHIOHHCCOCIHC = var1;
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getStackInSlot(int var1) {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.RHCROCIHIICRHIIICOHIOHHCCOCIHC.getStackInSlot(var1);
   }

   public void bridge$setInventorySlotContents(int var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2) {
      this.RHCROCIHIICRHIIICOHIOHHCCOCIHC.setInventorySlotContents(var1, (ItemStack)var2);
   }

   public Component bridge$getDisplayName() {
      return (Component)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)((IWorldNameable)this.RHCROCIHIICRHIIICOHIOHHCCOCIHC)
               .getDisplayName()
         )
         : Component.text(""));
   }

   public int bridge$getInventoryStackLimit() {
      return this.RHCROCIHIICRHIIICOHIOHHCCOCIHC.getInventoryStackLimit();
   }
}
