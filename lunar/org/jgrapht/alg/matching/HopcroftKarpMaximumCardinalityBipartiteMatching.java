package org.jgrapht.alg.matching;

import java.util.ArrayList;
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

public class HopcroftKarpMaximumCardinalityBipartiteMatching<V, E> implements MatchingAlgorithm<V, E> {
   private final Graph<V, E> graph;
   private final Set<V> partition1;
   private final Set<V> partition2;
   private List<V> vertices;
   private Map<V, Integer> vertexIndexMap;
   private int matchedVertices;
   private final int DUMMY = 0;
   private final int INF = Integer.MAX_VALUE;
   private int[] matching;
   private int[] dist;
   private FixedSizeIntegerQueue queue;

   public HopcroftKarpMaximumCardinalityBipartiteMatching(Graph<V, E> var1, Set<V> var2, Set<V> var3) {
      this.graph = GraphTests.requireUndirected(var1);
      if (var2.size() <= var3.size()) {
         this.partition1 = var2;
         this.partition2 = var3;
      } else {
         this.partition1 = var3;
         this.partition2 = var2;
      }
   }

   private void init() {
      this.vertices = new ArrayList();
      this.vertices.add(null);
      this.vertices.addAll(this.partition1);
      this.vertices.addAll(this.partition2);
      this.vertexIndexMap = new HashMap<>();

      for (int var1 = 0; var1 < this.vertices.size(); var1++) {
         this.vertexIndexMap.put(this.vertices.get(var1), var1);
      }

      this.matching = new int[this.vertices.size() + 1];
      this.dist = new int[this.partition1.size() + 1];
      this.queue = new FixedSizeIntegerQueue(this.vertices.size());
   }

   private void warmStart() {
      for (Object var2 : this.partition1) {
         int var3 = this.vertexIndexMap.get(var2);

         for (Object var5 : Graphs.neighborListOf(this.graph, (V)var2)) {
            int var6 = this.vertexIndexMap.get(var5);
            if (this.matching[var6] == 0) {
               this.matching[var6] = var3;
               this.matching[var3] = var6;
               this.matchedVertices++;
               break;
            }
         }
      }
   }

   private boolean bfs() {
      this.queue.clear();

      for (int var1 = 1; var1 <= this.partition1.size(); var1++) {
         if (this.matching[var1] == 0) {
            this.dist[var1] = 0;
            this.queue.enqueue(var1);
         } else {
            this.dist[var1] = Integer.MAX_VALUE;
         }
      }

      this.dist[0] = Integer.MAX_VALUE;

      while (!this.queue.isEmpty()) {
         int var5 = this.queue.poll();
         if (this.dist[var5] < this.dist[0]) {
            for (Object var3 : Graphs.neighborListOf(this.graph, this.vertices.get(var5))) {
               int var4 = this.vertexIndexMap.get(var3);
               if (this.dist[this.matching[var4]] == Integer.MAX_VALUE) {
                  this.dist[this.matching[var4]] = this.dist[var5] + 1;
                  this.queue.enqueue(this.matching[var4]);
               }
            }
         }
      }

      return this.dist[0] != Integer.MAX_VALUE;
   }

   private boolean dfs(int var1) {
      if (var1 != 0) {
         for (Object var3 : Graphs.neighborListOf(this.graph, this.vertices.get(var1))) {
            int var4 = this.vertexIndexMap.get(var3);
            if (this.dist[this.matching[var4]] == this.dist[var1] + 1 && this.dfs(this.matching[var4])) {
               this.matching[var4] = var1;
               this.matching[var1] = var4;
               return true;
            }
         }

         this.dist[var1] = Integer.MAX_VALUE;
         return false;
      } else {
         return true;
      }
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      this.init();
      this.warmStart();

      while (this.matchedVertices < this.partition1.size() && this.bfs()) {
         for (int var1 = 1; var1 <= this.partition1.size() && this.matchedVertices < this.partition1.size(); var1++) {
            if (this.matching[var1] == 0 && this.dfs(var1)) {
               this.matchedVertices++;
            }
         }
      }

      assert this.matchedVertices <= this.partition1.size();
      HashSet var3 = new HashSet();

      for (int var2 = 0; var2 < this.vertices.size(); var2++) {
         if (this.matching[var2] != 0) {
            var3.add(this.graph.getEdge(this.vertices.get(var2), this.vertices.get(this.matching[var2])));
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var3, var3.size());
   }
}
