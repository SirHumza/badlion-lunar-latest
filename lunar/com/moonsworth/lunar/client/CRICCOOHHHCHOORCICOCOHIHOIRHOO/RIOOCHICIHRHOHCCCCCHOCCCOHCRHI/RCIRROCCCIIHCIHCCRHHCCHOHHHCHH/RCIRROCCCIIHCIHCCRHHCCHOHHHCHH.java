package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import java.util.Map;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super(true);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5) {
         this.handle(HHCCIRHCCCIIRHCROHIORHIRHHIORH.class, this::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI);
         this.handle(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         );
      }
   }

   @Override
   public String getId() {
      return "SERVER_BORDERS";
   }

   @Override
   protected void CCHHCIRHICHHHHRRIHIORCCORCCIHR(boolean var1) {
   }

   @Override
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return null;
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.HHIIOHOORHHCCHRHHRCIORCROORCOI(),
         IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
         var1.CIHOOIIOOIOHCCIOIOIIORHOHROCCH(),
         var1.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR()
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      Map var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCROOHHCROORIIICHORIHRROIOOHHC().RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
      if (!var2.isEmpty()) {
         CRRRICCRROCOHHOHIICIHORCOORRRH var3 = var1.HCICROIHRHRCORRHCOIHIHCCCCHRHH();
         if (var3 != null && var3 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()) {
            double var4 = var3.bridge$getMotionX();
            double var6 = var3.bridge$getMotionY();
            double var8 = var3.bridge$getMotionZ();
            if (var4 != 0.0 || var8 != 0.0) {
               double var10 = var3.bridge$getPosX();
               double var12 = var3.bridge$getPosZ();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = var3.bridge$getBoundingBox();
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
                  var15 = var14.bridge$expand(Math.abs(var4), Math.abs(var6), Math.abs(var8));
               } else {
                  var15 = var14.bridge$union(var14.bridge$offset(var4, var6, var8));
               }

               for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH var17 : var2.values()) {
                  if (var17.shouldRender()) {
                     boolean var18 = var17.contains(var10, var12);
                     boolean var19 = var17.contains(var10 + var4, var12 + var8);
                     if ((var17.isCancelEntry() || var18 || var19) && (var17.isCancelExit() || !var18 || !var19)) {
                        for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var21 : var17.RCCRHRORCCCCHHRCIORHOCHOCCRHRC()) {
                           if (var21.bridge$intersectsWith(var15)) {
                              var1.HCHCIHOHIIIRRCCOOHIIRCCCRIOHCH().add(var21);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      float var4
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var5.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var6 = var5.HOROHROIORRIRIIIOOCCIROCRCROHI().IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if (var6.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get() && !var6.IHOCOCRHIHRHHHCRIIROHRIROCIIHO().get()) {
            return;
         }
      }

      double var51 = this.mc.bridge$getGameSettings().bridge$getRenderDistance() * 16;
      boolean var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var9 = var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CCHHRCRRIIOCOOCCRHHCRROHRIICOC
      );

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH var11 : com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RCROOHHCROORIIICHORIHRROIOOHHC()
         .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()) {
         if (var11.shouldRender()) {
            double var12 = var11.IHOIOOCOIHCOICCHCROOCHOIRORHHH();
            double var14 = var11.HORIHOCOIORHOOROIROICICICRHHHR();
            double var16 = var11.IRIHOCHHIIOCRROOHRRCCOOCCCIOOR();
            double var18 = var11.CHCICOOHOICHHROOIRICCHHHHOHIOR();
            double var20 = var8 ? var3.bridge$getPosX() : var2.bridge$getPosX();
            double var22 = var8 ? var3.bridge$getPosY() : var2.bridge$getPosY();
            double var24 = var8 ? var3.bridge$getPosZ() : var2.bridge$getPosZ();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var26 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
            if (var20 <= var14 + var51 && var20 >= var12 - var51 && var24 <= var18 + var51 && var24 >= var16 - var51) {
               double var27 = var8
                  ? var11.CRRRICCRROCOHHOHIICIHORCOORRRH(var3.bridge$getPosX(), var3.bridge$getPosZ())
                  : var11.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
               int var29 = var26 == null ? 0 : var26.bridge$getMinBuildHeight();
               int var30 = var26 == null ? 256 : var26.bridge$getMaxBuildHeight();
               double var31 = 1.0 - var27 / var51;
               var31 = Math.pow(var31, 4.0);
               double var33 = var8 ? var20 : var2.bridge$lastTickX() + (var2.bridge$getPosX() - var2.bridge$lastTickX()) * var4;
               double var35 = var8 ? var22 : var2.bridge$lastTickY() + (var2.bridge$getPosY() - var2.bridge$lastTickY()) * var4;
               double var37 = var8 ? var24 : var2.bridge$lastTickZ() + (var2.bridge$getPosZ() - var2.bridge$lastTickZ()) * var4;
               var1.push();
               var1.translate(-var33, -var35, -var37);
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(-3.0F, -3.0F);
               var1.OOIHOHCIIRORIOHIRRRORHHHIIIHCH();
               float var39 = (float)(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() % 3000L) / 3000.0F;
               var9.HICHHHOOCRROHCCCCOOHOCHHOIOHCR();
               double var40 = Math.max(RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IICCOOCHCHROORHHIIHROHCCRHRCOR(var37 - var51), var16);
               double var42 = Math.min(RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.HOHCCHOIOHOHHOROHOIIHOOHORRHRO(var37 + var51), var18);
               int var44 = var11.getColor() & 16777215
                  | (int)(
                        com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(
                              var31, 0.0, 1.0
                           )
                           * 255.0
                     )
                     << 24;
               if (var33 > var14 - var51) {
                  float var45 = 0.0F;

                  for (double var46 = var40; var46 < var42; var45 += 0.5F) {
                     double var48 = Math.min(1.0, var42 - var46);
                     float var50 = (float)var48 * 0.5F;
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14, var30, var46)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var45, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14, var30, var46 + var48)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var50 + var45, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14, var29, var46 + var48)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var50 + var45, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14, var29, var46)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var45, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var46++;
                  }
               }

               if (var33 < var12 + var51) {
                  float var55 = 0.0F;

                  for (double var58 = var40; var58 < var42; var55 += 0.5F) {
                     double var61 = Math.min(1.0, var42 - var58);
                     float var64 = (float)var61 * 0.5F;
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12, var30, var58)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var55, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12, var30, var58 + var61)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var64 + var55, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12, var29, var58 + var61)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var64 + var55, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12, var29, var58)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var55, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var58++;
                  }
               }

               var40 = Math.max(RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IICCOOCHCHROORHHIIHROHCCRHRCOR(var33 - var51), var12);
               var42 = Math.min(RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IICCOOCHCHROORHHIIHROHCCRHRCOR(var33 + var51), var14);
               if (var37 > var18 - var51) {
                  float var56 = 0.0F;

                  for (double var59 = var40; var59 < var42; var56 += 0.5F) {
                     double var62 = Math.min(1.0, var42 - var59);
                     float var65 = (float)var62 * 0.5F;
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var59, var30, var18)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var56, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var59 + var62, var30, var18)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var65 + var56, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var59 + var62, var29, var18)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var65 + var56, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var59, var29, var18)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var56, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var59++;
                  }
               }

               if (var37 < var16 + var51) {
                  float var57 = 0.0F;

                  for (double var60 = var40; var60 < var42; var57 += 0.5F) {
                     double var63 = Math.min(1.0, var42 - var60);
                     float var66 = (float)var63 * 0.5F;
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var60, var30, var16)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var57, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var60 + var63, var30, var16)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var66 + var57, var39 + 0.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var60 + var63, var29, var16)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var66 + var57, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var60, var29, var16)
                        .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var39 + var57, var39 + 128.0F)
                        .IHIRRIIORRHORHRORIHOROIRCORCOO(var44)
                        .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
                     var60++;
                  }
               }

               var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BATCHED
               );
               var1.pop();
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(0.0F, 0.0F);
               var1.ICHHRRHHCCCCIRHCORIHIRHHOCHIOO();
            }
         }
      }
   }
}
