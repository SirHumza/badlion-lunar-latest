package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class BarabasiAlbertGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int m0;
   private final int m;
   private final int n;

   public BarabasiAlbertGraphGenerator(int var1, int var2, int var3) {
      this(var1, var2, var3, new Random());
   }

   public BarabasiAlbertGraphGenerator(int var1, int var2, int var3, long var4) {
      this(var1, var2, var3, new Random(var4));
   }

   public BarabasiAlbertGraphGenerator(int var1, int var2, int var3, Random var4) {
      if (var1 < 1) {
         throw new IllegalArgumentException("invalid initial nodes (" + var1 + " < 1)");
      }

      this.m0 = var1;
      if (var2 <= 0) {
         throw new IllegalArgumentException("invalid edges per node (" + var2 + " <= 0");
      }

      if (var2 > var1) {
         throw new IllegalArgumentException("invalid edges per node (" + var2 + " > " + var1 + ")");
      }

      this.m = var2;
      if (var3 < var1) {
         throw new IllegalArgumentException("total number of nodes must be at least equal to the initial set");
      }

      this.n = var3;
      this.rng = Objects.requireNonNull(var4, "Random number generator cannot be null");
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      HashSet var3 = new HashSet<>(var1.vertexSet());
      HashSet var4 = new HashSet();
      new CompleteGraphGenerator(this.m0).generateGraph(var1, var2);
      var1.vertexSet().stream().filter(var1x -> !var3.contains(var1x)).forEach(var4::add);
      ArrayList var5 = new ArrayList(this.n * this.m);
      var5.addAll(var4);

      for (int var6 = 0; var6 < this.m0 - 2; var6++) {
         var5.addAll(var4);
      }

      for (int var11 = this.m0; var11 < this.n; var11++) {
         Object var7 = var1.addVertex();
         ArrayList var8 = new ArrayList();
         int var9 = 0;

         while (var9 < this.m) {
            Object var10 = var5.get(this.rng.nextInt(var5.size()));
            if (!var1.containsEdge(var7, var10)) {
               var1.addEdge(var7, var10);
               var9++;
               var8.add(var7);
               if (var11 > 1) {
                  var8.add(var10);
               }
            }
         }

         var5.addAll(var8);
      }
   }
}
