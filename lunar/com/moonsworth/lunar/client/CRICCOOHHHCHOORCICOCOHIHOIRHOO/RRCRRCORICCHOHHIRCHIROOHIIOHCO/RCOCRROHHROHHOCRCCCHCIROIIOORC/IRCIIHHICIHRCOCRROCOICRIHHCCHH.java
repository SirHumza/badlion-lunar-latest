package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCOCRROHHROHHOCRCCCHCIROIIOORC;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;

class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
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
      float var6 = this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.CHCIOCHHIOOIHHRORHOHIIROCIICOC.get()
         ? this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RHHCCCOCICHRHHCRCOCRIORHCCCRRH.get() * 2.0F + 3.0F
         : 3.0F;
      var4 += Math.max(0.0F, var6 - 6.0F);
      var5 += Math.max(0.0F, var6 - 6.0F);
      boolean var7 = this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.HCIHIIRIOHHIRCRIORCIIRRHRHCHRR.get();
      boolean var8 = var7
         ? var1.CHOOROOOOCHOHRICORCOCICIOOCOCI().getVertical()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
         : var1.CHOOROOOOCHOHRICORCOCICIOOCOCI().getHorizontal()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT;
      int var9 = !this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RORIRRHHROOOORHRHHHOIOOHIHORHR.get()
            && !this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.CHCIOCHHIOOIHHRORHOHIIROCIICOC.get()
         ? 30
         : 41;
      int var10 = this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.ROIRIOIHIOHIHCCIIHCRHCOCOIRIOH.get();
      float var11 = var9 + var6;
      int var12 = var3.size();
      float var13 = var8 && var12 > var10 ? var12 / var10 * var11 : 0.0F;
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var7, var10, var12, var11, var6, var9);

      for (int var14 = 0; var14 < var12; var14++) {
         int var15 = var14 / var10;
         int var16 = var14 % var10;
         float var17 = var16 * var11;
         float var18 = var13 + (var8 ? -var15 : var15) * var11;
         float var19 = var4 + (var7 ? var17 : var18);
         float var20 = var5 + (var7 ? var18 : var17);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            var2,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(var14),
            var19,
            var20,
            var9
         );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, boolean var2, int var3, int var4, float var5, float var6, int var7) {
      int var8 = (var4 - 1) / var3 + 1;
      int var9 = Math.min(var4, var3);
      float var10 = var7 + (var9 - 1) * var5 + var6 - 3.0F;
      float var11 = var7 + (var8 - 1) * var5 + var6 - 3.0F;
      if (var2) {
         var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var10, var11);
      } else {
         var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var11, var10);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      float var4,
      float var5,
      int var6
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4, var5, var6, var6);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = var3.bridge$getPotion();
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var3)) {
         if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.OIRRIOCRRCCCRHHRCORRHRIIHOIRHH()) {
            this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var3, var4, var5, var6, var6);
         }

         if (this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.OCHICCHCROOOHRHCIIIIHORRCRCROO.get()) {
            String var8 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3);
            float var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var8);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2,
               var3,
               var7,
               var8,
               var4 + var6 / 2.0F - var9 / 2.0F,
               var5 + var6 - var6 / 3.0F + 1.0F,
               this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RCROCIIRRHRHCRHHROHRHRCRCICOOO,
               this.IOCRHIRIOHCICRIHOHHRCHORHCIRCC.RHROROCRICRHOROIICOOICORHCRHRI.get()
            );
         }
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var7, var4 + var6 / 2.0F - 9.5F, var5 + var6 / 2.0F - 13.0F);
   }
}
