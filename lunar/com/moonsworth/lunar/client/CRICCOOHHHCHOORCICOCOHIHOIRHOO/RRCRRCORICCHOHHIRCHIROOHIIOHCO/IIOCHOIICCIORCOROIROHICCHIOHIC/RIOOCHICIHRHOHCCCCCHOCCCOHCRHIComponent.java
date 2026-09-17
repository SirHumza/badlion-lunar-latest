package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;

class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH<? extends HCHRIROHHHCORIOCROOCHRCIOROOCI<Boolean>, Boolean> var2
   ) {
      super(var1, var2, "block/glass");
   }

   @Override
   public void updateState() {
      super.updateState();
      boolean var1 = this.RIRRIROHIRCCHHHOIHHOOICRHCHCOH();
      if (var1) {
         this.IRHORRIOICHCRRORIROICHICCOCOIC.CCRHOCCCRCICIRORCOOHHIHCRHIIOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/glass_pane_top", this, true);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
            this.IRHORRIOICHCRRORIROICHICCOCOIC.CCRHOCCCRCICIRORCOOHHIHCRHIIOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/tinted_glass", this, true);
         }

         if (this.IRHORRIOICHCRRORIROICHICCOCOIC.IHRHOCRHOORRIROIORROOIOHICCCCR.get()) {
            for (String var3 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORRCOHRICOCORROIIOOCCOHIOORIHH
               .keySet()) {
               this.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var3);
            }

            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
               this.HHOOIRORCCOOORRIIIOCRCRHIICOCH("light_gray");
            }
         }
      }
   }

   private void HHOOIRORCCOOORRIIIOCRCRHIICOCH(String var1) {
      String var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5 ? "glass_" + var1 : var1 + "_stained_glass";
      this.IRHORRIOICHCRRORIROICHICCOCOIC.CCRHOCCCRCICIRORCOOHHIHCRHIIOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/" + var2, this, true);
      var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5 ? "glass_pane_top_" + var1 : var1 + "_stained_glass_pane_top";
      this.IRHORRIOICHCRRORIROICHICCOCOIC.CCRHOCCCRCICIRORCOOHHIHCRHIIOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/" + var2, this, true);
   }

   @Override
   public void process(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      int var2 = var1.OOIRCOCROHROCRHRICCHIHORHROHII();
      int var3 = var1.ORCOCCCOOOOCROCIHIRIICOIHCIRHR();
      if (var2 != var3 && var3 % var2 != 0) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "[Overlay] Skipping glass texture %s, invalid size %dx%d", var1.RROOCOCHIRCRIIHCRRCHOHRRRHRHIH(), var2, var3
         );
      } else {
         boolean var4 = this.IRHORRIOICHCRRORIROICHICCOCOIC.ROCCORIHRHRRRCHRCICOORHHOHHIRI.get();
         if (var4 && var2 <= 4) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "[Overlay] Skipping glass texture %s for outline, invalid size", var1.RROOCOCHIRCRIIHCRRCHOHRRRHRHIH()
            );
            var4 = false;
         }

         if (var4 && var1.name().contains("glass_pane_")) {
            var4 = false;
         }

         float var5 = this.IRHORRIOICHCRRORIROICHICCOCOIC.COIHIRHIIOOROIORCRCIHRHCICHHCC.get();
         float var6 = !var4 ? 0.0F : this.IRHORRIOICHCRRORIROICHICCOCOIC.CIRCCCOOOIOHROORICOOORHHRRHOCI.get();
         int var7 = !var4 ? 0 : this.IRHORRIOICHCRRORIROICHICCOCOIC.COCICIHIRRRCOIICHIHRRCIHOICCCR.get();
         int var13 = var3 / var2;

         do {
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = (var13 - 1) * var2;

            for (int var14 = 0; var14 < var2 * var2; var14++) {
               int var15 = var14 % var2;
               int var16 = var14 / var2 + var12;
               int var17 = var1.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var15, var16);
               int var18 = var17 >> 24 & 0xFF;
               if (var18 > 25) {
                  var18 = (int)(var18 * var5);
                  var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var15, var16, (var18 & 0xFF) << 24 | var17 & 16777215);
                  if (var4) {
                     var8 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var17 >> 16 & 0xFF);
                     var9 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var17 >> 8 & 0xFF);
                     var10 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var17 & 0xFF);
                     var11++;
                  }
               }
            }

            if (var4) {
               if (var11 == 0) {
                  var10 = 238;
                  var9 = 238;
                  var8 = 238;
               } else {
                  var8 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var8 / var11);
                  var9 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var9 / var11);
                  var10 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var10 / var11);
               }

               int var22 = (int)(255.0F * var6);
               int var23 = (var22 & 0xFF) << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var13 - 1, var2, var7, var23, null);
            }
         } while (--var13 > 0);
      }
   }
}
