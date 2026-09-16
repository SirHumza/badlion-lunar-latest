package org.jgrapht.alg.scoring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphIterables;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;

public final class EigenvectorCentrality<V, E> implements VertexScoringAlgorithm<V, Double> {
   public static final int MAX_ITERATIONS_DEFAULT = 100;
   public static final double TOLERANCE_DEFAULT = 1.0E-4;
   private final Graph<V, E> g;
   private Map<V, Double> scores;

   public EigenvectorCentrality(Graph<V, E> var1) {
      this(var1, 100, 1.0E-4);
   }

   public EigenvectorCentrality(Graph<V, E> var1, int var2) {
      this(var1, var2, 1.0E-4);
   }

   public EigenvectorCentrality(Graph<V, E> var1, int var2, double var3) {
      this.g = var1;
      this.scores = new HashMap<>();
      this.validate(var2, var3);
      this.run(var2, var3);
   }

   @Override
   public Map<V, Double> getScores() {
      return Collections.unmodifiableMap(this.scores);
   }

   public Double getVertexScore(V var1) {
      if (!this.g.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      } else {
         return this.scores.get(var1);
      }
   }

   private void validate(int var1, double var2) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("Maximum iterations must be positive");
      }

      if (var2 <= 0.0) {
         throw new IllegalArgumentException("Tolerance not valid, must be positive");
      }
   }

   private void run(int var1, double var2) {
      int var4 = this.g.vertexSet().size();
      GraphIterables var5 = this.g.iterables();
      double var6 = Math.sqrt(1.0 / var4);

      for (Object var9 : var5.vertices()) {
         this.scores.put((V)var9, var6);
      }

      Map var23 = new HashMap();
      double var24 = var2;

      while (var1 > 0 && var24 >= var2) {
         double var11 = 0.0;

         for (Object var14 : var5.vertices()) {
            double var15 = 0.0;

            for (Object var18 : var5.incomingEdgesOf(var14)) {
               Object var19 = Graphs.getOppositeVertex(this.g, (E)var18, (V)var14);
               var15 += this.scores.get(var19) * this.g.getEdgeWeight((E)var18);
            }

            var11 += var15 * var15;
            var23.put(var14, var15);
         }

         double var25 = 1.0 / Math.sqrt(var11);
         double var26 = 0.0;

         for (Object var29 : var5.vertices()) {
            double var30 = (Double)var23.get(var29) * var25;
            var23.put(var29, var30);
            double var21 = this.scores.get(var29) - var30;
            var26 += var21 * var21;
         }

         Map var28 = this.scores;
         this.scores = var23;
         var23 = var28;
         var24 = Math.sqrt(var26);
         var1--;
      }
   }
}
