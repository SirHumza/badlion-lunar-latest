package org.jgrapht.alg.tour;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.util.UnionFind;
import org.jgrapht.util.CollectionUtil;

public class GreedyHeuristicTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      int var2 = var1.vertexSet().size();
      if (var2 == 1) {
         return this.getSingletonTour(var1);
      }

      Deque var3 = var1.edgeSet()
         .stream()
         .sorted((var1x, var2x) -> Double.compare(var1.getEdgeWeight(var1x), var1.getEdgeWeight(var2x)))
         .collect(Collectors.toCollection(ArrayDeque::new));
      HashSet var4 = CollectionUtil.newHashSetWithExpectedSize(var2);
      HashMap var5 = CollectionUtil.newHashMapWithExpectedSize(var2);
      UnionFind var6 = new UnionFind(var1.vertexSet());

      while (!var3.isEmpty() && var4.size() < var2) {
         Object var7 = var3.pollFirst();
         Object var8 = var1.getEdgeSource(var7);
         Object var9 = var1.getEdgeTarget(var7);
         if (this.canAddEdge(var5, var6, (V)var8, (V)var9, var4.size() == var2 - 1)) {
            var4.add(var7);
            var5.merge(var8, 1, Integer::sum);
            var5.merge(var9, 1, Integer::sum);
            var6.union(var8, var9);
         }
      }

      return this.edgeSetToTour(var4, var1);
   }

   private boolean canAddEdge(Map<V, Integer> var1, UnionFind<V> var2, V var3, V var4, boolean var5) {
      if (var1.getOrDefault(var3, 0) <= 1 && var1.getOrDefault(var4, 0) <= 1) {
         return var2.inSameSet(var3, var4) ? var5 : !var5;
      } else {
         return false;
      }
   }
}
