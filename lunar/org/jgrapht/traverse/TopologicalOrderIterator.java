package org.jgrapht.traverse;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.util.ModifiableInteger;

public class TopologicalOrderIterator<V, E> extends AbstractGraphIterator<V, E> {
   private static final String GRAPH_IS_NOT_A_DAG = "Graph is not a DAG";
   private Queue<V> queue;
   private Map<V, ModifiableInteger> inDegreeMap;
   private int remainingVertices;
   private V cur;

   public TopologicalOrderIterator(Graph<V, E> var1) {
      this(var1, (Comparator<V>)null);
   }

   public TopologicalOrderIterator(Graph<V, E> var1, Comparator<V> var2) {
      super(var1);
      GraphTests.requireDirected(var1);
      if (var2 == null) {
         this.queue = new ArrayDeque();
      } else {
         this.queue = new PriorityQueue(var2);
      }

      this.inDegreeMap = new HashMap<>();

      for (Object var4 : var1.vertexSet()) {
         int var5 = 0;

         for (Object var7 : var1.incomingEdgesOf(var4)) {
            Object var8 = Graphs.getOppositeVertex(var1, var7, var4);
            if (var4.equals(var8)) {
               throw new IllegalArgumentException("Graph is not a DAG");
            }

            var5++;
         }

         this.inDegreeMap.put((V)var4, new ModifiableInteger(var5));
         if (var5 == 0) {
            this.queue.offer((V)var4);
         }
      }

      this.remainingVertices = var1.vertexSet().size();
   }

   @Override
   public boolean isCrossComponentTraversal() {
      return true;
   }

   @Override
   public void setCrossComponentTraversal(boolean var1) {
      if (!var1) {
         throw new IllegalArgumentException("Iterator is always cross-component");
      }
   }

   @Override
   public boolean hasNext() {
      if (this.cur != null) {
         return true;
      }

      this.cur = this.advance();
      if (this.cur != null && this.nListeners != 0) {
         this.fireVertexTraversed(this.createVertexTraversalEvent(this.cur));
      }

      return this.cur != null;
   }

   @Override
   public V next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      Object var1 = this.cur;
      this.cur = null;
      if (this.nListeners != 0) {
         this.fireVertexFinished(this.createVertexTraversalEvent((V)var1));
      }

      return (V)var1;
   }

   private V advance() {
      Object var1 = this.queue.poll();
      if (var1 != null) {
         for (Object var3 : this.graph.outgoingEdgesOf((V)var1)) {
            Object var4 = Graphs.getOppositeVertex(this.graph, (E)var3, (V)var1);
            ModifiableInteger var5 = this.inDegreeMap.get(var4);
            if (var5.value > 0) {
               var5.value--;
               if (var5.value == 0) {
                  this.queue.offer((V)var4);
               }
            }
         }

         this.remainingVertices--;
      } else if (this.remainingVertices > 0) {
         throw new IllegalArgumentException("Graph is not a DAG");
      }

      return (V)var1;
   }
}
