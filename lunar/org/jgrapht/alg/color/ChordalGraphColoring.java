package org.jgrapht.alg.color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.cycle.ChordalityInspector;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.util.CollectionUtil;

public class ChordalGraphColoring<V, E> implements VertexColoringAlgorithm<V> {
   private final Graph<V, E> graph;
   private final ChordalityInspector<V, E> chordalityInspector;
   private VertexColoringAlgorithm.Coloring<V> coloring;

   public ChordalGraphColoring(Graph<V, E> var1) {
      this(var1, ChordalityInspector.IterationOrder.MCS);
   }

   public ChordalGraphColoring(Graph<V, E> var1, ChordalityInspector.IterationOrder var2) {
      this.graph = Objects.requireNonNull(var1);
      this.chordalityInspector = new ChordalityInspector<>(var1, var2);
   }

   private void lazyComputeColoring() {
      if (this.coloring == null && this.chordalityInspector.isChordal()) {
         List var1 = this.chordalityInspector.getPerfectEliminationOrder();
         HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(var1.size());
         Map var3 = this.getVertexInOrder(var1);

         for (Object var5 : var1) {
            Set var6 = this.getPredecessors(var3, (V)var5);
            HashSet var7 = CollectionUtil.newHashSetWithExpectedSize(var6.size());
            var6.forEach(var2x -> var7.add((E)((Integer)var2.get(var2x))));
            int var8 = 0;

            while (var7.contains(var8)) {
               var8++;
            }

            var2.put(var5, var8);
         }

         int var9 = (int)var2.values().stream().distinct().count();
         this.coloring = new VertexColoringAlgorithm.ColoringImpl<>(var2, var9);
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

   @Override
   public VertexColoringAlgorithm.Coloring<V> getColoring() {
      this.lazyComputeColoring();
      return this.coloring;
   }

   public List<V> getPerfectEliminationOrder() {
      return this.chordalityInspector.getPerfectEliminationOrder();
   }
}
