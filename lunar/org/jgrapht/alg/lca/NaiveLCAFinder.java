package org.jgrapht.alg.lca;

import java.util.HashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.LowestCommonAncestorAlgorithm;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;

public class NaiveLCAFinder<V, E> implements LowestCommonAncestorAlgorithm<V> {
   private final Graph<V, E> graph;

   public NaiveLCAFinder(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1);
   }

   @Override
   public V getLCA(V var1, V var2) {
      this.checkNodes((V)var1, (V)var2);
      Set var3 = this.getLCASet((V)var1, (V)var2);
      return (V)(var3.isEmpty() ? null : var3.iterator().next());
   }

   @Override
   public Set<V> getLCASet(V var1, V var2) {
      this.checkNodes((V)var1, (V)var2);
      EdgeReversedGraph var3 = new EdgeReversedGraph<>(this.graph);
      Set var4 = this.getAncestors(var3, (V)var1);
      Set var5 = this.getAncestors(var3, (V)var2);
      Set var6;
      if (var4.size() < var5.size()) {
         var4.retainAll(var5);
         var6 = var4;
      } else {
         var5.retainAll(var4);
         var6 = var5;
      }

      HashSet var7 = new HashSet();

      for (Object var9 : var6) {
         boolean var10 = true;

         for (Object var12 : this.graph.outgoingEdgesOf((V)var9)) {
            Object var13 = this.graph.getEdgeTarget((E)var12);
            if (var6.contains(var13)) {
               var10 = false;
               break;
            }
         }

         if (var10) {
            var7.add(var9);
         }
      }

      return var7;
   }

   private Set<V> getAncestors(Graph<V, E> var1, V var2) {
      HashSet var3 = new HashSet();
      BreadthFirstIterator var4 = new BreadthFirstIterator<>(var1, var2);

      while (var4.hasNext()) {
         var3.add(var4.next());
      }

      return var3;
   }

   private void checkNodes(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("invalid vertex: " + var1);
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("invalid vertex: " + var2);
      }
   }
}
