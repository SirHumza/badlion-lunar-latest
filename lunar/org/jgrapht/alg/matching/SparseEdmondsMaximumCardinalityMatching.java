package org.jgrapht.alg.matching;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.util.FixedSizeIntegerQueue;
import org.jgrapht.util.CollectionUtil;

public class SparseEdmondsMaximumCardinalityMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private MatchingAlgorithm<V, E> initializer;
   private MatchingAlgorithm.Matching<V, E> result;
   private Map<V, Integer> oddSetCover;

   public SparseEdmondsMaximumCardinalityMatching(Graph<V, E> var1) {
      this(var1, new GreedyMaximumCardinalityMatching<>(var1, false));
   }

   public SparseEdmondsMaximumCardinalityMatching(Graph<V, E> var1, MatchingAlgorithm<V, E> var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.initializer = var2;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      if (this.result == null) {
         SparseEdmondsMaximumCardinalityMatching.Algorithm var1 = new SparseEdmondsMaximumCardinalityMatching.Algorithm<>(this.graph, this.initializer);
         Set var2 = var1.computeMatching();
         int var3 = var2.size();
         this.result = new MatchingAlgorithm.MatchingImpl<>(this.graph, var2, var3);
         this.oddSetCover = var1.computeOddSetCover();
      }

      return this.result;
   }

   public Map<V, Integer> getOddSetCover() {
      this.getMatching();
      return this.oddSetCover;
   }

   public static <V, E> boolean isOptimalMatching(Graph<V, E> var0, Set<E> var1, Map<V, Integer> var2) {
      HashSet var3 = new HashSet();

      for (Object var5 : var1) {
         Object var6 = var0.getEdgeSource(var5);
         if (!var3.add(var6)) {
            return false;
         }

         Object var7 = var0.getEdgeTarget(var5);
         if (!var3.add(var7)) {
            return false;
         }
      }

      int var14 = Math.max(2, var0.vertexSet().size());
      int var15 = 1;
      int[] var16 = new int[var14];

      for (int var17 = 0; var17 < var14; var17++) {
         var16[var17] = 0;
      }

      for (Object var8 : var0.vertexSet()) {
         Integer var9 = (Integer)var2.get(var8);
         if (var9 < 0 || var9 >= var14) {
            return false;
         }

         var16[var9]++;
         if (var9 > var15) {
            var15 = var9;
         }
      }

      int var19 = var16[1];

      for (int var20 = 2; var20 <= var15; var20++) {
         var19 += var16[var20] / 2;
      }

      if (var19 != var1.size()) {
         return false;
      }

      for (Object var22 : var0.edgeSet()) {
         Object var10 = var0.getEdgeSource(var22);
         Object var11 = var0.getEdgeTarget(var22);
         int var12 = (Integer)var2.get(var10);
         int var13 = (Integer)var2.get(var11);
         if (!var10.equals(var11) && var12 != 1 && var13 != 1 && (var12 != var13 || var12 < 2)) {
            return false;
         }
      }

      return true;
   }

   private static class Algorithm<V, E> {
      private static final int NULL = -1;
      private final Graph<V, E> graph;
      private MatchingAlgorithm<V, E> initializer;
      private int nodes;
      private Map<V, Integer> vertexIndexMap;
      private V[] vertexMap;
      private int[] mate;
      private SparseEdmondsMaximumCardinalityMatching.Algorithm.Label[] label;
      private int[] pred;
      double strue;
      private double[] path1;
      private double[] path2;
      private int[] sourceBridge;
      private int[] targetBridge;
      private SparseEdmondsMaximumCardinalityMatching.VertexPartition base;
      private FixedSizeIntegerQueue queue;
      private List<Integer> labeledNodes;

      public Algorithm(Graph<V, E> var1, MatchingAlgorithm<V, E> var2) {
         this.graph = var1;
         this.initializer = var2;
      }

      private void initialize() {
         this.nodes = this.graph.vertexSet().size();
         this.vertexIndexMap = CollectionUtil.newHashMapWithExpectedSize(this.nodes);
         this.vertexMap = (V[])(new Object[this.nodes]);
         int var1 = 0;

         for (Object var3 : this.graph.vertexSet()) {
            this.vertexIndexMap.put((V)var3, var1);
            this.vertexMap[var1] = (V)var3;
            var1++;
         }

         this.mate = new int[this.nodes];
         this.base = new SparseEdmondsMaximumCardinalityMatching.VertexPartition(this.nodes);
         this.label = new SparseEdmondsMaximumCardinalityMatching.Algorithm.Label[this.nodes];
         this.pred = new int[this.nodes];
         this.path1 = new double[this.nodes];
         this.path2 = new double[this.nodes];
         this.sourceBridge = new int[this.nodes];
         this.targetBridge = new int[this.nodes];

         for (int var4 = 0; var4 < this.nodes; var4++) {
            this.mate[var4] = -1;
            this.label[var4] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.EVEN;
            this.pred[var4] = -1;
            this.path1[var4] = 0.0;
            this.path2[var4] = 0.0;
            this.sourceBridge[var4] = -1;
            this.targetBridge[var4] = -1;
         }

         this.strue = 0.0;
         this.queue = new FixedSizeIntegerQueue(this.nodes);
         this.labeledNodes = new ArrayList<>();
      }

      private void runInitializer() {
         if (this.initializer != null) {
            for (Object var2 : this.initializer.getMatching()) {
               Object var3 = this.graph.getEdgeSource((E)var2);
               Object var4 = this.graph.getEdgeTarget((E)var2);
               int var5 = this.vertexIndexMap.get(var3);
               int var6 = this.vertexIndexMap.get(var4);
               this.mate[var5] = var6;
               this.label[var5] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED;
               this.mate[var6] = var5;
               this.label[var6] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED;
            }
         }
      }

      private void findPath(Deque<Integer> var1, int var2, int var3) {
         if (var2 == var3) {
            var1.add(var2);
         } else if (this.label[var2] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.EVEN) {
            var1.add(var2);
            var1.add(this.mate[var2]);
            this.findPath(var1, this.pred[this.mate[var2]], var3);
         } else {
            var1.add(var2);
            ArrayDeque var4 = new ArrayDeque();
            this.findPath(var4, this.sourceBridge[var2], this.mate[var2]);

            while (!var4.isEmpty()) {
               var1.add((Integer)var4.removeLast());
            }

            this.findPath(var1, this.targetBridge[var2], var3);
         }
      }

      private void shrinkPath(int var1, int var2, int var3) {
         int var4 = this.base.find(var2);

         while (var4 != var1) {
            this.base.union(var4, var1);
            var4 = this.mate[var4];
            this.base.union(var4, var1);
            this.base.name(var1);
            this.queue.enqueue(var4);
            this.sourceBridge[var4] = var2;
            this.targetBridge[var4] = var3;
            var4 = this.base.find(this.pred[var4]);
         }
      }

      public Set<E> computeMatching() {
         this.initialize();
         this.runInitializer();

         for (int var1 = 0; var1 < this.nodes; var1++) {
            if (this.mate[var1] == -1) {
               this.queue.clear();
               this.queue.enqueue(var1);
               this.labeledNodes.clear();
               this.labeledNodes.add(var1);
               boolean var2 = false;

               while (!var2 && !this.queue.isEmpty()) {
                  int var3 = this.queue.poll();
                  Object var4 = this.vertexMap[var3];

                  for (Object var6 : this.graph.edgesOf((V)var4)) {
                     Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var4);
                     int var8 = this.vertexIndexMap.get(var7);
                     if (this.base.find(var3) != this.base.find(var8)
                        && this.label[this.base.find(var8)] != SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.ODD) {
                        if (this.label[var8] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED) {
                           this.label[var8] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.ODD;
                           this.labeledNodes.add(var8);
                           this.pred[var8] = var3;
                           this.label[this.mate[var8]] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.EVEN;
                           this.labeledNodes.add(this.mate[var8]);
                           this.queue.enqueue(this.mate[var8]);
                        } else {
                           int var9 = this.base.find(var3);
                           int var10 = this.base.find(var8);
                           this.strue++;
                           this.path1[var9] = this.strue;
                           this.path2[var10] = this.strue;

                           while (this.path1[var10] != this.strue && this.path2[var9] != this.strue && (this.mate[var9] != -1 || this.mate[var10] != -1)) {
                              if (this.mate[var9] != -1) {
                                 var9 = this.base.find(this.pred[this.mate[var9]]);
                                 this.path1[var9] = this.strue;
                              }

                              if (this.mate[var10] != -1) {
                                 var10 = this.base.find(this.pred[this.mate[var10]]);
                                 this.path2[var10] = this.strue;
                              }
                           }

                           if (this.path1[var10] != this.strue && this.path2[var9] != this.strue) {
                              ArrayDeque var21 = new ArrayDeque();
                              this.findPath(var21, var3, var9);
                              var21.addFirst(var8);

                              while (!var21.isEmpty()) {
                                 int var12 = (Integer)var21.pop();
                                 int var13 = (Integer)var21.pop();
                                 this.mate[var12] = var13;
                                 this.mate[var13] = var12;
                              }

                              this.labeledNodes.add(var8);

                              for (Integer var23 : this.labeledNodes) {
                                 this.label[var23] = SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED;
                              }

                              this.base.split(this.labeledNodes);
                              var2 = true;
                              break;
                           }

                           int var11 = this.path1[var10] == this.strue ? var10 : var9;
                           this.shrinkPath(var11, var3, var8);
                           this.shrinkPath(var11, var8, var3);
                        }
                     }
                  }
               }
            }
         }

         HashSet var14 = new HashSet();

         for (Object var16 : this.graph.edgeSet()) {
            Object var17 = this.graph.getEdgeSource((E)var16);
            Object var18 = this.graph.getEdgeTarget((E)var16);
            if (!var17.equals(var18)) {
               int var19 = this.vertexIndexMap.get(var17);
               int var20 = this.vertexIndexMap.get(var18);
               if (var19 != var20 && this.mate[var19] == var20) {
                  var14.add(var16);
                  this.mate[var19] = var19;
                  this.mate[var20] = var20;
               }
            }
         }

         return var14;
      }

      public Map<V, Integer> computeOddSetCover() {
         int[] var1 = new int[this.nodes];
         Arrays.fill(var1, -1);
         int var2 = 0;
         int var3 = -1;

         for (int var4 = 0; var4 < this.nodes; var4++) {
            if (this.label[var4] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED) {
               var2++;
               var3 = var4;
            }
         }

         if (var2 > 0) {
            var1[var3] = 1;
            int var7 = var2 == 2 ? 0 : 2;

            for (int var5 = 0; var5 < this.nodes; var5++) {
               if (this.label[var5] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.UNLABELED && var5 != var3) {
                  var1[var5] = var7;
               }
            }
         }

         int var8 = var2 <= 2 ? 2 : 3;

         for (int var9 = 0; var9 < this.nodes; var9++) {
            if (this.base.find(var9) != var9 && var1[this.base.find(var9)] == -1) {
               var1[this.base.find(var9)] = var8++;
            }
         }

         for (int var10 = 0; var10 < this.nodes; var10++) {
            if (this.base.find(var10) == var10 && var1[var10] == -1) {
               if (this.label[var10] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.EVEN) {
                  var1[var10] = 0;
               }

               if (this.label[var10] == SparseEdmondsMaximumCardinalityMatching.Algorithm.Label.ODD) {
                  var1[var10] = 1;
               }
            }

            if (this.base.find(var10) != var10) {
               var1[var10] = var1[this.base.find(var10)];
            }
         }

         HashMap var11 = new HashMap();

         for (int var6 = 0; var6 < this.nodes; var6++) {
            var11.put(this.vertexMap[var6], var1[var6]);
         }

         return var11;
      }

      private enum Label {
         EVEN,
         ODD,
         UNLABELED;
      }
   }

   private static class VertexPartition {
      private SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item[] items;

      public VertexPartition(int var1) {
         this.items = new SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.items[var2] = new SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item(var2);
         }
      }

      public int find(int var1) {
         return this.findItem(var1).rep;
      }

      public void union(int var1, int var2) {
         assert var1 >= 0 && var1 < this.items.length;
         assert var2 >= 0 && var2 < this.items.length;
         SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var3 = this.findItem(var1);
         SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var4 = this.findItem(var2);
         if (var3 != var4) {
            if (var3.rank > var4.rank) {
               var4.parent = var3;
            } else if (var3.rank < var4.rank) {
               var3.parent = var4;
            } else {
               var4.parent = var3;
               var3.rank++;
            }
         }
      }

      public void name(int var1) {
         SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var2 = this.findItem(var1);
         var2.rep = var1;
      }

      public void split(List<Integer> var1) {
         for (int var3 : var1) {
            SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var4 = this.items[var3];
            var4.parent = var4;
            var4.rep = var3;
            var4.rank = 0;
         }
      }

      private SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item findItem(int var1) {
         assert var1 >= 0 && var1 < this.items.length;
         SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var2 = this.items[var1];

         while (true) {
            SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var3 = var2.parent;
            if (var3.equals(var2)) {
               var3 = var2;
               var2 = this.items[var1];

               while (!var2.equals(var3)) {
                  SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item var4 = var2.parent;
                  var2.parent = var3;
                  var2 = var4;
               }

               return var3;
            }

            var2 = var3;
         }
      }

      private static class Item {
         public int rep;
         public int rank;
         SparseEdmondsMaximumCardinalityMatching.VertexPartition.Item parent;

         public Item(int var1) {
            this.rep = var1;
            this.rank = 0;
            this.parent = this;
         }
      }
   }
}
