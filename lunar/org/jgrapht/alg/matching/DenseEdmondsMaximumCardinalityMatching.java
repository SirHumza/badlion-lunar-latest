package org.jgrapht.alg.matching;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.util.FixedSizeIntegerQueue;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.UnionFind;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.util.CollectionUtil;

public class DenseEdmondsMaximumCardinalityMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final MatchingAlgorithm<V, E> initializer;
   private List<V> vertices;
   private Map<V, Integer> vertexIndexMap;
   private DenseEdmondsMaximumCardinalityMatching.SimpleMatching matching;
   private int matchedVertices;
   private DenseEdmondsMaximumCardinalityMatching.Levels levels;
   private static final int NIL = -1;
   private FixedSizeIntegerQueue queue;
   private UnionFind<Integer> uf;
   private final Map<Integer, Pair<Integer, Integer>> bridges = new HashMap<>();
   private int[] path;
   private BitSet vAncestors;
   private BitSet wAncestors;

   public DenseEdmondsMaximumCardinalityMatching(Graph<V, E> var1) {
      this(var1, new GreedyMaximumCardinalityMatching<>(var1, false));
   }

   public DenseEdmondsMaximumCardinalityMatching(Graph<V, E> var1, MatchingAlgorithm<V, E> var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.initializer = var2;
   }

   private void init() {
      this.vertices = new ArrayList();
      this.vertices.addAll(this.graph.vertexSet());
      this.vertexIndexMap = new HashMap<>();

      for (int var1 = 0; var1 < this.vertices.size(); var1++) {
         this.vertexIndexMap.put(this.vertices.get(var1), var1);
      }

      this.matching = new DenseEdmondsMaximumCardinalityMatching.SimpleMatching(this.vertices.size());
      this.matchedVertices = 0;
      this.levels = new DenseEdmondsMaximumCardinalityMatching.Levels(this.vertices.size());
      this.queue = new FixedSizeIntegerQueue(this.vertices.size());
      this.uf = new UnionFind<>(new HashSet<>(this.vertexIndexMap.values()));
      this.path = new int[this.vertices.size()];
      this.vAncestors = new BitSet(this.vertices.size());
      this.wAncestors = new BitSet(this.vertices.size());
   }

   private void warmStart(MatchingAlgorithm<V, E> var1) {
      MatchingAlgorithm.Matching var2 = var1.getMatching();

      for (Object var4 : var2.getEdges()) {
         Object var5 = this.graph.getEdgeSource((E)var4);
         Object var6 = this.graph.getEdgeTarget((E)var4);
         this.matching.match(this.vertexIndexMap.get(var5), this.vertexIndexMap.get(var6));
      }

      this.matchedVertices = var2.getEdges().size() * 2;
   }

   private boolean augment() {
      this.levels.reset();
      this.uf.reset();
      this.bridges.clear();
      this.queue.clear();
      ArrayDeque var1 = new ArrayDeque<>(this.matching.getExposed());

      while (!var1.isEmpty()) {
         int var2 = (Integer)var1.pop();
         this.levels.setEven(var2, var2);
         this.queue.enqueue(var2);

         while (!this.queue.isEmpty()) {
            int var3 = this.queue.poll();

            for (Object var5 : Graphs.neighborListOf(this.graph, this.vertices.get(var3))) {
               int var6 = this.vertexIndexMap.get(var5);
               if (this.levels.isEven(this.uf.find(var6))) {
                  if (!this.uf.inSameSet(var3, var6)) {
                     this.blossom(var3, var6);
                  }
               } else if (this.levels.isOddOrUnreached(var6)) {
                  if (this.matching.isExposed(var6)) {
                     this.augment(var3);
                     this.augment(var6);
                     this.matching.match(var3, var6);
                     return true;
                  }

                  this.levels.setOdd(var6, var3);
                  int var7 = this.matching.opposite(var6);
                  this.levels.setEven(var7, var6);
                  this.queue.enqueue(var7);
               }
            }
         }
      }

      return false;
   }

   private void blossom(int var1, int var2) {
      int var3 = this.nearestCommonAncestor(var1, var2);
      this.blossomSupports(var1, var2, var3);
      this.blossomSupports(var2, var1, var3);
      this.uf.union(var1, var3);
      this.uf.union(var2, var3);
      this.levels.setEven(this.uf.find(var3), this.levels.getEven(var3));
   }

   private void blossomSupports(int var1, int var2, int var3) {
      Pair var4 = new Pair<>(var1, var2);
      var1 = this.uf.find(var1);

      for (int var5 = var1; var1 != var3; var1 = this.uf.find(this.levels.getOdd(var5))) {
         this.uf.union(var1, var5);
         var5 = this.levels.getEven(var1);
         this.bridges.put(var5, var4);
         this.queue.enqueue(var5);
         this.uf.union(var1, var5);
      }
   }

   private int nearestCommonAncestor(int var1, int var2) {
      this.vAncestors.clear();
      this.vAncestors.set(this.uf.find(var1));
      this.wAncestors.clear();
      this.wAncestors.set(this.uf.find(var2));

      do {
         var1 = this.parent(var1);
         this.vAncestors.set(var1);
         var2 = this.parent(var2);
         this.wAncestors.set(var2);
         if (this.wAncestors.get(var1)) {
            return var1;
         }
      } while (!this.vAncestors.get(var2));

      return var2;
   }

   private int parent(int var1) {
      var1 = this.uf.find(var1);
      int var2 = this.uf.find(this.levels.getEven(var1));
      return var2 == var1 ? var1 : this.uf.find(this.levels.getOdd(var2));
   }

   private void augment(int var1) {
      int var2 = this.buildPath(this.path, 0, var1, -1);

      for (byte var3 = 2; var3 < var2; var3 += 2) {
         this.matching.match(this.path[var3], this.path[var3 - 1]);
      }
   }

   private int buildPath(int[] var1, int var2, int var3, int var4) {
      while (true) {
         if (this.levels.isOdd(var3)) {
            Pair var5 = this.bridges.get(var3);
            int var6 = this.buildPath(var1, var2, (Integer)var5.getFirst(), var3);
            this.reverse(var1, var2, var6 - 1);
            var2 = var6;
            var3 = (Integer)var5.getSecond();
         } else {
            var1[var2++] = var3;
            if (this.matching.isExposed(var3)) {
               return var2;
            }

            var1[var2++] = this.matching.opposite(var3);
            if (var1[var2 - 1] == var4) {
               return var2;
            }

            var3 = this.levels.getOdd(var1[var2 - 1]);
         }
      }
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      this.init();
      if (this.initializer != null) {
         this.warmStart(this.initializer);
      }

      while (this.matchedVertices < this.graph.vertexSet().size() - 1 && this.augment()) {
         this.matchedVertices += 2;
      }

      LinkedHashSet var1 = new LinkedHashSet();
      double var2 = 0.0;

      for (int var4 = 0; var4 < this.vertices.size(); var4++) {
         if (!this.matching.isExposed(var4)) {
            Object var5 = this.vertices.get(var4);
            Object var6 = this.vertices.get(this.matching.opposite(var4));
            Object var7 = this.graph.getEdge((V)var5, (V)var6);
            var1.add(var7);
            var2 += 0.5 * this.graph.getEdgeWeight((E)var7);
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var1, var2);
   }

   public boolean isMaximumMatching(MatchingAlgorithm.Matching<V, E> var1) {
      if (var1.getEdges().size() * 2 >= this.graph.vertexSet().size() - 1) {
         return true;
      }

      this.init();

      for (Object var3 : var1.getEdges()) {
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         Integer var6 = this.vertexIndexMap.get(var4);
         Integer var7 = this.vertexIndexMap.get(var5);
         this.matching.match(var6, var7);
      }

      if (this.augment()) {
         return false;
      }

      Set var8 = this.vertexIndexMap
         .values()
         .stream()
         .filter(var1x -> this.levels.isOdd(var1x) && !this.bridges.containsKey(var1x))
         .map(this.vertices::get)
         .collect(Collectors.toSet());
      Set var9 = this.graph.vertexSet().stream().filter(var1x -> !var8.contains(var1x)).collect(Collectors.toSet());
      AsSubgraph var10 = new AsSubgraph<>(this.graph, var9, null);
      List var11 = new ConnectivityInspector<>(var10).connectedSets();
      long var12 = var11.stream().filter(var0 -> var0.size() % 2 == 1).count();
      return var1.getEdges().size() == (this.graph.vertexSet().size() + var8.size() - var12) / 2.0;
   }

   private void reverse(int[] var1, int var2, int var3) {
      while (var2 < var3) {
         int var4 = var1[var2];
         var1[var2] = var1[var3];
         var1[var3] = var4;
         var2++;
         var3--;
      }
   }

   private static class Levels {
      private int[] even;
      private int[] odd;
      private List<Integer> dirty;

      public Levels(int var1) {
         this.even = new int[var1];
         this.odd = new int[var1];
         this.dirty = new ArrayList<>();
         Arrays.fill(this.even, -1);
         Arrays.fill(this.odd, -1);
      }

      public int getEven(int var1) {
         return this.even[var1];
      }

      public void setEven(int var1, int var2) {
         this.even[var1] = var2;
         if (var2 != -1) {
            this.dirty.add(var1);
         }
      }

      public int getOdd(int var1) {
         return this.odd[var1];
      }

      public void setOdd(int var1, int var2) {
         this.odd[var1] = var2;
         if (var2 != -1) {
            this.dirty.add(var1);
         }
      }

      public boolean isEven(int var1) {
         return this.even[var1] != -1;
      }

      public boolean isOddOrUnreached(int var1) {
         return this.odd[var1] == -1;
      }

      public boolean isOdd(int var1) {
         return this.odd[var1] != -1;
      }

      public void reset() {
         for (int var2 : this.dirty) {
            this.even[var2] = -1;
            this.odd[var2] = -1;
         }

         this.dirty.clear();
      }
   }

   private static class SimpleMatching {
      private static final int UNMATCHED = -1;
      private final int[] match;
      private Set<Integer> exposed;

      private SimpleMatching(int var1) {
         this.match = new int[var1];
         this.exposed = CollectionUtil.newHashSetWithExpectedSize(var1);
         Arrays.fill(this.match, -1);
         IntStream.range(0, var1).forEach(this.exposed::add);
      }

      boolean isMatched(int var1) {
         return this.match[var1] != -1;
      }

      boolean isExposed(int var1) {
         return this.match[var1] == -1;
      }

      int opposite(int var1) {
         assert this.isMatched(var1);
         return this.match[var1];
      }

      void match(int var1, int var2) {
         this.match[var1] = var2;
         this.match[var2] = var1;
         this.exposed.remove(var1);
         this.exposed.remove(var2);
      }

      Set<Integer> getExposed() {
         return this.exposed;
      }
   }
}
