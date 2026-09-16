package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class WattsStrogatzGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private static final boolean DEFAULT_ADD_INSTEAD_OF_REWIRE = false;
   private final Random rng;
   private final int n;
   private final int k;
   private final double p;
   private final boolean addInsteadOfRewire;

   public WattsStrogatzGraphGenerator(int var1, int var2, double var3) {
      this(var1, var2, var3, false, new Random());
   }

   public WattsStrogatzGraphGenerator(int var1, int var2, double var3, long var5) {
      this(var1, var2, var3, false, new Random(var5));
   }

   public WattsStrogatzGraphGenerator(int var1, int var2, double var3, boolean var5, Random var6) {
      if (var1 < 3) {
         throw new IllegalArgumentException("number of vertices must be at least 3");
      }

      this.n = var1;
      if (var2 < 1) {
         throw new IllegalArgumentException("number of k-nearest neighbors must be positive");
      }

      if (var2 % 2 == 1) {
         throw new IllegalArgumentException("number of k-nearest neighbors must be even");
      }

      if (var2 > var1 - 2 + var1 % 2) {
         throw new IllegalArgumentException("invalid k-nearest neighbors");
      }

      this.k = var2;
      if (!(var3 < 0.0) && !(var3 > 1.0)) {
         this.p = var3;
         this.rng = Objects.requireNonNull(var6, "Random number generator cannot be null");
         this.addInsteadOfRewire = var5;
      } else {
         throw new IllegalArgumentException("invalid probability");
      }
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.n != 0) {
         if (this.n == 1) {
            var1.addVertex();
         } else {
            ArrayList var3 = new ArrayList(this.n);
            LinkedHashMap var4 = CollectionUtil.newLinkedHashMapWithExpectedSize(this.n);

            for (int var5 = 0; var5 < this.n; var5++) {
               Object var6 = var1.addVertex();
               var3.add(var6);
               var4.put(var6, new ArrayList(this.k));
            }

            for (int var10 = 0; var10 < this.n; var10++) {
               Object var12 = var3.get(var10);
               List var7 = (List)var4.get(var12);

               for (int var8 = 1; var8 <= this.k / 2; var8++) {
                  var7.add(var1.addEdge(var12, var3.get((var10 + var8) % this.n)));
               }
            }

            for (int var11 = 0; var11 < this.k / 2; var11++) {
               for (int var13 = 0; var13 < this.n; var13++) {
                  if (this.rng.nextDouble() < this.p) {
                     Object var14 = var3.get(var13);
                     Object var15 = ((List)var4.get(var14)).get(var11);
                     Object var9 = var3.get(this.rng.nextInt(this.n));
                     if (!var9.equals(var14) && !var1.containsEdge(var14, var9)) {
                        if (!this.addInsteadOfRewire) {
                           var1.removeEdge(var15);
                        }

                        var1.addEdge(var14, var9);
                     }
                  }
               }
            }
         }
      }
   }
}
