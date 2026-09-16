package com.moonsworth.lunar.legacy.wrapper.util;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var2.bridge$getBlock();
      Block var5 = (Block)var4;
      if (var5 != Blocks.DRAGON_EGG && var5 != Blocks.CAULDRON) {
         if (var5 instanceof BlockBush) {
            if (var3
                  == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AIR
               && !var4.bridge$hasCollision(var0, var1)) {
               return true;
            }
         } else {
            if (var5 instanceof BlockSnow) {
               return switch (var3) {
                  case LAND -> var2.bridge$getLayersValue() < 5;
                  case WATER, AIR -> false;
                  default -> throw new IncompatibleClassChangeError();
               };
            }

            if (var5 instanceof BlockTrapDoor || var5 instanceof BlockDoor || var5 instanceof BlockFenceGate) {
               return switch (var3) {
                  case LAND, AIR -> var2.bridge$getOpenValue();
                  case WATER -> false;
                  default -> throw new IncompatibleClassChangeError();
               };
            }

            if (var5 instanceof BlockLiquid) {
               return var4.bridge$isWater();
            }

            if (var5 instanceof BlockPistonMoving) {
               return false;
            }
         }
         return switch (var3) {
            case LAND, AIR -> IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
               ? !var5.getMaterial$v1_7().blocksMovement() && !var5.isFullBlock$v1_7()
               : var5.isNormalCube$v1_12((IBlockState)var2);
            case WATER -> var4.bridge$isWater();
            default -> throw new IncompatibleClassChangeError();
         };
      } else {
         return false;
      }
   }
}
