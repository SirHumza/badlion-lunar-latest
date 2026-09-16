package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Vec3i.class)
public abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR implements RORCHCIIICOHIRROOORHOCCCCIOCCI {
   @Final
   @Shadow
   public int chunkPosX$v1_7;
   @Final
   @Shadow
   public int chunkPosY$v1_7;
   @Final
   @Shadow
   public int chunkPosZ$v1_7;

   @Shadow
   public abstract int getX$v1_8();

   @Shadow
   public abstract int getY$v1_8();

   @Shadow
   public abstract int getZ$v1_8();

   public RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$add(Vector3ic var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (RORCHCIIICOHIRROOORHOCCCCIOCCI)(new BlockPos(this.bridge$getX() + var1.x(), this.bridge$getY() + var1.y(), this.bridge$getZ() + var1.z()))
         : (RORCHCIIICOHIRROOORHOCCCCIOCCI)(new Vector3i(this.bridge$getX() + var1.x(), this.bridge$getY() + var1.y(), this.bridge$getZ() + var1.z()));
   }

   public int bridge$getX() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getX$v1_8() : this.chunkPosX$v1_7;
   }

   public int bridge$getY() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getY$v1_8() : this.chunkPosY$v1_7;
   }

   public int bridge$getZ() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getZ$v1_8() : this.chunkPosZ$v1_7;
   }
}
