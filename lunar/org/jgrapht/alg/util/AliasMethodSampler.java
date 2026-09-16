package org.jgrapht.alg.util;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class AliasMethodSampler {
   private final Random rng;
   private Comparator<Double> comparator;
   private final double[] prob;
   private final int[] alias;

   public AliasMethodSampler(double[] var1) {
      this(var1, new Random(), 1.0E-9);
   }

   public AliasMethodSampler(double[] var1, long var2) {
      this(var1, new Random(var2), 1.0E-9);
   }

   public AliasMethodSampler(double[] var1, Random var2) {
      this(var1, var2, 1.0E-9);
   }

   public AliasMethodSampler(double[] var1, Random var2, double var3) {
      this.rng = Objects.requireNonNull(var2, "Random number generator cannot be null");
      this.comparator = new ToleranceDoubleComparator(var3);
      if (var1 != null && var1.length >= 1) {
         double var5 = 0.0;

         for (int var7 = 0; var7 < var1.length; var7++) {
            if (this.comparator.compare(var1[var7], 0.0) < 0) {
               throw new IllegalArgumentException("Non valid probability distribution");
            }

            var5 += var1[var7];
         }

         if (this.comparator.compare(var5, 1.0) != 0) {
            throw new IllegalArgumentException("Non valid probability distribution");
         }

         int var16 = var1.length;
         int[] var8 = new int[var16];
         int[] var9 = new int[var16];
         double var10 = 1.0 / var16;
         int var12 = 0;
         int var13 = 0;

         for (int var14 = 0; var14 < var16; var14++) {
            if (this.comparator.compare(var1[var14], var10) > 0) {
               var8[var12++] = var14;
            } else {
               var9[var13++] = var14;
            }
         }

         this.prob = new double[var16];
         this.alias = new int[var16];

         while (var13 != 0 && var12 != 0) {
            int var17 = var9[--var13];
            int var15 = var8[--var12];
            this.prob[var17] = var16 * var1[var17];
            this.alias[var17] = var15;
            var1[var15] += var1[var17] - var10;
            if (this.comparator.compare(var1[var15], var10) > 0) {
               var8[var12++] = var15;
            } else {
               var9[var13++] = var15;
            }
         }

         while (var13 > 0) {
            this.prob[var9[--var13]] = 1.0;
         }

         while (var12 > 0) {
            this.prob[var8[--var12]] = 1.0;
         }
      } else {
         throw new IllegalArgumentException("Probabilities cannot be empty");
      }
   }

   public int next() {
      double var1 = this.rng.nextDouble() * this.prob.length;
      int var3 = (int)Math.floor(var1);
      return this.comparator.compare(var1 - var3, this.prob[var3]) <= 0 ? var3 : this.alias[var3];
   }
}
