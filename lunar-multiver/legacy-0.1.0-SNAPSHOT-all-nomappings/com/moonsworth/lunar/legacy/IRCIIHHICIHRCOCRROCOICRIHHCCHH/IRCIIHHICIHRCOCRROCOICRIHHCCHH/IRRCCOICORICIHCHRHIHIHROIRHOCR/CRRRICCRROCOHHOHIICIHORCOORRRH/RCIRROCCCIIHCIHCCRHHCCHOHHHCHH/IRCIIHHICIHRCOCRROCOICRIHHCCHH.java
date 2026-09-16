package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({BlockDoublePlant.class, BlockTallGrass.class})
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends Block {
   @Unique
   private static final int INVISIBLE = -1;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public int getRenderType$v1_7() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.OHHCIRIOROOHCHIICIHHIIIHHHCOHH() ? -1 : super.getRenderType$v1_7();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public EnumBlockRenderType getRenderType$v1_12(IBlockState var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.OHHCIRIOROOHCHIICIHHIIIHHHCOHH() ? EnumBlockRenderType.INVISIBLE : super.getRenderType$v1_12(var1);
   }
}
