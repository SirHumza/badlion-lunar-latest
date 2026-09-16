package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.connectivity.GabowStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.MinimumCycleMeanAlgorithm;
import org.jgrapht.alg.interfaces.StrongConnectivityAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.util.CollectionUtil;

public class HowardMinimumMeanCycle<V, E> implements MinimumCycleMeanAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final StrongConnectivityAlgorithm<V, E> strongConnectivityAlgorithm;
   private final int maximumIterations;
   private final Comparator<Double> comparator;
   private boolean isCurrentCycleFound;
   private double currentCycleWeight;
   private int currentCycleLength;
   private V currentCycleVertex;
   private Map<V, E> policyGraph;
   private Map<V, Boolean> reachedVertices;
   private Map<V, Integer> vertexLevel;
   private Map<V, Double> vertexDistance;

   public HowardMinimumMeanCycle(Graph<V, E> var1) {
      this(var1, Integer.MAX_VALUE);
   }

   public HowardMinimumMeanCycle(Graph<V, E> var1, int var2) {
      this(var1, var2, new GabowStrongConnectivityInspector<>(var1), 1.0E-9);
   }

   public HowardMinimumMeanCycle(Graph<V, E> var1, int var2, StrongConnectivityAlgorithm<V, E> var3, double var4) {
      this.graph = Objects.requireNonNull(var1, "graph should not be null!");
      this.strongConnectivityAlgorithm = Objects.requireNonNull(var3, "strongConnectivityAlgorithm should not be null!");
      if (var2 < 0) {
         throw new IllegalArgumentException("maximumIterations should be non-negative");
      }

      this.maximumIterations = var2;
      this.comparator = new ToleranceDoubleComparator(var4);
      this.policyGraph = (Map<V, E>)CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());
      this.reachedVertices = CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());
      this.vertexLevel = CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());
      this.vertexDistance = CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());
   }

   @Override
   public double getCycleMean() {
      GraphPath var1 = this.getCycle();
      return var1 == null ? Double.POSITIVE_INFINITY : var1.getWeight() / var1.getLength();
   }

   @Override
   public GraphPath<V, E> getCycle() {
      boolean var1 = false;
      double var2 = 0.0;
      int var4 = 1;
      Object var5 = null;
      int var6 = 0;

      for (Graph var8 : this.strongConnectivityAlgorithm.getStronglyConnectedComponents()) {
         boolean var9 = var8.vertexSet().size() == 0;
         var9 |= var8.vertexSet().size() == 1 && var8.incomingEdgesOf(var8.vertexSet().iterator().next()).size() == 0;
         if (!var9) {
            this.constructPolicyGraph(var8);

            for (boolean var10 = true; var6 < this.maximumIterations && var10; var6++) {
               this.constructCycle(var8);
               var10 = this.computeVertexDistance(var8);
            }

            if (this.isCurrentCycleFound && (!var1 || this.currentCycleWeight * var4 < var2 * this.currentCycleLength)) {
               var1 = true;
               var2 = this.currentCycleWeight;
               var4 = this.currentCycleLength;
               var5 = this.currentCycleVertex;
            }

            if (var6 == this.maximumIterations) {
               break;
            }
         }
      }

      return var1 ? this.buildPath((V)var5, var4, var2) : null;
   }

   private void constructPolicyGraph(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         this.vertexDistance.put((V)var3, Double.POSITIVE_INFINITY);
      }

      for (Object var10 : var1.vertexSet()) {
         for (Object var5 : var1.incomingEdgesOf(var10)) {
            Object var6 = Graphs.getOppositeVertex(var1, var5, var10);
            double var7 = var1.getEdgeWeight(var5);
            if (var7 < this.vertexDistance.get(var6)) {
               this.vertexDistance.put((V)var6, var7);
               this.policyGraph.put((V)var6, (E)var5);
            }
         }
      }
   }

   private void constructCycle(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         this.vertexLevel.put((V)var3, -1);
      }

      this.isCurrentCycleFound = false;
      int var9 = 0;

      for (Object var7 : var1.vertexSet()) {
         if (this.vertexLevel.get(var7) < 0) {
            while (this.vertexLevel.get(var7) < 0) {
               this.vertexLevel.put((V)var7, var9);
               var7 = Graphs.getOppositeVertex(var1, this.policyGraph.get(var7), var7);
            }

            if (this.vertexLevel.get(var7) == var9) {
               double var10 = var1.getEdgeWeight(this.policyGraph.get(var7));
               int var5 = 1;

               for (Object var8 = Graphs.getOppositeVertex(var1, this.policyGraph.get(var7), var7);
                  !var8.equals(var7);
                  var8 = Graphs.getOppositeVertex(var1, this.policyGraph.get(var8), var8)
               ) {
                  var10 += var1.getEdgeWeight(this.policyGraph.get(var8));
                  var5++;
               }

               if (!this.isCurrentCycleFound || var10 * this.currentCycleLength < this.currentCycleWeight * var5) {
                  this.isCurrentCycleFound = true;
                  this.currentCycleWeight = var10;
                  this.currentCycleLength = var5;
                  this.currentCycleVertex = (V)var7;
               }
            }

            var9++;
         }
      }
   }

   private boolean computeVertexDistance(Graph<V, E> var1) {
      ArrayDeque var2 = new ArrayDeque();

      for (Object var4 : var1.vertexSet()) {
         this.reachedVertices.put((V)var4, false);
      }

      var2.addLast(this.currentCycleVertex);
      this.reachedVertices.put(this.currentCycleVertex, true);
      double var15 = this.currentCycleWeight / this.currentCycleLength;

      while (!var2.isEmpty()) {
         Object var5 = var2.removeFirst();

         for (Object var7 : var1.incomingEdgesOf(var5)) {
            Object var8 = Graphs.getOppositeVertex(var1, var7, var5);
            if (this.policyGraph.get(var8).equals(var7) && !this.reachedVertices.get(var8)) {
               this.reachedVertices.put((V)var8, true);
               double var9 = this.vertexDistance.get(var5) + var1.getEdgeWeight(var7) - var15;
               this.vertexDistance.put((V)var8, var9);
               var2.addLast(var8);
            }
         }
      }

      boolean var16 = false;

      for (Object var18 : var1.vertexSet()) {
         for (Object var20 : var1.incomingEdgesOf(var18)) {
            Object var10 = Graphs.getOppositeVertex(var1, var20, var18);
            double var11 = this.vertexDistance.get(var10);
            double var13 = this.vertexDistance.get(var18) + var1.getEdgeWeight(var20) - var15;
            if (var11 > var13) {
               if (this.comparator.compare(var11, var13) > 0) {
                  var16 = true;
               }

               this.vertexDistance.put((V)var10, var13);
               this.policyGraph.put((V)var10, (E)var20);
            }
         }
      }

      return var16;
   }

   private GraphPath<V, E> buildPath(V var1, int var2, double var3) {
      ArrayList var5 = new ArrayList(var2);
      ArrayList var6 = new ArrayList(var2 + 1);
      Object var7 = var1;
      var6.add(var1);

      do {
         Object var8 = this.policyGraph.get(var7);
         var7 = Graphs.getOppositeVertex(this.graph, (E)var8, (V)var7);
         var5.add(var8);
         var6.add(var7);
      } while (!var7.equals(var1));

      return new GraphWalk<>(this.graph, (V)var1, (V)var1, var6, var5, var3);
   }
}
