package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;

public class GnmRandomGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private static final boolean DEFAULT_ALLOW_LOOPS = false;
   private static final boolean DEFAULT_ALLOW_MULTIPLE_EDGES = false;
   private final Random rng;
   private final int n;
   private final int m;
   private final boolean loops;
   private final boolean multipleEdges;

   public GnmRandomGraphGenerator(int var1, int var2) {
      this(var1, var2, new Random(), false, false);
   }

   public GnmRandomGraphGenerator(int var1, int var2, long var3) {
      this(var1, var2, new Random(var3), false, false);
   }

   public GnmRandomGraphGenerator(int var1, int var2, long var3, boolean var5, boolean var6) {
      this(var1, var2, new Random(var3), var5, var6);
   }

   public GnmRandomGraphGenerator(int var1, int var2, Random var3, boolean var4, boolean var5) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n = var1;
      if (var2 < 0) {
         throw new IllegalArgumentException("number of edges must be non-negative");
      }

      this.m = var2;
      this.rng = Objects.requireNonNull(var3);
      this.loops = var4;
      this.multipleEdges = var5;
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.n != 0) {
         if (this.loops && !var1.getType().isAllowingSelfLoops()) {
            throw new IllegalArgumentException("Provided graph does not support self-loops");
         }

         if (this.multipleEdges && !var1.getType().isAllowingMultipleEdges()) {
            throw new IllegalArgumentException("Provided graph does not support multiple edges between the same vertices");
         }

         if (this.m > computeMaximumAllowedEdges(this.n, var1.getType().isDirected(), this.loops, this.multipleEdges)) {
            throw new IllegalArgumentException(
               "number of edges is not valid for the graph type \n-> invalid number of edges="
                  + this.m
                  + " for: graph type="
                  + var1.getType()
                  + ", number of vertices="
                  + this.n
            );
         }

         ArrayList var3 = new ArrayList(this.n);
         int var4 = var1.vertexSet().size();

         for (int var5 = 0; var5 < this.n; var5++) {
            var3.add(var1.addVertex());
         }

         if (var1.vertexSet().size() != var4 + this.n) {
            throw new IllegalArgumentException("Vertex factory did not produce " + this.n + " distinct vertices.");
         }

         int var13 = 0;

         while (var13 < this.m) {
            int var6 = this.rng.nextInt(this.n);
            int var7 = this.rng.nextInt(this.n);
            Object var8 = null;
            Object var9 = null;
            boolean var10 = false;
            if (var6 == var7) {
               if (this.loops) {
                  var10 = true;
               }
            } else if (this.multipleEdges) {
               var10 = true;
            } else {
               var8 = var3.get(var6);
               var9 = var3.get(var7);
               if (!var1.containsEdge(var8, var9)) {
                  var10 = true;
               }
            }

            if (var10) {
               try {
                  if (var8 == null) {
                     var8 = var3.get(var6);
                     var9 = var3.get(var7);
                  }

                  Object var11 = var1.addEdge(var8, var9);
                  if (var11 != null) {
                     var13++;
                  }
               } catch (IllegalArgumentException var12) {
               }
            }
         }
      }
   }

   static int computeMaximumAllowedEdges(int var0, boolean var1, boolean var2, boolean var3) {
      if (var0 == 0) {
         return 0;
      }

      try {
         int var4;
         if (var1) {
            var4 = Math.multiplyExact(var0, var0 - 1);
         } else if (var0 % 2 == 0) {
            var4 = Math.multiplyExact(var0 / 2, var0 - 1);
         } else {
            var4 = Math.multiplyExact(var0, (var0 - 1) / 2);
         }

         if (var2) {
            if (var3) {
               return Integer.MAX_VALUE;
            }

            if (var1) {
               var4 = Math.addExact(var4, Math.multiplyExact(2, var0));
            } else {
               var4 = Math.addExact(var4, var0);
            }
         } else if (var3 && var0 > 1) {
            return Integer.MAX_VALUE;
         }

         return var4;
      } catch (ArithmeticException var6) {
         return Integer.MAX_VALUE;
      }
   }
}
