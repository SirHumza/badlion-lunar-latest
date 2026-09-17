package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCOCRROHHROHHOCRCCCHCIROIIOORC;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Locale;

class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      super(var1);
   }

   @Override
   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var3,
      float var4,
      float var5
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4, var5, var1.getWidth(), var1.getHeight());
      float var6 = var4;
      float var7 = var5;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = var1.CHOOROOOOCHOHRICORCOCICIOOCOCI()
         .getHorizontal();
      if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.HROORIOHCRRHOORRHCRHOCHICCIOHI.get()) {
         if (var8 == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT) {
            var8 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT;
         } else if (var8 == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT) {
            var8 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT;
         }
      }

      if (var8 != com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE) {
         var4 += var8 == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT
            ? -2.0F
            : 3.0F;
      }

      var5 += 3.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var3.size(); var11++) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var12 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(
            var11
         );
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = var12.bridge$getPotion();
         if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.OIRRIOCRRCCCRHHRCORRHRIIHOIRHH() && this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var12)) {
            this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var12, var6, var7 + var10, var1.getWidth(), 22.0F);
         }

         float var14 = 0.0F;
         boolean var15 = this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RHCICCHIRHORIROIHCOHHOHHOHIHRR.get();
         boolean var16 = this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.IIORCIOHOHIROHOOHOHHOCICHOCHRR.get();
         if (var15 || var16) {
            StringBuilder var17 = new StringBuilder();
            if (var15) {
               String var18 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
                  .COOROCRCCHCIHRCCIROCICCIIIRHHC(var12.bridge$getEffectName());
               var17.append(this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.CCCORHOCRIHOCIOHRCRHIRHORHCRRC.get() ? var18.toUpperCase(Locale.ROOT) : var18);
               if (var16) {
                  var17.append(" ");
               }
            }

            if (var16) {
               var17.append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var12));
            }

            String var23 = var17.toString();
            var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var23) + 20.0F;
            float var19 = var4 + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var14);
            float var20 = var5 + var10;
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2,
               var12,
               var13,
               var23,
               var19,
               var20,
               this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.IIRRCORIRCCIOHROCCIROIOIHHHOCR,
               this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.ROHHHICCCCHHIHRIHRROICHICCOOCI.get()
            );
            var9 = Math.max(var9, var14);
         }

         if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.OCHICCHCROOOHRHCIIIIHORRCRCROO.get()) {
            String var22 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12);
            float var24 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var22) + 20.0F;
            if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.OCHICCHCROOOHRHCIIIIHORRCRCROO.get() && this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var12)) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var2,
                  var12,
                  var13,
                  var22,
                  var4 + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var24),
                  var5 + var10 + (!var15 && !var16 ? 5 : 10),
                  this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RCROCIIRRHRHCRHHROHRHRCRCICOOO,
                  this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RHROROCRICRHOROIICOOICORHCRHRI.get()
               );
            }

            var9 = Math.max(var9, var24);
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var12, var13, var4 + this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var8, var14), var5 + var10);
         var10 += 23.0F;
      }

      var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(Math.max(var9, 20.0F) + 7.0F, var10 - 1.0F);
   }

   private float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      float var3
   ) {
      return switch (var2) {
         case RIGHT -> var1.getWidth() - var3;
         case MIDDLE -> var1.getWidth() / 2.0F - var3 / 2.0F + 20.0F;
         default -> 20.0F;
      };
   }

   private float IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      float var3
   ) {
      return switch (var2) {
         case RIGHT -> var1.getWidth() - 20.0F;
         case MIDDLE -> var1.getWidth() / 2.0F - var3 / 2.0F;
         default -> 0.0F;
      };
   }
}
