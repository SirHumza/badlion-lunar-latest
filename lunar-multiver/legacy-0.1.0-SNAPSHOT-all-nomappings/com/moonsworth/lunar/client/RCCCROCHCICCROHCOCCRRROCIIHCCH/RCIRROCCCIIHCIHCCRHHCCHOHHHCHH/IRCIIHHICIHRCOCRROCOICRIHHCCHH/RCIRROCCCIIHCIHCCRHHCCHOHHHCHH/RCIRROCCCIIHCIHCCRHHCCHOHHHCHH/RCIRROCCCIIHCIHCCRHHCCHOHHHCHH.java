package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({BlockDoublePlant.class, BlockTallGrass.class})
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Block {
   private static final int INVISIBLE = -1;

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public int getRenderType() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHHCIRIOROOHCHIICIHHIIIHHHCOHH()) {
         return -1;
      } else {
         return this instanceof BlockDoublePlant ? 40 : super.getRenderType();
      }
   }
}
