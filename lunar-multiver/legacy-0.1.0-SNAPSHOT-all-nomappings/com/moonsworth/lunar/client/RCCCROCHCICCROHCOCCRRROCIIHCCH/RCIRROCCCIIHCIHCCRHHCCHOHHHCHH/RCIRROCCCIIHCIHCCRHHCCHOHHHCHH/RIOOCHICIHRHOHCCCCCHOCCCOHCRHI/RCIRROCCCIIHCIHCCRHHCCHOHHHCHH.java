package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.world.storage.MapData.MapCoord;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MapCoord.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public byte centerX;
   @Shadow
   public byte centerZ;
   @Shadow
   public byte iconRotation;

   public byte bridge$getX() {
      return this.centerX;
   }

   public byte bridge$getY() {
      return this.centerZ;
   }

   public byte bridge$getRot() {
      return this.iconRotation;
   }

   public void bridge$setX(byte var1) {
      this.centerX = var1;
   }

   public void bridge$setY(byte var1) {
      this.centerZ = var1;
   }

   public void bridge$setRot(byte var1) {
      this.iconRotation = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getDecorationType() {
      throw new UnsupportedOperationException("Not available on 1.7");
   }
}
