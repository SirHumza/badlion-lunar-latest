package org.jgrapht.generate;

import java.util.LinkedList;
import java.util.Map;
import org.jgrapht.Graph;

public class HyperCubeGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private int dim;

   public HyperCubeGraphGenerator(int var1) {
      this.dim = var1;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      int var3 = (int)Math.pow(2.0, this.dim);
      LinkedList var4 = new LinkedList();

      for (int var5 = 0; var5 < var3; var5++) {
         Object var6 = var1.addVertex();
         var4.add(var6);
         if (var2 != null) {
            StringBuilder var7 = new StringBuilder(Integer.toBinaryString(var5));

            while (var7.length() < this.dim) {
               var7.insert(0, "0");
            }

            var2.put(var7.toString(), var6);
         }
      }

      for (int var8 = 0; var8 < var3; var8++) {
         for (int var9 = var8 + 1; var9 < var3; var9++) {
            for (int var10 = 0; var10 < this.dim; var10++) {
               if ((var9 ^ var8) == 1 << var10) {
                  var1.addEdge(var4.get(var8), var4.get(var9));
                  break;
               }
            }
         }
      }
   }
}
