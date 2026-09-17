package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import toxi.math.noise.PerlinNoise;

class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final String RHORCIICOCCOOHCROORHOICIOCRRCO;
   private final int HRCROOCORIIORRIROCHHCHICRHHRIR;
   private final boolean HICCHIORRCCIIOOCCORCOHOHHOCHIC;
   private final boolean OCCIIIOHCIRHHHHCCHRIIRCCRROCCO;
   private final boolean CCORORIHRHIOICCIIIRHCROOCHIHHH;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH<? extends HCHRIROHHHCORIOCROOCHRCIOROOCI<Boolean>, Boolean> var2,
      String var3,
      int var4,
      boolean var5
   ) {
      super(var1, var2, "block/" + var3);
      this.RHORCIICOCCOOHCROORHOICIOCRRCO = var3;
      this.HRCROOCORIIORRIROCHHCHICRHHRIR = var4;
      this.HICCHIORRCCIIOOCCORCOHOHHOCHIC = var5;
      this.OCCIIIOHCIRHHHHCCHRIIRCCRROCCO = var3.startsWith("nether_") || var3.equals("quartz") || var3.startsWith("ancient_debris");
      this.CCORORIHRHIOICCIIIRHCROOCHIHHH = var3.equals("coal_ore");
   }

   @Override
   public void updateState() {
      super.updateState();
      if (this.RIRRIROHIRCCHHHOIHHOOICRHCHCOH()) {
         if (this.HICCHIORRCCIIOOCCORCOHOHHOCHIC && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8) {
            this.IRHORRIOICHCRRORIROICHICCOCOIC
               .CCRHOCCCRCICIRORCOOHHIHCRHIIOR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/deepslate_" + this.RHORCIICOCCOOHCROORHOICIOCRRCO, this, true);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6 && this.RHORCIICOCCOOHCROORHOICIOCRRCO.equals("ancient_debris_side")) {
            this.IRHORRIOICHCRRORIROICHICCOCOIC.CCRHOCCCRCICIRORCOOHHIHCRHIIOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("block/ancient_debris_top", this, true);
         }
      }
   }

   @Override
   protected boolean RIRRIROHIRCCHHHOIHHOOICRHCHCOH() {
      return super.RIRRIROHIRCCHHHOIHHOOICRHCHCOH() && this.IRHORRIOICHCRRORIROICHICCOCOIC.ICCOICIHHCOOIIHOORCIRHIRICOOCC.get();
   }

   @Override
   public void process(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      int var2 = var1.OOIRCOCROHROCRHRICCHIHORHROHII();
      if (var2 <= 4) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "[Overlay] Skipping ore texture %s, size <=4", var1.RROOCOCHIRCRIIHCRRCHOHRRRHRHIH()
         );
      } else {
         int var3 = var1.ORCOCCCOOOOCROCIHIRIICOIHCIRHR();
         if (var2 != var3 && var3 % var2 != 0) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "[Overlay] Skipping ore texture %s, invalid size %dx%d", var1.RROOCOCHIRCRIIHCRRCHOHRRRHRHIH(), var2, var3
            );
         } else {
            int var4 = this.IRHORRIOICHCRRORIROICHICCOCOIC.HIOOIIICOCICOICOICCICCHRIORORI.get();
            boolean var5 = this.IRHORRIOICHCRRORIROICHICCOCOIC.ROICOHCHCHOCOORRORIOIRCORIIHRC.get();
            if (!this.IRHORRIOICHCRRORIROICHICCOCOIC.ROIOCOCHOROHCIRIROORCIRCICCIRC.get()) {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, this.HRCROOCORIIORRIROCHHCHICRHHRIR, var5);
            } else {
               PerlinNoise var6 = var5 ? RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) : null;
               boolean var7 = this.OCCIIIOHCIRHHHHCCHRIIRCCRROCCO;
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
                     int var18 = var17 >> 16 & 0xFF;
                     int var19 = var17 >> 8 & 0xFF;
                     int var20 = var17 & 0xFF;
                     int var21 = ((var7 ? var18 / 2 : var18) + var19 + var20) / 3;
                     boolean var22 = var21 <= 165
                        && Math.abs((var7 ? var18 / 2 : var18) - var21) <= 15
                        && Math.abs(var19 - var21) <= 15
                        && Math.abs(var20 - var21) <= 15;
                     if (!var22) {
                        var8 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var18);
                        var9 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var19);
                        var10 += CICOIHIRIIHHCIOICHRHICRIRCIOHC(var20);
                        var11++;
                     }
                  }

                  if (var11 == 0) {
                     if (this.CCORORIHRHIOICCIIIRHCROOCHIHHH) {
                        var10 = 32;
                        var9 = 32;
                        var8 = 32;
                     }
                  } else {
                     var8 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var8 / var11);
                     var9 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var9 / var11);
                     var10 = CICOIHIRIIHHCIOICHRHICRIRCIOHC(var10 / var11);
                  }

                  int var23 = 0xFF000000 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var13 - 1, var2, var4, var23, var6);
               } while (--var13 > 0);
            }
         }
      }
   }
}
