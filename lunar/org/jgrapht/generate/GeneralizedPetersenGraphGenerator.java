package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jgrapht.Graph;

public class GeneralizedPetersenGraphGenerator<V, E> implements GraphGenerator<V, E, List<V>> {
   private final int n;
   private final int k;
   public final String STAR = "star";
   public final String REGULAR = "regular";

   public GeneralizedPetersenGraphGenerator(int var1, int var2) {
      if (var1 < 3) {
         throw new IllegalArgumentException("n must be larger or equal than 3");
      }

      if (var2 >= 1 && !(var2 > Math.floor((var1 - 1) / 2.0))) {
         this.n = var1;
         this.k = var2;
      } else {
         throw new IllegalArgumentException("k must be in the range [1, floor((n-1)/2.0)]");
      }
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, List<V>> var2) {
      ArrayList var3 = new ArrayList(this.n);
      ArrayList var4 = new ArrayList(this.n);

      for (int var5 = 0; var5 < this.n; var5++) {
         var3.add(var1.addVertex());
         var4.add(var1.addVertex());
      }

      for (int var6 = 0; var6 < this.n; var6++) {
         var1.addEdge(var3.get(var6), var3.get((var6 + 1) % this.n));
         var1.addEdge(var3.get(var6), var4.get(var6));
         var1.addEdge(var4.get(var6), var4.get((var6 + this.k) % this.n));
      }

      if (var2 != null) {
         var2.put("regular", var3);
         var2.put("star", var4);
      }
   }
}
