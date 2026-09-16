package org.jgrapht.alg.scoring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;

@Deprecated
public final class AlphaCentrality<V, E> implements VertexScoringAlgorithm<V, Double> {
   public static final int MAX_ITERATIONS_DEFAULT = 100;
   public static final double TOLERANCE_DEFAULT = 1.0E-4;
   public static final double DAMPING_FACTOR_DEFAULT = 0.01;
   public static final double EXOGENOUS_FACTOR_DEFAULT = 1.0;
   private final Graph<V, E> g;
   private Map<V, Double> scores;

   public AlphaCentrality(Graph<V, E> var1) {
      this(var1, 0.01, 1.0, 100, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2) {
      this(var1, var2, 1.0, 100, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, double var4) {
      this(var1, var2, var4, 100, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4) {
      this(var1, var2, var4, 100, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, double var4, int var6) {
      this(var1, var2, var4, var6, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4, int var5) {
      this(var1, var2, var4, var5, 1.0E-4);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, double var4, int var6, double var7) {
      this.g = var1;
      this.scores = new HashMap<>();
      this.validate(var2, var6, var7);
      ToDoubleFunction var9 = var2x -> var4;
      this.run(var2, var9, var6, var7);
   }

   public AlphaCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4, int var5, double var6) {
      this.g = var1;
      this.scores = new HashMap<>();
      this.validate(var2, var5, var6);
      this.run(var2, var4, var5, var6);
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

   private void validate(double var1, int var3, double var4) {
      if (var3 <= 0) {
         throw new IllegalArgumentException("Maximum iterations must be positive");
      }

      if (var1 < 0.0 || var1 > 1.0) {
         throw new IllegalArgumentException("Damping factor not valid");
      }

      if (var4 <= 0.0) {
         throw new IllegalArgumentException("Tolerance not valid, must be positive");
      }
   }

   private void run(double var1, ToDoubleFunction<V> var3, int var4, double var5) {
      int var7 = this.g.vertexSet().size();
      double var8 = 1.0 / var7;

      for (Object var11 : this.g.vertexSet()) {
         this.scores.put((V)var11, var8);
      }

      Map var21 = new HashMap();
      double var22 = var5;

      while (var4 > 0 && var22 >= var5) {
         var22 = 0.0;

         for (Object var14 : this.g.vertexSet()) {
            double var15 = 0.0;

            for (Object var18 : this.g.incomingEdgesOf((V)var14)) {
               Object var19 = Graphs.getOppositeVertex(this.g, (E)var18, (V)var14);
               var15 += var1 * this.scores.get(var19) * this.g.getEdgeWeight((E)var18);
            }

            double var24 = this.scores.get(var14);
            double var25 = var15 + var3.applyAsDouble(var14);
            var22 = Math.max(var22, Math.abs(var25 - var24));
            var21.put(var14, var25);
         }

         Map var23 = this.scores;
         this.scores = var21;
         var21 = var23;
         var4--;
      }
   }
}
