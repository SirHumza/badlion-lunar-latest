package org.jgrapht.alg.scoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;

public final class PageRank<V, E> implements VertexScoringAlgorithm<V, Double> {
   public static final int MAX_ITERATIONS_DEFAULT = 100;
   public static final double TOLERANCE_DEFAULT = 1.0E-4;
   public static final double DAMPING_FACTOR_DEFAULT = 0.85;
   private final Graph<V, E> graph;
   private final double dampingFactor;
   private final int maxIterations;
   private final double tolerance;
   private Map<V, Double> scores;

   public PageRank(Graph<V, E> var1) {
      this(var1, 0.85, 100, 1.0E-4);
   }

   public PageRank(Graph<V, E> var1, double var2) {
      this(var1, var2, 100, 1.0E-4);
   }

   public PageRank(Graph<V, E> var1, double var2, int var4) {
      this(var1, var2, var4, 1.0E-4);
   }

   public PageRank(Graph<V, E> var1, double var2, int var4, double var5) {
      this.graph = var1;
      if (var4 <= 0) {
         throw new IllegalArgumentException("Maximum iterations must be positive");
      }

      this.maxIterations = var4;
      if (!(var2 < 0.0) && !(var2 > 1.0)) {
         this.dampingFactor = var2;
         if (var5 <= 0.0) {
            throw new IllegalArgumentException("Tolerance not valid, must be positive");
         }

         this.tolerance = var5;
      } else {
         throw new IllegalArgumentException("Damping factor not valid");
      }
   }

   @Override
   public Map<V, Double> getScores() {
      if (this.scores == null) {
         this.scores = Collections.unmodifiableMap(new PageRank.Algorithm().getScores());
      }

      return this.scores;
   }

   public Double getVertexScore(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      } else {
         return this.getScores().get(var1);
      }
   }

   private class Algorithm {
      private int totalVertices = PageRank.this.graph.vertexSet().size();
      private boolean isWeighted = PageRank.this.graph.getType().isWeighted();
      private Map<V, Integer> vertexIndexMap;
      private V[] vertexMap;
      private double[] weightSum;
      private double[] curScore = new double[this.totalVertices];
      private double[] nextScore = new double[this.totalVertices];
      private int[] outDegree;
      private ArrayList<int[]> adjList;
      private ArrayList<double[]> weightsList;

      public Algorithm() {
         this.vertexIndexMap = new HashMap<>();
         this.vertexMap = (V[])(new Object[this.totalVertices]);
         this.outDegree = new int[this.totalVertices];
         this.adjList = new ArrayList<>(this.totalVertices);
         double var2 = 1.0 / this.totalVertices;
         int var4 = 0;

         for (Object var6 : PageRank.this.graph.vertexSet()) {
            this.vertexIndexMap.put((V)var6, var4);
            this.vertexMap[var4] = (V)var6;
            this.outDegree[var4] = PageRank.this.graph.outDegreeOf((V)var6);
            this.curScore[var4] = var2;
            var4++;
         }

         if (this.isWeighted) {
            this.weightSum = new double[this.totalVertices];
            this.weightsList = new ArrayList<>(this.totalVertices);

            for (int var15 = 0; var15 < this.totalVertices; var15++) {
               Object var17 = this.vertexMap[var15];
               int[] var19 = new int[PageRank.this.graph.inDegreeOf((V)var17)];
               double[] var7 = new double[PageRank.this.graph.inDegreeOf((V)var17)];
               int var8 = 0;

               for (Object var10 : PageRank.this.graph.incomingEdgesOf((V)var17)) {
                  Object var11 = Graphs.getOppositeVertex(PageRank.this.graph, (E)var10, (V)var17);
                  Integer var12 = this.vertexIndexMap.get(var11);
                  var19[var8] = var12;
                  double var13 = PageRank.this.graph.getEdgeWeight((E)var10);
                  var7[var8] += var13;
                  this.weightSum[var12] += var13;
                  var8++;
               }

               this.weightsList.add(var7);
               this.adjList.add(var19);
            }
         } else {
            for (int var16 = 0; var16 < this.totalVertices; var16++) {
               Object var18 = this.vertexMap[var16];
               int[] var20 = new int[PageRank.this.graph.inDegreeOf((V)var18)];
               int var21 = 0;

               for (Object var23 : PageRank.this.graph.incomingEdgesOf((V)var18)) {
                  Object var24 = Graphs.getOppositeVertex(PageRank.this.graph, (E)var23, (V)var18);
                  var20[var21++] = this.vertexIndexMap.get(var24);
               }

               this.adjList.add(var20);
            }
         }
      }

      public Map<V, Double> getScores() {
         if (this.isWeighted) {
            this.runWeighted();
         } else {
            this.run();
         }

         HashMap var1 = new HashMap();

         for (int var2 = 0; var2 < this.totalVertices; var2++) {
            Object var3 = this.vertexMap[var2];
            var1.put(var3, this.curScore[var2]);
         }

         return var1;
      }

      private void run() {
         double var1 = PageRank.this.tolerance;

         for (int var3 = PageRank.this.maxIterations; var3 > 0 && var1 >= PageRank.this.tolerance; var3--) {
            double var4 = this.teleProp();
            var1 = 0.0;

            for (int var6 = 0; var6 < this.totalVertices; var6++) {
               double var7 = 0.0;

               for (int var12 : this.adjList.get(var6)) {
                  var7 += PageRank.this.dampingFactor * this.curScore[var12] / this.outDegree[var12];
               }

               double var13 = this.curScore[var6];
               double var14 = var4 + var7;
               var1 = Math.max(var1, Math.abs(var14 - var13));
               this.nextScore[var6] = var14;
            }

            this.swapScores();
         }
      }

      private void runWeighted() {
         double var1 = PageRank.this.tolerance;

         for (int var3 = PageRank.this.maxIterations; var3 > 0 && var1 >= PageRank.this.tolerance; var3--) {
            double var4 = this.teleProp();
            var1 = 0.0;

            for (int var6 = 0; var6 < this.totalVertices; var6++) {
               double var7 = 0.0;
               int[] var9 = this.adjList.get(var6);
               double[] var10 = this.weightsList.get(var6);
               int var11 = 0;

               for (int var12 = var9.length; var11 < var12; var11++) {
                  int var13 = var9[var11];
                  var7 += PageRank.this.dampingFactor * this.curScore[var13] * var10[var11] / this.weightSum[var13];
               }

               double var15 = this.curScore[var6];
               double var16 = var4 + var7;
               var1 = Math.max(var1, Math.abs(var16 - var15));
               this.nextScore[var6] = var16;
            }

            this.swapScores();
         }
      }

      private double teleProp() {
         double var1 = 0.0;

         for (int var3 = 0; var3 < this.totalVertices; var3++) {
            if (this.outDegree[var3] > 0) {
               var1 += (1.0 - PageRank.this.dampingFactor) * this.curScore[var3];
            } else {
               var1 += this.curScore[var3];
            }
         }

         return var1 / this.totalVertices;
      }

      private void swapScores() {
         double[] var1 = this.curScore;
         this.curScore = this.nextScore;
         this.nextScore = var1;
      }
   }
}
