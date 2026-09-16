package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.util.AliasMethodSampler;

public class KleinbergSmallWorldGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int n;
   private final int p;
   private final int q;
   private final int r;

   public KleinbergSmallWorldGraphGenerator(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, new Random());
   }

   public KleinbergSmallWorldGraphGenerator(int var1, int var2, int var3, int var4, long var5) {
      this(var1, var2, var3, var4, new Random(var5));
   }

   public KleinbergSmallWorldGraphGenerator(int var1, int var2, int var3, int var4, Random var5) {
      if (var1 < 1) {
         throw new IllegalArgumentException("parameter n must be positive");
      }

      this.n = var1;
      if (var2 < 1) {
         throw new IllegalArgumentException("parameter p must be positive");
      }

      if (var2 > 2 * var1 - 2) {
         throw new IllegalArgumentException("lattice distance too large");
      }

      this.p = var2;
      if (var3 < 0) {
         throw new IllegalArgumentException("parameter q must be non-negative");
      }

      this.q = var3;
      if (var4 < 0) {
         throw new IllegalArgumentException("parameter r must be non-negative");
      }

      this.r = var4;
      this.rng = Objects.requireNonNull(var5, "Random number generator cannot be null");
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.n != 0) {
         if (this.n == 1) {
            var1.addVertex();
         } else {
            GraphTests.requireDirectedOrUndirected(var1);
            boolean var3 = var1.getType().isDirected();
            ArrayList var4 = new ArrayList(this.n * this.n);

            for (int var5 = 0; var5 < this.n * this.n; var5++) {
               var4.add(var1.addVertex());
            }

            for (int var15 = 0; var15 < this.n; var15++) {
               for (int var6 = 0; var6 < this.n; var6++) {
                  int var7 = var15 * this.n + var6;
                  Object var8 = var4.get(var7);

                  for (int var9 = -this.p; var9 <= this.p; var9++) {
                     for (int var10 = -this.p; var10 <= this.p; var10++) {
                        int var11 = (var15 + var9) * this.n + var6 + var10;
                        if (var11 >= 0
                           && var11 != var7
                           && var11 < this.n * this.n
                           && Math.abs(var9) + Math.abs(var10) <= this.p
                           && (var3 || var11 > var15 * this.n + var6)) {
                           var1.addEdge(var8, var4.get(var11));
                        }
                     }
                  }
               }
            }

            double[] var16 = new double[this.n * this.n];

            for (int var17 = 0; var17 < this.n; var17++) {
               for (int var18 = 0; var18 < this.n; var18++) {
                  Object var19 = var4.get(var17 * this.n + var18);
                  double var20 = 0.0;

                  for (int var21 = 0; var21 < this.n; var21++) {
                     for (int var12 = 0; var12 < this.n; var12++) {
                        if (var21 != var17 || var12 != var18) {
                           double var13 = Math.pow(Math.abs(var17 - var21) + Math.abs(var18 - var12), -this.r);
                           var16[var21 * this.n + var12] = var13;
                           var20 += var13;
                        }
                     }
                  }

                  var16[var17 * this.n + var18] = 0.0;

                  for (int var22 = 0; var22 < this.n * this.n; var22++) {
                     var16[var22] /= var20;
                  }

                  AliasMethodSampler var23 = new AliasMethodSampler(var16, this.rng);

                  for (int var24 = 0; var24 < this.q; var24++) {
                     Object var25 = var4.get(var23.next());
                     if (!var25.equals(var19) && !var1.containsEdge(var19, var25)) {
                        var1.addEdge(var19, var25);
                     }
                  }
               }
            }
         }
      }
   }
}
