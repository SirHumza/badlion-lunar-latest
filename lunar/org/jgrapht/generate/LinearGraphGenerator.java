package org.jgrapht.generate;

import java.util.Map;
import org.jgrapht.Graph;

public class LinearGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   public static final String START_VERTEX = "Start Vertex";
   public static final String END_VERTEX = "End Vertex";
   private int size;

   public LinearGraphGenerator(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("must be non-negative");
      }

      this.size = var1;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      Object var3 = null;

      for (int var4 = 0; var4 < this.size; var4++) {
         Object var5 = var1.addVertex();
         if (var3 == null) {
            if (var2 != null) {
               var2.put("Start Vertex", var5);
            }
         } else {
            var1.addEdge(var3, var5);
         }

         var3 = var5;
      }

      if (var2 != null && var3 != null) {
         var2.put("End Vertex", var3);
      }
   }
}
