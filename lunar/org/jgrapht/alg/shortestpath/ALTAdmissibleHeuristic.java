package org.jgrapht.alg.shortestpath;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.AStarAdmissibleHeuristic;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.graph.EdgeReversedGraph;

public class ALTAdmissibleHeuristic<V, E> implements AStarAdmissibleHeuristic<V> {
   private final Graph<V, E> graph;
   private final Comparator<Double> comparator;
   private final Map<V, Map<V, Double>> fromLandmark;
   private final Map<V, Map<V, Double>> toLandmark;
   private final boolean directed;

   public ALTAdmissibleHeuristic(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      Objects.requireNonNull(var2, "Landmarks cannot be null");
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("At least one landmark must be provided");
      }

      this.fromLandmark = new HashMap<>();
      if (var1.getType().isDirected()) {
         this.directed = true;
         this.toLandmark = new HashMap<>();
      } else {
         if (!var1.getType().isUndirected()) {
            throw new IllegalArgumentException("Graph must be directed or undirected");
         }

         this.directed = false;
         this.toLandmark = this.fromLandmark;
      }

      this.comparator = new ToleranceDoubleComparator();

      for (Object var4 : var2) {
         for (Object var6 : var1.edgesOf(var4)) {
            if (this.comparator.compare(var1.getEdgeWeight(var6), 0.0) < 0) {
               throw new IllegalArgumentException("Graph edge weights cannot be negative");
            }
         }

         this.precomputeToFromLandmark((V)var4);
      }
   }

   @Override
   public double getCostEstimate(V var1, V var2) {
      double var3 = 0.0;
      if (var1.equals(var2)) {
         return var3;
      }

      if (this.fromLandmark.containsKey(var1)) {
         return this.fromLandmark.get(var1).get(var2);
      }

      if (this.toLandmark.containsKey(var2)) {
         return this.toLandmark.get(var2).get(var1);
      }

      for (Object var6 : this.fromLandmark.keySet()) {
         Map var9 = this.fromLandmark.get(var6);
         double var7;
         if (this.directed) {
            Map var10 = this.toLandmark.get(var6);
            var7 = Math.max((Double)var10.get(var1) - (Double)var10.get(var2), (Double)var9.get(var2) - (Double)var9.get(var1));
         } else {
            var7 = Math.abs((Double)var9.get(var1) - (Double)var9.get(var2));
         }

         if (Double.isFinite(var7)) {
            var3 = Math.max(var3, var7);
         }
      }

      return var3;
   }

   private void precomputeToFromLandmark(V var1) {
      ShortestPathAlgorithm.SingleSourcePaths var2 = new DijkstraShortestPath<>(this.graph).getPaths((V)var1);
      HashMap var3 = new HashMap();

      for (Object var5 : this.graph.vertexSet()) {
         var3.put(var5, var2.getWeight(var5));
      }

      this.fromLandmark.put((V)var1, var3);
      if (this.directed) {
         EdgeReversedGraph var9 = new EdgeReversedGraph<>(this.graph);
         ShortestPathAlgorithm.SingleSourcePaths var10 = new DijkstraShortestPath<>(var9).getPaths((V)var1);
         HashMap var6 = new HashMap();

         for (Object var8 : this.graph.vertexSet()) {
            var6.put(var8, var10.getWeight(var8));
         }

         this.toLandmark.put((V)var1, var6);
      }
   }

   @Override
   public <ET> boolean isConsistent(Graph<V, ET> var1) {
      return true;
   }
}
