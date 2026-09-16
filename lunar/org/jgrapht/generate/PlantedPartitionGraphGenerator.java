package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class PlantedPartitionGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private static final boolean DEFAULT_ALLOW_SELFLOOPS = false;
   private final int l;
   private final int k;
   private final double p;
   private final double q;
   private final Random rng;
   private final boolean selfLoops;
   private boolean fired;
   private List<Set<V>> communities;

   public PlantedPartitionGraphGenerator(int var1, int var2, double var3, double var5) {
      this(var1, var2, var3, var5, new Random(), false);
   }

   public PlantedPartitionGraphGenerator(int var1, int var2, double var3, double var5, boolean var7) {
      this(var1, var2, var3, var5, new Random(), var7);
   }

   public PlantedPartitionGraphGenerator(int var1, int var2, double var3, double var5, long var7) {
      this(var1, var2, var3, var5, new Random(var7), false);
   }

   public PlantedPartitionGraphGenerator(int var1, int var2, double var3, double var5, long var7, boolean var9) {
      this(var1, var2, var3, var5, new Random(var7), var9);
   }

   public PlantedPartitionGraphGenerator(int var1, int var2, double var3, double var5, Random var7, boolean var8) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of groups must be non-negative");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("number of nodes in each group must be non-negative");
      }

      if (var3 < 0.0 || var3 > 1.0) {
         throw new IllegalArgumentException("invalid probability p");
      }

      if (!(var5 < 0.0) && !(var5 > 1.0)) {
         this.l = var1;
         this.k = var2;
         this.p = var3;
         this.q = var5;
         this.rng = var7;
         this.selfLoops = var8;
         this.fired = false;
      } else {
         throw new IllegalArgumentException("invalid probability q");
      }
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.fired) {
         throw new IllegalStateException("generateGraph() can be only called once");
      }

      this.fired = true;
      this.communities = new ArrayList<>(this.l);

      for (int var3 = 0; var3 < this.l; var3++) {
         this.communities.add(CollectionUtil.newLinkedHashSetWithExpectedSize(this.k));
      }

      if (this.l != 0 && this.k != 0) {
         int var9 = this.k * this.l;
         ArrayList var4 = new ArrayList(var9);

         for (int var5 = 0; var5 < var9; var5++) {
            Object var6 = var1.addVertex();
            var4.add(var6);
            int var7 = var5 / this.k;
            this.communities.get(var7).add((V)var6);
         }

         if (this.selfLoops) {
            if (!var1.getType().isAllowingSelfLoops()) {
               throw new IllegalArgumentException("target graph must allow self-loops");
            }

            for (Object var13 : var4) {
               if (this.rng.nextDouble() < this.p) {
                  var1.addEdge(var13, var13);
               }
            }
         }

         if (var1.getType().isUndirected()) {
            for (int var11 = 0; var11 < var9; var11++) {
               int var14 = var11 / this.k;

               for (int var16 = var11 + 1; var16 < var9; var16++) {
                  int var8 = var16 / this.k;
                  if (var14 == var8) {
                     if (this.rng.nextDouble() < this.p) {
                        var1.addEdge(var4.get(var11), var4.get(var16));
                     }
                  } else if (this.rng.nextDouble() < this.q) {
                     var1.addEdge(var4.get(var11), var4.get(var16));
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < var9; var12++) {
               int var15 = var12 / this.k;

               for (int var17 = var12 + 1; var17 < var9; var17++) {
                  int var18 = var17 / this.k;
                  if (var15 == var18) {
                     if (this.rng.nextDouble() < this.p) {
                        var1.addEdge(var4.get(var12), var4.get(var17));
                     }

                     if (this.rng.nextDouble() < this.p) {
                        var1.addEdge(var4.get(var17), var4.get(var12));
                     }
                  } else {
                     if (this.rng.nextDouble() < this.q) {
                        var1.addEdge(var4.get(var12), var4.get(var17));
                     }

                     if (this.rng.nextDouble() < this.q) {
                        var1.addEdge(var4.get(var17), var4.get(var12));
                     }
                  }
               }
            }
         }
      }
   }

   public List<Set<V>> getCommunities() {
      if (this.communities == null) {
         throw new IllegalStateException("must generate graph before getting community structure");
      } else {
         return this.communities;
      }
   }
}
