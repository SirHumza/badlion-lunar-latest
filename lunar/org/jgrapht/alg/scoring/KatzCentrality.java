package org.jgrapht.alg.scoring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;

public final class KatzCentrality<V, E> implements VertexScoringAlgorithm<V, Double> {
   public static final int MAX_ITERATIONS_DEFAULT = 100;
   public static final double TOLERANCE_DEFAULT = 1.0E-4;
   public static final double DAMPING_FACTOR_DEFAULT = 0.01;
   private final Graph<V, E> g;
   private Map<V, Double> scores;

   public static final <V> ToDoubleFunction<V> exogenousFactorDefaultFunction() {
      return var0 -> 1.0;
   }

   public KatzCentrality(Graph<V, E> var1) {
      this(var1, 0.01, exogenousFactorDefaultFunction(), 100, 1.0E-4);
   }

   public KatzCentrality(Graph<V, E> var1, double var2) {
      this(var1, var2, exogenousFactorDefaultFunction(), 100, 1.0E-4);
   }

   public KatzCentrality(Graph<V, E> var1, double var2, int var4) {
      this(var1, var2, exogenousFactorDefaultFunction(), var4, 1.0E-4);
   }

   public KatzCentrality(Graph<V, E> var1, double var2, int var4, double var5) {
      this(var1, var2, exogenousFactorDefaultFunction(), var4, var5);
   }

   public KatzCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4) {
      this(var1, var2, var4, 100, 1.0E-4);
   }

   public KatzCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4, int var5) {
      this(var1, var2, var4, var5, 1.0E-4);
   }

   public KatzCentrality(Graph<V, E> var1, double var2, ToDoubleFunction<V> var4, int var5, double var6) {
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

      if (var1 < 0.0) {
         throw new IllegalArgumentException("Damping factor not valid");
      }

      if (var4 <= 0.0) {
         throw new IllegalArgumentException("Tolerance not valid, must be positive");
      }
   }

   private void run(double var1, ToDoubleFunction<V> var3, int var4, double var5) {
      for (Object var8 : this.g.vertexSet()) {
         this.scores.put((V)var8, var3.applyAsDouble(var8));
      }

      Map var18 = new HashMap();
      double var19 = var5;

      while (var4 > 0 && var19 >= var5) {
         var19 = 0.0;

         for (Object var11 : this.g.vertexSet()) {
            double var12 = 0.0;

            for (Object var15 : this.g.incomingEdgesOf((V)var11)) {
               Object var16 = Graphs.getOppositeVertex(this.g, (E)var15, (V)var11);
               var12 += var1 * this.scores.get(var16) * this.g.getEdgeWeight((E)var15);
            }

            double var21 = this.scores.get(var11);
            double var22 = var12 + var3.applyAsDouble(var11);
            var19 = Math.max(var19, Math.abs(var22 - var21));
            var18.put(var11, var22);
         }

         Map var20 = this.scores;
         this.scores = var18;
         var18 = var20;
         var4--;
      }
   }
}
