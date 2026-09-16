package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TileEntity.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public int xCoord$v1_7;
   @Shadow
   public int yCoord$v1_7;
   @Shadow
   public int zCoord$v1_7;
   @Shadow
   public BlockPos pos$v1_8;

   @Shadow
   public abstract Block getBlockType();

   public RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$getBlockPos() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (RORCHCIIICOHIRROOORHOCCCCIOCCI)this.pos$v1_8
         : (RORCHCIIICOHIRROOORHOCCCCIOCCI)(new Vector3i(this.xCoord$v1_7, this.yCoord$v1_7, this.zCoord$v1_7));
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockType() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockType();
   }
}
