package org.jgrapht.generate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;

public class GnpRandomBipartiteGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final Random rng;
   private final int n1;
   private final int n2;
   private final double p;
   private List<V> partitionA;
   private List<V> partitionB;

   public GnpRandomBipartiteGraphGenerator(int var1, int var2, double var3) {
      this(var1, var2, var3, new Random());
   }

   public GnpRandomBipartiteGraphGenerator(int var1, int var2, double var3, long var5) {
      this(var1, var2, var3, new Random(var5));
   }

   public GnpRandomBipartiteGraphGenerator(int var1, int var2, double var3, Random var5) {
      if (var1 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n1 = var1;
      if (var2 < 0) {
         throw new IllegalArgumentException("number of vertices must be non-negative");
      }

      this.n2 = var2;
      if (!(var3 < 0.0) && !(var3 > 1.0)) {
         this.p = var3;
         this.rng = Objects.requireNonNull(var5);
      } else {
         throw new IllegalArgumentException("not valid probability of edge existence");
      }
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

         for (int var9 = 0; var9 < this.n2; var9++) {
            this.partitionB.add((V)var1.addVertex());
         }

         if (var1.vertexSet().size() != var3 + this.n1 + this.n2) {
            throw new IllegalArgumentException("Vertex factory did not produce " + (this.n1 + this.n2) + " distinct vertices.");
         }

         boolean var10 = var1.getType().isDirected();

         for (int var5 = 0; var5 < this.n1; var5++) {
            Object var6 = this.partitionA.get(var5);

            for (int var7 = 0; var7 < this.n2; var7++) {
               Object var8 = this.partitionB.get(var7);
               if (this.rng.nextDouble() < this.p) {
                  var1.addEdge(var6, var8);
               }

               if (var10 && this.rng.nextDouble() < this.p) {
                  var1.addEdge(var8, var6);
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
