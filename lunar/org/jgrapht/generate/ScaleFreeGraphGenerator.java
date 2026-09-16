package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class ScaleFreeGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int size;
   private final Random rng;

   public ScaleFreeGraphGenerator(int var1) {
      this(var1, new Random());
   }

   public ScaleFreeGraphGenerator(int var1, long var2) {
      this(var1, new Random(var2));
   }

   public ScaleFreeGraphGenerator(int var1, Random var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("invalid size: " + var1 + " (must be non-negative)");
      }

      this.size = var1;
      this.rng = Objects.requireNonNull(var2, "Random number generator cannot be null");
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      byte var5 = 0;

      for (int var6 = 0; var6 < this.size; var6++) {
         Object var7 = var1.addVertex();
         int var8 = 0;

         while (var8 == 0 && var6 != 0) {
            for (int var9 = 0; var9 < var3.size(); var9++) {
               if (var5 == 0 || this.rng.nextInt(var5) < (Integer)var4.get(var9)) {
                  var4.set(var9, (Integer)var4.get(var9) + 1);
                  var8++;
                  var5 += 2;
                  if (this.rng.nextBoolean()) {
                     var1.addEdge(var3.get(var9), var7);
                  } else {
                     var1.addEdge(var7, var3.get(var9));
                  }
               }
            }
         }

         var3.add(var7);
         var4.add(var8);
      }
   }
}
