package org.jgrapht.util;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RadixSort {
   public static int CUT_OFF = 40;
   private static final int MAX_DIGITS = 32;
   private static final int MAX_D = 4;
   private static final int SIZE_RADIX = 256;
   private static final int MASK = 255;
   private static int[] count = new int[256];

   private RadixSort() {
   }

   private static void radixSort(int[] var0, int var1, int[] var2, int[] var3) {
      int var4 = 0;

      for (byte var5 = 0; var4 < 4; var5 += 8) {
         Arrays.fill(var3, 0);

         for (int var6 = 0; var6 < var1; var6++) {
            var3[var0[var6] >> var5 & 0xFF]++;
         }

         for (int var7 = 1; var7 < 256; var7++) {
            var3[var7] += var3[var7 - 1];
         }

         for (int var8 = var1 - 1; var8 >= 0; var8--) {
            var2[--var3[var0[var8] >> var5 & 0xFF]] = var0[var8];
         }

         System.arraycopy(var2, 0, var0, 0, var1);
         var4++;
      }
   }

   public static void sort(List<Integer> var0) {
      if (var0 != null) {
         int var1 = var0.size();
         if (var1 <= CUT_OFF) {
            var0.sort(null);
         } else {
            int[] var2 = new int[var1];
            ListIterator var3 = var0.listIterator();

            while (var3.hasNext()) {
               var2[var3.nextIndex()] = (Integer)var3.next();
            }

            radixSort(var2, var1, new int[var1], count);
            var3 = var0.listIterator();

            while (var3.hasNext()) {
               var3.next();
               var3.set(var2[var3.previousIndex()]);
            }
         }
      }
   }
}
