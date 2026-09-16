package org.jgrapht.generate;

import java.util.Map;
import org.jgrapht.Graph;

public class StarGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   public static final String CENTER_VERTEX = "Center Vertex";
   private final int order;

   public StarGraphGenerator(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Order must be non-negative");
      }

      this.order = var1;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.order >= 1) {
         Object var3 = var1.addVertex();
         if (var2 != null) {
            var2.put("Center Vertex", var3);
         }

         for (int var4 = 0; var4 < this.order - 1; var4++) {
            var1.addEdge(var1.addVertex(), var3);
         }
      }
   }
}
