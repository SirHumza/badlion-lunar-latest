package org.jgrapht.generate;

import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;

public class CompleteBipartiteGraphGenerator<V, E> implements GraphGenerator<V, E, V> {
   private final int sizeA;
   private final int sizeB;
   private final Set<V> partitionA;
   private final Set<V> partitionB;

   public CompleteBipartiteGraphGenerator(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0) {
         this.sizeA = var1;
         this.sizeB = var2;
         this.partitionA = CollectionUtil.newLinkedHashSetWithExpectedSize(this.sizeA);
         this.partitionB = CollectionUtil.newLinkedHashSetWithExpectedSize(this.sizeB);
      } else {
         throw new IllegalArgumentException("partition sizes must be non-negative");
      }
   }

   public CompleteBipartiteGraphGenerator(Set<V> var1, Set<V> var2) {
      if (!var1.isEmpty() && !var2.isEmpty()) {
         this.sizeA = 0;
         this.sizeB = 0;
         this.partitionA = var1;
         this.partitionB = var2;
      } else {
         throw new IllegalArgumentException("partitions must be non-empty");
      }
   }

   @Override
   public void generateGraph(Graph<V, E> var1, Map<String, V> var2) {
      for (int var3 = 0; var3 < this.sizeA; var3++) {
         this.partitionA.add((V)var1.addVertex());
      }

      for (int var7 = 0; var7 < this.sizeB; var7++) {
         this.partitionB.add((V)var1.addVertex());
      }

      for (Object var4 : this.partitionA) {
         for (Object var6 : this.partitionB) {
            var1.addEdge(var4, var6);
         }
      }
   }
}
