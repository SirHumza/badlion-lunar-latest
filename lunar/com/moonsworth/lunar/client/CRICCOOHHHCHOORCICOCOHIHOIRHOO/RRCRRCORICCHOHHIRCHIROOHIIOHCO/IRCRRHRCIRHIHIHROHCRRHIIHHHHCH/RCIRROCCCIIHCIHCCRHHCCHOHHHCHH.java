package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jetbrains.annotations.NotNull;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI CRHRCROORHHHCIHICRCRIIHRHRRIHI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("textColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-12566464)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HHCHRIOROHCHHCROCCRORCCCOCHHRI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("speedColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-13801265)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HHOIIIIHHCROCRCCCOOHIHCIRHHIOI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("jumpColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-15552755)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HCHRCHROOIICOIOHHIRCIIIOIIOCRH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("healthColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-3199699)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super(true);
      this.handle(RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC() instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var2.bridge$getHorse();
         int var5 = var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC().bridge$getWidth();
         int var6 = var1.IIHROCHHOHOCHRHOOICIHHRIRIHIRC().bridge$getHeight();
         int var7 = var5 / 2 - 8;
         int var8 = var6 / 2 - 65;
         byte var9 = 88;
         MutableInt var10 = new MutableInt(0);
         float var11 = 0.0F;
         var18.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0 -> var0.HHIIOHOORHHCCHRHHRCIORCROORCOI().CHHHIRRRHHCOOHRRICOCICHHROHHIR());
         var11 += this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var18,
            2,
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("health"),
            ((CORCOCICIRIOHROHROIIOOHICCHCRR)var4).bridge$getMaxHealth() / 2.0F,
            ((CORCOCICIRIOHROHROIIOOHICCHCRR)var4).bridge$getMaxHealth(),
            15.0,
            30.0,
            var5,
            var6,
            this.HCHRCHROOIICOIOHHIRCIIIOIIOCRH,
            var4.bridge$hasChest(),
            var10,
            RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "horse_stats/health_boost.png")
         );
         var11 += this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var18,
            1,
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("jump"),
            var4.bridge$getJumpHeight(),
            var4.bridge$getJumpHeightRaw(),
            0.4,
            1.0,
            var5,
            var6,
            this.HHOIIIIHHCROCRCCCOOHIHCIRHHIOI,
            var4.bridge$hasChest(),
            var10,
            RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "horse_stats/jump_boost.png")
         );
         var11 += this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var18,
            0,
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("speed"),
            var4.bridge$getSpeed(),
            var4.bridge$getSpeedRaw(),
            0.1125,
            0.3375,
            var5,
            var6,
            this.HHCHRIOROHCHHCROCCRORCCCOCHHRI,
            var4.bridge$hasChest(),
            var10,
            RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "horse_stats/speed.png")
         );
         float var12 = var11 / 3.0F * 100.0F;
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var13 = this.CRHRCROORHHHCIHICRCRIIHRHRRIHI;
         String var14 = String.format("%.1f%%", var12);
         if (!var4.bridge$hasChest()) {
            var14 = "Score: " + var14;
         }

         int var15 = (int)this.mc.bridge$getFontRenderer().bridge$getStringWidth(var14);
         float var16 = var7 + var9 / 2.0F - var15 / 2.0F;
         float var17 = var8 - 11.5F;
         if (var4.bridge$hasChest()) {
            var16 = var7 + var9 - var10.getValue() - var15;
         }

         var18.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(), var14, var16, var17, var13.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F), false
         );
      }
   }

   private float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      String var3,
      float var4,
      double var5,
      double var7,
      double var9,
      int var11,
      int var12,
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var13,
      boolean var14,
      MutableInt var15,
      @NotNull RCIROOOOICRHCCRRCIORHHIRCOIIIC var16
   ) {
      int var17 = var11 / 2 - 8;
      int var18 = var12 / 2 - 65;
      float var19 = Math.max(Math.min((float)((var5 - var7) / (var9 - var7)), 1.0F), 0.0F);
      if (var14) {
         String var20 = String.format("%.1f", var4);
         int var21 = (int)(this.mc.bridge$getFontRenderer().bridge$getStringWidth(var20) + 8.0F + 4.0F);
         byte var22 = 88;
         int var23 = var18 - 13;
         int var24 = var17 + var22 - var15.getValue() - var21;
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, var23 + 10, var24 + var21, var23 + 11, -12566464);
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24, var23 + 10, var24 + (int)(var21 * var19), var23 + 11, var13.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F));
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
            var20,
            var24,
            var23,
            this.CRHRCROORHHHCIHICRCRIIHRHRRIHI.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F),
            false
         );
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, var24, var23 - 2, 12, 12, -1);
         var15.add(var21 + 3);
      } else {
         byte var25 = 88;
         int var26 = var18 + 2 + 17 * var2;
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17 + 2, var26 + 10, var17 + var25 - 2, var26 + 12, -1340071904);
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var17 + 2, var26 + 10, var17 + 2 + (int)((var25 - 4) * var19), var26 + 10 + 2, var13.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F)
         );
         String var27 = String.format(var3, var4);
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
            var27,
            var17 + 2,
            var26,
            this.CRHRCROORHHHCIHICRCRIIHRHRRIHI.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F),
            false
         );
      }

      return var19;
   }

   @Override
   public String getId() {
      return "HORSE_STATS";
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CRHRCROORHHHCIHICRCRIIHRHRRIHI);
      var1.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         "barsColor",
         var1x -> var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(
            this.HHCHRIOROHCHHCROCCRORCCCOCHHRI, this.HHOIIIIHHCROCRCCCOOHIHCIRHHIOI, this.HCHRCHROOIICOIOHHIRCIIIOIIOCRH
         )
      );
   }
}
