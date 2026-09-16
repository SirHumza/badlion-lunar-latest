package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.traverse.DepthFirstIterator;

public interface CapacitatedSpanningTreeAlgorithm<V, E> {
   CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> getCapacitatedSpanningTree();

   interface CapacitatedSpanningTree<V, E> extends Iterable<E>, SpanningTreeAlgorithm.SpanningTree<E> {
      boolean isCapacitatedSpanningTree(Graph<V, E> var1, V var2, double var3, Map<V, Double> var5);

      Map<V, Integer> getLabels();

      Map<Integer, Pair<Set<V>, Double>> getPartition();
   }

   class CapacitatedSpanningTreeImpl<V, E> implements Serializable, CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> {
      private static final long serialVersionUID = 7088989899889893333L;
      private final Map<V, Integer> labels;
      private final Map<Integer, Pair<Set<V>, Double>> partition;
      private final double weight;
      private final Set<E> edges;

      public CapacitatedSpanningTreeImpl(Map<V, Integer> var1, Map<Integer, Pair<Set<V>, Double>> var2, Set<E> var3, double var4) {
         this.labels = var1;
         this.partition = var2;
         this.edges = var3;
         this.weight = var4;
      }

      @Override
      public boolean isCapacitatedSpanningTree(Graph<V, E> var1, V var2, double var3, Map<V, Double> var5) {
         if (this.getEdges().size() != var1.vertexSet().size() - 1) {
            return false;
         }

         for (Pair var7 : this.getPartition().values()) {
            for (Pair var9 : this.getPartition().values()) {
               if (var7 != var9 && !Collections.disjoint((Collection<?>)var7.getFirst(), (Collection<?>)var9.getFirst())) {
                  return false;
               }
            }
         }

         int var12 = 0;

         for (Pair var15 : this.getPartition().values()) {
            int var17 = 0;

            for (Object var11 : (Set)var15.getFirst()) {
               var17 = (int)(var17 + (Double)var5.get(var11));
               var12++;
            }

            if (var17 > var3) {
               return false;
            }
         }

         if (var1.vertexSet().size() - 1 != var12) {
            return false;
         }

         AsSubgraph var14 = new AsSubgraph<>(var1, var1.vertexSet(), this.getEdges());
         DepthFirstIterator var16 = new DepthFirstIterator<>(var14, (V)var2);
         if (var16.hasNext()) {
            var16.next();
         }

         int var18 = 0;
         HashSet var19 = new HashSet();

         while (var16.hasNext()) {
            Object var20 = var16.next();
            if (var14.containsEdge(var2, var20)) {
               if (!var19.isEmpty()) {
                  if (!var19.equals(this.getPartition().get(this.getLabels().get(var19.iterator().next())).getFirst())) {
                     return false;
                  }

                  var19 = new HashSet();
               }

               var18++;
            }

            var19.add(var20);
         }

         return var18 == var14.degreeOf(var2);
      }

      @Override
      public Map<V, Integer> getLabels() {
         return this.labels;
      }

      @Override
      public Map<Integer, Pair<Set<V>, Double>> getPartition() {
         return this.partition;
      }

      @Override
      public double getWeight() {
         return this.weight;
      }

      @Override
      public Set<E> getEdges() {
         return this.edges;
      }

      @Override
      public String toString() {
         return "Capacitated Spanning-Tree [weight="
            + this.weight
            + ", edges="
            + this.edges
            + ", labels="
            + this.labels
            + ", partition="
            + this.partition
            + "]";
      }
   }
}
