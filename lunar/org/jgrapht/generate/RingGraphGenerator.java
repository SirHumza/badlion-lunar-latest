package org.jgrapht.generate;

import java.util.HashMap;
import java.util.Map;
import org.jgrapht.Graph;

public class RingGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int size;

   public RingGraphGenerator(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("must be non-negative");
      }

      this.size = var1;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.size >= 1) {
         HashMap var3 = new HashMap();
         new LinearGraphGenerator<V, E>(this.size).generateGraph(var1, var3);
         Object var4 = var3.get("Start Vertex");
         Object var5 = var3.get("End Vertex");
         var1.addEdge(var5, var4);
      }
   }
}
