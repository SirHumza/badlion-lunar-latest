package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.concurrent.ThreadLocalRandom;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      float var3 = (float)this.HIHRCCRRRIOIRCRCRHORICIRIRRCHI[0].get();
      float var4 = (float)this.HIHRCCRRRIOIRCRCRHORICIRIRRCHI[1].get();
      float var5 = (float)this.HIHRCCRRRIOIRCRCRHORICIRIRRCHI[2].get();
      float var6 = 0.0F;
      float var7 = 0.0F;
      if (var1.OOCCIORCOIOCOHCIIHCRRCCRORHICH != null) {
         var6 = var1.OOCCIORCOIOCOHCIIHCRRCCRORHICH.bridge$getWidth();
         var7 = var1.OOCCIORCOIOCOHCIIHCRRCCRORHICH.bridge$getEyeHeight();
      }

      ThreadLocalRandom var8 = ThreadLocalRandom.current();
      var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.x = var3 + (var8.nextFloat() - 0.5F) * var6;
      var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.y = var4 + (var8.nextFloat() - 0.5F) * var7;
      var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.z = var5 + (var8.nextFloat() - 0.5F) * var6;
      if (this.COIORHCHIHOHORCCHIOOIHRROOOCIR) {
         int var9 = (int)(var8.nextDouble() * 6.0 * 100.0) % 6;
         if (var9 == 0) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.x = var3 + var6 / 2.0F;
         } else if (var9 == 1) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.x = var3 - var6 / 2.0F;
         } else if (var9 == 2) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.y = var4 + var7 / 2.0F;
         } else if (var9 == 3) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.y = var4 - var7 / 2.0F;
         } else if (var9 == 4) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.z = var5 + var6 / 2.0F;
         } else if (var9 == 5) {
            var2.OIIOCRRCOICIOOCHOCHHIRHRCORIRI.z = var5 - var6 / 2.0F;
         }
      }

      this.CRHOCRRHOORRIOOIHCOORCIHRCHIOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var5);
   }
}
