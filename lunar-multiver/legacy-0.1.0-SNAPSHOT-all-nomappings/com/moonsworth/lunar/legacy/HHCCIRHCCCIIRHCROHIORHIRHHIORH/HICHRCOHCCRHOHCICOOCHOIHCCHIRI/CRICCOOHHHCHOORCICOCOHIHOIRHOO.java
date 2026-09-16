package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Item.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Shadow
   public abstract boolean hasEffect(ItemStack var1);

   @Shadow
   public abstract boolean getIsRepairable(ItemStack var1, ItemStack var2);

   @Shadow
   public abstract boolean shouldRotateAroundWhenRendering();

   @Shadow
   public abstract int getColorFromItemStack$v1_7(ItemStack var1, int var2);

   public boolean bridge$isItemSkull() {
      return this instanceof ItemSkull;
   }

   public boolean bridge$isItemBeacon() {
      return this instanceof ItemBlock var1 && var1.block instanceof BlockBeacon;
   }

   public boolean bridge$isItemPotion() {
      return this instanceof ItemPotion;
   }

   public boolean bridge$isMushroomStew() {
      return this == Items.MUSHROOM_STEW;
   }

   public boolean bridge$hasEffect(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.hasEffect((ItemStack)var1);
   }

   public Integer bridge$getColorFromItemStack(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, int var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? Minecraft.getMinecraft().itemColors$v1_12.colorMultiplier((ItemStack)var1, var2)
         : this.getColorFromItemStack$v1_7((ItemStack)var1, var2);
   }

   public boolean bridge$shouldRotateAroundWhenRendering() {
      return this.shouldRotateAroundWhenRendering();
   }

   public boolean bridge$isRepairable(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2
   ) {
      return this.getIsRepairable((ItemStack)var1, (ItemStack)var2);
   }

   public boolean bridge$isItemBlock() {
      return Block.getBlockFromItem((Item)this) != Blocks.AIR;
   }

   public String bridge$getRegistryName() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? ((ResourceLocation)Item.REGISTRY$v1_8.getNameForObject((Item)this)).toString()
         : Item.itemRegistry$v1_7.getNameForObject(this);
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getBlockFromItem() {
      if (this.bridge$isItemBlock()) {
         Block var1 = Block.getBlockFromItem((Item)this);
         return Optional.of((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1);
      } else {
         return Optional.empty();
      }
   }

   public boolean bridge$isItemArrow() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? (Item)this instanceof ItemArrow : this == Items.ARROW;
   }

   public boolean bridge$isBundle() {
      return false;
   }

   public boolean bridge$isAxe() {
      return this instanceof ItemAxe;
   }

   public boolean bridge$isArmor() {
      return this instanceof ItemArmor;
   }

   public boolean bridge$isItemAir() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? (Item)this instanceof ItemAir : false;
   }

   public boolean bridge$isItemSign() {
      return (Item)this instanceof ItemSign;
   }

   public boolean bridge$isItemRod() {
      Item var1 = (Item)this;
      return var1.equals(Items.FISHING_ROD);
   }

   public boolean bridge$isItemCarrotOnStick() {
      Item var1 = (Item)this;
      return var1.equals(Items.CARROT_ON_A_STICK);
   }

   public boolean bridge$isItemCarpet() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockCarpet;
   }

   public boolean bridge$isItemBasicTool() {
      Item var1 = (Item)this;
      return var1 instanceof ItemHoe
         || var1 instanceof ItemAxe
         || var1 instanceof ItemPickaxe
         || var1.equals(Items.WOODEN_SHOVEL)
         || var1.equals(Items.STONE_SHOVEL)
         || var1.equals(Items.IRON_SHOVEL)
         || var1.equals(Items.GOLDEN_SHOVEL)
         || var1.equals(Items.DIAMOND_SHOVEL);
   }

   public boolean bridge$isItemPickaxe() {
      return (Item)this instanceof ItemPickaxe;
   }

   public boolean bridge$isItemShovel() {
      Item var1 = (Item)this;
      return var1.equals(Items.WOODEN_SHOVEL)
         || var1.equals(Items.STONE_SHOVEL)
         || var1.equals(Items.IRON_SHOVEL)
         || var1.equals(Items.GOLDEN_SHOVEL)
         || var1.equals(Items.DIAMOND_SHOVEL);
   }

   public boolean bridge$isItemSword() {
      Item var1 = (Item)this;
      return var1 instanceof ItemSword;
   }

   public boolean bridge$isItemBow() {
      Item var1 = (Item)this;
      return var1.equals(Items.BOW);
   }

   public boolean bridge$isCrossbow() {
      return false;
   }

   public boolean bridge$isTrident() {
      return false;
   }

   public boolean bridge$isSpear() {
      return false;
   }

   public boolean bridge$isShield() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         Item var1 = (Item)this;
         return var1.equals(Items.SHIELD$v1_12);
      } else {
         return false;
      }
   }

   public boolean bridge$isWindCharge() {
      return false;
   }

   public boolean bridge$isEnderPearl() {
      Item var1 = (Item)this;
      return var1.equals(Items.ENDER_PEARL);
   }

   public boolean bridge$isChorusFruit() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         Item var1 = (Item)this;
         return var1.equals(Items.CHORUS_FRUIT$v1_12);
      } else {
         return false;
      }
   }

   public boolean bridge$isItemDoor() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockDoor;
   }

   public boolean bridge$isItemTrapdoor() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockTrapDoor;
   }

   public boolean bridge$isItemAnvil() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockAnvil;
   }

   public boolean bridge$isItemFence() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockFence;
   }

   public boolean bridge$isItemBed() {
      Block var1 = Block.getBlockFromItem((Item)this);
      return var1 instanceof BlockBed;
   }

   public boolean bridge$isItemBlazeRod() {
      Item var1 = (Item)this;
      return var1.equals(Items.BLAZE_ROD);
   }

   public boolean bridge$isItemStick() {
      Item var1 = (Item)this;
      return var1.equals(Items.STICK);
   }

   public boolean bridge$isItemBone() {
      Item var1 = (Item)this;
      return var1.equals(Items.BONE);
   }

   public boolean bridge$isItemEnchantedBook() {
      Item var1 = (Item)this;
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.equals(Items.ENCHANTED_BOOK$v1_12) : var1.equals(Items.enchanted_book$v1_7);
   }

   public boolean bridge$isItemElytra() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 2 ? this instanceof ItemElytra : false;
   }
}
