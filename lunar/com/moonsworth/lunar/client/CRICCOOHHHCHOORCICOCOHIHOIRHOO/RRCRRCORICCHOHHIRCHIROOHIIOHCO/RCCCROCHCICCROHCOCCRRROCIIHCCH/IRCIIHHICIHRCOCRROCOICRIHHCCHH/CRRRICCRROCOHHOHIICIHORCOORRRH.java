package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.Arrays;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private int[] CROROHCCIIHCCHCHCOCCHCHCHHHICH = new int[256];
   private boolean built;

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      long var3,
      boolean var5
   ) {
      if (var2 == null) {
         return false;
      }

      int[] var6 = new int[this.CROROHCCIIHCCHCHCOCCHCHCHHHICH.length];

      for (int var7 = 0; var7 < 16; var7++) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8;
         CRRRICCRROCOHHOHIICIHORCOORRRH var9;
         if (var7 == 0) {
            int var10 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(var3);
            int var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var3) - 1;
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var12 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
            var8 = var12 == null ? var2 : var12.bridge$getChunk(var10, var11);
            var9 = (CRRRICCRROCOHHOHIICIHORCOORRRH)var1.OHCCOCHHROIHRHICIIOHHCHIOCIHRO()
               .getIfPresent(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var10, var11));
         } else {
            var8 = var2;
            var9 = this;
         }

         for (int var18 = 0; var18 < 16; var18++) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH var19 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var5, var18, var7);
            HHCCIRHCCCIIRHCROHIORHIRHHIORH var20;
            if (var9 == null) {
               var20 = var19;
            } else {
               var20 = var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var5, var18, var7 - 1 & 15);
            }

            int var13 = var2.bridge$getBlockState(var18, var19.CHROHOHIHHCHCCRIRHOHICRCHHHORO(), var7)
               .bridge$getMapColor(var2, var18, var19.CHROHOHIHHCHCCRIRHOHICRCHHHORO(), var7);
            short var14;
            if (var19.CHROHOHIHHCHCCRIRHOHICRCHHHORO() == var20.CHROHOHIHHCHCCRIRHOHICRCHHHORO()) {
               var14 = 220;
            } else if (var19.CHROHOHIHHCHCCRIRHOHICRCHHHORO() > var20.CHROHOHIHHCHCCRIRHOHICRCHHHORO()) {
               var14 = 255;
            } else {
               var14 = 180;
            }

            var6[var7 * 16 + var18] = OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var13, var14);
            if (var19.RCHHICIHOCHHHRIICCROIIHHHRIOHH() != null) {
               int var15 = var19.RCHHICIHOCHHHRIICCROIIHHHRIOHH().bridge$getMapColor(var2, var18, var19.CHROHOHIHHCHCCRIRHOHICRCHHHORO() + 1, var7);
               float var16 = Math.min(1.0F, var19.RIIHIIOICRIROCRCCICORCROHRRRHC() / 30.0F);
               var15 = OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var15, (int)(255.0F * (0.6F + 0.4F * (1.0F - var16))));
               if (var19.RCHHICIHOCHHHRIICCROIIHHHRIOHH().bridge$getBlock().bridge$isWater()) {
                  var6[var7 * 16 + var18] = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     var15, var6[var7 * 16 + var18], Math.min(1.0F, 0.5F + 0.4F * var16)
                  );
               } else {
                  var6[var7 * 16 + var18] = var15;
               }
            }
         }
      }

      this.built = true;
      boolean var17 = !Arrays.equals(this.CROROHCCIIHCCHCHCOCCHCHCHHHICH, var6);
      if (var17) {
         this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var6);
      }

      return var17;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      boolean var2,
      int var3,
      int var4
   ) {
      if (var1 == null) {
         return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(0, 0, null);
      }

      int var7 = var1.bridge$getWorld().bridge$getMinBuildHeight();
      int var5;
      if (var2) {
         var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var4);
      } else {
         var5 = Math.min(var1.bridge$getHeightmapHeight(var3 & 15, var4 & 15), var1.bridge$getWorld().bridge$getMaxBuildHeight());
      }

      int var6 = var5;
      int var9 = 0;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = null;

      boolean var8;
      do {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = var1.bridge$getBlockState(
            var3 & 15, var6, var4 & 15
         );
         int var12 = var11.bridge$getMapColor(var1, var3 & 15, var6, var4 & 15);
         if (var12 == 0 || var12 == -16777216) {
            var8 = true;
         } else if (var11.bridge$isFluid()) {
            var8 = true;
            var9++;
            if (var10 == null) {
               var10 = var11;
            }
         } else {
            var8 = var11.bridge$getBlock().bridge$isExcludedFromMinimap();
         }
      } while (var8 && var6-- >= var7);

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, var9, var10);
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      int var3
   ) {
      int var4 = var1.bridge$getWorld().bridge$getMinBuildHeight();
      int var5 = var1.bridge$getWorld().bridge$getMaxBuildHeight();
      boolean var6 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var5, var3);
      boolean var7 = !var6;

      for (int var8 = var5 - 1; var8 >= var4; var8--) {
         boolean var9 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var8, var3);
         if (!var9 && var6 && var7) {
            return var8;
         }

         var6 = var9;
         if (!var7 && !var9) {
            var7 = true;
         }
      }

      return var4;
   }

   private boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      int var3,
      int var4
   ) {
      return var1.bridge$getBlockState(var2 & 15, var3, var4 & 15).bridge$getBlock().bridge$isAir();
   }

   @Generated
   public int[] HCCROOIHHOCIHOROHOOIIHHRORICOH() {
      return this.CROROHCCIIHCCHCHCOCCHCHCHHHICH;
   }

   @Generated
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(int[] var1) {
      this.CROROHCCIIHCCHCHCOCCHCHCHHHICH = var1;
   }

   @Generated
   public boolean RCORROCRRCHROICOICHOIOOHRHRHCC() {
      return this.built;
   }

   @Generated
   public void COIRRRCIORROCHIROCHROCHICCICIC(boolean var1) {
      this.built = var1;
   }
}
