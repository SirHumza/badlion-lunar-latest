package org.jgrapht.alg.partition;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.PartitioningAlgorithm;

public class BipartitePartitioning<V, E> implements PartitioningAlgorithm<V> {
   private Graph<V, E> graph;
   private boolean computed = false;
   private PartitioningAlgorithm.Partitioning<V> cachedPartitioning;

   public BipartitePartitioning(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "graph cannot be null");
   }

   public boolean isBipartite() {
      if (GraphTests.isEmpty(this.graph)) {
         return true;
      }

      try {
         if (Math.multiplyExact(4, this.graph.edgeSet().size()) > Math.multiplyExact(this.graph.vertexSet().size(), this.graph.vertexSet().size())) {
            return false;
         }
      } catch (ArithmeticException var2) {
      }

      return this.getPartitioning() != null;
   }

   @Override
   public PartitioningAlgorithm.Partitioning<V> getPartitioning() {
      if (this.computed) {
         return this.cachedPartitioning;
      }

      HashSet var1 = new HashSet<>(this.graph.vertexSet());
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();

      while (!var1.isEmpty()) {
         if (var3.isEmpty()) {
            var3.add(var1.iterator().next());
         }

         Object var4 = var3.removeFirst();
         var1.remove(var4);

         for (Object var6 : this.graph.edgesOf((V)var4)) {
            Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var4);
            if (var1.contains(var7)) {
               var3.add(var7);
               if (!var2.contains(var4)) {
                  var2.add(var7);
               }
            } else if (var2.contains(var4) == var2.contains(var7)) {
               this.computed = true;
               this.cachedPartitioning = null;
               return null;
            }
         }
      }

      HashSet var8 = new HashSet<>(this.graph.vertexSet());
      var8.removeAll(var2);
      this.computed = true;
      this.cachedPartitioning = new PartitioningAlgorithm.PartitioningImpl<>(Arrays.asList(var8, var2));
      return this.cachedPartitioning;
   }

   @Override
   public boolean isValidPartitioning(PartitioningAlgorithm.Partitioning<V> var1) {
      Objects.requireNonNull(var1, "Partition cannot be null");
      if (var1.getNumberPartitions() != 2) {
         return false;
      }

      Set var2 = var1.getPartition(0);
      Set var3 = var1.getPartition(1);
      Objects.requireNonNull(var2, "First partition class cannot be null");
      Objects.requireNonNull(var3, "Second partition class cannot be null");
      if (this.graph.vertexSet().size() != var2.size() + var3.size()) {
         return false;
      }

      for (Object var5 : this.graph.vertexSet()) {
         Set var6;
         if (var2.contains(var5)) {
            var6 = var3;
         } else {
            if (!var3.contains(var5)) {
               return false;
            }

            var6 = var2;
         }

         for (Object var8 : this.graph.edgesOf((V)var5)) {
            Object var9 = Graphs.getOppositeVertex(this.graph, (E)var8, (V)var5);
            if (!var6.contains(var9)) {
               return false;
            }
         }
      }

      return true;
   }
}
