package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.util.VertexToIntegerMapping;

public class HeldKarpTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   private double memo(int var1, int var2, double[][] var3, double[][] var4) {
      if (var3[var1][var2] != Double.MIN_VALUE) {
         return var3[var1][var2];
      }

      double var5 = Double.MAX_VALUE;
      if (var2 == (1 << var4.length) - 1) {
         if (var4[var1][0] != Double.MAX_VALUE) {
            var5 = var4[var1][0];
         }
      } else {
         for (int var7 = 0; var7 < var4.length; var7++) {
            if ((var2 >> var7 & 1) == 0 && var4[var1][var7] != Double.MAX_VALUE) {
               var5 = Math.min(var5, var4[var1][var7] + this.memo(var7, var2 ^ 1 << var7, var3, var4));
            }
         }
      }

      return var3[var1][var2] = var5;
   }

   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.requireNotEmpty(var1);
      int var2 = var1.vertexSet().size();
      if (var2 == 1) {
         return this.getSingletonTour(var1);
      }

      if (var2 > 31) {
         throw new IllegalArgumentException(
            "The internal representation of the dynamic programming state space cannot represent graphs containing more than 31 vertices. The runtime complexity of this implementation, O(2^|V| x |V|^2),  makes it unsuitable for graphs with more than 31 vertices."
         );
      }

      VertexToIntegerMapping var3 = Graphs.getVertexToIntegerMapping(var1);
      double[][] var4 = this.computeMinimumWeights(var3.getVertexMap(), var1);
      double[][] var5 = new double[var2][1 << var2];
      fill(var5, Double.MIN_VALUE);
      double var6 = this.memo(0, 1, var5, var4);
      if (var6 == Double.MAX_VALUE) {
         return null;
      }

      List var8 = this.reconstructTour(var3.getIndexList(), var4, var5);
      return this.vertexListToTour(var8, var1);
   }

   private double[][] computeMinimumWeights(Map<V, Integer> var1, Graph<V, E> var2) {
      int var3 = var1.size();
      double[][] var4 = new double[var3][var3];
      fill(var4, Double.MAX_VALUE);

      for (Object var6 : var2.edgeSet()) {
         Object var7 = var2.getEdgeSource(var6);
         Object var8 = var2.getEdgeTarget(var6);
         int var9 = (Integer)var1.get(var7);
         int var10 = (Integer)var1.get(var8);
         var4[var9][var10] = Math.min(var4[var9][var10], var2.getEdgeWeight(var6));
         if (var2.getType().isUndirected()) {
            var4[var10][var9] = Math.min(var4[var10][var9], var2.getEdgeWeight(var6));
         }
      }

      return var4;
   }

   private static void fill(double[][] var0, double var1) {
      for (double[] var6 : var0) {
         Arrays.fill(var6, var1);
      }
   }

   private List<V> reconstructTour(List<V> var1, double[][] var2, double[][] var3) {
      int var4 = var1.size();
      ArrayList var5 = new ArrayList(var4);
      int var6 = 0;
      int var7 = 1;
      var5.add(var1.get(var6));

      for (int var8 = 1; var8 < var4; var8++) {
         int var9 = -1;

         for (int var10 = 1; var10 < var4; var10++) {
            if ((var7 & 1 << var10) == 0
               && var2[var6][var10] != Double.MAX_VALUE
               && var3[var10][var7 ^ 1 << var10] != Double.MIN_VALUE
               && Double.compare(var3[var10][var7 ^ 1 << var10] + var2[var6][var10], var3[var6][var7]) == 0) {
               var9 = var10;
               break;
            }
         }

         assert var9 != -1;
         var5.add(var1.get(var9));
         var7 ^= 1 << var9;
         var6 = var9;
      }

      return var5;
   }
}
