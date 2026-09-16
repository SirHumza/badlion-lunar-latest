package org.jgrapht.generate.netgen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import org.jgrapht.alg.util.Pair;

public class Distributor<K> {
   private final Random rng;
   private final List<Function<K, Integer>> lowerBounds;
   private final List<Function<K, Integer>> upperBounds;

   public Distributor() {
      this(System.nanoTime());
   }

   public Distributor(long var1) {
      this(new Random(var1));
   }

   public Distributor(Random var1) {
      this.rng = var1;
      this.lowerBounds = new ArrayList<>();
      this.upperBounds = new ArrayList<>();
   }

   public void addUpperBound(Function<K, Integer> var1) {
      this.upperBounds.add(var1);
   }

   public void addLowerBound(Function<K, Integer> var1) {
      this.lowerBounds.add(var1);
   }

   private List<Integer> computeLowerBounds(List<K> var1) {
      ArrayList var2 = new ArrayList(var1.size());

      for (Object var4 : var1) {
         int var5 = 0;

         for (Function var7 : this.lowerBounds) {
            var5 = Math.max(var5, (Integer)var7.apply(var4));
         }

         var2.add(var5);
      }

      return var2;
   }

   private List<Integer> computeUpperBounds(List<K> var1) {
      ArrayList var2 = new ArrayList(var1.size());

      for (Object var4 : var1) {
         int var5 = Integer.MAX_VALUE;

         for (Function var7 : this.upperBounds) {
            var5 = Math.min(var5, (Integer)var7.apply(var4));
         }

         var2.add(var5);
      }

      return var2;
   }

   private Pair<List<Integer>, Long> computeSuffixSum(List<Integer> var1) {
      ArrayList var2 = new ArrayList<>(Collections.nCopies(var1.size(), 0));
      long var3 = 0L;

      for (int var5 = var1.size() - 1; var5 >= 0; var5--) {
         var2.set(var5, (int)Math.min(2147483647L, var3));
         var3 += ((Integer)var1.get(var5)).intValue();
      }

      return Pair.of(var2, var3);
   }

   public List<Integer> getDistribution(List<K> var1, int var2) {
      List var3 = this.computeLowerBounds(var1);
      List var4 = this.computeUpperBounds(var1);
      Pair var5 = this.computeSuffixSum(var3);
      Pair var6 = this.computeSuffixSum(var4);
      List var7 = (List)var5.getFirst();
      List var8 = (List)var6.getFirst();
      long var9 = (Long)var5.getSecond();
      long var11 = (Long)var6.getSecond();
      if (var9 > var2) {
         throw new IllegalArgumentException("Can't distribute values among keys: the sum of lower bounds is greater than the number of values");
      }

      if (var11 < var2) {
         throw new IllegalArgumentException("Can't distribute values among keys: the sum of upper bounds is smaller than the number of values");
      }

      int var13 = var2;
      ArrayList var14 = new ArrayList();

      for (int var15 = 0; var15 < var3.size(); var15++) {
         int var16 = (Integer)var3.get(var15);
         int var17 = (Integer)var4.get(var15);
         int var18 = var13 - (Integer)var7.get(var15);
         int var19 = var13 - (Integer)var8.get(var15);
         var16 = Math.max(var16, var19);
         var17 = Math.min(var17, var18);
         if (var16 > var17) {
            throw new IllegalArgumentException("Infeasible bound specified for the key: " + var1.get(var15));
         }

         int var20 = this.rng.nextInt(var17 - var16 + 1) + var16;
         var14.add(var20);
         var13 -= var20;
      }

      return var14;
   }
}
