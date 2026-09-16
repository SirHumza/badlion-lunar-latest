package org.jgrapht.alg.independentset;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.cycle.ChordalityInspector;
import org.jgrapht.alg.interfaces.IndependentSetAlgorithm;

public class ChordalGraphIndependentSetFinder<V, E> implements IndependentSetAlgorithm<V> {
   private final Graph<V, E> graph;
   private final ChordalityInspector<V, E> chordalityInspector;
   private IndependentSetAlgorithm.IndependentSet<V> maximumIndependentSet;

   public ChordalGraphIndependentSetFinder(Graph<V, E> var1) {
      this(var1, ChordalityInspector.IterationOrder.MCS);
   }

   public ChordalGraphIndependentSetFinder(Graph<V, E> var1, ChordalityInspector.IterationOrder var2) {
      this.graph = Objects.requireNonNull(var1);
      this.chordalityInspector = new ChordalityInspector<>(var1, var2);
   }

   private void lazyComputeMaximumIndependentSet() {
      if (this.maximumIndependentSet == null && this.chordalityInspector.isChordal()) {
         HashSet var1 = new HashSet();
         HashSet var2 = new HashSet();
         List var3 = this.chordalityInspector.getPerfectEliminationOrder();
         ListIterator var4 = var3.listIterator(var3.size());

         while (var4.hasPrevious()) {
            Object var5 = var4.previous();
            if (!var1.contains(var5)) {
               var2.add(var5);

               for (Object var7 : this.graph.edgesOf((V)var5)) {
                  Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var5);
                  if (!var5.equals(var8)) {
                     var1.add(var8);
                  }
               }
            }
         }

         this.maximumIndependentSet = new IndependentSetAlgorithm.IndependentSetImpl<>(var2);
      }
   }

   @Override
   public IndependentSetAlgorithm.IndependentSet<V> getIndependentSet() {
      this.lazyComputeMaximumIndependentSet();
      return this.maximumIndependentSet;
   }
}
