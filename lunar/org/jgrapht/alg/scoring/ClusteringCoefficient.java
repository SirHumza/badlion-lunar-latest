package org.jgrapht.alg.scoring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphMetrics;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;
import org.jgrapht.alg.util.NeighborCache;

public class ClusteringCoefficient<V, E> implements VertexScoringAlgorithm<V, Double> {
   private final Graph<V, E> graph;
   private Map<V, Double> scores;
   private boolean fullyComputedMap = false;
   private boolean computed = false;
   private double globalClusteringCoefficient;
   private boolean computedAverage = false;
   private double averageClusteringCoefficient;

   public ClusteringCoefficient(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
      this.scores = new HashMap<>();
   }

   public double getGlobalClusteringCoefficient() {
      if (!this.computed) {
         this.computeGlobalClusteringCoefficient();
      }

      return this.globalClusteringCoefficient;
   }

   public double getAverageClusteringCoefficient() {
      if (this.graph.vertexSet().isEmpty()) {
         return 0.0;
      }

      if (!this.computedAverage) {
         this.computeFullScoreMap();
         this.computedAverage = true;
         this.averageClusteringCoefficient = 0.0;

         for (double var2 : this.scores.values()) {
            this.averageClusteringCoefficient += var2;
         }

         this.averageClusteringCoefficient = this.averageClusteringCoefficient / this.graph.vertexSet().size();
      }

      return this.averageClusteringCoefficient;
   }

   private void computeGlobalClusteringCoefficient() {
      NeighborCache var1 = new NeighborCache<>(this.graph);
      this.computed = true;
      double var2 = 0.0;

      for (Object var5 : this.graph.vertexSet()) {
         if (this.graph.getType().isUndirected()) {
            var2 += 1.0 * this.graph.degreeOf((V)var5) * (this.graph.degreeOf((V)var5) - 1) / 2.0;
         } else {
            var2 += 1.0 * var1.predecessorsOf(var5).size() * var1.successorsOf(var5).size();
         }
      }

      this.globalClusteringCoefficient = 3L * GraphMetrics.getNumberOfTriangles(this.graph) / var2;
   }

   private double computeLocalClusteringCoefficient(V var1) {
      if (this.scores.containsKey(var1)) {
         return this.scores.get(var1);
      }

      NeighborCache var2 = new NeighborCache<>(this.graph);
      Set var3 = var2.neighborsOf(var1);
      double var4 = var3.size();
      double var6 = 0.0;

      for (Object var9 : var3) {
         for (Object var11 : var3) {
            if (this.graph.containsEdge((V)var9, (V)var11)) {
               var6++;
            }
         }
      }

      return var4 <= 1.0 ? 0.0 : var6 / (var4 * (var4 - 1.0));
   }

   private void computeFullScoreMap() {
      if (!this.fullyComputedMap) {
         this.fullyComputedMap = true;

         for (Object var2 : this.graph.vertexSet()) {
            if (!this.scores.containsKey(var2)) {
               this.scores.put((V)var2, this.computeLocalClusteringCoefficient((V)var2));
            }
         }
      }
   }

   @Override
   public Map<V, Double> getScores() {
      this.computeFullScoreMap();
      return Collections.unmodifiableMap(this.scores);
   }

   public Double getVertexScore(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      } else {
         return this.computeLocalClusteringCoefficient((V)var1);
      }
   }
}
