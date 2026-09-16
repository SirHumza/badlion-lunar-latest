package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class PruferTreeGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int n;
   private final Random rng;
   private final int[] inputPruferSeq;

   public PruferTreeGenerator(int[] var1) {
      if (Objects.isNull(var1)) {
         throw new IllegalArgumentException("pruferSequence cannot be null");
      }

      this.n = var1.length + 2;
      this.rng = null;
      this.inputPruferSeq = (int[])var1.clone();
      if (this.n <= 0) {
         throw new IllegalArgumentException("n must be greater than 0");
      }

      for (int var2 = 0; var2 < this.n - 2; var2++) {
         if (var1[var2] < 0 || var1[var2] >= this.n) {
            throw new IllegalArgumentException("invalid pruferSequence");
         }
      }
   }

   public PruferTreeGenerator(int var1) {
      this(var1, new Random());
   }

   public PruferTreeGenerator(int var1, long var2) {
      this(var1, new Random(var2));
   }

   public PruferTreeGenerator(int var1, Random var2) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("n must be greater than 0");
      }

      this.n = var1;
      this.rng = Objects.requireNonNull(var2, "Random number generator cannot be null");
      this.inputPruferSeq = null;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      GraphTests.requireUndirected(var1);
      if (!var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("target graph is not empty");
      }

      ArrayList var3 = new ArrayList(this.n);

      for (int var4 = 0; var4 < this.n; var4++) {
         var3.add(var1.addVertex());
      }

      if (this.n != 1) {
         int[] var12 = new int[this.n];
         Arrays.fill(var12, 1);
         int[] var5;
         if (this.inputPruferSeq == null) {
            var5 = new int[this.n - 2];

            for (int var6 = 0; var6 < this.n - 2; var6++) {
               var5[var6] = this.rng.nextInt(this.n);
               var12[var5[var6]]++;
            }
         } else {
            var5 = this.inputPruferSeq;
         }

         int var13 = -1;

         for (int var7 = 0; var7 < this.n; var7++) {
            if (var12[var7] == 1) {
               var13 = var7;
               break;
            }
         }

         assert var13 != -1;
         int var14 = var13;
         HashSet var8 = new HashSet<>(var1.vertexSet());

         for (int var9 = 0; var9 < this.n - 2; var9++) {
            int var10 = var5[var9];
            var8.remove(var3.get(var14));
            var1.addEdge(var3.get(var14), var3.get(var10));
            var12[var10]--;
            if (var10 < var13 && var12[var10] == 1) {
               var14 = var10;
            } else {
               for (int var11 = var13 + 1; var11 < this.n; var11++) {
                  if (var12[var11] == 1) {
                     var14 = var11;
                     var13 = var11;
                     break;
                  }
               }
            }
         }

         assert var8.size() == 2;
         Iterator var15 = var8.iterator();
         Object var16 = var15.next();
         Object var17 = var15.next();
         var1.addEdge(var16, var17);
      }
   }
}
