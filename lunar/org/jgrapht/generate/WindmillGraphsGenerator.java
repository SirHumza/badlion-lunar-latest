package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import org.jgrapht.Graph;

public class WindmillGraphsGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final WindmillGraphsGenerator.Mode mode;
   private final int m;
   private final int n;

   public WindmillGraphsGenerator(WindmillGraphsGenerator.Mode var1, int var2, int var3) {
      if (var2 < 2) {
         throw new IllegalArgumentException("m must be larger or equal than 2");
      }

      if (var3 < 3) {
         throw new IllegalArgumentException("n must be larger or equal than 3");
      }

      this.mode = var1;
      this.m = var2;
      this.n = var3;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      Object var3 = var1.addVertex();
      ArrayList var4 = new ArrayList(this.n);
      if (this.mode == WindmillGraphsGenerator.Mode.DUTCHWINDMILL) {
         for (int var5 = 0; var5 < this.m; var5++) {
            var4.clear();
            var4.add(var3);

            for (int var6 = 1; var6 < this.n; var6++) {
               var4.add(var1.addVertex());
            }

            for (int var9 = 0; var9 < var4.size(); var9++) {
               var1.addEdge(var4.get(var9), var4.get((var9 + 1) % this.n));
            }
         }
      } else {
         for (int var8 = 0; var8 < this.m; var8++) {
            var4.clear();
            var4.add(var3);

            for (int var10 = 1; var10 < this.n; var10++) {
               var4.add(var1.addVertex());
            }

            for (int var11 = 0; var11 < var4.size() - 1; var11++) {
               for (int var7 = var11 + 1; var7 < var4.size(); var7++) {
                  var1.addEdge(var4.get(var11), var4.get(var7));
               }
            }
         }
      }
   }

   public enum Mode {
      WINDMILL,
      DUTCHWINDMILL;
   }
}
