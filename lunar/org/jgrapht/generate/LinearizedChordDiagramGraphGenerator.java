package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class LinearizedChordDiagramGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int m;
   private final int n;

   public LinearizedChordDiagramGraphGenerator(int var1, int var2) {
      this(var1, var2, new Random());
   }

   public LinearizedChordDiagramGraphGenerator(int var1, int var2, long var3) {
      this(var1, var2, new Random(var3));
   }

   public LinearizedChordDiagramGraphGenerator(int var1, int var2, Random var3) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("invalid number of nodes: must be positive");
      }

      this.n = var1;
      if (var2 <= 0) {
         throw new IllegalArgumentException("invalid edges per node (" + var2 + " <= 0");
      }

      this.m = var2;
      this.rng = Objects.requireNonNull(var3, "Random number generator cannot be null");
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      ArrayList var3 = new ArrayList(2 * this.n * this.m);

      for (int var4 = 0; var4 < this.n; var4++) {
         Object var5 = var1.addVertex();

         for (int var6 = 0; var6 < this.m; var6++) {
            var3.add(var5);
            Object var7 = var3.get(this.rng.nextInt(var3.size()));
            if (var1.addEdge(var5, var7) == null) {
               throw new IllegalArgumentException("Graph does not permit parallel-edges.");
            }

            var3.add(var7);
         }
      }
   }
}
