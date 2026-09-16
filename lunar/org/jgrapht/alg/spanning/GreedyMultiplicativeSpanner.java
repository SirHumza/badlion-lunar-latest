package org.jgrapht.alg.spanning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.SpannerAlgorithm;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.CollectionUtil;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class GreedyMultiplicativeSpanner<V, E> implements SpannerAlgorithm<E> {
   private final Graph<V, E> graph;
   private final int k;
   private static final int MAX_K = 536870912;

   public GreedyMultiplicativeSpanner(Graph<V, E> var1, int var2) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      if (!var1.getType().isUndirected()) {
         throw new IllegalArgumentException("graph is not undirected");
      }

      if (var2 <= 0) {
         throw new IllegalArgumentException("k should be positive in (2k-1)-spanner construction");
      }

      this.k = Math.min(var2, 536870912);
   }

   @Override
   public SpannerAlgorithm.Spanner<E> getSpanner() {
      return this.graph.getType().isWeighted()
         ? new GreedyMultiplicativeSpanner.WeightedSpannerAlgorithm().run()
         : new GreedyMultiplicativeSpanner.UnweightedSpannerAlgorithm().run();
   }

   private abstract class SpannerAlgorithmBase {
      public abstract boolean isSpannerReachable(V var1, V var2, double var3);

      public abstract void addSpannerEdge(V var1, V var2, double var3);

      public SpannerAlgorithm.Spanner<E> run() {
         ArrayList var1 = new ArrayList<>(GreedyMultiplicativeSpanner.this.graph.edgeSet());
         var1.sort(Comparator.comparingDouble(GreedyMultiplicativeSpanner.this.graph::getEdgeWeight));
         double var2 = GreedyMultiplicativeSpanner.this.graph.getEdgeWeight((E)var1.get(0));
         if (var2 < 0.0) {
            throw new IllegalArgumentException("Illegal edge weight: negative");
         }

         LinkedHashSet var4 = new LinkedHashSet();
         double var5 = 0.0;

         for (Object var8 : var1) {
            Object var9 = GreedyMultiplicativeSpanner.this.graph.getEdgeSource((E)var8);
            Object var10 = GreedyMultiplicativeSpanner.this.graph.getEdgeTarget((E)var8);
            if (!var9.equals(var10)) {
               double var11 = GreedyMultiplicativeSpanner.this.graph.getEdgeWeight((E)var8);
               if (!this.isSpannerReachable(var9, var10, (2 * GreedyMultiplicativeSpanner.this.k - 1) * var11)) {
                  var4.add(var8);
                  var5 += var11;
                  this.addSpannerEdge(var9, var10, var11);
               }
            }
         }

         return new SpannerAlgorithm.SpannerImpl<>(var4, var5);
      }
   }

   private class UnweightedSpannerAlgorithm extends GreedyMultiplicativeSpanner<V, E>.SpannerAlgorithmBase {
      protected Graph<V, E> spanner = GraphTypeBuilder.<V, E>undirected()
         .allowingMultipleEdges(false)
         .allowingSelfLoops(false)
         .edgeSupplier(GreedyMultiplicativeSpanner.this.graph.getEdgeSupplier())
         .buildGraph();
      protected Map<V, Integer> vertexDistance;
      protected Deque<V> queue;
      protected Deque<V> touchedVertices = new ArrayDeque(GreedyMultiplicativeSpanner.this.graph.vertexSet().size());

      public UnweightedSpannerAlgorithm() {
         for (Object var3 : GreedyMultiplicativeSpanner.this.graph.vertexSet()) {
            this.spanner.addVertex((V)var3);
            this.touchedVertices.push((V)var3);
         }

         this.vertexDistance = CollectionUtil.newHashMapWithExpectedSize(GreedyMultiplicativeSpanner.this.graph.vertexSet().size());
         this.queue = new ArrayDeque();
      }

      @Override
      public boolean isSpannerReachable(V var1, V var2, double var3) {
         while (!this.touchedVertices.isEmpty()) {
            Object var5 = this.touchedVertices.pop();
            this.vertexDistance.put((V)var5, Integer.MAX_VALUE);
         }

         while (!this.queue.isEmpty()) {
            this.queue.pop();
         }

         this.touchedVertices.push((V)var1);
         this.queue.push((V)var1);
         this.vertexDistance.put((V)var1, 0);

         while (!this.queue.isEmpty()) {
            Object var11 = this.queue.pop();
            Integer var6 = this.vertexDistance.get(var11);
            if (var11.equals(var2)) {
               return var6.intValue() <= var3;
            }

            for (Object var8 : this.spanner.edgesOf((V)var11)) {
               Object var9 = Graphs.getOppositeVertex(this.spanner, (E)var8, (V)var11);
               Integer var10 = this.vertexDistance.get(var9);
               if (var10 == Integer.MAX_VALUE) {
                  this.touchedVertices.push((V)var9);
                  this.vertexDistance.put((V)var9, var6 + 1);
                  this.queue.push((V)var9);
               }
            }
         }

         return false;
      }

      @Override
      public void addSpannerEdge(V var1, V var2, double var3) {
         this.spanner.addEdge((V)var1, (V)var2);
      }
   }

   private class WeightedSpannerAlgorithm extends GreedyMultiplicativeSpanner<V, E>.SpannerAlgorithmBase {
      protected Graph<V, DefaultWeightedEdge> spanner = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
      protected AddressableHeap<Double, V> heap;
      protected Map<V, AddressableHeap.Handle<Double, V>> nodes;

      public WeightedSpannerAlgorithm() {
         for (Object var3 : GreedyMultiplicativeSpanner.this.graph.vertexSet()) {
            this.spanner.addVertex((V)var3);
         }

         this.heap = new PairingHeap<>();
         this.nodes = new LinkedHashMap<>();
      }

      @Override
      public boolean isSpannerReachable(V var1, V var2, double var3) {
         this.heap.clear();
         this.nodes.clear();
         AddressableHeap.Handle var5 = this.heap.insert(0.0, (V)var1);
         this.nodes.put((V)var1, var5);

         while (!this.heap.isEmpty()) {
            AddressableHeap.Handle var6 = this.heap.deleteMin();
            double var7 = (Double)var6.getKey();
            Object var9 = var6.getValue();
            if (var7 > var3) {
               return false;
            }

            if (var9.equals(var2)) {
               return true;
            }

            for (DefaultWeightedEdge var11 : this.spanner.edgesOf((V)var9)) {
               Object var12 = Graphs.getOppositeVertex(this.spanner, var11, (V)var9);
               AddressableHeap.Handle var13 = this.nodes.get(var12);
               double var14 = var7 + this.spanner.getEdgeWeight(var11);
               if (var13 == null) {
                  var13 = this.heap.insert(var14, (V)var12);
                  this.nodes.put((V)var12, var13);
               } else if (var14 < (Double)var13.getKey()) {
                  var13.decreaseKey(var14);
               }
            }
         }

         return false;
      }

      @Override
      public void addSpannerEdge(V var1, V var2, double var3) {
         Graphs.addEdge(this.spanner, (V)var1, (V)var2, var3);
      }
   }
}
