package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class BarabasiAlbertForestGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int t;
   private final int n;

   public BarabasiAlbertForestGenerator(int var1, int var2) {
      this(var1, var2, new Random());
   }

   public BarabasiAlbertForestGenerator(int var1, int var2, long var3) {
      this(var1, var2, new Random(var3));
   }

   public BarabasiAlbertForestGenerator(int var1, int var2, Random var3) {
      if (var1 < 1) {
         throw new IllegalArgumentException("invalid number of trees (" + var1 + " < 1)");
      }

      this.t = var1;
      if (var2 < var1) {
         throw new IllegalArgumentException("total number of nodes must be at least equal to the number of trees");
      }

      this.n = var2;
      this.rng = Objects.requireNonNull(var3, "Random number generator cannot be null");
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      GraphTests.requireUndirected(var1);
      if (!var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("target graph is not empty");
      }

      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < this.t; var4++) {
         var3.add(var1.addVertex());
      }

      for (int var7 = this.t; var7 < this.n; var7++) {
         Object var5 = var1.addVertex();
         Object var6 = var3.get(this.rng.nextInt(var3.size()));
         assert !var1.containsEdge(var5, var6);
         var1.addEdge(var5, var6);
         var3.add(var5);
         if (var7 > 1) {
            var3.add(var6);
         }
      }
   }
}
