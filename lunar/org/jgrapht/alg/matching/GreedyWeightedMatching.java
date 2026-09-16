package org.jgrapht.alg.matching;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public class GreedyWeightedMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final Comparator<Double> comparator;
   private final boolean normalizeEdgeCosts;

   public GreedyWeightedMatching(Graph<V, E> var1, boolean var2) {
      this(var1, var2, 1.0E-9);
   }

   public GreedyWeightedMatching(Graph<V, E> var1, boolean var2, double var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("Input graph cannot be null");
      }

      this.graph = var1;
      this.comparator = new ToleranceDoubleComparator(var3);
      this.normalizeEdgeCosts = var2;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      ArrayList var1 = new ArrayList<>(this.graph.edgeSet());
      if (this.normalizeEdgeCosts) {
         var1.sort((var1x, var2x) -> {
            double var3 = this.graph.degreeOf(this.graph.getEdgeSource((E)var1x)) + this.graph.degreeOf(this.graph.getEdgeTarget((E)var1x));
            double var5x = this.graph.degreeOf(this.graph.getEdgeSource((E)var2x)) + this.graph.degreeOf(this.graph.getEdgeTarget((E)var2x));
            return this.comparator.compare(this.graph.getEdgeWeight((E)var2x) / var5x, this.graph.getEdgeWeight((E)var1x) / var3);
         });
      } else {
         var1.sort((var1x, var2x) -> this.comparator.compare(this.graph.getEdgeWeight((E)var2x), this.graph.getEdgeWeight((E)var1x)));
      }

      double var2 = 0.0;
      HashSet var4 = new HashSet();
      HashSet var5 = new HashSet();

      for (Object var7 : var1) {
         double var8 = this.graph.getEdgeWeight((E)var7);
         Object var10 = this.graph.getEdgeSource((E)var7);
         Object var11 = this.graph.getEdgeTarget((E)var7);
         if (!var10.equals(var11) && this.comparator.compare(var8, 0.0) > 0 && !var5.contains(var10) && !var5.contains(var11)) {
            var4.add(var7);
            var5.add(var10);
            var5.add(var11);
            var2 += var8;
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var4, var2);
   }
}
