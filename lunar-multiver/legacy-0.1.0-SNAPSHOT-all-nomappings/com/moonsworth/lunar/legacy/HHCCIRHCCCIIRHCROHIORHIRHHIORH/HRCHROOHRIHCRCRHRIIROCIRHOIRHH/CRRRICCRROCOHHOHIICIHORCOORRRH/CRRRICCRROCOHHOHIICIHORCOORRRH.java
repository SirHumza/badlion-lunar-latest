package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(InventoryPlayer.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public NonNullList<ItemStack> mainInventory$v1_12;
   @Final
   @Shadow
   public NonNullList<ItemStack> armorInventory$v1_12;
   @Final
   @Shadow
   public NonNullList<ItemStack> offHandInventory$v1_12;
   @Shadow
   public ItemStack[] armorInventory$v1_7;
   @Shadow
   public ItemStack itemStack;
   @Shadow
   public ItemStack[] mainInventory$v1_7;
   @Shadow
   public int currentItem;

   public int bridge$getSelectedSlot() {
      return this.currentItem;
   }

   public List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getMainInventory() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.mainInventory$v1_12.delegate : Arrays.asList(this.mainInventory$v1_7);
   }

   public List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getArmorInventory() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.armorInventory$v1_12.delegate : Arrays.asList(this.armorInventory$v1_7);
   }

   public List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getOffhandInventory() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.offHandInventory$v1_12.delegate : Collections.singletonList(this.itemStack);
   }

   public void bridge$setOffhandItem(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.offHandInventory$v1_12.set(0, (ItemStack)var1);
      }
   }
}
