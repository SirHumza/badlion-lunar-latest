package org.jgrapht.alg.scoring;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class BetweennessCentrality<V, E> implements VertexScoringAlgorithm<V, Double> {
   private final Graph<V, E> graph;
   private final boolean normalize;
   private Map<V, Double> scores;
   private BetweennessCentrality.OverflowStrategy overflowStrategy;

   public BetweennessCentrality(Graph<V, E> var1) {
      this(var1, false);
   }

   public BetweennessCentrality(Graph<V, E> var1, boolean var2) {
      this(var1, var2, BetweennessCentrality.OverflowStrategy.IGNORE_OVERFLOW);
   }

   public BetweennessCentrality(Graph<V, E> var1, boolean var2, BetweennessCentrality.OverflowStrategy var3) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      this.scores = null;
      this.normalize = var2;
      this.overflowStrategy = var3;
   }

   @Override
   public Map<V, Double> getScores() {
      if (this.scores == null) {
         this.compute();
      }

      return Collections.unmodifiableMap(this.scores);
   }

   public Double getVertexScore(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      }

      if (this.scores == null) {
         this.compute();
      }

      return this.scores.get(var1);
   }

   private void compute() {
      this.scores = new HashMap<>();
      this.graph.vertexSet().forEach(var1x -> this.scores.put((V)var1x, 0.0));
      this.graph.vertexSet().forEach(this::compute);
      if (!this.graph.getType().isDirected()) {
         this.scores.forEach((var1x, var2x) -> this.scores.put((V)var1x, var2x / 2.0));
      }

      if (this.normalize) {
         int var1 = this.graph.vertexSet().size();
         int var2 = (var1 - 1) * (var1 - 2);
         if (var2 != 0) {
            this.scores.forEach((var2x, var3) -> this.scores.put((V)var2x, var3 / var2));
         }
      }
   }

   private void compute(V var1) {
      ArrayDeque var2 = new ArrayDeque();
      HashMap var3 = new HashMap();
      this.graph.vertexSet().forEach(var1x -> var3.put(var1x, new ArrayList()));
      HashMap var4 = new HashMap();
      this.graph.vertexSet().forEach(var1x -> var4.put(var1x, 0L));
      var4.put(var1, 1L);
      HashMap var5 = new HashMap();
      this.graph.vertexSet().forEach(var1x -> var5.put(var1x, Double.POSITIVE_INFINITY));
      var5.put(var1, 0.0);
      BetweennessCentrality.MyQueue var6 = this.graph.getType().isWeighted()
         ? new BetweennessCentrality.WeightedQueue()
         : new BetweennessCentrality.UnweightedQueue();
      var6.insert(var1, 0.0);

      while (!var6.isEmpty()) {
         Object var7 = var6.remove();
         var2.push(var7);

         for (Object var9 : this.graph.outgoingEdgesOf((V)var7)) {
            Object var10 = Graphs.getOppositeVertex(this.graph, (E)var9, (V)var7);
            double var11 = this.graph.getEdgeWeight((E)var9);
            if (var11 < 0.0) {
               throw new IllegalArgumentException("Negative edge weight not allowed");
            }

            double var13 = (Double)var5.get(var7) + var11;
            if ((Double)var5.get(var10) == Double.POSITIVE_INFINITY) {
               var6.insert(var10, var13);
               var5.put(var10, var13);
               var4.put(var10, (Long)var4.get(var7));
               ((List)var3.get(var10)).add(var7);
            } else if ((Double)var5.get(var10) == var13) {
               long var15 = (Long)var4.get(var10);
               long var17 = (Long)var4.get(var7);
               long var19 = var15 + var17;
               if (this.overflowStrategy.equals(BetweennessCentrality.OverflowStrategy.THROW_EXCEPTION_ON_OVERFLOW) && var19 < 0L) {
                  throw new ArithmeticException("long overflow");
               }

               var4.put(var10, var19);
               ((List)var3.get(var10)).add(var7);
            } else if ((Double)var5.get(var10) > var13) {
               var6.update(var10, var13);
               var5.put(var10, var13);
               var4.put(var10, (Long)var4.get(var7));
               ((List)var3.get(var10)).clear();
               ((List)var3.get(var10)).add(var7);
            }
         }
      }

      HashMap var21 = new HashMap();
      this.graph.vertexSet().forEach(var1x -> var21.put(var1x, 0.0));

      while (!var2.isEmpty()) {
         Object var22 = var2.pop();

         for (Object var24 : (List)var3.get(var22)) {
            var21.put(
               var24,
               (Double)var21.get(var24) + ((Long)var4.get(var24)).doubleValue() / ((Long)var4.get(var22)).doubleValue() * (1.0 + (Double)var21.get(var22))
            );
         }

         if (!var22.equals(var1)) {
            this.scores.put((V)var22, this.scores.get(var22) + (Double)var21.get(var22));
         }
      }
   }

   private interface MyQueue<T, D> {
      void insert(T var1, D var2);

      void update(T var1, D var2);

      T remove();

      boolean isEmpty();
   }

   public enum OverflowStrategy {
      IGNORE_OVERFLOW,
      THROW_EXCEPTION_ON_OVERFLOW;
   }

   private class UnweightedQueue implements BetweennessCentrality.MyQueue<V, Double> {
      Queue<V> delegate = new ArrayDeque();

      public void insert(V var1, Double var2) {
         this.delegate.add((V)var1);
      }

      public void update(V var1, Double var2) {
      }

      @Override
      public V remove() {
         return this.delegate.remove();
      }

      @Override
      public boolean isEmpty() {
         return this.delegate.isEmpty();
      }
   }

   private class WeightedQueue implements BetweennessCentrality.MyQueue<V, Double> {
      AddressableHeap<Double, V> delegate = new PairingHeap<>();
      Map<V, AddressableHeap.Handle<Double, V>> seen = new HashMap<>();

      public void insert(V var1, Double var2) {
         AddressableHeap.Handle var3 = this.delegate.insert(var2, (V)var1);
         this.seen.put((V)var1, var3);
      }

      public void update(V var1, Double var2) {
         if (!this.seen.containsKey(var1)) {
            throw new IllegalArgumentException("Element " + var1 + " does not exist in queue");
         }

         this.seen.get(var1).decreaseKey(var2);
      }

      @Override
      public V remove() {
         return this.delegate.deleteMin().getValue();
      }

      @Override
      public boolean isEmpty() {
         return this.delegate.isEmpty();
      }
   }
}
