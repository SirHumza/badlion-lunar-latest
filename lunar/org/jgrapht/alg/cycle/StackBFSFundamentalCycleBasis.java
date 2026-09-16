package org.jgrapht.alg.cycle;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class StackBFSFundamentalCycleBasis<V, E> extends AbstractFundamentalCycleBasis<V, E> {
   public StackBFSFundamentalCycleBasis(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   protected Map<V, E> computeSpanningForest() {
      HashMap var1 = new HashMap();
      ArrayDeque var2 = new ArrayDeque();

      for (Object var4 : this.graph.vertexSet()) {
         if (!var1.containsKey(var4)) {
            var1.put(var4, null);
            var2.push(var4);

            while (!var2.isEmpty()) {
               Object var5 = var2.pop();

               for (Object var7 : this.graph.edgesOf((V)var5)) {
                  Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var5);
                  if (!var1.containsKey(var8)) {
                     var1.put(var8, var7);
                     var2.push(var8);
                  }
               }
            }
         }
      }

      return var1;
   }
}
