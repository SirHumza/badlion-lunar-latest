package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.BiFunction;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final BigDecimal OHIICCROHIIIICIORRCCHOICHCOOCH = new BigDecimal(1000000000L);

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   public static String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var0, int var2) {
      StringBuilder var3 = new StringBuilder(20).append(var0).append('.');
      if (var2 == 0L) {
         if (var0 == 0L) {
            return "0.0";
         }

         var3.append("000000000");
      } else {
         StringBuilder var4 = new StringBuilder(9);
         var4.append(var2);
         int var5 = var4.length();
         int var6 = 9 - var5;

         while (var6 > 0) {
            var6--;
            var3.append('0');
         }

         var3.append(var4);
      }

      return var3.toString();
   }

   public static BigDecimal HRCHROOHRIHCRCRHRIIROCIRHOIRHH(long var0, int var2) {
      if (var2 == 0L) {
         return var0 == 0L ? BigDecimal.ZERO.setScale(1) : BigDecimal.valueOf(var0).setScale(9);
      } else {
         return IIHRRHORCRCROCHHOHORCHCROCIHRO.parseBigDecimal(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var2));
      }
   }

   @Deprecated
   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BigDecimal var0, long var1) {
      return var0.subtract(BigDecimal.valueOf(var1)).multiply(OHIICCROHIIIICIORRCCHOICHCOOCH).intValue();
   }

   public static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BigDecimal var0, BiFunction<Long, Integer, T> var1) {
      BigDecimal var5 = var0.scaleByPowerOfTen(9);
      long var2;
      int var4;
      if (var5.precision() - var5.scale() <= 0) {
         var4 = 0;
         var2 = 0;
      } else if (var0.scale() < -63) {
         var4 = 0;
         var2 = 0;
      } else {
         var2 = var0.longValue();
         var4 = var5.subtract(BigDecimal.valueOf(var2).scaleByPowerOfTen(9)).intValue();
         if (var2 < 0L && var2 > Instant.MIN.getEpochSecond()) {
            var4 = Math.abs(var4);
         }
      }

      return (T)var1.apply(var2, var4);
   }
}
