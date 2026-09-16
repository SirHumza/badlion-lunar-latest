package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;

public class ComplementGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Graph<V, E> graph;
   private final boolean generateSelfLoops;

   public ComplementGraphGenerator(Graph<V, E> var1) {
      this(var1, false);
   }

   public ComplementGraphGenerator(Graph<V, E> var1, boolean var2) {
      this.graph = GraphTests.requireDirectedOrUndirected(var1);
      this.generateSelfLoops = var2;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      Graphs.addAllVertices(var1, this.graph.vertexSet());
      if (this.graph.getType().isDirected()) {
         for (Object var4 : this.graph.vertexSet()) {
            for (Object var6 : this.graph.vertexSet()) {
               if (var4 != var6 && !this.graph.containsEdge((V)var4, (V)var6)) {
                  var1.addEdge(var4, var6);
               }
            }
         }
      } else {
         ArrayList var8 = new ArrayList<>(this.graph.vertexSet());

         for (int var10 = 0; var10 < var8.size() - 1; var10++) {
            for (int var12 = var10 + 1; var12 < var8.size(); var12++) {
               Object var13 = var8.get(var10);
               Object var7 = var8.get(var12);
               if (!this.graph.containsEdge((V)var13, (V)var7)) {
                  var1.addEdge(var13, var7);
               }
            }
         }
      }

      if (this.generateSelfLoops && var1.getType().isAllowingSelfLoops()) {
         for (Object var11 : this.graph.vertexSet()) {
            if (!this.graph.containsEdge((V)var11, (V)var11)) {
               var1.addEdge(var11, var11);
            }
         }
      }
   }
}
