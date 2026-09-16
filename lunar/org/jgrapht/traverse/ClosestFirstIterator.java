package org.jgrapht.traverse;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class ClosestFirstIterator<V, E> extends CrossComponentIterator<V, E, AddressableHeap.Handle<Double, ClosestFirstIterator.QueueEntry<V, E>>> {
   private AddressableHeap<Double, ClosestFirstIterator.QueueEntry<V, E>> heap;
   private double radius = Double.POSITIVE_INFINITY;
   private boolean initialized = false;

   public ClosestFirstIterator(Graph<V, E> var1, V var2) {
      this(var1, (V)var2, Double.POSITIVE_INFINITY);
   }

   public ClosestFirstIterator(Graph<V, E> var1, Iterable<V> var2) {
      this(var1, var2, Double.POSITIVE_INFINITY);
   }

   public ClosestFirstIterator(Graph<V, E> var1, V var2, double var3) {
      this(var1, var2 == null ? null : Collections.singletonList((V)var2), var3, PairingHeap::new);
   }

   public ClosestFirstIterator(Graph<V, E> var1, V var2, double var3, Supplier<AddressableHeap<Double, ClosestFirstIterator.QueueEntry<V, E>>> var5) {
      this(var1, var2 == null ? null : Collections.singletonList((V)var2), var3, var5);
   }

   public ClosestFirstIterator(Graph<V, E> var1, Iterable<V> var2, double var3) {
      this(var1, var2, var3, PairingHeap::new);
   }

   public ClosestFirstIterator(Graph<V, E> var1, Iterable<V> var2, double var3, Supplier<AddressableHeap<Double, ClosestFirstIterator.QueueEntry<V, E>>> var5) {
      super(var1, var2);
      this.radius = var3;
      Objects.requireNonNull(var5, "Heap supplier cannot be null");
      this.heap = (AddressableHeap<Double, ClosestFirstIterator.QueueEntry<V, E>>)var5.get();
      this.checkRadiusTraversal(this.isCrossComponentTraversal());
      this.initialized = true;
      if (!this.crossComponentTraversal) {
         this.hasNext();
         Iterator var6 = var2.iterator();
         if (var6.hasNext()) {
            var6.next();

            while (var6.hasNext()) {
               Object var7 = var6.next();
               this.encounterVertex((V)var7, null);
            }
         }
      }
   }

   @Override
   public void setCrossComponentTraversal(boolean var1) {
      if (this.initialized) {
         this.checkRadiusTraversal(var1);
      }

      super.setCrossComponentTraversal(var1);
   }

   public double getShortestPathLength(V var1) {
      AddressableHeap.Handle var2 = this.getSeenData((V)var1);
      return var2 == null ? Double.POSITIVE_INFINITY : (Double)var2.getKey();
   }

   public E getSpanningTreeEdge(V var1) {
      AddressableHeap.Handle var2 = this.getSeenData((V)var1);
      return var2 == null ? null : ((ClosestFirstIterator.QueueEntry)var2.getValue()).spanningTreeEdge;
   }

   @Override
   protected boolean isConnectedComponentExhausted() {
      if (this.heap.size() == 0L) {
         return true;
      } else if (this.heap.findMin().getKey() > this.radius) {
         this.heap.clear();
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void encounterVertex(V var1, E var2) {
      double var3;
      if (var2 == null) {
         var3 = 0.0;
      } else {
         var3 = this.calculatePathLength((V)var1, (E)var2);
      }

      AddressableHeap.Handle var5 = this.heap.insert(var3, new ClosestFirstIterator.QueueEntry<>((V)var1, (E)var2));
      this.putSeenData((V)var1, var5);
   }

   @Override
   protected void encounterVertexAgain(V var1, E var2) {
      AddressableHeap.Handle var3 = this.getSeenData((V)var1);
      if (!((ClosestFirstIterator.QueueEntry)var3.getValue()).frozen) {
         double var4 = this.calculatePathLength((V)var1, (E)var2);
         if (var4 < (Double)var3.getKey()) {
            ((ClosestFirstIterator.QueueEntry)var3.getValue()).spanningTreeEdge = (E)var2;
            var3.decreaseKey(var4);
         }
      }
   }

   @Override
   protected V provideNextVertex() {
      AddressableHeap.Handle var1 = this.heap.deleteMin();
      ((ClosestFirstIterator.QueueEntry)var1.getValue()).frozen = true;
      return ((ClosestFirstIterator.QueueEntry)var1.getValue()).vertex;
   }

   private void assertNonNegativeEdge(E var1) {
      if (this.getGraph().getEdgeWeight((E)var1) < 0.0) {
         throw new IllegalArgumentException("negative edge weights not allowed");
      }
   }

   private double calculatePathLength(V var1, E var2) {
      this.assertNonNegativeEdge((E)var2);
      Object var3 = Graphs.getOppositeVertex(this.getGraph(), (E)var2, (V)var1);
      AddressableHeap.Handle var4 = this.getSeenData((V)var3);
      return (Double)var4.getKey() + this.getGraph().getEdgeWeight((E)var2);
   }

   private void checkRadiusTraversal(boolean var1) {
      if (var1 && this.radius != Double.POSITIVE_INFINITY) {
         throw new IllegalArgumentException("radius may not be specified for cross-component traversal");
      }
   }

   static class QueueEntry<V, E> {
      V vertex;
      E spanningTreeEdge;
      boolean frozen;

      QueueEntry(V var1, E var2) {
         this.vertex = (V)var1;
         this.spanningTreeEdge = (E)var2;
      }
   }
}
