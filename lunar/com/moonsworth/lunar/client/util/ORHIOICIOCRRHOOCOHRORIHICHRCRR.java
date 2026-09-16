package com.moonsworth.lunar.client.util;

import java.util.Optional;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Nullable
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI var0,
      int var1,
      Predicate<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH> var2
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var3 == null) {
         return null;
      }

      int var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.IHICORCROOROHCIHIHCOIHRRHICICO(
         var0.bridge$getX()
      );
      int var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.IHICORCROOROHCIHIHCOIHRRHICICO(
         var0.bridge$getY()
      );
      int var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.IHICORCROOROHCIHIHCOIHRRHICICO(
         var0.bridge$getZ()
      );

      for (int var7 = 0; var7 < var1; var7++) {
         for (byte var8 = 0; var8 <= var1; var8 = (byte)(var8 > 0 ? -var8 : 1 - var8)) {
            for (byte var9 = 0; var9 <= var7; var9 = (byte)(var9 > 0 ? -var9 : 1 - var9)) {
               for (int var10 = var9 < var7 && var9 > -var7 ? var7 : 0; var10 <= var7; var10 = var10 > 0 ? -var10 : 1 - var10) {
                  int var11 = var4 + var9 << 4;
                  int var12 = var5 + var8 << 4;
                  int var13 = var6 + var10 << 4;
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var12, var13, var11 + 16, var12 + 16, var13 + 16);
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var15 = var3.bridge$getFirstEntity(
                     var14, var2
                  );
                  if (var15 != null) {
                     return var15;
                  }
               }
            }
         }
      }

      return null;
   }

   @Nullable
   public static String IIIORCCOIHHRCIRHOCIIICOHOOCHIH(int var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var1 == null) {
         return null;
      }

      Optional var2 = var1.bridge$getEntityById(var0);
      return var2.isEmpty()
         ? null
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOCRHOROHIHRCRHCRIIIHCHRRHOIIC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2.orElseThrow())
                     .bridge$getTypeName()
               )
            )
            .replace("#", "-");
   }
}
