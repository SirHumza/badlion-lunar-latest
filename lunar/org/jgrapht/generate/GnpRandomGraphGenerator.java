package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class GnpRandomGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private static final boolean DEFAULT_ALLOW_LOOPS = false;
   private final Random rng;
   private final int n;
   private final double p;
   private final boolean createLoops;

   public GnpRandomGraphGenerator(int var1, double var2) {
      this(var1, var2, new Random(), false);
   }

   public GnpRandomGraphGenerator(int var1, double var2, long var4) {
      this(var1, var2, new Random(var4), false);
   }

   public GnpRandomGraphGenerator(int var1, double var2, long var4, boolean var6) {
      this(var1, var2, new Random(var4), var6);
   }

   public GnpRandomGraphGenerator(int var1, double var2, Random var4, boolean var5) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n = var1;
      if (!(var2 < 0.0) && !(var2 > 1.0)) {
         this.p = var2;
         this.rng = Objects.requireNonNull(var4);
         this.createLoops = var5;
      } else {
         throw new IllegalArgumentException("not valid probability of edge existence");
      }
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.n != 0) {
         if (this.createLoops && !var1.getType().isAllowingSelfLoops()) {
            throw new IllegalArgumentException("Provided graph does not support self-loops");
         }

         int var3 = var1.vertexSet().size();
         ArrayList var4 = new ArrayList(this.n);

         for (int var5 = 0; var5 < this.n; var5++) {
            var4.add(var1.addVertex());
         }

         if (var1.vertexSet().size() != var3 + this.n) {
            throw new IllegalArgumentException("Vertex factory did not produce " + this.n + " distinct vertices.");
         }

         boolean var10 = var1.getType().isDirected();

         for (int var6 = 0; var6 < this.n; var6++) {
            for (int var7 = var6; var7 < this.n; var7++) {
               if (var6 != var7 || this.createLoops) {
                  Object var8 = null;
                  Object var9 = null;
                  if (this.rng.nextDouble() < this.p) {
                     var8 = var4.get(var6);
                     var9 = var4.get(var7);
                     var1.addEdge(var8, var9);
                  }

                  if (var10 && this.rng.nextDouble() < this.p) {
                     if (var8 == null) {
                        var8 = var4.get(var6);
                        var9 = var4.get(var7);
                     }

                     var1.addEdge(var9, var8);
                  }
               }
            }
         }
      }
   }
}
