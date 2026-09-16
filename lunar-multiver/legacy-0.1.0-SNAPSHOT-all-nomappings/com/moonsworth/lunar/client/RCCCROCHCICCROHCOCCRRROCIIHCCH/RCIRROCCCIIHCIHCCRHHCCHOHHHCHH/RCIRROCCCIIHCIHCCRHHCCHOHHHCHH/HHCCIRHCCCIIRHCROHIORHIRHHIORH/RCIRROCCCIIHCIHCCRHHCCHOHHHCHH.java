package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityFX.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Entity {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(World var1) {
      super(var1);
   }

   public void moveEntity(double var1, double var3, double var5) {
      if ((Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
         .ORRHIRHIOCCCCOIROCRCORCRIIHOHH()
         .get()) {
         super.moveEntity(var1, var3, var5);
      } else {
         this.boundingBox.offset(var1, var3, var5);
         this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0;
         this.posY = this.boundingBox.minY + this.yOffset - this.yOffset2;
         this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0;
      }
   }
}
