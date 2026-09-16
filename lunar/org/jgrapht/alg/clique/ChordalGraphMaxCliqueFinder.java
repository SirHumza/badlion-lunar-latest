package org.jgrapht.alg.clique;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.color.ChordalGraphColoring;
import org.jgrapht.alg.cycle.ChordalityInspector;
import org.jgrapht.alg.interfaces.CliqueAlgorithm;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.util.CollectionUtil;

public class ChordalGraphMaxCliqueFinder<V, E> implements CliqueAlgorithm<V> {
   private final Graph<V, E> graph;
   private final ChordalityInspector.IterationOrder iterationOrder;
   private CliqueAlgorithm.Clique<V> maximumClique;
   private boolean isChordal = true;

   public ChordalGraphMaxCliqueFinder(Graph<V, E> var1) {
      this(var1, ChordalityInspector.IterationOrder.MCS);
   }

   public ChordalGraphMaxCliqueFinder(Graph<V, E> var1, ChordalityInspector.IterationOrder var2) {
      this.graph = Objects.requireNonNull(var1);
      this.iterationOrder = Objects.requireNonNull(var2);
   }

   private void lazyComputeMaximumClique() {
      if (this.maximumClique == null && this.isChordal) {
         ChordalGraphColoring var1 = new ChordalGraphColoring<>(this.graph, this.iterationOrder);
         VertexColoringAlgorithm.Coloring var2 = var1.getColoring();
         List var3 = var1.getPerfectEliminationOrder();
         if (var2 == null) {
            this.isChordal = false;
            return;
         }

         Map var4 = this.getVertexInOrder(var3);
         Entry var5 = var2.getColors().entrySet().stream().max(Comparator.comparing(Entry::getValue)).orElse(null);
         if (var5 == null) {
            this.maximumClique = new CliqueAlgorithm.CliqueImpl<>(Collections.emptySet());
         } else {
            Set var6 = this.getPredecessors(var4, (V)var5.getKey());
            var6.add(var5.getKey());
            this.maximumClique = new CliqueAlgorithm.CliqueImpl<>(var6);
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

   @Override
   public CliqueAlgorithm.Clique<V> getClique() {
      this.lazyComputeMaximumClique();
      return this.maximumClique;
   }
}
