package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import org.jgrapht.Graph;

public class GridGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   public static final String CORNER_VERTEX = "Corner Vertex";
   private final int rows;
   private final int cols;

   public GridGraphGenerator(int var1, int var2) {
      if (var1 < 2) {
         throw new IllegalArgumentException("illegal number of rows (" + var1 + "). there must be at least two.");
      }

      if (var2 < 2) {
         throw new IllegalArgumentException("illegal number of columns (" + var2 + "). there must be at least two.");
      }

      this.rows = var1;
      this.cols = var2;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      ArrayList var3 = new ArrayList(this.rows * this.cols);
      int var4 = 0;

      for (int var5 = 0; var5 < this.rows * this.cols; var5++) {
         Object var6 = var1.addVertex();
         var3.add(var6);
         boolean var7 = var5 == 0 || var5 == this.cols - 1 || var5 == this.cols * (this.rows - 1) || var5 == this.rows * this.cols - 1;
         if (var7 && var2 != null) {
            var2.put("Corner Vertex " + ++var4, var6);
         }
      }

      for (int var8 = 1; var8 <= var3.size(); var8++) {
         for (int var9 = 1; var9 <= var3.size(); var9++) {
            if (var8 % this.cols > 0 && var8 + 1 == var9 || var8 + this.cols == var9) {
               var1.addEdge(var3.get(var8 - 1), var3.get(var9 - 1));
               var1.addEdge(var3.get(var9 - 1), var3.get(var8 - 1));
            }
         }
      }
   }
}
