package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.util.CollectionUtil;

public class TreeMeasurer<V, E> {
   private final Graph<V, E> graph;

   public TreeMeasurer(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   private V computeFarthestVertex(BreadthFirstIterator<V, E> var1) {
      Object var2 = null;
      int var3 = Integer.MIN_VALUE;

      while (var1.hasNext()) {
         Object var4 = var1.next();
         int var5 = var1.getDepth(var4);
         if (var3 < var5) {
            var2 = var4;
            var3 = var5;
         }
      }

      return (V)var2;
   }

   public Set<V> getGraphCenter() {
      GraphTests.requireUndirected(this.graph);
      if (this.graph.vertexSet().isEmpty()) {
         return new LinkedHashSet();
      }

      Object var1 = this.graph.vertexSet().iterator().next();
      Object var2 = this.computeFarthestVertex(new BreadthFirstIterator<>(this.graph, (V)var1));
      BreadthFirstIterator var3 = new BreadthFirstIterator<>(this.graph, (V)var2);
      Object var4 = this.computeFarthestVertex(var3);
      ArrayList var5 = new ArrayList();

      do {
         var5.add(var4);
         var4 = var3.getParent(var4);
      } while (var4 != null);

      Set var6;
      if (var5.size() % 2 == 1) {
         var6 = Collections.singleton(var5.get(var5.size() / 2));
      } else {
         var6 = CollectionUtil.newLinkedHashSetWithExpectedSize(2);
         var6.add(var5.get(var5.size() / 2));
         var6.add(var5.get(var5.size() / 2 - 1));
      }

      return var6;
   }
}
