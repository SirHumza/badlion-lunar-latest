package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.lwjgl.opengl.GL11;

class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final int IIRRROHHOHCOIOOHRCHRHRRHORCHHI = 13;

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
      int var3,
      int var4,
      boolean var5,
      boolean var6
   ) {
      if (var2 != null && (var5 || var6)) {
         var0.push();
         var0.CRICCOOHHHCHOORCICOCOHIHOIRHOO(0.0F, 0.0F, 500.0F);
         if (var5 && var2.bridge$isItemDamaged()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2, var3, var4);
         }

         if (var6) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3, var4);
         }

         var0.pop();
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      int var2,
      int var3
   ) {
      boolean var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
         == com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORIIROOCCCIHOHRIRIICCRHOICROOC;
      if (var4) {
         GL11.glDisable(2896);
         GL11.glDisable(2929);
         GL11.glDisable(3553);
         GL11.glDisable(3008);
         GL11.glDisable(3042);
      }

      double var5 = (double)var1.bridge$getItemDamage() / var1.bridge$getMaxDamage();
      int var7 = (int)Math.round(13.0 - var5 * 13.0);
      int var8 = (int)Math.round(255.0 - var5 * 255.0);
      var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2 + 2, var3 + 14, 13, 2, -16777216);
      int var9 = 0xFF000000 | (255 - var8) / 4 << 16 | 16128;
      var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2 + 2, var3 + 14, 12, 1, var9);
      int var10 = 0xFF000000 | 255 - var8 << 16 | var8 << 8;
      var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2 + 2, var3 + 14, var7, 1, var10);
      if (var4) {
         GL11.glEnable(2896);
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
         GL11.glEnable(3042);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
      int var3,
      int var4
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var5 != null) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var7 = var2.bridge$getItem();
         int var6;
         if (var2.bridge$getMaxStackSize() > 1) {
            var6 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1x -> Objects.equals(var1x, var7), var2.bridge$getItemDamage());
         } else {
            if (!var7.equals(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
                  .CIORICCOOCHHRRRCCHOIRIOOHCORHR()
            )) {
               return;
            }

            var6 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, HRCHROOHRIHCRCRHRIIROCIRHOIRHH::bridge$isItemArrow, -1);
         }

         if (var6 > 1) {
            String var8 = String.valueOf(var6);
            var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var3 + 17 - var1.bridge$getStringWidth(var8), var4 + 9, -1, true);
         }
      }
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0,
      Predicate<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1,
      int var2
   ) {
      int var3 = 0;
      List var4 = var0.bridge$getInventory().bridge$getMainInventory();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var4.get(var5);
         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1, var2)) {
            var3 += var6.bridge$getStackSize();
         }
      }

      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 = var0.bridge$getInventory().bridge$getOffhandInventory().get(0);
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var1, var2)) {
         var3 += var7.bridge$getStackSize();
      }

      return var3;
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0, Predicate<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1, int var2) {
      return var0 != null && var0.bridge$getItem() != null && var1.test(var0.bridge$getItem()) && (var2 == -1 || var0.bridge$getItemDamage() == var2);
   }
}
