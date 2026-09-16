package org.jgrapht.alg.shortestpath;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

class DijkstraClosestFirstIterator<V, E> implements Iterator<V> {
   private final Graph<V, E> graph;
   private final V source;
   private final double radius;
   private final Map<V, AddressableHeap.Handle<Double, Pair<V, E>>> seen;
   private AddressableHeap<Double, Pair<V, E>> heap;

   public DijkstraClosestFirstIterator(Graph<V, E> var1, V var2) {
      this(var1, (V)var2, Double.POSITIVE_INFINITY, PairingHeap::new);
   }

   public DijkstraClosestFirstIterator(Graph<V, E> var1, V var2, double var3) {
      this(var1, (V)var2, var3, PairingHeap::new);
   }

   public DijkstraClosestFirstIterator(Graph<V, E> var1, V var2, Supplier<AddressableHeap<Double, Pair<V, E>>> var3) {
      this(var1, (V)var2, Double.POSITIVE_INFINITY, var3);
   }

   public DijkstraClosestFirstIterator(Graph<V, E> var1, V var2, double var3, Supplier<AddressableHeap<Double, Pair<V, E>>> var5) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      this.source = Objects.requireNonNull((V)var2, "Source vertex cannot be null");
      Objects.requireNonNull(var5, "Heap supplier cannot be null");
      if (var3 < 0.0) {
         throw new IllegalArgumentException("Radius must be non-negative");
      }

      this.radius = var3;
      this.seen = new HashMap<>();
      this.heap = (AddressableHeap<Double, Pair<V, E>>)var5.get();
      this.updateDistance((V)var2, null, 0.0);
   }

   @Override
   public boolean hasNext() {
      if (this.heap.isEmpty()) {
         return false;
      } else {
         AddressableHeap.Handle var1 = this.heap.findMin();
         double var2 = (Double)var1.getKey();
         if (this.radius < var2) {
            this.heap.clear();
            return false;
         } else {
            return true;
         }
      }
   }

   @Override
   public V next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      AddressableHeap.Handle var1 = this.heap.deleteMin();
      Object var2 = ((Pair)var1.getValue()).getFirst();
      double var3 = (Double)var1.getKey();

      for (Object var6 : this.graph.outgoingEdgesOf((V)var2)) {
         Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var2);
         double var8 = this.graph.getEdgeWeight((E)var6);
         if (var8 < 0.0) {
            throw new IllegalArgumentException("Negative edge weight not allowed");
         }

         this.updateDistance((V)var7, (E)var6, var3 + var8);
      }

      return (V)var2;
   }

   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths() {
      return new TreeSingleSourcePathsImpl<>(this.graph, this.source, this.getDistanceAndPredecessorMap());
   }

   public Map<V, Pair<Double, E>> getDistanceAndPredecessorMap() {
      HashMap var1 = new HashMap();

      for (AddressableHeap.Handle var3 : this.seen.values()) {
         double var4 = (Double)var3.getKey();
         if (!(this.radius < var4)) {
            Object var6 = ((Pair)var3.getValue()).getFirst();
            var1.put(var6, Pair.of(var4, ((Pair)var3.getValue()).getSecond()));
         }
      }

      return var1;
   }

   private void updateDistance(V var1, E var2, double var3) {
      AddressableHeap.Handle var5 = this.seen.get(var1);
      if (var5 == null) {
         var5 = this.heap.insert(var3, Pair.of((V)var1, (E)var2));
         this.seen.put((V)var1, var5);
      } else if (var3 < (Double)var5.getKey()) {
         var5.decreaseKey(var3);
         var5.setValue(Pair.of(((Pair)var5.getValue()).getFirst(), var2));
      }
   }
}
