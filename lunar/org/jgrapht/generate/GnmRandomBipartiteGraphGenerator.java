package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;

public class GnmRandomBipartiteGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int n1;
   private final int n2;
   private final int m;
   private List<V> partitionA;
   private List<V> partitionB;

   public GnmRandomBipartiteGraphGenerator(int var1, int var2, int var3) {
      this(var1, var2, var3, new Random());
   }

   public GnmRandomBipartiteGraphGenerator(int var1, int var2, int var3, long var4) {
      this(var1, var2, var3, new Random(var4));
   }

   public GnmRandomBipartiteGraphGenerator(int var1, int var2, int var3, Random var4) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n1 = var1;
      if (var2 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n2 = var2;
      if (var3 < 0) {
         throw new IllegalArgumentException("number of edges must be non-negative");
      }

      this.m = var3;
      this.rng = Objects.requireNonNull(var4);
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      if (this.n1 + this.n2 != 0) {
         int var3 = var1.vertexSet().size();
         this.partitionA = new ArrayList(this.n1);

         for (int var4 = 0; var4 < this.n1; var4++) {
            this.partitionA.add((V)var1.addVertex());
         }

         this.partitionB = new ArrayList(this.n2);

         for (int var12 = 0; var12 < this.n2; var12++) {
            this.partitionB.add((V)var1.addVertex());
         }

         if (var1.vertexSet().size() != var3 + this.n1 + this.n2) {
            throw new IllegalArgumentException("Vertex factory did not produce " + (this.n1 + this.n2) + " distinct vertices.");
         }

         boolean var13 = var1.getType().isDirected();

         int var5;
         try {
            if (var13) {
               var5 = Math.multiplyExact(2, Math.multiplyExact(this.n1, this.n2));
            } else {
               var5 = Math.multiplyExact(this.n1, this.n2);
            }
         } catch (ArithmeticException var11) {
            var5 = Integer.MAX_VALUE;
         }

         if (this.m > var5) {
            throw new IllegalArgumentException("number of edges not valid for bipartite graph with " + this.n1 + " and " + this.n2 + " vertices");
         }

         int var6 = 0;

         while (var6 < this.m) {
            Object var7 = this.partitionA.get(this.rng.nextInt(this.n1));
            Object var8 = this.partitionB.get(this.rng.nextInt(this.n2));
            if (var13 && this.rng.nextBoolean()) {
               Object var9 = var7;
               var7 = var8;
               var8 = var9;
            }

            if (!var1.containsEdge(var7, var8)) {
               try {
                  Object var14 = var1.addEdge(var7, var8);
                  if (var14 != null) {
                     var6++;
                  }
               } catch (IllegalArgumentException var10) {
               }
            }
         }
      }
   }

   public Set<V> getFirstPartition() {
      return this.partitionA.size() <= this.partitionB.size() ? new LinkedHashSet<>(this.partitionA) : new LinkedHashSet<>(this.partitionB);
   }

   public Set<V> getSecondPartition() {
      return this.partitionB.size() >= this.partitionA.size() ? new LinkedHashSet<>(this.partitionB) : new LinkedHashSet<>(this.partitionA);
   }
}
