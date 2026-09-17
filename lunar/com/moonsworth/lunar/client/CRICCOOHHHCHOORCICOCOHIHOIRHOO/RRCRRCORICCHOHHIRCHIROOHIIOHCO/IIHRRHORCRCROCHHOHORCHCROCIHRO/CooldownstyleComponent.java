package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.lunarclient.apollo.cooldown.v1.CooldownStyle;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.CIIHHCHIRCRRIHOIOCCCROHOIOCCII;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.floats.FloatFloatPair;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected static final int CHOCIIICRCHORCHIHCCICHORRCHHHH = 20;
   private static final int HCCIORRCOORIOROCCIOOROCIRCCIOH = 1;
   private static final int HIORCCCOHIRCCHCIRCIHIOOIOIIRIO = 42;
   private static final int HICOORHCICOOICCRCHCORHCIOICRHR = 4;
   private static final String HRIROHRRHHIHRIIOROICIRRCHHCCHR = "23h59m";
   private final String IHHHIORICHHIHCRHIRORRCHOICOCIC;
   private final long length;
   private final long CHHRHIIIRRHHIIHHIORHCOOICHIHRH;
   private final CooldownStyle HHIRIHOCCRRRCRRCRIHHHCOHOIIORH;

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, long var2, CooldownStyle var4) {
      this.IHHHIORICHHIHCRHIRORRCHOICOCIC = var1;
      this.length = var2;
      this.HHIRIHOCCRRRCRRCRIHHHCOHOIIORH = var4;
      this.CHHRHIIIRRHHIIHHIORHCOOICHIHRH = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
   }

   public static FloatFloatPair RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
      float var2 = var1.OHRCIORHOCHOORCRHHOHRRRCCOICCO();
      float var3 = var1.bridge$getStringWidth("23h59m");

      return switch (var0) {
         case LEFT, RIGHT -> FloatFloatPair.of(46.0F + var3, 42.0F);
         case ABOVE, BELOW -> FloatFloatPair.of(Math.max(42.0F, var3), 46.0F + var2);
      };
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      int var4,
      int var5,
      int var6,
      int var7,
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var8
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
      int var10 = var9.OHRCIORHOCHOORCRHHOHRRRCCOICCO();
      float var11 = var2 + 1.0F;
      float var12 = var3 + 1.0F;
      switch (var8) {
         case LEFT:
            float var13 = var9.bridge$getStringWidth("23h59m");
            var11 = var2 + var13 + 4.0F + 1.0F;
            break;
         case ABOVE:
            var12 = var3 + var10 + 4.0F + 1.0F;
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1, var11, var12);
      double var15 = this.length
         - (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.CHHRHIIIRRHHIIHHIORHCOOICHIHRH);
      if (!(var15 <= 0.0)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var11, var12, var15, var4, var5, var6);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var2, var3, var11, var12, var15, var10, var7, var8);
      }
   }

   public abstract void IIHRRHORCRCROCHHOHORCHCROCIHRO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3
   );

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      double var4,
      int var6,
      int var7,
      int var8
   ) {
      double var9 = var2 + 20.0F;
      double var11 = var3 + 20.0F;
      double var13 = 20.0;
      double var15 = 17.0;
      byte var17 = 32;
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, 20.0, 0.0, (float)this.length / 3.95F, (int)this.length, var4, 872415231);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, 20.0, 0.0, (float)this.length / 3.95F, (int)this.length, var4, 855638016);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var13 + 0.3, var15 - 0.3, 0.0, 1.0, 0.0, var7, var17);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var9, var11, var13 + 0.3, var15 - 0.3, (float)this.length / 3.95F, (int)this.length, var4, var6
      );
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var13 + 1.0, var13, 0.0, 1.0, 0.0, var8, var17);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var15 - 1.0, 0.0, 1.0, 0.0, var8, var17);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      float var3,
      float var4,
      float var5,
      float var6,
      double var7,
      int var9,
      int var10,
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var11
   ) {
      String var12 = CIIHHCHIRCRRIHOIOCCCROHOIOCCII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.COMPACT_DYNAMIC.format((long)var7);
      float var13 = var2.bridge$getStringWidth(var12);
      float var14 = var5 + 20.0F;
      float var15 = var6 + 20.0F;
      float var16 = var9 / 2.0F;
      float var17;
      float var18;
      switch (var11) {
         case LEFT:
            var17 = var3;
            var18 = var15 - var16;
            break;
         case RIGHT:
            var17 = var3 + 42.0F + 4.0F;
            var18 = var15 - var16;
            break;
         case ABOVE:
            var17 = var14 - var13 / 2.0F;
            var18 = var4;
            break;
         case BELOW:
            var17 = var14 - var13 / 2.0F;
            var18 = var4 + 42.0F + 4.0F;
            break;
         default:
            var17 = var3 + 42.0F + 4.0F;
            var18 = var15 - var16;
      }

      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var12, var17, var18, var10, true);
   }

   public boolean IHIOHHHHIRHRHIHHHHRICRIHCHOOCO() {
      return this.CHHRHIIIRRHHIIHHIORHCOOICHIHRH < IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.length;
   }

   @Generated
   public String getName() {
      return this.IHHHIORICHHIHCRHIRORRCHOICOCIC;
   }

   @Generated
   public CooldownStyle HHOIICROCHCROCIOHOIIIRCRCOOOCH() {
      return this.HHIRIHOCCRRRCRRCRIHHHCOHOIIORH;
   }
}
