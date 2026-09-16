package org.jgrapht.alg.cycle;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.CycleBasisAlgorithm;
import org.jgrapht.alg.util.Pair;

public abstract class AbstractFundamentalCycleBasis<V, E> implements CycleBasisAlgorithm<V, E> {
   protected Graph<V, E> graph;

   public AbstractFundamentalCycleBasis(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirectedOrUndirected(var1);
   }

   @Override
   public CycleBasisAlgorithm.CycleBasis<V, E> getCycleBasis() {
      Map var1 = this.computeSpanningForest();
      Set var2 = var1.entrySet().stream().map(Entry::getValue).filter(Objects::nonNull).collect(Collectors.toSet());
      LinkedHashSet var3 = new LinkedHashSet();
      int var4 = 0;
      double var5 = 0.0;

      for (Object var8 : this.graph.edgeSet()) {
         if (!var2.contains(var8)) {
            Pair var9 = this.buildFundamentalCycle((E)var8, var1);
            var3.add((List)var9.getFirst());
            var4 += ((List)var9.getFirst()).size();
            var5 += var9.getSecond();
         }
      }

      return new CycleBasisAlgorithm.CycleBasisImpl<>(this.graph, var3, var4, var5);
   }

   protected abstract Map<V, E> computeSpanningForest();

   private Pair<List<E>, Double> buildFundamentalCycle(E var1, Map<V, E> var2) {
      Object var3 = this.graph.getEdgeSource((E)var1);
      Object var4 = this.graph.getEdgeTarget((E)var1);
      if (var3.equals(var4)) {
         return Pair.of(Collections.singletonList((E)var1), this.graph.getEdgeWeight((E)var1));
      }

      LinkedHashSet var5 = new LinkedHashSet();
      var5.add(var1);
      Object var6 = var3;

      while (!var6.equals(var4)) {
         Object var7 = var2.get(var6);
         if (var7 == null) {
            break;
         }

         Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var6);
         var5.add(var7);
         var6 = var8;
      }

      double var13 = 0.0;
      LinkedList var9 = new LinkedList();
      if (!var6.equals(var4)) {
         var6 = var4;

         while (true) {
            Object var10 = var2.get(var6);
            if (var10 == null) {
               break;
            }

            Object var11 = Graphs.getOppositeVertex(this.graph, (E)var10, (V)var6);
            if (var5.contains(var10)) {
               var5.remove(var10);
            } else {
               var9.add(var10);
               var13 += this.graph.getEdgeWeight((E)var10);
            }

            var6 = var11;
         }
      }

      for (Object var15 : var5) {
         var13 += this.graph.getEdgeWeight((E)var15);
         var9.addFirst(var15);
      }

      return Pair.of(var9, var13);
   }
}
