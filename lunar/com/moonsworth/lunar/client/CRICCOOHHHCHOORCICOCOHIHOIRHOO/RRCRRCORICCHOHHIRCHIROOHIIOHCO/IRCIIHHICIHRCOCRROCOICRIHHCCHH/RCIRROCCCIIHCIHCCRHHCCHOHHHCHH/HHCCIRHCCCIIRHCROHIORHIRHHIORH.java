package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final int OIRRCHOHHHCRHRCRICRRIOCHROHCIC = 9;
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC OHRHCCOCCIICCHOHRCROCIRICHHOHO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", "textures/gui/sprites/hud/armor_full.png"
   );
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC IOIRRCCIHCRHHIRIICHHIHHHROROOC = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", "textures/gui/sprites/hud/armor_empty.png"
   );
   public static final RCIROOOOICRHCCRRCIORHHIRCOIIIC RIROHCHIIHCCCCRHCROOIROIICORCH = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", "textures/gui/icons.png"
   );
   private static final int HRHOIRCHICHROHIHORRCRIRHOCRRRH = 256;
   private static final int HIICIHRORROOIIROCCRHICCHIHRCOH = 34;
   private static final int IIIIRORCORHIIIRCRIOCIOOICOCROI = 9;
   private static final int RCHCOORHCOOIIRRCRCRHHCIIICIOCC = 16;
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC HHCOCOORCOCOICOOORHCIOOOCRHRIR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 16 ? "textures/misc/enchanted_glint_item.png" : "textures/misc/enchanted_item_glint.png"
   );
   private static final int ORRIIRRCCCICCIORHORRHOOCIIIHOR = -7309112;
   private static final int CHCHCHHHROIHOHCCCOOOOOIIROICHH = 96;
   private static final HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CICHRHHIIHORHRCHRHHOORRRIIORIO = new HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      0, 4, new boolean[81]
   );
   @Nullable
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH ROHOOCHIOIORICCRHIHIRRHHOHRHCI = null;

   public void reset() {
      this.ROHOOCHIOIORICCRHIHIRRHHOHRHCI = null;
   }

   @NotNull
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HRHHOORHOOHRHRHHOCRCOICCRORRCR() {
      if (this.ROHOOCHIOIORICCRHIHIRRHHOHRHCI == null) {
         this.ROHOOCHIOIORICCRHIHIRRHHOHRHCI = this.OOHIHHRRIRIORIRIIOCOORRIRHCRCO();
      }

      return this.ROHOOCHIOIORICCRHIHIRRHHOHRHCI;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      int var5
   ) {
      if (var5 != 0) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = this.HRHHOORHOOHRHRHHOCRCOICCRORRCR();
         int var7 = var5 >> 24 & 0xFF;
         if (var6.OHOHCHRRHCCIRRCHRRIRIORHORCCCI() == 0) {
            var5 = var7 << 24 | 16777215;
         } else {
            int var8 = var5 >> 16 & 0xFF;
            int var9 = var5 >> 8 & 0xFF;
            int var10 = var5 & 0xFF;
            int var11 = Math.max(var8, Math.max(var9, var10));
            float var12 = Math.min(255.0F / var6.OHOHCHRRHCCIRRCHRRIRIORHORCCCI(), 255.0F / Math.max(1, var11));
            var5 = var7 << 24 | (int)(var8 * var12) << 16 | (int)(var9 * var12) << 8 | (int)(var10 * var12);
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5, false);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, -1, true);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      int var5,
      boolean var6
   ) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.HRHHOORHOOHRHRHHOCRCOICCRORRCR();
      int var8 = var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      int var9 = var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4) - var8;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var6 ? IOIRRCCIHCRHHIRIICHHIHHHROROOC : OHRHCCOCCIICCHOHRCROCIRICHHOHO, var8 + var2, var3, var8, 0.0F, var9, 9.0F, 9.0F, 9.0F, var5
         );
      } else {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIROHCHIIHCCCCRHCROOIROIICORCH, var8 + var2, var3, (var6 ? 16 : 34) + var8, 9.0F, var9, 9.0F, 256.0F, 256.0F, var5);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      float var5
   ) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = this.HRHHOORHOOHRHRHHOCRCOICCRORRCR();
      int var7 = var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      int var8 = var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
      int var9 = 0xFF000000 | this.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var5);
      long var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      float var12 = (float)Math.floorMod(var10, 13750L) / 13750.0F * 96.0F;
      float var13 = (float)Math.floorMod(var10, 3750L) / 3750.0F * 96.0F;

      for (int var14 = 0; var14 < 9; var14++) {
         int var15 = -1;

         for (int var16 = var7; var16 <= var8; var16++) {
            boolean var17 = var16 < var8 && var6.OHOCICROIRRIIOIIRICICCRIHOIHHC[var16 + var14 * 9];
            if (var17 && var15 < 0) {
               var15 = var16;
            } else if (!var17 && var15 >= 0) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + var15, var3 + var14, var16 - var15, var15, var14, var9, var12, var13);
               var15 = -1;
            }
         }
      }
   }

   private int OHRRHHOCROROCCIRROIHOCCHCIHCIR(float var1) {
      if (var1 >= 1.0F) {
         return 9468104;
      }

      var1 = (float)Math.sqrt(Math.max(0.0F, var1));
      return (int)(144.0F * var1) << 16 | (int)(120.0F * var1) << 8 | (int)(200.0F * var1);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      float var9
   ) {
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCOCOORCOCOICOOORHCIOOOCRHRIR, var2, var3, var5 + var8, var6 + 96 - var9, var4, 1.0F, 96.0F, 96.0F, var7);
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCOCOORCOCOICOOORHCIOOOCRHRIR, var2, var3, var5 + 96 - var8, var6 + var9, var4, 1.0F, 96.0F, 96.0F, var7);
   }

   @NotNull
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOHIHHRRIRIORIRIIOCOORRIRHCRCO() {
      boolean var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19;
      BufferedImage var2 = HOIHOROOIOOCOIHCRIRIRIRRICIIHC.IOCIIROIRCOHIRHHHROHCOOHIICIHI(var1 ? OHRHCCOCCIICCHOHRCROCIRICHHOHO : RIROHCHIIHCCCCRHCROOIROIICORCH);
      if (var2 == null) {
         return CICHRHHIIHORHRCHRHHOORRRIIORIO;
      }

      int var3 = Math.max(1, var2.getWidth() / (var1 ? 9 : 256));
      int var4 = var1 ? 0 : 34 * var3;
      int var5 = var1 ? 0 : 9 * var3;
      int var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4, var5, 9 * var3);
      if (var6 == 0) {
         return CICHRHHIIHORHRCHRHHOORRRIIORIO;
      }

      boolean[] var7 = new boolean[81];

      for (int var8 = 0; var8 < 9; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            int var10 = var4 + var8 * var3;
            int var11 = var5 + var9 * var3;
            var7[var8 + var9 * 9] = var10 < var2.getWidth() && var11 < var2.getHeight() && (var2.getRGB(var10, var11) >> 24 & 0xFF) >= 128;
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7), var7);
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var1, int var2, int var3, int var4) {
      int var5 = Math.min(var2 + var4, var1.getWidth());
      int var6 = Math.min(var3 + var4, var1.getHeight());
      int[] var7 = new int[Math.max(0, var5 - var2) * Math.max(0, var6 - var3)];
      int var8 = 0;

      for (int var9 = var2; var9 < var5; var9++) {
         for (int var10 = var3; var10 < var6; var10++) {
            int var11 = var1.getRGB(var9, var10);
            if ((var11 >> 24 & 0xFF) >= 128) {
               int var12 = var11 >> 16 & 0xFF;
               int var13 = var11 >> 8 & 0xFF;
               int var14 = var11 & 0xFF;
               var7[var8++] = Math.max(var12, Math.max(var13, var14));
            }
         }
      }

      if (var8 == 0) {
         return 0;
      }

      Arrays.sort(var7, 0, var8);
      int var15 = var7[Math.round((var8 - 1) * 0.8F)];
      return Math.max(1, var15);
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean[] var1) {
      int var2 = 9;
      int var3 = -1;

      for (int var4 = 0; var4 < 9; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            if (var1[var4 + var5 * 9]) {
               var2 = Math.min(var2, var4);
               var3 = Math.max(var3, var4);
            }
         }
      }

      return var2 <= var3 ? (var2 + var3 + 1) / 2 : 4;
   }

   private record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final int HHCROIHCHCHOIRIIIOCCRCHROHHHRH;
      private final int RIRCOHHOHIOIHOCRHCCHIIIORIRRRH;
      private final boolean[] OHOCICROIRRIIOIIRICICCRIHOIHHC;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2, boolean[] var3) {
         this.HHCROIHCHCHOIRIIIOCCRCHROHHHRH = var1;
         this.RIRCOHHOHIOIHOCRHCCHIIIORIRRRH = var2;
         this.OHOCICROIRRIIOIIRICICCRIHOIHHC = var3;
      }

      private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         return var1 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIGHT ? this.COCIOICRHRRIRHOIOCCCCHOOHRHOHH() : 0;
      }

      private int IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         return var1 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LEFT ? this.COCIOICRHRRIRHOIOCCCCHOOHRHOHH() : 9;
      }

      public int OHOHCHRRHCCIRRCHRRIRIORHORCCCI() {
         return this.HHCROIHCHCHOIRIIIOCCRCHROHHHRH;
      }

      public int COCIOICRHRRIRHOIOCCCCHOOHRHOHH() {
         return this.RIRCOHHOHIOIHOCRHCCHIIIORIRRRH;
      }

      public boolean[] HHHHHORHRICHOIORRHHCORRHOCHIIH() {
         return this.OHOCICROIRRIIOIIRICICCRIHOIHHC;
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      LEFT,
      RIGHT,
      WHOLE;
   }
}
