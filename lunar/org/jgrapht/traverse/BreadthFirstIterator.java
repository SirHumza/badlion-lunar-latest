package org.jgrapht.traverse;

import java.util.ArrayDeque;
import java.util.Deque;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class BreadthFirstIterator<V, E> extends CrossComponentIterator<V, E, BreadthFirstIterator.SearchNodeData<E>> {
   private Deque<V> queue = new ArrayDeque();

   public BreadthFirstIterator(Graph<V, E> var1) {
      this(var1, (V)null);
   }

   public BreadthFirstIterator(Graph<V, E> var1, V var2) {
      super(var1, (V)var2);
   }

   public BreadthFirstIterator(Graph<V, E> var1, Iterable<V> var2) {
      super(var1, var2);
   }

   @Override
   protected boolean isConnectedComponentExhausted() {
      return this.queue.isEmpty();
   }

   @Override
   protected void encounterVertex(V var1, E var2) {
      int var3 = var2 == null ? 0 : this.getSeenData(Graphs.getOppositeVertex(this.graph, (E)var2, (V)var1)).depth + 1;
      this.putSeenData((V)var1, new BreadthFirstIterator.SearchNodeData<>((E)var2, var3));
      this.queue.add((V)var1);
   }

   @Override
   protected void encounterVertexAgain(V var1, E var2) {
   }

   public V getParent(V var1) {
      assert this.getSeenData((V)var1) != null;
      Object var2 = this.getSeenData((V)var1).edge;
      return var2 == null ? null : Graphs.getOppositeVertex(this.graph, (E)var2, (V)var1);
   }

   public E getSpanningTreeEdge(V var1) {
      assert this.getSeenData((V)var1) != null;
      return this.getSeenData((V)var1).edge;
   }

   public int getDepth(V var1) {
      assert this.getSeenData((V)var1) != null;
      return this.getSeenData((V)var1).depth;
   }

   @Override
   protected V provideNextVertex() {
      return this.queue.removeFirst();
   }

   protected static class SearchNodeData<E> {
      private final E edge;
      private final int depth;

      public SearchNodeData(E var1, int var2) {
         this.edge = (E)var1;
         this.depth = var2;
      }

      public E getEdge() {
         return this.edge;
      }

      public int getDepth() {
         return this.depth;
      }
   }
}
