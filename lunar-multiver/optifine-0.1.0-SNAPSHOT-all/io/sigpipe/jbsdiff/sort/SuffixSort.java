package io.sigpipe.jbsdiff.sort;

public class SuffixSort {
   public static void qsufsort(int[] var0, int[] var1, byte[] var2) {
      int[] var3 = new int[256];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var2[var4] & 0xFF]++;
      }

      for (int var7 = 1; var7 < 256; var7++) {
         var3[var7] += var3[var7 - 1];
      }

      for (int var8 = 255; var8 > 0; var8--) {
         var3[var8] = var3[var8 - 1];
      }

      var3[0] = 0;
      int var9 = 0;

      while (var9 < var2.length) {
         var0[++var3[var2[var9] & 0xFF]] = var9++;
      }

      var0[0] = var2.length;

      for (int var10 = 0; var10 < var2.length; var10++) {
         var1[var10] = var3[var2[var10] & 0xFF];
      }

      var1[var2.length] = 0;

      for (int var11 = 1; var11 < 256; var11++) {
         if (var3[var11] == var3[var11 - 1] + 1) {
            var0[var3[var11]] = -1;
         }
      }

      var0[0] = -1;

      for (byte var5 = 1; var0[0] != -(var2.length + 1); var5 += var5) {
         int var6 = 0;
         var9 = 0;

         while (var9 < var2.length + 1) {
            if (var0[var9] < 0) {
               var6 -= var0[var9];
               var9 -= var0[var9];
            } else {
               if (var6 != 0) {
                  var0[var9 - var6] = -var6;
               }

               var6 = var1[var0[var9]] + 1 - var9;
               split(var0, var1, var9, var6, var5);
               var9 += var6;
               var6 = 0;
            }
         }

         if (var6 != 0) {
            var0[var9 - var6] = -var6;
         }
      }

      var9 = 0;

      while (var9 < var2.length + 1) {
         var0[var1[var9]] = var9++;
      }
   }

   public static void split(int[] var0, int[] var1, int var2, int var3, int var4) {
      if (var3 < 16) {
         int var17 = var2;

         while (var17 < var2 + var3) {
            int var16 = 1;
            int var18 = var1[var0[var17] + var4];

            for (int var14 = 1; var17 + var14 < var2 + var3; var14++) {
               if (var1[var0[var17 + var14] + var4] < var18) {
                  var18 = var1[var0[var17 + var14] + var4];
                  var16 = 0;
               }

               if (var1[var0[var17 + var14] + var4] == var18) {
                  int var21 = var0[var17 + var16];
                  var0[var17 + var16] = var0[var17 + var14];
                  var0[var17 + var14] = var21;
                  var16++;
               }
            }

            for (int var15 = 0; var15 < var16; var15++) {
               var1[var0[var17 + var15]] = var17 + var16 - 1;
            }

            if (var16 == 1) {
               var0[var17] = -1;
            }

            var17 += var16;
         }
      } else {
         int var8 = var1[var0[var2 + var3 / 2] + var4];
         int var10 = 0;
         int var11 = 0;

         for (int var5 = var2; var5 < var2 + var3; var5++) {
            if (var1[var0[var5] + var4] < var8) {
               var10++;
            }

            if (var1[var0[var5] + var4] == var8) {
               var11++;
            }
         }

         var10 += var2;
         var11 += var10;
         int var12 = var2;
         int var6 = 0;
         int var7 = 0;

         while (var12 < var10) {
            if (var1[var0[var12] + var4] < var8) {
               var12++;
            } else if (var1[var0[var12] + var4] == var8) {
               int var9 = var0[var12];
               var0[var12] = var0[var10 + var6];
               var0[var10 + var6] = var9;
               var6++;
            } else {
               int var19 = var0[var12];
               var0[var12] = var0[var11 + var7];
               var0[var11 + var7] = var19;
               var7++;
            }
         }

         while (var10 + var6 < var11) {
            if (var1[var0[var10 + var6] + var4] == var8) {
               var6++;
            } else {
               int var20 = var0[var10 + var6];
               var0[var10 + var6] = var0[var11 + var7];
               var0[var11 + var7] = var20;
               var7++;
            }
         }

         if (var10 > var2) {
            split(var0, var1, var2, var10 - var2, var4);
         }

         for (int var13 = 0; var13 < var11 - var10; var13++) {
            var1[var0[var10 + var13]] = var11 - 1;
         }

         if (var10 == var11 - 1) {
            var0[var10] = -1;
         }

         if (var2 + var3 > var11) {
            split(var0, var1, var11, var2 + var3 - var11, var4);
         }
      }
   }

   private static int matchLength(byte[] var0, int var1, byte[] var2, int var3) {
      int var4 = var0.length - var1;
      int var5 = var2.length - var3;
      int var6 = 0;

      while (var6 < var4 && var6 < var5 && var0[var6 + var1] == var2[var6 + var3]) {
         var6++;
      }

      return var6;
   }

   public static SearchResult search(int[] var0, byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      if (var6 - var5 < 2) {
         int var9 = matchLength(var1, var0[var5], var3, var4);
         int var8 = matchLength(var1, var0[var6], var3, var4);
         return var9 > var8 ? new SearchResult(var9, var0[var5]) : new SearchResult(var8, var0[var6]);
      } else {
         int var7 = var5 + (var6 - var5) / 2;
         return compareBytes(var1, var0[var7], var3, var4) < 0 ? search(var0, var1, 0, var3, var4, var7, var6) : search(var0, var1, 0, var3, var4, var5, var7);
      }
   }

   private static int compareBytes(byte[] var0, int var1, byte[] var2, int var3) {
      int var4 = Math.min(var0.length - var1, var2.length - var3);
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var4; var7++) {
         var5 = var0[var7 + var1] & 255;
         var6 = var2[var7 + var3] & 255;
         if (var5 != var6) {
            break;
         }
      }

      return var5 - var6;
   }
}
