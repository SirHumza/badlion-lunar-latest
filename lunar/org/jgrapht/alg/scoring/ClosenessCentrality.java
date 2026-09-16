package org.jgrapht.alg.scoring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;
import org.jgrapht.alg.shortestpath.BaseShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.shortestpath.FloydWarshallShortestPaths;
import org.jgrapht.graph.EdgeReversedGraph;

public class ClosenessCentrality<V, E> implements VertexScoringAlgorithm<V, Double> {
   protected final Graph<V, E> graph;
   protected final boolean incoming;
   protected final boolean normalize;
   protected Map<V, Double> scores;

   public ClosenessCentrality(Graph<V, E> var1) {
      this(var1, false, true);
   }

   public ClosenessCentrality(Graph<V, E> var1, boolean var2, boolean var3) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      this.incoming = var2;
      this.normalize = var3;
      this.scores = null;
   }

   @Override
   public Map<V, Double> getScores() {
      if (this.scores == null) {
         this.compute();
      }

      return Collections.unmodifiableMap(this.scores);
   }

   public Double getVertexScore(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      }

      if (this.scores == null) {
         this.compute();
      }

      return this.scores.get(var1);
   }

   protected ShortestPathAlgorithm<V, E> getShortestPathAlgorithm() {
      Graph var1;
      if (this.incoming && this.graph.getType().isDirected()) {
         var1 = new EdgeReversedGraph<>(this.graph);
      } else {
         var1 = this.graph;
      }

      boolean var2 = true;

      for (Object var4 : var1.edgeSet()) {
         double var5 = var1.getEdgeWeight(var4);
         if (var5 < 0.0) {
            var2 = false;
            break;
         }
      }

      BaseShortestPathAlgorithm var7;
      if (var2) {
         var7 = new DijkstraShortestPath(var1);
      } else {
         var7 = new FloydWarshallShortestPaths(var1);
      }

      return var7;
   }

   protected void compute() {
      this.scores = new HashMap<>();
      ShortestPathAlgorithm var1 = this.getShortestPathAlgorithm();
      int var2 = this.graph.vertexSet().size();

      for (Object var4 : this.graph.vertexSet()) {
         double var5 = 0.0;
         ShortestPathAlgorithm.SingleSourcePaths var7 = var1.getPaths(var4);

         for (Object var9 : this.graph.vertexSet()) {
            if (!var9.equals(var4)) {
               var5 += var7.getWeight(var9);
            }
         }

         if (this.normalize) {
            this.scores.put((V)var4, (var2 - 1) / var5);
         } else {
            this.scores.put((V)var4, 1.0 / var5);
         }
      }
   }
}
