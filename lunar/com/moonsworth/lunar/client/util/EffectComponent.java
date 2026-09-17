package com.moonsworth.lunar.client.util;

import com.lunarclient.apollo.module.saturation.SaturationModule;
import java.util.Optional;
import lombok.Generated;

public final class IHICORCROOROHCIHIHCOIHRRHICICO {
   public static float OROOROCRCCIOCCRIRICCHHCHHHIHRR = 6.0F;
   public static float RHRICOOCROIORRIRRORRRRCHCORRCI = 4.0F;

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      Optional var2 = var0.bridge$getFood();
      return var2.isEmpty()
         ? false
         : var1.bridge$canEat(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get())
               .bridge$canEatWhenFull()
         );
   }

   private static HCHRIROHHHCORIOCROOCHRCIOROOCI IHRHHHORORIROOCORCIORRCOCHHHRI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
      Optional var2 = var1.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(SaturationModule.class);
      if (var2.isEmpty()) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var0
      );
      if (var3 == null) {
         return null;
      }

      if (!com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3, "hunger"
         )
         && !com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3, "saturation"
         )) {
         return null;
      }

      var1.OOROOCCIRCCRHOIOIORIHCHHOOCCOR("saturation", "Override");
      return new HCHRIROHHHCORIOCROOCHRCIOROOCI(var3.bridge$getInteger("hunger"), var3.bridge$getFloat("saturation"));
   }

   public static HCHRIROHHHCORIOCROOCHRCIOROOCI OIOORROOHCRRCOCOHICICRCIOCIIOH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      HCHRIROHHHCORIOCROOCHRCIOROOCI var1 = IHRHHHORORIROOCORCIORRCOCHHHRI(var0);
      if (var1 != null) {
         return var1;
      }

      Optional var2 = var0.bridge$getFood();
      int var3 = var2.<Integer>map(var1x -> var1x.bridge$getHealing(var0)).orElse(0);
      float var4 = var2.<Float>map(var1x -> var1x.bridge$getSaturation(var0)).orElse(0.0F);
      return new HCHRIROHHHCORIOCROOCHRCIOROOCI(var3, var4);
   }

   public static HCHRIROHHHCORIOCROOCHRCIOROOCI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return OIOORROOHCRRCOCOHICICRCIOCIIOH(var0);
   }

   public static boolean IOHOOIOHCHICOCHIICHCICCOHRCIII(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      Optional var1 = var0.bridge$getFood();
      if (var1.isEmpty()) {
         return false;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 26) {
         return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1.get())
            .bridge$givesBadEffect();
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var0.bridge$getDataComponent(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCICHCHCRRROOCCCHRRHHRCHOIOIHO
      );
      return var2 != null && var2.bridge$givesBadEffect();
   }

   public static float IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var0, float var1, float var2) {
      float var3 = 0.0F;
      if (Float.isFinite(var2) && Float.isFinite(var1)) {
         while (var0 >= 18) {
            while (var2 > RHRICOOCROIORRIRRORRRRCHCORRCI) {
               var2 -= RHRICOOCROIORRIRRORRRRCHCORRCI;
               if (var1 > 0.0F) {
                  var1 = Math.max(var1 - 1.0F, 0.0F);
               } else {
                  var0--;
               }
            }

            if (var0 >= 20 && Float.compare(var1, Float.MIN_NORMAL) > 0) {
               float var4 = Math.min(var1, OROOROCRCCIOCCRIRICCHHCHHHIHRR);
               float var5 = Math.nextUp(RHRICOOCROIORRIRRORRRRCHCORRCI) - var2;
               int var6 = Math.max(1, (int)Math.ceil(var5 / var4));
               var3 += var4 / OROOROCRCCIOCCRIRICCHHCHHHIHRR * var6;
               var2 += var4 * var6;
            } else if (var0 >= 18) {
               var3++;
               var2 += OROOROCRCCIOCCRIRICCHHCHHHIHRR;
            }
         }

         return var3;
      } else {
         return 0.0F;
      }
   }

   @Generated
   private IHICORCROOROHCIHIHCOIHRRHICICO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
