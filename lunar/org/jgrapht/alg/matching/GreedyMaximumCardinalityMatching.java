package org.jgrapht.alg.matching;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;

public class GreedyMaximumCardinalityMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final boolean sort;

   public GreedyMaximumCardinalityMatching(Graph<V, E> var1, boolean var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.sort = var2;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      HashSet var1 = new HashSet();
      LinkedHashSet var2 = new LinkedHashSet();
      double var3 = 0.0;
      if (this.sort) {
         ArrayList var5 = new ArrayList<>(this.graph.edgeSet());
         var5.sort(new GreedyMaximumCardinalityMatching.EdgeDegreeComparator());

         for (Object var7 : var5) {
            Object var8 = this.graph.getEdgeSource((E)var7);
            Object var9 = this.graph.getEdgeTarget((E)var7);
            if (!var8.equals(var9) && !var1.contains(var8) && !var1.contains(var9)) {
               var2.add(var7);
               var1.add(var8);
               var1.add(var9);
               var3 += this.graph.getEdgeWeight((E)var7);
            }
         }
      } else {
         for (Object var11 : this.graph.vertexSet()) {
            if (!var1.contains(var11)) {
               for (Object var13 : this.graph.edgesOf((V)var11)) {
                  Object var14 = Graphs.getOppositeVertex(this.graph, (E)var13, (V)var11);
                  if (!var11.equals(var14) && !var1.contains(var14)) {
                     var2.add(var13);
                     var1.add(var11);
                     var1.add(var14);
                     var3 += this.graph.getEdgeWeight((E)var13);
                     break;
                  }
               }
            }
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var2, var3);
   }

   private class EdgeDegreeComparator implements Comparator<E> {
      @Override
      public int compare(E var1, E var2) {
         int var3 = GreedyMaximumCardinalityMatching.this.graph.degreeOf(GreedyMaximumCardinalityMatching.this.graph.getEdgeSource((E)var1))
            + GreedyMaximumCardinalityMatching.this.graph.degreeOf(GreedyMaximumCardinalityMatching.this.graph.getEdgeTarget((E)var1));
         int var4 = GreedyMaximumCardinalityMatching.this.graph.degreeOf(GreedyMaximumCardinalityMatching.this.graph.getEdgeSource((E)var2))
            + GreedyMaximumCardinalityMatching.this.graph.degreeOf(GreedyMaximumCardinalityMatching.this.graph.getEdgeTarget((E)var2));
         return Integer.compare(var3, var4);
      }
   }
}
