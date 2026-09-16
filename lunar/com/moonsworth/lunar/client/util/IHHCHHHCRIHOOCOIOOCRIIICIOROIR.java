package com.moonsworth.lunar.client.util;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.Contract;

public interface IHHCHHHCRIHOOCOIOOCRIIICIOROIR<Builder> {
   @Contract("_ -> this")
   default Builder RRCRRCORICCHOHHIRCHIROOHIIOHCO(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOHCHCCRHCCIOIOOCHROIOCCOCIR, false
      );
   }

   @Contract("_ -> this")
   default Builder RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORIIROOCCCIHOHRIRIICCRHOICROOC, var1, false
      );
   }

   @Contract("_,_ -> this")
   default Builder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, false);
   }

   @Contract("_,_,_ -> this")
   default Builder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3)
            .toArray(new com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[0])
      );
   }

   @Contract("_ -> this")
   default Builder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH... var1) {
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = var1[var3].getOrdinal();
      }

      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
   }

   @Contract("_ -> this")
   default Builder IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH... var1) {
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = var1[var3].getOrdinal();
      }

      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2);
   }

   @Contract("_ -> this")
   default Builder HRICOCOIOCCCICCIORHIIIIOROCOHC(int var1) {
      return this.CORCOCICIRIOHROHROIIOOHICCHCRR(
         var1, com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOHCHCCRHCCIOIOOCHROIOCCOCIR.getOrdinal(), false
      );
   }

   @Contract("_ -> this")
   default Builder COIIIOIIOHICCOCIOROOHIIHHIOIOR(int var1) {
      return this.CORCOCICIRIOHROHROIIOOHICCHCRR(0, var1, false);
   }

   @Contract("_,_ -> this")
   default Builder IROCHOHCORHCOCCCOCHORCICRORIIC(int var1, int var2) {
      return this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1, var2, false);
   }

   @Contract("_,_,_ -> this")
   default Builder CORCOCICIRIOHROHROIIOOHICCHCRR(int var1, int var2, boolean var3) {
      int[] var4 = new int[var2 - var1 + 1];
      int var5 = var1;

      while (var5 <= var2) {
         var4[var5 - var1] = var5++;
      }

      return var3 ? this.CRRRICCRROCOHHOHIICIHORCOORRRH(var4) : this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4);
   }

   @Contract("_ -> this")
   Builder RRCRRCORICCHOHHIRCHIROOHIIOHCO(int... var1);

   @Contract("_ -> this")
   Builder CRRRICCRROCOHHOHIICIHORCOORRRH(int... var1);

   @Contract("-> this")
   default Builder IRHOCORHRHOOIRORRIOOOCOHROHOHR() {
      return this.HRICOCOIOCCCICCIORHIIIIOROCOHC(6);
   }

   @Contract("-> this")
   default Builder CIIHRRROHIRRHCHCHORRCHCCOHOOHC() {
      return this.COIIIOIIOHICCOCIOROOHIIHHIOIOR(5);
   }

   @Contract("-> this")
   default Builder IRIIHHCCOHHOHHRHRRRORHIRHCIHCH() {
      return this.HRICOCOIOCCCICCIORHIIIIOROCOHC(9);
   }

   @Contract("-> this")
   default Builder RIORIRIHOIRCIROHCRHHCHIHIRHRIH() {
      IntArrayList var1 = new IntArrayList();
      var1.add(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHRHIIHHCIHIICRCHOOOOCOCIIROHC.getOrdinal());

      for (int var2 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOHCHCCRHHOICRHCIOHHRHCRCIROIH.getOrdinal();
         var2 <= com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOHCHCCRHCCIOIOOCHROIOCCOCIR.getOrdinal();
         var2++
      ) {
         var1.add(var2);
      }

      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(Arrays.copyOf(var1.elements(), var1.size()));
   }

   @Contract("_ -> this")
   Builder IIHRRHORCRCROCHHOHORCHCROCIHRO(String... var1);

   @Contract("_ -> this")
   Builder HICHRCOHCCRHOHCICOOCHOIHCCHIRI(String... var1);
}
