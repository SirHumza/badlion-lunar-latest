package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIHIHIRCIOIRRRIRCRICICRIHIRCCI() {
      return OCHCRCRIOHHOHCIHOOOCCCORIOCHIH(2).CICCICIIOHHCHHHCHOHOICOIIHOCRO(1);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOHHRCROOIHOICRRICRRRIHHOHICCR() {
      return OCHCRCRIOHHOHCIHOOOCCCORIOCHIH(4);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIIRRIIRCHCORRHICHIOOOOOHCRRC() {
      return OCHCRCRIOHHOHCIHOOOCCCORIOCHIH(100);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCHCRCRIOHHOHCIHOOOCCCORIOCHIH(int var0) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   private static boolean containsNaN(double... var0) {
      for (double var4 : var0) {
         if (Double.isNaN(var4)) {
            return true;
         }
      }

      return false;
   }

   private static double interpolate(double var0, double var2, double var4, double var6) {
      if (var0 == Double.NEGATIVE_INFINITY) {
         return var2 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
      } else {
         return var2 == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : var0 + (var2 - var0) * var4 / var6;
      }
   }

   private static void checkIndex(int var0, int var1) {
      if (var0 < 0 || var0 > var1) {
         throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + var1);
      }
   }

   private static double[] longsToDoubles(long[] var0) {
      int var1 = var0.length;
      double[] var2 = new double[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0[var3];
      }

      return var2;
   }

   private static double[] intsToDoubles(int[] var0) {
      int var1 = var0.length;
      double[] var2 = new double[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0[var3];
      }

      return var2;
   }

   private static void selectInPlace(int var0, double[] var1, int var2, int var3) {
      if (var0 == var2) {
         int var6 = var2;

         for (int var5 = var2 + 1; var5 <= var3; var5++) {
            if (var1[var6] > var1[var5]) {
               var6 = var5;
            }
         }

         if (var6 != var2) {
            swap(var1, var6, var2);
         }
      } else {
         while (var3 > var2) {
            int var4 = partition(var1, var2, var3);
            if (var4 >= var0) {
               var3 = var4 - 1;
            }

            if (var4 <= var0) {
               var2 = var4 + 1;
            }
         }
      }
   }

   private static int partition(double[] var0, int var1, int var2) {
      movePivotToStartOfSlice(var0, var1, var2);
      double var3 = var0[var1];
      int var5 = var2;

      for (int var6 = var2; var6 > var1; var6--) {
         if (var0[var6] > var3) {
            swap(var0, var5, var6);
            var5--;
         }
      }

      swap(var0, var1, var5);
      return var5;
   }

   private static void movePivotToStartOfSlice(double[] var0, int var1, int var2) {
      int var3 = var1 + var2 >>> 1;
      boolean var4 = var0[var2] < var0[var3];
      boolean var5 = var0[var3] < var0[var1];
      boolean var6 = var0[var2] < var0[var1];
      if (var4 == var5) {
         swap(var0, var3, var1);
      } else if (var4 != var6) {
         swap(var0, var1, var2);
      }
   }

   private static void selectAllInPlace(int[] var0, int var1, int var2, double[] var3, int var4, int var5) {
      int var6 = chooseNextSelection(var0, var1, var2, var4, var5);
      int var7 = var0[var6];
      selectInPlace(var7, var3, var4, var5);
      int var8 = var6 - 1;

      while (var8 >= var1 && var0[var8] == var7) {
         var8--;
      }

      if (var8 >= var1) {
         selectAllInPlace(var0, var1, var8, var3, var4, var7 - 1);
      }

      int var9 = var6 + 1;

      while (var9 <= var2 && var0[var9] == var7) {
         var9++;
      }

      if (var9 <= var2) {
         selectAllInPlace(var0, var9, var2, var3, var7 + 1, var5);
      }
   }

   private static int chooseNextSelection(int[] var0, int var1, int var2, int var3, int var4) {
      if (var1 == var2) {
         return var1;
      }

      int var5 = var3 + var4 >>> 1;
      int var6 = var1;
      int var7 = var2;

      while (var7 > var6 + 1) {
         int var8 = var6 + var7 >>> 1;
         if (var0[var8] > var5) {
            var7 = var8;
         } else {
            if (var0[var8] >= var5) {
               return var8;
            }

            var6 = var8;
         }
      }

      return var3 + var4 - var0[var6] - var0[var7] > 0 ? var7 : var6;
   }

   private static void swap(double[] var0, int var1, int var2) {
      double var3 = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = var3;
   }

   public static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final int RICCOOCOCOIOHCRRHRHHRHOORRHHRH;
      private final int[] OCRICRRRRHIROICCCCHHHCHHHCCRRR;

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, int[] var2) {
         for (int var6 : var2) {
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.checkIndex(var6, var1);
         }

         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2.length > 0, "Indexes must be a non empty array");
         this.RICCOOCOCOIOHCRRHRHHRHOORRHHRH = var1;
         this.OCRICRRRRHIROICCCCHHHCHHHCCRRR = var2;
      }

      public Map<Integer, Double> compute(Collection<? extends Number> var1) {
         return this.computeInPlace(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.toArray(
               var1
            )
         );
      }

      public Map<Integer, Double> compute(double... var1) {
         return this.computeInPlace((double[])var1.clone());
      }

      public Map<Integer, Double> compute(long... var1) {
         return this.computeInPlace(CRICCOOHHHCHOORCICOCOHIHOIRHOO.longsToDoubles(var1));
      }

      public Map<Integer, Double> compute(int... var1) {
         return this.computeInPlace(CRICCOOHHHCHOORCICOCOHIHOIRHOO.intsToDoubles(var1));
      }

      public Map<Integer, Double> computeInPlace(double... var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1.length > 0, "Cannot calculate quantiles of an empty dataset");
         if (!CRICCOOHHHCHOORCICOCOHIHOIRHOO.containsNaN(var1)) {
            int[] var11 = new int[this.OCRICRRRRHIROICCCCHHHCHHHCCRRR.length];
            int[] var12 = new int[this.OCRICRRRRHIROICCCCHHHCHHHCCRRR.length];
            int[] var13 = new int[this.OCRICRRRRHIROICCCCHHHCHHHCCRRR.length * 2];
            int var14 = 0;

            for (int var15 = 0; var15 < this.OCRICRRRRHIROICCCCHHHCHHHCCRRR.length; var15++) {
               long var7 = (long)this.OCRICRRRRHIROICCCCHHHCHHHCCRRR[var15] * (var1.length - 1);
               int var9 = (int)RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.divide(var7, this.RICCOOCOCOIOHCRRHRHHRHOORRHHRH, RoundingMode.DOWN);
               int var10 = (int)(var7 - (long)var9 * this.RICCOOCOCOIOHCRRHRHHRHOORRHHRH);
               var11[var15] = var9;
               var12[var15] = var10;
               var13[var14] = var9;
               var14++;
               if (var10 != 0) {
                  var13[var14] = var9 + 1;
                  var14++;
               }
            }

            Arrays.sort(var13, 0, var14);
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.selectAllInPlace(var13, 0, var14 - 1, var1, 0, var1.length - 1);
            LinkedHashMap var16 = new LinkedHashMap();

            for (int var17 = 0; var17 < this.OCRICRRRRHIROICCCCHHHCHHHCCRRR.length; var17++) {
               int var8 = var11[var17];
               int var18 = var12[var17];
               if (var18 == 0) {
                  var16.put(this.OCRICRRRRHIROICCCCHHHCHHHCCRRR[var17], var1[var8]);
               } else {
                  var16.put(
                     this.OCRICRRRRHIROICCCCHHHCHHHCCRRR[var17],
                     CRICCOOHHHCHOORCICOCOHIHOIRHOO.interpolate(var1[var8], var1[var8 + 1], var18, this.RICCOOCOCOIOHCRRHRHHRHOORRHHRH)
                  );
               }
            }

            return Collections.unmodifiableMap(var16);
         } else {
            LinkedHashMap var2 = new LinkedHashMap();

            for (int var6 : this.OCRICRRRRHIROICCCCHHHCHHHCCRRR) {
               var2.put(var6, Double.NaN);
            }

            return Collections.unmodifiableMap(var2);
         }
      }
   }

   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final int CHIOOROHIIHHOHRIIHCHRHIIROHHCO;
      private final int IOOCCCIRIHOOCOICOHICOCOHCRIRRO;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2) {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO.checkIndex(var2, var1);
         this.CHIOOROHIIHHOHRIIHCHRHIIROHHCO = var1;
         this.IOOCCCIRIHOOCOICOHICOCOHCRIRRO = var2;
      }

      public double compute(Collection<? extends Number> var1) {
         return this.computeInPlace(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.toArray(
               var1
            )
         );
      }

      public double compute(double... var1) {
         return this.computeInPlace((double[])var1.clone());
      }

      public double compute(long... var1) {
         return this.computeInPlace(CRICCOOHHHCHOORCICOCOHIHOIRHOO.longsToDoubles(var1));
      }

      public double compute(int... var1) {
         return this.computeInPlace(CRICCOOHHHCHOORCICOCOHIHOIRHOO.intsToDoubles(var1));
      }

      public double computeInPlace(double... var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1.length > 0, "Cannot calculate quantiles of an empty dataset");
         if (CRICCOOHHHCHOORCICOCOHIHOIRHOO.containsNaN(var1)) {
            return Double.NaN;
         }

         long var2 = (long)this.IOOCCCIRIHOOCOICOHICOCOHCRIRRO * (var1.length - 1);
         int var4 = (int)RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.divide(var2, this.CHIOOROHIIHHOHRIIHCHRHIIROHHCO, RoundingMode.DOWN);
         int var5 = (int)(var2 - (long)var4 * this.CHIOOROHIIHHOHRIIHCHRHIIROHHCO);
         CRICCOOHHHCHOORCICOCOHIHOIRHOO.selectInPlace(var4, var1, 0, var1.length - 1);
         if (var5 == 0) {
            return var1[var4];
         }

         CRICCOOHHHCHOORCICOCOHIHOIRHOO.selectInPlace(var4 + 1, var1, var4 + 1, var1.length - 1);
         return CRICCOOHHHCHOORCICOCOHIHOIRHOO.interpolate(var1[var4], var1[var4 + 1], var5, this.CHIOOROHIIHHOHRIIHCHRHIIROHHCO);
      }
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final int CRROOHRICIIROIICHIIRCCCCRIRHOI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 > 0, "Quantile scale must be positive");
         this.CRROOHRICIIROIICHIIRCCCCRIRHOI = var1;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CICCICIIOHHCHHHCHOHOICOIIHOCRO(int var1) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CRROOHRICIIROIICHIIRCCCCRIRHOI, var1);
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH CRHROHHHCIHHCOHCOORCRIHHIICROR(int... var1) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.CRROOHRICIIROIICHIIRCCCCRIRHOI, (int[])var1.clone());
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH IHCRORHRORIICHRHRCHRRIRRHHOCOO(Collection<Integer> var1) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.CRROOHRICIIROIICHIIRCCCCRIRHOI,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.toArray(
               var1
            )
         );
      }
   }
}
