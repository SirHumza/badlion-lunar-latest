package org.jgrapht.alg.matching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;

public class KuhnMunkresMinimalWeightBipartitePerfectMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private Set<? extends V> partition1;
   private Set<? extends V> partition2;

   public KuhnMunkresMinimalWeightBipartitePerfectMatching(Graph<V, E> var1, Set<? extends V> var2, Set<? extends V> var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("Input graph cannot be null");
      }

      this.graph = var1;
      if (var2 == null) {
         throw new IllegalArgumentException("Partition 1 cannot be null");
      }

      this.partition1 = var2;
      if (var3 == null) {
         throw new IllegalArgumentException("Partition 2 cannot be null");
      }

      this.partition2 = var3;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      if (this.partition1.size() != this.partition2.size()) {
         throw new IllegalArgumentException("Graph supplied isn't complete bipartite with equally sized partitions!");
      }

      if (!GraphTests.isBipartitePartition(this.graph, this.partition1, this.partition2)) {
         throw new IllegalArgumentException("Invalid bipartite partition provided");
      }

      int var1 = this.partition1.size();
      int var2 = this.graph.edgeSet().size();
      if (var2 != var1 * var1) {
         throw new IllegalArgumentException("Graph supplied isn't complete bipartite with equally sized partitions!");
      }

      if (!GraphTests.isSimple(this.graph)) {
         throw new IllegalArgumentException("Only simple graphs supported");
      }

      ArrayList var3 = new ArrayList<>(this.partition1);
      ArrayList var4 = new ArrayList<>(this.partition2);
      int[] var5;
      if (this.graph.vertexSet().isEmpty()) {
         var5 = new int[0];
      } else {
         var5 = new KuhnMunkresMinimalWeightBipartitePerfectMatching.KuhnMunkresMatrixImplementation<>(this.graph, var3, var4).buildMatching();
      }

      HashSet var6 = new HashSet();
      double var7 = 0.0;

      for (int var9 = 0; var9 < var5.length; var9++) {
         Object var10 = this.graph.getEdge((V)var3.get(var9), (V)var4.get(var5[var9]));
         var7 += this.graph.getEdgeWeight((E)var10);
         var6.add(var10);
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var6, var7);
   }

   static class KuhnMunkresMatrixImplementation<V, E> {
      private double[][] costMatrix;
      private double[][] excessMatrix;
      boolean[] rowsCovered;
      boolean[] columnsCovered;
      private int[] columnMatched;
      private int[] rowMatched;

      public KuhnMunkresMatrixImplementation(Graph<V, E> var1, List<? extends V> var2, List<? extends V> var3) {
         int var4 = var2.size();
         this.costMatrix = new double[var4][];

         for (int var5 = 0; var5 < var2.size(); var5++) {
            Object var6 = var2.get(var5);
            this.costMatrix[var5] = new double[var4];

            for (int var7 = 0; var7 < var3.size(); var7++) {
               Object var8 = var3.get(var7);
               if (!var6.equals(var8)) {
                  this.costMatrix[var5][var7] = var1.getEdgeWeight(var1.getEdge(var6, var8));
               }
            }
         }
      }

      protected int[] buildMatching() {
         int var1 = this.costMatrix.length;
         int var2 = this.costMatrix[0].length;
         this.excessMatrix = this.makeExcessMatrix();
         this.rowsCovered = new boolean[var1];
         this.columnsCovered = new boolean[var2];
         this.columnMatched = new int[var1];
         this.rowMatched = new int[var2];
         Arrays.fill(this.columnMatched, -1);
         Arrays.fill(this.rowMatched, -1);

         while (this.buildMaximalMatching() < var2) {
            this.buildVertexCoverage();
            this.extendEqualityGraph();
         }

         return Arrays.copyOf(this.columnMatched, var1);
      }

      double[][] makeExcessMatrix() {
         double[][] var1 = new double[this.costMatrix.length][];

         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = Arrays.copyOf(this.costMatrix[var2], this.costMatrix[var2].length);
         }

         for (int var6 = 0; var6 < var1.length; var6++) {
            double var3 = Double.MAX_VALUE;

            for (int var5 = 0; var5 < var1[var6].length; var5++) {
               if (var3 > var1[var6][var5]) {
                  var3 = var1[var6][var5];
               }
            }

            for (int var9 = 0; var9 < var1[var6].length; var9++) {
               var1[var6][var9] = var1[var6][var9] - var3;
            }
         }

         for (int var7 = 0; var7 < var1[0].length; var7++) {
            double var8 = Double.MAX_VALUE;

            for (int var10 = 0; var10 < var1.length; var10++) {
               if (var8 > var1[var10][var7]) {
                  var8 = var1[var10][var7];
               }
            }

            for (int var11 = 0; var11 < var1.length; var11++) {
               var1[var11][var7] = var1[var11][var7] - var8;
            }
         }

         return var1;
      }

      int buildMaximalMatching() {
         int var1 = 0;

         for (int var2 = 0; var2 < this.columnMatched.length; var2++) {
            if (this.columnMatched[var2] != -1) {
               var1++;
            }
         }

         for (int var7 = 0; var7 < this.excessMatrix[0].length; var7++) {
            if (this.rowMatched[var7] == -1) {
               for (int var3 = 0; var3 < this.excessMatrix.length; var3++) {
                  if (this.excessMatrix[var3][var7] == 0.0 && this.columnMatched[var3] == -1) {
                     var1++;
                     this.columnMatched[var3] = var7;
                     this.rowMatched[var7] = var3;
                     break;
                  }
               }
            }
         }

         if (var1 == this.excessMatrix[0].length) {
            return var1;
         }

         boolean[] var8 = new boolean[this.excessMatrix.length];
         boolean[] var9 = new boolean[this.excessMatrix[0].length];
         int var4 = 0;
         boolean var5 = true;

         while (var5 && var4 < this.excessMatrix.length) {
            Arrays.fill(var8, false);
            Arrays.fill(var9, false);
            var5 = false;

            for (int var6 = 0; var6 < this.excessMatrix.length; var6++) {
               if (this.rowMatched[var6] == -1 && !var9[var6]) {
                  var5 |= new KuhnMunkresMinimalWeightBipartitePerfectMatching.KuhnMunkresMatrixImplementation.MatchExtender(var8, var9).extend(var6);
               }
            }

            var4 = 0;

            for (int var10 = 0; var10 < this.rowMatched.length; var10++) {
               if (this.rowMatched[var10] != -1) {
                  var4++;
               }
            }
         }

         return var4;
      }

      void buildVertexCoverage() {
         Arrays.fill(this.columnsCovered, false);
         Arrays.fill(this.rowsCovered, false);
         boolean[] var1 = new boolean[this.rowsCovered.length];

         for (int var2 = 0; var2 < this.excessMatrix.length; var2++) {
            if (this.columnMatched[var2] != -1) {
               var1[var2] = true;
            } else {
               for (int var3 = 0; var3 < this.excessMatrix[var2].length; var3++) {
                  if (Double.compare(this.excessMatrix[var2][var3], 0.0) == 0) {
                     this.rowsCovered[var2] = var1[var2] = true;
                     break;
                  }
               }
            }
         }

         boolean var5 = true;

         while (var5) {
            for (int var6 = 0; var6 < this.excessMatrix.length; var6++) {
               if (this.rowsCovered[var6]) {
                  for (int var4 = 0; var4 < this.excessMatrix[var6].length; var4++) {
                     if (Double.compare(this.excessMatrix[var6][var4], 0.0) == 0 && !this.columnsCovered[var4]) {
                        this.columnsCovered[var4] = true;
                     }
                  }
               }
            }

            var5 = false;

            for (int var7 = 0; var7 < this.columnsCovered.length; var7++) {
               if (this.columnsCovered[var7] && this.rowMatched[var7] != -1 && !this.rowsCovered[this.rowMatched[var7]]) {
                  var5 = true;
                  this.rowsCovered[this.rowMatched[var7]] = true;
               }
            }
         }

         for (int var8 = 0; var8 < this.rowsCovered.length; var8++) {
            if (var1[var8]) {
               this.rowsCovered[var8] = this.rowsCovered[var8] ^ true;
            }
         }

         assert uncovered(this.excessMatrix, this.rowsCovered, this.columnsCovered) == 0;
         assert minimal(this.rowMatched, this.rowsCovered, this.columnsCovered);
      }

      void extendEqualityGraph() {
         double var1 = Double.MAX_VALUE;

         for (int var3 = 0; var3 < this.excessMatrix.length; var3++) {
            if (!this.rowsCovered[var3]) {
               for (int var4 = 0; var4 < this.excessMatrix[var3].length; var4++) {
                  if (!this.columnsCovered[var4] && var1 > this.excessMatrix[var3][var4]) {
                     var1 = this.excessMatrix[var3][var4];
                  }
               }
            }
         }

         for (int var5 = 0; var5 < this.excessMatrix.length; var5++) {
            if (this.rowsCovered[var5]) {
               for (int var7 = 0; var7 < this.excessMatrix[var5].length; var7++) {
                  this.excessMatrix[var5][var7] = this.excessMatrix[var5][var7] + var1;
               }
            }
         }

         for (int var6 = 0; var6 < this.excessMatrix[0].length; var6++) {
            if (!this.columnsCovered[var6]) {
               for (int var8 = 0; var8 < this.excessMatrix.length; var8++) {
                  this.excessMatrix[var8][var6] = this.excessMatrix[var8][var6] - var1;
               }
            }
         }
      }

      private static boolean minimal(int[] var0, boolean[] var1, boolean[] var2) {
         int var3 = 0;

         for (int var4 = 0; var4 < var0.length; var4++) {
            if (var0[var4] != -1) {
               var3++;
            }
         }

         int var6 = 0;

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var1[var5]) {
               var6++;
            }

            if (var2[var5]) {
               var6++;
            }
         }

         return var3 == var6;
      }

      private static int uncovered(double[][] var0, boolean[] var1, boolean[] var2) {
         int var3 = 0;

         for (int var4 = 0; var4 < var0.length; var4++) {
            if (!var1[var4]) {
               for (int var5 = 0; var5 < var0[var4].length; var5++) {
                  if (!var2[var5] && Double.compare(var0[var4][var5], 0.0) == 0) {
                     var3++;
                  }
               }
            }
         }

         return var3;
      }

      protected class MatchExtender {
         private final boolean[] rowsVisited;
         private final boolean[] colsVisited;

         private MatchExtender(boolean[] var2, boolean[] var3) {
            this.rowsVisited = var2;
            this.colsVisited = var3;
         }

         public boolean extend(int var1) {
            return this.extendMatchingEL(var1);
         }

         private boolean extendMatchingOL(int var1, int var2) {
            if (KuhnMunkresMatrixImplementation.this.columnMatched[var1] == -1) {
               KuhnMunkresMatrixImplementation.this.columnMatched[var1] = var2;
               KuhnMunkresMatrixImplementation.this.rowMatched[var2] = var1;
               return true;
            }

            this.rowsVisited[var1] = true;
            if (this.colsVisited[KuhnMunkresMatrixImplementation.this.columnMatched[var1]]) {
               return false;
            }

            boolean var3 = this.extendMatchingEL(KuhnMunkresMatrixImplementation.this.columnMatched[var1]);
            if (var3) {
               KuhnMunkresMatrixImplementation.this.columnMatched[var1] = var2;
               KuhnMunkresMatrixImplementation.this.rowMatched[var2] = var1;
            }

            return var3;
         }

         private boolean extendMatchingEL(int var1) {
            this.colsVisited[var1] = true;

            for (int var2 = 0; var2 < KuhnMunkresMatrixImplementation.this.excessMatrix.length; var2++) {
               if (KuhnMunkresMatrixImplementation.this.excessMatrix[var2][var1] == 0.0 && !this.rowsVisited[var2]) {
                  boolean var3 = this.extendMatchingOL(var2, var1);
                  if (var3) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }
}
