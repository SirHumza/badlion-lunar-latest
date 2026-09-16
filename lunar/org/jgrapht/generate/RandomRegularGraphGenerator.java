package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class RandomRegularGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int n;
   private final int d;
   private final Random rng;

   public RandomRegularGraphGenerator(int var1, int var2) {
      this(var1, var2, new Random());
   }

   public RandomRegularGraphGenerator(int var1, int var2, long var3) {
      this(var1, var2, new Random(var3));
   }

   public RandomRegularGraphGenerator(int var1, int var2, Random var3) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of nodes must be non-negative");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("degree of nodes must be non-negative");
      }

      if (var2 > var1) {
         throw new IllegalArgumentException("degree of nodes must be smaller than or equal to number of nodes");
      }

      if (var1 * var2 % 2 != 0) {
         throw new IllegalArgumentException("value 'n * d' must be even");
      }

      this.n = var1;
      this.d = var2;
      this.rng = var3;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (!var1.getType().isUndirected()) {
         throw new IllegalArgumentException("target graph must be undirected");
      }

      if (var1.getType().isSimple()) {
         if (this.n != 0 && this.d != 0) {
            if (this.d == this.n) {
               throw new IllegalArgumentException("target graph must be simple if 'n == d'");
            }

            if (this.d == this.n - 1) {
               new CompleteGraphGenerator(this.n).generateGraph(var1);
            } else {
               this.generateSimpleRegularGraph(var1);
            }
         } else {
            new EmptyGraphGenerator(this.n).generateGraph(var1);
         }
      } else {
         this.generateNonSimpleRegularGraph(var1);
      }
   }

   private boolean suitable(Set<Entry<Integer, Integer>> var1, Map<Integer, Integer> var2) {
      if (var2.isEmpty()) {
         return true;
      }

      Integer[] var3 = var2.keySet().toArray(new Integer[0]);
      Arrays.sort(var3);

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = var3[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            int var7 = var3[var6];
            SimpleImmutableEntry var8 = new SimpleImmutableEntry<>(var7, var5);
            if (!var1.contains(var8)) {
               return true;
            }
         }
      }

      return false;
   }

   private void generateSimpleRegularGraph(Graph<V, E> var1) {
      ArrayList var2 = new ArrayList(this.n);

      for (int var3 = 0; var3 < this.n; var3++) {
         var2.add(var1.addVertex());
      }

      HashSet var11 = CollectionUtil.newHashSetWithExpectedSize(this.n * this.d);

      do {
         ArrayList var4 = new ArrayList(this.n * this.d);

         for (int var5 = 0; var5 < this.n * this.d; var5++) {
            var4.add(var5 % this.n);
         }

         while (!var4.isEmpty()) {
            HashMap var13 = new HashMap();
            Collections.shuffle(var4, this.rng);

            for (byte var6 = 0; var6 < var4.size() - 1; var6 += 2) {
               int var7 = (Integer)var4.get(var6);
               int var8 = (Integer)var4.get(var6 + 1);
               if (var7 > var8) {
                  int var9 = var7;
                  var7 = var8;
                  var8 = var9;
               }

               SimpleImmutableEntry var18 = new SimpleImmutableEntry<>(var7, var8);
               if (var7 != var8 && !var11.contains(var18)) {
                  var11.add(var18);
               } else {
                  var13.put(var7, var13.getOrDefault(var7, 0) + 1);
                  var13.put(var8, var13.getOrDefault(var8, 0) + 1);
               }
            }

            if (!this.suitable(var11, var13)) {
               var11.clear();
               break;
            }

            var4.clear();

            for (Entry var16 : var13.entrySet()) {
               int var17 = (Integer)var16.getKey();
               int var19 = (Integer)var16.getValue();

               for (int var10 = 0; var10 < var19; var10++) {
                  var4.add(var17);
               }
            }
         }
      } while (var11.isEmpty());

      for (Entry var14 : var11) {
         var1.addEdge(var2.get((Integer)var14.getKey()), var2.get((Integer)var14.getValue()));
      }
   }

   private void generateNonSimpleRegularGraph(Graph<V, E> var1) {
      ArrayList var2 = new ArrayList(this.n * this.d);

      for (int var3 = 0; var3 < this.n; var3++) {
         Object var4 = var1.addVertex();

         for (int var5 = 0; var5 < this.d; var5++) {
            var2.add(var4);
         }
      }

      Collections.shuffle(var2, this.rng);

      for (int var6 = 0; var6 < this.n * this.d / 2; var6++) {
         Object var7 = var2.get(2 * var6);
         Object var8 = var2.get(2 * var6 + 1);
         var1.addEdge(var7, var8);
      }
   }
}
