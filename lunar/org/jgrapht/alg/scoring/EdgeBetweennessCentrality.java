package org.jgrapht.alg.scoring;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.EdgeScoringAlgorithm;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class EdgeBetweennessCentrality<V, E> implements EdgeScoringAlgorithm<E, Double> {
   private final Graph<V, E> graph;
   private final Iterable<V> startVertices;
   private final boolean divideByTwo;
   private Map<E, Double> scores;
   private final EdgeBetweennessCentrality.OverflowStrategy overflowStrategy;

   public EdgeBetweennessCentrality(Graph<V, E> var1) {
      this(var1, EdgeBetweennessCentrality.OverflowStrategy.IGNORE_OVERFLOW, null);
   }

   public EdgeBetweennessCentrality(Graph<V, E> var1, EdgeBetweennessCentrality.OverflowStrategy var2) {
      this(var1, var2, null);
   }

   public EdgeBetweennessCentrality(Graph<V, E> var1, EdgeBetweennessCentrality.OverflowStrategy var2, Iterable<V> var3) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      if (GraphTests.hasMultipleEdges(var1)) {
         throw new IllegalArgumentException("Graphs with multiple edges not supported");
      }

      this.scores = null;
      this.overflowStrategy = var2;
      if (var3 == null) {
         this.startVertices = var1.vertexSet();
         this.divideByTwo = var1.getType().isUndirected();
      } else {
         this.startVertices = var3;
         this.divideByTwo = false;
      }
   }

   @Override
   public Map<E, Double> getScores() {
      if (this.scores == null) {
         this.scores = this.graph.getType().isWeighted()
            ? new EdgeBetweennessCentrality.WeightedAlgorithm().getScores()
            : new EdgeBetweennessCentrality.Algorithm().getScores();
      }

      return Collections.unmodifiableMap(this.scores);
   }

   public Double getEdgeScore(E var1) {
      if (!this.graph.containsEdge((E)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown edge");
      }

      if (this.scores == null) {
         this.scores = this.graph.getType().isWeighted()
            ? new EdgeBetweennessCentrality.WeightedAlgorithm().getScores()
            : new EdgeBetweennessCentrality.Algorithm().getScores();
      }

      return this.scores.get(var1);
   }

   private class Algorithm {
      protected Map<E, Double> scores = new HashMap<>();
      protected Deque<V> stack = new ArrayDeque();

      public Map<E, Double> getScores() {
         for (Object var2 : EdgeBetweennessCentrality.this.graph.iterables().edges()) {
            this.scores.put((E)var2, 0.0);
         }

         for (Object var4 : EdgeBetweennessCentrality.this.startVertices) {
            this.singleVertexUpdate((V)var4);
         }

         if (EdgeBetweennessCentrality.this.divideByTwo) {
            this.scores.forEach((var1, var2x) -> this.scores.put((E)var1, var2x / 2.0));
         }

         return this.scores;
      }

      protected void singleVertexUpdate(V var1) {
         HashMap var2 = new HashMap();
         HashMap var3 = new HashMap();
         HashMap var4 = new HashMap();
         ArrayDeque var5 = new ArrayDeque();

         for (Object var7 : EdgeBetweennessCentrality.this.graph.vertexSet()) {
            var4.put(var7, 0L);
         }

         var4.put(var1, 1L);
         var3.put(var1, 0.0);
         var5.add(var1);

         while (!var5.isEmpty()) {
            Object var20 = var5.remove();
            this.stack.push((V)var20);
            double var21 = (Double)var3.get(var20);

            for (Object var10 : EdgeBetweennessCentrality.this.graph.outgoingEdgesOf((V)var20)) {
               Object var11 = Graphs.getOppositeVertex(EdgeBetweennessCentrality.this.graph, (E)var10, (V)var20);
               if (!var11.equals(var20)) {
                  if (!var3.containsKey(var11)) {
                     var3.put(var11, var21 + 1.0);
                     var5.add(var11);
                  }

                  double var12 = (Double)var3.get(var11);
                  if (Double.compare(var12, var21 + 1.0) == 0) {
                     long var14 = (Long)var4.get(var11);
                     long var16 = (Long)var4.get(var20);
                     long var18 = var14 + var16;
                     if (EdgeBetweennessCentrality.this.overflowStrategy.equals(EdgeBetweennessCentrality.OverflowStrategy.THROW_EXCEPTION_ON_OVERFLOW)
                        && var18 < 0L) {
                        throw new ArithmeticException("long overflow");
                     }

                     var4.put(var11, var18);
                     var2.computeIfAbsent(var11, var0 -> new ArrayList<>()).add(var10);
                  }
               }
            }
         }

         this.accumulate(var2, var4);
      }

      protected void accumulate(Map<V, List<E>> var1, Map<V, Long> var2) {
         HashMap var3 = new HashMap();

         for (Object var5 : EdgeBetweennessCentrality.this.graph.iterables().vertices()) {
            var3.put(var5, 0.0);
         }

         while (!this.stack.isEmpty()) {
            Object var11 = this.stack.pop();
            List var12 = (List)var1.get(var11);
            if (var12 != null) {
               for (Object var7 : var12) {
                  Object var8 = Graphs.getOppositeVertex(EdgeBetweennessCentrality.this.graph, (E)var7, (V)var11);
                  double var9 = ((Long)var2.get(var8)).doubleValue() / ((Long)var2.get(var11)).doubleValue() * (1.0 + (Double)var3.get(var11));
                  this.scores.put((E)var7, this.scores.get(var7) + var9);
                  var3.put(var8, (Double)var3.get(var8) + var9);
               }
            }
         }
      }
   }

   public enum OverflowStrategy {
      IGNORE_OVERFLOW,
      THROW_EXCEPTION_ON_OVERFLOW;
   }

   private class WeightedAlgorithm extends EdgeBetweennessCentrality<V, E>.Algorithm {
      @Override
      protected void singleVertexUpdate(V var1) {
         HashMap var2 = new HashMap();
         HashMap var3 = new HashMap();
         HashMap var4 = new HashMap();
         PairingHeap var5 = new PairingHeap();

         for (Object var7 : EdgeBetweennessCentrality.this.graph.vertexSet()) {
            var4.put(var7, 0L);
         }

         var4.put(var1, 1L);
         var3.put(var1, var5.insert(0.0, var1));

         while (!var5.isEmpty()) {
            AddressableHeap.Handle var24 = var5.deleteMin();
            Object var25 = var24.getValue();
            double var8 = (Double)var24.getKey();
            this.stack.push((V)var25);

            for (Object var11 : EdgeBetweennessCentrality.this.graph.outgoingEdgesOf((V)var25)) {
               Object var12 = Graphs.getOppositeVertex(EdgeBetweennessCentrality.this.graph, (E)var11, (V)var25);
               if (!var12.equals(var25)) {
                  double var13 = EdgeBetweennessCentrality.this.graph.getEdgeWeight((E)var11);
                  if (var13 < 0.0) {
                     throw new IllegalArgumentException("Negative edge weights are not allowed");
                  }

                  double var15 = var8 + var13;
                  AddressableHeap.Handle var17 = (AddressableHeap.Handle)var3.get(var12);
                  if (var17 == null) {
                     var17 = var5.insert(var15, var12);
                     var3.put(var12, var17);
                     var4.put(var12, 0L);
                     var2.put(var12, new ArrayList());
                  } else if (Double.compare((Double)var17.getKey(), var15) > 0) {
                     var17.decreaseKey(var15);
                     var4.put(var12, 0L);
                     var2.put(var12, new ArrayList());
                  }

                  if (Double.compare((Double)var17.getKey(), var15) == 0) {
                     long var18 = (Long)var4.get(var12);
                     long var20 = (Long)var4.get(var25);
                     long var22 = var18 + var20;
                     if (EdgeBetweennessCentrality.this.overflowStrategy.equals(EdgeBetweennessCentrality.OverflowStrategy.THROW_EXCEPTION_ON_OVERFLOW)
                        && var22 < 0L) {
                        throw new ArithmeticException("long overflow");
                     }

                     var4.put(var12, var22);
                     var2.computeIfAbsent(var12, var0 -> new ArrayList<>()).add(var11);
                  }
               }
            }
         }

         this.accumulate(var2, var4);
      }
   }
}
