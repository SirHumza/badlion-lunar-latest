package org.jgrapht.alg.cycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.util.CollectionUtil;

public class ChordalGraphMinimalVertexSeparatorFinder<V, E> {
   private final Graph<V, E> graph;
   private final ChordalityInspector<V, E> chordalityInspector;
   private Map<Set<V>, Integer> minimalSeparatorsWithMultiplicities;

   public ChordalGraphMinimalVertexSeparatorFinder(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
      this.chordalityInspector = new ChordalityInspector<>(var1, ChordalityInspector.IterationOrder.MCS);
   }

   public Set<Set<V>> getMinimalSeparators() {
      this.lazyComputeMinimalSeparatorsWithMultiplicities();
      return this.minimalSeparatorsWithMultiplicities == null ? null : this.minimalSeparatorsWithMultiplicities.keySet();
   }

   public Map<Set<V>, Integer> getMinimalSeparatorsWithMultiplicities() {
      this.lazyComputeMinimalSeparatorsWithMultiplicities();
      return this.minimalSeparatorsWithMultiplicities;
   }

   private void lazyComputeMinimalSeparatorsWithMultiplicities() {
      if (this.minimalSeparatorsWithMultiplicities == null && this.chordalityInspector.isChordal()) {
         this.minimalSeparatorsWithMultiplicities = new HashMap<>();
         List var1 = this.chordalityInspector.getPerfectEliminationOrder();
         Map var2 = this.getVertexInOrder(var1);
         Set var4 = new HashSet();

         for (int var5 = 1; var5 < var1.size(); var5++) {
            Set var3 = var4;
            var4 = this.getPredecessors(var2, (V)var1.get(var5));
            if (var4.size() <= var3.size()) {
               if (this.minimalSeparatorsWithMultiplicities.containsKey(var4)) {
                  this.minimalSeparatorsWithMultiplicities.put(var4, this.minimalSeparatorsWithMultiplicities.get(var4) + 1);
               } else {
                  this.minimalSeparatorsWithMultiplicities.put(var4, 1);
               }
            }
         }
      }
   }

   private Map<V, Integer> getVertexInOrder(List<V> var1) {
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(var1.size());
      int var3 = 0;

      for (Object var5 : var1) {
         var2.put(var5, var3++);
      }

      return var2;
   }

   private Set<V> getPredecessors(Map<V, Integer> var1, V var2) {
      HashSet var3 = new HashSet();
      Integer var4 = (Integer)var1.get(var2);

      for (Object var7 : this.graph.edgesOf((V)var2)) {
         Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var2);
         Integer var9 = (Integer)var1.get(var8);
         if (var9 < var4) {
            var3.add(var8);
         }
      }

      return var3;
   }
}
