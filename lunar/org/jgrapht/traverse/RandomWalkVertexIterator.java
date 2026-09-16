package org.jgrapht.traverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class RandomWalkVertexIterator<V, E> implements Iterator<V> {
   private final Random rng;
   private final Graph<V, E> graph;
   private final boolean weighted;
   private final Map<V, Double> outEdgesTotalWeight;
   private final long maxHops;
   private long hops;
   private V nextVertex;

   public RandomWalkVertexIterator(Graph<V, E> var1, V var2) {
      this(var1, (V)var2, Long.MAX_VALUE, false, new Random());
   }

   public RandomWalkVertexIterator(Graph<V, E> var1, V var2, long var3) {
      this(var1, (V)var2, var3, false, new Random());
   }

   public RandomWalkVertexIterator(Graph<V, E> var1, V var2, long var3, boolean var5, Random var6) {
      this.graph = Objects.requireNonNull(var1);
      this.weighted = var5;
      this.outEdgesTotalWeight = new HashMap<>();
      this.hops = 0L;
      this.nextVertex = Objects.requireNonNull((V)var2);
      if (!var1.containsVertex(var2)) {
         throw new IllegalArgumentException("Random walk must start at a graph vertex");
      }

      this.maxHops = var3;
      this.rng = var6;
   }

   @Override
   public boolean hasNext() {
      return this.nextVertex != null;
   }

   @Override
   public V next() {
      if (this.nextVertex == null) {
         throw new NoSuchElementException();
      }

      Object var1 = this.nextVertex;
      this.computeNext();
      return (V)var1;
   }

   private void computeNext() {
      if (this.hops >= this.maxHops) {
         this.nextVertex = null;
      } else {
         this.hops++;
         if (this.graph.outDegreeOf(this.nextVertex) == 0) {
            this.nextVertex = null;
         } else {
            Object var1 = null;
            if (this.weighted) {
               double var2 = this.outEdgesTotalWeight
                  .computeIfAbsent(
                     this.nextVertex, var1x -> this.graph.outgoingEdgesOf((V)var1x).stream().collect(Collectors.summingDouble(this.graph::getEdgeWeight))
                  );
               double var4 = var2 * this.rng.nextDouble();
               double var6 = 0.0;

               for (Object var9 : this.graph.outgoingEdgesOf(this.nextVertex)) {
                  var6 += this.graph.getEdgeWeight((E)var9);
                  if (var4 <= var6) {
                     var1 = var9;
                     break;
                  }
               }
            } else {
               ArrayList var10 = new ArrayList<>(this.graph.outgoingEdgesOf(this.nextVertex));
               var1 = var10.get(this.rng.nextInt(var10.size()));
            }

            this.nextVertex = Graphs.getOppositeVertex(this.graph, (E)var1, this.nextVertex);
         }
      }
   }
}
