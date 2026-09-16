package org.jgrapht.generate;

import java.util.Map;
import org.jgrapht.Graph;

public class EmptyGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int size;

   public EmptyGraphGenerator(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("size must be non-negative");
      }

      this.size = var1;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      for (int var3 = 0; var3 < this.size; var3++) {
         var1.addVertex();
      }
   }
}
