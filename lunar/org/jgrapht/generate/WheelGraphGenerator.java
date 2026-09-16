package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.graph.GraphDelegator;

public class WheelGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   public static final String HUB_VERTEX = "Hub Vertex";
   private boolean inwardSpokes;
   private int size;

   public WheelGraphGenerator(int var1) {
      this(var1, true);
   }

   public WheelGraphGenerator(int var1, boolean var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("must be non-negative");
      }

      this.size = var1;
      this.inwardSpokes = var2;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.size >= 1) {
         ArrayList var3 = new ArrayList();
         Supplier var4 = var1.getVertexSupplier();
         Supplier var5 = () -> {
            Object var2x = var4.get();
            var3.add(var2x);
            return var2x;
         };
         GraphDelegator var6 = new GraphDelegator(var1, var5, null);
         new RingGraphGenerator<V, E>(this.size - 1).generateGraph(var6, var2);
         Object var7 = var1.addVertex();
         if (var2 != null) {
            var2.put("Hub Vertex", var7);
         }

         for (Object var9 : var3) {
            if (this.inwardSpokes) {
               var1.addEdge(var9, var7);
            } else {
               var1.addEdge(var7, var9);
            }
         }
      }
   }
}
