package org.jgrapht.alg.color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;

public class GreedyColoring<V, E> implements VertexColoringAlgorithm<V> {
   protected static final String SELF_LOOPS_NOT_ALLOWED = "Self-loops not allowed";
   protected final Graph<V, E> graph;

   public GreedyColoring(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
   }

   protected Iterable<V> getVertexOrdering() {
      return this.graph.vertexSet();
   }

   @Override
   public VertexColoringAlgorithm.Coloring<V> getColoring() {
      int var1 = -1;
      HashMap var2 = new HashMap();
      HashSet var3 = new HashSet();

      for (Object var5 : this.getVertexOrdering()) {
         for (Object var7 : this.graph.edgesOf((V)var5)) {
            Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var5);
            if (var5.equals(var8)) {
               throw new IllegalArgumentException("Self-loops not allowed");
            }

            if (var2.containsKey(var8)) {
               var3.add((Integer)var2.get(var8));
            }
         }

         int var9 = 0;

         while (var3.contains(var9)) {
            var9++;
         }

         var3.clear();
         var2.put(var5, var9);
         var1 = Math.max(var1, var9);
      }

      return new VertexColoringAlgorithm.ColoringImpl<>(var2, var1 + 1);
   }
}
