package org.jgrapht.generate;

import java.util.Map;
import org.jgrapht.Graph;

public interface GraphGenerator<V, E, T> {
   void generateGraph(Graph<V, E> var1, Map<String, T> var2);

   default void generateGraph(Graph<V, E> var1) {
      this.generateGraph(var1, null);
   }
}
