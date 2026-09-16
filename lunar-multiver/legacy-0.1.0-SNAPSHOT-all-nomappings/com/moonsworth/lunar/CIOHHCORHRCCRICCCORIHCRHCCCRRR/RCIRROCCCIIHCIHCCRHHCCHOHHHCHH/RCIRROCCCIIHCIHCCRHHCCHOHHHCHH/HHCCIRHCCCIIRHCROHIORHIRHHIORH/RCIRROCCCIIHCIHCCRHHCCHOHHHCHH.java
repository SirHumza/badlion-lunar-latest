package com.moonsworth.lunar.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.util.Vec4b;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Vec4b.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public byte field_176115_b;
   @Shadow
   public byte field_176116_c;
   @Shadow
   public byte field_176114_d;
   @Shadow
   public byte field_176117_a;

   public byte bridge$getX() {
      return this.field_176115_b;
   }

   public byte bridge$getY() {
      return this.field_176116_c;
   }

   public byte bridge$getRot() {
      return this.field_176114_d;
   }

   public void bridge$setX(byte var1) {
      this.field_176115_b = var1;
   }

   public void bridge$setY(byte var1) {
      this.field_176116_c = var1;
   }

   public void bridge$setRot(byte var1) {
      this.field_176114_d = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getDecorationType() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromLegacyId(
         this.field_176117_a
      );
   }
}
