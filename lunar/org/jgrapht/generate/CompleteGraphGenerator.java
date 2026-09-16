package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class CompleteGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int size;

   public CompleteGraphGenerator(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("size must be non-negative");
      }

      this.size = var1;
   }

   public CompleteGraphGenerator() {
      this.size = 0;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      GraphTests.requireDirectedOrUndirected(var1);
      boolean var3 = var1.getType().isDirected();

      for (int var4 = 0; var4 < this.size; var4++) {
         var1.addVertex();
      }

      ArrayList var9 = new ArrayList<>(var1.vertexSet());

      for (int var5 = 0; var5 < var9.size(); var5++) {
         for (int var6 = var5 + 1; var6 < var9.size(); var6++) {
            Object var7 = var9.get(var5);
            Object var8 = var9.get(var6);
            var1.addEdge(var7, var8);
            if (var3) {
               var1.addEdge(var8, var7);
            }
         }
      }
   }
}
