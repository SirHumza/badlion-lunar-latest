package org.jgrapht.traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

@Deprecated
public class RandomWalkIterator<V, E> extends AbstractGraphIterator<V, E> {
   private V currentVertex;
   private final boolean isWeighted;
   private boolean sinkReached;
   private long maxSteps;
   private Random random;

   public RandomWalkIterator(Graph<V, E> var1) {
      this(var1, null);
   }

   public RandomWalkIterator(Graph<V, E> var1, V var2) {
      this(var1, (V)var2, true);
   }

   public RandomWalkIterator(Graph<V, E> var1, V var2, boolean var3) {
      this(var1, (V)var2, var3, Long.MAX_VALUE);
   }

   public RandomWalkIterator(Graph<V, E> var1, V var2, boolean var3, long var4) {
      this(var1, (V)var2, var3, var4, new Random());
   }

   public RandomWalkIterator(Graph<V, E> var1, V var2, boolean var3, long var4, Random var6) {
      super(var1);
      this.crossComponentTraversal = false;
      this.isWeighted = var3;
      this.maxSteps = var4;
      if (var2 == null) {
         if (var1.vertexSet().size() > 0) {
            this.currentVertex = (V)var1.vertexSet().iterator().next();
         }
      } else {
         if (!var1.containsVertex(var2)) {
            throw new IllegalArgumentException("graph must contain the start vertex");
         }

         this.currentVertex = (V)var2;
      }

      this.sinkReached = false;
      this.random = Objects.requireNonNull(var6, "Random number generator cannot be null");
   }

   protected boolean isExhausted() {
      return this.maxSteps == 0L;
   }

   protected void encounterVertex(V var1, E var2) {
      this.maxSteps--;
   }

   @Override
   public boolean hasNext() {
      return this.currentVertex != null && !this.isExhausted() && !this.sinkReached;
   }

   @Override
   public V next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         Set var1 = this.graph.outgoingEdgesOf(this.currentVertex);
         Object var2 = this.drawEdge(var1);
         if (var2 != null) {
            Object var3 = Graphs.getOppositeVertex(this.graph, (E)var2, this.currentVertex);
            this.encounterVertex((V)var3, (E)var2);
            this.fireEdgeTraversed(this.createEdgeTraversalEvent((E)var2));
            this.fireVertexTraversed(this.createVertexTraversalEvent((V)var3));
            this.currentVertex = (V)var3;
            return (V)var3;
         } else {
            this.sinkReached = true;
            return this.currentVertex;
         }
      }
   }

   private E drawEdge(Set<? extends E> var1) {
      if (var1.isEmpty()) {
         return null;
      }

      ArrayList var3 = new ArrayList<>(var1);
      int var2;
      if (this.isWeighted) {
         Iterator var4 = var3.iterator();
         double var5 = this.random.nextDouble() * this.getTotalWeight(var3);
         double var7 = 0.0;
         var2 = -1;

         do {
            var7 += this.graph.getEdgeWeight((E)var4.next());
            var2++;
         } while (var7 < var5);
      } else {
         var2 = this.random.nextInt(var3.size());
      }

      return (E)var3.get(var2);
   }

   private double getTotalWeight(Collection<E> var1) {
      double var2 = 0.0;

      for (Object var5 : var1) {
         var2 += this.graph.getEdgeWeight((E)var5);
      }

      return var2;
   }
}
