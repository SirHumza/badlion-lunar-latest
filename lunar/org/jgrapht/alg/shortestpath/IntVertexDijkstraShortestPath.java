package org.jgrapht.alg.shortestpath;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;
import org.jheaps.AddressableHeap;
import org.jheaps.array.DaryArrayAddressableHeap;

public final class IntVertexDijkstraShortestPath<E> extends BaseShortestPathAlgorithm<Integer, E> {
   private final Supplier<AddressableHeap<Double, Integer>> heapSupplier;

   public IntVertexDijkstraShortestPath(Graph<Integer, E> var1) {
      this(var1, () -> new DaryArrayAddressableHeap<>(4));
   }

   public IntVertexDijkstraShortestPath(Graph<Integer, E> var1, Supplier<AddressableHeap<Double, Integer>> var2) {
      super(var1);
      this.heapSupplier = var2;
   }

   public static <E> GraphPath<Integer, E> findPathBetween(Graph<Integer, E> var0, Integer var1, Integer var2) {
      return new IntVertexDijkstraShortestPath<E>(var0).getPath(var1, var2);
   }

   public GraphPath<Integer, E> getPath(Integer var1, Integer var2) {
      if (!this.graph.containsVertex(var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      } else if (!this.graph.containsVertex(var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      } else {
         return new IntVertexDijkstraShortestPath.Algorithm().getPath(var1, var2);
      }
   }

   public ShortestPathAlgorithm.SingleSourcePaths<Integer, E> getPaths(Integer var1) {
      if (!this.graph.containsVertex(var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      } else {
         return new IntVertexDijkstraShortestPath.Algorithm().getPaths(var1);
      }
   }

   private class Algorithm {
      private int totalVertices = IntVertexDijkstraShortestPath.this.graph.vertexSet().size();
      private AddressableHeap<Double, Integer> heap;
      private AddressableHeap.Handle<Double, Integer>[] nodes = (AddressableHeap.Handle<Double, Integer>[])Array.newInstance(
         AddressableHeap.Handle.class, this.totalVertices
      );
      private double[] dist;
      private E[] pred;
      private IntVertexDijkstraShortestPath<E>.IdentifierMap idMap;

      public Algorithm() {
         this.heap = IntVertexDijkstraShortestPath.this.heapSupplier.get();
         this.dist = new double[this.totalVertices];
         this.pred = (E[])(new Object[this.totalVertices]);
         boolean var2 = false;
         int var3 = 0;

         for (Integer var5 : IntVertexDijkstraShortestPath.this.graph.vertexSet()) {
            if (var5 < 0 || var5 >= this.totalVertices) {
               var2 = true;
            }

            this.dist[var3] = Double.POSITIVE_INFINITY;
            this.pred[var3] = null;
            var3++;
         }

         if (var2) {
            this.idMap = IntVertexDijkstraShortestPath.this.new IdentifierMap(this.totalVertices);
            var3 = 0;

            for (Integer var8 : IntVertexDijkstraShortestPath.this.graph.vertexSet()) {
               this.idMap.put(var8, var3++);
            }
         }
      }

      public ShortestPathAlgorithm.SingleSourcePaths<Integer, E> getPaths(Integer var1) {
         return this.idMap == null ? this.getPathsWithoutIdMap(var1, null) : this.getPathsWithIdMap(var1, null);
      }

      public ShortestPathAlgorithm.SingleSourcePaths<Integer, E> getPathsWithoutIdMap(Integer var1, Integer var2) {
         this.dist[var1] = 0.0;
         this.pred[var1] = null;
         this.nodes[var1] = this.heap.insert(0.0, var1);

         while (!this.heap.isEmpty()) {
            AddressableHeap.Handle var3 = this.heap.deleteMin();
            Integer var4 = (Integer)var3.getValue();
            double var5 = (Double)var3.getKey();
            this.dist[var4] = var5;
            if (var2 != null && var4 == var2) {
               break;
            }

            for (Object var8 : IntVertexDijkstraShortestPath.this.graph.outgoingEdgesOf(var4)) {
               Integer var9 = Graphs.getOppositeVertex(IntVertexDijkstraShortestPath.this.graph, (E)var8, var4);
               double var10 = IntVertexDijkstraShortestPath.this.graph.getEdgeWeight((E)var8);
               if (var10 < 0.0) {
                  throw new IllegalArgumentException("Negative edge weight not allowed");
               }

               AddressableHeap.Handle var12 = this.nodes[var9];
               double var13 = var5 + var10;
               if (var12 == null) {
                  this.nodes[var9] = this.heap.insert(var13, var9);
                  this.pred[var9] = (E)var8;
               } else if (var13 < (Double)var12.getKey()) {
                  var12.decreaseKey(var13);
                  this.pred[var9] = (E)var8;
               }
            }
         }

         return IntVertexDijkstraShortestPath.this.new ArrayBasedSingleSourcePathsImpl(var1, this.dist, this.pred, this.idMap);
      }

      public ShortestPathAlgorithm.SingleSourcePaths<Integer, E> getPathsWithIdMap(Integer var1, Integer var2) {
         this.dist[this.idMap.get(var1)] = 0.0;
         this.pred[this.idMap.get(var1)] = null;
         this.nodes[this.idMap.get(var1)] = this.heap.insert(0.0, var1);

         while (!this.heap.isEmpty()) {
            AddressableHeap.Handle var3 = this.heap.deleteMin();
            Integer var4 = (Integer)var3.getValue();
            double var5 = (Double)var3.getKey();
            this.dist[this.idMap.get(var4)] = var5;
            if (var2 != null && var4 == var2) {
               break;
            }

            for (Object var8 : IntVertexDijkstraShortestPath.this.graph.outgoingEdgesOf(var4)) {
               Integer var9 = Graphs.getOppositeVertex(IntVertexDijkstraShortestPath.this.graph, (E)var8, var4);
               double var10 = IntVertexDijkstraShortestPath.this.graph.getEdgeWeight((E)var8);
               if (var10 < 0.0) {
                  throw new IllegalArgumentException("Negative edge weight not allowed");
               }

               AddressableHeap.Handle var12 = this.nodes[this.idMap.get(var9)];
               double var13 = var5 + var10;
               if (var12 == null) {
                  this.nodes[this.idMap.get(var9)] = this.heap.insert(var13, var9);
                  this.pred[this.idMap.get(var9)] = (E)var8;
               } else if (var13 < (Double)var12.getKey()) {
                  var12.decreaseKey(var13);
                  this.pred[this.idMap.get(var9)] = (E)var8;
               }
            }
         }

         return IntVertexDijkstraShortestPath.this.new ArrayBasedSingleSourcePathsImpl(var1, this.dist, this.pred, this.idMap);
      }

      public GraphPath<Integer, E> getPath(Integer var1, Integer var2) {
         return this.idMap == null ? this.getPathsWithoutIdMap(var1, var2).getPath(var2) : this.getPathsWithIdMap(var1, var2).getPath(var2);
      }
   }

   private class ArrayBasedSingleSourcePathsImpl implements Serializable, ShortestPathAlgorithm.SingleSourcePaths<Integer, E> {
      private static final long serialVersionUID = 2912496450441089175L;
      private Integer source;
      private double[] dist;
      private Object[] pred;
      private IntVertexDijkstraShortestPath<E>.IdentifierMap idMap;

      public ArrayBasedSingleSourcePathsImpl(Integer var2, double[] var3, E[] var4, IntVertexDijkstraShortestPath<E>.IdentifierMap var5) {
         this.source = var2;
         this.dist = var3;
         this.pred = var4;
         this.idMap = var5;
      }

      @Override
      public Graph<Integer, E> getGraph() {
         return IntVertexDijkstraShortestPath.this.graph;
      }

      public Integer getSourceVertex() {
         return this.source;
      }

      public double getWeight(Integer var1) {
         return this.idMap == null ? this.dist[var1] : this.dist[this.idMap.get(var1)];
      }

      public GraphPath<Integer, E> getPath(Integer var1) {
         if (this.source.equals(var1)) {
            return GraphWalk.singletonWalk(IntVertexDijkstraShortestPath.this.graph, this.source, 0.0);
         }

         ArrayDeque var2 = new ArrayDeque();
         Integer var3 = var1;
         double var4;
         if (this.idMap != null) {
            if (this.pred[this.idMap.get(var3)] == null) {
               return null;
            }

            Object var6;
            while ((var6 = this.pred[this.idMap.get(var3)]) != null) {
               var2.addFirst(var6);
               var3 = Graphs.getOppositeVertex(IntVertexDijkstraShortestPath.this.graph, (E)var6, var3);
            }

            var4 = this.dist[this.idMap.get(var1)];
         } else {
            if (this.pred[var3] == null) {
               return null;
            }

            Object var7;
            while ((var7 = this.pred[var3]) != null) {
               var2.addFirst(var7);
               var3 = Graphs.getOppositeVertex(IntVertexDijkstraShortestPath.this.graph, (E)var7, var3);
            }

            var4 = this.dist[var1];
         }

         return new GraphWalk<>(IntVertexDijkstraShortestPath.this.graph, this.source, var1, null, new ArrayList<>(var2), var4);
      }
   }

   private class IdentifierMap {
      private int[] keys;
      private int[] values;
      private int m;

      public IdentifierMap(int var2) {
         this.m = var2;
         this.keys = new int[var2];
         Arrays.fill(this.keys, -1);
         this.values = new int[var2];
      }

      public void put(int var1, int var2) {
         int var3;
         for (var3 = this.hash(var1); this.keys[var3] != -1; var3 = (var3 + 1) % this.m) {
            if (this.keys[var3] == var1) {
               this.values[var3] = var2;
               return;
            }
         }

         this.keys[var3] = var1;
         this.values[var3] = var2;
      }

      public int get(int var1) {
         for (int var2 = this.hash(var1); this.keys[var2] != -1; var2 = (var2 + 1) % this.m) {
            if (this.keys[var2] == var1) {
               return this.values[var2];
            }
         }

         return -1;
      }

      private int hash(int var1) {
         return (var1 & 2147483647) % this.m;
      }
   }
}
