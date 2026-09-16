package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.HamiltonianCycleAlgorithm;
import org.jgrapht.alg.interfaces.HamiltonianCycleImprovementAlgorithm;
import org.jgrapht.util.ArrayUtil;
import org.jgrapht.util.VertexToIntegerMapping;

public class TwoOptHeuristicTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> implements HamiltonianCycleImprovementAlgorithm<V, E> {
   private final int passes;
   private final HamiltonianCycleAlgorithm<V, E> initializer;
   private final double minCostImprovement;
   private Graph<V, E> graph;
   private int n;
   private double[][] dist;
   private Map<V, Integer> index;
   private List<V> revIndex;

   public TwoOptHeuristicTSP() {
      this(1, new Random());
   }

   public TwoOptHeuristicTSP(int var1) {
      this(var1, new Random());
   }

   public TwoOptHeuristicTSP(int var1, long var2) {
      this(var1, new Random(var2));
   }

   public TwoOptHeuristicTSP(int var1, Random var2) {
      this(var1, new RandomTourTSP<>(var2));
   }

   public TwoOptHeuristicTSP(int var1, Random var2, double var3) {
      this(var1, new RandomTourTSP<>(var2), var3);
   }

   public TwoOptHeuristicTSP(HamiltonianCycleAlgorithm<V, E> var1) {
      this(1, var1);
   }

   public TwoOptHeuristicTSP(int var1, HamiltonianCycleAlgorithm<V, E> var2) {
      this(var1, var2, 1.0E-8);
   }

   public TwoOptHeuristicTSP(int var1, HamiltonianCycleAlgorithm<V, E> var2, double var3) {
      if (var1 < 1) {
         throw new IllegalArgumentException("passes must be at least one");
      }

      this.passes = var1;
      this.initializer = Objects.requireNonNull(var2, "Initial solver algorithm cannot be null");
      this.minCostImprovement = Math.abs(var3);
   }

   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      if (var1.vertexSet().size() == 1) {
         return this.getSingletonTour(var1);
      }

      this.init(var1);
      GraphPath var2 = this.tourToPath(this.improve(this.createInitialTour()));

      for (int var3 = 1; var3 < this.passes; var3++) {
         GraphPath var4 = this.tourToPath(this.improve(this.createInitialTour()));
         if (var4.getWeight() < var2.getWeight()) {
            var2 = var4;
         }
      }

      return var2;
   }

   @Override
   public GraphPath<V, E> improveTour(GraphPath<V, E> var1) {
      this.init(var1.getGraph());
      return this.tourToPath(this.improve(this.pathToTour(var1)));
   }

   private void init(Graph<V, E> var1) {
      this.graph = var1;
      this.n = var1.vertexSet().size();
      this.dist = new double[this.n][this.n];
      VertexToIntegerMapping var2 = new VertexToIntegerMapping<>(var1.vertexSet());
      this.index = var2.getVertexMap();
      this.revIndex = var2.getIndexList();

      for (Object var4 : var1.edgeSet()) {
         Object var5 = var1.getEdgeSource(var4);
         int var6 = this.index.get(var5);
         Object var7 = var1.getEdgeTarget(var4);
         int var8 = this.index.get(var7);
         double var9 = var1.getEdgeWeight(var4);
         this.dist[var6][var8] = var9;
         this.dist[var8][var6] = var9;
      }
   }

   private int[] createInitialTour() {
      return this.pathToTour(this.initializer.getTour(this.graph));
   }

   private int[] improve(int[] var1) {
      while (true) {
         double var2 = -this.minCostImprovement;
         int var4 = -1;
         int var5 = -1;

         for (int var6 = 0; var6 < this.n - 2; var6++) {
            for (int var7 = var6 + 2; var7 < this.n; var7++) {
               int var8 = var1[var6];
               int var9 = var1[var6 + 1];
               int var10 = var1[var7];
               int var11 = var1[var7 + 1];
               double var12 = this.dist[var8][var10] + this.dist[var9][var11] - this.dist[var8][var9] - this.dist[var10][var11];
               if (var12 < var2) {
                  var2 = var12;
                  var4 = var6;
                  var5 = var7;
               }
            }
         }

         if (var4 == -1 || var5 == -1) {
            return var1;
         }

         ArrayUtil.reverse(var1, var4 + 1, var5);
      }
   }

   private GraphPath<V, E> tourToPath(int[] var1) {
      ArrayList var2 = new ArrayList(this.n + 1);

      for (int var6 : var1) {
         Object var7 = this.revIndex.get(var6);
         var2.add(var7);
      }

      return this.closedVertexListToTour(var2, this.graph);
   }

   private int[] pathToTour(GraphPath<V, E> var1) {
      boolean[] var2 = new boolean[this.n];
      List var3 = var1.getVertexList();
      if (var3.size() != this.n + 1) {
         throw new IllegalArgumentException("Not a valid tour");
      }

      int[] var4 = new int[this.n + 1];

      for (int var5 = 0; var5 < this.n; var5++) {
         int var6 = this.index.get(var3.get(var5));
         if (var2[var6]) {
            throw new IllegalArgumentException("Not a valid tour");
         }

         var2[var6] = true;
         var4[var5] = var6;
      }

      var4[this.n] = var4[0];
      return var4;
   }
}
