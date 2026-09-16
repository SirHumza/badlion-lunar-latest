package org.jgrapht.alg.matching;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.FibonacciHeap;

public class MaximumWeightBipartiteMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final Set<V> partition1;
   private final Set<V> partition2;
   private final Comparator<BigDecimal> comparator;
   private final Function<Comparator<BigDecimal>, AddressableHeap<BigDecimal, V>> heapSupplier;
   private Map<V, BigDecimal> pot;
   private Map<V, E> matchedEdge;
   private AddressableHeap<BigDecimal, V> heap;
   private Map<V, AddressableHeap.Handle<BigDecimal, V>> nodeInHeap;
   private Map<V, E> pred;
   private Map<V, BigDecimal> dist;
   private Set<E> matching;
   private BigDecimal matchingWeight;

   public MaximumWeightBipartiteMatching(Graph<V, E> var1, Set<V> var2, Set<V> var3) {
      this(var1, var2, var3, var0 -> new FibonacciHeap<>(var0));
   }

   public MaximumWeightBipartiteMatching(Graph<V, E> var1, Set<V> var2, Set<V> var3, Function<Comparator<BigDecimal>, AddressableHeap<BigDecimal, V>> var4) {
      this.graph = GraphTests.requireUndirected(var1);
      this.partition1 = Objects.requireNonNull(var2, "Partition 1 cannot be null");
      this.partition2 = Objects.requireNonNull(var3, "Partition 2 cannot be null");
      this.comparator = Comparator.naturalOrder();
      this.heapSupplier = Objects.requireNonNull(var4, "Heap supplier cannot be null");
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      if (!GraphTests.isSimple(this.graph)) {
         throw new IllegalArgumentException("Only simple graphs supported");
      }

      if (!GraphTests.isBipartitePartition(this.graph, this.partition1, this.partition2)) {
         throw new IllegalArgumentException("Graph partition is not bipartite");
      }

      this.matching = new LinkedHashSet<>();
      this.matchingWeight = BigDecimal.ZERO;
      if (this.graph.edgeSet().isEmpty()) {
         return new MatchingAlgorithm.MatchingImpl<>(this.graph, this.matching, this.matchingWeight.doubleValue());
      }

      this.pot = new HashMap<>();
      this.dist = new HashMap<>();
      this.matchedEdge = (Map<V, E>)(new HashMap<>());
      this.heap = this.heapSupplier.apply(this.comparator);
      this.nodeInHeap = new HashMap<>();
      this.pred = (Map<V, E>)(new HashMap<>());
      this.graph.vertexSet().forEach(var1 -> {
         this.pot.put((V)var1, BigDecimal.ZERO);
         this.pred.put((V)var1, null);
         this.dist.put((V)var1, BigDecimal.ZERO);
      });
      this.simpleHeuristic();

      for (Object var2 : this.partition1) {
         if (!this.matchedEdge.containsKey(var2)) {
            this.augment((V)var2);
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, this.matching, this.matchingWeight.doubleValue());
   }

   public Map<V, BigDecimal> getPotentials() {
      return this.pot == null ? Collections.emptyMap() : Collections.unmodifiableMap(this.pot);
   }

   public BigDecimal getMatchingWeight() {
      return this.matchingWeight;
   }

   private void augment(V var1) {
      this.dist.put((V)var1, BigDecimal.ZERO);
      Object var2 = var1;
      BigDecimal var3 = this.pot.get(var1);
      ArrayDeque var5 = new ArrayDeque();
      var5.push(var1);
      ArrayDeque var6 = new ArrayDeque();
      Object var7 = var1;

      for (Object var9 : this.graph.edgesOf((V)var7)) {
         if (!this.matching.contains(var9)) {
            Object var10 = Graphs.getOppositeVertex(this.graph, (E)var9, (V)var7);
            BigDecimal var11 = this.dist
               .get(var7)
               .add(this.pot.get(var7))
               .add(this.pot.get(var10))
               .subtract(BigDecimal.valueOf(this.graph.getEdgeWeight((E)var9)));
            if (this.pred.get(var10) == null) {
               this.dist.put((V)var10, var11);
               this.pred.put((V)var10, (E)var9);
               var6.push(var10);
               AddressableHeap.Handle var12 = this.heap.insert(var11, (V)var10);
               this.nodeInHeap.put((V)var10, var12);
            } else if (this.comparator.compare(var11, this.dist.get(var10)) < 0) {
               this.dist.put((V)var10, var11);
               this.pred.put((V)var10, (E)var9);
               this.nodeInHeap.get(var10).decreaseKey(var11);
            }
         }
      }

      BigDecimal var4;
      label71:
      while (true) {
         Object var17 = null;
         BigDecimal var20 = BigDecimal.ZERO;
         if (!this.heap.isEmpty()) {
            var17 = this.heap.deleteMin().getValue();
            this.nodeInHeap.remove(var17);
            var20 = this.dist.get(var17);
         }

         if (var17 != null && this.comparator.compare(var20, var3) < 0) {
            Object var23 = this.matchedEdge.get(var17);
            if (var23 == null) {
               var4 = var20;
               this.augmentPathTo((V)var17);
               break;
            }

            var7 = Graphs.getOppositeVertex(this.graph, (E)var23, (V)var17);
            this.pred.put((V)var7, (E)var23);
            var5.push(var7);
            this.dist.put((V)var7, var20);
            if (this.comparator.compare(var20.add(this.pot.get(var7)), var3) < 0) {
               var2 = var7;
               var3 = var20.add(this.pot.get(var7));
            }

            Iterator var24 = this.graph.edgesOf((V)var7).iterator();

            while (true) {
               if (!var24.hasNext()) {
                  continue label71;
               }

               Object var25 = var24.next();
               if (!this.matching.contains(var25)) {
                  Object var13 = Graphs.getOppositeVertex(this.graph, (E)var25, (V)var7);
                  BigDecimal var14 = this.dist
                     .get(var7)
                     .add(this.pot.get(var7))
                     .add(this.pot.get(var13))
                     .subtract(BigDecimal.valueOf(this.graph.getEdgeWeight((E)var25)));
                  if (this.pred.get(var13) == null) {
                     this.dist.put((V)var13, var14);
                     this.pred.put((V)var13, (E)var25);
                     var6.push(var13);
                     AddressableHeap.Handle var15 = this.heap.insert(var14, (V)var13);
                     this.nodeInHeap.put((V)var13, var15);
                  } else if (this.comparator.compare(var14, this.dist.get(var13)) < 0) {
                     this.dist.put((V)var13, var14);
                     this.pred.put((V)var13, (E)var25);
                     this.nodeInHeap.get(var13).decreaseKey(var14);
                  }
               }
            }
         }

         var4 = var3;
         this.augmentPathTo((V)var2);
         break;
      }

      while (!var5.isEmpty()) {
         Object var18 = var5.pop();
         this.pred.put((V)var18, null);
         BigDecimal var21 = var4.subtract(this.dist.get(var18));
         if (this.comparator.compare(var21, BigDecimal.ZERO) > 0) {
            this.pot.put((V)var18, this.pot.get(var18).subtract(var21));
         }
      }

      while (!var6.isEmpty()) {
         Object var19 = var6.pop();
         this.pred.put((V)var19, null);
         if (this.nodeInHeap.containsKey(var19)) {
            this.nodeInHeap.remove(var19).delete();
         }

         BigDecimal var22 = var4.subtract(this.dist.get(var19));
         if (this.comparator.compare(var22, BigDecimal.ZERO) > 0) {
            this.pot.put((V)var19, this.pot.get(var19).add(var22));
         }
      }
   }

   private void augmentPathTo(V var1) {
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();

      for (Object var4 = this.pred.get(var1); var4 != null; var4 = this.pred.get(var1)) {
         if (this.matching.contains(var4)) {
            var2.add(var4);
         } else {
            var3.add(var4);
         }

         var1 = Graphs.getOppositeVertex(this.graph, (E)var4, (V)var1);
      }

      for (Object var6 : var2) {
         BigDecimal var7 = BigDecimal.valueOf(this.graph.getEdgeWeight((E)var6));
         Object var8 = this.graph.getEdgeSource((E)var6);
         Object var9 = this.graph.getEdgeTarget((E)var6);
         this.matchedEdge.remove(var8);
         this.matchedEdge.remove(var9);
         this.matchingWeight = this.matchingWeight.subtract(var7);
         this.matching.remove(var6);
      }

      for (Object var11 : var3) {
         BigDecimal var12 = BigDecimal.valueOf(this.graph.getEdgeWeight((E)var11));
         Object var13 = this.graph.getEdgeSource((E)var11);
         Object var14 = this.graph.getEdgeTarget((E)var11);
         this.matchedEdge.put((V)var13, (E)var11);
         this.matchedEdge.put((V)var14, (E)var11);
         this.matchingWeight = this.matchingWeight.add(var12);
         this.matching.add((E)var11);
      }
   }

   private void simpleHeuristic() {
      for (Object var2 : this.partition1) {
         Object var3 = null;
         BigDecimal var4 = BigDecimal.ZERO;

         for (Object var6 : this.graph.edgesOf((V)var2)) {
            BigDecimal var7 = BigDecimal.valueOf(this.graph.getEdgeWeight((E)var6));
            if (this.comparator.compare(var7, var4) > 0) {
               var4 = var7;
               var3 = var6;
            }
         }

         this.pot.put((V)var2, var4);
         if (var3 != null) {
            Object var8 = Graphs.getOppositeVertex(this.graph, (E)var3, (V)var2);
            if (!this.matchedEdge.containsKey(var8)) {
               this.matching.add((E)var3);
               this.matchingWeight = this.matchingWeight.add(var4);
               this.matchedEdge.put((V)var2, (E)var3);
               this.matchedEdge.put((V)var8, (E)var3);
            }
         }
      }
   }
}
