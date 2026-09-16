package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.joml.Quaternionf;
import org.joml.Vector3f;

@FunctionalInterface
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH XN = var0 -> new Quaternionf().rotationX(-var0);
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH XP = var0 -> new Quaternionf().rotationX(var0);
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH YN = var0 -> new Quaternionf().rotationY(-var0);
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH YP = var0 -> new Quaternionf().rotationY(var0);
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ZN = var0 -> new Quaternionf().rotationZ(-var0);
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ZP = var0 -> new Quaternionf().rotationZ(var0);

   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH of(Vector3f var0) {
      return var1 -> new Quaternionf().rotationAxis(var1, var0);
   }

   Quaternionf rotation(float var1);

   default Quaternionf rotationDegrees(float var1) {
      return this.rotation(var1 * (float) (Math.PI / 180.0));
   }
}
