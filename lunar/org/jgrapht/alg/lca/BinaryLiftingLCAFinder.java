package org.jgrapht.alg.lca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.LowestCommonAncestorAlgorithm;
import org.jgrapht.util.MathUtil;
import org.jgrapht.util.VertexToIntegerMapping;

public class BinaryLiftingLCAFinder<V, E> implements LowestCommonAncestorAlgorithm<V> {
   private final Graph<V, E> graph;
   private final Set<V> roots;
   private final int maxLevel;
   private Map<V, Integer> vertexMap;
   private List<V> indexList;
   private int[][] ancestors;
   private int[] timeIn;
   private int[] timeOut;
   private int clock = 0;
   private int numberComponent;
   private int[] component;

   public BinaryLiftingLCAFinder(Graph<V, E> var1, V var2) {
      this(var1, Collections.singleton(Objects.requireNonNull((V)var2, "root cannot be null")));
   }

   public BinaryLiftingLCAFinder(Graph<V, E> var1, Set<V> var2) {
      this.graph = Objects.requireNonNull(var1, "graph cannot be null");
      this.roots = Objects.requireNonNull(var2, "roots cannot be null");
      this.maxLevel = MathUtil.log2(var1.vertexSet().size());
      if (this.roots.isEmpty()) {
         throw new IllegalArgumentException("roots cannot be empty");
      }

      if (!var1.vertexSet().containsAll(var2)) {
         throw new IllegalArgumentException("at least one root is not a valid vertex");
      }

      this.computeAncestorMatrix();
   }

   private void normalizeGraph() {
      VertexToIntegerMapping var1 = Graphs.getVertexToIntegerMapping(this.graph);
      this.vertexMap = var1.getVertexMap();
      this.indexList = var1.getIndexList();
   }

   private void dfs(int var1, int var2) {
      this.component[var1] = this.numberComponent;
      this.timeIn[var1] = ++this.clock;
      this.ancestors[0][var1] = var2;

      for (int var3 = 1; var3 < this.maxLevel; var3++) {
         if (this.ancestors[var3 - 1][var1] != -1) {
            this.ancestors[var3][var1] = this.ancestors[var3 - 1][this.ancestors[var3 - 1][var1]];
         }
      }

      Object var7 = this.indexList.get(var1);

      for (Object var5 : this.graph.outgoingEdgesOf((V)var7)) {
         int var6 = this.vertexMap.get(Graphs.getOppositeVertex(this.graph, (E)var5, (V)var7));
         if (var6 != var2) {
            this.dfs(var6, var1);
         }
      }

      this.timeOut[var1] = ++this.clock;
   }

   private void computeAncestorMatrix() {
      this.ancestors = new int[this.maxLevel + 1][this.graph.vertexSet().size()];

      for (int var1 = 0; var1 < this.maxLevel; var1++) {
         Arrays.fill(this.ancestors[var1], -1);
      }

      this.timeIn = new int[this.graph.vertexSet().size()];
      this.timeOut = new int[this.graph.vertexSet().size()];

      for (int var3 = 0; var3 < this.graph.vertexSet().size(); var3++) {
         this.timeIn[var3] = this.timeOut[var3] = -(var3 + 1);
      }

      this.numberComponent = 0;
      this.component = new int[this.graph.vertexSet().size()];
      this.normalizeGraph();

      for (Object var2 : this.roots) {
         if (this.component[this.vertexMap.get(var2)] != 0) {
            throw new IllegalArgumentException("multiple roots in the same tree");
         }

         this.numberComponent++;
         this.dfs(this.vertexMap.get(var2), -1);
      }
   }

   private boolean isAncestor(int var1, int var2) {
      return this.timeIn[var1] <= this.timeIn[var2] && this.timeOut[var2] <= this.timeOut[var1];
   }

   @Override
   public V getLCA(V var1, V var2) {
      int var3 = this.vertexMap.getOrDefault(var1, -1);
      if (var3 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var1);
      }

      int var4 = this.vertexMap.getOrDefault(var2, -1);
      if (var4 == -1) {
         throw new IllegalArgumentException("invalid vertex: " + var2);
      }

      if (var1.equals(var2)) {
         return (V)var1;
      }

      if (this.component[var3] == this.component[var4] && this.component[var3] != 0) {
         if (this.isAncestor(var3, var4)) {
            return (V)var1;
         }

         if (this.isAncestor(var4, var3)) {
            return (V)var2;
         }

         for (int var5 = this.maxLevel - 1; var5 >= 0; var5--) {
            if (this.ancestors[var5][var3] != -1 && !this.isAncestor(this.ancestors[var5][var3], var4)) {
               var3 = this.ancestors[var5][var3];
            }
         }

         int var6 = this.ancestors[0][var3];
         return var6 == -1 ? null : this.indexList.get(var6);
      } else {
         return null;
      }
   }

   @Override
   public Set<V> getLCASet(V var1, V var2) {
      throw new UnsupportedOperationException();
   }
}
